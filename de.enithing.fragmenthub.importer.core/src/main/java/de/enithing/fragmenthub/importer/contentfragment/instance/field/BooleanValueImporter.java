package de.enithing.fragmenthub.importer.contentfragment.instance.field;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;

import org.jdom2.Element;

public class BooleanValueImporter extends ContentFragmentFieldValueImporter<BooleanValue> {
    public BooleanValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public BooleanValue createElement() throws Exception {
        return CorefieldsFactory.eINSTANCE.createBooleanValue();
    }

    @Override
    public void onEnter(BooleanValue value) throws Exception {
        String propertyName = getConfig().currentField.getPropertyName();
        Element node = getConfig().currentNode;

        boolean v = JcrUtils.getXmlAttributeBool(node, propertyName);

        value.setValue(v);
    }
}
