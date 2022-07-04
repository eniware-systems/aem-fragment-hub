package de.enithing.contenthub.generator.contentfragment.instance.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;

public class StringValueGenerator extends ContentFragmentFieldInstanceGenerator<StringValue> {

	public StringValueGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void populateAttribs(ContentFragmentFieldInstance element, StringValue value, VelocityContext ctx,
			Map<String, Object> attribs) {
		attribs.put("", value.getValue());
	}
}
