/**
 */
package de.enithing.contenthub.model.contenthub;

import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModelSet;
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
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getGroup <em>Group</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getTitle <em>Title</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getDescription <em>Description</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getContentFragmentModelSets <em>Content Fragment Model Sets</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getContentRoot <em>Content Root</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getContentFragmentModelPath <em>Content Fragment Model Path</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Package#getContentPath <em>Content Path</em>}</li>
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
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"My Content"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_Title()
	 * @model default="My Content" required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

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
	 * Returns the value of the '<em><b>Content Fragment Model Sets</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contentfragment.ContentFragmentModelSet}.
	 * It is bidirectional and its opposite is '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModelSet#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Fragment Model Sets</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_ContentFragmentModelSets()
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModelSet#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<ContentFragmentModelSet> getContentFragmentModelSets();

	/**
	 * Returns the value of the '<em><b>Content Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Root</em>' containment reference.
	 * @see #setContentRoot(Context)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_ContentRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Context getContentRoot();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getContentRoot <em>Content Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Root</em>' containment reference.
	 * @see #getContentRoot()
	 * @generated
	 */
	void setContentRoot(Context value);

	/**
	 * Returns the value of the '<em><b>Content Fragment Model Path</b></em>' attribute.
	 * The default value is <code>"/conf/$packageName/settings/dam/cfm/models"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Fragment Model Path</em>' attribute.
	 * @see #setContentFragmentModelPath(Path)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_ContentFragmentModelPath()
	 * @model default="/conf/$packageName/settings/dam/cfm/models" dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getContentFragmentModelPath();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getContentFragmentModelPath <em>Content Fragment Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Fragment Model Path</em>' attribute.
	 * @see #getContentFragmentModelPath()
	 * @generated
	 */
	void setContentFragmentModelPath(Path value);

	/**
	 * Returns the value of the '<em><b>Content Path</b></em>' attribute.
	 * The default value is <code>"/content/dam/$packageName"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Path</em>' attribute.
	 * @see #setContentPath(Path)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getPackage_ContentPath()
	 * @model default="/content/dam/$packageName" dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getContentPath();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Package#getContentPath <em>Content Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Path</em>' attribute.
	 * @see #getContentPath()
	 * @generated
	 */
	void setContentPath(Path value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ContentFragmentModel> getAllContentFragmentModels();

} // Package
