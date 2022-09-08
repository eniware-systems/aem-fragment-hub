package de.enithing.contenthub.importer.contentfragment;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.instance.ContentFragmentFieldValueImporter;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;

import org.apache.commons.lang3.StringUtils;

public interface ContentFragmentFieldImporterFactory {
	Class<?> getFieldTypeClass();

	default boolean accepts(ContentFragmentFieldType<?> type) {
		return getFieldTypeClass().isAssignableFrom(type.getClass());
	}

	default boolean accepts(String resourceType) {
		return StringUtils.equals(getResourceType(),resourceType) || StringUtils.equals(getMultiResourceType(), resourceType);
	}

	String getResourceType();

	default String getMultiResourceType() { return null; }

	ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg);

	ContentFragmentFieldValueImporter<?> createValueImporterInstance(ImporterConfiguration cfg);
}
