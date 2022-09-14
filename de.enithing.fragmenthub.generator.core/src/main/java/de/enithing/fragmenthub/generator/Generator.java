package de.enithing.fragmenthub.generator;

import java.util.logging.Logger;

import de.enithing.fragmenthub.generator.util.ModelPrinter;

public interface Generator<T> {
	GeneratorConfiguration getConfig();

	default GeneratorConfiguration createChildConfig(T element) {
		GeneratorConfiguration cfg = getConfig().clone();
		cfg.parentElement = element;
		cfg.parentGenerator = this;
		return cfg;
	}

	void onEnter(T element) throws Exception;

	void onExit(T element) throws Exception;

	Logger getLogger();

	default void generate(T element) throws Exception {
		Logger logger = getLogger();

		try {
			logger.info(String.format("Generating %s ...", ModelPrinter.toString(element)));
			onEnter(element);
			onExit(element);
			logger.fine(String.format("Generated %s ...", ModelPrinter.toString(element)));
		} catch (Exception e) {
			logger.severe(String.format("Generation of %s failed: %s", ModelPrinter.toString(element), e.getMessage()));
			throw e;
		}
	}
}
