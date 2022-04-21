package de.enithing.contenthub.generator;

import java.io.IOException;
import org.apache.velocity.runtime.parser.ParseException;

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

	default public void generate(T element) throws Exception {
		onEnter(element);
		onExit(element);
	}
}
