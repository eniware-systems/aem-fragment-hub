package de.enithing.contenthub.model.contentfragment.util;

import java.util.Collection;
import java.util.HashSet;
import de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;
import de.enithing.contenthub.model.contenthub.Package;

public class ContentFragmentUtils {
	private ContentFragmentUtils() {
	}

	private static Collection<ContentFragmentModel> getAvailableModelsForContextOrNull(Context context) {
		HashSet<ContentFragmentModel> models = null;

		for (AllowedContentFragmentModelPolicy policy : ContextUtils.getPoliciesByType(context,
				AllowedContentFragmentModelPolicy.class)) {
			if (models == null) {
				models = new HashSet<>();
			}
			models.addAll(policy.getModels());
		}

		Collection<ContentFragmentModel> parentModels = context.getParentContext() != null
				? getAvailableModelsForContextOrNull(context.getParentContext())
				: null;

		if (models == null) {
			// The context does not explicitly provide any policy overrides
			if (parentModels != null) {
				return parentModels;
			}

			// Also the parent does not provide any policy overrides, return all models of
			// the package
			Package pkg = (Package) context.getRootContext().eContainer();
			Collection<ContentFragmentModel> allModels = pkg.getAllContentFragmentModels();
			return allModels;
		}

		return models;
	}

	public static Collection<ContentFragmentModel> getAvailableModelsForContext(Context context) {
		return getAvailableModelsForContextOrNull(context);
	}
}
