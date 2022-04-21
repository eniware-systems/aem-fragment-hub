package de.enithing.contenthub.generator.fields;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.ContentFragmentFieldGenerator;
import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;

public class TabGenerator extends ContentFragmentFieldGenerator<Tab>  {

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
	public void populateAttribs(Tab element, VelocityContext ctx, Map<String, Object> attribs) {
		// TODO Auto-generated method stub
		
	}

}
