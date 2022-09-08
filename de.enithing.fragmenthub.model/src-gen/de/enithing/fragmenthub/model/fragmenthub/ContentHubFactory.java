/**
 */
package de.enithing.fragmenthub.model.fragmenthub;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contenthub.ContentHubPackage
 * @generated
 */
public interface ContentHubFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentHubFactory eINSTANCE = de.enithing.fragmenthub.model.fragmenthub.impl.ContentHubFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Path</em>'.
	 * @generated
	 */
	SimplePath createSimplePath();

	/**
	 * Returns a new object of class '<em>Context Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Path</em>'.
	 * @generated
	 */
	ContextPath createContextPath();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContentHubPackage getContentHubPackage();

} //ContentHubFactory
