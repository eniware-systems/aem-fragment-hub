package de.enithing.fragmenthub.generator.contentfragment;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.fragmenthub.generator.contentfragment.instance.field.BooleanValueGenerator;
import de.enithing.fragmenthub.generator.contentfragment.instance.field.DateTimeValueGenerator;
import de.enithing.fragmenthub.generator.contentfragment.instance.field.FragmentReferenceValueGenerator;
import de.enithing.fragmenthub.generator.contentfragment.instance.field.MultiLineTextValueGenerator;
import de.enithing.fragmenthub.generator.contentfragment.instance.field.NumberValueGenerator;
import de.enithing.fragmenthub.generator.contentfragment.instance.field.StringValueGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.BooleanTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.ContentReferenceTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.DateTimeTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.EnumerationTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.FragmentReferenceTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.MultiLineTextTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.NumberTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.SingleLineTextTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.TabTypeGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.field.TagsTypeGenerator;
import de.enithing.fragmenthub.model.contentfragment.corefields.Boolean;
import de.enithing.fragmenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTime;
import de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.Number;
import de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tab;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tags;

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
				return new DateTimeValueGenerator(cfg);
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
				// This field doesn't have a generator
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
				return new StringValueGenerator(cfg);
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

		registerFactory(new ContentFragmentFieldGeneratorFactory() {

			@Override
			public Class<?> getFieldTypeClass() {
				return Enumeration.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new EnumerationTypeGenerator(cfg);
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
				return Boolean.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new BooleanTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new BooleanValueGenerator(cfg);
			}
		});

		registerFactory(new ContentFragmentFieldGeneratorFactory() {

			@Override
			public Class<?> getFieldTypeClass() {
				return Number.class;
			}

			@Override
			public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(GeneratorConfiguration cfg) {
				return new NumberTypeGenerator(cfg);
			}

			@Override
			public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
					GeneratorConfiguration cfg) {
				return new NumberValueGenerator(cfg);
			}
		});
	}
}
