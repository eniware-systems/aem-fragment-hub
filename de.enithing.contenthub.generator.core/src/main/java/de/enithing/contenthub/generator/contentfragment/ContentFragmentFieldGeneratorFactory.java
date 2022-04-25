package de.enithing.contenthub.generator.contentfragment;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.contenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;

public interface ContentFragmentFieldGeneratorFactory {
	public Class<?> getFieldTypeClass();
	
	default public boolean accepts(ContentFragmentFieldType<?> type) {
		return getFieldTypeClass().isAssignableFrom(type.getClass());
	}
	
	public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg);
	
	public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(GeneratorConfiguration cfg);
}
