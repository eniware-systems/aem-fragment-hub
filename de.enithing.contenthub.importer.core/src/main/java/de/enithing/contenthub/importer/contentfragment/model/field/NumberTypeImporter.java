package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.Boolean;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.Number;

public class NumberTypeImporter extends ContentFragmentFieldTypeImporter<Number> {
    public NumberTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Number createElement() throws Exception {
        Number field = CorefieldsFactory.eINSTANCE.createNumber();
        setFieldDefaults(field);
        return field;
    }
}