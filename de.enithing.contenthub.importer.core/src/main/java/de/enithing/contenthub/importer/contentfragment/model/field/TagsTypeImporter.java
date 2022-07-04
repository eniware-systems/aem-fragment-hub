package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.Tags;

public class TagsTypeImporter extends ContentFragmentFieldTypeImporter<Tags> {
    public TagsTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Tags createElement() throws Exception {
        Tags field = CorefieldsFactory.eINSTANCE.createTags();
        setFieldDefaults(field);
        return field;
    }
}