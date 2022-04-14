package de.enithing.contenthub.model.contentfragment.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.GroupFieldType;
import de.enithing.contenthub.model.contenthub.Context;
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
		}
	}

	public static Collection<ContentFragmentFieldType<?>> getAllFields(ContentFragmentModel mdl) {
		ArrayList<ContentFragmentFieldType<?>> results = new ArrayList<>();

		for (ContentFragmentFieldType<?> field : mdl.getFields()) {
			collectFields(field, results);
		}

		return results;
	}
}
