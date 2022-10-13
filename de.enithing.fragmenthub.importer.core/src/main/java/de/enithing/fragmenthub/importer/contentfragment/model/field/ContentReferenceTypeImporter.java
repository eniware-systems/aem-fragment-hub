package de.enithing.fragmenthub.importer.contentfragment.model.field;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.*;

import org.jdom2.Element;

public class ContentReferenceTypeImporter extends ContentFragmentFieldTypeImporter<ContentReference> {
    public ContentReferenceTypeImporter(ImporterConfiguration cfg) {
        super(cfg);
    }

    @Override
    public ContentReference createElement() throws Exception {
        ContentReference field = CorefieldsFactory.eINSTANCE.createContentReference();
        setFieldDefaults(field);

        Element node = getConfig().currentNode;

        field.setPlaceholder(JcrUtils.getXmlAttribute(node, "emptyText").getValue());
        field.setRequired(JcrUtils.getXmlAttributeBool(node, "required"));

        field.setShowThumbnail(JcrUtils.getXmlAttributeBool(node, "showThumbnail"));
        field.getAllowedContentTypes().addAll(JcrUtils.fromArray(JcrUtils.getXmlAttribute(node, "validation").getValue()).stream().map(ContentReferenceType::get).toList());

        // TODO Fill constraints
        // field.setFileSizeValidationConstraint();
        // field.setImageWidthConstraint();
        // field.setImageHeightConstraint();

        return field;
    }
}