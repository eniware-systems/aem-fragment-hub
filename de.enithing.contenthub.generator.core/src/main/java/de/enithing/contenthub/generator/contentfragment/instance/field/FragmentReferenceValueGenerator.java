package de.enithing.contenthub.generator.contentfragment.instance.field;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.contenthub.generator.util.VelocityUtils;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;

public class FragmentReferenceValueGenerator extends ContentFragmentFieldInstanceGenerator<FragmentReferenceValue> {

	public FragmentReferenceValueGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void populateAttribs(ContentFragmentFieldInstance element, FragmentReferenceValue value, VelocityContext ctx,
			Map<String, Object> attribs) {
		List<Path> paths = value.getFragments().stream().map(fragment -> VelocityUtils.replace(fragment.getPath(), ctx))
				.collect(Collectors.toList());

		attribs.put("", paths);
	}
}
