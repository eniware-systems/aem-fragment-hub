package de.enithing.contenthub.generator.context;

import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.vfs2.FileObject;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.TemplateBasedGenerator;
import de.enithing.contenthub.generator.contentfragment.instance.ContentFragmentGenerator;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.contenthub.generator.util.VelocityUtils;
import de.enithing.contenthub.generator.util.XmlUtils;
import de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPolicy;

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

	private String renderPolicy(Context ctx, ContextPolicy policy) throws Exception {
		final VelocityContext templateCtx = getTemplateContext(ctx);
		Template tpl = resolveTemplate(ctx, "policy.xml");

		StringWriter writer = new StringWriter();

		if (policy instanceof AllowedContentFragmentModelPolicy) {
			AllowedContentFragmentModelPolicy p = ((AllowedContentFragmentModelPolicy) policy);
			List<Path> paths = p.getModels().stream().map(mdl -> VelocityUtils.replace(mdl.getPath(), templateCtx))
					.collect(Collectors.toList());
			templateCtx.put("policyPaths", paths);
		} else {
			throw new NotImplementedException();
		}

		tpl.merge(templateCtx, writer);

		return writer.toString();
	}
	
	private FileObject getOrCreateTargetRoot(Context ctx, boolean deleteIfExists) throws Exception {
		FileObject targetRoot;

		if (ctx.getParentContext() != null) {
			VelocityContext templateContext = getTemplateContext(ctx);

			// Replace the variables used in the path
			String subFolder = VelocityUtils.replace(ctx.getName(), templateContext);
			targetRoot = getConfig().targetRoot.resolveFile(subFolder);

			if (deleteIfExists && targetRoot.exists()) {
				// Clean up
				targetRoot.deleteAll();
			}

			targetRoot.createFolder();
		} else {
			targetRoot = getConfig().targetRoot;
		}
		
		return targetRoot;
	}

	@Override
	public void onEnter(Context ctx) throws Exception {
		Template tpl = resolveTemplate(ctx, ".content.xml");

		FileObject targetRoot = getOrCreateTargetRoot(ctx, true);

		VelocityContext templateCtx = getTemplateContext(ctx);

		// Render the policies
		String renderedPolicies = "";
		for (ContextPolicy policy : ctx.getPolicies()) {
			renderedPolicies += renderPolicy(ctx, policy);
		}
		templateCtx.put("renderedPolicies", renderedPolicies);

		templateCtx.put("contextTitle", JcrUtils.toStringValue(ctx.getTitle()));
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
		FileObject targetRoot = getOrCreateTargetRoot(ctx, false);
		
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
