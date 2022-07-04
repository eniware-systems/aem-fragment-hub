package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.*;
import org.jdom2.Element;

import java.sql.Date;

public class DateTimeTypeImporter extends ContentFragmentFieldTypeImporter<DateTime> {
    public DateTimeTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public DateTime createElement() throws Exception {
        DateTime field = CorefieldsFactory.eINSTANCE.createDateTime();
        setFieldDefaults(field);

        Element node = getConfig().node;

        String placeholder = JcrUtils.getXmlAttribute(node, "emptyText", "[]").getValue();
        field.setPlaceholder( placeholder.substring(1, placeholder.length() - 1) );
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "required"));
        field.setType(DateTimeType.get(JcrUtils.getXmlAttribute(node, "type").getValue()));

        String date = JcrUtils.getXmlAttribute(node, "value").getValue();

        if(!date.isBlank()) {
            field.setDefaultValue(Date.valueOf(JcrUtils.getXmlAttribute(node, "value").getValue()));
        }

        return field;
    }
}