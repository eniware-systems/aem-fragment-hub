package de.enithing.contenthub.generator;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VelocityHelper {
	public <T> String join(String delimiter, Iterable<T> ary) {
		return Stream.of(ary).map(e -> Objects.toString(e)).collect(Collectors.joining(delimiter));
	}
}
