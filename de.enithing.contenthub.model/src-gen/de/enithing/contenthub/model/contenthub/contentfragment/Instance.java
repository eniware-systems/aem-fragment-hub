/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.Instance#getModel <em>Model</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.Instance#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getInstance_Model()
	 * @model required="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.contentfragment.Instance#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contenthub.contentfragment.FieldInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getInstance_Fields()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<FieldInstance> getFields();

} // Instance
