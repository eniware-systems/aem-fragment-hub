package de.enithing.contenthub.importer.contentfragment.instance;

import de.enithing.contenthub.importer.Importer;
import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.ContentFragmentFieldImporterFactory;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.importer.util.VelocityUtils;
import de.enithing.contenthub.model.contentfragment.*;
import de.enithing.contenthub.model.contenthub.Package;
import org.apache.velocity.VelocityContext;
import org.jdom2.Element;

import java.nio.file.Path;
import java.util.Optional;
import java.util.logging.Logger;

public class ContentFragmentImporter implements Importer<ContentFragmentInstance> {
    private final ImporterConfiguration config;

    public ContentFragmentImporter(ImporterConfiguration cfg) {
        this.config = cfg;
    }

    @Override
    public ImporterConfiguration getConfig() {
        return config;
    }

    @Override
    public ContentFragmentInstance createElement() throws Exception {
        return ContentFragmentFactory.eINSTANCE.createContentFragmentInstance();
    }

    private void setupModel(ContentFragmentInstance inst) {
        Package pkg = getConfig().currentPackage;
        Element node = getConfig().currentNode;

        Path modelPath = Path.of(JcrUtils.getXmlAttribute(node, "cq:model").getValue());

        Optional<ContentFragmentModel> mdl;
        String id = JcrUtils.getXmlAttribute(node.getParentElement(), "cq:name").getValue();

        if(id.isBlank()) {
            id = getConfig().sourceFile.getPath().getParent().getFileName().toString();
            getLogger().warning(String.format("No cq:name property set for content fragment instance, using path based id '%s'", id));
        }

        if (getConfig().fragmentModelResolution == ImporterConfiguration.ReferenceResolutionMode.Exact) {
            mdl = pkg.getContentFragmentModelSets().stream().flatMap(s -> s.getModels().stream()).filter(m -> {
                VelocityContext velocityContext = new VelocityContext();
                velocityContext.put("packageName", pkg.getName());
                Path myPath = Path.of(VelocityUtils.replace(m.getPath().toString(), velocityContext));
                return myPath.equals(modelPath);
            }).findFirst();
        } else {
            String modelId = modelPath.getFileName().toString();
            mdl = pkg.getContentFragmentModelSets().stream().flatMap(s -> s.getModels().stream()).filter(m -> m.getId().equals(modelId)).findFirst();
        }

        if (mdl.isEmpty()) {
            throw new RuntimeException(String.format("Failed to resolve model for content fragment '%s'", id));
        }

        getLogger().info(String.format("Resolved model '%s' for content fragment '%s'", mdl.get().getId(), id));

        inst.setTitle(JcrUtils.getXmlAttribute(node.getParentElement(), "jcr:title").getValue());
        inst.setModel(mdl.get());
        inst.setId(id);
    }

    @Override
    public void onEnter(ContentFragmentInstance inst) throws Exception {
        setupModel(inst);
        ContentFragmentModel model = inst.getModel();

        getLogger().info(String.format("Populating content fragment instance '%s' (%s)", inst.getTitle(), inst.getId()));

        Element masterNode = JcrUtils.getXmlNode(getConfig().currentNode, "master");

        for (ContentFragmentFieldType<?> field : model.getFields()) {
            ContentFragmentFieldImporterFactory factory = getConfig().getFieldImporterRegistry().getFactory(field);

            ImporterConfiguration cfg = createChildConfig(inst);
            cfg.currentField = field;
            cfg.currentNode = masterNode;

            ContentFragmentFieldValueImporter<?> valueImporter = factory.createValueImporterInstance(cfg);

            if(valueImporter == null) {
                getLogger().info(String.format("Ignoring field value import for '%s'", field.getPropertyName()));
                continue;
            }

            ContentFragmentFieldInstance fieldInstance = ContentFragmentFactory.eINSTANCE.createContentFragmentFieldInstance();

            fieldInstance.setFieldtype(field);

            // Import the value
            ContentFragmentFieldValue value = valueImporter.doImport();
            fieldInstance.setValue(value);

            inst.getFields().add(fieldInstance);
        }
    }

    @Override
    public void onExit(ContentFragmentInstance element) throws Exception {

    }

    private static final Logger logger = Logger.getLogger(ContentFragmentImporter.class.getSimpleName());

    @Override
    public Logger getLogger() {
        return logger;
    }
}
