package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.Boolean;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;

public class DateTimeTypeImporter extends ContentFragmentFieldTypeImporter<DateTime> {
    public DateTimeTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public DateTime createElement() throws Exception {
        DateTime field = CorefieldsFactory.eINSTANCE.createDateTime();
        setFieldDefaults(field);
        return field;
    }
}