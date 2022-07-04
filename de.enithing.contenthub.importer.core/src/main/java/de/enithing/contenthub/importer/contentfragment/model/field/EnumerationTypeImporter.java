package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.Enumeration;
import org.jdom2.Element;

public class EnumerationTypeImporter extends ContentFragmentFieldTypeImporter<Enumeration> {
    public EnumerationTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Enumeration createElement() throws Exception {
        Enumeration field = CorefieldsFactory.eINSTANCE.createEnumeration();
        setFieldDefaults(field);

        Element node = getConfig().node;

        field.setPlaceholder( JcrUtils.getXmlAttribute(node, "emptyText", "").getValue());
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "required"));
        field.setUnique(JcrUtils.getXmlAttributeBool(node, "unique"));

        return field;
    }
}