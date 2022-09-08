package de.enithing.contenthub.generator.contentfragment;

import java.util.HashSet;
import java.util.NoSuchElementException;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.GeneratorConfiguration.UnknownFieldHandlingMode;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.contenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;

public class ContentFragmentFieldGeneratorRegistry {
	public void registerFactory(ContentFragmentFieldGeneratorFactory factory) {
		factories.add(factory);
	}

	public ContentFragmentFieldGeneratorFactory getFactory(ContentFragmentFieldType<?> fieldType) {
		return factories.stream().filter(f -> f.accepts(fieldType)).findFirst()
				.orElseThrow(() -> new NoSuchElementException(
						"No registered factory that supports fields of type " + fieldType.getClass().getName()));
	}

	public ContentFragmentFieldTypeGenerator<?> createTypeGeneratorInstance(ContentFragmentFieldType<?> fieldType,
			GeneratorConfiguration cfg) {
		try {
			ContentFragmentFieldGeneratorFactory factory = getFactory(fieldType);
			return factory.createTypeGeneratorInstance(cfg);
		} catch (NoSuchElementException e) {

			if (cfg.unknownFieldHandling == UnknownFieldHandlingMode.Ignore) {
				return null;
			} else {
				throw e;
			}
		}
	}

	public ContentFragmentFieldInstanceGenerator<?> createInstanceGeneratorInstance(
			ContentFragmentFieldType<?> fieldType, GeneratorConfiguration cfg) {
		try {
			ContentFragmentFieldGeneratorFactory factory = getFactory(fieldType);
			return factory.createInstanceGeneratorInstance(cfg);
		} catch (NoSuchElementException e) {
			if (cfg.unknownFieldHandling == UnknownFieldHandlingMode.Ignore) {
				return null;
			} else {
				throw e;
			}
		}
	}

	private final HashSet<ContentFragmentFieldGeneratorFactory> factories = new HashSet<>();
}
