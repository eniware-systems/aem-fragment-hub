/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue#isValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends ContentFragmentFieldValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getBooleanValue_Value()
	 * @model required="true"
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

} // BooleanValue
