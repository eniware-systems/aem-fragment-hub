package de.enithing.contenthub.importer.contentfragment.instance.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.corefields.ContentReferenceValue;

public class ContentReferenceValueImporter extends ContentFragmentFieldValueImporter<ContentReferenceValue> {
    public ContentReferenceValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public ContentReferenceValue createElement() throws Exception {
        return null;
    }
}
