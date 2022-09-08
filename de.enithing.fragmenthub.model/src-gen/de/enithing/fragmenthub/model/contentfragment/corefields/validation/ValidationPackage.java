/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.validation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationFactory
 * @model kind="package"
 * @generated
 */
public interface ValidationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "validation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://aemcontenthub.eniware-systems.de/ns/contentfragments/corefields/validation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chub";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ValidationPackage eINSTANCE = de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationConstraint <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationConstraint
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getValidationConstraint()
	 * @generated
	 */
	int VALIDATION_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerBoundConstraintImpl <em>Lower Bound Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerBoundConstraintImpl
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getLowerBoundConstraint()
	 * @generated
	 */
	int LOWER_BOUND_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUND_CONSTRAINT__MIN = VALIDATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lower Bound Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUND_CONSTRAINT_FEATURE_COUNT = VALIDATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lower Bound Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUND_CONSTRAINT_OPERATION_COUNT = VALIDATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.UpperBoundConstraintImpl <em>Upper Bound Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.UpperBoundConstraintImpl
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getUpperBoundConstraint()
	 * @generated
	 */
	int UPPER_BOUND_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_CONSTRAINT__MAX = VALIDATION_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Upper Bound Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_CONSTRAINT_FEATURE_COUNT = VALIDATION_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Upper Bound Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_CONSTRAINT_OPERATION_COUNT = VALIDATION_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerUpperBoundConstraintImpl <em>Lower Upper Bound Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerUpperBoundConstraintImpl
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getLowerUpperBoundConstraint()
	 * @generated
	 */
	int LOWER_UPPER_BOUND_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_UPPER_BOUND_CONSTRAINT__MIN = LOWER_BOUND_CONSTRAINT__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_UPPER_BOUND_CONSTRAINT__MAX = LOWER_BOUND_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lower Upper Bound Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_UPPER_BOUND_CONSTRAINT_FEATURE_COUNT = LOWER_BOUND_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lower Upper Bound Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_UPPER_BOUND_CONSTRAINT_OPERATION_COUNT = LOWER_BOUND_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.FileSizeValueImpl <em>File Size Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.FileSizeValueImpl
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getFileSizeValue()
	 * @generated
	 */
	int FILE_SIZE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_VALUE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>File Size Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File Size Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeUnit <em>File Size Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeUnit
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getFileSizeUnit()
	 * @generated
	 */
	int FILE_SIZE_UNIT = 5;

	/**
	 * Returns the meta object for class '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationConstraint
	 * @generated
	 */
	EClass getValidationConstraint();

	/**
	 * Returns the meta object for class '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerBoundConstraint <em>Lower Bound Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Bound Constraint</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerBoundConstraint
	 * @generated
	 */
	EClass getLowerBoundConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerBoundConstraint#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerBoundConstraint#getMin()
	 * @see #getLowerBoundConstraint()
	 * @generated
	 */
	EAttribute getLowerBoundConstraint_Min();

	/**
	 * Returns the meta object for class '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.UpperBoundConstraint <em>Upper Bound Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Bound Constraint</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.UpperBoundConstraint
	 * @generated
	 */
	EClass getUpperBoundConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.UpperBoundConstraint#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.UpperBoundConstraint#getMax()
	 * @see #getUpperBoundConstraint()
	 * @generated
	 */
	EAttribute getUpperBoundConstraint_Max();

	/**
	 * Returns the meta object for class '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerUpperBoundConstraint <em>Lower Upper Bound Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Upper Bound Constraint</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerUpperBoundConstraint
	 * @generated
	 */
	EClass getLowerUpperBoundConstraint();

	/**
	 * Returns the meta object for class '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeValue <em>File Size Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Size Value</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeValue
	 * @generated
	 */
	EClass getFileSizeValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeValue#getValue()
	 * @see #getFileSizeValue()
	 * @generated
	 */
	EAttribute getFileSizeValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeValue#getUnit()
	 * @see #getFileSizeValue()
	 * @generated
	 */
	EAttribute getFileSizeValue_Unit();

	/**
	 * Returns the meta object for enum '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeUnit <em>File Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Size Unit</em>'.
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeUnit
	 * @generated
	 */
	EEnum getFileSizeUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ValidationFactory getValidationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationConstraint <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationConstraint
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getValidationConstraint()
		 * @generated
		 */
		EClass VALIDATION_CONSTRAINT = eINSTANCE.getValidationConstraint();

		/**
		 * The meta object literal for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerBoundConstraintImpl <em>Lower Bound Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerBoundConstraintImpl
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getLowerBoundConstraint()
		 * @generated
		 */
		EClass LOWER_BOUND_CONSTRAINT = eINSTANCE.getLowerBoundConstraint();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOWER_BOUND_CONSTRAINT__MIN = eINSTANCE.getLowerBoundConstraint_Min();

		/**
		 * The meta object literal for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.UpperBoundConstraintImpl <em>Upper Bound Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.UpperBoundConstraintImpl
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getUpperBoundConstraint()
		 * @generated
		 */
		EClass UPPER_BOUND_CONSTRAINT = eINSTANCE.getUpperBoundConstraint();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPER_BOUND_CONSTRAINT__MAX = eINSTANCE.getUpperBoundConstraint_Max();

		/**
		 * The meta object literal for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerUpperBoundConstraintImpl <em>Lower Upper Bound Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerUpperBoundConstraintImpl
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getLowerUpperBoundConstraint()
		 * @generated
		 */
		EClass LOWER_UPPER_BOUND_CONSTRAINT = eINSTANCE.getLowerUpperBoundConstraint();

		/**
		 * The meta object literal for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.FileSizeValueImpl <em>File Size Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.FileSizeValueImpl
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getFileSizeValue()
		 * @generated
		 */
		EClass FILE_SIZE_VALUE = eINSTANCE.getFileSizeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SIZE_VALUE__VALUE = eINSTANCE.getFileSizeValue_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SIZE_VALUE__UNIT = eINSTANCE.getFileSizeValue_Unit();

		/**
		 * The meta object literal for the '{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeUnit <em>File Size Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeUnit
		 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl#getFileSizeUnit()
		 * @generated
		 */
		EEnum FILE_SIZE_UNIT = eINSTANCE.getFileSizeUnit();

	}

} //ValidationPackage
