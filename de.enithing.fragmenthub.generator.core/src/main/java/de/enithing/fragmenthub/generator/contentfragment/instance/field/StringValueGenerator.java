package de.enithing.fragmenthub.generator.contentfragment.instance.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.corefields.StringValue;

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
