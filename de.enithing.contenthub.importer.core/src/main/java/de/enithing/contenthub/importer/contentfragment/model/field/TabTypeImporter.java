package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contentfragment.corefields.Tags;

public class TabTypeImporter extends ContentFragmentFieldTypeImporter<Tab> {
    public TabTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Tab createElement() throws Exception {
        Tab field = CorefieldsFactory.eINSTANCE.createTab();
        setFieldDefaults(field);
        return field;
    }
}