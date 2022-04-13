package de.enithing.contenthub.model.contentfragment.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;

/**
 * Factory implementation that creates extended implementations
 */
public class ContentFragmentFactoryExtendedImpl extends ContentFragmentFactoryImpl {
	@Override
	public ContentFragmentModel createContentFragmentModel() {
		return new ContentFragmentModelExtendedImpl();
	}
	
	@Override
	public ContentFragmentFieldInstance createContentFragmentFieldInstance() {
		return new ContentFragmentFieldInstanceExtendedImpl();
	}
}
