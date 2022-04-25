package de.enithing.contenthub.generator.contentfragment;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.contenthub.generator.contentfragment.instance.field.FragmentReferenceValueGenerator;
import de.enithing.contenthub.generator.contentfragment.instance.field.MultiLineTextValueGenerator;
import de.enithing.contenthub.generator.contentfragment.instance.field.StringValueGenerator;
import de.enithing.contenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.contenthub.generator.contentfragment.model.field.ContentReferenceTypeGenerator;
import de.enithing.contenthub.generator.contentfragment.model.field.DateTimeTypeGenerator;
import de.enithing.contenthub.generator.contentfragment.model.field.FragmentReferenceTypeGenerator;
import de.enithing.contenthub.generator.contentfragment.model.field.MultiLineTextTypeGenerator;
import de.enithing.contenthub.generator.contentfragment.model.field.SingleLineTextTypeGenerator;
import de.enithing.contenthub.generator.contentfragment.model.field.TabTypeGenerator;
import de.enithing.contenthub.generator.contentfragment.model.field.TagsTypeGenerator;
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
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new SingleLineTextTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new StringValueGenerator(cfg);
			}
		});

		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return MultiLineText.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new MultiLineTextTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new MultiLineTextValueGenerator(cfg);
			}
		});

		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return DateTime.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new DateTimeTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				// TODO Auto-generated method stub
				return null;
			}
		});

		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return FragmentReference.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new FragmentReferenceTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new FragmentReferenceValueGenerator(cfg);
			}
		});

		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return Tab.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new TabTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				// TODO Auto-generated method stub
				return null;
			}
		});

		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return Tags.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new TagsTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				// TODO Auto-generated method stub
				return null;
			}
		});

		registerFactory(new ContentFragmentFieldGeneratorFactory() {
			@Override
			public Class<?> getFieldTypeClass() {
				return ContentReference.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new ContentReferenceTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				// TODO Auto-generated method stub
				return null;
			}
		});
	}
}
