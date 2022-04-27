package de.enithing.contenthub.generator.contentfragment.model.field;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Set;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.Number;
import de.enithing.contenthub.model.contentfragment.corefields.validation.LowerBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.LowerUpperBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.UpperBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint;

public class NumberTypeGenerator extends ContentFragmentMultiFieldTypeGenerator<Number> {

	public NumberTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public void getSharedFieldAttribs(Set<String> attribs) {
		attribs.add("validation");
		attribs.add("typeHint");
	}

	@Override
	public void getSharedFieldGraniteAttribs(Set<String> attribs) {
		attribs.add("customErrorMsg");
		attribs.add("number-min");
		attribs.add("number-max");
	}

	@Override
	public String getMultiResourceType(Number unused) {
		return "granite/ui/components/coral/foundation/form/multifield";
	}

	@Override
	public String getResourceType(Number unused) {
		return "granite/ui/components/coral/foundation/form/numberfield";
	}

	@Override
	public String getValueType(Number num) {
		return num.getType().getLiteral();
	}

	@Override
	public String getMetaType(Number unused) {
		return "number";
	}

	@Override
	public void populateAttribs(Number element, VelocityContext ctx, Map<String, Object> attribs) {
		ctx.put("emptyText", element.getPlaceholder());
		ctx.put("required", JcrUtils.toFlag(element.isRequired()));
		ctx.put("typeHint", element.getType());
		ctx.put("step", "any");

		ValidationConstraint<BigDecimal> validation = element.getValidationConstraint();

		ctx.put("validation", JcrUtils.getValidationAttrib("cfm.validation.number.", validation));
	}

	@Override
	public void populateGraniteAttribs(Number element, VelocityContext ctx, Map<String, Object> attribs) {
		ValidationConstraint<BigDecimal> validation = element.getValidationConstraint();

		if (validation instanceof LowerBoundConstraint<BigDecimal>) {
			LowerBoundConstraint<BigDecimal> constraint = (LowerBoundConstraint<BigDecimal>) validation;
			attribs.put("number-min", constraint.getMin());
		}

		if (validation instanceof UpperBoundConstraint<BigDecimal>) {
			UpperBoundConstraint<BigDecimal> constraint = (UpperBoundConstraint<BigDecimal>) validation;
			attribs.put("number-max", constraint.getMax());
		}
	}

}
