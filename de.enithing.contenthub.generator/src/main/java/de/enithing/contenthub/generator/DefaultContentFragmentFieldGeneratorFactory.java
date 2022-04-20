package de.enithing.contenthub.generator;

import de.enithing.contenthub.generator.fields.DateTimeGenerator;
import de.enithing.contenthub.generator.fields.FragmentReferenceGenerator;
import de.enithing.contenthub.generator.fields.SingleLineTextGenerator;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;

public class DefaultContentFragmentFieldGeneratorFactory extends ContentFragmentFieldGeneratorRegistry {	
	public DefaultContentFragmentFieldGeneratorFactory() {
		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return SingleLineText.class;
			}
			
			@Override
			public ContentFragmentFieldGenerator<?> createGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new SingleLineTextGenerator(cfg);
			}
		});
		
		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return DateTime.class;
			}
			
			@Override
			public ContentFragmentFieldGenerator<?> createGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new DateTimeGenerator(cfg);
			}
		});
		
		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return FragmentReference.class;
			}
			
			@Override
			public ContentFragmentFieldGenerator<?> createGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new FragmentReferenceGenerator(cfg);
			}
		});
	}
}
