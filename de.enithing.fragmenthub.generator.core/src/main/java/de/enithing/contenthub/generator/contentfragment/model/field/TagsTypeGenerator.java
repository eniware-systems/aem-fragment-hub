package de.enithing.contenthub.generator.contentfragment.model.field;

import java.util.Map;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tags;

public class TagsTypeGenerator extends ContentFragmentFieldTypeGenerator<Tags> {

	public TagsTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public String getResourceType(Tags unused) {
		return "cq/gui/components/coral/common/form/tagfield";
	}

	@Override
	public String getValueType(Tags unused) {
		return "string/tags[]";
	}

	@Override
	public String getMetaType(Tags unused) {
		return "tags";
	}

	@Override
	public void populateAttribs(Tags element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("cq:showOnCreate", true);
		attribs.put("autocreateTag", true);
		attribs.put("forceSelection", false);

		attribs.put("emptyText", element.getPlaceholder());
		attribs.put("multiple", element.isAllowMultiple());
		attribs.put("required", JcrUtils.toFlag(element.isRequired()));
		if(element.getRootPath() != null) {
			attribs.put("rootPath", element.getRootPath().getPath().toString());
		}
	}

}
