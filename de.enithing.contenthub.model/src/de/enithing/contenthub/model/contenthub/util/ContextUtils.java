package de.enithing.contenthub.model.contenthub.util;

import java.nio.file.Path;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.Context;
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
			return includeRootPath ? ((RootContext) ctx).getJcrRootPath() : Path.of("/");
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

	private static void findContextsByJcrPath(Context root, Path path, Set<Context> results) {
		Path p = getJcrPath(root, false);
		if (p.equals(path)) {
			results.add(root);
		}

		for (Context child : root.getChildContexts()) {
			findContextsByJcrPath(child, path, results);
		}
	}

	public static Collection<Context> findContextsByJcrPath(Context root, Path path) {
		Set<Context> results = new HashSet<>();
		findContextsByJcrPath(root, path, results);
		return results;
	}
	
	public static Collection<Context> findAllContextWithSameJcrPath(Context context, boolean excludeSelf) {		
		Stream<Context> results = findContextsByJcrPath(getRootContext(context), getJcrPath(context, false)).stream();
		
		if(excludeSelf) {
			results = results.filter(c -> c != context);
		}
		
		return results.toList();
	}
}
