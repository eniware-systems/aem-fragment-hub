/**
 */
package de.enithing.contenthub.model.contenthub;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Fragments</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_ContentFragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentFragmentInstance> getContentFragments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	RootContext getRootContext();

} // Context
