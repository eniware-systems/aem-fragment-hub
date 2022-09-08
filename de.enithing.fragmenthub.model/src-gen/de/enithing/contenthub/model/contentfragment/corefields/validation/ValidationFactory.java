/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.validation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationPackage
 * @generated
 */
public interface ValidationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationFactory eINSTANCE = de.enithing.contenthub.model.contentfragment.corefields.validation.impl.ValidationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lower Bound Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Bound Constraint</em>'.
	 * @generated
	 */
	<TValue> LowerBoundConstraint<TValue> createLowerBoundConstraint();

	/**
	 * Returns a new object of class '<em>Upper Bound Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upper Bound Constraint</em>'.
	 * @generated
	 */
	<TValue> UpperBoundConstraint<TValue> createUpperBoundConstraint();

	/**
	 * Returns a new object of class '<em>Lower Upper Bound Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Upper Bound Constraint</em>'.
	 * @generated
	 */
	<TValue> LowerUpperBoundConstraint<TValue> createLowerUpperBoundConstraint();

	/**
	 * Returns a new object of class '<em>File Size Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Size Value</em>'.
	 * @generated
	 */
	FileSizeValue createFileSizeValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ValidationPackage getValidationPackage();

} //ValidationFactory
