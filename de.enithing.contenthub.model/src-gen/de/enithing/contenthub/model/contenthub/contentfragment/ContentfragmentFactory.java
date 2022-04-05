/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage
 * @generated
 */
public interface ContentfragmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentfragmentFactory eINSTANCE = de.enithing.contenthub.model.contenthub.contentfragment.impl.ContentfragmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Content Fragment Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Fragment Model</em>'.
	 * @generated
	 */
	ContentFragmentModel createContentFragmentModel();

	/**
	 * Returns a new object of class '<em>Content Fragment Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Fragment Instance</em>'.
	 * @generated
	 */
	ContentFragmentInstance createContentFragmentInstance();

	/**
	 * Returns a new object of class '<em>Content Fragment Field Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Fragment Field Instance</em>'.
	 * @generated
	 */
	ContentFragmentFieldInstance createContentFragmentFieldInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContentfragmentPackage getContentfragmentPackage();

} //ContentfragmentFactory
