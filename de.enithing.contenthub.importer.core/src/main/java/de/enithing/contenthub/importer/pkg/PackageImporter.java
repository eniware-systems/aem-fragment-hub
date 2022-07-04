package de.enithing.contenthub.importer.pkg;

import de.enithing.contenthub.importer.Importer;
import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.JcrUtils;
import de.enithing.contenthub.importer.contentfragment.ContentFragmentModelImporter;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModelSet;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.Package;
import org.apache.commons.vfs2.FileObject;
import org.apache.commons.vfs2.FileSelectInfo;
import org.apache.commons.vfs2.FileSelector;
import org.jdom2.Element;
import org.jdom2.JDOMException;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
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

    @Override
    public void onEnter(Package pkg) throws Exception {
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
                getLogger().severe("Error reading " + xml.getName().toString() + ", ignoring");
            }
        }
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
