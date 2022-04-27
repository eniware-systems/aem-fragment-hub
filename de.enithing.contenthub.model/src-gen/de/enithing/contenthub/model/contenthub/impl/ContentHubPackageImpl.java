/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;

import de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl;

import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationPackage;
import de.enithing.contenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl;
import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPath;
import de.enithing.contenthub.model.contenthub.ContextPolicy;
import de.enithing.contenthub.model.contenthub.ContextType;
import de.enithing.contenthub.model.contenthub.PathProvider;
import de.enithing.contenthub.model.contenthub.SimplePath;
import java.nio.file.Path;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
public class ContentHubPackageImpl extends EPackageImpl implements ContentHubPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathEDataType = null;

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
	 * @see de.enithing.contenthub.model.contenthub.ContentHubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentHubPackageImpl() {
		super(eNS_URI, ContentHubFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContentHubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentHubPackage init() {
		if (isInited) return (ContentHubPackage)EPackage.Registry.INSTANCE.getEPackage(ContentHubPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContentHubPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContentHubPackageImpl theContentHubPackage = registeredContentHubPackage instanceof ContentHubPackageImpl ? (ContentHubPackageImpl)registeredContentHubPackage : new ContentHubPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentFragmentPackage.eNS_URI);
		ContentFragmentPackageImpl theContentFragmentPackage = (ContentFragmentPackageImpl)(registeredPackage instanceof ContentFragmentPackageImpl ? registeredPackage : ContentFragmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorefieldsPackage.eNS_URI);
		CorefieldsPackageImpl theCorefieldsPackage = (CorefieldsPackageImpl)(registeredPackage instanceof CorefieldsPackageImpl ? registeredPackage : CorefieldsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(registeredPackage instanceof ValidationPackageImpl ? registeredPackage : ValidationPackage.eINSTANCE);

		// Create package meta-data objects
		theContentHubPackage.createPackageContents();
		theContentFragmentPackage.createPackageContents();
		theCorefieldsPackage.createPackageContents();
		theValidationPackage.createPackageContents();

		// Initialize created meta-data
		theContentHubPackage.initializePackageContents();
		theContentFragmentPackage.initializePackageContents();
		theCorefieldsPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentHubPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentHubPackage.eNS_URI, theContentHubPackage);
		return theContentHubPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathProvider() {
		return pathProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPathProvider__GetPath() {
		return pathProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimplePath() {
		return simplePathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimplePath_Path() {
		return (EAttribute)simplePathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextPath() {
		return contextPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContextPath_Context() {
		return (EReference)contextPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Name() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Group() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Title() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Description() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Author() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_ContentFragmentModelSets() {
		return (EReference)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_ContentRoot() {
		return (EReference)packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_ContentFragmentModelPath() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_ContentPath() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPackage__GetAllContentFragmentModels() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_ChildContexts() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_ParentContext() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_ContentFragments() {
		return (EReference)contextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContext_Policies() {
		return (EReference)contextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContext_Name() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContext_Title() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContext_PrimaryType() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__GetRootContext() {
		return contextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__GetPoliciesByType__Class() {
		return contextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__GetPath() {
		return contextEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextPolicy() {
		return contextPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContextType() {
		return contextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPath() {
		return pathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentHubFactory getContentHubFactory() {
		return (ContentHubFactory)getEFactoryInstance();
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
		pathProviderEClass = createEClass(PATH_PROVIDER);
		createEOperation(pathProviderEClass, PATH_PROVIDER___GET_PATH);

		simplePathEClass = createEClass(SIMPLE_PATH);
		createEAttribute(simplePathEClass, SIMPLE_PATH__PATH);

		contextPathEClass = createEClass(CONTEXT_PATH);
		createEReference(contextPathEClass, CONTEXT_PATH__CONTEXT);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NAME);
		createEAttribute(packageEClass, PACKAGE__GROUP);
		createEAttribute(packageEClass, PACKAGE__TITLE);
		createEAttribute(packageEClass, PACKAGE__DESCRIPTION);
		createEAttribute(packageEClass, PACKAGE__AUTHOR);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEReference(packageEClass, PACKAGE__CONTENT_FRAGMENT_MODEL_SETS);
		createEReference(packageEClass, PACKAGE__CONTENT_ROOT);
		createEAttribute(packageEClass, PACKAGE__CONTENT_FRAGMENT_MODEL_PATH);
		createEAttribute(packageEClass, PACKAGE__CONTENT_PATH);
		createEOperation(packageEClass, PACKAGE___GET_ALL_CONTENT_FRAGMENT_MODELS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__CHILD_CONTEXTS);
		createEReference(contextEClass, CONTEXT__PARENT_CONTEXT);
		createEReference(contextEClass, CONTEXT__CONTENT_FRAGMENTS);
		createEReference(contextEClass, CONTEXT__POLICIES);
		createEAttribute(contextEClass, CONTEXT__NAME);
		createEAttribute(contextEClass, CONTEXT__TITLE);
		createEAttribute(contextEClass, CONTEXT__PRIMARY_TYPE);
		createEOperation(contextEClass, CONTEXT___GET_ROOT_CONTEXT);
		createEOperation(contextEClass, CONTEXT___GET_POLICIES_BY_TYPE__CLASS);
		createEOperation(contextEClass, CONTEXT___GET_PATH);

		contextPolicyEClass = createEClass(CONTEXT_POLICY);

		// Create enums
		contextTypeEEnum = createEEnum(CONTEXT_TYPE);

		// Create data types
		pathEDataType = createEDataType(PATH);
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

		// Add subpackages
		getESubpackages().add(theContentFragmentPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simplePathEClass.getESuperTypes().add(this.getPathProvider());
		contextPathEClass.getESuperTypes().add(this.getPathProvider());

		// Initialize classes, features, and operations; add parameters
		initEClass(pathProviderEClass, PathProvider.class, "PathProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPathProvider__GetPath(), this.getPath(), "getPath", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simplePathEClass, SimplePath.class, "SimplePath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimplePath_Path(), this.getPath(), "path", "", 1, 1, SimplePath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextPathEClass, ContextPath.class, "ContextPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContextPath_Context(), this.getContext(), null, "context", null, 1, 1, ContextPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, de.enithing.contenthub.model.contenthub.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", "my.content", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Group(), ecorePackage.getEString(), "group", "de.enithing", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Title(), ecorePackage.getEString(), "title", "My Content", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Description(), ecorePackage.getEString(), "description", "A new package", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Author(), ecorePackage.getEString(), "author", "admin", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "version", "1.0.0", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_ContentFragmentModelSets(), theContentFragmentPackage.getContentFragmentModelSet(), theContentFragmentPackage.getContentFragmentModelSet_Package(), "contentFragmentModelSets", null, 0, -1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_ContentRoot(), this.getContext(), null, "contentRoot", null, 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_ContentFragmentModelPath(), this.getPath(), "contentFragmentModelPath", "/conf/$packageName/settings/dam/cfm/models", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_ContentPath(), this.getPath(), "contentPath", "/content/dam/$packageName", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPackage__GetAllContentFragmentModels(), theContentFragmentPackage.getContentFragmentModel(), "getAllContentFragmentModels", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_ChildContexts(), this.getContext(), this.getContext_ParentContext(), "childContexts", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ParentContext(), this.getContext(), this.getContext_ChildContexts(), "parentContext", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ContentFragments(), theContentFragmentPackage.getContentFragmentInstance(), theContentFragmentPackage.getContentFragmentInstance_Context(), "contentFragments", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Policies(), this.getContextPolicy(), null, "policies", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_Name(), ecorePackage.getEString(), "name", "new_context", 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_Title(), ecorePackage.getEString(), "title", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContext_PrimaryType(), this.getContextType(), "primaryType", "sling:Folder", 1, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContext__GetRootContext(), this.getContext(), "getRootContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getContext__GetPoliciesByType__Class(), null, "getPoliciesByType", 0, -1, IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "TPolicy");
		EGenericType g1 = createEGenericType(this.getContextPolicy());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType(t1);
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "clazz", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(t1);
		initEOperation(op, g1);

		initEOperation(getContext__GetPath(), this.getPath(), "getPath", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contextPolicyEClass, ContextPolicy.class, "ContextPolicy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(contextTypeEEnum, ContextType.class, "ContextType");
		addEEnumLiteral(contextTypeEEnum, ContextType.FOLDER);
		addEEnumLiteral(contextTypeEEnum, ContextType.ORDERED_FOLDER);
		addEEnumLiteral(contextTypeEEnum, ContextType.PAGE);

		// Initialize data types
		initEDataType(pathEDataType, Path.class, "Path", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ContentHubPackageImpl
