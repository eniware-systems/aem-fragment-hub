package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.Number;
import de.enithing.fragmenthub.model.contentfragment.corefields.NumberTypeHint;

import org.jdom2.Element;

public class NumberTypeImporter extends ContentFragmentFieldTypeImporter<Number> {
    public NumberTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Number createElement() throws Exception {
        Number field = CorefieldsFactory.eINSTANCE.createNumber();
        setFieldDefaults(field);

        Element node = getConfig().currentNode;

        field.setPlaceholder(JcrUtils.getXmlAttribute(node, "emptyText").getValue());
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "required"));
        field.setType(NumberTypeHint.get(JcrUtils.getXmlAttribute(node, "typeHint").getValue()));

        // TODO set validation constraint
        // field.setValidationConstraint();
        // new LowerBoundConstraint().setMin()

        return field;
    }
}