package de.enithing.contenthub.generator;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.parser.ParseException;

import de.enithing.contenthub.generator.util.PathUtils;
import de.enithing.contenthub.generator.util.VelocityHelper;
import de.enithing.contenthub.generator.util.VelocityUtils;
import de.enithing.fragmenthub.model.fragmenthub.Package;

public interface TemplateBasedGenerator<T> extends Generator<T> {
	String TemplateUtilsKey = "util";

	void populateTemplateContext(T element, VelocityContext ctx) throws IOException, ParseException;

	default Path getTemplatesPath() {
		return Path.of("/");
	}

	default Path getTemplateBasePath(T element, String templateType) {
		return PathUtils.makeRelative(getTemplatesPath().resolve(templateType));
	}

	@SuppressWarnings("unchecked")
	default VelocityContext getTemplateContext(Object element, Class<?> elementClass)
			throws IOException, ParseException {
		return getTemplateContext((T) element);
	}

	default VelocityContext getTemplateContext(T element) throws IOException, ParseException {
		VelocityContext ctx;

		if (getConfig().parentGenerator instanceof TemplateBasedGenerator<?> parentGenerator) {
			ctx = parentGenerator.getTemplateContext(getConfig().parentElement, getConfig().parentElement.getClass());
		} else {
			ctx = new VelocityContext();
		}

		populateTemplateContext(element, ctx);

		ctx.put(TemplateUtilsKey, new VelocityHelper());

		return ctx;
	}
	
	default Template resolveTemplate(T element) {
		return resolveTemplate(element, StringUtils.EMPTY);
	}

	default Template resolveTemplate(T element, String templateType) {
		return resolveTemplate(element, templateType, new String[] {});
	}

	default Template resolveTemplate(T element, String templateType, String[] metaTypes) {
		Path templateRoot = Path.of("templates");
		Path basePath = templateRoot.resolve(PathUtils.makeRelative(getTemplateBasePath(element, templateType)));

		String suffix = ".vm";

		List<String> templatesToTest = new ArrayList<String>();

		templatesToTest.add(basePath + suffix);

		for (String metaType : metaTypes) {
			templatesToTest.add(basePath + metaType + suffix);
		}

		VelocityUtils.initVelocity();

		for (int i = templatesToTest.size() - 1; i >= 0; --i) {
			String tpl = templatesToTest.get(i);

			// Todo: Remove this once we get this from any other place than the classpath,
			// this just suppresses errors in stdout
			if (this.getClass().getResource("/" + tpl) == null) {
				continue;
			}

			try {
				return Velocity.getTemplate(tpl);
			} catch (ResourceNotFoundException e) {
				// Not found, ignore.
			}
		}

		return null;

	}
}
