package de.enithing.contenthub.importer.util;

import java.nio.file.Path;

public class PathUtils {
    private PathUtils() {}

    public static Path replacePackageName(Path p, String packageName) {
        if(p.getNameCount() >= 3 && p.getName(0).toString().equals("content") && p.getName(1).toString().equals("dam")) {
            p = Path.of("/content/dam/" +packageName).resolve(p.subpath(3, p.getNameCount()));
        }

        return p;
    }
}
