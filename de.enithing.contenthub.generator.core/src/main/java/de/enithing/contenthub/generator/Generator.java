package de.enithing.contenthub.generator;

import java.util.logging.Logger;

import de.enithing.contenthub.generator.util.ModelPrinter;

public interface Generator<T> {
	public GeneratorConfiguration getConfig();

	default public GeneratorConfiguration createChildConfig(T element) {
		GeneratorConfiguration cfg = getConfig().clone();
		cfg.parentElement = element;
		cfg.parentGenerator = this;
		return cfg;
	}

	public void onEnter(T element) throws Exception;

	public void onExit(T element) throws Exception;

	public Logger getLogger();

	default public void generate(T element) throws Exception {
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
