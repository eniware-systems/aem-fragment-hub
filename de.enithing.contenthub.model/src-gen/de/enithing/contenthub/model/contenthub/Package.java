/**
 */
package de.enithing.contenthub.model.contenthub;

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
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getGroup <em>Group</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"my.content"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_Name()
	 * @model default="my.content" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * The default value is <code>"de.enithing"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_Group()
	 * @model default="de.enithing" required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The default value is <code>"A new package"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_Description()
	 * @model default="A new package" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * The default value is <code>"admin"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_Author()
	 * @model default="admin" required="true"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"1.0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_Version()
	 * @model default="1.0.0" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

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

} // Package
