/**
 */
package de.enithing.contenthub.model.contenthub;

import java.nio.file.Path;

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
 *   <li>{@link de.enithing.contenthub.model.contenthub.ChildContext#getRelativePath <em>Relative Path</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' attribute.
	 * The default value is <code>"/child"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' attribute.
	 * @see #setRelativePath(Path)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getChildContext_RelativePath()
	 * @model default="/child" dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getRelativePath();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.ChildContext#getRelativePath <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' attribute.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(Path value);

} // ChildContext
