/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment;

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
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.FieldInstance#getFieldtype <em>Fieldtype</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getFieldInstance()
 * @model
 * @generated
 */
public interface FieldInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Fieldtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fieldtype</em>' reference.
	 * @see #setFieldtype(FieldType)
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getFieldInstance_Fieldtype()
	 * @model required="true"
	 * @generated
	 */
	FieldType getFieldtype();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.contentfragment.FieldInstance#getFieldtype <em>Fieldtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fieldtype</em>' reference.
	 * @see #getFieldtype()
	 * @generated
	 */
	void setFieldtype(FieldType value);

} // FieldInstance
