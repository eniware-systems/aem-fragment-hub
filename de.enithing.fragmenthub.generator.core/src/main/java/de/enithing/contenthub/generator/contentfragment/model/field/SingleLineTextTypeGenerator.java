package de.enithing.contenthub.generator.contentfragment.model.field;

import java.util.Map;
import java.util.Set;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText;

public class SingleLineTextTypeGenerator extends ContentFragmentMultiFieldTypeGenerator<SingleLineText> {

	public SingleLineTextTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void populateAttribs(SingleLineText element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("maxlength", element.getMaxLength());
		attribs.put("emptyText", element.getPlaceholder());
		attribs.put("unique", element.isUnique());
		attribs.put("required", JcrUtils.toFlag(element.isRequired()));
		attribs.put("translatable", element.isTranslatable());
	}

	@Override
	public void getSharedFieldAttribs(Set<String> attribs) {
		attribs.add("emptyText");
		attribs.add("maxlength");
	}

	@Override
	public String getMultiResourceType(SingleLineText unused) {
		return "granite/ui/components/coral/foundation/form/multifield";
	}

	@Override
	public String getResourceType(SingleLineText unused) {
		return "granite/ui/components/coral/foundation/form/textfield";
	}

	@Override
	public String getValueType(SingleLineText unused) { 
		return "string";
	}

	@Override
	public String getMetaType(SingleLineText unused) {
		return "text-single";
	}

}
