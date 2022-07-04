package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import org.jdom2.Element;

public class SingleLineTextTypeImporter extends ContentFragmentFieldTypeImporter<SingleLineText> {
    public SingleLineTextTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public SingleLineText createElement() throws Exception {
        SingleLineText field = CorefieldsFactory.eINSTANCE.createSingleLineText();
        setFieldDefaults(field);
        return field;
    }
}
