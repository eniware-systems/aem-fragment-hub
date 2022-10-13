package de.enithing.fragmenthub.generator.contentfragment.instance.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue;

public class BooleanValueGenerator extends ContentFragmentFieldInstanceGenerator<BooleanValue> {

	public BooleanValueGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void populateAttribs(ContentFragmentFieldInstance element, BooleanValue value, VelocityContext ctx,
			Map<String, Object> attribs) {
		attribs.put("", value.isValue());
	}
}
