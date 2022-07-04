package de.enithing.contenthub.generator.contentfragment.instance;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;
import org.eclipse.emf.ecore.EObject;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.TemplateBasedGenerator;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.contenthub.generator.util.VelocityUtils;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.Package;

public abstract class ContentFragmentFieldInstanceGenerator<TValue extends ContentFragmentFieldValue>
		implements TemplateBasedGenerator<ContentFragmentFieldInstance> {
	private GeneratorConfiguration config;
	private String renderedField;

	public ContentFragmentFieldInstanceGenerator(GeneratorConfiguration cfg) {
		this.config = cfg;
	}

	public String getRenderedField() {
		return renderedField;
	}

	@Override
	public GeneratorConfiguration getConfig() {
		return config;
	}

	@Override
	public Path getTemplatesPath() {
		return Path.of("cffield");
	}

	@Override
	public void onEnter(ContentFragmentFieldInstance element) throws Exception {
	}

	@Override
	public void onExit(ContentFragmentFieldInstance field) throws Exception {
		String variant = getClass().getSimpleName().toLowerCase().replace("generator", "");

		Template tpl = resolveTemplate(field, "instance", new String[] { "-" + variant });
		VelocityContext ctx = getTemplateContext(field);
		renderedField = VelocityUtils.renderTemplate(tpl, ctx);
	}

	private void populateDefaultAttribs(ContentFragmentFieldInstance element, TValue value, VelocityContext ctx,
			Map<String, Object> attribs) {
		attribs.put("_x0040_LastModified", Date.from(Instant.now()));
	}

	public abstract void populateAttribs(ContentFragmentFieldInstance element, TValue value, VelocityContext ctx,
			Map<String, Object> attribs);

	@Override
	public void populateTemplateContext(ContentFragmentFieldInstance element, VelocityContext ctx)
			throws IOException, ParseException {
		Map<String, Object> attribs = new HashMap<>();

		@SuppressWarnings("unchecked")
		TValue value = (TValue) element.getValue();

		populateDefaultAttribs(element, value, ctx, attribs);

		ctx.put("name", element.getFieldtype().getPropertyName());

		populateAttribs(element, value, ctx, attribs);

		// Prefix and store the attributes
		String prefix = element.getFieldtype().getPropertyName();
		Map<String, String> prefixedAttribs = new HashMap<>();

		for (Entry<String, Object> entry : attribs.entrySet()) {
			prefixedAttribs.put(String.format("%s%s", prefix, entry.getKey()),
					JcrUtils.toStringValue(entry.getValue()));
		}

		ctx.put("field", prefixedAttribs);
	}

	private static Logger logger = Logger.getLogger(ContentFragmentFieldInstanceGenerator.class.getSimpleName());

	@Override
	public Logger getLogger() {
		return logger;
	}
}
