/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contenthub.ContentHubPackage;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage;

import de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.SingleLineTextValue;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contenthub.contentfragment.impl.ContentfragmentPackageImpl;

import de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
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
	private EClass singleLineTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleLineTextValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

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
	 * @see de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage#eNS_URI
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentfragmentPackage.eNS_URI);
		ContentfragmentPackageImpl theContentfragmentPackage = (ContentfragmentPackageImpl)(registeredPackage instanceof ContentfragmentPackageImpl ? registeredPackage : ContentfragmentPackage.eINSTANCE);

		// Create package meta-data objects
		theCorefieldsPackage.createPackageContents();
		theContentHubPackage.createPackageContents();
		theContentfragmentPackage.createPackageContents();

		// Initialize created meta-data
		theCorefieldsPackage.initializePackageContents();
		theContentHubPackage.initializePackageContents();
		theContentfragmentPackage.initializePackageContents();

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
	public EClass getSingleLineText() {
		return singleLineTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleLineText_PlaceholderText() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleLineTextValue() {
		return singleLineTextValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		singleLineTextEClass = createEClass(SINGLE_LINE_TEXT);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__PLACEHOLDER_TEXT);

		singleLineTextValueEClass = createEClass(SINGLE_LINE_TEXT_VALUE);

		tabEClass = createEClass(TAB);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theContentfragmentPackage.getSimpleFieldType());
		EGenericType g2 = createEGenericType(this.getSingleLineTextValue());
		g1.getETypeArguments().add(g2);
		singleLineTextEClass.getEGenericSuperTypes().add(g1);
		singleLineTextValueEClass.getESuperTypes().add(theContentfragmentPackage.getContentFragmentFieldValue());
		g1 = createEGenericType(theContentfragmentPackage.getGroupFieldType());
		g2 = createEGenericType(theContentfragmentPackage.getContentFragmentFieldValue());
		g1.getETypeArguments().add(g2);
		tabEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(singleLineTextEClass, SingleLineText.class, "SingleLineText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleLineText_PlaceholderText(), ecorePackage.getEString(), "placeholderText", null, 0, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleLineTextValueEClass, SingleLineTextValue.class, "SingleLineTextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //CorefieldsPackageImpl
