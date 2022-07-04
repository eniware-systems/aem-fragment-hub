package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;

public class MultiLineTextTypeImporter extends ContentFragmentFieldTypeImporter<MultiLineText>  {
    public MultiLineTextTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public MultiLineText createElement() throws Exception {
        MultiLineText field = CorefieldsFactory.eINSTANCE.createMultiLineText();
        setFieldDefaults(field);
        return field;
    }
}
