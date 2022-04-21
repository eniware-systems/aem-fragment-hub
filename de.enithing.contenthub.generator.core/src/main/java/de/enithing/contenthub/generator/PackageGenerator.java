package de.enithing.contenthub.generator;

import de.enithing.contenthub.generator.util.XmlUtils;
import de.enithing.contenthub.model.contenthub.Package;
import de.enithing.contenthub.model.contenthub.RootContext;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.vfs2.FileObject;
import org.apache.velocity.*;
import org.apache.velocity.runtime.parser.ParseException;

public class PackageGenerator implements TemplateBasedGenerator<Package> {
	public static class Context {
		public Context(FileObject jcrRoot) {
			this.jcrRoot = jcrRoot;
		}
		
		private FileObject jcrRoot;

		public FileObject getJcrRoot() {
			return jcrRoot;
		}
	}
		
	private GeneratorConfiguration config;

	public PackageGenerator(GeneratorConfiguration cfg) {
		this.config = cfg;
	}

	@Override
	public GeneratorConfiguration getConfig() {
		return config;
	}
	
	@Override
	public Path getTemplatesPath() {
		return Path.of("/package");
	}

	@Override
	public void onEnter(Package pkg) throws Exception {
		FileObject targetRoot = getConfig().targetRoot;
		
		// Create the jcr_root
		FileObject jcrRoot = targetRoot.resolveFile("jcr_root");
		jcrRoot.createFolder();
		
		// Write the root .content.xml file
		VelocityContext context = getTemplateContext(pkg);
		FileObject contentXml = jcrRoot.resolveFile(".content.xml");

		if (!contentXml.exists()) {
			// Create the .content.xml only if it does not exist
			contentXml.createFile();
			OutputStream os = contentXml.getContent().getOutputStream();
			Writer writer = XmlUtils.getPrettyPrintWriter(os);
			Template tpl = resolveTemplate(pkg, "jcr_root/.content.xml");
			tpl.merge(context, writer);
			os.flush();
			writer.close();
		}
		
		for (RootContext ctx : pkg.getContexts()) {
			GeneratorConfiguration childConfig = createChildConfig(pkg);
			childConfig.targetRoot = jcrRoot;
			ContextGenerator ctxGen = new ContextGenerator(childConfig);
			ctxGen.generate(ctx);
		}
	}

	@Override
	public void onExit(Package pkg) throws IOException, ParseException {	
		FileObject targetRoot = getConfig().targetRoot;

		VelocityContext context = getTemplateContext(pkg);
		
		// Create the META-INF directory
		FileObject metaInfDir = targetRoot.resolveFile("META-INF");
		metaInfDir.createFolder();

		{
			// Write the manifest
			String path = "META-INF/MANIFEST.MF";
			Template tpl = resolveTemplate(pkg, path);
			FileObject file = metaInfDir.resolveFile("MANIFEST.MF");
			file.createFile();
			OutputStream os = file.getContent().getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			tpl.merge(context, writer);
			writer.flush();
			os.close();
		}
		
		FileObject vaultDir = metaInfDir.resolveFile("vault");
		vaultDir.createFolder();

		{
			// Write filters.xml
			String path = "META-INF/vault/filter.xml";
			Template tpl = resolveTemplate(pkg, path);
			FileObject file = targetRoot.resolveFile(path);
			file.createFile();
			OutputStream os = file.getContent().getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			tpl.merge(context, writer);
			writer.flush();
			os.close();
		}
		
		{
			// Write config.xml
			String path = "META-INF/vault/config.xml";
			Template tpl = resolveTemplate(pkg, path);
			FileObject file = targetRoot.resolveFile(path);
			file.createFile();
			OutputStream os = file.getContent().getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			tpl.merge(context, writer);
			writer.flush();
			os.close();
		}
		
		{
			// Write nodetypes.cnd
			String path = "META-INF/vault/nodetypes.cnd";
			Template tpl = resolveTemplate(pkg, path);
			FileObject file = targetRoot.resolveFile(path);
			file.createFile();
			OutputStream os = file.getContent().getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			tpl.merge(context, writer);
			writer.flush();
			os.close();
		}
		
		{
			// Write nodetypes.cnd
			String path = "META-INF/vault/nodetypes.cnd";
			Template tpl = resolveTemplate(pkg, path);
			FileObject file = targetRoot.resolveFile(path);
			file.createFile();
			OutputStream os = file.getContent().getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			tpl.merge(getTemplateContext(pkg), writer);
			os.close();
		}
		
		{
			// Write properties.xml
			String path = "META-INF/vault/properties.xml";
			Template tpl = resolveTemplate(pkg, path);
			FileObject file = targetRoot.resolveFile(path);
			file.createFile();
			OutputStream os = file.getContent().getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			tpl.merge(context, writer);
			writer.flush();
			os.close();
		}
		
		FileObject definitionDir = vaultDir.resolveFile("definition");
		definitionDir.createFolder();
		
		{
			// Write definition file
			String path = "META-INF/vault/definition/.content.xml";
			Template tpl = resolveTemplate(pkg, path);
			FileObject file = targetRoot.resolveFile(path);
			file.createFile();
			OutputStream os = file.getContent().getOutputStream();
			PrintWriter writer = new PrintWriter(os);
			tpl.merge(context, writer);
			writer.flush();
			os.close();	
		}
	
	}

	@Override
	public void populateTemplateContext(Package pkg, VelocityContext ctx) throws ParseException {
		// Add the basic fields
		ctx.put("packageName", pkg.getName());
		ctx.put("packageGroup", pkg.getGroup());
		ctx.put("packageAuthor", pkg.getAuthor());
		ctx.put("packageDescription", pkg.getDescription());
		ctx.put("packageVersion", pkg.getVersion());
		ctx.put("packageCreator", "admin");
		
		// Generate the package filter list
		List<Path> packageFilterPaths = new ArrayList<>(Arrays.asList(Path.of("/content/dam/" + pkg.getName()),
				Path.of("/content/cq:graphql/" + pkg.getName()), Path.of("/conf/" + pkg.getName())));

		packageFilterPaths.addAll(pkg.getContexts().stream().map(rootContext -> rootContext.getRelativePath())
				.collect(Collectors.toList()));

		packageFilterPaths = packageFilterPaths.stream()
				.distinct()
				.map(p -> VelocityUtils.replace(p, ctx))
				.filter(p -> p != null)
				.sorted().toList();

		List<String> packageRoots = packageFilterPaths.stream().map(p -> PathUtils.getRootLeaf(p).toString()).distinct()
				.collect(Collectors.toList());
		List<String> packageFilters = packageFilterPaths.stream().map(p -> p.toString()).collect(Collectors.toList());

		ctx.put("packageRoots", packageRoots);
		ctx.put("packageFilters", packageFilters);
		
		Date packageDate = Date.from(Instant.now());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		ctx.put("packageDate", format.format(packageDate));
	}
}
