package de.enithing.fragmenthub.generator.util;

import de.enithing.fragmenthub.model.contentfragment.*;
import de.enithing.fragmenthub.model.fragmenthub.Context;
import de.enithing.fragmenthub.model.fragmenthub.Package;

public class ModelPrinter {
    private ModelPrinter() {
    }

    public static String toString(Object o) {
        return toString(o, true);
    }

    public static String toString(Object o, boolean withParents) {
        if (o instanceof Package) {
            return toString((Package) o);
        }

        if (o instanceof ContentFragmentModelSet) {
            return toString((ContentFragmentModelSet) o, withParents);
        }

        if (o instanceof ContentFragmentModel) {
            return toString((ContentFragmentModel) o, withParents);
        }

        if (o instanceof ContentFragmentFieldType<?>) {
            return toString((ContentFragmentFieldType<?>) o, withParents);
        }

        if (o instanceof ContentFragmentInstance) {
            return toString((ContentFragmentInstance) o, withParents);
        }

        if (o instanceof ContentFragmentFieldInstance) {
            return toString((ContentFragmentFieldInstance) o, withParents);
        }

        if (o instanceof Context) {
            return toString((Context) o, withParents);
        }

        return o.toString();
    }

    private static String concat(String a, String b) {
        return String.format("%s -> %s", a, b);
    }

    public static String toString(Package pkg) {
        return String.format("(Package)%s.%s", pkg.getGroup(), pkg.getName());
    }

    public static String toString(ContentFragmentModelSet set, boolean withParents) {
        String result = String.format("(ModelSet)%s", set.getName());

        if (withParents) {
            return concat(ModelPrinter.toString(set.getPackage()), result);
        }

        return result;
    }

    public static String toString(ContentFragmentModel mdl, boolean withParents) {
        String result = String.format("(CFM)%s", mdl.getId());

        if (withParents) {
            return concat(ModelPrinter.toString(mdl.getModelSet(), true), result);
        }

        return result;
    }

    public static String toString(ContentFragmentFieldType<?> fieldType, boolean withParents) {
        String result = String.format("(CFMField)%s", fieldType.getPropertyName());

        if (withParents) {
            return concat(ModelPrinter.toString(fieldType.getModel(), true), result);
        }

        return result;
    }

    public static String toString(ContentFragmentInstance inst, boolean withParents) {
        String result = String.format("(CF)%s", inst.getId());

        if (withParents) {
            return concat(ModelPrinter.toString(inst.getContext(), true), result);
        }

        return result;
    }

    public static String toString(ContentFragmentFieldInstance field, boolean withParents) {
        String result = String.format("(CFField)%s", field.getFieldtype().getPropertyName());

        if (withParents) {
            return concat(ModelPrinter.toString(field.getInstance(), true), result);
        }

        return result;
    }

    public static String toString(Context ctx, boolean withParents) {
        String result = String.format("(Context)%s", ctx.getPath());

        if (withParents) {
            Context parent = ctx.getParentContext();
            if (parent != null) {
                return concat(ModelPrinter.toString(parent, true), result);
            }
            return concat(ModelPrinter.toString(ctx.getPackage()), result);
        }

        return result;
    }
}
