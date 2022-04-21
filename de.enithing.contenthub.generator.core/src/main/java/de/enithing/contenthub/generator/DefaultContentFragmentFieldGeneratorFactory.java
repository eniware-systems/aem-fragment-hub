package de.enithing.contenthub.generator;

import de.enithing.contenthub.generator.fields.ContentReferenceGenerator;
import de.enithing.contenthub.generator.fields.DateTimeGenerator;
import de.enithing.contenthub.generator.fields.FragmentReferenceGenerator;
import de.enithing.contenthub.generator.fields.MultiLineTextGenerator;
import de.enithing.contenthub.generator.fields.SingleLineTextGenerator;
import de.enithing.contenthub.generator.fields.TabGenerator;
import de.enithing.contenthub.generator.fields.TagsGenerator;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contentfragment.corefields.Tags;

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
				return MultiLineText.class;
			}
			
			@Override
			public ContentFragmentFieldGenerator<?> createGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new MultiLineTextGenerator(cfg);
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
		
		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return Tab.class;
			}
			
			@Override
			public ContentFragmentFieldGenerator<?> createGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new TabGenerator(cfg);
			}
		});
		
		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return Tags.class;
			}
			
			@Override
			public ContentFragmentFieldGenerator<?> createGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new TagsGenerator(cfg);
			}
		});
		
		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return ContentReference.class;
			}
			
			@Override
			public ContentFragmentFieldGenerator<?> createGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new ContentReferenceGenerator(cfg);
			}
		});
	}
}
