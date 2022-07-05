package de.enithing.contenthub.importer.contentfragment.model.field;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.*;
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