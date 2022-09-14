package de.enithing.fragmenthub.generator.contentfragment.model.field;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.fragmenthub.generator.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration;
import de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption;

public class EnumerationTypeGenerator extends ContentFragmentFieldTypeGenerator<Enumeration> {

	public EnumerationTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public String getResourceType(Enumeration unused) {
		return "granite/ui/components/coral/foundation/form/select";
	}

	@Override
	public String getValueType(Enumeration unused) {
		return "string";
	}

	@Override
	public String getMetaType(Enumeration unused) {
		return "enumeration";
	}

	@Override
	public void populateAttribs(Enumeration element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("emptyOption", true);
		attribs.put("emptyText", element.getPlaceholder());
		attribs.put("required", JcrUtils.toFlag(element.isRequired()));
		attribs.put("unique", element.isUnique());
	}

	@Override
	public void populateTemplateContext(Enumeration element, VelocityContext ctx) throws IOException, ParseException { //
		super.populateTemplateContext(element, ctx);

		int n = 0;

		List<Map<String, String>> items = new ArrayList<>();

		for (EnumerationOption opt : element.getOptions()) {
			Map<String, String> item = new HashMap<>();

			item.put("tag", String.format("item%s", n++));
			item.put("label", opt.getValue());
			item.put("value", opt.getKey());
			items.add(item);
		}

		ctx.put("items", items);
	}

}
