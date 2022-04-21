package de.enithing.contenthub.generator.fields;

import java.util.Map;
import java.util.Set;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.ContentFragmentFieldGenerator;
import de.enithing.contenthub.generator.ContentFragmentMultiFieldGenerator;
import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;

public class MultiLineTextGenerator extends ContentFragmentFieldGenerator<MultiLineText>{

	public MultiLineTextGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void populateAttribs(MultiLineText element, VelocityContext ctx, Map<String, Object> attribs) {
		Object label = attribs.get("fieldLabel");
		attribs.remove("fieldLabel");
		attribs.put("cfm-element", label);
		
		attribs.put("default-mime-type", element.getDefaultType());
		attribs.put("checked", false);
		attribs.put("required", JcrUtils.toFlag(element.isRequired()));
		attribs.put("translatable", element.isTranslatable());
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return "dam/cfm/admin/components/authoring/contenteditor/multieditor";
	}

	@Override
	public String getValueType() {
		// TODO Auto-generated method stub
		return "string/multiline";
	}

	@Override
	public String getMetaType() {
		// TODO Auto-generated method stub
		return "text-multi";
	}

}
