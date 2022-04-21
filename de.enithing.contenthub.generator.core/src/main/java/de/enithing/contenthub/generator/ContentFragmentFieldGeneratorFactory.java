package de.enithing.contenthub.generator;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;

public interface ContentFragmentFieldGeneratorFactory {
	public Class<?> getFieldTypeClass();
	
	default public boolean accepts(ContentFragmentFieldType<?> type) {
		return getFieldTypeClass().isAssignableFrom(type.getClass());
	}
	
	public ContentFragmentFieldGenerator<?> createGeneratorInstance(GeneratorConfiguration cfg);
}
