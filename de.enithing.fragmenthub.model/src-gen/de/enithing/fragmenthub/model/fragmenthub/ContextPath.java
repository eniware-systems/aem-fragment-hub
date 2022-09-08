/**
 */
package de.enithing.fragmenthub.model.fragmenthub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.ContextPath#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage#getContextPath()
 * @model
 * @generated
 */
public interface ContextPath extends PathProvider {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage#getContextPath_Context()
	 * @model required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.fragmenthub.ContextPath#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // ContextPath
