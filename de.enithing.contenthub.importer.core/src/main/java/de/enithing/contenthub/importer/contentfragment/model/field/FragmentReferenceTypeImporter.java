package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;

public class FragmentReferenceTypeImporter extends ContentFragmentFieldTypeImporter<FragmentReference> {
    public FragmentReferenceTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public FragmentReference createElement() throws Exception {
        FragmentReference field = CorefieldsFactory.eINSTANCE.createFragmentReference();
        setFieldDefaults(field);
        return field;
    }
}