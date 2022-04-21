package de.enithing.contenthub.generator;

import org.apache.commons.vfs2.FileObject;

public class GeneratorConfiguration {
	public FileObject targetRoot;
	public Generator<?> parentGenerator;
	public Object parentElement;
	final private ContentFragmentFieldGeneratorRegistry fieldGeneratorRegistry;
	
	public GeneratorConfiguration(ContentFragmentFieldGeneratorRegistry fieldGeneratorRegistry) {
		this.fieldGeneratorRegistry = fieldGeneratorRegistry;
	}
	
	public GeneratorConfiguration() {
		this(new DefaultContentFragmentFieldGeneratorFactory());
	}
	
	public ContentFragmentFieldGeneratorRegistry getFieldGeneratorRegistry() {
		return fieldGeneratorRegistry;
	}
	
	@Override
	protected GeneratorConfiguration clone() {
		GeneratorConfiguration cfg = new GeneratorConfiguration(fieldGeneratorRegistry);
		cfg.targetRoot = targetRoot;
		cfg.parentGenerator = parentGenerator;
		cfg.parentElement = parentElement;
		return cfg;
	}
}
