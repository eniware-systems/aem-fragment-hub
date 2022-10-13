package de.enithing.fragmenthub;

import java.util.Objects;

public class StringUtils {
	private StringUtils() {}
	
	public static boolean isBlank(String s) {
		return s == null || s.trim().equals("");
	}
	
	public static boolean isEmpty(String s) {
		return s == null || s.equals("");
	}
	
	public static String strip(String s) {
		return s == null ? "" : s.trim();
	}
	
	public static boolean equals(String a, String b) {
		return Objects.equals(a, b);
	}
}
