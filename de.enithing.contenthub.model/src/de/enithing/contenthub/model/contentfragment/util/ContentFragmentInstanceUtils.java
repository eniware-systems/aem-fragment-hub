package de.enithing.contenthub.model.contentfragment.util;

import java.nio.file.Path;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;

public class ContentFragmentInstanceUtils {
	private ContentFragmentInstanceUtils() {

	}

	public static Path getPath(ContentFragmentInstance instance) {
		return instance.getContext().getPath().resolve(instance.getId());
	}
}
