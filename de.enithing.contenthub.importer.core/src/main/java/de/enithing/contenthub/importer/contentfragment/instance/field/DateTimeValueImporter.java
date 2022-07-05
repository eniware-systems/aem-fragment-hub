package de.enithing.contenthub.importer.contentfragment.instance.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue;

public class DateTimeValueImporter extends ContentFragmentFieldValueImporter<DateTimeValue> {
    public DateTimeValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public DateTimeValue createElement() throws Exception {
        return null;
    }
}
