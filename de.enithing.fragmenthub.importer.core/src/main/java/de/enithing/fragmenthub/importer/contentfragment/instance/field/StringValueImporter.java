package de.enithing.fragmenthub.importer.contentfragment.instance.field;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.StringValue;

import org.jdom2.Element;

public class StringValueImporter extends ContentFragmentFieldValueImporter<StringValue> {
    public StringValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public StringValue createElement() throws Exception {
        return CorefieldsFactory.eINSTANCE.createStringValue();
    }

    @Override
    public void onEnter(StringValue value) throws Exception {
        String propertyName = getConfig().currentField.getPropertyName();
        Element node = getConfig().currentNode;

        String v = JcrUtils.getXmlAttribute(node, propertyName).getValue();
        value.setValue(v);

        super.onEnter(value);
    }
}
