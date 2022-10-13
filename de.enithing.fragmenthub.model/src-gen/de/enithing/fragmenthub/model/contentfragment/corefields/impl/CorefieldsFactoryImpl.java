/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.fragmenthub.model.contentfragment.corefields.ContentReferenceType;
import de.enithing.fragmenthub.model.contentfragment.corefields.ContentReferenceValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsFactory;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTime;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTimeType;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTimeValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration;
import de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReferenceValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.Json;
import de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.NumberTypeHint;
import de.enithing.fragmenthub.model.contentfragment.corefields.NumberValidationType;
import de.enithing.fragmenthub.model.contentfragment.corefields.NumberValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.StringValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tab;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tags;
import de.enithing.fragmenthub.model.contentfragment.corefields.TextMimeType;
import de.enithing.fragmenthub.model.contentfragment.corefields.TextValidationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorefieldsFactoryImpl extends EFactoryImpl implements CorefieldsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CorefieldsFactory init() {
		try {
			CorefieldsFactory theCorefieldsFactory = (CorefieldsFactory)EPackage.Registry.INSTANCE.getEFactory(CorefieldsPackage.eNS_URI);
			if (theCorefieldsFactory != null) {
				return theCorefieldsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CorefieldsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorefieldsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorefieldsPackage.STRING_VALUE: return createStringValue();
			case CorefieldsPackage.SINGLE_LINE_TEXT: return createSingleLineText();
			case CorefieldsPackage.MULTI_LINE_TEXT: return createMultiLineText();
			case CorefieldsPackage.NUMBER: return createNumber();
			case CorefieldsPackage.NUMBER_VALUE: return createNumberValue();
			case CorefieldsPackage.BOOLEAN: return createBoolean();
			case CorefieldsPackage.BOOLEAN_VALUE: return createBooleanValue();
			case CorefieldsPackage.DATE_TIME: return createDateTime();
			case CorefieldsPackage.DATE_TIME_VALUE: return createDateTimeValue();
			case CorefieldsPackage.ENUMERATION_OPTION: return createEnumerationOption();
			case CorefieldsPackage.ENUMERATION: return createEnumeration();
			case CorefieldsPackage.TAGS: return createTags();
			case CorefieldsPackage.CONTENT_REFERENCE: return createContentReference();
			case CorefieldsPackage.CONTENT_REFERENCE_VALUE: return createContentReferenceValue();
			case CorefieldsPackage.FRAGMENT_REFERENCE: return createFragmentReference();
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE: return createFragmentReferenceValue();
			case CorefieldsPackage.JSON: return createJson();
			case CorefieldsPackage.TAB: return createTab();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorefieldsPackage.TEXT_MIME_TYPE:
				return createTextMimeTypeFromString(eDataType, initialValue);
			case CorefieldsPackage.TEXT_VALIDATION_TYPE:
				return createTextValidationTypeFromString(eDataType, initialValue);
			case CorefieldsPackage.NUMBER_TYPE_HINT:
				return createNumberTypeHintFromString(eDataType, initialValue);
			case CorefieldsPackage.NUMBER_VALIDATION_TYPE:
				return createNumberValidationTypeFromString(eDataType, initialValue);
			case CorefieldsPackage.DATE_TIME_TYPE:
				return createDateTimeTypeFromString(eDataType, initialValue);
			case CorefieldsPackage.CONTENT_REFERENCE_TYPE:
				return createContentReferenceTypeFromString(eDataType, initialValue);
			case CorefieldsPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorefieldsPackage.TEXT_MIME_TYPE:
				return convertTextMimeTypeToString(eDataType, instanceValue);
			case CorefieldsPackage.TEXT_VALIDATION_TYPE:
				return convertTextValidationTypeToString(eDataType, instanceValue);
			case CorefieldsPackage.NUMBER_TYPE_HINT:
				return convertNumberTypeHintToString(eDataType, instanceValue);
			case CorefieldsPackage.NUMBER_VALIDATION_TYPE:
				return convertNumberValidationTypeToString(eDataType, instanceValue);
			case CorefieldsPackage.DATE_TIME_TYPE:
				return convertDateTimeTypeToString(eDataType, instanceValue);
			case CorefieldsPackage.CONTENT_REFERENCE_TYPE:
				return convertContentReferenceTypeToString(eDataType, instanceValue);
			case CorefieldsPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.enithing.fragmenthub.model.contentfragment.corefields.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberValue createNumberValue() {
		NumberValueImpl numberValue = new NumberValueImpl();
		return numberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.enithing.fragmenthub.model.contentfragment.corefields.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimeValue createDateTimeValue() {
		DateTimeValueImpl dateTimeValue = new DateTimeValueImpl();
		return dateTimeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationOption createEnumerationOption() {
		EnumerationOptionImpl enumerationOption = new EnumerationOptionImpl();
		return enumerationOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tags createTags() {
		TagsImpl tags = new TagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentReference createContentReference() {
		ContentReferenceImpl contentReference = new ContentReferenceImpl();
		return contentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentReferenceValue createContentReferenceValue() {
		ContentReferenceValueImpl contentReferenceValue = new ContentReferenceValueImpl();
		return contentReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FragmentReference createFragmentReference() {
		FragmentReferenceImpl fragmentReference = new FragmentReferenceImpl();
		return fragmentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FragmentReferenceValue createFragmentReferenceValue() {
		FragmentReferenceValueImpl fragmentReferenceValue = new FragmentReferenceValueImpl();
		return fragmentReferenceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Json createJson() {
		JsonImpl json = new JsonImpl();
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleLineText createSingleLineText() {
		SingleLineTextImpl singleLineText = new SingleLineTextImpl();
		return singleLineText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLineText createMultiLineText() {
		MultiLineTextImpl multiLineText = new MultiLineTextImpl();
		return multiLineText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextMimeType createTextMimeTypeFromString(EDataType eDataType, String initialValue) {
		TextMimeType result = TextMimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextMimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextValidationType createTextValidationTypeFromString(EDataType eDataType, String initialValue) {
		TextValidationType result = TextValidationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextValidationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberTypeHint createNumberTypeHintFromString(EDataType eDataType, String initialValue) {
		NumberTypeHint result = NumberTypeHint.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberTypeHintToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValidationType createNumberValidationTypeFromString(EDataType eDataType, String initialValue) {
		NumberValidationType result = NumberValidationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberValidationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType createDateTimeTypeFromString(EDataType eDataType, String initialValue) {
		DateTimeType result = DateTimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentReferenceType createContentReferenceTypeFromString(EDataType eDataType, String initialValue) {
		ContentReferenceType result = ContentReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorefieldsPackage getCorefieldsPackage() {
		return (CorefieldsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorefieldsPackage getPackage() {
		return CorefieldsPackage.eINSTANCE;
	}

} //CorefieldsFactoryImpl
