package de.enithing.contenthub.generator.util;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.Package;

public class ModelPrinter {
	private ModelPrinter() {
	}

	public static String toString(Object o) {
		if (o instanceof Package) {
			return toString((Package) o);
		}

		if (o instanceof ContentFragmentModel) {
			return toString((ContentFragmentModel) o);
		}

		if (o instanceof ContentFragmentFieldType<?>) {
			return toString((ContentFragmentFieldType<?>) o);
		}

		if (o instanceof ContentFragmentInstance) {
			return toString((ContentFragmentInstance) o);
		}

		if (o instanceof ContentFragmentFieldInstance) {
			return toString((ContentFragmentFieldInstance) o);
		}
		
		if (o instanceof Context) {
			return toString((Context) o);
		}

		return o.toString();
	}

	public static String toString(Package pkg) {
		return String.format("Package %s.%s", pkg.getGroup(), pkg.getName());
	}

	public static String toString(ContentFragmentModel mdl) {
		return String.format("Content fragment model %s", mdl.getId());
	}

	public static String toString(ContentFragmentFieldType<?> fieldType) {
		return String.format("Content fragment model field type %s", fieldType.getPropertyName());
	}

	public static String toString(ContentFragmentInstance inst) {
		return String.format("Content fragment %s", inst.getId());
	}

	public static String toString(ContentFragmentFieldInstance field) {
		return String.format("Content fragment field %s", field.getFieldtype().getPropertyName());
	}
	
	public static String toString(Context ctx) {
		return String.format("Context %s (%s)", ctx.getName(), ctx.getPath());
	}
}
