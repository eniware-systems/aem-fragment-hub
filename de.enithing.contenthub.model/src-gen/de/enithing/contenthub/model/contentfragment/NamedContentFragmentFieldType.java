/**
 */
package de.enithing.contenthub.model.contentfragment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Content Fragment Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.NamedContentFragmentFieldType#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getNamedContentFragmentFieldType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NamedContentFragmentFieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getNamedContentFragmentFieldType_PropertyName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.NamedContentFragmentFieldType#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

} // NamedContentFragmentFieldType
