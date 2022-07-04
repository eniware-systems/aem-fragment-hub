package de.enithing.contenthub.generator.contentfragment.instance.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.corefields.BooleanValue;

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
