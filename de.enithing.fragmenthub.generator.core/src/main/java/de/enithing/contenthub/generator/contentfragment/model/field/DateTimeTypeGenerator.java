package de.enithing.contenthub.generator.contentfragment.model.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTime;

public class DateTimeTypeGenerator extends ContentFragmentFieldTypeGenerator<DateTime> {

	public DateTimeTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void populateAttribs(DateTime element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("displayedFormat", "YYYY-MM-DD HH:mm");
		attribs.put("emptyText", String.format("[YYYY-MM-DD HH:mm,%s]", element.getPlaceholder()));
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
	public String getResourceType(DateTime unused) {
		return "dam/cfm/models/editor/components/datatypes/datepicker";
	}

	@Override
	public String getValueType(DateTime unused) {
		return "calendar/datetime";
	}

	@Override
	public String getMetaType(DateTime unused) {
		return "date";
	}

}
