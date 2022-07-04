package de.enithing.contenthub.generator;

import org.apache.commons.vfs2.FileObject;

import de.enithing.contenthub.generator.contentfragment.ContentFragmentFieldGeneratorRegistry;
import de.enithing.contenthub.generator.contentfragment.DefaultContentFragmentFieldGeneratorFactory;

public class GeneratorConfiguration {
	public enum UnknownFieldHandlingMode {
		Error,
		Ignore,
	}
	
	public FileObject targetRoot;
	public Generator<?> parentGenerator;
	public Object parentElement;
	public UnknownFieldHandlingMode unknownFieldHandling = UnknownFieldHandlingMode.Error;
	
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
		cfg.unknownFieldHandling = unknownFieldHandling;
		return cfg;
	}
}
