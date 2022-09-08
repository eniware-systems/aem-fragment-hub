package de.enithing.contenthub.generator.contentfragment;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.contenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;

public interface ContentFragmentFieldGeneratorFactory {
	Class<?> getFieldTypeClass();
	
	default boolean accepts(ContentFragmentFieldType<?> type) {
		return getFieldTypeClass().isAssignableFrom(type.getClass());
	}
	
	ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg);
	
	ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(GeneratorConfiguration cfg);
}
