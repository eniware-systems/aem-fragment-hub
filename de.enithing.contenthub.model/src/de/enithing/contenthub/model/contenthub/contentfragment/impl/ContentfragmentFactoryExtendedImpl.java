package de.enithing.contenthub.model.contenthub.contentfragment.impl;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentModel;

/**
 * Factory implementation that creates extended implementations
 */
public class ContentfragmentFactoryExtendedImpl extends ContentfragmentFactoryImpl {
	@Override
	public ContentFragmentModel createContentFragmentModel() {
		return new ContentFragmentModelExtendedImpl();
	}
	
	@Override
	public ContentFragmentFieldInstance createContentFragmentFieldInstance() {
		return new ContentFragmentFieldInstanceExtendedImpl();
	}
}
