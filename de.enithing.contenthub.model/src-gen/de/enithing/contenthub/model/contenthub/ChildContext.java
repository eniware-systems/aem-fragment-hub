/**
 */
package de.enithing.contenthub.model.contenthub;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.ChildContext#getParentContext <em>Parent Context</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getChildContext()
 * @model
 * @generated
 */
public interface ChildContext extends Context {
	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.enithing.contenthub.model.contenthub.Context#getChildContexts <em>Child Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' container reference.
	 * @see #setParentContext(Context)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getChildContext_ParentContext()
	 * @see de.enithing.contenthub.model.contenthub.Context#getChildContexts
	 * @model opposite="childContexts" required="true" transient="false"
	 * @generated
	 */
	Context getParentContext();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.ChildContext#getParentContext <em>Parent Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' container reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(Context value);

} // ChildContext
