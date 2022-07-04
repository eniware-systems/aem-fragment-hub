package de.enithing.contenthub.model.contentfragment.util;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.GroupFieldType;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.Package;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;

public class ContentFragmentModelUtils {

	private ContentFragmentModelUtils() {
	}

	private static void collectFields(ContentFragmentFieldType<?> field,
			Collection<ContentFragmentFieldType<?>> results) {
		if (field instanceof GroupFieldType<?>) {
			for (ContentFragmentFieldType<?> child : ((GroupFieldType<?>) field).getFields()) {
				collectFields(child, results);
			}
		} else {
			results.add(field);
		}
	}

	/**
	 * Gets a flat list of all available terminal fields for a given model
	 * 
	 * @param mdl The model
	 * @return The containing fields
	 */
	public static Collection<ContentFragmentFieldType<?>> getAllFields(ContentFragmentModel mdl) {
		ArrayList<ContentFragmentFieldType<?>> results = new ArrayList<>();

		for (ContentFragmentFieldType<?> field : mdl.getFields()) {
			collectFields(field, results);
		}

		return results;
	}

	public static Path getPath(ContentFragmentModel mdl) {
		return mdl.getModelSet().getPackage().getContentFragmentModelPath().resolve(mdl.getId());
	}

	@SuppressWarnings("unchecked")
	public static <TField extends ContentFragmentFieldType<?>> TField getFieldByName(ContentFragmentModel mdl,
			String name, Class<TField> clazz) {
		return (TField) mdl.getAllFields().stream()
				.filter(f -> f.getPropertyName().equals(name) && clazz.isAssignableFrom(f.getClass())).findFirst()
				.orElseThrow();
	}

	public static ContentFragmentFieldType<?> getFieldByName(ContentFragmentModel mdl, String name) {
		return mdl.getAllFields().stream().filter(f -> f.getPropertyName().equals(name)).findFirst().orElseThrow();
	}

}
