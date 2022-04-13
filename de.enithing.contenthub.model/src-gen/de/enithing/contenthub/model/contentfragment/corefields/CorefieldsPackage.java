/**
 */
package de.enithing.contenthub.model.contentfragment.corefields;

import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__ID = ContentFragmentPackage.SIMPLE_FIELD_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__LABEL = ContentFragmentPackage.SIMPLE_FIELD_TYPE__LABEL;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__ID = ContentFragmentPackage.SIMPLE_FIELD_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__LABEL = ContentFragmentPackage.SIMPLE_FIELD_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__DESCRIPTION = ContentFragmentPackage.SIMPLE_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Placeholder Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT__PLACEHOLDER_TEXT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Line Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT_FEATURE_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT___CREATE_EMPTY_VALUE = ContentFragmentPackage.SIMPLE_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Single Line Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_LINE_TEXT_OPERATION_COUNT = ContentFragmentPackage.SIMPLE_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TextValueImpl <em>Text Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.TextValueImpl
	 * @see de.enithing.contenthub.model.contentfragment.corefields.impl.CorefieldsPackageImpl#getTextValue()
	 * @generated
	 */
	int TEXT_VALUE = 3;

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
	int TAB = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__ID = ContentFragmentPackage.GROUP_FIELD_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__LABEL = ContentFragmentPackage.GROUP_FIELD_TYPE__LABEL;

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

	}

} //CorefieldsPackage
