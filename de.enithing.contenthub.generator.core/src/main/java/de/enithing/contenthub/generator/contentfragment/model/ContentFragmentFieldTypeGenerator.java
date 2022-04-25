package de.enithing.contenthub.generator.contentfragment.model;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.TemplateBasedGenerator;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.contenthub.generator.util.StringUtils;
import de.enithing.contenthub.generator.util.VelocityUtils;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;

public abstract class ContentFragmentFieldTypeGenerator<TField extends ContentFragmentFieldType<?>>
		implements TemplateBasedGenerator<TField> {
	private GeneratorConfiguration config;

	public ContentFragmentFieldTypeGenerator(GeneratorConfiguration cfg) {
		this.config = cfg;
	}

	private String renderedField;

	public String getRenderedField() {
		return renderedField;
	}

	@Override
	public void onEnter(TField field) throws Exception {
	}

	@Override
	public void onExit(TField field) throws Exception {
		String variant = getClass().getSimpleName().toLowerCase().replace("generator", "");

		Template tpl = resolveTemplate(field, "field", new String[] { "-" + variant });
		VelocityContext ctx = getTemplateContext(field);
		renderedField = VelocityUtils.renderTemplate(tpl, ctx);
	}

	@Override
	public Path getTemplatesPath() {
		return Path.of("cffield");
	}

	@Override
	public GeneratorConfiguration getConfig() {
		return config;
	}

	public abstract String getResourceType();

	public abstract String getValueType();

	public abstract String getMetaType();

	public abstract void populateAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs);

	public void populateGraniteAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) {
	}

	protected void populateDefaultGraniteAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("jcr:primaryType", "nt:unstructured");
	}

	protected void populateDefaultAttribs(TField element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("jcr:primaryType", "nt:unstructured");
		attribs.put("sling:resourceType", getResourceType());
		attribs.put("valueType", getValueType());
		attribs.put("metaType", getMetaType());
		attribs.put("listOrder", 1);
		attribs.put("fieldLabel", element.getFieldLabel());
		attribs.put("fieldDescription", element.getDescription());
		attribs.put("name", element.getPropertyName());
		attribs.put("showEmptyInReadOnly", true);
		attribs.put("renderReadOnly", false);
	}

	protected static void convertAttribs(Map<String, Object> attribs, Map<String, String> resultAttribs,
			Map<String, Map<String, String>> resultChildren) {

		for (Entry<String, Object> e : attribs.entrySet()) {
			if(e.getValue() == null) {
				continue;
			}
			resultAttribs.put(e.getKey(), JcrUtils.toStringValue(e.getValue()));
		}
	}

	@Override
	public void populateTemplateContext(TField element, VelocityContext ctx) throws IOException, ParseException {
		{
			Map<String, Object> attribs = new HashMap<>();

			populateDefaultAttribs(element, ctx, attribs);
			populateAttribs(element, ctx, attribs);

			Map<String, String> convertedAttribs = new HashMap<>();

			convertAttribs(attribs, convertedAttribs, null);

			ctx.put("attribs", convertedAttribs);
		}

		{
			Map<String, Object> attribs = new HashMap<>();

			populateDefaultGraniteAttribs(element, ctx, attribs);
			populateGraniteAttribs(element, ctx, attribs);

			Map<String, String> convertedAttribs = new HashMap<>();

			convertAttribs(attribs, convertedAttribs, null);

			ctx.put("graniteAttribs", convertedAttribs);
		}

		ctx.put("tagName", generateTagName());
	}

	private static String generateTagName() {
		return String.format("_x0031_%s", StringUtils.generateNumericId(12));
	}
}
