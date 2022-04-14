package de.enithing.contenthub.model.contentfragment.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;
import de.enithing.contenthub.model.contenthub.Package;

public class ContentFragmentUtils {
	private ContentFragmentUtils() {
	}

	public static Collection<ContentFragmentInstance> getAllInstancesForContext(Context context, boolean recursive) {
		HashSet<ContentFragmentInstance> results = new HashSet<>();

		results.addAll(context.getContentFragments());

		if (recursive) {
			for (Context child : context.getChildContexts()) {
				results.addAll(getAllInstancesForContext(child, true));
			}
		}

		return results;
	}

	public static Collection<ContentFragmentModel> getAllModelsForContext(Context context, boolean recursive) {
		HashSet<ContentFragmentModel> results = new HashSet<>();

		results.addAll(context.getContentFragmentModels());

		if (recursive) {
			for (Context child : context.getChildContexts()) {
				results.addAll(getAllModelsForContext(child, true));
			}
		}

		return results;
	}

	private static Collection<ContentFragmentModel> getAvailableModelsForContextOrNull(Context context) {
		HashSet<ContentFragmentModel> models = null;

		for (AllowedContentFragmentModelPolicy policy : ContextUtils.getRelatedPoliciesByType(context,
				AllowedContentFragmentModelPolicy.class)) {
			if (models == null) {
				models = new HashSet<>();
			}
			models.addAll(policy.getModels());
		}

		Collection<ContentFragmentModel> parentModels = null;

		if (context instanceof ChildContext) {
			parentModels = getAvailableModelsForContextOrNull(((ChildContext) context).getParentContext());
		}

		if (models == null) {
			// The context does not explicitly provide any policy overrides
			if (parentModels != null) {
				return parentModels;
			}

			// Also the parent does not provide any policy overrides, return all models of
			// the package
			Package pkg = (Package) context.getRootContext().eContainer();
			List<ContentFragmentModel> allModels = pkg.getContexts().stream()
					.flatMap(ctx -> getAllModelsForContext(ctx, true).stream()).toList();
			return allModels;
		}

		return models;
	}

	public static Collection<ContentFragmentModel> getAvailableModelsForContext(Context context) {
		return getAvailableModelsForContextOrNull(context);
	}
}
