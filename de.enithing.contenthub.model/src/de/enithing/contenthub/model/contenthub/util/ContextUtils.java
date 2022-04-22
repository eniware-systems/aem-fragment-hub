package de.enithing.contenthub.model.contenthub.util;

import java.nio.file.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPolicy;

/**
 * Utilities for working with contexts
 */
public class ContextUtils {
	private ContextUtils() {

	}

	/**
	 * Resolves the path of this context as represented in the repository by
	 * traversing its ancestors paths
	 * 
	 * @param ctx The context to resolve the path for
	 * @return The resolved path
	 */
	public static Path getPath(Context ctx) {
		if (ctx.getParentContext() == null) {
			return Path.of("/").resolve(ctx.getName());
		}

		Path parentPath = getPath(ctx.getParentContext());
		
		return parentPath.resolve(ctx.getName());
	}

	/**
	 * Resolves the root context of a given context
	 * 
	 * @param ctx The child context
	 * @return The root context of ctx
	 */
	public static Context getRootContext(Context ctx) {
		if (ctx.getParentContext() == null) {
			return ctx;
		}

		return getRootContext(ctx.getParentContext());
	}

	/**
	 * Gets all policies of the context restricted by a given type
	 * 
	 * @param <TPolicy> The policy type
	 * @param ctx       The context
	 * @param clazz     The class of policy type to get
	 * @return A list of all policies in this context.
	 */
	@SuppressWarnings("unchecked")
	public static <TPolicy extends ContextPolicy> EList<TPolicy> getPoliciesByType(Context ctx, Class<TPolicy> clazz) {
		return new BasicEList<TPolicy>(ctx.getPolicies().stream().filter(p -> clazz.isAssignableFrom(p.getClass()))
				.map(p -> (TPolicy) p).toList());
	}

}
