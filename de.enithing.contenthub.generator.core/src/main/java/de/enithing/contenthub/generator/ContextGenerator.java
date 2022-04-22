package de.enithing.contenthub.generator;

import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.vfs2.FileObject;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.contenthub.generator.util.XmlUtils;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextType;

public class ContextGenerator implements TemplateBasedGenerator<Context> {
	private GeneratorConfiguration config;

	public ContextGenerator(GeneratorConfiguration cfg) {
		this.config = cfg;
	}

	@Override
	public GeneratorConfiguration getConfig() {
		return config;
	}

	@Override
	public Path getTemplatesPath() {
		return Path.of("/context");
	}

	@Override
	public void onEnter(Context ctx) throws Exception {
		FileObject targetRoot;
		Template tpl = resolveTemplate(ctx, ".content.xml");

		if (ctx.getParentContext() != null) {
			VelocityContext templateContext = getTemplateContext(ctx);

			// Replace the variables used in the path
			String subFolder = VelocityUtils.replace(ctx.getName(), templateContext);
			targetRoot = getConfig().targetRoot.resolveFile(subFolder);

			if (targetRoot.exists()) {
				// Clean up
				targetRoot.deleteAll();
			}

			targetRoot.createFolder();
		} else {
			targetRoot = getConfig().targetRoot;
		}

		VelocityContext templateCtx = getTemplateContext(ctx);

		templateCtx.put("contextTitle", ctx.getTitle());
		templateCtx.put("contextPrimaryType", ctx.getPrimaryType());

		final FileObject contentXml = targetRoot.resolveFile(".content.xml");
		contentXml.createFile();

		OutputStream os = contentXml.getContent().getOutputStream();
		Writer writer = XmlUtils.getPrettyPrintWriter(os);
		tpl.merge(templateCtx, writer);
		os.flush();
		writer.close();
	}

	@Override
	public void onExit(Context ctx) throws Exception {
		VelocityContext templateContext = getTemplateContext(ctx);

		// Replace the variables used in the path
		String subFolder = VelocityUtils.replace(ctx.getName(), templateContext);
		final FileObject targetRoot = getConfig().targetRoot.resolveFile(subFolder);

		// Write the content fragments
		for (ContentFragmentInstance cf : ctx.getContentFragments()) {
			GeneratorConfiguration childConfig = createChildConfig(ctx);
			childConfig.targetRoot = targetRoot;

			ContentFragmentGenerator cfGen = new ContentFragmentGenerator(childConfig);
			cfGen.generate(cf);
		}

		// Write the child contexts
		for (Context child : ctx.getChildContexts()) {
			GeneratorConfiguration childConfig = createChildConfig(ctx);
			childConfig.targetRoot = targetRoot;

			ContextGenerator childGenerator = new ContextGenerator(childConfig);
			childGenerator.generate(child);
		}
	}

	@Override
	public void populateTemplateContext(Context ctx, VelocityContext templateCtx) {
	}
}
