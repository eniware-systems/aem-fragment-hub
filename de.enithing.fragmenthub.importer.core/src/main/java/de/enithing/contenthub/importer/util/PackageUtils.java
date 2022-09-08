package de.enithing.contenthub.importer.util;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.Package;

import java.util.Collection;
import java.util.stream.Stream;

public class PackageUtils {
    private PackageUtils() {
    }

    public static Collection<ContentFragmentInstance> getAllContentFragmentInstances(Package pkg) {
        return getAllContentFragmentInstances(pkg.getContentRoot()).toList();
    }

    private static Stream<ContentFragmentInstance> getAllContentFragmentInstances(Context ctx) {
        Stream<ContentFragmentInstance> result = ctx.getContentFragments().stream();
        for (Context childContext : ctx.getChildContexts()) {
            result = Stream.concat(result, getAllContentFragmentInstances(childContext));
        }

        return result;
    }
}
