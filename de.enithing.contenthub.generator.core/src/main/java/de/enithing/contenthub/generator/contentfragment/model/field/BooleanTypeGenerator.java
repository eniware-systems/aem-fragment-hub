package de.enithing.contenthub.generator.contentfragment.model.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.contenthub.model.contentfragment.corefields.Boolean;

public class BooleanTypeGenerator extends ContentFragmentFieldTypeGenerator<Boolean> {

	public BooleanTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResourceType() {
		return "granite/ui/components/coral/foundation/form/checkbox";
	}

	@Override
	public String getValueType() {
		return "boolean";
	}

	@Override
	public String getMetaType() {
		return "boolean";
	}

	@Override
	public void populateAttribs(Boolean element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("text", attribs.get("fieldLabel"));
		attribs.remove("fieldLabel");

		attribs.put("checked", element.isDefaultValue());
		attribs.put("required", element.isRequired());
	}

}
