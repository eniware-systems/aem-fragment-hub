package de.enithing.fragmenthub.generator.contentfragment.instance.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTimeValue;

public class DateTimeValueGenerator extends ContentFragmentFieldInstanceGenerator<DateTimeValue>  {

	public DateTimeValueGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void populateAttribs(ContentFragmentFieldInstance element, DateTimeValue value, VelocityContext ctx,
			Map<String, Object> attribs) {
		attribs.put("", value.getValue());		
	}

}
