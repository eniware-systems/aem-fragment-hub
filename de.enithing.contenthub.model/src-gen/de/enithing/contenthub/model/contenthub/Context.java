/**
 */
package de.enithing.contenthub.model.contenthub;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
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
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getContentFragments <em>Content Fragments</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getPolicies <em>Policies</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getTitle <em>Title</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.Context#getPrimaryType <em>Primary Type</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contenthub.Context}.
	 * It is bidirectional and its opposite is '{@link de.enithing.contenthub.model.contenthub.Context#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Contexts</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_ChildContexts()
	 * @see de.enithing.contenthub.model.contenthub.Context#getParentContext
	 * @model opposite="parentContext" containment="true"
	 * @generated
	 */
	EList<Context> getChildContexts();

	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.enithing.contenthub.model.contenthub.Context#getChildContexts <em>Child Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' container reference.
	 * @see #setParentContext(Context)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_ParentContext()
	 * @see de.enithing.contenthub.model.contenthub.Context#getChildContexts
	 * @model opposite="childContexts" transient="false"
	 * @generated
	 */
	Context getParentContext();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Context#getParentContext <em>Parent Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' container reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(Context value);

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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"new_context"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_Name()
	 * @model default="new_context" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Context#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Primary Type</b></em>' attribute.
	 * The default value is <code>"sling:Folder"</code>.
	 * The literals are from the enumeration {@link de.enithing.contenthub.model.contenthub.ContextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Type</em>' attribute.
	 * @see de.enithing.contenthub.model.contenthub.ContextType
	 * @see #setPrimaryType(ContextType)
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#getContext_PrimaryType()
	 * @model default="sling:Folder" required="true"
	 * @generated
	 */
	ContextType getPrimaryType();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contenthub.Context#getPrimaryType <em>Primary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Type</em>' attribute.
	 * @see de.enithing.contenthub.model.contenthub.ContextType
	 * @see #getPrimaryType()
	 * @generated
	 */
	void setPrimaryType(ContextType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Context getRootContext();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<TPolicy extends ContextPolicy> EList<TPolicy> getPoliciesByType(Class<TPolicy> clazz);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getPath();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	de.enithing.contenthub.model.contenthub.Package getPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model patternDataType="de.enithing.contenthub.model.contenthub.Path" patternRequired="true"
	 * @generated
	 */
	EList<Context> resolveContextsByPattern(Path pattern);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model patternDataType="de.enithing.contenthub.model.contenthub.Path" patternRequired="true"
	 * @generated
	 */
	EList<ContentFragmentInstance> resolveContentFragmentInstancesByPattern(Path pattern);

} // Context
