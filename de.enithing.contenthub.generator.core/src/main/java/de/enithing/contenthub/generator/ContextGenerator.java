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
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.ChildContext;
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
		String title = ctx.getUnifiedTitle();

		VelocityContext templateContext = getTemplateContext(ctx);

		// Replace the variables used in the path
		final Path relativePath = PathUtils.makeRelative(VelocityUtils.replace(ctx.getRelativePath(), templateContext));

		final FileObject targetRoot = getConfig().targetRoot;
		FileObject current = targetRoot;

		final FileObject finalTargetRoot = targetRoot.resolveFile(relativePath.toString());

		Template tpl = resolveTemplate(ctx, ".content.xml");

		for (Path p : relativePath) {
			current = current.resolveFile(p.toString());
			current.createFolder();

			VelocityContext templateCtx = getTemplateContext(ctx);

			FileObject contentXml = current.resolveFile(".content.xml");

			if (current.equals(finalTargetRoot)) {
				// This is the final folder				
				if (StringUtils.isNotEmpty(title)) {
					templateCtx.put("contextTitle", title);
				}

				templateCtx.put("contextPrimaryType", ctx.getUnifiedPrimaryType());
				
			} else {
				templateCtx.put("contextPrimaryType", ContextType.FOLDER.getLiteral());
			}

			if (!contentXml.exists()) {
				// Create the .content.xml only if it does not exist
				contentXml.createFile();
				OutputStream os = contentXml.getContent().getOutputStream();
				Writer writer = XmlUtils.getPrettyPrintWriter(os);
				tpl.merge(templateCtx, writer);
				os.flush();
				writer.close();
			}
		}

		for (ChildContext child : ctx.getChildContexts()) {
			GeneratorConfiguration childConfig = createChildConfig(ctx);
			childConfig.targetRoot = current;

			ContextGenerator childGenerator = new ContextGenerator(childConfig);
			childGenerator.generate(child);
		}

		for (ContentFragmentModel mdl : ctx.getContentFragmentModels()) {
			FileObject dir = current.resolveFile(mdl.getId());
			dir.createFolder();

			GeneratorConfiguration childConfig = createChildConfig(ctx);
			childConfig.targetRoot = dir;

			ContentFragmentModelGenerator mdlGenerator = new ContentFragmentModelGenerator(childConfig);
			mdlGenerator.generate(mdl);
		}
	}

	@Override
	public void onExit(Context ctx) throws IOException {
	}

	@Override
	public void populateTemplateContext(Context ctx, VelocityContext templateCtx) {
	}
}
