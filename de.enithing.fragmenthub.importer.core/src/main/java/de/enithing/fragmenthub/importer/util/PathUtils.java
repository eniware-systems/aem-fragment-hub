package de.enithing.fragmenthub.importer.util;

import java.nio.file.Path;

public class PathUtils {
    private PathUtils() {
    }

    public static Path replacePackageName(Path p, String packageName) {
        if (p.getNameCount() >= 3 && p.getName(0).toString().equals("content") && p.getName(1).toString().equals("dam")) {
            p = Path.of("/content/dam/" + packageName).resolve(p.subpath(3, p.getNameCount()));
        } else if (p.getNameCount() >= 2 && p.getName(0).toString().equals("conf")) {
            p = Path.of("/conf/" + packageName).resolve(p.subpath(2, p.getNameCount()));
        }

        return p;
    }
}
