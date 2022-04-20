package de.enithing.contenthub.model.contenthub.util;

import java.nio.file.Path;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPolicy;
import de.enithing.contenthub.model.contenthub.RootContext;

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
	 * @param ctx             The context to resolve the path for
	 * @param includeRootPath Whether to include the root context path
	 * @return The resolved path
	 */
	public static Path getJcrPath(Context ctx, boolean includeRootPath) {
		if (ctx instanceof RootContext) {
			return includeRootPath ? ctx.getRelativePath() : Path.of("/");
		}

		ChildContext childCtx = (ChildContext) ctx;

		Path parentPath = getJcrPath(childCtx.getParentContext(), includeRootPath);

		return Path.of(parentPath.toString(), childCtx.getRelativePath().toString()).normalize();
	}

	/**
	 * Resolves the root context of a given context
	 * 
	 * @param ctx The child context
	 * @return The root context of ctx
	 */
	public static RootContext getRootContext(Context ctx) {
		if (ctx instanceof RootContext) {
			return (RootContext) ctx;
		}

		return getRootContext(((ChildContext) ctx).getParentContext());
	}

	/**
	 * Gets all contexts that resolve to the same path as this one
	 * 
	 * @param ctx The context
	 * @return A list of related contexts
	 */
	public static EList<Context> getRelatedContexts(Context ctx) {
		EList<Context> results = new BasicEList<>();
		results.addAll(findAllContextWithSameJcrPath(ctx, false));
		return results;
	}

	/**
	 * Checks all related contexts for a valid title and returns the first one
	 * found.
	 * 
	 * @param ctx The context
	 * @return The unified title or an empty string if no title was set in any
	 *         related context.
	 */
	public static String getUnifiedTitle(Context ctx) {
		return getRelatedContexts(ctx).stream().filter(c -> StringUtils.isNotEmpty(c.getTitle())).map(c -> c.getTitle())
				.findFirst().orElse(StringUtils.EMPTY);
	}

	/**
	 * Gets all policies of related contexts
	 * 
	 * @param ctx The context
	 * @return A list of all policies related with this context
	 */
	public static EList<ContextPolicy> getRelatedPolicies(Context ctx) {
		EList<ContextPolicy> results = new BasicEList<>();
		results.addAll(getRelatedContexts(ctx).stream().map(c -> c.getPolicies()).flatMap(List::stream).toList());
		return results;
	}

	/**
	 * Gets all policies of related contexts restricted by a given type
	 * 
	 * @param <TPolicy> The policy type
	 * @param ctx       The context
	 * @param clazz     The class of policy type to get
	 * @return A list of all policies related with this context
	 */
	public static <TPolicy extends ContextPolicy> EList<TPolicy> getRelatedPoliciesByType(Context ctx,
			Class<TPolicy> clazz) {
		EList<TPolicy> results = new BasicEList<>();
		@SuppressWarnings("unchecked")
		List<TPolicy> policies = getRelatedPolicies(ctx).stream().filter(p -> clazz.isAssignableFrom(p.getClass()))
				.map(p -> (TPolicy) p).toList();
		results.addAll(policies);
		return results;
	}

	private static void findContextsByJcrPath(Context root, Path path, Set<Context> results) {
		Path p = getJcrPath(root, false);
		if (p.equals(path)) {
			results.add(root);
		}

		for (Context child : root.getChildContexts()) {
			findContextsByJcrPath(child, path, results);
		}
	}

	private static Collection<Context> findContextsByJcrPath(Context root, Path path) {
		Set<Context> results = new HashSet<>();
		findContextsByJcrPath(root, path, results);
		return results;
	}

	private static Collection<Context> findAllContextWithSameJcrPath(Context context, boolean excludeSelf) {
		Stream<Context> results = findContextsByJcrPath(getRootContext(context), getJcrPath(context, false)).stream();

		if (excludeSelf) {
			results = results.filter(c -> c != context);
		}

		return results.toList();
	}
}
