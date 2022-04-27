package de.enithing.contenthub.generator.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang.StringEscapeUtils;

import de.enithing.contenthub.model.contentfragment.corefields.validation.LowerBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.LowerUpperBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.UpperBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint;

/**
 * Utilities for generating JCR related code
 * 
 * @author mvonkeil
 *
 */
public class JcrUtils {
	private JcrUtils() {
	}

	/**
	 * Stringifies a value for usage in a JCR definition
	 * 
	 * @param value The value
	 * @return The JCR compatible representation of the value
	 */
	public static String toStringValue(Object value) {
		if (value instanceof String) {
			return StringEscapeUtils.escapeXml((String) value);
		}

		if (value instanceof Boolean) {
			Boolean v = (Boolean) value;
			return String.format("{Boolean}%s", v ? "true" : "false");
		}

		if (value instanceof Date) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
			return String.format("{Date}%s", format.format(value));
		}

		if (value instanceof Collection<?>) {
			return toStringValueArray((Iterable<?>) value);
		}

		if (value instanceof Byte || value instanceof Short || value instanceof Integer || value instanceof Long
				|| value instanceof BigInteger) {
			return String.format("{Long}%s", value);
		}

		if (value instanceof Float || value instanceof Double || value instanceof BigDecimal) {
			return String.format("{Double}%s", value);
		}

		return Objects.toString(value);
	}

	/**
	 * Creates a flag representation of a boolean where 'on' means true and 'off'
	 * means false.
	 * 
	 * @param value The boolean value
	 * @return The stringified flag representation
	 */
	public static String toFlag(boolean value) {
		return value ? "on" : "off";
	}

	/**
	 * Generates the valueType attribute for a given type.
	 * 
	 * @param type    The type name
	 * @param isArray Whether the item is an array
	 * @return The input type representation in either unary or nary form.
	 */
	public static String getValueType(String type, boolean isArray) {
		return isArray ? type + "[]" : type;
	}

	/**
	 * Creates a stringified array value representation from an iterable
	 * 
	 * @param items The input elements
	 * @return The string representation of the elements (as array)
	 */
	public static String toStringValueArray(Iterable<?> items) {
		return toStringValueArray(items, false);
	}

	/**
	 * Creates a stringified array value representation from an iterable
	 * 
	 * @param items            The input elements
	 * @param forceSingleItems whether to treat single items as arrays with one
	 *                         element
	 * @return The string representation of the elements (as array)
	 */
	public static String toStringValueArray(Iterable<?> items, boolean forceSingleItems) {
		boolean first = true;

		String result = "";

		int count = 0;
		for (Object item : items) {
			if (first) {
				first = false;
			} else {
				result += ",";
			}

			result += toStringValue(item);
			count++;
		}

		if (count == 1 && !forceSingleItems) {
			return result;
		}

		return "[" + result + "]";
	}

	public static String getValidationAttrib(String prefix, ValidationConstraint<?> constraint) {
		if (constraint == null) {
			return "None";
		}

		if (constraint instanceof LowerUpperBoundConstraint<?>) {
			return prefix + "interval";
		}

		if (constraint instanceof LowerBoundConstraint<?>) {
			return prefix + "min";
		}

		if (constraint instanceof UpperBoundConstraint<?>) {
			return prefix + "max";
		}

		throw new IllegalArgumentException("Unknown validation constraint type");
	}
}
