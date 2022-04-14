/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsFactory
 * @model kind="package"
 * @generated
 */
public interface CorefieldsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "corefields";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://aemcontenthub.eniware-systems.de/ns/contentfragments/corefields";

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
	CorefieldsPackage eINSTANCE = de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__PROPERTY_NAME = ContentFragmentPackage.SIMPLE_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__FIELD_LABEL = ContentFragmentPackage.SIMPLE_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__DESCRIPTION = ContentFragmentPackage.SIMPLE_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Placeholder Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__PLACEHOLDER_TEXT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER___CREATE_EMPTY_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.NumberValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__VALUE = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_OPERATION_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl <em>Single Line Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getSingleLineText()
	 * @generated
	 */
	int SINGLE_LINE_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__PROPERTY_NAME = ContentFragmentPackage.MULTI_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__FIELD_LABEL = ContentFragmentPackage.MULTI_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__DESCRIPTION = ContentFragmentPackage.MULTI_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__ALLOW_MULTIPLE = ContentFragmentPackage.MULTI_FIELD_TYPE__ALLOW_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Placeholder Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__PLACEHOLDER_TEXT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__DEFAULT_VALUE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__MAX_LENGTH = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__REQUIRED = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__UNIQUE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__TRANSLATABLE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Single Line Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT_FEATURE_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT___CREATE_EMPTY_VALUE = ContentFragmentPackage.MULTI_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Single Line Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT_OPERATION_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.MultiLineTextImpl <em>Multi Line Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.MultiLineTextImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getMultiLineText()
	 * @generated
	 */
	int MULTI_LINE_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__PROPERTY_NAME = ContentFragmentPackage.MULTI_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__FIELD_LABEL = ContentFragmentPackage.MULTI_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__DESCRIPTION = ContentFragmentPackage.MULTI_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__ALLOW_MULTIPLE = ContentFragmentPackage.MULTI_FIELD_TYPE__ALLOW_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Default Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__DEFAULT_TYPE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Fragment Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__ALLOW_FRAGMENT_REFERENCE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__REQUIRED = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__TRANSLATABLE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multi Line Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_FEATURE_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT___CREATE_EMPTY_VALUE = ContentFragmentPackage.MULTI_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Multi Line Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT_OPERATION_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TextValueImpl <em>Text Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TextValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTextValue()
	 * @generated
	 */
	int TEXT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__TEXT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_FEATURE_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_OPERATION_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TabImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 5;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__PROPERTY_NAME = ContentFragmentPackage.GROUP_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__FIELD_LABEL = ContentFragmentPackage.GROUP_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__DESCRIPTION = ContentFragmentPackage.GROUP_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__FIELDS = ContentFragmentPackage.GROUP_FIELD_TYPE__FIELDS;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = ContentFragmentPackage.GROUP_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB___CREATE_EMPTY_VALUE = ContentFragmentPackage.GROUP_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_OPERATION_COUNT = ContentFragmentPackage.GROUP_FIELD_TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentFragmentReferenceImpl <em>Content Fragment Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.ContentFragmentReferenceImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentFragmentReference()
	 * @generated
	 */
	int CONTENT_FRAGMENT_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE__PROPERTY_NAME = ContentFragmentPackage.MULTI_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE__FIELD_LABEL = ContentFragmentPackage.MULTI_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE__DESCRIPTION = ContentFragmentPackage.MULTI_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE__ALLOW_MULTIPLE = ContentFragmentPackage.MULTI_FIELD_TYPE__ALLOW_MULTIPLE;

	/**
	 * The number of structural features of the '<em>Content Fragment Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE_FEATURE_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE___CREATE_EMPTY_VALUE = ContentFragmentPackage.MULTI_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Content Fragment Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE_OPERATION_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentFragmentReferenceValueImpl <em>Content Fragment Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.ContentFragmentReferenceValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentFragmentReferenceValue()
	 * @generated
	 */
	int CONTENT_FRAGMENT_REFERENCE_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE_VALUE__FRAGMENTS = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Fragment Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE_VALUE_FEATURE_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Fragment Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_REFERENCE_VALUE_OPERATION_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineTextType <em>Multi Line Text Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineTextType
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getMultiLineTextType()
	 * @generated
	 */
	int MULTI_LINE_TEXT_TYPE = 8;

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getPlaceholderText <em>Placeholder Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder Text</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Number#getPlaceholderText()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_PlaceholderText();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberValue#getValue()
	 * @see #getNumberValue()
	 * @generated
	 */
	EAttribute getNumberValue_Value();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText <em>Single Line Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Line Text</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText
	 * @generated
	 */
	EClass getSingleLineText();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getPlaceholderText <em>Placeholder Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder Text</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getPlaceholderText()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_PlaceholderText();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getDefaultValue()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getMaxLength()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isRequired()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isUnique()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_Unique();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isTranslatable <em>Translatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translatable</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#isTranslatable()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_Translatable();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText <em>Multi Line Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Line Text</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineText
	 * @generated
	 */
	EClass getMultiLineText();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#getDefaultType <em>Default Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#getDefaultType()
	 * @see #getMultiLineText()
	 * @generated
	 */
	EAttribute getMultiLineText_DefaultType();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isAllowFragmentReference <em>Allow Fragment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Fragment Reference</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isAllowFragmentReference()
	 * @see #getMultiLineText()
	 * @generated
	 */
	EAttribute getMultiLineText_AllowFragmentReference();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isRequired()
	 * @see #getMultiLineText()
	 * @generated
	 */
	EAttribute getMultiLineText_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isTranslatable <em>Translatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translatable</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineText#isTranslatable()
	 * @see #getMultiLineText()
	 * @generated
	 */
	EAttribute getMultiLineText_Translatable();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.TextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.TextValue
	 * @generated
	 */
	EClass getTextValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.TextValue#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.TextValue#getText()
	 * @see #getTextValue()
	 * @generated
	 */
	EAttribute getTextValue_Text();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentFragmentReference <em>Content Fragment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Fragment Reference</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentFragmentReference
	 * @generated
	 */
	EClass getContentFragmentReference();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentFragmentReferenceValue <em>Content Fragment Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Fragment Reference Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentFragmentReferenceValue
	 * @generated
	 */
	EClass getContentFragmentReferenceValue();

	/**
	 * Returns the meta object for the reference list '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentFragmentReferenceValue#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fragments</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentFragmentReferenceValue#getFragments()
	 * @see #getContentFragmentReferenceValue()
	 * @generated
	 */
	EReference getContentFragmentReferenceValue_Fragments();

	/**
	 * Returns the meta object for enum '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineTextType <em>Multi Line Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multi Line Text Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineTextType
	 * @generated
	 */
	EEnum getMultiLineTextType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CorefieldsFactory getCorefieldsFactory();

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
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Placeholder Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__PLACEHOLDER_TEXT = eINSTANCE.getNumber_PlaceholderText();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.NumberValueImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE__VALUE = eINSTANCE.getNumberValue_Value();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl <em>Single Line Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getSingleLineText()
		 * @generated
		 */
		EClass SINGLE_LINE_TEXT = eINSTANCE.getSingleLineText();

		/**
		 * The meta object literal for the '<em><b>Placeholder Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__PLACEHOLDER_TEXT = eINSTANCE.getSingleLineText_PlaceholderText();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__DEFAULT_VALUE = eINSTANCE.getSingleLineText_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__MAX_LENGTH = eINSTANCE.getSingleLineText_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__REQUIRED = eINSTANCE.getSingleLineText_Required();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__UNIQUE = eINSTANCE.getSingleLineText_Unique();

		/**
		 * The meta object literal for the '<em><b>Translatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__TRANSLATABLE = eINSTANCE.getSingleLineText_Translatable();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.MultiLineTextImpl <em>Multi Line Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.MultiLineTextImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getMultiLineText()
		 * @generated
		 */
		EClass MULTI_LINE_TEXT = eINSTANCE.getMultiLineText();

		/**
		 * The meta object literal for the '<em><b>Default Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_LINE_TEXT__DEFAULT_TYPE = eINSTANCE.getMultiLineText_DefaultType();

		/**
		 * The meta object literal for the '<em><b>Allow Fragment Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_LINE_TEXT__ALLOW_FRAGMENT_REFERENCE = eINSTANCE.getMultiLineText_AllowFragmentReference();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_LINE_TEXT__REQUIRED = eINSTANCE.getMultiLineText_Required();

		/**
		 * The meta object literal for the '<em><b>Translatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_LINE_TEXT__TRANSLATABLE = eINSTANCE.getMultiLineText_Translatable();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TextValueImpl <em>Text Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TextValueImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTextValue()
		 * @generated
		 */
		EClass TEXT_VALUE = eINSTANCE.getTextValue();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VALUE__TEXT = eINSTANCE.getTextValue_Text();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TabImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentFragmentReferenceImpl <em>Content Fragment Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.ContentFragmentReferenceImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentFragmentReference()
		 * @generated
		 */
		EClass CONTENT_FRAGMENT_REFERENCE = eINSTANCE.getContentFragmentReference();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentFragmentReferenceValueImpl <em>Content Fragment Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.ContentFragmentReferenceValueImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentFragmentReferenceValue()
		 * @generated
		 */
		EClass CONTENT_FRAGMENT_REFERENCE_VALUE = eINSTANCE.getContentFragmentReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_FRAGMENT_REFERENCE_VALUE__FRAGMENTS = eINSTANCE.getContentFragmentReferenceValue_Fragments();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineTextType <em>Multi Line Text Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineTextType
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getMultiLineTextType()
		 * @generated
		 */
		EEnum MULTI_LINE_TEXT_TYPE = eINSTANCE.getMultiLineTextType();

	}

} //CorefieldsPackage
