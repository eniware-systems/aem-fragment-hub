package de.enithing.contenthub.importer.contentfragment.instance.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.model.contentfragment.corefields.NumberValue;

public class NumberValueImporter extends ContentFragmentFieldValueImporter<NumberValue> {
    public NumberValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public NumberValue createElement() throws Exception {
        return null;
    }
}
