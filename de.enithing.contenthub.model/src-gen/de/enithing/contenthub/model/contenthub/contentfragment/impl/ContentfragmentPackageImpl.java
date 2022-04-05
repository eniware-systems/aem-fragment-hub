/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.impl;

import de.enithing.contenthub.model.contenthub.ContentHubPackage;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldValue;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentFactory;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage;
import de.enithing.contenthub.model.contenthub.contentfragment.GroupFieldType;
import de.enithing.contenthub.model.contenthub.contentfragment.SimpleFieldType;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.impl.CorefieldsPackageImpl;
import de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl;

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
public class ContentfragmentPackageImpl extends EPackageImpl implements ContentfragmentPackage {
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
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentfragmentPackageImpl() {
		super(eNS_URI, ContentfragmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContentfragmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentfragmentPackage init() {
		if (isInited) return (ContentfragmentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentfragmentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContentfragmentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContentfragmentPackageImpl theContentfragmentPackage = registeredContentfragmentPackage instanceof ContentfragmentPackageImpl ? (ContentfragmentPackageImpl)registeredContentfragmentPackage : new ContentfragmentPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentHubPackage.eNS_URI);
		ContentHubPackageImpl theContentHubPackage = (ContentHubPackageImpl)(registeredPackage instanceof ContentHubPackageImpl ? registeredPackage : ContentHubPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorefieldsPackage.eNS_URI);
		CorefieldsPackageImpl theCorefieldsPackage = (CorefieldsPackageImpl)(registeredPackage instanceof CorefieldsPackageImpl ? registeredPackage : CorefieldsPackage.eINSTANCE);

		// Create package meta-data objects
		theContentfragmentPackage.createPackageContents();
		theContentHubPackage.createPackageContents();
		theCorefieldsPackage.createPackageContents();

		// Initialize created meta-data
		theContentfragmentPackage.initializePackageContents();
		theContentHubPackage.initializePackageContents();
		theCorefieldsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentfragmentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentfragmentPackage.eNS_URI, theContentfragmentPackage);
		return theContentfragmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFragmentModel() {
		return contentFragmentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFragmentModel_Fields() {
		return (EReference)contentFragmentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFragmentModel_Context() {
		return (EReference)contentFragmentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentFragmentModel_Id() {
		return (EAttribute)contentFragmentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentFragmentModel_Title() {
		return (EAttribute)contentFragmentModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentFragmentModel_Description() {
		return (EAttribute)contentFragmentModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContentFragmentModel__GetAllChildren() {
		return contentFragmentModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFragmentFieldType() {
		return contentFragmentFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentFragmentFieldType_Id() {
		return (EAttribute)contentFragmentFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentFragmentFieldType_Label() {
		return (EAttribute)contentFragmentFieldTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentFragmentFieldType_Description() {
		return (EAttribute)contentFragmentFieldTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContentFragmentFieldType__CreateEmptyValue() {
		return contentFragmentFieldTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFragmentInstance() {
		return contentFragmentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFragmentInstance_Model() {
		return (EReference)contentFragmentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFragmentInstance_Fields() {
		return (EReference)contentFragmentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFragmentFieldInstance() {
		return contentFragmentFieldInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFragmentFieldInstance_Fieldtype() {
		return (EReference)contentFragmentFieldInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentFragmentFieldInstance_Value() {
		return (EReference)contentFragmentFieldInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleFieldType() {
		return simpleFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupFieldType() {
		return groupFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupFieldType_Fields() {
		return (EReference)groupFieldTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentFragmentFieldValue() {
		return contentFragmentFieldValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentfragmentFactory getContentfragmentFactory() {
		return (ContentfragmentFactory)getEFactoryInstance();
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
		contentFragmentModelEClass = createEClass(CONTENT_FRAGMENT_MODEL);
		createEReference(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__FIELDS);
		createEReference(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__CONTEXT);
		createEAttribute(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__ID);
		createEAttribute(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__TITLE);
		createEAttribute(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL__DESCRIPTION);
		createEOperation(contentFragmentModelEClass, CONTENT_FRAGMENT_MODEL___GET_ALL_CHILDREN);

		contentFragmentFieldTypeEClass = createEClass(CONTENT_FRAGMENT_FIELD_TYPE);
		createEAttribute(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE__ID);
		createEAttribute(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE__LABEL);
		createEAttribute(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION);
		createEOperation(contentFragmentFieldTypeEClass, CONTENT_FRAGMENT_FIELD_TYPE___CREATE_EMPTY_VALUE);

		contentFragmentInstanceEClass = createEClass(CONTENT_FRAGMENT_INSTANCE);
		createEReference(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE__MODEL);
		createEReference(contentFragmentInstanceEClass, CONTENT_FRAGMENT_INSTANCE__FIELDS);

		contentFragmentFieldInstanceEClass = createEClass(CONTENT_FRAGMENT_FIELD_INSTANCE);
		createEReference(contentFragmentFieldInstanceEClass, CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE);
		createEReference(contentFragmentFieldInstanceEClass, CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE);

		simpleFieldTypeEClass = createEClass(SIMPLE_FIELD_TYPE);

		groupFieldTypeEClass = createEClass(GROUP_FIELD_TYPE);
		createEReference(groupFieldTypeEClass, GROUP_FIELD_TYPE__FIELDS);

		contentFragmentFieldValueEClass = createEClass(CONTENT_FRAGMENT_FIELD_VALUE);
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
		ContentHubPackage theContentHubPackage = (ContentHubPackage)EPackage.Registry.INSTANCE.getEPackage(ContentHubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCorefieldsPackage);

		// Create type parameters
		ETypeParameter contentFragmentFieldTypeEClass_TValue = addETypeParameter(contentFragmentFieldTypeEClass, "TValue");
		ETypeParameter simpleFieldTypeEClass_TValue = addETypeParameter(simpleFieldTypeEClass, "TValue");
		ETypeParameter groupFieldTypeEClass_TValue = addETypeParameter(groupFieldTypeEClass, "TValue");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getContentFragmentFieldValue());
		contentFragmentFieldTypeEClass_TValue.getEBounds().add(g1);
		g1 = createEGenericType(this.getContentFragmentFieldValue());
		simpleFieldTypeEClass_TValue.getEBounds().add(g1);
		g1 = createEGenericType(this.getContentFragmentFieldValue());
		groupFieldTypeEClass_TValue.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getContentFragmentFieldType());
		EGenericType g2 = createEGenericType(simpleFieldTypeEClass_TValue);
		g1.getETypeArguments().add(g2);
		simpleFieldTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContentFragmentFieldType());
		g2 = createEGenericType(groupFieldTypeEClass_TValue);
		g1.getETypeArguments().add(g2);
		groupFieldTypeEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(contentFragmentModelEClass, ContentFragmentModel.class, "ContentFragmentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentFragmentModel_Fields(), this.getContentFragmentFieldType(), null, "fields", null, 0, -1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContentFragmentModel_Fields().getEKeys().add(this.getContentFragmentFieldType_Id());
		initEReference(getContentFragmentModel_Context(), theContentHubPackage.getContext(), theContentHubPackage.getContext_ContentFragmentModels(), "context", null, 1, 1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentModel_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentModel_Title(), ecorePackage.getEString(), "title", null, 1, 1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentModel_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContentFragmentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getContentFragmentModel__GetAllChildren(), null, "getAllChildren", 0, -1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getContentFragmentFieldType());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(contentFragmentFieldTypeEClass, ContentFragmentFieldType.class, "ContentFragmentFieldType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentFragmentFieldType_Id(), ecorePackage.getEString(), "id", null, 1, 1, ContentFragmentFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentFieldType_Label(), ecorePackage.getEString(), "label", null, 1, 1, ContentFragmentFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentFragmentFieldType_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContentFragmentFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getContentFragmentFieldType__CreateEmptyValue(), null, "createEmptyValue", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(contentFragmentFieldTypeEClass_TValue);
		initEOperation(op, g1);

		initEClass(contentFragmentInstanceEClass, ContentFragmentInstance.class, "ContentFragmentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentFragmentInstance_Model(), this.getContentFragmentModel(), null, "model", null, 1, 1, ContentFragmentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentInstance_Fields(), this.getContentFragmentFieldInstance(), null, "fields", null, 0, -1, ContentFragmentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentFragmentFieldInstanceEClass, ContentFragmentFieldInstance.class, "ContentFragmentFieldInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentFragmentFieldInstance_Fieldtype(), this.getContentFragmentFieldType(), null, "fieldtype", null, 1, 1, ContentFragmentFieldInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentFragmentFieldInstance_Value(), this.getContentFragmentFieldValue(), null, "value", null, 1, 1, ContentFragmentFieldInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleFieldTypeEClass, SimpleFieldType.class, "SimpleFieldType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupFieldTypeEClass, GroupFieldType.class, "GroupFieldType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupFieldType_Fields(), this.getSimpleFieldType(), null, "fields", null, 0, -1, GroupFieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroupFieldType_Fields().getEKeys().add(this.getContentFragmentFieldType_Id());

		initEClass(contentFragmentFieldValueEClass, ContentFragmentFieldValue.class, "ContentFragmentFieldValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ContentfragmentPackageImpl
