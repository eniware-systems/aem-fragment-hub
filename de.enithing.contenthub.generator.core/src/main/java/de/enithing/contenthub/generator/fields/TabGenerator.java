package de.enithing.contenthub.generator.fields;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.ContentFragmentFieldGenerator;
import de.enithing.contenthub.generator.ContentFragmentFieldGeneratorRegistry;
import de.enithing.contenthub.generator.Generator;
import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.SimpleFieldType;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;

public class TabGenerator extends ContentFragmentFieldGenerator<Tab> {

	private String renderedChildFields = "";

	public TabGenerator(GeneratorConfiguration cfg) {
		super(cfg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return "dam/cfm/models/editor/components/tabplaceholder";
	}

	@Override
	public String getValueType() {
		// TODO Auto-generated method stub
		return "string/tab";
	}

	@Override
	public String getMetaType() {
		// TODO Auto-generated method stub
		return "tab-placeholder";
	}

	@Override
	public void populateAttribs(Tab field, VelocityContext ctx, Map<String, Object> attribs) {
		// TODO Auto-generated method stub

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

			ContentFragmentFieldGenerator<ContentFragmentFieldType<?>> generator = (ContentFragmentFieldGenerator<ContentFragmentFieldType<?>>) fieldGeneratorRegistry
					.createGeneratorInstance(child, childConfig);

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
