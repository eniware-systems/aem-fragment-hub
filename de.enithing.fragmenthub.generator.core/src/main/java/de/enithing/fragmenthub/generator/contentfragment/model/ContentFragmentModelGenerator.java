package de.enithing.fragmenthub.generator.contentfragment.model;

import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Path;
import java.util.logging.Logger;

import de.enithing.fragmenthub.generator.util.StringUtils;
import org.apache.commons.vfs2.FileObject;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;

import de.enithing.fragmenthub.generator.GeneratorConfiguration;
import de.enithing.fragmenthub.generator.TemplateBasedGenerator;
import de.enithing.fragmenthub.generator.contentfragment.ContentFragmentFieldGeneratorRegistry;
import de.enithing.fragmenthub.generator.context.ContextGenerator;
import de.enithing.fragmenthub.generator.util.JcrUtils;
import de.enithing.fragmenthub.generator.util.VelocityUtils;
import de.enithing.fragmenthub.generator.util.XmlUtils;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.fragmenthub.util.ContextUtils;

public class ContentFragmentModelGenerator implements TemplateBasedGenerator<ContentFragmentModel> {

	private final GeneratorConfiguration config;

	public ContentFragmentModelGenerator(GeneratorConfiguration cfg) {
		this.config = cfg;
	}

	@Override
	public Path getTemplatesPath() {
		return Path.of("/cfmodel");
	}

	@Override
	public GeneratorConfiguration getConfig() {
		return config;
	}

	@Override
	public void onEnter(ContentFragmentModel mdl) throws Exception {
		VelocityContext ctx = getTemplateContext(mdl);

		Path modelPath = VelocityUtils.replace(mdl.getPath(), ctx);
		ctx.put("scaffolding", modelPath.toString());
		ctx.put("title", JcrUtils.toStringValue(mdl.getTitle()));
		ctx.put("graphQLApiName", StringUtils.toPascalCase(mdl.getId()));

		ContentFragmentFieldGeneratorRegistry fieldGeneratorRegistry = getConfig().getFieldGeneratorRegistry();

		String renderedFields = "";

		for (ContentFragmentFieldType<?> field : mdl.getFields()) {
			GeneratorConfiguration childConfig = createChildConfig(mdl);
			@SuppressWarnings("unchecked")
			ContentFragmentFieldTypeGenerator<ContentFragmentFieldType<?>> generator = (ContentFragmentFieldTypeGenerator<ContentFragmentFieldType<?>>) fieldGeneratorRegistry
					.createTypeGeneratorInstance(field, childConfig);

			if (generator == null) {
				// Skip ignored field
				continue;
			}

			generator.generate(field);

			String xml = generator.getRenderedField();
			renderedFields += xml;
		}

		ctx.put("renderedFields", renderedFields);

		FileObject targetRoot = getConfig().targetRoot;
		Template tpl = resolveTemplate(mdl, ".content.xml");

		FileObject file = targetRoot.resolveFile(".content.xml");
		file.createFile();
		OutputStream os = file.getContent().getOutputStream();
		Writer writer = XmlUtils.getPrettyPrintWriter(os);

		tpl.merge(ctx, writer);
		writer.flush();
		writer.close();
	}

	@Override
	public void onExit(ContentFragmentModel mdl) {
	}

	@Override
	public void populateTemplateContext(ContentFragmentModel mdl, VelocityContext ctx) {
	}

	private static final Logger logger = Logger.getLogger(ContentFragmentModelGenerator.class.getSimpleName());

	@Override
	public Logger getLogger() {
		return logger;
	}
}
