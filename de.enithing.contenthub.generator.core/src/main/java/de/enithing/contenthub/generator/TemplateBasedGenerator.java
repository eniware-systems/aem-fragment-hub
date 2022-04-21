package de.enithing.contenthub.generator;

import java.io.IOException;
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

import de.enithing.contenthub.model.contenthub.Package;

public interface TemplateBasedGenerator<T> extends Generator<T> {
	public static final String TemplateUtilsKey = "util";

	public void populateTemplateContext(T element, VelocityContext ctx) throws IOException, ParseException;

	default public Path getTemplatesPath() {
		return Path.of("/");
	}

	default public Path getTemplateBasePath(T element, String templateType) {
		return PathUtils.makeRelative(getTemplatesPath().resolve(templateType));
	}

	@SuppressWarnings("unchecked")
	default public VelocityContext getTemplateContext(Object element, Class<?> elementClass)
			throws IOException, ParseException {
		return getTemplateContext((T) element);
	}

	default public VelocityContext getTemplateContext(T element) throws IOException, ParseException {
		VelocityContext ctx;

		if (getConfig().parentGenerator instanceof TemplateBasedGenerator<?>) {
			TemplateBasedGenerator<?> parentGenerator = (TemplateBasedGenerator<?>) getConfig().parentGenerator;
			ctx = parentGenerator.getTemplateContext(getConfig().parentElement, getConfig().parentElement.getClass());
		} else {
			ctx = new VelocityContext();
		}

		populateTemplateContext(element, ctx);

		ctx.put(TemplateUtilsKey, new VelocityHelper());

		return ctx;
	}

	default public Template resolveTemplate(T element) {
		return resolveTemplate(element, StringUtils.EMPTY);
	}

	default public Template resolveTemplate(T element, String templateType) {
		return resolveTemplate(element, templateType, new String[] {});
	}

	default public Template resolveTemplate(T element, String templateType, String[] metaTypes) {
		Path templateRoot = Path.of("templates");
		Path basePath = templateRoot.resolve(PathUtils.makeRelative(getTemplateBasePath(element, templateType)));

		String suffix = ".vm";

		List<String> templatesToTest = new ArrayList<String>();

		templatesToTest.add(basePath.toString() + suffix);

		for (String metaType : metaTypes) {
			templatesToTest.add(basePath.toString() + metaType + suffix);
		}

		VelocityUtils.initVelocity();

		for (int i = templatesToTest.size() - 1; i >= 0; --i) {
			String tpl = templatesToTest.get(i);
			try {
				return Velocity.getTemplate(tpl);
			} catch (ResourceNotFoundException e) {
				// Not found, ignore.
			}
		}

		return null;

	}
}
