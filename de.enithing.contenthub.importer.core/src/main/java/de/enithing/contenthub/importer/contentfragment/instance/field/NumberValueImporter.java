package de.enithing.contenthub.importer.contentfragment.instance.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.NumberValue;
import org.jdom2.Element;

import java.math.BigDecimal;

public class NumberValueImporter extends ContentFragmentFieldValueImporter<NumberValue> {
    public NumberValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public NumberValue createElement() throws Exception {
        return CorefieldsFactory.eINSTANCE.createNumberValue();
    }

    @Override
    public void onEnter(NumberValue value) throws Exception {
        String propertyName = getConfig().currentField.getPropertyName();
        Element node = getConfig().currentNode;

        Number v = JcrUtils.getXmlAttributeNumber(node, propertyName);

        value.setValue(BigDecimal.valueOf(v.longValue()));
    }
}