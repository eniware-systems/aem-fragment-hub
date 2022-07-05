package de.enithing.contenthub.importer.contentfragment.instance.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;
import org.jdom2.Element;

import java.util.Collection;

public class FragmentReferenceValueImporter extends ContentFragmentFieldValueImporter<FragmentReferenceValue> {
    public FragmentReferenceValueImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public FragmentReferenceValue createElement() throws Exception {
        return CorefieldsFactory.eINSTANCE.createFragmentReferenceValue();
    }

    @Override
    public void onEnter(FragmentReferenceValue value) throws Exception {
        String propertyName = getConfig().currentField.getPropertyName();
        Element node = getConfig().currentNode;

        Collection<String> paths = JcrUtils.fromArray(JcrUtils.getXmlAttribute(node, propertyName).getValue());

        // TODO: Assign paths (probably not here but after the content was imported fully)
    }
}
