/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.contenthub.model.contentfragment.corefields.BooleanValue;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;
import de.enithing.contenthub.model.contentfragment.corefields.DateTimeType;
import de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue;
import de.enithing.contenthub.model.contentfragment.corefields.Enumeration;
import de.enithing.contenthub.model.contentfragment.corefields.EnumerationOption;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;
import de.enithing.contenthub.model.contentfragment.corefields.Json;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint;
import de.enithing.contenthub.model.contentfragment.corefields.NumberValidationType;
import de.enithing.contenthub.model.contentfragment.corefields.NumberValue;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contentfragment.corefields.Tags;
import de.enithing.contenthub.model.contentfragment.corefields.TextMimeType;
import de.enithing.contenthub.model.contentfragment.corefields.TextValidationType;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationPackage;
import de.enithing.contenthub.model.contentfragment.corefields.validation.impl.ValidationPackageImpl;
import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl;

import de.enithing.contenthub.model.contenthub.ContentHubPackage;

import de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl;

import java.util.Date;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	private EClass stringValueEClass = null;

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
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonEClass = null;

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
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textMimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textValidationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberTypeHintEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberValidationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateTimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentReferenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);
		ValidationPackageImpl theValidationPackage = (ValidationPackageImpl)(registeredPackage instanceof ValidationPackageImpl ? registeredPackage : ValidationPackage.eINSTANCE);

		// Create package meta-data objects
		theCorefieldsPackage.createPackageContents();
		theContentHubPackage.createPackageContents();
		theContentFragmentPackage.createPackageContents();
		theValidationPackage.createPackageContents();

		// Initialize created meta-data
		theCorefieldsPackage.initializePackageContents();
		theContentHubPackage.initializePackageContents();
		theContentFragmentPackage.initializePackageContents();
		theValidationPackage.initializePackageContents();

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
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getNumber_Placeholder() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumber_Type() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumber_DefaultValue() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumber_Required() {
		return (EAttribute)numberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumber_ValidationConstraint() {
		return (EReference)numberEClass.getEStructuralFeatures().get(4);
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
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoolean_DefaultValue() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoolean_Required() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Placeholder() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Type() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_DefaultValue() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Required() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTimeValue() {
		return dateTimeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTimeValue_Value() {
		return (EAttribute)dateTimeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationOption() {
		return enumerationOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumerationOption_Key() {
		return (EAttribute)enumerationOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumerationOption_Value() {
		return (EAttribute)enumerationOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumeration_Options() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumeration_Placeholder() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumeration_Required() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumeration_Unique() {
		return (EAttribute)enumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTags() {
		return tagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTags_Placeholder() {
		return (EAttribute)tagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTags_Required() {
		return (EAttribute)tagsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTags_RootPath() {
		return (EReference)tagsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentReference() {
		return contentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentReference_Placeholder() {
		return (EAttribute)contentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentReference_DefaultValue() {
		return (EAttribute)contentReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentReference_RootPath() {
		return (EReference)contentReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentReference_Required() {
		return (EAttribute)contentReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentReference_AllowedContentTypes() {
		return (EAttribute)contentReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentReference_ShowThumbnail() {
		return (EAttribute)contentReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentReference_FileSizeValidationConstraint() {
		return (EReference)contentReferenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentReference_ImageWidthConstraint() {
		return (EReference)contentReferenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentReference_ImageHeightConstraint() {
		return (EReference)contentReferenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentReferenceValue() {
		return contentReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentReferenceValue_Value() {
		return (EAttribute)contentReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFragmentReference() {
		return fragmentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFragmentReference_Placeholder() {
		return (EAttribute)fragmentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFragmentReference_AllowedModels() {
		return (EReference)fragmentReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFragmentReference_RootPath() {
		return (EReference)fragmentReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFragmentReference_AllowFragmentCreation() {
		return (EAttribute)fragmentReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFragmentReference_Required() {
		return (EAttribute)fragmentReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFragmentReferenceValue() {
		return fragmentReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFragmentReferenceValue_Fragments() {
		return (EReference)fragmentReferenceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJson() {
		return jsonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJson_Placeholder() {
		return (EAttribute)jsonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJson_Required() {
		return (EAttribute)jsonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJson_Translatable() {
		return (EAttribute)jsonEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getSingleLineText_Placeholder() {
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
	public EAttribute getSingleLineText_ValidationType() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleLineText_ValidationRegex() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleLineText_CustomErrorMessage() {
		return (EAttribute)singleLineTextEClass.getEStructuralFeatures().get(8);
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
	public EReference getMultiLineText_AllowedFragmentModels() {
		return (EReference)multiLineTextEClass.getEStructuralFeatures().get(1);
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
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTextMimeType() {
		return textMimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTextValidationType() {
		return textValidationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNumberTypeHint() {
		return numberTypeHintEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNumberValidationType() {
		return numberValidationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDateTimeType() {
		return dateTimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContentReferenceType() {
		return contentReferenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDate() {
		return dateEDataType;
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
		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		singleLineTextEClass = createEClass(SINGLE_LINE_TEXT);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__PLACEHOLDER);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__DEFAULT_VALUE);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__MAX_LENGTH);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__REQUIRED);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__UNIQUE);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__TRANSLATABLE);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__VALIDATION_TYPE);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__VALIDATION_REGEX);
		createEAttribute(singleLineTextEClass, SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE);

		multiLineTextEClass = createEClass(MULTI_LINE_TEXT);
		createEAttribute(multiLineTextEClass, MULTI_LINE_TEXT__DEFAULT_TYPE);
		createEReference(multiLineTextEClass, MULTI_LINE_TEXT__ALLOWED_FRAGMENT_MODELS);
		createEAttribute(multiLineTextEClass, MULTI_LINE_TEXT__REQUIRED);
		createEAttribute(multiLineTextEClass, MULTI_LINE_TEXT__TRANSLATABLE);

		numberEClass = createEClass(NUMBER);
		createEAttribute(numberEClass, NUMBER__PLACEHOLDER);
		createEAttribute(numberEClass, NUMBER__TYPE);
		createEAttribute(numberEClass, NUMBER__DEFAULT_VALUE);
		createEAttribute(numberEClass, NUMBER__REQUIRED);
		createEReference(numberEClass, NUMBER__VALIDATION_CONSTRAINT);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEAttribute(numberValueEClass, NUMBER_VALUE__VALUE);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__DEFAULT_VALUE);
		createEAttribute(booleanEClass, BOOLEAN__REQUIRED);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__PLACEHOLDER);
		createEAttribute(dateTimeEClass, DATE_TIME__TYPE);
		createEAttribute(dateTimeEClass, DATE_TIME__DEFAULT_VALUE);
		createEAttribute(dateTimeEClass, DATE_TIME__REQUIRED);

		dateTimeValueEClass = createEClass(DATE_TIME_VALUE);
		createEAttribute(dateTimeValueEClass, DATE_TIME_VALUE__VALUE);

		enumerationOptionEClass = createEClass(ENUMERATION_OPTION);
		createEAttribute(enumerationOptionEClass, ENUMERATION_OPTION__KEY);
		createEAttribute(enumerationOptionEClass, ENUMERATION_OPTION__VALUE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OPTIONS);
		createEAttribute(enumerationEClass, ENUMERATION__PLACEHOLDER);
		createEAttribute(enumerationEClass, ENUMERATION__REQUIRED);
		createEAttribute(enumerationEClass, ENUMERATION__UNIQUE);

		tagsEClass = createEClass(TAGS);
		createEAttribute(tagsEClass, TAGS__PLACEHOLDER);
		createEAttribute(tagsEClass, TAGS__REQUIRED);
		createEReference(tagsEClass, TAGS__ROOT_PATH);

		contentReferenceEClass = createEClass(CONTENT_REFERENCE);
		createEAttribute(contentReferenceEClass, CONTENT_REFERENCE__PLACEHOLDER);
		createEAttribute(contentReferenceEClass, CONTENT_REFERENCE__DEFAULT_VALUE);
		createEReference(contentReferenceEClass, CONTENT_REFERENCE__ROOT_PATH);
		createEAttribute(contentReferenceEClass, CONTENT_REFERENCE__REQUIRED);
		createEAttribute(contentReferenceEClass, CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES);
		createEAttribute(contentReferenceEClass, CONTENT_REFERENCE__SHOW_THUMBNAIL);
		createEReference(contentReferenceEClass, CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT);
		createEReference(contentReferenceEClass, CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT);
		createEReference(contentReferenceEClass, CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT);

		contentReferenceValueEClass = createEClass(CONTENT_REFERENCE_VALUE);
		createEAttribute(contentReferenceValueEClass, CONTENT_REFERENCE_VALUE__VALUE);

		fragmentReferenceEClass = createEClass(FRAGMENT_REFERENCE);
		createEAttribute(fragmentReferenceEClass, FRAGMENT_REFERENCE__PLACEHOLDER);
		createEReference(fragmentReferenceEClass, FRAGMENT_REFERENCE__ALLOWED_MODELS);
		createEReference(fragmentReferenceEClass, FRAGMENT_REFERENCE__ROOT_PATH);
		createEAttribute(fragmentReferenceEClass, FRAGMENT_REFERENCE__ALLOW_FRAGMENT_CREATION);
		createEAttribute(fragmentReferenceEClass, FRAGMENT_REFERENCE__REQUIRED);

		fragmentReferenceValueEClass = createEClass(FRAGMENT_REFERENCE_VALUE);
		createEReference(fragmentReferenceValueEClass, FRAGMENT_REFERENCE_VALUE__FRAGMENTS);

		jsonEClass = createEClass(JSON);
		createEAttribute(jsonEClass, JSON__PLACEHOLDER);
		createEAttribute(jsonEClass, JSON__REQUIRED);
		createEAttribute(jsonEClass, JSON__TRANSLATABLE);

		tabEClass = createEClass(TAB);

		// Create enums
		textMimeTypeEEnum = createEEnum(TEXT_MIME_TYPE);
		textValidationTypeEEnum = createEEnum(TEXT_VALIDATION_TYPE);
		numberTypeHintEEnum = createEEnum(NUMBER_TYPE_HINT);
		numberValidationTypeEEnum = createEEnum(NUMBER_VALIDATION_TYPE);
		dateTimeTypeEEnum = createEEnum(DATE_TIME_TYPE);
		contentReferenceTypeEEnum = createEEnum(CONTENT_REFERENCE_TYPE);

		// Create data types
		dateEDataType = createEDataType(DATE);
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
		ValidationPackage theValidationPackage = (ValidationPackage)EPackage.Registry.INSTANCE.getEPackage(ValidationPackage.eNS_URI);
		ContentFragmentPackage theContentFragmentPackage = (ContentFragmentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentFragmentPackage.eNS_URI);
		ContentHubPackage theContentHubPackage = (ContentHubPackage)EPackage.Registry.INSTANCE.getEPackage(ContentHubPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theValidationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		stringValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());
		EGenericType g1 = createEGenericType(theContentFragmentPackage.getMultiFieldType());
		EGenericType g2 = createEGenericType(this.getStringValue());
		g1.getETypeArguments().add(g2);
		singleLineTextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theContentFragmentPackage.getMultiFieldType());
		g2 = createEGenericType(this.getStringValue());
		g1.getETypeArguments().add(g2);
		multiLineTextEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theContentFragmentPackage.getSimpleFieldType());
		g2 = createEGenericType(this.getNumberValue());
		g1.getETypeArguments().add(g2);
		numberEClass.getEGenericSuperTypes().add(g1);
		numberValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());
		g1 = createEGenericType(theContentFragmentPackage.getSimpleFieldType());
		g2 = createEGenericType(this.getBooleanValue());
		g1.getETypeArguments().add(g2);
		booleanEClass.getEGenericSuperTypes().add(g1);
		booleanValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());
		g1 = createEGenericType(theContentFragmentPackage.getSimpleFieldType());
		g2 = createEGenericType(this.getDateTimeValue());
		g1.getETypeArguments().add(g2);
		dateTimeEClass.getEGenericSuperTypes().add(g1);
		dateTimeValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());
		g1 = createEGenericType(theContentFragmentPackage.getSimpleFieldType());
		g2 = createEGenericType(this.getStringValue());
		g1.getETypeArguments().add(g2);
		enumerationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theContentFragmentPackage.getMultiFieldType());
		g2 = createEGenericType(this.getStringValue());
		g1.getETypeArguments().add(g2);
		tagsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theContentFragmentPackage.getMultiFieldType());
		g2 = createEGenericType(this.getContentReferenceValue());
		g1.getETypeArguments().add(g2);
		contentReferenceEClass.getEGenericSuperTypes().add(g1);
		contentReferenceValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());
		g1 = createEGenericType(theContentFragmentPackage.getMultiFieldType());
		g2 = createEGenericType(this.getFragmentReferenceValue());
		g1.getETypeArguments().add(g2);
		fragmentReferenceEClass.getEGenericSuperTypes().add(g1);
		fragmentReferenceValueEClass.getESuperTypes().add(theContentFragmentPackage.getContentFragmentFieldValue());
		g1 = createEGenericType(theContentFragmentPackage.getSimpleFieldType());
		g2 = createEGenericType(this.getStringValue());
		g1.getETypeArguments().add(g2);
		jsonEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theContentFragmentPackage.getGroupFieldType());
		g2 = createEGenericType(theContentFragmentPackage.getContentFragmentFieldValue());
		g1.getETypeArguments().add(g2);
		tabEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleLineTextEClass, SingleLineText.class, "SingleLineText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleLineText_Placeholder(), ecorePackage.getEString(), "placeholder", null, 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_MaxLength(), ecorePackage.getEInt(), "maxLength", "255", 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_Unique(), ecorePackage.getEBoolean(), "unique", "false", 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_Translatable(), ecorePackage.getEBoolean(), "translatable", "false", 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_ValidationType(), this.getTextValidationType(), "validationType", "None", 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_ValidationRegex(), ecorePackage.getEString(), "validationRegex", null, 0, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleLineText_CustomErrorMessage(), ecorePackage.getEString(), "customErrorMessage", null, 1, 1, SingleLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiLineTextEClass, MultiLineText.class, "MultiLineText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiLineText_DefaultType(), this.getTextMimeType(), "defaultType", "text/html", 1, 1, MultiLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiLineText_AllowedFragmentModels(), theContentFragmentPackage.getContentFragmentModel(), null, "allowedFragmentModels", null, 0, -1, MultiLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiLineText_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, MultiLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiLineText_Translatable(), ecorePackage.getEBoolean(), "translatable", "false", 1, 1, MultiLineText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberEClass, de.enithing.contenthub.model.contentfragment.corefields.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumber_Placeholder(), ecorePackage.getEString(), "placeholder", null, 1, 1, de.enithing.contenthub.model.contentfragment.corefields.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumber_Type(), this.getNumberTypeHint(), "type", "long", 1, 1, de.enithing.contenthub.model.contentfragment.corefields.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumber_DefaultValue(), ecorePackage.getEBigDecimal(), "defaultValue", "0", 1, 1, de.enithing.contenthub.model.contentfragment.corefields.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumber_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, de.enithing.contenthub.model.contentfragment.corefields.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theValidationPackage.getValidationConstraint());
		g2 = createEGenericType(ecorePackage.getEBigDecimal());
		g1.getETypeArguments().add(g2);
		initEReference(getNumber_ValidationConstraint(), g1, null, "validationConstraint", null, 0, 1, de.enithing.contenthub.model.contentfragment.corefields.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_Value(), ecorePackage.getEBigDecimal(), "value", null, 1, 1, NumberValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, de.enithing.contenthub.model.contentfragment.corefields.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_DefaultValue(), ecorePackage.getEBoolean(), "defaultValue", "false", 1, 1, de.enithing.contenthub.model.contentfragment.corefields.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoolean_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, de.enithing.contenthub.model.contentfragment.corefields.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Placeholder(), ecorePackage.getEString(), "placeholder", "YYYY-MM-DD HH:mm:ss", 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Type(), this.getDateTimeType(), "type", "datetime", 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_DefaultValue(), this.getDate(), "defaultValue", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDateTime_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeValueEClass, DateTimeValue.class, "DateTimeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeValue_Value(), this.getDate(), "value", null, 1, 1, DateTimeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationOptionEClass, EnumerationOption.class, "EnumerationOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationOption_Key(), ecorePackage.getEString(), "key", null, 1, 1, EnumerationOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationOption_Value(), ecorePackage.getEString(), "value", null, 1, 1, EnumerationOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Options(), this.getEnumerationOption(), null, "options", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumeration_Placeholder(), ecorePackage.getEString(), "placeholder", null, 1, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumeration_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumeration_Unique(), ecorePackage.getEBoolean(), "unique", "false", 1, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagsEClass, Tags.class, "Tags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTags_Placeholder(), ecorePackage.getEString(), "placeholder", null, 1, 1, Tags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTags_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, Tags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTags_RootPath(), theContentHubPackage.getPathProvider(), null, "rootPath", null, 1, 1, Tags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentReferenceEClass, ContentReference.class, "ContentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentReference_Placeholder(), ecorePackage.getEString(), "placeholder", null, 1, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentReference_DefaultValue(), theContentHubPackage.getPath(), "defaultValue", null, 0, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentReference_RootPath(), theContentHubPackage.getPathProvider(), null, "rootPath", null, 1, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentReference_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentReference_AllowedContentTypes(), this.getContentReferenceType(), "allowedContentTypes", null, 0, -1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentReference_ShowThumbnail(), ecorePackage.getEBoolean(), "showThumbnail", "false", 1, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theValidationPackage.getValidationConstraint());
		g2 = createEGenericType(theValidationPackage.getFileSizeValue());
		g1.getETypeArguments().add(g2);
		initEReference(getContentReference_FileSizeValidationConstraint(), g1, null, "fileSizeValidationConstraint", null, 0, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theValidationPackage.getValidationConstraint());
		g2 = createEGenericType(ecorePackage.getEBigInteger());
		g1.getETypeArguments().add(g2);
		initEReference(getContentReference_ImageWidthConstraint(), g1, null, "imageWidthConstraint", null, 0, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theValidationPackage.getValidationConstraint());
		g2 = createEGenericType(ecorePackage.getEBigInteger());
		g1.getETypeArguments().add(g2);
		initEReference(getContentReference_ImageHeightConstraint(), g1, null, "imageHeightConstraint", null, 0, 1, ContentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentReferenceValueEClass, ContentReferenceValue.class, "ContentReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentReferenceValue_Value(), theContentHubPackage.getPath(), "value", null, 1, 1, ContentReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentReferenceEClass, FragmentReference.class, "FragmentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFragmentReference_Placeholder(), ecorePackage.getEString(), "placeholder", null, 1, 1, FragmentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFragmentReference_AllowedModels(), theContentFragmentPackage.getContentFragmentModel(), null, "allowedModels", null, 0, -1, FragmentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFragmentReference_RootPath(), theContentHubPackage.getPathProvider(), null, "rootPath", null, 1, 1, FragmentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFragmentReference_AllowFragmentCreation(), ecorePackage.getEBoolean(), "allowFragmentCreation", "true", 1, 1, FragmentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFragmentReference_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, FragmentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentReferenceValueEClass, FragmentReferenceValue.class, "FragmentReferenceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragmentReferenceValue_Fragments(), theContentFragmentPackage.getContentFragmentInstance(), null, "fragments", null, 0, -1, FragmentReferenceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonEClass, Json.class, "Json", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJson_Placeholder(), ecorePackage.getEString(), "placeholder", null, 1, 1, Json.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJson_Required(), ecorePackage.getEBoolean(), "required", "false", 1, 1, Json.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJson_Translatable(), ecorePackage.getEBoolean(), "translatable", "false", 1, 1, Json.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(textMimeTypeEEnum, TextMimeType.class, "TextMimeType");
		addEEnumLiteral(textMimeTypeEEnum, TextMimeType.RICHTEXT);
		addEEnumLiteral(textMimeTypeEEnum, TextMimeType.MARKDOWN);
		addEEnumLiteral(textMimeTypeEEnum, TextMimeType.PLAINTEXT);

		initEEnum(textValidationTypeEEnum, TextValidationType.class, "TextValidationType");
		addEEnumLiteral(textValidationTypeEEnum, TextValidationType.NONE);
		addEEnumLiteral(textValidationTypeEEnum, TextValidationType.EMAIL);
		addEEnumLiteral(textValidationTypeEEnum, TextValidationType.URL);
		addEEnumLiteral(textValidationTypeEEnum, TextValidationType.CUSTOM);

		initEEnum(numberTypeHintEEnum, NumberTypeHint.class, "NumberTypeHint");
		addEEnumLiteral(numberTypeHintEEnum, NumberTypeHint.INTEGER);
		addEEnumLiteral(numberTypeHintEEnum, NumberTypeHint.FRACTION);

		initEEnum(numberValidationTypeEEnum, NumberValidationType.class, "NumberValidationType");
		addEEnumLiteral(numberValidationTypeEEnum, NumberValidationType.NONE);
		addEEnumLiteral(numberValidationTypeEEnum, NumberValidationType.GREATER_THAN_OR_EQUAL_TO);
		addEEnumLiteral(numberValidationTypeEEnum, NumberValidationType.LESS_THAN_OR_EQUAL_TO);
		addEEnumLiteral(numberValidationTypeEEnum, NumberValidationType.BETWEEN);

		initEEnum(dateTimeTypeEEnum, DateTimeType.class, "DateTimeType");
		addEEnumLiteral(dateTimeTypeEEnum, DateTimeType.DATE_AND_TIME);
		addEEnumLiteral(dateTimeTypeEEnum, DateTimeType.DATE_ONLY);
		addEEnumLiteral(dateTimeTypeEEnum, DateTimeType.TIME_ONLY);

		initEEnum(contentReferenceTypeEEnum, ContentReferenceType.class, "ContentReferenceType");
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.RICHTEXT);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.PLAINTEXT);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.IMAGE);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.AUDIO);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.VIDEO);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.CONTENT_FRAGMENT);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.PDF);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.SPREAD_SHEET);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.PRESENTATION);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.ARCHIVE);
		addEEnumLiteral(contentReferenceTypeEEnum, ContentReferenceType.MARKUP);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //CorefieldsPackageImpl
