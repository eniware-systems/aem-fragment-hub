/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage
 * @generated
 */
public interface CorefieldsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorefieldsFactory eINSTANCE = de.enithing.contenthub.model.contenthub.contentfragment.corefields.impl.CorefieldsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single Line Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Line Text</em>'.
	 * @generated
	 */
	SingleLineText createSingleLineText();

	/**
	 * Returns a new object of class '<em>Single Line Text Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Line Text Value</em>'.
	 * @generated
	 */
	SingleLineTextValue createSingleLineTextValue();

	/**
	 * Returns a new object of class '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab</em>'.
	 * @generated
	 */
	Tab createTab();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorefieldsPackage getCorefieldsPackage();

} //CorefieldsFactory
