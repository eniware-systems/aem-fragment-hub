package de.enithing.contenthub.importer.contentfragment.instance.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.model.contentfragment.corefields.BooleanValue;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;

public class BooleanValueImporter extends ContentFragmentFieldValueImporter<BooleanValue> {
    public BooleanValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public BooleanValue createElement() throws Exception {
        return CorefieldsFactory.eINSTANCE.createBooleanValue();
    }

    @Override
    public void onEnter(BooleanValue value) throws Exception {
        super.onEnter(value);
    }
}
