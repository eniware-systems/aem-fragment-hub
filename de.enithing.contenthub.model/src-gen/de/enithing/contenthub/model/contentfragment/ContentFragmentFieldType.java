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
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getId <em>Id</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getLabel <em>Label</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldType()
 * @model abstract="true"
 * @generated
 */
public interface ContentFragmentFieldType<TValue extends ContentFragmentFieldValue> extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldType_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentFieldType_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
