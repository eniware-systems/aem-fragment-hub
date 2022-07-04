package de.enithing.contenthub.importer.contentfragment.model;

import java.util.logging.Logger;

import de.enithing.contenthub.importer.Importer;
import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import org.jdom2.Element;

public abstract class ContentFragmentFieldTypeImporter<TField extends ContentFragmentFieldType<?>>
        implements Importer<TField> {
    private final ImporterConfiguration config;

    public ContentFragmentFieldTypeImporter(ImporterConfiguration cfg) {
        this.config = cfg;
    }

    @Override
    public ImporterConfiguration getConfig() {
        return config;
    }

    @Override
    public void onEnter(TField field) throws Exception {
    }

    @Override
    public void onExit(TField field) throws Exception {

    }

    private static final Logger logger = Logger.getLogger(ContentFragmentFieldTypeImporter.class.getSimpleName());

    @Override
    public Logger getLogger() {
        return logger;
    }

    protected void setFieldDefaults(ContentFragmentFieldType<?> field) {
        Element node = getConfig().node;
        field.setPropertyName(JcrUtils.getXmlAttribute(node, "name").getValue());
        field.setDescription(JcrUtils.getXmlAttribute(node, "fieldDescription").getValue());
        field.setFieldLabel(JcrUtils.getXmlAttribute(node, "fieldLabel").getValue());
    }
}
