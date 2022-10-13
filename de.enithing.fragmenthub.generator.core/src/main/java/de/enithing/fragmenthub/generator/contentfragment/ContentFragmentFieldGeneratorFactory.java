package de.enithing.fragmenthub.generator.contentfragment;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;

public interface ContentFragmentFieldGeneratorFactory {
	Class<?> getFieldTypeClass();
	
	default boolean accepts(ContentFragmentFieldType<?> type) {
		return getFieldTypeClass().isAssignableFrom(type.getClass());
	}
	
	ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg);
	
	ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(GeneratorConfiguration cfg);
}
