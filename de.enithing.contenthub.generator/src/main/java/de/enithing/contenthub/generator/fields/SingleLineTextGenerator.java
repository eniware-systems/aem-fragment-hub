package de.enithing.contenthub.generator.fields;

import java.util.Map;
import java.util.Set;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.ContentFragmentMultiFieldGenerator;
import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;

public class SingleLineTextGenerator extends ContentFragmentMultiFieldGenerator<SingleLineText>{

	public SingleLineTextGenerator(GeneratorConfiguration cfg) {
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
