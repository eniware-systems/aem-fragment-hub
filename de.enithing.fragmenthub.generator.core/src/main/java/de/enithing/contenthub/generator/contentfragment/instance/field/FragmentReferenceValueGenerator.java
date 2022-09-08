package de.enithing.contenthub.generator.contentfragment.instance.field;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentFieldInstanceGenerator;
import de.enithing.contenthub.generator.util.VelocityUtils;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.fragmenthub.model.contentfragment.corefields.ContentFragmentReference;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReferenceValue;
import de.enithing.fragmenthub.model.fragmenthub.Context;

public class FragmentReferenceValueGenerator extends ContentFragmentFieldInstanceGenerator<FragmentReferenceValue> {

	public FragmentReferenceValueGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void populateAttribs(ContentFragmentFieldInstance element, FragmentReferenceValue value, VelocityContext ctx,
			Map<String, Object> attribs) {
		Set<Path> paths = value.getFragments().stream().map(fragment -> VelocityUtils.replace(fragment.getPath(), ctx))
				.collect(Collectors.toSet());

		if (!StringUtils.isEmpty(value.getFragmentsByPathPattern())) {
			final FragmentReference ref = (FragmentReference) element.getFieldtype();

			Path pattern = Path.of(VelocityUtils.replace(value.getFragmentsByPathPattern(), ctx));
			Context rootContext = element.getInstance().getContext();

			Collection<ContentFragmentInstance> allInstances = rootContext
					.resolveContentFragmentInstancesByPattern(pattern);

			Collection<ContentFragmentInstance> matchingInstances = allInstances.stream()
					.filter(instance -> ref.getAllowedModels().stream().anyMatch(other -> {
						Class<?> otherClass = other.getClass();
						Class<?> myClass = instance.getModel().getClass();

						return otherClass.isAssignableFrom(myClass);
					})).toList();

			paths.addAll(matchingInstances.stream().map(fragment -> VelocityUtils.replace(fragment.getPath(), ctx))
					.toList());
		}

		attribs.put("", paths);
	}
}
