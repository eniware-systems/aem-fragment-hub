/**
 */
package de.enithing.contenthub.model.contenthub;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;

import java.nio.file.Path;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getContentFragmentModels <em>Content Fragment Models</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getContentFragments <em>Content Fragments</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getPolicies <em>Policies</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contenthub.ChildContext}.
	 * It is bidirectional and its opposite is '{@link de.enithing.contenthub.model.contenthub.ChildContext#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Contexts</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_ChildContexts()
	 * @see de.enithing.contenthub.model.contenthub.ChildContext#getParentContext
	 * @model opposite="parentContext" containment="true"
	 * @generated
	 */
	EList<ChildContext> getChildContexts();

	/**
	 * Returns the value of the '<em><b>Content Fragment Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel}.
	 * It is bidirectional and its opposite is '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Fragment Models</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_ContentFragmentModels()
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<ContentFragmentModel> getContentFragmentModels();

	/**
	 * Returns the value of the '<em><b>Content Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance}.
	 * It is bidirectional and its opposite is '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Fragments</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_ContentFragments()
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<ContentFragmentInstance> getContentFragments();

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contenthub.ContextPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_Policies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextPolicy> getPolicies();

	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' attribute.
	 * The default value is <code>"/child"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' attribute.
	 * @see #setRelativePath(Path)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_RelativePath()
	 * @model default="/child" dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getRelativePath();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Context#getRelativePath <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' attribute.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(Path value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Context#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	RootContext getRootContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Context> getRelatedContexts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<ContextPolicy> getRelatedPolicies();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getUnifiedTitle();

} // Context
