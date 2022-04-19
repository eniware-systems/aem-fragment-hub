/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;

import de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl;

import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationPackage;
import de.enithing.contenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl;
import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl;

import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPolicy;
import de.enithing.contenthub.model.contenthub.Pair;
import de.enithing.contenthub.model.contenthub.RootContext;

import java.nio.file.Path;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	private EClass rootContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childContextEClass = null;

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
	private EClass pairEClass = null;

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
	public EAttribute getPackage_Description() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Author() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_Contexts() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
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
	public EReference getContext_ContentFragmentModels() {
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
	public EOperation getContext__GetRootContext() {
		return contextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__GetRelatedContexts() {
		return contextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContext__GetRelatedPolicies() {
		return contextEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRootContext() {
		return rootContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRootContext_Name() {
		return (EAttribute)rootContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRootContext_JcrRootPath() {
		return (EAttribute)rootContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChildContext() {
		return childContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChildContext_ParentContext() {
		return (EReference)childContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChildContext_RelativePath() {
		return (EAttribute)childContextEClass.getEStructuralFeatures().get(1);
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
	public EClass getPair() {
		return pairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPair_Key() {
		return (EAttribute)pairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPair_Value() {
		return (EAttribute)pairEClass.getEStructuralFeatures().get(1);
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
		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__NAME);
		createEAttribute(packageEClass, PACKAGE__GROUP);
		createEAttribute(packageEClass, PACKAGE__DESCRIPTION);
		createEAttribute(packageEClass, PACKAGE__AUTHOR);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEReference(packageEClass, PACKAGE__CONTEXTS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__CHILD_CONTEXTS);
		createEReference(contextEClass, CONTEXT__CONTENT_FRAGMENT_MODELS);
		createEReference(contextEClass, CONTEXT__CONTENT_FRAGMENTS);
		createEReference(contextEClass, CONTEXT__POLICIES);
		createEOperation(contextEClass, CONTEXT___GET_ROOT_CONTEXT);
		createEOperation(contextEClass, CONTEXT___GET_RELATED_CONTEXTS);
		createEOperation(contextEClass, CONTEXT___GET_RELATED_POLICIES);

		rootContextEClass = createEClass(ROOT_CONTEXT);
		createEAttribute(rootContextEClass, ROOT_CONTEXT__NAME);
		createEAttribute(rootContextEClass, ROOT_CONTEXT__JCR_ROOT_PATH);

		childContextEClass = createEClass(CHILD_CONTEXT);
		createEReference(childContextEClass, CHILD_CONTEXT__PARENT_CONTEXT);
		createEAttribute(childContextEClass, CHILD_CONTEXT__RELATIVE_PATH);

		contextPolicyEClass = createEClass(CONTEXT_POLICY);

		pairEClass = createEClass(PAIR);
		createEAttribute(pairEClass, PAIR__KEY);
		createEAttribute(pairEClass, PAIR__VALUE);

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
		ETypeParameter pairEClass_TKey = addETypeParameter(pairEClass, "TKey");
		ETypeParameter pairEClass_TValue = addETypeParameter(pairEClass, "TValue");

		// Set bounds for type parameters

		// Add supertypes to classes
		rootContextEClass.getESuperTypes().add(this.getContext());
		childContextEClass.getESuperTypes().add(this.getContext());

		// Initialize classes, features, and operations; add parameters
		initEClass(packageEClass, de.enithing.contenthub.model.contenthub.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Name(), ecorePackage.getEString(), "name", "my.content", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Group(), ecorePackage.getEString(), "group", "de.enithing", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Description(), ecorePackage.getEString(), "description", "A new package", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Author(), ecorePackage.getEString(), "author", "admin", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "version", "1.0.0", 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Contexts(), this.getRootContext(), null, "contexts", null, 0, -1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_ChildContexts(), this.getChildContext(), this.getChildContext_ParentContext(), "childContexts", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ContentFragmentModels(), theContentFragmentPackage.getContentFragmentModel(), theContentFragmentPackage.getContentFragmentModel_Context(), "contentFragmentModels", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ContentFragments(), theContentFragmentPackage.getContentFragmentInstance(), theContentFragmentPackage.getContentFragmentInstance_Context(), "contentFragments", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Policies(), this.getContextPolicy(), null, "policies", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContext__GetRootContext(), this.getRootContext(), "getRootContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContext__GetRelatedContexts(), this.getContext(), "getRelatedContexts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContext__GetRelatedPolicies(), this.getContextPolicy(), "getRelatedPolicies", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootContextEClass, RootContext.class, "RootContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRootContext_Name(), ecorePackage.getEString(), "name", "my context", 1, 1, RootContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRootContext_JcrRootPath(), this.getPath(), "jcrRootPath", "/jcr_root", 1, 1, RootContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childContextEClass, ChildContext.class, "ChildContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildContext_ParentContext(), this.getContext(), this.getContext_ChildContexts(), "parentContext", null, 1, 1, ChildContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChildContext_RelativePath(), this.getPath(), "relativePath", "/child", 1, 1, ChildContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextPolicyEClass, ContextPolicy.class, "ContextPolicy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pairEClass, Pair.class, "Pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(pairEClass_TKey);
		initEAttribute(getPair_Key(), g1, "key", null, 1, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(pairEClass_TValue);
		initEAttribute(getPair_Value(), g1, "value", null, 1, 1, Pair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(pathEDataType, Path.class, "Path", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ContentHubPackageImpl
