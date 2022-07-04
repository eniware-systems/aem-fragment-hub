package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.Boolean;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.Enumeration;

public class EnumerationTypeImporter extends ContentFragmentFieldTypeImporter<Enumeration> {
    public EnumerationTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Enumeration createElement() throws Exception {
        Enumeration field = CorefieldsFactory.eINSTANCE.createEnumeration();
        setFieldDefaults(field);
        return field;
    }
}