package de.enithing.contenthub.importer.contentfragment.instance.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue;

public class TabValueImporter extends ContentFragmentFieldValueImporter<ContentFragmentFieldValue> {

    public TabValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public ContentFragmentFieldValue createElement() throws Exception {
        return null;
    }
}
