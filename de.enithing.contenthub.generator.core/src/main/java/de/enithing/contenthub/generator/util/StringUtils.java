package de.enithing.contenthub.generator.util;

import java.util.Locale;
import java.util.Random;

public class StringUtils {
	private StringUtils() {
	}

	public static String toLowerSnakeCase(String s) {
		String value = s.toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z0-9]+", "-");
		return org.apache.commons.lang3.StringUtils.strip(value, "-");
	}

	public static String generateNumericId(int length) {
		Random random = new Random();
		char[] digits = new char[length];
		digits[0] = (char) (random.nextInt(9) + '1');
		for (int i = 1; i < length; i++) {
			digits[i] = (char) (random.nextInt(10) + '0');
		}
		return new String(digits);
	}

	public static String generateHexId(int length) {
		Random r = new Random();
		StringBuffer sb = new StringBuffer();
		while (sb.length() < length) {
			sb.append(Integer.toHexString(r.nextInt()));
		}

		return sb.toString().substring(0, length);
	}
}
