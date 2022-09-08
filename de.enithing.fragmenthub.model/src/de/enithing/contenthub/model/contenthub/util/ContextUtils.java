package de.enithing.contenthub.model.contenthub.util;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import de.enithing.contenthub.StringUtils;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPolicy;
import de.enithing.contenthub.model.contenthub.Package;

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
			Package pkg = (Package) ctx.eContainer();
			return pkg.getContentPath();
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
	 * Resolves the package this context belongs to
	 * 
	 * @param ctx The context
	 * @return The package this context belongs to
	 */
	public static Package getPackage(Context ctx) {
		return (Package) getRootContext(ctx).eContainer();
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

	/**
	 * Resolves all context that match the given pattern, starting from this context
	 * 
	 * @param root    The root context to resolve from
	 * @param pattern the pattern
	 * @return The matching contexts
	 */
	public static Collection<Context> resolveContextsByPattern(Context root, Path pattern) {
		if(pattern.isAbsolute()) {
			pattern = Path.of("/").relativize(pattern);
			root=root.getRootContext();
		}
		
		Context current = root;

		List<Context> foundContexts = new ArrayList<>();

		Path currentPath = Path.of("");

		for (Path p : pattern) {
			currentPath = currentPath.resolve(p);
			String segment = p.toString();

			List<String> children = current.getChildContexts().stream().map(c -> c.getName()).toList();

			if (segment.contains("*")) {
				String regex = p.toString().replace("*", ".*");
				int i = 0;
				for (String child : children) {
					if (child.matches(regex)) {
						foundContexts.add(current.getChildContexts().get(i));
					}
					++i;
				}

				break;
			}

			else if (segment.equals(".")) {
				continue;
			}

			else if (segment.equals("..")) {
				current = current.getParentContext();
				continue;
			}

			int i = children.indexOf(segment);

			if (i < 0) {
				return Collections.emptyList();
			}

			current = current.getChildContexts().get(i);
		}

		if (foundContexts.isEmpty()) {
			return Collections.singleton(current);
		}

		currentPath = pattern.relativize(currentPath);

		if (StringUtils.isEmpty(currentPath.toString())) {
			return foundContexts;
		}

		List<Context> result = new ArrayList<>();

		for (Context ctx : foundContexts) {
			result.addAll(resolveContextsByPattern(ctx, currentPath));
		}

		return result;
	}

	/**
	 * Resolves all content fragment instances that match the given pattern,
	 * starting from this context
	 * 
	 * @param root    The root context to resolve from
	 * @param pattern the pattern
	 * @return The matching content fragment instances
	 */
	public static Collection<ContentFragmentInstance> resolveContentFragmentInstancesByPattern(Context root,
			Path pattern) {
		String namePattern = pattern.getFileName().toString().replace("*", ".*");
		Collection<Context> contexts = root.resolveContextsByPattern(pattern.getParent());

		Collection<ContentFragmentInstance> allInstances = contexts.stream()
				.flatMap(c -> c.getContentFragments().stream()).toList();

		return allInstances.stream().filter(i -> i.getId().matches(namePattern)).toList();
	}

}
