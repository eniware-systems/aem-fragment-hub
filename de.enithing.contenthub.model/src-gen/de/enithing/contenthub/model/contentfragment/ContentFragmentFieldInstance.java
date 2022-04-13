/**
 */
package de.enithing.contenthub.model.contentfragment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance#getFieldtype <em>Fieldtype</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldInstance()
 * @model
 * @generated
 */
public interface ContentFragmentFieldInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Fieldtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldtype</em>' reference.
	 * @see #setFieldtype(ContentFragmentFieldType)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldInstance_Fieldtype()
	 * @model required="true"
	 * @generated
	 */
	ContentFragmentFieldType getFieldtype();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance#getFieldtype <em>Fieldtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fieldtype</em>' reference.
	 * @see #getFieldtype()
	 * @generated
	 */
	void setFieldtype(ContentFragmentFieldType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ContentFragmentFieldValue)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldInstance_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContentFragmentFieldValue getValue();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ContentFragmentFieldValue value);

} // ContentFragmentFieldInstance
