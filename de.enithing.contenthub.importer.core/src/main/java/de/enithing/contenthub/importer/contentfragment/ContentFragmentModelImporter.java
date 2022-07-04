package de.enithing.contenthub.importer.contentfragment;

import de.enithing.contenthub.importer.Importer;
import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.JcrUtils;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import org.jdom2.Document;
import org.jdom2.Element;

import java.util.Collection;
import java.util.logging.Logger;

public class ContentFragmentModelImporter implements Importer<ContentFragmentModel> {
    private final ImporterConfiguration config;

    public ContentFragmentModelImporter(ImporterConfiguration cfg) {
        this.config = cfg;
    }

    @Override
    public ImporterConfiguration getConfig() {
        return config;
    }

    @Override
    public ContentFragmentModel createElement() throws Exception {
        return ContentFragmentFactory.eINSTANCE.createContentFragmentModel();
    }

    @Override
    public void onEnter(ContentFragmentModel mdl) throws Exception {
        ImporterConfiguration cfg = getConfig();
        Document doc = JcrUtils.parseXml(getConfig().sourceFile);

        Element content = JcrUtils.getXmlNode(doc.getRootElement(), "jcr:content");
        Collection<Element> fields = JcrUtils.getXmlNode(content, "model/cq:dialog/content/items").getChildren();

        String title = JcrUtils.getXmlAttribute(content, "jcr:title").getValue();
        mdl.setTitle(title);

        for (Element field : fields) {
            ImporterConfiguration childCfg = createChildConfig(mdl);
            childCfg.node = field;
            ContentFragmentFieldTypeImporter<?> fieldImporter = cfg.getFieldImporterRegistry().getFactory(field).createTypeImporterInstance(childCfg);

            if(fieldImporter == null) {
                continue;
            }

            ContentFragmentFieldType<?> f = fieldImporter.doImport();
            mdl.getFields().add(f);
        }
    }

    @Override
    public void onExit(ContentFragmentModel mdl) throws Exception {

    }

    private static final Logger logger = Logger.getLogger(ContentFragmentModelImporter.class.getSimpleName());

    @Override
    public Logger getLogger() {
        return logger;
    }
}
