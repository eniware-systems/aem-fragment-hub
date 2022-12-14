package de.enithing.fragmenthub.importer.contentfragment;

import java.util.HashSet;
import java.util.NoSuchElementException;

import de.enithing.fragmenthub.importer.ImporterConfiguration;
import de.enithing.fragmenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import de.enithing.fragmenthub.importer.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;

import org.jdom2.Element;

public class ContentFragmentFieldImporterRegistry {
	public void registerFactory(ContentFragmentFieldImporterFactory factory) {
		factories.add(factory);
	}

	public ContentFragmentFieldImporterFactory getFactory(ContentFragmentFieldType<?> fieldType) {
		return factories.stream().filter(f -> f.accepts(fieldType)).findFirst()
				.orElseThrow(() -> new NoSuchElementException(
						"No registered factory that supports fields of type " + fieldType.getClass().getName()));
	}

	public ContentFragmentFieldImporterFactory getFactory(Element node) {
		String resourceType = JcrUtils.getXmlAttribute(node, "sling:resourceType").getValue();

		return factories.stream().filter(f -> f.accepts(resourceType)).findFirst()
				.orElseThrow(() -> new NoSuchElementException(
						"No registered factory that supports fields of type " + resourceType));
	}

	public ContentFragmentFieldTypeImporter<?> createTypeGeneratorInstance(Element node, ImporterConfiguration cfg) {
		try {
			ContentFragmentFieldImporterFactory factory = getFactory(node);
			return factory.createTypeImporterInstance(cfg);
		} catch (NoSuchElementException e) {

			if (cfg.unknownFieldHandling == ImporterConfiguration.UnknownFieldHandlingMode.Ignore) {
				return null;
			} else {
				throw e;
			}
		}
	}

	/*public ContentFragmentFieldInstanceImporter<?> createInstanceGeneratorInstance(
			ContentFragmentFieldType<?> fieldType, ImporterConfiguration cfg) {
		try {
			ContentFragmentFieldImporterFactory factory = getFactory(fieldType);
			return factory.createInstanceGeneratorInstance(cfg);
		} catch (NoSuchElementException e) {
			if (cfg.unknownFieldHandling == UnknownFieldHandlingMode.Ignore) {
				return null;
			} else {
				throw e;
			}
		}
	}*/

	private final HashSet<ContentFragmentFieldImporterFactory> factories = new HashSet<>();
}
