/**
 */
package de.enithing.contenthub.model.contentfragment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getFieldLabel <em>Field Label</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldType()
 * @model abstract="true"
 * @generated
 */
public interface ContentFragmentFieldType<TValue extends ContentFragmentFieldValue> extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldType_PropertyName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Label</em>' attribute.
	 * @see #setFieldLabel(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldType_FieldLabel()
	 * @model required="true"
	 * @generated
	 */
	String getFieldLabel();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getFieldLabel <em>Field Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Label</em>' attribute.
	 * @see #getFieldLabel()
	 * @generated
	 */
	void setFieldLabel(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	TValue createEmptyValue();

} // ContentFragmentFieldType
