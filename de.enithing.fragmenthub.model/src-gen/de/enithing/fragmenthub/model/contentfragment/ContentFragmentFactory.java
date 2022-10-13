/**
 */
package de.enithing.fragmenthub.model.contentfragment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage
 * @generated
 */
public interface ContentFragmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentFragmentFactory eINSTANCE = de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Set</em>'.
	 * @generated
	 */
	ContentFragmentModelSet createContentFragmentModelSet();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	ContentFragmentModel createContentFragmentModel();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	ContentFragmentInstance createContentFragmentInstance();

	/**
	 * Returns a new object of class '<em>Field Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Instance</em>'.
	 * @generated
	 */
	ContentFragmentFieldInstance createContentFragmentFieldInstance();

	/**
	 * Returns a new object of class '<em>Allowed Content Fragment Model Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowed Content Fragment Model Policy</em>'.
	 * @generated
	 */
	AllowedContentFragmentModelPolicy createAllowedContentFragmentModelPolicy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContentFragmentPackage getContentFragmentPackage();

} //ContentFragmentFactory
