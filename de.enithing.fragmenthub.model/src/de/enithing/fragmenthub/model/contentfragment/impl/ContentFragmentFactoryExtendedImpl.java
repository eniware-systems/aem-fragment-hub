package de.enithing.fragmenthub.model.contentfragment.impl;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentFactoryImpl;

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

	@Override
	public ContentFragmentInstance createContentFragmentInstance() {
		return new ContentFragmentInstanceExtendedImpl();
	}
}
