package de.enithing.contenthub.generator.fields;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.contenthub.generator.ContentFragmentFieldGenerator;
import de.enithing.contenthub.generator.ContentFragmentMultiFieldGenerator;
import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.JcrUtils;
import de.enithing.contenthub.generator.VelocityUtils;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;

public class FragmentReferenceGenerator extends ContentFragmentMultiFieldGenerator<FragmentReference> {

	public FragmentReferenceGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void populateAttribs(FragmentReference element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("nameSuffix", "contentReference");
		attribs.put("filter", "hierarchy");

		List<Path> allowedModelPaths = element.getAllowedModels().stream()
				.map(mdl -> VelocityUtils.replace(ContextUtils.getJcrPath(mdl.getContext(), true), ctx))
				.collect(Collectors.toList());
		attribs.put("fragmentmodelreference", JcrUtils.toStringValueArray(allowedModelPaths));

		attribs.put("allowNew", element.isAllowFragmentCreation());
		attribs.put("required", JcrUtils.toFlag(element.isRequired()));
		attribs.put("rootPath", element.getRootPath());
	}

	@Override
	public void getSharedFieldAttribs(Set<String> attribs) {
		attribs.add("fragmentmodelreference");
	}

	@Override
	public String getMultiResourceType() {
		return "dam/cfm/models/editor/components/fragmentreference/multifield";
	}

	@Override
	public String getResourceType() {
		return "dam/cfm/models/editor/components/fragmentreference";
	}

	@Override
	public String getValueType() {
		return "string/content-fragment";
	}

	@Override
	public String getMetaType() {
		return "fragment-reference";
	}
}
