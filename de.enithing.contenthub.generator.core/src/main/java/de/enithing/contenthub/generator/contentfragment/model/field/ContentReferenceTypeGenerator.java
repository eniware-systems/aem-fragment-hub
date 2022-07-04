package de.enithing.contenthub.generator.contentfragment.model.field;

import java.math.BigInteger;
import java.util.Map;
import java.util.Set;

import org.apache.velocity.VelocityContext;

import de.enithing.contenthub.generator.GeneratorConfiguration;
import de.enithing.contenthub.generator.util.JcrUtils;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeValue;
import de.enithing.contenthub.model.contentfragment.corefields.validation.LowerBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.LowerUpperBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.UpperBoundConstraint;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint;

public class ContentReferenceTypeGenerator extends ContentFragmentMultiFieldTypeGenerator<ContentReference> {

	public ContentReferenceTypeGenerator(GeneratorConfiguration cfg) {
		super(cfg);
	}

	@Override
	public String getResourceType(ContentReference unused) {
		return "dam/cfm/models/editor/components/contentreference";
	}

	@Override
	public String getMultiResourceType(ContentReference unused) {
		return "granite/ui/components/coral/foundation/form/multifield";
	}

	@Override
	public String getValueType(ContentReference unused) {
		return "string/reference";
	}

	@Override
	public String getMetaType(ContentReference unused) {
		return "reference";
	}

	@Override
	public void populateAttribs(ContentReference element, VelocityContext ctx, Map<String, Object> attribs) {
		attribs.put("filter", "hierarchy");

		attribs.put("emptyText", element.getPlaceholder());
		attribs.put("required", JcrUtils.toFlag(element.isRequired()));

		attribs.put("showThumbnail", element.isShowThumbnail());
		attribs.put("validation", element.getAllowedContentTypes());
	}

	@Override
	public void populateGraniteAttribs(ContentReference element, VelocityContext ctx, Map<String, Object> attribs) {
		ValidationConstraint<FileSizeValue> fileSize = element.getFileSizeValidationConstraint();

		if (fileSize instanceof LowerBoundConstraint<FileSizeValue>) {
			LowerBoundConstraint<FileSizeValue> constraint = (LowerBoundConstraint<FileSizeValue>) fileSize;
			attribs.put("filesize-min", constraint.getMin().getValue());
			attribs.put("filesize-minunit", constraint.getMin().getUnit());
		}

		if (fileSize instanceof UpperBoundConstraint<FileSizeValue>) {
			UpperBoundConstraint<FileSizeValue> constraint = (UpperBoundConstraint<FileSizeValue>) fileSize;
			attribs.put("filesize-max", constraint.getMax().getValue());
			attribs.put("filesize-maxunit", constraint.getMax().getUnit());
		}

		attribs.put("filesize-validation", JcrUtils.getValidationAttrib("cfm.validation.filesize.", fileSize));

		ValidationConstraint<BigInteger> imageWidth = element.getImageWidthConstraint();

		if (imageWidth instanceof LowerBoundConstraint<BigInteger>) {
			LowerBoundConstraint<BigInteger> constraint = (LowerBoundConstraint<BigInteger>) imageWidth;
			attribs.put("imagewidth-min", constraint.getMin());
		}

		if (imageWidth instanceof UpperBoundConstraint<BigInteger>) {
			UpperBoundConstraint<BigInteger> constraint = (UpperBoundConstraint<BigInteger>) imageWidth;
			attribs.put("imagewidth-max", constraint.getMax());
		}

		attribs.put("imagewidth-validation", JcrUtils.getValidationAttrib("cfm.validation.imagewidth.", imageWidth));

		ValidationConstraint<BigInteger> imageHeight = element.getImageHeightConstraint();

		if (imageHeight instanceof LowerBoundConstraint<BigInteger>) {
			LowerBoundConstraint<BigInteger> constraint = (LowerBoundConstraint<BigInteger>) imageHeight;
			attribs.put("imageheight-min", constraint.getMin());
		}

		if (imageHeight instanceof UpperBoundConstraint<BigInteger>) {
			UpperBoundConstraint<BigInteger> constraint = (UpperBoundConstraint<BigInteger>) imageHeight;
			attribs.put("imageheight-max", constraint.getMax());
		}

		attribs.put("imageheight-validation", JcrUtils.getValidationAttrib("cfm.validation.imageheight.", imageHeight));

		attribs.put("showThumbnail", element.isShowThumbnail());
		attribs.put("thumbnail-validation", "cfm.validation.thumbnail.show");
	}

	@Override
	public void getSharedFieldAttribs(Set<String> attribs) {
	}

	@Override
	public void getSharedFieldGraniteAttribs(Set<String> attribs) {
		attribs.add("thumbnail-validation");
	}

}
