package de.enithing.fragmenthub.generator.pkg;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.TemplateBasedGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.ContentFragmentModelGenerator;
import de.enithing.fragmenthub.generator.context.ContextGenerator;
import de.enithing.fragmenthub.generator.util.JcrUtils;
import de.enithing.fragmenthub.generator.util.ModelPrinter;
import de.enithing.fragmenthub.generator.util.PathUtils;
import de.enithing.fragmenthub.generator.util.VelocityUtils;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.fragmenthub.Package;

import org.apache.commons.vfs2.FileObject;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PackageGenerator implements TemplateBasedGenerator<Package> {
    public static class Context {
        public Context(FileObject jcrRoot) {
            this.jcrRoot = jcrRoot;
        }

        private final FileObject jcrRoot;

        public FileObject getJcrRoot() {
            return jcrRoot;
        }
    }

    private final GeneratorConfiguration config;

    public PackageGenerator(GeneratorConfiguration cfg) {
        this.config = cfg;
    }

    @Override
    public GeneratorConfiguration getConfig() {
        return config;
    }

    @Override
    public Path getTemplatesPath() {
        return Path.of("/package");
    }

    @Override
    public void onEnter(Package pkg) throws Exception {
        FileObject targetRoot = getConfig().targetRoot;

        Path contentRoot = pkg.getContentPath() != null ? Path.of("jcr_root").resolve(PathUtils.makeRelative(pkg.getContentPath())) : Path.of("jcr_root/content/dam/$packageName");

        if (getConfig().removeExistingFiles) {
            getLogger().info(String.format("Clearing model and content folders for %s", ModelPrinter.toString(pkg)));

            VelocityContext context = getTemplateContext(pkg);
            String modelsPath = VelocityUtils.replace(Path.of("jcr_root/conf/$packageName/settings/dam/cfm/models").toString(), context);
            String contentPath = VelocityUtils.replace(contentRoot.toString(), context);

            FileObject modelsFolder = getConfig().targetRoot.resolveFile(modelsPath);

            if (modelsFolder.exists()) {
                modelsFolder.deleteAll();
            }

            FileObject contentFolder = getConfig().targetRoot.resolveFile(contentPath);

            if (contentFolder.exists()) {
                contentFolder.deleteAll();
            }
        }

        if (getConfig().skipSkeletonCreation) {
            getLogger().info(String.format("Skipping skeleton creation for %s", ModelPrinter.toString(pkg)));

            return;
        }

        // Create the META-INF directory
        FileObject metaInfDir = targetRoot.resolveFile("META-INF");
        metaInfDir.createFolder();

        renderTemplate(pkg, targetRoot, Path.of("META-INF/MANIFEST.MF"));
        renderTemplate(pkg, targetRoot, Path.of("META-INF/vault/filter.xml"));
        renderTemplate(pkg, targetRoot, Path.of("META-INF/vault/config.xml"));
        renderTemplate(pkg, targetRoot, Path.of("META-INF/vault/nodetypes.cnd"));
        renderTemplate(pkg, targetRoot, Path.of("META-INF/vault/properties.xml"));
        renderTemplate(pkg, targetRoot, Path.of("META-INF/vault/definition/.content.xml"));

        // Create the jcr_root directory
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/.content.xml"));

        // Create the conf directory
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/conf/.content.xml"));
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/conf/$packageName/.content.xml"));
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/conf/$packageName/settings/.content.xml"));
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/conf/$packageName/settings/dam/.content.xml"));
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/conf/$packageName/settings/dam/cfm/.content.xml"));
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/conf/$packageName/settings/dam/cfm/models/.content.xml"));

        // Create the content directory
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/content/.content.xml"));
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/content/dam/.content.xml"));

        renderTemplate(pkg, targetRoot, contentRoot.resolve(".content.xml"), Path.of("jcr_root/content/dam/$packageName/.content.xml"));

        // Create the GraphQL endpoints directory
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/content/_cq_graphql/.content.xml"));
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/content/_cq_graphql/$packageName/.content.xml"));
        renderTemplate(pkg, targetRoot, Path.of("jcr_root/content/_cq_graphql/$packageName/endpoint/.content.xml"));
    }

    @Override
    public void onExit(Package pkg) throws Exception {
        FileObject targetRoot = getConfig().targetRoot;

        // Create the fragment models
        for (ContentFragmentModel mdl : pkg.getAllContentFragmentModels()) {
            FileObject dir = targetRoot.resolveFile(
                    String.format("jcr_root/conf/%s/settings/dam/cfm/models/%s", pkg.getName(), mdl.getId()));
            dir.createFolder();

            GeneratorConfiguration childConfig = createChildConfig(pkg);
            childConfig.targetRoot = dir;

            ContentFragmentModelGenerator mdlGenerator = new ContentFragmentModelGenerator(childConfig);
            mdlGenerator.generate(mdl);
        }

        // Create the content
        de.enithing.fragmenthub.model.fragmenthub.Context contentRoot = pkg.getContentRoot();
        if (contentRoot != null) {
            String rootPath = pkg.getContentPath() != null ? pkg.getContentPath().toString() : String.format("/content/dam/%s", pkg.getName());
            VelocityContext templateContext = getTemplateContext(pkg);
            rootPath = VelocityUtils.replace(rootPath, templateContext);

            FileObject dir = targetRoot.resolveFile(
                    String.format("jcr_root/%s", rootPath));

            GeneratorConfiguration childConfig = createChildConfig(pkg);
            childConfig.targetRoot = dir;
            ContextGenerator ctxGen = new ContextGenerator(childConfig);
            ctxGen.generate(contentRoot);
        }
    }

    private void renderTemplate(Package pkg, FileObject root, Path path, Path templatePath) throws IOException, ParseException {
        VelocityContext context = getTemplateContext(pkg);

        for (Path p : path.getParent()) {
            root = root.resolveFile(VelocityUtils.replace(p.toString(), context));
            root.createFolder();
        }

        Template tpl = resolveTemplate(pkg, templatePath.toString());
        FileObject file = root.resolveFile(path.getFileName().toString());
        file.createFile();
        OutputStream os = file.getContent().getOutputStream();
        PrintWriter writer = new PrintWriter(os);
        tpl.merge(context, writer);
        writer.flush();
        os.close();
    }

    private void renderTemplate(Package pkg, FileObject root, Path path) throws IOException, ParseException {
        renderTemplate(pkg, root, path, path);
    }

    @Override
    public void populateTemplateContext(Package pkg, VelocityContext ctx) throws ParseException {
        // Add the basic fields
        ctx.put("packageName", pkg.getName());
        ctx.put("packageGroup", pkg.getGroup());
        ctx.put("packageTitle", JcrUtils.toStringValue(pkg.getTitle()));
        ctx.put("packageAuthor", JcrUtils.toStringValue(pkg.getAuthor()));
        ctx.put("packageDescription", JcrUtils.toStringValue(pkg.getDescription()));
        ctx.put("packageVersion", JcrUtils.toStringValue((pkg.getVersion())));
        ctx.put("packageCreator", JcrUtils.toStringValue("admin"));

        // Generate the package filter list
        List<Path> packageFilterPaths = new ArrayList<>(Arrays.asList(Path.of("/content/dam/" + pkg.getName()),
                Path.of("/content/cq:graphql/" + pkg.getName()), Path.of("/conf/" + pkg.getName())));

        packageFilterPaths = packageFilterPaths.stream().distinct().map(p -> VelocityUtils.replace(p, ctx))
                .filter(p -> p != null).sorted().toList();

        List<String> packageRoots = packageFilterPaths.stream().map(p -> PathUtils.getRootLeaf(p).toString()).distinct()
                .collect(Collectors.toList());
        List<String> packageFilters = packageFilterPaths.stream().map(p -> p.toString()).collect(Collectors.toList());

        ctx.put("packageRoots", packageRoots);
        ctx.put("packageFilters", packageFilters);

        Date packageDate = Date.from(Instant.now());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        ctx.put("packageDate", format.format(packageDate));
    }

    private static final Logger logger = Logger.getLogger(PackageGenerator.class.getSimpleName());

    @Override
    public Logger getLogger() {
        return logger;
    }
}
