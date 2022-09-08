package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.model.contentfragment.corefields.Boolean;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;

public class BooleanTypeImporter extends ContentFragmentFieldTypeImporter<Boolean> {
    public BooleanTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Boolean createElement() throws Exception {
        Boolean field = CorefieldsFactory.eINSTANCE.createBoolean();
        setFieldDefaults(field);

        return field;
    }
}