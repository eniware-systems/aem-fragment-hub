package de.enithing.fragmenthub.importer.contentfragment.model.field;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText;

import org.jdom2.Element;

public class SingleLineTextTypeImporter extends ContentFragmentFieldTypeImporter<SingleLineText> {
    public SingleLineTextTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public SingleLineText createElement() throws Exception {
        SingleLineText field = CorefieldsFactory.eINSTANCE.createSingleLineText();
        setFieldDefaults(field);

        Element node = getConfig().currentNode;

        field.setMaxLength(JcrUtils.getXmlAttributeNumber(node, "maxlength").intValue());
        field.setPlaceholder(JcrUtils.getXmlAttribute(node, "emptyText").getValue());

        field.setUnique(JcrUtils.getXmlAttributeBool(node, "unique"));
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "required"));
        field.setTranslatable(JcrUtils.getXmlAttributeBool(node, "translatable"));

        return field;
    }
}
