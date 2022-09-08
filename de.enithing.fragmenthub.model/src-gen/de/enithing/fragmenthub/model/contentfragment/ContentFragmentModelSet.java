/**
 */
package de.enithing.fragmenthub.model.contentfragment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentModelSet#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentModelSet#getModels <em>Models</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentModelSet#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentModelSet()
 * @model
 * @generated
 */
public interface ContentFragmentModelSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentModelSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentModelSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel}.
	 * It is bidirectional and its opposite is '{@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel#getModelSet <em>Model Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentModelSet_Models()
	 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel#getModelSet
	 * @model opposite="modelSet" containment="true"
	 * @generated
	 */
	EList<ContentFragmentModel> getModels();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.enithing.fragmenthub.model.contenthub.Package#getContentFragmentModelSets <em>Content Fragment Model Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(de.enithing.fragmenthub.model.contenthub.Package)
	 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#getContentFragmentModelSet_Package()
	 * @see de.enithing.fragmenthub.model.contenthub.Package#getContentFragmentModelSets
	 * @model opposite="contentFragmentModelSets" required="true" transient="false"
	 * @generated
	 */
	de.enithing.fragmenthub.model.fragmenthub.Package getPackage();

	/**
	 * Sets the value of the '{@link de.enithing.fragmenthub.model.contentfragment.ContentFragmentModelSet#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(de.enithing.fragmenthub.model.fragmenthub.Package value);

} // ContentFragmentModelSet
