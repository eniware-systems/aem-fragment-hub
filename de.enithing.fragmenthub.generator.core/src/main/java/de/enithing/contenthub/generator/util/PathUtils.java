package de.enithing.contenthub.generator.util;

import java.nio.file.Path;

/**
 * Utilities for working with {@link Path} objects
 * @author mvonkeil
 *
 */
public class PathUtils {
	private PathUtils() {}
	
	/**
	 * Forces a path to a relative representation by stripping the absolute root (leading slash)
	 * @param path The path to make relative
	 * @return The relativized path
	 */
	public static Path makeRelative(Path path) {
		if(path.isAbsolute()) {
			return path.getRoot().relativize(path);
		}
		
		return path;
	}
	
	/**
	 * Gets the root leaf of a path (its first component)
	 * @param path The path
	 * @return The root leaf of the path
	 */
	public static Path getRootLeaf(Path path) {
		Path root = path.getRoot();
		Path parent = path.getParent();
		
		if(root.equals(parent)) {
			return path;
		}
		
		return getRootLeaf(parent);
	}
}
