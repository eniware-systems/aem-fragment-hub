package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;

public class ContentReferenceTypeImporter extends ContentFragmentFieldTypeImporter<ContentReference> {
    public ContentReferenceTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public ContentReference createElement() throws Exception {
        ContentReference field = CorefieldsFactory.eINSTANCE.createContentReference();
        setFieldDefaults(field);
        return field;
    }
}