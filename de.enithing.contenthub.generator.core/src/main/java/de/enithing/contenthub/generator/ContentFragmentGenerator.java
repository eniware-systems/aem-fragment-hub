package de.enithing.contenthub.generator;

import java.io.IOException;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;

public class ContentFragmentGenerator implements TemplateBasedGenerator<ContentFragmentInstance> {

	private GeneratorConfiguration config;
	
	public ContentFragmentGenerator(GeneratorConfiguration cfg) {
		this.config = cfg;
	}
	
	@Override
	public GeneratorConfiguration getConfig() {
		return config;
	}

	@Override
	public void onEnter(ContentFragmentInstance cf) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onExit(ContentFragmentInstance cf) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void populateTemplateContext(ContentFragmentInstance cf, VelocityContext ctx)
			throws IOException, ParseException {
		// TODO Auto-generated method stub

	}

}
