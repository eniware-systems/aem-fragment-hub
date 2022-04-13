/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields.util;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldValue;
import de.enithing.contenthub.model.contenthub.contentfragment.GroupFieldType;
import de.enithing.contenthub.model.contenthub.contentfragment.SimpleFieldType;

import de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.NumberValue;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contenthub.contentfragment.corefields.TextValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see de.enithing.contenthub.model.contenthub.contentfragment.corefields.CorefieldsPackage
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
			case CorefieldsPackage.NUMBER: {
				de.enithing.contenthub.model.contenthub.contentfragment.corefields.Number number = (de.enithing.contenthub.model.contenthub.contentfragment.corefields.Number)theEObject;
				T result = caseNumber(number);
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
			case CorefieldsPackage.SINGLE_LINE_TEXT: {
				SingleLineText singleLineText = (SingleLineText)theEObject;
				T result = caseSingleLineText(singleLineText);
				if (result == null) result = caseSimpleFieldType(singleLineText);
				if (result == null) result = caseContentFragmentFieldType(singleLineText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorefieldsPackage.TEXT_VALUE: {
				TextValue textValue = (TextValue)theEObject;
				T result = caseTextValue(textValue);
				if (result == null) result = caseContentFragmentFieldValue(textValue);
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
	public T caseNumber(de.enithing.contenthub.model.contenthub.contentfragment.corefields.Number object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Text Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextValue(TextValue object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Content Fragment Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Fragment Field Type</em>'.
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
	 * Returns the result of interpreting the object as an instance of '<em>Content Fragment Field Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Fragment Field Value</em>'.
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
