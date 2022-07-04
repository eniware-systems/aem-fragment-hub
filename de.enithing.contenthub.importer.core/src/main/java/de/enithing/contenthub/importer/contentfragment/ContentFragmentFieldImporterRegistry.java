package de.enithing.contenthub.importer.contentfragment;

import java.util.HashSet;
import java.util.NoSuchElementException;

import de.enithing.contenthub.importer.ImporterConfiguration;
import de.enithing.contenthub.importer.util.JcrUtils;
import de.enithing.contenthub.importer.contentfragment.model.ContentFragmentFieldTypeImporter;
import org.jdom2.Element;

public class ContentFragmentFieldImporterRegistry {
	public void registerFactory(ContentFragmentFieldImporterFactory factory) {
		factories.add(factory);
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
