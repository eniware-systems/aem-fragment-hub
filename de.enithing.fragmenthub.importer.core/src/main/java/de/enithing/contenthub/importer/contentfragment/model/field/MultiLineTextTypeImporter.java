package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.TextMimeType;

import org.jdom2.Element;

public class MultiLineTextTypeImporter extends ContentFragmentFieldTypeImporter<MultiLineText>  {
    public MultiLineTextTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public MultiLineText createElement() throws Exception {
        MultiLineText field = CorefieldsFactory.eINSTANCE.createMultiLineText();
        setFieldDefaults(field);

        Element node = getConfig().currentNode;

        field.setFieldLabel(JcrUtils.getXmlAttribute(node, "cfm-element").getValue());

        field.setDefaultType(TextMimeType.get(JcrUtils.getXmlAttribute(node, "default-mime-type").getValue()));
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "checked"));
        field.setTranslatable(JcrUtils.getXmlAttributeBool(node, "translatable"));

        // TODO
        // field.getAllowedFragmentModels().addAll(JcrUtils.fromArray(JcrUtils.getXmlAttribute(node,"fragmentmodelreference").getValue()));

        return field;
    }
}
