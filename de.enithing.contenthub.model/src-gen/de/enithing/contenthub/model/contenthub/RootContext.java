/**
 */
package de.enithing.contenthub.model.contenthub;

import java.nio.file.Path;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.RootContext#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.RootContext#getJcrRootPath <em>Jcr Root Path</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getRootContext()
 * @model
 * @generated
 */
public interface RootContext extends Context {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"my context"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getRootContext_Name()
	 * @model default="my context" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.RootContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jcr Root Path</b></em>' attribute.
	 * The default value is <code>"/jcr_root"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jcr Root Path</em>' attribute.
	 * @see #setJcrRootPath(Path)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getRootContext_JcrRootPath()
	 * @model default="/jcr_root" dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getJcrRootPath();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.RootContext#getJcrRootPath <em>Jcr Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jcr Root Path</em>' attribute.
	 * @see #getJcrRootPath()
	 * @generated
	 */
	void setJcrRootPath(Path value);

} // RootContext
