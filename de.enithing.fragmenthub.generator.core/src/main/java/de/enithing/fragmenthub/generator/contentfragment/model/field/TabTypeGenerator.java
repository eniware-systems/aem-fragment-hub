package de.enithing.fragmenthub.generator.contentfragment.model.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.fragmenthub.generator.Generator;
import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.contentfragment.ContentFragmentFieldGeneratorRegistry;
import de.enithing.fragmenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.SimpleFieldType;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTime;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tab;

public class TabTypeGenerator extends ContentFragmentFieldTypeGenerator<Tab> {

	private String renderedChildFields = "";

	public TabTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public String getResourceType(Tab unused) {
		return "dam/cfm/models/editor/components/tabplaceholder";
	}

	@Override
	public String getValueType(Tab unused) {
		return "string/tab";
	}

	@Override
	public String getMetaType(Tab unused) {
		return "tab-placeholder";
	}

	@Override
	public void populateAttribs(Tab field, VelocityContext ctx, Map<String, Object> attribs) {

	}

	@Override
	public void onExit(Tab field) throws Exception {
		ContentFragmentFieldGeneratorRegistry fieldGeneratorRegistry = getConfig().getFieldGeneratorRegistry();

		for (SimpleFieldType<?> child : field.getFields()) {
			@SuppressWarnings("unchecked")
			Generator<ContentFragmentModel> parentGenerator = (Generator<ContentFragmentModel>) (getConfig().parentGenerator);
			GeneratorConfiguration childConfig = parentGenerator
					.createChildConfig((ContentFragmentModel) getConfig().parentElement);
			@SuppressWarnings("unchecked")

			ContentFragmentFieldTypeGenerator<ContentFragmentFieldType<?>> generator = (ContentFragmentFieldTypeGenerator<ContentFragmentFieldType<?>>) fieldGeneratorRegistry
					.createTypeGeneratorInstance(child, childConfig);

			if (generator == null) {
				// Skip ignored field
				continue;
			}

			generator.generate(child);

			String xml = generator.getRenderedField();
			renderedChildFields += xml;
		}
		super.onExit(field);
	}

	@Override
	public String getRenderedField() {
		return super.getRenderedField() + renderedChildFields;
	}

}
