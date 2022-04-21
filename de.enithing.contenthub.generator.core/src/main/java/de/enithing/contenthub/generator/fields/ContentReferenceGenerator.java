package de.enithing.contenthub.generator.fields;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.ContentFragmentFieldGenerator;
import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;

public class ContentReferenceGenerator extends ContentFragmentFieldGenerator<ContentReference>{

	public ContentReferenceGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return "todo";
	}

	@Override
	public String getValueType() {
		// TODO Auto-generated method stub
		return "todo";
	}

	@Override
	public String getMetaType() {
		// TODO Auto-generated method stub
		return "todo";
	}

	@Override
	public void populateAttribs(ContentReference element, VelocityContext ctx, Map<String, Object> attribs) {
		// TODO Auto-generated method stub
		
	}

}
