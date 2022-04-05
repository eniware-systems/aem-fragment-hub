package de.enithing.contenthub.model.contenthub.contentfragment.util;

import java.util.ArrayList;
import java.util.Collection;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.contentfragment.GroupFieldType;

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
