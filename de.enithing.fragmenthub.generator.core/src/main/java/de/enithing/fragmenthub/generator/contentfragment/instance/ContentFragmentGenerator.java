package de.enithing.fragmenthub.generator.contentfragment.instance;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Path;
import java.util.logging.Logger;

import org.apache.commons.vfs2.FileObject;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.TemplateBasedGenerator;
import de.enithing.fragmenthub.generator.contentfragment.model.ContentFragmentFieldTypeGenerator;
import de.enithing.fragmenthub.generator.util.JcrUtils;
import de.enithing.fragmenthub.generator.util.StringUtils;
import de.enithing.fragmenthub.generator.util.VelocityUtils;
import de.enithing.fragmenthub.generator.util.XmlUtils;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;

public class ContentFragmentGenerator implements TemplateBasedGenerator<ContentFragmentInstance> {

	private final GeneratorConfiguration config;

	public ContentFragmentGenerator(GeneratorConfiguration cfg) {
		this.config = cfg;
	}

	@Override
	public GeneratorConfiguration getConfig() {
		return config;
	}

	@Override
	public Path getTemplatesPath() {
		return Path.of("/cfinstance");
	}

	private static String generateUuid(ContentFragmentInstance cf) {
		return String.format("%s-%s-%s-%s-%s", StringUtils.generateHexId(8), StringUtils.generateHexId(4),
				StringUtils.generateHexId(4), StringUtils.generateHexId(4), StringUtils.generateHexId(12));
	}

	@Override
	public void onEnter(ContentFragmentInstance cf) throws Exception {
		VelocityContext ctx = getTemplateContext(cf);

		ctx.put("fragmentUuid", generateUuid(cf));
		ctx.put("fragmentParentPath", VelocityUtils.replace(cf.getContext().getPath(), ctx));
		ctx.put("fragmentName", JcrUtils.toStringValue(cf.getId()));
		ctx.put("fragmentTitle", JcrUtils.toStringValue(cf.getTitle()));
		ctx.put("fragmentDescription", JcrUtils.toStringValue(cf.getDescription()));
		ctx.put("fragmentModel", VelocityUtils.replace(cf.getModel().getPath(), ctx));

		FileObject targetRoot = getConfig().targetRoot.resolveFile(cf.getId());

		if (targetRoot.exists()) {
			// Make sure the folder is empty by deleting it first
			targetRoot.deleteAll();
		}

		targetRoot.createFolder();

		String renderedFields = "";

		for (ContentFragmentFieldInstance field : cf.getFields()) {
			GeneratorConfiguration childConfig = createChildConfig(cf);

			ContentFragmentFieldInstanceGenerator<?> generator = getConfig().getFieldGeneratorRegistry()
					.createInstanceGeneratorInstance(field.getFieldtype(), childConfig);

			if (generator == null) {
				continue;
			}

			generator.generate(field);

			String xml = generator.getRenderedField();
			renderedFields += xml;
		}

		ctx.put("renderedFields", renderedFields);

		// Create the _jcr_content folder
		FileObject f = targetRoot.resolveFile("_jcr_content");
		f.createFolder();

		f = f.resolveFile("renditions");
		f.createFolder();

		Template tpl = resolveTemplate(cf, ".content.xml");

		FileObject file = targetRoot.resolveFile(".content.xml");
		file.createFile();
		OutputStream os = file.getContent().getOutputStream();
		Writer writer = XmlUtils.getPrettyPrintWriter(os);

		tpl.merge(ctx, writer);
		writer.flush();
		writer.close();
	}

	@Override
	public void onExit(ContentFragmentInstance cf) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void populateTemplateContext(ContentFragmentInstance cf, VelocityContext ctx)
			throws IOException, ParseException {
		// TODO Auto-generated method stub

	}

	private static final Logger logger = Logger.getLogger(ContentFragmentGenerator.class.getSimpleName());

	@Override
	public Logger getLogger() {
		return logger;
	}

}
