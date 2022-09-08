package de.enithing.fragmenthub.importer.contentfragment.model.field;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration;
import de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption;

import org.jdom2.Element;

public class EnumerationTypeImporter extends ContentFragmentFieldTypeImporter<Enumeration> {
    public EnumerationTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Enumeration createElement() throws Exception {
        Enumeration field = CorefieldsFactory.eINSTANCE.createEnumeration();
        setFieldDefaults(field);

        Element node = getConfig().currentNode;

        field.setPlaceholder( JcrUtils.getXmlAttribute(node, "emptyText", "").getValue());
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "required"));
        field.setUnique(JcrUtils.getXmlAttributeBool(node, "unique"));

        for (Element item : JcrUtils.getXmlNode(node, "optionsmultifield").getChildren()) {
            String value = JcrUtils.getXmlAttribute(item, "fieldLabel").getValue();
            String label = JcrUtils.getXmlAttribute(item, "fieldValue").getValue();
            EnumerationOption opt = CorefieldsFactory.eINSTANCE.createEnumerationOption();

            opt.setKey(value);
            opt.setValue(label);

            field.getOptions().add(opt);
        }

        getLogger().info(String.format("Imported %s options for enumeration '%s'", field.getOptions().size(), field.getPropertyName()));

        return field;
    }
}