package de.enithing.fragmenthub.model.fragmenthub.util;

import java.nio.file.Path;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.fragmenthub.Package;

public class PackageUtils {
	private PackageUtils() {
	}

	public static EList<ContentFragmentModel> getAllContentFragmentModels(Package pkg) {
		return new BasicEList<ContentFragmentModel>(pkg.getContentFragmentModelSets().stream()
				.flatMap(s -> s.getModels().stream()).collect(Collectors.toList()));
	}

}
