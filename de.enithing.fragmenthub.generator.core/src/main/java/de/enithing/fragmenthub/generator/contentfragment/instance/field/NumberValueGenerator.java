package de.enithing.fragmenthub.generator.contentfragment.instance.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.corefields.NumberValue;

public class NumberValueGenerator extends ContentFragmentFieldInstanceGenerator<NumberValue> {

	public NumberValueGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void populateAttribs(ContentFragmentFieldInstance element, NumberValue value, VelocityContext ctx,
			Map<String, Object> attribs) {
		attribs.put("", value.getValue());
	}
}
