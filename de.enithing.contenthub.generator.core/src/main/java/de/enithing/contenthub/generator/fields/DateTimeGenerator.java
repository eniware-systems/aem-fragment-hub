package de.enithing.contenthub.generator.fields;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import com.fasterxml.jackson.databind.type.PlaceholderForType;

import de.enithing.contenthub.generator.ContentFragmentFieldGenerator;
import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;

public class DateTimeGenerator extends ContentFragmentFieldGenerator<DateTime> {

	public DateTimeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void populateAttribs(DateTime element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("displayedFormat", "YYYY-MM-DD HH:mm");
		attribs.put("emptyText", String.format("[[YYYY-MM-DD HH:mm,%s]", element.getPlaceholder()));
		attribs.put("required", JcrUtils.toFlag(element.isRequired()));
		attribs.put("type", element.getType());
		attribs.put("value", element.getDefaultValue());
		attribs.put("valueFormat", "YYYY-MM-DD[T]HH:mm:ss.000Z");
	}

	@Override
	public void populateGraniteAttribs(DateTime element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("typeHint", "Date");
	}

	@Override
	public String getResourceType() {
		return "dam/cfm/models/editor/components/datatypes/datepicker";
	}

	@Override
	public String getValueType() {
		return "calendar/datetime";
	}

	@Override
	public String getMetaType() {
		return "date";
	}

}
