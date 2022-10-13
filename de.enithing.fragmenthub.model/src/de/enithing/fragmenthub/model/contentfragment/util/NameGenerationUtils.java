package de.enithing.fragmenthub.model.contentfragment.util;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

import de.enithing.fragmenthub.StringUtils;


/**
 * Utilities for name generation
 */
public class NameGenerationUtils {
	private NameGenerationUtils() {

	}

	/**
	 * The default pattern for generating names.
	 */
	public final static String DefaultNameGenerationPattern = "{0} ({1})";

	/**
	 * Generates a new unique name
	 * 
	 * @param <T>          The type of the element that should be named
	 * @param baseName     The base name of the element
	 * @param elements     An iterable containing the existing elements
	 * @param nameResolver A function that resolves the name for a given element of
	 *                     type T
	 * @return The new unique name
	 */
	public static <T> String generateName(String baseName, Iterable<T> elements, Function<T, String> nameResolver) {
		return generateName(baseName, elements, nameResolver, DefaultNameGenerationPattern);
	}

	/**
	 * Generates a new unique name
	 * 
	 * @param <T>                   The type of the element that should be named
	 * @param baseName              The base name of the element
	 * @param elements              An iterable containing the existing elements
	 * @param nameResolver          A function that resolves the name for a given
	 *                              element of type T
	 * @param nameGenerationPattern The generation pattern, MessageFormat
	 *                              compatible. First argument is the base name,
	 *                              second is the incremental counter in case of
	 *                              conflicts
	 * @return The new unique name
	 */
	public static <T> String generateName(String baseName, Iterable<T> elements, Function<T, String> nameResolver,
			String nameGenerationPattern) {
		return generateName(baseName, elements, nameResolver, nameGenerationPattern, Collections.emptyList());
	}

	/**
	 * Generates a new unique name
	 * 
	 * @param <T>                   The type of the element that should be named
	 * @param baseName              The base name of the element
	 * @param elements              An iterable containing the existing elements
	 * @param nameResolver          A function that resolves the name for a given
	 *                              element of type T
	 * @param nameGenerationPattern The generation pattern, MessageFormat
	 *                              compatible. First argument is the base name,
	 *                              second is the incremental counter in case of
	 *                              conflicts
	 * @param exclude               A collection to exclude when iterating the
	 *                              elements
	 * @return The new unique name
	 */
	public static <T> String generateName(String baseName, Iterable<T> elements, Function<T, String> nameResolver,
			String nameGenerationPattern, T exclude) {
		return generateName(baseName, elements, nameResolver, nameGenerationPattern, Arrays.asList(exclude));
	}

	/**
	 * Generates a new unique name
	 * 
	 * @param <T>                   The type of the element that should be named
	 * @param baseName              The base name of the element
	 * @param elements              An iterable containing the existing elements
	 * @param nameResolver          A function that resolves the name for a given
	 *                              element of type T
	 * @param nameGenerationPattern The generation pattern, MessageFormat
	 *                              compatible. First argument is the base name,
	 *                              second is the incremental counter in case of
	 *                              conflicts
	 * @param exclude               A collection of instances to exclude when
	 *                              iterating the elements
	 * @return The new unique name
	 */
	public static <T> String generateName(String baseName, Iterable<T> elements, Function<T, String> nameResolver,
			String nameGenerationPattern, Collection<T> exclude) {
		int c = 0;
		String newName = String.format(baseName);

		boolean found;

		do {
			found = false;
			for (T el : elements) {
				if (exclude.contains(el)) {
					continue;
				}

				String name = nameResolver.apply(el);
				if (newName.equals(name)) {
					found = true;
					newName = MessageFormat.format(nameGenerationPattern, baseName, ++c);
					break;
				}
			}
		} while (found);

		return newName;
	}

	/**
	 * Generates a machine readable string from a string in natural language
	 * 
	 * @param str   The string in natural language
	 * @param strip Whether to strip underscores from left and right of the string
	 * @return The generated machine readable string
	 */
	public static String toMachineString(String str, boolean strip) {
		if(str == null) {
			return "";
		}
		
		String result = str.toLowerCase().replaceAll("[\\(\\)\\[\\]\\t\\n\\s]", "").replaceAll("[^a-zA-Z0-9]", "_");

		if (strip) {
			result = StringUtils.strip(result);
		}
		
		return result;
	}
}
