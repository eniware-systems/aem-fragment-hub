package de.enithing.contenthub.importer.contentfragment;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import org.apache.commons.lang3.StringUtils;

public interface ContentFragmentFieldImporterFactory {
	Class<?> getFieldTypeClass();

	default boolean accepts(String resourceType) {
		return StringUtils.equals(getResourceType(),resourceType) || StringUtils.equals(getMultiResourceType(), resourceType);
	}

	String getResourceType();

	default String getMultiResourceType() { return null; }

	ContentFragmentFieldTypeImporter<?> createTypeImporterInstance(ImporterConfiguration cfg);

	// public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(ImporterConfiguration cfg);
}
