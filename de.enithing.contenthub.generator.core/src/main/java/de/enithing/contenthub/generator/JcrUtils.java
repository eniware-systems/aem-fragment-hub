package de.enithing.contenthub.generator;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang.StringEscapeUtils;

public class JcrUtils {
	private JcrUtils() {
	}

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

		return Objects.toString(value);
	}

	public static String toFlag(Boolean value) {
		return value ? "on" : "off";
	}

	public static String getValueType(String type, boolean isArray) {
		return isArray ? type + "[]" : type;
	}

	public static String toStringValueArray(Iterable<?> items) {
		return toStringValueArray(items, false);
	}

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
}
