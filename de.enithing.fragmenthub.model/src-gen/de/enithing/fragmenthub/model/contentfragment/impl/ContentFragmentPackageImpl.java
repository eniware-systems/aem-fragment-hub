/**
 */
package de.enithing.fragmenthub.model.contentfragment.impl;

import de.enithing.fragmenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFactory;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModelSet;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.fragmenthub.model.contentfragment.GroupFieldType;
import de.enithing.fragmenthub.model.contentfragment.MultiFieldType;
import de.enithing.fragmenthub.model.contentfragment.SimpleFieldType;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl;
import de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage;
import de.enithing.fragmenthub.model.fragmenthub.impl.FragmentHubPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentFragmentPackageImpl extends EPackageImpl implements ContentFragmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFragmentModelSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFragmentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFragmentFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFragmentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFragmentFieldInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentFragmentFieldValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowedContentFragmentModelPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiFieldTypeEClass = null;

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
	 * @see de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentFragmentPackageImpl() {
		super(eNS_URI, ContentFragmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContentFragmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentFragmentPackage init() {
		if (isInited) return (ContentFragmentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentFragmentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContentFragmentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContentFragmentPackageImpl theContentFragmentPackage = registeredContentFragmentPackage instanceof ContentFragmentPackageImpl ? (ContentFragmentPackageImpl)registeredContentFragmentPackage : new ContentFragmentPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FragmentHubPackage.eNS_URI);
		FragmentHubPackageImpl theFragmentHubPackage = (FragmentHubPackageImpl)(registeredPackage instanceof FragmentHubPackageImpl ? registeredPackage : FragmentHubPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorefieldsPackage.eNS_URI);
		CorefieldsPackageImpl theCorefieldsPackage = (CorefieldsPackageImpl)(registeredPackage instanceof CorefieldsPackageImpl ? registeredPackage : CorefieldsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(registeredPackage instanceof ValidationPackageImpl ? registeredPackage : ValidationPackage.eINSTANCE);

		// Create package meta-data objects
		theContentFragmentPackage.createPackageContents();
		theFragmentHubPackage.createPackageContents();
		theCorefieldsPackage.createPackageContents();
		theValidationPackage.createPackageContents();

		// Initialize created meta-data
		theContentFragmentPackage.initializePackageContents();
		theFragmentHubPackage.initializePackageContents();
		theCorefieldsPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentFragmentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentFragmentPackage.eNS_URI, theContentFragmentPackage);
		return theContentFragmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentFragmentModelSet() {
		return contentFragmentModelSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentModelSet_Name() {
		return (EAttribute)contentFragmentModelSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentModelSet_Models() {
		return (EReference)contentFragmentModelSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentModelSet_Package() {
		return (EReference)contentFragmentModelSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentFragmentModel() {
		return contentFragmentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentModel_Fields() {
		return (EReference)contentFragmentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentModel_Id() {
		return (EAttribute)contentFragmentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentModel_Title() {
		return (EAttribute)contentFragmentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentModel_Description() {
		return (EAttribute)contentFragmentModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentModel_ModelSet() {
		return (EReference)contentFragmentModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContentFragmentModel__GetAllFields() {
		return contentFragmentModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContentFragmentModel__GetFieldByName__String_Class() {
		return contentFragmentModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContentFragmentModel__GetFieldByName__String() {
		return contentFragmentModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContentFragmentModel__GetPath() {
		return contentFragmentModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentFragmentFieldType() {
		return contentFragmentFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentFieldType_PropertyName() {
		return (EAttribute)contentFragmentFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentFieldType_FieldLabel() {
		return (EAttribute)contentFragmentFieldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentFieldType_Description() {
		return (EAttribute)contentFragmentFieldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContentFragmentFieldType__CreateEmptyValue() {
		return contentFragmentFieldTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContentFragmentFieldType__GetModel() {
		return contentFragmentFieldTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentFragmentInstance() {
		return contentFragmentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentInstance_Id() {
		return (EAttribute)contentFragmentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentInstance_Title() {
		return (EAttribute)contentFragmentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentFragmentInstance_Description() {
		return (EAttribute)contentFragmentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentInstance_Model() {
		return (EReference)contentFragmentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentInstance_Fields() {
		return (EReference)contentFragmentInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentInstance_Context() {
		return (EReference)contentFragmentInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContentFragmentInstance__GetPath() {
		return contentFragmentInstanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentFragmentFieldInstance() {
		return contentFragmentFieldInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentFieldInstance_Instance() {
		return (EReference)contentFragmentFieldInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentFieldInstance_Fieldtype() {
		return (EReference)contentFragmentFieldInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentFragmentFieldInstance_Value() {
		return (EReference)contentFragmentFieldInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleFieldType() {
		return simpleFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupFieldType() {
		return groupFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroupFieldType_Fields() {
		return (EReference)groupFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentFragmentFieldValue() {
		return contentFragmentFieldValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllowedContentFragmentModelPolicy() {
		return allowedContentFragmentModelPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllowedContentFragmentModelPolicy_Models() {
		return (EReference)allowedContentFragmentModelPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiFieldType() {
		return multiFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiFieldType_AllowMultiple() {
		return (EAttribute)multiFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMultiFieldType_MaxItems() {
		return (EAttribute)multiFieldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentFactory getContentFragmentFactory() {
		return (ContentFragmentFactory)getEFactoryInstance();
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
		contentFragmentModelSetEClass = createEClass(CONTENT_FRAGMENT_MODEL_SET);
		createEAttribute(contentFragmentModelSetEClass, CONTENT_FRAGMENT_MODEL_SET__NAME);
		createEReference(contentFragmentModelSetEClass, CONTENT_FRAGMENT_MODEL_SET__MODELS);
		createEReference(contentFragmentModelSetEClass, CONTENT_FRAGMENT_MODEL_SET__PACKAGE);

		contentFragmentModelEClass = createEClass(CONTENT_FRAGMENT_MODEL);
		createEReference(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__FIELDS);
		createEAttribute(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__ID);
		createEAttribute(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__TITLE);
		createEAttribute(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__DESCRIPTION);
		createEReference(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__MODEL_SET);
		createEOperation(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL___GET_ALL_FIELDS);
		createEOperation(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL___GET_FIELD_BY_NAME__STRING_CLASS);
		createEOperation(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL___GET_FIELD_BY_NAME__STRING);
		createEOperation(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL___GET_PATH);

		contentFragmentFieldTypeEClass = createEClass(CONTENT_FRAGMENT_FIELD_TYPE);
		createEAttribute(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME);
		createEAttribute(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL);
		createEAttribute(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION);
		createEOperation(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE___CREATE_EMPTY_VALUE);
		createEOperation(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE___GET_MODEL);

		contentFragmentInstanceEClass = createEClass(CONTENT_FRAGMENT_INSTANCE);
		createEAttribute(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE__ID);
		createEAttribute(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE__TITLE);
		createEAttribute(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE__DESCRIPTION);
		createEReference(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE__MODEL);
		createEReference(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE__FIELDS);
		createEReference(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE__CONTEXT);
		createEOperation(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE___GET_PATH);

		contentFragmentFieldInstanceEClass = createEClass(CONTENT_FRAGMENT_FIELD_INSTANCE);
		createEReference(contentFragmentFieldInstanceEClass, CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE);
		createEReference(contentFragmentFieldInstanceEClass, CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE);
		createEReference(contentFragmentFieldInstanceEClass, CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE);

		simpleFieldTypeEClass = createEClass(SIMPLE_FIELD_TYPE);

		groupFieldTypeEClass = createEClass(GROUP_FIELD_TYPE);
		createEReference(groupFieldTypeEClass, GROUP_FIELD_TYPE__FIELDS);

		contentFragmentFieldValueEClass = createEClass(CONTENT_FRAGMENT_FIELD_VALUE);

		allowedContentFragmentModelPolicyEClass = createEClass(ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY);
		createEReference(allowedContentFragmentModelPolicyEClass, ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY__MODELS);

		multiFieldTypeEClass = createEClass(MULTI_FIELD_TYPE);
		createEAttribute(multiFieldTypeEClass, MULTI_FIELD_TYPE__ALLOW_MULTIPLE);
		createEAttribute(multiFieldTypeEClass, MULTI_FIELD_TYPE__MAX_ITEMS);
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
		CorefieldsPackage theCorefieldsPackage = (CorefieldsPackage)EPackage.Registry.INSTANCE.getEPackage(CorefieldsPackage.eNS_URI);
		FragmentHubPackage theFragmentHubPackage = (FragmentHubPackage)EPackage.Registry.INSTANCE.getEPackage(FragmentHubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorefieldsPackage);

		// Create type parameters
		ETypeParameter contentFragmentFieldTypeEClass_TValue = addETypeParameter(contentFragmentFieldTypeEClass, "TValue");
		ETypeParameter simpleFieldTypeEClass_TValue = addETypeParameter(simpleFieldTypeEClass, "TValue");
		ETypeParameter groupFieldTypeEClass_TValue = addETypeParameter(groupFieldTypeEClass, "TValue");
		ETypeParameter multiFieldTypeEClass_TValue = addETypeParameter(multiFieldTypeEClass, "TValue");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getContentFragmentFieldValue());
		contentFragmentFieldTypeEClass_TValue.getEBounds().add(g1);
		g1 = createEGenericType(this.getContentFragmentFieldValue());
		simpleFieldTypeEClass_TValue.getEBounds().add(g1);
		g1 = createEGenericType(this.getContentFragmentFieldValue());
		groupFieldTypeEClass_TValue.getEBounds().add(g1);
		g1 = createEGenericType(this.getContentFragmentFieldValue());
		multiFieldTypeEClass_TValue.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getContentFragmentFieldType());
		EGenericType g2 = createEGenericType(simpleFieldTypeEClass_TValue);
		g1.getETypeArguments().add(g2);
		simpleFieldTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContentFragmentFieldType());
		g2 = createEGenericType(groupFieldTypeEClass_TValue);
		g1.getETypeArguments().add(g2);
		groupFieldTypeEClass.getEGenericSuperTypes().add(g1);
		allowedContentFragmentModelPolicyEClass.getESuperTypes().add(theFragmentHubPackage.getContextPolicy());
		g1 = createEGenericType(this.getSimpleFieldType());
		g2 = createEGenericType(multiFieldTypeEClass_TValue);
		g1.getETypeArguments().add(g2);
		multiFieldTypeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(contentFragmentModelSetEClass, ContentFragmentModelSet.class, "ContentFragmentModelSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentFragmentModelSet_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContentFragmentModelSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentModelSet_Models(), this.getContentFragmentModel(), this.getContentFragmentModel_ModelSet(), "models", null, 0, -1, ContentFragmentModelSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentModelSet_Package(), theFragmentHubPackage.getPackage(), theFragmentHubPackage.getPackage_ContentFragmentModelSets(), "package", null, 1, 1, ContentFragmentModelSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentFragmentModelEClass, ContentFragmentModel.class, "ContentFragmentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentFragmentModel_Fields(), this.getContentFragmentFieldType(), null, "fields", null, 0, -1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContentFragmentModel_Fields().getEKeys().add(this.getContentFragmentFieldType_PropertyName());
		initEAttribute(getContentFragmentModel_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentModel_Title(), ecorePackage.getEString(), "title", null, 1, 1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentModel_ModelSet(), this.getContentFragmentModelSet(), this.getContentFragmentModelSet_Models(), "modelSet", null, 1, 1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getContentFragmentModel__GetAllFields(), null, "getAllFields", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getContentFragmentFieldType());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getContentFragmentModel__GetFieldByName__String_Class(), null, "getFieldByName", 1, 1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "TField");
		g1 = createEGenericType(this.getContentFragmentFieldType());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		t1.getEBounds().add(g1);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		op = initEOperation(getContentFragmentModel__GetFieldByName__String(), null, "getFieldByName", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getContentFragmentFieldType());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getContentFragmentModel__GetPath(), theFragmentHubPackage.getPath(), "getPath", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contentFragmentFieldTypeEClass, ContentFragmentFieldType.class, "ContentFragmentFieldType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentFragmentFieldType_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, ContentFragmentFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentFieldType_FieldLabel(), ecorePackage.getEString(), "fieldLabel", null, 1, 1, ContentFragmentFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentFieldType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContentFragmentFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getContentFragmentFieldType__CreateEmptyValue(), null, "createEmptyValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(contentFragmentFieldTypeEClass_TValue);
		initEOperation(op, g1);

		initEOperation(getContentFragmentFieldType__GetModel(), this.getContentFragmentModel(), "getModel", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contentFragmentInstanceEClass, ContentFragmentInstance.class, "ContentFragmentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentFragmentInstance_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContentFragmentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentInstance_Title(), ecorePackage.getEString(), "title", null, 1, 1, ContentFragmentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContentFragmentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentInstance_Model(), this.getContentFragmentModel(), null, "model", null, 1, 1, ContentFragmentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentInstance_Fields(), this.getContentFragmentFieldInstance(), this.getContentFragmentFieldInstance_Instance(), "fields", null, 0, -1, ContentFragmentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentInstance_Context(), theFragmentHubPackage.getContext(), theFragmentHubPackage.getContext_ContentFragments(), "context", null, 1, 1, ContentFragmentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContentFragmentInstance__GetPath(), theFragmentHubPackage.getPath(), "getPath", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contentFragmentFieldInstanceEClass, ContentFragmentFieldInstance.class, "ContentFragmentFieldInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentFragmentFieldInstance_Instance(), this.getContentFragmentInstance(), this.getContentFragmentInstance_Fields(), "instance", null, 1, 1, ContentFragmentFieldInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentFieldInstance_Fieldtype(), this.getContentFragmentFieldType(), null, "fieldtype", null, 1, 1, ContentFragmentFieldInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentFieldInstance_Value(), this.getContentFragmentFieldValue(), null, "value", null, 1, 1, ContentFragmentFieldInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleFieldTypeEClass, SimpleFieldType.class, "SimpleFieldType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupFieldTypeEClass, GroupFieldType.class, "GroupFieldType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupFieldType_Fields(), this.getSimpleFieldType(), null, "fields", null, 0, -1, GroupFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroupFieldType_Fields().getEKeys().add(this.getContentFragmentFieldType_PropertyName());

		initEClass(contentFragmentFieldValueEClass, ContentFragmentFieldValue.class, "ContentFragmentFieldValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allowedContentFragmentModelPolicyEClass, AllowedContentFragmentModelPolicy.class, "AllowedContentFragmentModelPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllowedContentFragmentModelPolicy_Models(), this.getContentFragmentModel(), null, "models", null, 0, -1, AllowedContentFragmentModelPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiFieldTypeEClass, MultiFieldType.class, "MultiFieldType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiFieldType_AllowMultiple(), ecorePackage.getEBoolean(), "allowMultiple", "false", 1, 1, MultiFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiFieldType_MaxItems(), ecorePackage.getEInt(), "maxItems", null, 0, 1, MultiFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ContentFragmentPackageImpl
