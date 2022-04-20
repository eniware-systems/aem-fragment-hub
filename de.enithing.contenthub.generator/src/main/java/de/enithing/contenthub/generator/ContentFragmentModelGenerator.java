package de.enithing.contenthub.generator;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;

import org.apache.commons.vfs2.FileObject;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;

public class ContentFragmentModelGenerator implements TemplateBasedGenerator<ContentFragmentModel> {
	
	private GeneratorConfiguration config;

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
		
		Path modelPath = VelocityUtils.replace(ContextUtils.getJcrPath(mdl.getContext(), true), ctx);
		ctx.put("scaffolding", modelPath.toString());
		ctx.put("title", mdl.getTitle());
				
		ContentFragmentFieldGeneratorRegistry fieldGeneratorRegistry = getConfig().getFieldGeneratorRegistry();
		
		String renderedFields = "";
		
		for(ContentFragmentFieldType<?> field : mdl.getFields()) {
			GeneratorConfiguration childConfig = createChildConfig(mdl);					
			@SuppressWarnings("unchecked")
			ContentFragmentFieldGenerator<ContentFragmentFieldType<?>> generator = (ContentFragmentFieldGenerator<ContentFragmentFieldType<?>>) fieldGeneratorRegistry.createGeneratorInstance(field, childConfig);
			
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
		PrintWriter writer = new PrintWriter(os);
		tpl.merge(ctx, writer);
		writer.flush();
	}

	@Override
	public void onExit(ContentFragmentModel mdl) {
		
	}

	@Override
	public void populateTemplateContext(ContentFragmentModel mdl, VelocityContext ctx) {
		

	}

}
