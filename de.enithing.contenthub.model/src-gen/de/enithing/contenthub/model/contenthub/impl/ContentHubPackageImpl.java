/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;

import de.enithing.contenthub.model.contenthub.RootContext;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage;

import de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.impl.CorefieldsPackageImpl;
import de.enithing.contenthub.model.contenthub.contentfragment.impl.ContentfragmentPackageImpl;

import java.nio.file.Path;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentfragmentPackage.eNS_URI);
		ContentfragmentPackageImpl theContentfragmentPackage = (ContentfragmentPackageImpl)(registeredPackage instanceof ContentfragmentPackageImpl ? registeredPackage : ContentfragmentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorefieldsPackage.eNS_URI);
		CorefieldsPackageImpl theCorefieldsPackage = (CorefieldsPackageImpl)(registeredPackage instanceof CorefieldsPackageImpl ? registeredPackage : CorefieldsPackage.eINSTANCE);

		// Create package meta-data objects
		theContentHubPackage.createPackageContents();
		theContentfragmentPackage.createPackageContents();
		theCorefieldsPackage.createPackageContents();

		// Initialize created meta-data
		theContentHubPackage.initializePackageContents();
		theContentfragmentPackage.initializePackageContents();
		theCorefieldsPackage.initializePackageContents();

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
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Contexts() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Path() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ChildContexts() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ContentFragmentModels() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ContentFragments() {
		return (EReference)contextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContext__GetRootContext() {
		return contextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootContext() {
		return rootContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootContext_JcrRootPath() {
		return (EAttribute)rootContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChildContext() {
		return childContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChildContext_ParentContext() {
		return (EReference)childContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChildContext_RelativePath() {
		return (EAttribute)childContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPath() {
		return pathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		createEReference(packageEClass, PACKAGE__CONTEXTS);
		createEAttribute(packageEClass, PACKAGE__PATH);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__CHILD_CONTEXTS);
		createEReference(contextEClass, CONTEXT__CONTENT_FRAGMENT_MODELS);
		createEReference(contextEClass, CONTEXT__CONTENT_FRAGMENTS);
		createEOperation(contextEClass, CONTEXT___GET_ROOT_CONTEXT);

		rootContextEClass = createEClass(ROOT_CONTEXT);
		createEAttribute(rootContextEClass, ROOT_CONTEXT__JCR_ROOT_PATH);

		childContextEClass = createEClass(CHILD_CONTEXT);
		createEReference(childContextEClass, CHILD_CONTEXT__PARENT_CONTEXT);
		createEAttribute(childContextEClass, CHILD_CONTEXT__RELATIVE_PATH);

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
		ContentfragmentPackage theContentfragmentPackage = (ContentfragmentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentfragmentPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theContentfragmentPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootContextEClass.getESuperTypes().add(this.getContext());
		childContextEClass.getESuperTypes().add(this.getContext());

		// Initialize classes, features, and operations; add parameters
		initEClass(packageEClass, de.enithing.contenthub.model.contenthub.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Contexts(), this.getRootContext(), null, "contexts", null, 0, -1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Path(), this.getPath(), "path", null, 1, 1, de.enithing.contenthub.model.contenthub.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_ChildContexts(), this.getChildContext(), this.getChildContext_ParentContext(), "childContexts", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ContentFragmentModels(), theContentfragmentPackage.getContentFragmentModel(), theContentfragmentPackage.getContentFragmentModel_Context(), "contentFragmentModels", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_ContentFragments(), theContentfragmentPackage.getContentFragmentInstance(), null, "contentFragments", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContext__GetRootContext(), this.getRootContext(), "getRootContext", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootContextEClass, RootContext.class, "RootContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRootContext_JcrRootPath(), this.getPath(), "jcrRootPath", "/src/main/content/jcr_root", 1, 1, RootContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childContextEClass, ChildContext.class, "ChildContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChildContext_ParentContext(), this.getContext(), this.getContext_ChildContexts(), "parentContext", null, 1, 1, ChildContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChildContext_RelativePath(), this.getPath(), "relativePath", "/child", 1, 1, ChildContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(pathEDataType, Path.class, "Path", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ContentHubPackageImpl
