/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.StringValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 3;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.BooleanImpl <em>Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.BooleanImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 5;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.DateTimeImpl <em>Date Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.DateTimeImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 7;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.EnumerationImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 9;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl <em>Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTags()
	 * @generated
	 */
	int TAGS = 10;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl <em>Content Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentReference()
	 * @generated
	 */
	int CONTENT_REFERENCE = 11;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl <em>Fragment Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getFragmentReference()
	 * @generated
	 */
	int FRAGMENT_REFERENCE = 13;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceValueImpl <em>Fragment Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getFragmentReferenceValue()
	 * @generated
	 */
	int FRAGMENT_REFERENCE_VALUE = 14;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.JsonImpl <em>Json</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.JsonImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getJson()
	 * @generated
	 */
	int JSON = 15;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl <em>Single Line Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getSingleLineText()
	 * @generated
	 */
	int SINGLE_LINE_TEXT = 1;

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
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__MAX_ITEMS = ContentFragmentPackage.MULTI_FIELD_TYPE__MAX_ITEMS;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__PLACEHOLDER = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Validation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__VALIDATION_TYPE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Validation Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__VALIDATION_REGEX = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Custom Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Single Line Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT_FEATURE_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 9;

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
	int MULTI_LINE_TEXT = 2;

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
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_TEXT__MAX_ITEMS = ContentFragmentPackage.MULTI_FIELD_TYPE__MAX_ITEMS;

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
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__PLACEHOLDER = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__TYPE = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__DEFAULT_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__REQUIRED = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Validation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALIDATION_CONSTRAINT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 5;

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
	int NUMBER_VALUE = 4;

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
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__PROPERTY_NAME = ContentFragmentPackage.SIMPLE_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__FIELD_LABEL = ContentFragmentPackage.SIMPLE_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DESCRIPTION = ContentFragmentPackage.SIMPLE_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__DEFAULT_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN__REQUIRED = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_FEATURE_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN___CREATE_EMPTY_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_OPERATION_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.BooleanValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__PROPERTY_NAME = ContentFragmentPackage.SIMPLE_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__FIELD_LABEL = ContentFragmentPackage.SIMPLE_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__DESCRIPTION = ContentFragmentPackage.SIMPLE_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__PLACEHOLDER = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__TYPE = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__DEFAULT_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME__REQUIRED = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_FEATURE_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME___CREATE_EMPTY_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Date Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_OPERATION_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.DateTimeValueImpl <em>Date Time Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.DateTimeValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getDateTimeValue()
	 * @generated
	 */
	int DATE_TIME_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE__VALUE = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE_FEATURE_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_VALUE_OPERATION_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PROPERTY_NAME = ContentFragmentPackage.SIMPLE_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__FIELD_LABEL = ContentFragmentPackage.SIMPLE_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DESCRIPTION = ContentFragmentPackage.SIMPLE_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__OPTIONS = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PLACEHOLDER = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__REQUIRED = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__UNIQUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION___CREATE_EMPTY_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__PROPERTY_NAME = ContentFragmentPackage.MULTI_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__FIELD_LABEL = ContentFragmentPackage.MULTI_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__DESCRIPTION = ContentFragmentPackage.MULTI_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__ALLOW_MULTIPLE = ContentFragmentPackage.MULTI_FIELD_TYPE__ALLOW_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__MAX_ITEMS = ContentFragmentPackage.MULTI_FIELD_TYPE__MAX_ITEMS;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__PLACEHOLDER = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__REQUIRED = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__ROOT_PATH = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_FEATURE_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS___CREATE_EMPTY_VALUE = ContentFragmentPackage.MULTI_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OPERATION_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__PROPERTY_NAME = ContentFragmentPackage.MULTI_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__FIELD_LABEL = ContentFragmentPackage.MULTI_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__DESCRIPTION = ContentFragmentPackage.MULTI_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ALLOW_MULTIPLE = ContentFragmentPackage.MULTI_FIELD_TYPE__ALLOW_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__MAX_ITEMS = ContentFragmentPackage.MULTI_FIELD_TYPE__MAX_ITEMS;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__PLACEHOLDER = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__DEFAULT_VALUE = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ROOT_PATH = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__REQUIRED = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allowed Content Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Show Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__SHOW_THUMBNAIL = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>File Size Validation Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image Width Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Image Height Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_FEATURE_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE___CREATE_EMPTY_VALUE = ContentFragmentPackage.MULTI_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Content Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_OPERATION_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceValueImpl <em>Content Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentReferenceValue()
	 * @generated
	 */
	int CONTENT_REFERENCE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_VALUE__VALUE = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_VALUE_FEATURE_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_REFERENCE_VALUE_OPERATION_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__PROPERTY_NAME = ContentFragmentPackage.MULTI_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__FIELD_LABEL = ContentFragmentPackage.MULTI_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__DESCRIPTION = ContentFragmentPackage.MULTI_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__ALLOW_MULTIPLE = ContentFragmentPackage.MULTI_FIELD_TYPE__ALLOW_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__MAX_ITEMS = ContentFragmentPackage.MULTI_FIELD_TYPE__MAX_ITEMS;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__PLACEHOLDER = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allowed Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__ALLOWED_MODELS = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__ROOT_PATH = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allow Fragment Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__ALLOW_FRAGMENT_CREATION = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE__REQUIRED = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Fragment Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE_FEATURE_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE___CREATE_EMPTY_VALUE = ContentFragmentPackage.MULTI_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Fragment Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE_OPERATION_COUNT = ContentFragmentPackage.MULTI_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE_VALUE__FRAGMENTS = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fragment Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE_VALUE_FEATURE_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fragment Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_REFERENCE_VALUE_OPERATION_COUNT = ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__PROPERTY_NAME = ContentFragmentPackage.SIMPLE_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__FIELD_LABEL = ContentFragmentPackage.SIMPLE_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__DESCRIPTION = ContentFragmentPackage.SIMPLE_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__PLACEHOLDER = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__REQUIRED = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Translatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__TRANSLATABLE = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Json</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FEATURE_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON___CREATE_EMPTY_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Json</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OPERATION_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TabImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 16;

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
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.TextMimeType <em>Text Mime Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.TextMimeType
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTextMimeType()
	 * @generated
	 */
	int TEXT_MIME_TYPE = 17;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.TextValidationType <em>Text Validation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.TextValidationType
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTextValidationType()
	 * @generated
	 */
	int TEXT_VALIDATION_TYPE = 18;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint <em>Number Type Hint</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumberTypeHint()
	 * @generated
	 */
	int NUMBER_TYPE_HINT = 19;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberValidationType <em>Number Validation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberValidationType
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumberValidationType()
	 * @generated
	 */
	int NUMBER_VALIDATION_TYPE = 20;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTimeType <em>Date Time Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTimeType
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 21;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType <em>Content Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentReferenceType()
	 * @generated
	 */
	int CONTENT_REFERENCE_TYPE = 22;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 23;

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

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
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Number#getPlaceholder()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Number#getType()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Number#getDefaultValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Number#isRequired()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Required();

	/**
	 * Returns the meta object for the containment reference '{@link de.enithing.contenthub.model.contentfragment.corefields.Number#getValidationConstraint <em>Validation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validation Constraint</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Number#getValidationConstraint()
	 * @see #getNumber()
	 * @generated
	 */
	EReference getNumber_ValidationConstraint();

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
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Boolean
	 * @generated
	 */
	EClass getBoolean();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Boolean#isDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Boolean#isDefaultValue()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Boolean#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Boolean#isRequired()
	 * @see #getBoolean()
	 * @generated
	 */
	EAttribute getBoolean_Required();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTime
	 * @generated
	 */
	EClass getDateTime();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTime#getPlaceholder()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTime#getType()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTime#getDefaultValue()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTime#isRequired()
	 * @see #getDateTime()
	 * @generated
	 */
	EAttribute getDateTime_Required();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue
	 * @generated
	 */
	EClass getDateTimeValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue#getValue()
	 * @see #getDateTimeValue()
	 * @generated
	 */
	EAttribute getDateTimeValue_Value();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the reference list '{@link de.enithing.contenthub.model.contentfragment.corefields.Enumeration#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Options</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Enumeration#getOptions()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Options();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Enumeration#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Enumeration#getPlaceholder()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Enumeration#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Enumeration#isRequired()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Enumeration#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Enumeration#isUnique()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Unique();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Tags
	 * @generated
	 */
	EClass getTags();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Tags#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Tags#getPlaceholder()
	 * @see #getTags()
	 * @generated
	 */
	EAttribute getTags_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Tags#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Tags#isRequired()
	 * @see #getTags()
	 * @generated
	 */
	EAttribute getTags_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Tags#getRootPath <em>Root Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Path</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Tags#getRootPath()
	 * @see #getTags()
	 * @generated
	 */
	EAttribute getTags_RootPath();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Reference</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference
	 * @generated
	 */
	EClass getContentReference();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getPlaceholder()
	 * @see #getContentReference()
	 * @generated
	 */
	EAttribute getContentReference_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getDefaultValue()
	 * @see #getContentReference()
	 * @generated
	 */
	EAttribute getContentReference_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getRootPath <em>Root Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Path</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getRootPath()
	 * @see #getContentReference()
	 * @generated
	 */
	EAttribute getContentReference_RootPath();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#isRequired()
	 * @see #getContentReference()
	 * @generated
	 */
	EAttribute getContentReference_Required();

	/**
	 * Returns the meta object for the attribute list '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getAllowedContentTypes <em>Allowed Content Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Allowed Content Types</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getAllowedContentTypes()
	 * @see #getContentReference()
	 * @generated
	 */
	EAttribute getContentReference_AllowedContentTypes();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#isShowThumbnail <em>Show Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Thumbnail</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#isShowThumbnail()
	 * @see #getContentReference()
	 * @generated
	 */
	EAttribute getContentReference_ShowThumbnail();

	/**
	 * Returns the meta object for the containment reference '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getFileSizeValidationConstraint <em>File Size Validation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Size Validation Constraint</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getFileSizeValidationConstraint()
	 * @see #getContentReference()
	 * @generated
	 */
	EReference getContentReference_FileSizeValidationConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getImageWidthConstraint <em>Image Width Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Width Constraint</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getImageWidthConstraint()
	 * @see #getContentReference()
	 * @generated
	 */
	EReference getContentReference_ImageWidthConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getImageHeightConstraint <em>Image Height Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Height Constraint</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference#getImageHeightConstraint()
	 * @see #getContentReference()
	 * @generated
	 */
	EReference getContentReference_ImageHeightConstraint();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue <em>Content Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Reference Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue
	 * @generated
	 */
	EClass getContentReferenceValue();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue#getValue()
	 * @see #getContentReferenceValue()
	 * @generated
	 */
	EAttribute getContentReferenceValue_Value();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference <em>Fragment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Reference</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReference
	 * @generated
	 */
	EClass getFragmentReference();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getPlaceholder()
	 * @see #getFragmentReference()
	 * @generated
	 */
	EAttribute getFragmentReference_Placeholder();

	/**
	 * Returns the meta object for the reference list '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getAllowedModels <em>Allowed Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Models</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getAllowedModels()
	 * @see #getFragmentReference()
	 * @generated
	 */
	EReference getFragmentReference_AllowedModels();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getRootPath <em>Root Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Path</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#getRootPath()
	 * @see #getFragmentReference()
	 * @generated
	 */
	EAttribute getFragmentReference_RootPath();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#isAllowFragmentCreation <em>Allow Fragment Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Fragment Creation</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#isAllowFragmentCreation()
	 * @see #getFragmentReference()
	 * @generated
	 */
	EAttribute getFragmentReference_AllowFragmentCreation();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReference#isRequired()
	 * @see #getFragmentReference()
	 * @generated
	 */
	EAttribute getFragmentReference_Required();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue <em>Fragment Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Reference Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue
	 * @generated
	 */
	EClass getFragmentReferenceValue();

	/**
	 * Returns the meta object for the reference list '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fragments</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue#getFragments()
	 * @see #getFragmentReferenceValue()
	 * @generated
	 */
	EReference getFragmentReferenceValue_Fragments();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.Json <em>Json</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Json
	 * @generated
	 */
	EClass getJson();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Json#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Json#getPlaceholder()
	 * @see #getJson()
	 * @generated
	 */
	EAttribute getJson_Placeholder();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Json#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Json#isRequired()
	 * @see #getJson()
	 * @generated
	 */
	EAttribute getJson_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.Json#isTranslatable <em>Translatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translatable</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Json#isTranslatable()
	 * @see #getJson()
	 * @generated
	 */
	EAttribute getJson_Translatable();

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
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getPlaceholder()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_Placeholder();

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
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getValidationType <em>Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getValidationType()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_ValidationType();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getValidationRegex <em>Validation Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Regex</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getValidationRegex()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_ValidationRegex();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getCustomErrorMessage <em>Custom Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Error Message</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText#getCustomErrorMessage()
	 * @see #getSingleLineText()
	 * @generated
	 */
	EAttribute getSingleLineText_CustomErrorMessage();

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
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.corefields.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for enum '{@link de.enithing.contenthub.model.contentfragment.corefields.TextMimeType <em>Text Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Mime Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.TextMimeType
	 * @generated
	 */
	EEnum getTextMimeType();

	/**
	 * Returns the meta object for enum '{@link de.enithing.contenthub.model.contentfragment.corefields.TextValidationType <em>Text Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Validation Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.TextValidationType
	 * @generated
	 */
	EEnum getTextValidationType();

	/**
	 * Returns the meta object for enum '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint <em>Number Type Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Type Hint</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint
	 * @generated
	 */
	EEnum getNumberTypeHint();

	/**
	 * Returns the meta object for enum '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberValidationType <em>Number Validation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Number Validation Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberValidationType
	 * @generated
	 */
	EEnum getNumberValidationType();

	/**
	 * Returns the meta object for enum '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Date Time Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTimeType
	 * @generated
	 */
	EEnum getDateTimeType();

	/**
	 * Returns the meta object for enum '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType <em>Content Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Content Reference Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType
	 * @generated
	 */
	EEnum getContentReferenceType();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

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
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.StringValueImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

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
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__PLACEHOLDER = eINSTANCE.getNumber_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__TYPE = eINSTANCE.getNumber_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__DEFAULT_VALUE = eINSTANCE.getNumber_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__REQUIRED = eINSTANCE.getNumber_Required();

		/**
		 * The meta object literal for the '<em><b>Validation Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER__VALIDATION_CONSTRAINT = eINSTANCE.getNumber_ValidationConstraint();

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
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.BooleanImpl <em>Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.BooleanImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getBoolean()
		 * @generated
		 */
		EClass BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__DEFAULT_VALUE = eINSTANCE.getBoolean_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN__REQUIRED = eINSTANCE.getBoolean_Required();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.BooleanValueImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.DateTimeImpl <em>Date Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.DateTimeImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getDateTime()
		 * @generated
		 */
		EClass DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__PLACEHOLDER = eINSTANCE.getDateTime_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__TYPE = eINSTANCE.getDateTime_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__DEFAULT_VALUE = eINSTANCE.getDateTime_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME__REQUIRED = eINSTANCE.getDateTime_Required();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.DateTimeValueImpl <em>Date Time Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.DateTimeValueImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getDateTimeValue()
		 * @generated
		 */
		EClass DATE_TIME_VALUE = eINSTANCE.getDateTimeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_VALUE__VALUE = eINSTANCE.getDateTimeValue_Value();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.EnumerationImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__OPTIONS = eINSTANCE.getEnumeration_Options();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__PLACEHOLDER = eINSTANCE.getEnumeration_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__REQUIRED = eINSTANCE.getEnumeration_Required();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__UNIQUE = eINSTANCE.getEnumeration_Unique();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl <em>Tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTags()
		 * @generated
		 */
		EClass TAGS = eINSTANCE.getTags();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGS__PLACEHOLDER = eINSTANCE.getTags_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGS__REQUIRED = eINSTANCE.getTags_Required();

		/**
		 * The meta object literal for the '<em><b>Root Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGS__ROOT_PATH = eINSTANCE.getTags_RootPath();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl <em>Content Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentReference()
		 * @generated
		 */
		EClass CONTENT_REFERENCE = eINSTANCE.getContentReference();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE__PLACEHOLDER = eINSTANCE.getContentReference_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE__DEFAULT_VALUE = eINSTANCE.getContentReference_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Root Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE__ROOT_PATH = eINSTANCE.getContentReference_RootPath();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE__REQUIRED = eINSTANCE.getContentReference_Required();

		/**
		 * The meta object literal for the '<em><b>Allowed Content Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES = eINSTANCE.getContentReference_AllowedContentTypes();

		/**
		 * The meta object literal for the '<em><b>Show Thumbnail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE__SHOW_THUMBNAIL = eINSTANCE.getContentReference_ShowThumbnail();

		/**
		 * The meta object literal for the '<em><b>File Size Validation Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT = eINSTANCE.getContentReference_FileSizeValidationConstraint();

		/**
		 * The meta object literal for the '<em><b>Image Width Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT = eINSTANCE.getContentReference_ImageWidthConstraint();

		/**
		 * The meta object literal for the '<em><b>Image Height Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT = eINSTANCE.getContentReference_ImageHeightConstraint();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceValueImpl <em>Content Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceValueImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentReferenceValue()
		 * @generated
		 */
		EClass CONTENT_REFERENCE_VALUE = eINSTANCE.getContentReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_REFERENCE_VALUE__VALUE = eINSTANCE.getContentReferenceValue_Value();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl <em>Fragment Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getFragmentReference()
		 * @generated
		 */
		EClass FRAGMENT_REFERENCE = eINSTANCE.getFragmentReference();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_REFERENCE__PLACEHOLDER = eINSTANCE.getFragmentReference_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Allowed Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_REFERENCE__ALLOWED_MODELS = eINSTANCE.getFragmentReference_AllowedModels();

		/**
		 * The meta object literal for the '<em><b>Root Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_REFERENCE__ROOT_PATH = eINSTANCE.getFragmentReference_RootPath();

		/**
		 * The meta object literal for the '<em><b>Allow Fragment Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_REFERENCE__ALLOW_FRAGMENT_CREATION = eINSTANCE.getFragmentReference_AllowFragmentCreation();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_REFERENCE__REQUIRED = eINSTANCE.getFragmentReference_Required();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceValueImpl <em>Fragment Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceValueImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getFragmentReferenceValue()
		 * @generated
		 */
		EClass FRAGMENT_REFERENCE_VALUE = eINSTANCE.getFragmentReferenceValue();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_REFERENCE_VALUE__FRAGMENTS = eINSTANCE.getFragmentReferenceValue_Fragments();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.JsonImpl <em>Json</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.JsonImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getJson()
		 * @generated
		 */
		EClass JSON = eINSTANCE.getJson();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON__PLACEHOLDER = eINSTANCE.getJson_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON__REQUIRED = eINSTANCE.getJson_Required();

		/**
		 * The meta object literal for the '<em><b>Translatable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON__TRANSLATABLE = eINSTANCE.getJson_Translatable();

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
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__PLACEHOLDER = eINSTANCE.getSingleLineText_Placeholder();

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
		 * The meta object literal for the '<em><b>Validation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__VALIDATION_TYPE = eINSTANCE.getSingleLineText_ValidationType();

		/**
		 * The meta object literal for the '<em><b>Validation Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__VALIDATION_REGEX = eINSTANCE.getSingleLineText_ValidationRegex();

		/**
		 * The meta object literal for the '<em><b>Custom Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE = eINSTANCE.getSingleLineText_CustomErrorMessage();

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
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TabImpl
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.TextMimeType <em>Text Mime Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.TextMimeType
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTextMimeType()
		 * @generated
		 */
		EEnum TEXT_MIME_TYPE = eINSTANCE.getTextMimeType();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.TextValidationType <em>Text Validation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.TextValidationType
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTextValidationType()
		 * @generated
		 */
		EEnum TEXT_VALIDATION_TYPE = eINSTANCE.getTextValidationType();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint <em>Number Type Hint</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumberTypeHint()
		 * @generated
		 */
		EEnum NUMBER_TYPE_HINT = eINSTANCE.getNumberTypeHint();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberValidationType <em>Number Validation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberValidationType
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getNumberValidationType()
		 * @generated
		 */
		EEnum NUMBER_VALIDATION_TYPE = eINSTANCE.getNumberValidationType();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTimeType <em>Date Time Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTimeType
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getDateTimeType()
		 * @generated
		 */
		EEnum DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType <em>Content Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getContentReferenceType()
		 * @generated
		 */
		EEnum CONTENT_REFERENCE_TYPE = eINSTANCE.getContentReferenceType();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

	}

} //CorefieldsPackage
