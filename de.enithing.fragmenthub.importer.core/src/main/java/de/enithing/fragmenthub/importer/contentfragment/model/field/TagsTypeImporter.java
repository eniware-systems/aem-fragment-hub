package de.enithing.fragmenthub.importer.contentfragment.model.field;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tags;
import de.enithing.fragmenthub.model.fragmenthub.ContentHubFactory;
import de.enithing.fragmenthub.model.fragmenthub.SimplePath;

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

        Element node = getConfig().currentNode;

        field.setPlaceholder(JcrUtils.getXmlAttribute(node, "emptyText").getValue());
        field.setAllowMultiple(JcrUtils.getXmlAttributeBool(node, "multiple"));
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "required"));

        SimplePath path = ContentHubFactory.eINSTANCE.createSimplePath();
        path.setPath(Path.of(JcrUtils.getXmlAttribute(node, "rootPath").getValue()));
        field.setRootPath(path);

        return field;
    }
}