package de.enithing.fragmenthub.model.contentfragment.impl;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentFieldInstanceImpl;

/**
 * Extended implementation of the ContentFragmentFieldInstance type
 */
public class ContentFragmentFieldInstanceExtendedImpl extends ContentFragmentFieldInstanceImpl {
	public final static String valueTypeAttribute = "valueType";
	
	@SuppressWarnings("rawtypes")
	@Override
	public void setFieldtype(ContentFragmentFieldType newFieldtype) {
		super.setFieldtype(newFieldtype);
		
		ContentFragmentFieldValue newValue = newFieldtype.createEmptyValue();
		if(getValue() == null || getValue().getClass() != newValue.getClass()) {
			// Set the new value
			setValue(newValue);
			return;
		}
	}
}
