package de.enithing.contenthub.generator.contentfragment.instance.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.StringValue;

public class MultiLineTextValueGenerator extends StringValueGenerator {

	public MultiLineTextValueGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void populateAttribs(ContentFragmentFieldInstance element, StringValue value, VelocityContext ctx,
			Map<String, Object> attribs) { 
		super.populateAttribs(element, value, ctx, attribs);

		attribs.put("x0040_ContentType", ((MultiLineText) element.getFieldtype()).getDefaultType());
	}

}
