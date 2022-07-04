package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.Tags;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.SimplePath;
import org.jdom2.Element;

import java.nio.file.Path;

public class TagsTypeImporter extends ContentFragmentFieldTypeImporter<Tags> {
    public TagsTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public Tags createElement() throws Exception {
        Tags field = CorefieldsFactory.eINSTANCE.createTags();
        setFieldDefaults(field);

        Element node = getConfig().node;

        field.setPlaceholder(JcrUtils.getXmlAttribute(node, "emptyText").getValue());
        field.setAllowMultiple(JcrUtils.getXmlAttributeBool(node, "multiple"));
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "required"));

        SimplePath path = ContentHubFactory.eINSTANCE.createSimplePath();
        path.setPath(Path.of(JcrUtils.getXmlAttribute(node, "rootPath").getValue()));
        field.setRootPath(path);

        return field;
    }
}