package de.enithing.contenthub.generator.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Path;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.RuntimeServices;
import org.apache.velocity.runtime.RuntimeSingleton;
import org.apache.velocity.runtime.parser.ParseException;

/**
 * Utility functions for dealing with velocity templates
 * 
 * @author mvonkeil
 *
 */
public class VelocityUtils {
	private VelocityUtils() {

	}

	private static boolean initializedVelocity = false;

	/**
	 * Initializes the global velocity singleton
	 */
	public static void initVelocity() {
		if (initializedVelocity) {
			return;
		}

		initializedVelocity = true;

		final Properties p = new Properties();
		p.setProperty("resource.loader", "class");
		p.setProperty("class.resource.loader.class",
				"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		Velocity.init(p);
	}

	public static Template createTemplateFromString(String str) throws ParseException {
		initVelocity();

		RuntimeServices runtimeServices = RuntimeSingleton.getRuntimeServices();
		StringReader reader = new StringReader(str);
		Template template = new Template();
		template.setRuntimeServices(runtimeServices);
		template.setData(runtimeServices.parse(reader, "_"));
		template.initDocument();

		return template;
	}

	public static String renderTemplate(Template tpl, VelocityContext ctx) {
		StringWriter writer = new StringWriter();
		tpl.merge(ctx, writer);
		return writer.toString();
	}

	public static String replace(String str, VelocityContext ctx) {
		Template tpl;
		try {
			tpl = createTemplateFromString(str);
		} catch (ParseException e) {
			return str;
		}
		return renderTemplate(tpl, ctx);
	}

	public static Path replace(Path path, VelocityContext ctx) {
		return Path.of(replace(path.toString(), ctx));
	}
}
