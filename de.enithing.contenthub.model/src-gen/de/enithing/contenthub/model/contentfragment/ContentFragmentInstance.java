/**
 */
package de.enithing.contenthub.model.contentfragment;

import de.enithing.contenthub.model.contenthub.Context;
import java.nio.file.Path;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getId <em>Id</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getTitle <em>Title</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getDescription <em>Description</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getModel <em>Model</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getFields <em>Fields</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentInstance()
 * @model
 * @generated
 */
public interface ContentFragmentInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentInstance_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentInstance_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentInstance_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(ContentFragmentModel)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentInstance_Model()
	 * @model required="true"
	 * @generated
	 */
	ContentFragmentModel getModel();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ContentFragmentModel value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentInstance_Fields()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<ContentFragmentFieldInstance> getFields();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.enithing.contenthub.model.contenthub.Context#getContentFragments <em>Content Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Context)
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentInstance_Context()
	 * @see de.enithing.contenthub.model.contenthub.Context#getContentFragments
	 * @model opposite="contentFragments" required="true" transient="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="de.enithing.contenthub.model.contenthub.Path" required="true"
	 * @generated
	 */
	Path getPath();

} // ContentFragmentInstance
