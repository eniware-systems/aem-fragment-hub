package de.enithing.fragmenthub.generator;

import org.apache.commons.vfs2.FileObject;

import de.enithing.fragmenthub.generator.contentfragment.ContentFragmentFieldGeneratorRegistry;
import de.enithing.fragmenthub.generator.contentfragment.DefaultContentFragmentFieldGeneratorFactory;

public class GeneratorConfiguration {
	public enum UnknownFieldHandlingMode {
		Error,
		Ignore,
	}
	
	public FileObject targetRoot;
	public Generator<?> parentGenerator;
	public Object parentElement;
	public UnknownFieldHandlingMode unknownFieldHandling = UnknownFieldHandlingMode.Error;

	public boolean skipSkeletonCreation = false;

	public boolean removeExistingFiles = false;
	
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
