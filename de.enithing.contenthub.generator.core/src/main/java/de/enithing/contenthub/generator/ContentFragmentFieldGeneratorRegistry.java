package de.enithing.contenthub.generator;

import java.util.HashSet;
import java.util.NoSuchElementException;

import de.enithing.contenthub.generator.GeneratorConfiguration.UnknownFieldHandlingMode;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;

public class ContentFragmentFieldGeneratorRegistry {
	public void registerFactory(ContentFragmentFieldGeneratorFactory factory) {
		factories.add(factory);
	}

	public ContentFragmentFieldGenerator<?> createGeneratorInstance(ContentFragmentFieldType<?> fieldType,
			GeneratorConfiguration cfg) {
		try {
			ContentFragmentFieldGeneratorFactory factory = factories.stream().filter(f -> f.accepts(fieldType))
					.findFirst().orElseThrow(() -> new NoSuchElementException(
							"No registered factory that supports fields of type " + fieldType.getClass().getName()));
			return factory.createGeneratorInstance(cfg);
		} catch (NoSuchElementException e) {

			if (cfg.unknownFieldHandling == UnknownFieldHandlingMode.Ignore) {
				return null;
			} else {
				throw e;
			}
		}
	}

	private HashSet<ContentFragmentFieldGeneratorFactory> factories = new HashSet<>();
}
