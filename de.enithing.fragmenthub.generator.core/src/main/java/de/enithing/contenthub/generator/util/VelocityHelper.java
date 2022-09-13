package de.enithing.fragmenthub.generator.util;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.enithing.fragmenthub.generator.TemplateBasedGenerator;

/**
 * This class provides helper methods for use inside Velocity templates. Use it by accessing the $util variable defined by
 * {@link TemplateBasedGenerator}
 * @author mvonkeil
 *
 */
public class VelocityHelper {
	/**
	 * Joins an array by stringifying all the elements 
	 * @param <T> The element type
	 * @param delimiter The delimiter when joining the elements
	 * @param ary The array containing the elements
	 * @return The joined result
	 */
	public <T> String join(String delimiter, Iterable<T> ary) {
		return Stream.of(ary).map(e -> Objects.toString(e)).collect(Collectors.joining(delimiter));
	}
}
