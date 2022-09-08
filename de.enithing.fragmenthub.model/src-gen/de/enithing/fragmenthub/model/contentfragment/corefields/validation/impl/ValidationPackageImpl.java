/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeUnit;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.FileSizeValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerBoundConstraint;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerUpperBoundConstraint;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.UpperBoundConstraint;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationConstraint;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage;
import de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentPackageImpl;
import de.enithing.fragmenthub.model.fragmenthub.ContentHubPackage;
import de.enithing.fragmenthub.model.fragmenthub.impl.ContentHubPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationPackageImpl extends EPackageImpl implements ValidationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerBoundConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperBoundConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerUpperBoundConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSizeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileSizeUnitEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValidationPackageImpl() {
		super(eNS_URI, ValidationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ValidationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValidationPackage init() {
		if (isInited) return (ValidationPackage)EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredValidationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ValidationPackageImpl theValidationPackage = registeredValidationPackage instanceof ValidationPackageImpl ? (ValidationPackageImpl)registeredValidationPackage : new ValidationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentHubPackage.eNS_URI);
		ContentHubPackageImpl theContentHubPackage = (ContentHubPackageImpl)(registeredPackage instanceof ContentHubPackageImpl ? registeredPackage : ContentHubPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentFragmentPackage.eNS_URI);
		ContentFragmentPackageImpl theContentFragmentPackage = (ContentFragmentPackageImpl)(registeredPackage instanceof ContentFragmentPackageImpl ? registeredPackage : ContentFragmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorefieldsPackage.eNS_URI);
		CorefieldsPackageImpl theCorefieldsPackage = (CorefieldsPackageImpl)(registeredPackage instanceof CorefieldsPackageImpl ? registeredPackage : CorefieldsPackage.eINSTANCE);

		// Create package meta-data objects
		theValidationPackage.createPackageContents();
		theContentHubPackage.createPackageContents();
		theContentFragmentPackage.createPackageContents();
		theCorefieldsPackage.createPackageContents();

		// Initialize created meta-data
		theValidationPackage.initializePackageContents();
		theContentHubPackage.initializePackageContents();
		theContentFragmentPackage.initializePackageContents();
		theCorefieldsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theValidationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValidationPackage.eNS_URI, theValidationPackage);
		return theValidationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidationConstraint() {
		return validationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLowerBoundConstraint() {
		return lowerBoundConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLowerBoundConstraint_Min() {
		return (EAttribute)lowerBoundConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpperBoundConstraint() {
		return upperBoundConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUpperBoundConstraint_Max() {
		return (EAttribute)upperBoundConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLowerUpperBoundConstraint() {
		return lowerUpperBoundConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFileSizeValue() {
		return fileSizeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileSizeValue_Value() {
		return (EAttribute)fileSizeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFileSizeValue_Unit() {
		return (EAttribute)fileSizeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFileSizeUnit() {
		return fileSizeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationFactory getValidationFactory() {
		return (ValidationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		validationConstraintEClass = createEClass(VALIDATION_CONSTRAINT);

		lowerBoundConstraintEClass = createEClass(LOWER_BOUND_CONSTRAINT);
		createEAttribute(lowerBoundConstraintEClass, LOWER_BOUND_CONSTRAINT__MIN);

		upperBoundConstraintEClass = createEClass(UPPER_BOUND_CONSTRAINT);
		createEAttribute(upperBoundConstraintEClass, UPPER_BOUND_CONSTRAINT__MAX);

		lowerUpperBoundConstraintEClass = createEClass(LOWER_UPPER_BOUND_CONSTRAINT);

		fileSizeValueEClass = createEClass(FILE_SIZE_VALUE);
		createEAttribute(fileSizeValueEClass, FILE_SIZE_VALUE__VALUE);
		createEAttribute(fileSizeValueEClass, FILE_SIZE_VALUE__UNIT);

		// Create enums
		fileSizeUnitEEnum = createEEnum(FILE_SIZE_UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(validationConstraintEClass, "TValue");
		ETypeParameter lowerBoundConstraintEClass_TValue = addETypeParameter(lowerBoundConstraintEClass, "TValue");
		ETypeParameter upperBoundConstraintEClass_TValue = addETypeParameter(upperBoundConstraintEClass, "TValue");
		ETypeParameter lowerUpperBoundConstraintEClass_TValue = addETypeParameter(lowerUpperBoundConstraintEClass, "TValue");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getValidationConstraint());
		EGenericType g2 = createEGenericType(lowerBoundConstraintEClass_TValue);
		g1.getETypeArguments().add(g2);
		lowerBoundConstraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getValidationConstraint());
		g2 = createEGenericType(upperBoundConstraintEClass_TValue);
		g1.getETypeArguments().add(g2);
		upperBoundConstraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getLowerBoundConstraint());
		g2 = createEGenericType(lowerUpperBoundConstraintEClass_TValue);
		g1.getETypeArguments().add(g2);
		lowerUpperBoundConstraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUpperBoundConstraint());
		g2 = createEGenericType(lowerUpperBoundConstraintEClass_TValue);
		g1.getETypeArguments().add(g2);
		lowerUpperBoundConstraintEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(validationConstraintEClass, ValidationConstraint.class, "ValidationConstraint", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowerBoundConstraintEClass, LowerBoundConstraint.class, "LowerBoundConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(lowerBoundConstraintEClass_TValue);
		initEAttribute(getLowerBoundConstraint_Min(), g1, "min", null, 0, 1, LowerBoundConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(upperBoundConstraintEClass, UpperBoundConstraint.class, "UpperBoundConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(upperBoundConstraintEClass_TValue);
		initEAttribute(getUpperBoundConstraint_Max(), g1, "max", null, 0, 1, UpperBoundConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lowerUpperBoundConstraintEClass, LowerUpperBoundConstraint.class, "LowerUpperBoundConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileSizeValueEClass, FileSizeValue.class, "FileSizeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileSizeValue_Value(), ecorePackage.getEBigInteger(), "value", null, 1, 1, FileSizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileSizeValue_Unit(), this.getFileSizeUnit(), "unit", "MB", 1, 1, FileSizeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fileSizeUnitEEnum, FileSizeUnit.class, "FileSizeUnit");
		addEEnumLiteral(fileSizeUnitEEnum, FileSizeUnit.B);
		addEEnumLiteral(fileSizeUnitEEnum, FileSizeUnit.KB);
		addEEnumLiteral(fileSizeUnitEEnum, FileSizeUnit.MB);
		addEEnumLiteral(fileSizeUnitEEnum, FileSizeUnit.GB);
		addEEnumLiteral(fileSizeUnitEEnum, FileSizeUnit.TB);
	}

} //ValidationPackageImpl
