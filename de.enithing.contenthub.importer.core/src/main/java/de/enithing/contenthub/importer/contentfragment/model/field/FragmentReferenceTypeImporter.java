package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.SimplePath;
import org.jdom2.Element;

import java.nio.file.Path;

public class FragmentReferenceTypeImporter extends ContentFragmentFieldTypeImporter<FragmentReference> {
    public FragmentReferenceTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public FragmentReference createElement() throws Exception {
        FragmentReference field = CorefieldsFactory.eINSTANCE.createFragmentReference();
        setFieldDefaults(field);

        Element node = getConfig().currentNode;

        field.setAllowMultiple(JcrUtils.getXmlAttributeBool(node, "isMultifield"));

        // TODO set allowed model types

        // field.getAllowedModels()

        field.setAllowFragmentCreation(JcrUtils.getXmlAttributeBool(node, "allowNew"));
        field.setAllowFragmentCreation(JcrUtils.getXmlAttributeBool(node, "required"));

        SimplePath path = ContentHubFactory.eINSTANCE.createSimplePath();
        path.setPath(Path.of(JcrUtils.getXmlAttribute(node, "rootPath").getValue()));
        field.setRootPath(path);

        return field;
    }
}