package de.enithing.contenthub.importer.pkg;

import de.enithing.contenthub.importer.Importer;
import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.ContentFragmentFieldImporterFactory;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentImporter;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.importer.contentfragment.ContentFragmentModelImporter;
import de.enithing.contenthub.importer.util.PackageUtils;
import de.enithing.contenthub.model.contentfragment.*;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.Package;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSelectInfo;
import org.apache.commons.vfs2.FileSelector;
import org.apache.commons.vfs2.FileSystemException;
import org.jdom2.Element;
import org.jdom2.JDOMException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class PackageImporter implements Importer<Package> {

    private final ImporterConfiguration config;

    public PackageImporter(ImporterConfiguration cfg) {
        this.config = cfg;
    }

    @Override
    public ImporterConfiguration getConfig() {
        return config;
    }

    @Override
    public Package createElement() throws Exception {
        return ContentHubFactory.eINSTANCE.createPackage();
    }

    private Collection<FileObject> findContentXmls() throws FileSystemException {
        FileObject root = getConfig().sourceFile;

        FileObject jcrRoot = root.resolveFile("jcr_root");

        FileObject[] files = jcrRoot.findFiles(new FileSelector() {
            @Override
            public boolean includeFile(FileSelectInfo fileSelectInfo) throws Exception {
                return fileSelectInfo.getFile().getName().getBaseName().equals(".content.xml");
            }

            @Override
            public boolean traverseDescendents(FileSelectInfo fileSelectInfo) throws Exception {
                return true;
            }
        });

        return Arrays.stream(files).toList();
    }

    private void parseContentFragmentModels(Package pkg) throws Exception {
        Collection<FileObject> files = findContentXmls();

        for (FileObject xml : files) {
            try {
                Collection<Element> nodes = JcrUtils.parseJcrNodes(xml);

                List<Element> models = nodes.stream().filter(n -> n.getName().equals("model")).toList();

                for (Element model : models) {
                    ImporterConfiguration cfg = createChildConfig(pkg);
                    cfg.sourceFile = xml;

                    ContentFragmentModelImporter modelImporter = new ContentFragmentModelImporter(cfg);
                    ContentFragmentModel mdl = modelImporter.doImport();

                    if (pkg.getContentFragmentModelSets().isEmpty()) {
                        // Create the default set
                        ContentFragmentModelSet set = ContentFragmentFactory.eINSTANCE.createContentFragmentModelSet();
                        set.setName(cfg.modelSetName);
                        pkg.getContentFragmentModelSets().add(set);
                    }

                    ContentFragmentModelSet set = pkg.getContentFragmentModelSets().get(0);
                    set.getModels().add(mdl);
                }
            } catch (IOException | JDOMException e) {
                getLogger().severe("Error reading " + xml.getName().toString() + ": " + e.toString());
            }
        }
    }

    private Context getOrCreateContext(Package pkg, Path path) {
        Context currentContext = pkg.getContentRoot();

        for (Path ctxId : path) {
            Optional<Context> child = currentContext.getChildContexts().stream().filter(c -> c.getName().equals(ctxId.toString())).findFirst();

            if (child.isPresent()) {
                currentContext = child.get();
            } else {
                Context newContext = ContentHubFactory.eINSTANCE.createContext();
                newContext.setName(ctxId.toString());
                newContext.setTitle(ctxId.toString());
                currentContext.getChildContexts().add(newContext);
                currentContext = newContext;
            }
        }

        return currentContext;
    }

    private void parseContentFragments(Package pkg) throws Exception {
        Collection<FileObject> files = findContentXmls();

        for (FileObject xml : files) {
            try {
                Collection<Element> nodes = JcrUtils.parseJcrNodes(xml);

                List<Element> dataNodes = nodes.stream().filter(n -> n.getName().equals("data")).toList();

                for (Element data : dataNodes) {
                    if (!JcrUtils.getXmlAttributeBool(data.getParentElement(), "contentFragment")) {
                        // Not a content fragment, ignore
                        continue;
                    }

                    Path rootPath = getConfig().sourceFile.getPath().resolve("jcr_root/content/dam");
                    Path path = xml.getPath();
                    Path relativePath = rootPath.relativize(path);
                    // Skip the first path and the filename
                    relativePath = relativePath.subpath(1, relativePath.getNameCount() - 1).getParent();

                    Context context = getOrCreateContext(pkg, relativePath);

                    ImporterConfiguration cfg = createChildConfig(pkg);
                    cfg.context = context;
                    cfg.sourceFile = xml;
                    cfg.currentPackage = pkg;
                    cfg.currentNode = data;

                    ContentFragmentImporter contentFragmentImporter = new ContentFragmentImporter(cfg);

                    try {
                        ContentFragmentInstance fragment = contentFragmentImporter.doImport();
                        context.getContentFragments().add(fragment);
                    } catch (Exception e) {
                        logger.severe(String.format("Failed to import fragment instance @'%s': %s", xml.getPath(), e.getMessage()));
                    }
                }


            } catch (IOException | JDOMException e) {
                getLogger().severe("Error reading " + xml.getName().toString() + ": " + e.toString());
            }
        }
    }

    private void doPostImport(Package pkg) throws Exception {
        for(ContentFragmentModel mdl : pkg.getAllContentFragmentModels()) {
            for (ContentFragmentFieldType<?> field : mdl.getFields().stream().toList()) {
                ContentFragmentFieldImporterFactory factory = getConfig().getFieldImporterRegistry().getFactory(field);
                ContentFragmentFieldTypeImporter<?> importer = factory.createTypeImporterInstance(createChildConfig(pkg));

                importer.onPostImportPackage(field);
            }
        }

        for (ContentFragmentInstance inst : PackageUtils.getAllContentFragmentInstances(pkg)) {
            for (ContentFragmentFieldInstance field : inst.getFields().stream().toList()) {
                ContentFragmentFieldImporterFactory factory = getConfig().getFieldImporterRegistry().getFactory(field.getFieldtype());
                ContentFragmentFieldValueImporter<?> importer = factory.createValueImporterInstance(createChildConfig(pkg));

                importer.onPostImportPackage(field);
            }
        }
    }

    @Override
    public void onEnter(Package pkg) throws Exception {
        parseContentFragmentModels(pkg);
        if (getConfig().importContent) {
            parseContentFragments(pkg);
        } else {
            getLogger().info("Skipping content import by configuration");
        }
        doPostImport(pkg);
    }

    @Override
    public void onExit(Package element) throws Exception {

    }

    private static final Logger logger = Logger.getLogger(PackageImporter.class.getSimpleName());

    @Override
    public Logger getLogger() {
        return logger;
    }
}
