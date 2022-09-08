package de.enithing.fragmenthub.importer.contentfragment.instance.field;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTimeValue;

import org.jdom2.Element;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeValueImporter extends ContentFragmentFieldValueImporter<DateTimeValue> {
    public DateTimeValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public DateTimeValue createElement() throws Exception {
        return CorefieldsFactory.eINSTANCE.createDateTimeValue();
    }

    @Override
    public void onEnter(DateTimeValue value) throws Exception {
        String propertyName = getConfig().currentField.getPropertyName();
        Element node = getConfig().currentNode;

        String dateStr = JcrUtils.getXmlAttribute(node, propertyName).getValue();
        dateStr = dateStr.replace("{Date}", "");
        dateStr = dateStr.replaceAll("Z$", "+00:00");

        Date date = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")).parse(dateStr);

        value.setValue(date);
    }
}
