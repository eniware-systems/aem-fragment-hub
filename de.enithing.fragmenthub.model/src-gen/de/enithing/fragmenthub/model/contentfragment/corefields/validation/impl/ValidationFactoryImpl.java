/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.enithing.fragmenthub.model.contentfragment.corefields.validation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationFactoryImpl extends EFactoryImpl implements ValidationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ValidationFactory init() {
		try {
			ValidationFactory theValidationFactory = (ValidationFactory)EPackage.Registry.INSTANCE.getEFactory(ValidationPackage.eNS_URI);
			if (theValidationFactory != null) {
				return theValidationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ValidationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ValidationPackage.LOWER_BOUND_CONSTRAINT: return createLowerBoundConstraint();
			case ValidationPackage.UPPER_BOUND_CONSTRAINT: return createUpperBoundConstraint();
			case ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT: return createLowerUpperBoundConstraint();
			case ValidationPackage.FILE_SIZE_VALUE: return createFileSizeValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ValidationPackage.FILE_SIZE_UNIT:
				return createFileSizeUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ValidationPackage.FILE_SIZE_UNIT:
				return convertFileSizeUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <TValue> LowerBoundConstraint<TValue> createLowerBoundConstraint() {
		LowerBoundConstraintImpl<TValue> lowerBoundConstraint = new LowerBoundConstraintImpl<TValue>();
		return lowerBoundConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <TValue> UpperBoundConstraint<TValue> createUpperBoundConstraint() {
		UpperBoundConstraintImpl<TValue> upperBoundConstraint = new UpperBoundConstraintImpl<TValue>();
		return upperBoundConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <TValue> LowerUpperBoundConstraint<TValue> createLowerUpperBoundConstraint() {
		LowerUpperBoundConstraintImpl<TValue> lowerUpperBoundConstraint = new LowerUpperBoundConstraintImpl<TValue>();
		return lowerUpperBoundConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileSizeValue createFileSizeValue() {
		FileSizeValueImpl fileSizeValue = new FileSizeValueImpl();
		return fileSizeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSizeUnit createFileSizeUnitFromString(EDataType eDataType, String initialValue) {
		FileSizeUnit result = FileSizeUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileSizeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationPackage getValidationPackage() {
		return (ValidationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ValidationPackage getPackage() {
		return ValidationPackage.eINSTANCE;
	}

} //ValidationFactoryImpl
