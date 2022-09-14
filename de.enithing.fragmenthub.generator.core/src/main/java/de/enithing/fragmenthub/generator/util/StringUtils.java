package de.enithing.fragmenthub.generator.util;

import org.apache.commons.lang.WordUtils;

import java.util.Locale;
import java.util.Random;

public class StringUtils {
    private StringUtils() {
    }

    public static String toLowerSnakeCase(String s) {
        String value = s.toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z0-9]+", "-");
        return org.apache.commons.lang3.StringUtils.strip(value, "-");
    }

    public static String toPascalCase(String s) {
        String value = toLowerSnakeCase(s);
        return WordUtils.capitalizeFully(value, new char[]{'-'}).replace("-", "");
    }

    public static String generateNumericId(int length) {
        return generateNumericId(length, 0);
    }

    public static String generateNumericId(int length, int seed) {
        Random random = seed != 0 ? new Random(seed) : new Random();
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
