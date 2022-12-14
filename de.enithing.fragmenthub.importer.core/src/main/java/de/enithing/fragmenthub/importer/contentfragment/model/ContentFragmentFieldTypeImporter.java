package de.enithing.fragmenthub.importer.contentfragment.model;

import java.util.logging.Logger;

import de.enithing.fragmenthub.importer.Importer;
import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;

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

    private final Logger logger = Logger.getLogger(getClass().getSimpleName());

    @Override
    public Logger getLogger() {
        return logger;
    }

    protected void setFieldDefaults(ContentFragmentFieldType<?> field) {
        Element node = getConfig().currentNode;
        field.setPropertyName(JcrUtils.getXmlAttribute(node, "name").getValue());
        field.setDescription(JcrUtils.getXmlAttribute(node, "fieldDescription").getValue());
        field.setFieldLabel(JcrUtils.getXmlAttribute(node, "fieldLabel").getValue());
    }

    public void onPostImportPackage(ContentFragmentFieldType<?> field) throws Exception {
    }
}
