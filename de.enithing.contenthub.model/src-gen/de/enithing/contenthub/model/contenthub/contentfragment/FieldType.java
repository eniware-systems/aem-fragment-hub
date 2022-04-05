/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment;

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
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.FieldType#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.FieldType#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getFieldType()
 * @model abstract="true"
 * @generated
 */
public interface FieldType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getFieldType_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.contentfragment.FieldType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getFieldType_Model()
	 * @model
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.contentfragment.FieldType#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

} // FieldType
