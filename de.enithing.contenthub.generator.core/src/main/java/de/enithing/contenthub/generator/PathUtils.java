package de.enithing.contenthub.generator;

import java.nio.file.Path;

public class PathUtils {
	private PathUtils() {}
	
	static Path makeRelative(Path path) {
		if(path.isAbsolute()) {
			return path.getRoot().relativize(path);
		}
		
		return path;
	}
	
	static Path getRootLeaf(Path path) {
		Path root = path.getRoot();
		Path parent = path.getParent();
		
		if(root.equals(parent)) {
			return path;
		}
		
		return getRootLeaf(parent);
	}
}
