/**
 */
package de.enithing.contenthub.model.contenthub;

import java.nio.file.Path;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getContexts <em>Contexts</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contenthub.RootContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<RootContext> getContexts();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(Path)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_Path()
	 * @model dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

} // Package
