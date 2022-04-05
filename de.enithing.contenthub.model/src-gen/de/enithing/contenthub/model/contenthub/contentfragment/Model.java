/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.Model#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contenthub.contentfragment.FieldType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#getModel_Fields()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<FieldType> getFields();

} // Model
