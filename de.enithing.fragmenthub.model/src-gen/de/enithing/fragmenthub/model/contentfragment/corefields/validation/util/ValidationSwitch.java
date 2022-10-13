/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.validation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import de.enithing.fragmenthub.model.contentfragment.corefields.validation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage
 * @generated
 */
public class ValidationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValidationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationSwitch() {
		if (modelPackage == null) {
			modelPackage = ValidationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ValidationPackage.VALIDATION_CONSTRAINT: {
				ValidationConstraint<?> validationConstraint = (ValidationConstraint<?>)theEObject;
				T result = caseValidationConstraint(validationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.LOWER_BOUND_CONSTRAINT: {
				LowerBoundConstraint<?> lowerBoundConstraint = (LowerBoundConstraint<?>)theEObject;
				T result = caseLowerBoundConstraint(lowerBoundConstraint);
				if (result == null) result = caseValidationConstraint(lowerBoundConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.UPPER_BOUND_CONSTRAINT: {
				UpperBoundConstraint<?> upperBoundConstraint = (UpperBoundConstraint<?>)theEObject;
				T result = caseUpperBoundConstraint(upperBoundConstraint);
				if (result == null) result = caseValidationConstraint(upperBoundConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT: {
				LowerUpperBoundConstraint<?> lowerUpperBoundConstraint = (LowerUpperBoundConstraint<?>)theEObject;
				T result = caseLowerUpperBoundConstraint(lowerUpperBoundConstraint);
				if (result == null) result = caseLowerBoundConstraint(lowerUpperBoundConstraint);
				if (result == null) result = caseUpperBoundConstraint(lowerUpperBoundConstraint);
				if (result == null) result = caseValidationConstraint(lowerUpperBoundConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValidationPackage.FILE_SIZE_VALUE: {
				FileSizeValue fileSizeValue = (FileSizeValue)theEObject;
				T result = caseFileSizeValue(fileSizeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TValue> T caseValidationConstraint(ValidationConstraint<TValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Bound Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Bound Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TValue> T caseLowerBoundConstraint(LowerBoundConstraint<TValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Bound Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Bound Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TValue> T caseUpperBoundConstraint(UpperBoundConstraint<TValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Upper Bound Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Upper Bound Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TValue> T caseLowerUpperBoundConstraint(LowerUpperBoundConstraint<TValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Size Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Size Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSizeValue(FileSizeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ValidationSwitch
