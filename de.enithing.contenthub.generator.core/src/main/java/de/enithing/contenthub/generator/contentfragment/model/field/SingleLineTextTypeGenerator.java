package de.enithing.contenthub.generator.contentfragment.model.field;

import java.util.Map;
import java.util.Set;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;

public class SingleLineTextTypeGenerator extends ContentFragmentMultiFieldTypeGenerator<SingleLineText> {

	public SingleLineTextTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
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
	public String getMultiResourceType() {
		// TODO Auto-generated method stub
		return "granite/ui/components/coral/foundation/form/multifield";
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return "granite/ui/components/coral/foundation/form/textfield";
	}

	@Override
	public String getValueType() {
		// TODO Auto-generated method stub
		return "string";
	}

	@Override
	public String getMetaType() {
		// TODO Auto-generated method stub
		return "text-single";
	}

}
