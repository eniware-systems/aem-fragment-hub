/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption#getKey <em>Key</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getEnumerationOption()
 * @model
 * @generated
 */
public interface EnumerationOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getEnumerationOption_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage#getEnumerationOption_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // EnumerationOption
