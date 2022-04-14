/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import de.enithing.contenthub.model.contentfragment.corefields.ContentFragmentReference;
import de.enithing.contenthub.model.contentfragment.corefields.ContentFragmentReferenceValue;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineTextType;
import de.enithing.contenthub.model.contentfragment.corefields.NumberValue;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contentfragment.corefields.TextValue;

import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl;

import de.enithing.contenthub.model.contenthub.ContentHubPackage;

import de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorefieldsPackageImpl extends EPackageImpl implements CorefieldsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleLineTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiLineTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFragmentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFragmentReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiLineTextTypeEEnum = null;

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
	 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorefieldsPackageImpl() {
		super(eNS_URI, CorefieldsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorefieldsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorefieldsPackage init() {
		if (isInited) return (CorefieldsPackage)EPackage.Registry.INSTANCE.getEPackage(CorefieldsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorefieldsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorefieldsPackageImpl theCorefieldsPackage = registeredCorefieldsPackage instanceof CorefieldsPackageImpl ? (CorefieldsPackageImpl)registeredCorefieldsPackage : new CorefieldsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentHubPackage.eNS_URI);
		ContentHubPackageImpl theContentHubPackage = (ContentHubPackageImpl)(registeredPackage instanceof ContentHubPackageImpl ? registeredPackage : ContentHubPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentFragmentPackage.eNS_URI);
		ContentFragmentPackageImpl theContentFragmentPackage = (ContentFragmentPackageImpl)(registeredPackage instanceof ContentFragmentPackageImpl ? registeredPackage : ContentFragmentPackage.eINSTANCE);

		// Create package meta-data objects
		theCorefieldsPackage.createPackageContents();
		theContentHubPackage.createPackageContents();
		theContentFragmentPackage.createPackageContents();

		// Initialize created meta-data
		theCorefieldsPackage.initializePackageContents();
		theContentHubPackage.initializePackageContents();
		theContentFragmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorefieldsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorefieldsPackage.eNS_URI, theCorefieldsPackage);
		return theCorefieldsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumber() {
		return numberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumber_PlaceholderText() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberValue_Value() {
		return (EAttribute)numberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleLineText() {
		return singleLineTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleLineText_PlaceholderText() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleLineText_DefaultValue() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleLineText_MaxLength() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleLineText_Required() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleLineText_Unique() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleLineText_Translatable() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiLineText() {
		return multiLineTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiLineText_DefaultType() {
		return (EAttribute)multiLineTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiLineText_AllowFragmentReference() {
		return (EAttribute)multiLineTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiLineText_Required() {
		return (EAttribute)multiLineTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiLineText_Translatable() {
		return (EAttribute)multiLineTextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextValue() {
		return textValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextValue_Text() {
		return (EAttribute)textValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentFragmentReference() {
		return contentFragmentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentFragmentReferenceValue() {
		return contentFragmentReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentReferenceValue_Fragments() {
		return (EReference)contentFragmentReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMultiLineTextType() {
		return multiLineTextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorefieldsFactory getCorefieldsFactory() {
		return (CorefieldsFactory)getEFactoryInstance();
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
		numberEClass = createEClass(NUMBER);
		createEAttribute(numberEClass, NUMBER__PLACEHOLDER_TEXT);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEAttribute(numberValueEClass, NUMBER_VALUE__VALUE);

		singleLineTextEClass = createEClass(SINGLE_LINE_TEXT);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__PLACEHOLDER_TEXT);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__DEFAULT_VALUE);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__MAX_LENGTH);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__REQUIRED);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__UNIQUE);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__TRANSLATABLE);

		multiLineTextEClass = createEClass(MULTI_LINE_TEXT);
		createEAttribute(multiLineTextEClass, MULTI_LINE_TEXT__DEFAULT_TYPE);
		createEAttribute(multiLineTextEClass, MULTI_LINE_TEXT__ALLOW_FRAGMENT_REFERENCE);
		createEAttribute(multiLineTextEClass, MULTI_LINE_TEXT__REQUIRED);
		createEAttribute(multiLineTextEClass, MULTI_LINE_TEXT__TRANSLATABLE);

		textValueEClass = createEClass(TEXT_VALUE);
		createEAttribute(textValueEClass, TEXT_VALUE__TEXT);

		tabEClass = createEClass(TAB);

		contentFragmentReferenceEClass = createEClass(CONTENT_FRAGMENT_REFERENCE);

		contentFragmentReferenceValueEClass = createEClass(CONTENT_FRAGMENT_REFERENCE_VALUE);
		createEReference(contentFragmentReferenceValueEClass, CONTENT_FRAGMENT_REFERENCE_VALUE__FRAGMENTS);

		// Create enums
		multiLineTextTypeEEnum = createEEnum(MULTI_LINE_TEXT_TYPE);
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

		// Obtain other dependent packages
		ContentFragmentPackage theContentFragmentPackage = (ContentFragmentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentFragmentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theContentFragmentPackage.getSimpleFieldType());
		EGenericType g2 = createEGenericType(this.getNumberValue());
		g1.getETypeArguments().add(g2);
		numberEClass.getEGenericSuperTypes().add(g1);
		numberValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());
		g1 = createEGenericType(theContentFragmentPackage.getMultiFieldType());
		g2 = createEGenericType(this.getTextValue());
		g1.getETypeArguments().add(g2);
		singleLineTextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theContentFragmentPackage.getMultiFieldType());
		g2 = createEGenericType(this.getTextValue());
		g1.getETypeArguments().add(g2);
		multiLineTextEClass.getEGenericSuperTypes().add(g1);
		textValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());
		g1 = createEGenericType(theContentFragmentPackage.getGroupFieldType());
		g2 = createEGenericType(theContentFragmentPackage.getContentFragmentFieldValue());
		g1.getETypeArguments().add(g2);
		tabEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theContentFragmentPackage.getMultiFieldType());
		g2 = createEGenericType(this.getContentFragmentReferenceValue());
		g1.getETypeArguments().add(g2);
		contentFragmentReferenceEClass.getEGenericSuperTypes().add(g1);
		contentFragmentReferenceValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(numberEClass, de.enithing.contenthub.model.contentfragment.corefields.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumber_PlaceholderText(), ecorePackage.getEString(), "placeholderText", null, 0, 1, de.enithing.contenthub.model.contentfragment.corefields.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_Value(), ecorePackage.getEDouble(), "value", "0", 1, 1, NumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleLineTextEClass, SingleLineText.class, "SingleLineText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleLineText_PlaceholderText(), ecorePackage.getEString(), "placeholderText", null, 0, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_MaxLength(), ecorePackage.getEInt(), "maxLength", "255", 0, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_Unique(), ecorePackage.getEBoolean(), "unique", "false", 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_Translatable(), ecorePackage.getEBoolean(), "translatable", "false", 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiLineTextEClass, MultiLineText.class, "MultiLineText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiLineText_DefaultType(), this.getMultiLineTextType(), "defaultType", "text/html", 1, 1, MultiLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiLineText_AllowFragmentReference(), ecorePackage.getEBoolean(), "allowFragmentReference", "false", 1, 1, MultiLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiLineText_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, MultiLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiLineText_Translatable(), ecorePackage.getEBoolean(), "translatable", "false", 1, 1, MultiLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textValueEClass, TextValue.class, "TextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextValue_Text(), ecorePackage.getEString(), "text", null, 1, 1, TextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentFragmentReferenceEClass, ContentFragmentReference.class, "ContentFragmentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contentFragmentReferenceValueEClass, ContentFragmentReferenceValue.class, "ContentFragmentReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentFragmentReferenceValue_Fragments(), theContentFragmentPackage.getContentFragmentInstance(), null, "fragments", null, 0, -1, ContentFragmentReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(multiLineTextTypeEEnum, MultiLineTextType.class, "MultiLineTextType");
		addEEnumLiteral(multiLineTextTypeEEnum, MultiLineTextType.RICH_TEXT);
		addEEnumLiteral(multiLineTextTypeEEnum, MultiLineTextType.MARKDOWN);
		addEEnumLiteral(multiLineTextTypeEEnum, MultiLineTextType.PLAIN_TEXT);
	}

} //CorefieldsPackageImpl
