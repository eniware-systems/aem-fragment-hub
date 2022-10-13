package de.enithing.fragmenthub.generator.contentfragment.model.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.fragmenthub.generator.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.Boolean;

public class BooleanTypeGenerator extends ContentFragmentFieldTypeGenerator<Boolean> {

	public BooleanTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public String getResourceType(Boolean unused) {
		return "granite/ui/components/coral/foundation/form/checkbox";
	}

	@Override
	public String getValueType(Boolean unused) {
		return "boolean";
	}

	@Override
	public String getMetaType(Boolean unused) {
		return "boolean";
	}

	@Override
	public void populateAttribs(Boolean element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("text", attribs.get("fieldLabel"));
		attribs.remove("fieldLabel");

		attribs.put("checked", element.isDefaultValue());
		attribs.put("required", JcrUtils.toFlag(element.isRequired()));
	}

}
