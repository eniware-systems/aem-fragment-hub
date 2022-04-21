package de.enithing.contenthub.generator.fields;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.ContentFragmentFieldGenerator;
import de.enithing.contenthub.generator.ContentFragmentMultiFieldGenerator;
import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.JcrUtils;
import de.enithing.contenthub.generator.VelocityUtils;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;

public class MultiLineTextGenerator extends ContentFragmentMultiFieldGenerator<MultiLineText>{

	public MultiLineTextGenerator(GeneratorConfiguration cfg) {
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
					.map(mdl -> VelocityUtils.replace(ContextUtils.getJcrPath(mdl.getContext(), true), ctx))
					.collect(Collectors.toList());
			attribs.put("fragmentmodelreference", allowedFragmentModelPaths);
		}
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return "dam/cfm/admin/components/authoring/contenteditor/multieditor";
	}
	
	@Override
	public String getMultiResourceType() {
		return "dam/cfm/admin/components/authoring/contenteditor/cfmmultifield";
	}

	@Override
	public String getValueType() {
		return "string/multiline";
	}

	@Override
	public String getMetaType() {
		return "text-multi";
	}

	@Override
	public void getSharedFieldAttribs(Set<String> attribs) {		
	}

}
