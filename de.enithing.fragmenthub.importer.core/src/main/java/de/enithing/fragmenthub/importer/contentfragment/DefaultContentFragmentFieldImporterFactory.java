package de.enithing.fragmenthub.importer.contentfragment;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.fragmenthub.importer.contentfragment.instance.field.*;
import de.enithing.fragmenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.importer.contentfragment.model.field.*;
import de.enithing.fragmenthub.model.contentfragment.corefields.*;
import de.enithing.fragmenthub.model.contentfragment.corefields.Boolean;
import de.enithing.fragmenthub.model.contentfragment.corefields.Number;

import java.util.Enumeration;

public class DefaultContentFragmentFieldImporterFactory extends ContentFragmentFieldImporterRegistry {
    public DefaultContentFragmentFieldImporterFactory() {
        registerFactory(new ContentFragmentFieldImporterFactory() {

            @Override
            public Class<?> getFieldTypeClass() {
                return SingleLineText.class;
            }

            @Override
            public String getResourceType() {
                return "granite/ui/components/coral/foundation/form/textfield";
            }

            @Override
            public String getMultiResourceType() {
                return "granite/ui/components/coral/foundation/form/multifield";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new SingleLineTextTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return new StringValueImporter(cfg);
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {

            @Override
            public Class<?> getFieldTypeClass() {
                return MultiLineText.class;
            }

            @Override
            public String getResourceType() {
                return "dam/cfm/admin/components/authoring/contenteditor/multieditor";
            }

            @Override
            public String getMultiResourceType() {
                return "dam/cfm/admin/components/authoring/contenteditor/cfmmultifield";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new MultiLineTextTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return new StringValueImporter(cfg);
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {

            @Override
            public Class<?> getFieldTypeClass() {
                return DateTime.class;
            }

            @Override
            public String getResourceType() {
                return "dam/cfm/models/editor/components/datatypes/datepicker";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new DateTimeTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return new DateTimeValueImporter(cfg);
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {

            @Override
            public Class<?> getFieldTypeClass() {
                return FragmentReference.class;
            }

            @Override
            public String getMultiResourceType() {
                return "dam/cfm/models/editor/components/fragmentreference/multifield";
            }

            @Override
            public String getResourceType() {
                return "dam/cfm/models/editor/components/fragmentreference";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new FragmentReferenceTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return new FragmentReferenceValueImporter(cfg);
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {
            @Override
            public Class<?> getFieldTypeClass() {
                return Tab.class;
            }

            @Override
            public String getResourceType() {
                return "dam/cfm/models/editor/components/tabplaceholder";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new TabTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return null;
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {
            @Override
            public Class<?> getFieldTypeClass() {
                return Tags.class;
            }

            @Override
            public String getResourceType() {
                return "cq/gui/components/coral/common/form/tagfield";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new TagsTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return null;
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {

            @Override
            public Class<?> getFieldTypeClass() {
                return ContentReference.class;
            }

            @Override
            public String getResourceType() {
                return "dam/cfm/models/editor/components/contentreference";
            }

            @Override
            public String getMultiResourceType() {
                return "granite/ui/components/coral/foundation/form/multifield";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new ContentReferenceTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return null;
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {

            @Override
            public Class<?> getFieldTypeClass() {
                return Enumeration.class;
            }

            @Override
            public String getResourceType() {
                return "granite/ui/components/coral/foundation/form/select";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new EnumerationTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return null;
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {

            @Override
            public Class<?> getFieldTypeClass() {
                return Boolean.class;
            }

            @Override
            public String getResourceType() {
                return "granite/ui/components/coral/foundation/form/checkbox";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new BooleanTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return new BooleanValueImporter(cfg);
            }
        });

        registerFactory(new ContentFragmentFieldImporterFactory() {

            @Override
            public Class<?> getFieldTypeClass() {
                return Number.class;
            }

            @Override
            public String getResourceType() {
                return "granite/ui/components/coral/foundation/form/numberfield";
            }

            @Override
            public String getMultiResourceType() {
                return "granite/ui/components/coral/foundation/form/multifield";
            }

            @Override
            public ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg) {
                return new NumberTypeImporter(cfg);
            }

            @Override
            public ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg) {
                return new NumberValueImporter(cfg);
            }
        });
    }
}
