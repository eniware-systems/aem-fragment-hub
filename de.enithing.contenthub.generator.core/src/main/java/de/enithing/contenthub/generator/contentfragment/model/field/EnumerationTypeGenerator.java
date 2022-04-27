package de.enithing.contenthub.generator.contentfragment.model.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.contenthub.model.contentfragment.corefields.Enumeration;

public class EnumerationTypeGenerator extends ContentFragmentFieldTypeGenerator<Enumeration> {

	public EnumerationTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResourceType() {
		return "granite/ui/components/coral/foundation/form/select";
	}

	@Override
	public String getValueType() {
		return "string";
	}

	@Override
	public String getMetaType() {
		return "enumeration";
	}

	@Override
	public void populateAttribs(Enumeration element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("emptyOption", true);
		attribs.put("emptyText", element.getPlaceholder());
		attribs.put("required", element.isRequired());
		attribs.put("unique", element.isUnique());
	}

}
