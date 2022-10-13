/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.GroupFieldType;
import de.enithing.fragmenthub.model.contentfragment.MultiFieldType;
import de.enithing.fragmenthub.model.contentfragment.SimpleFieldType;
import de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.fragmenthub.model.contentfragment.corefields.ContentReferenceValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTime;
import de.enithing.fragmenthub.model.contentfragment.corefields.DateTimeValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.Enumeration;
import de.enithing.fragmenthub.model.contentfragment.corefields.EnumerationOption;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.fragmenthub.model.contentfragment.corefields.FragmentReferenceValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.Json;
import de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.NumberValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.StringValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tab;
import de.enithing.fragmenthub.model.contentfragment.corefields.Tags;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage
 * @generated
 */
public class CorefieldsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorefieldsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorefieldsSwitch() {
		if (modelPackage == null) {
			modelPackage = CorefieldsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorefieldsPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseContentFragmentFieldValue(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.SINGLE_LINE_TEXT: {
				SingleLineText singleLineText = (SingleLineText)theEObject;
				T result = caseSingleLineText(singleLineText);
				if (result == null) result = caseMultiFieldType(singleLineText);
				if (result == null) result = caseSimpleFieldType(singleLineText);
				if (result == null) result = caseContentFragmentFieldType(singleLineText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.MULTI_LINE_TEXT: {
				MultiLineText multiLineText = (MultiLineText)theEObject;
				T result = caseMultiLineText(multiLineText);
				if (result == null) result = caseMultiFieldType(multiLineText);
				if (result == null) result = caseSimpleFieldType(multiLineText);
				if (result == null) result = caseContentFragmentFieldType(multiLineText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.NUMBER: {
				de.enithing.fragmenthub.model.contentfragment.corefields.Number number = (de.enithing.fragmenthub.model.contentfragment.corefields.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseMultiFieldType(number);
				if (result == null) result = caseSimpleFieldType(number);
				if (result == null) result = caseContentFragmentFieldType(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.NUMBER_VALUE: {
				NumberValue numberValue = (NumberValue)theEObject;
				T result = caseNumberValue(numberValue);
				if (result == null) result = caseContentFragmentFieldValue(numberValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.BOOLEAN: {
				de.enithing.fragmenthub.model.contentfragment.corefields.Boolean boolean_ = (de.enithing.fragmenthub.model.contentfragment.corefields.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseSimpleFieldType(boolean_);
				if (result == null) result = caseContentFragmentFieldType(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.BOOLEAN_VALUE: {
				BooleanValue booleanValue = (BooleanValue)theEObject;
				T result = caseBooleanValue(booleanValue);
				if (result == null) result = caseContentFragmentFieldValue(booleanValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseSimpleFieldType(dateTime);
				if (result == null) result = caseContentFragmentFieldType(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.DATE_TIME_VALUE: {
				DateTimeValue dateTimeValue = (DateTimeValue)theEObject;
				T result = caseDateTimeValue(dateTimeValue);
				if (result == null) result = caseContentFragmentFieldValue(dateTimeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.ENUMERATION_OPTION: {
				EnumerationOption enumerationOption = (EnumerationOption)theEObject;
				T result = caseEnumerationOption(enumerationOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseSimpleFieldType(enumeration);
				if (result == null) result = caseContentFragmentFieldType(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.TAGS: {
				Tags tags = (Tags)theEObject;
				T result = caseTags(tags);
				if (result == null) result = caseMultiFieldType(tags);
				if (result == null) result = caseSimpleFieldType(tags);
				if (result == null) result = caseContentFragmentFieldType(tags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.CONTENT_REFERENCE: {
				ContentReference contentReference = (ContentReference)theEObject;
				T result = caseContentReference(contentReference);
				if (result == null) result = caseMultiFieldType(contentReference);
				if (result == null) result = caseSimpleFieldType(contentReference);
				if (result == null) result = caseContentFragmentFieldType(contentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.CONTENT_REFERENCE_VALUE: {
				ContentReferenceValue contentReferenceValue = (ContentReferenceValue)theEObject;
				T result = caseContentReferenceValue(contentReferenceValue);
				if (result == null) result = caseContentFragmentFieldValue(contentReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.FRAGMENT_REFERENCE: {
				FragmentReference fragmentReference = (FragmentReference)theEObject;
				T result = caseFragmentReference(fragmentReference);
				if (result == null) result = caseMultiFieldType(fragmentReference);
				if (result == null) result = caseSimpleFieldType(fragmentReference);
				if (result == null) result = caseContentFragmentFieldType(fragmentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE: {
				FragmentReferenceValue fragmentReferenceValue = (FragmentReferenceValue)theEObject;
				T result = caseFragmentReferenceValue(fragmentReferenceValue);
				if (result == null) result = caseContentFragmentFieldValue(fragmentReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.JSON: {
				Json json = (Json)theEObject;
				T result = caseJson(json);
				if (result == null) result = caseSimpleFieldType(json);
				if (result == null) result = caseContentFragmentFieldType(json);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.TAB: {
				Tab tab = (Tab)theEObject;
				T result = caseTab(tab);
				if (result == null) result = caseGroupFieldType(tab);
				if (result == null) result = caseContentFragmentFieldType(tab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(de.enithing.fragmenthub.model.contentfragment.corefields.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberValue(NumberValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(de.enithing.fragmenthub.model.contentfragment.corefields.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeValue(DateTimeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationOption(EnumerationOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTags(Tags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentReference(ContentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentReferenceValue(ContentReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentReference(FragmentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragmentReferenceValue(FragmentReferenceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJson(Json object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Line Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Line Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleLineText(SingleLineText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Line Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Line Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLineText(MultiLineText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTab(Tab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TValue extends ContentFragmentFieldValue> T caseContentFragmentFieldType(ContentFragmentFieldType<TValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TValue extends ContentFragmentFieldValue> T caseSimpleFieldType(SimpleFieldType<TValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentFragmentFieldValue(ContentFragmentFieldValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TValue extends ContentFragmentFieldValue> T caseGroupFieldType(GroupFieldType<TValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <TValue extends ContentFragmentFieldValue> T caseMultiFieldType(MultiFieldType<TValue> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CorefieldsSwitch
