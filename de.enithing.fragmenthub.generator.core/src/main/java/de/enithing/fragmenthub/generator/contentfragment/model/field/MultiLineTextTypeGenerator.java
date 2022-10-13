package de.enithing.fragmenthub.generator.contentfragment.model.field;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.velocity.VelocityContext;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.util.VelocityUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.fragmenthub.model.fragmenthub.util.ContextUtils;

public class MultiLineTextTypeGenerator extends ContentFragmentMultiFieldTypeGenerator<MultiLineText> {

	public MultiLineTextTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void populateAttribs(MultiLineText element, VelocityContext ctx, Map<String, Object> attribs) {
		
		Object label = attribs.get("fieldLabel");
		attribs.remove("fieldLabel");
		attribs.put("cfm-element", label);
		
		attribs.put("default-mime-type", element.getDefaultType());
		attribs.put("checked", element.isRequired());
		attribs.put("translatable", element.isTranslatable());
		
		if(!element.getAllowedFragmentModels().isEmpty()) {
			List<Path> allowedFragmentModelPaths = element.getAllowedFragmentModels().stream()
					.map(mdl -> VelocityUtils.replace(mdl.getPath(), ctx))
					.collect(Collectors.toList());
			attribs.put("fragmentmodelreference", allowedFragmentModelPaths);
		}
	}

	@Override
	public String getResourceType(MultiLineText unused) {
		return "dam/cfm/admin/components/authoring/contenteditor/multieditor";
	}
	
	@Override
	public String getMultiResourceType(MultiLineText unused) {
		return "dam/cfm/admin/components/authoring/contenteditor/cfmmultifield";
	}

	@Override
	public String getValueType(MultiLineText unused) {
		return "string/multiline";
	}

	@Override
	public String getMetaType(MultiLineText unused) {
		return "text-multi";
	}

	@Override
	public void getSharedFieldAttribs(Set<String> attribs) {		
	}

}
