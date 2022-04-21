/**
 */
package de.enithing.contenthub.model.contentfragment.util;

import de.enithing.contenthub.model.contentfragment.*;

import de.enithing.contenthub.model.contenthub.ContextPolicy;
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
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage
 * @generated
 */
public class ContentFragmentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContentFragmentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentSwitch() {
		if (modelPackage == null) {
			modelPackage = ContentFragmentPackage.eINSTANCE;
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL: {
				ContentFragmentModel contentFragmentModel = (ContentFragmentModel)theEObject;
				T result = caseContentFragmentModel(contentFragmentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE: {
				ContentFragmentFieldType<?> contentFragmentFieldType = (ContentFragmentFieldType<?>)theEObject;
				T result = caseContentFragmentFieldType(contentFragmentFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentFragmentPackage.CONTENT_FRAGMENT_INSTANCE: {
				ContentFragmentInstance contentFragmentInstance = (ContentFragmentInstance)theEObject;
				T result = caseContentFragmentInstance(contentFragmentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE: {
				ContentFragmentFieldInstance contentFragmentFieldInstance = (ContentFragmentFieldInstance)theEObject;
				T result = caseContentFragmentFieldInstance(contentFragmentFieldInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentFragmentPackage.SIMPLE_FIELD_TYPE: {
				SimpleFieldType<?> simpleFieldType = (SimpleFieldType<?>)theEObject;
				T result = caseSimpleFieldType(simpleFieldType);
				if (result == null) result = caseContentFragmentFieldType(simpleFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentFragmentPackage.GROUP_FIELD_TYPE: {
				GroupFieldType<?> groupFieldType = (GroupFieldType<?>)theEObject;
				T result = caseGroupFieldType(groupFieldType);
				if (result == null) result = caseContentFragmentFieldType(groupFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_VALUE: {
				ContentFragmentFieldValue contentFragmentFieldValue = (ContentFragmentFieldValue)theEObject;
				T result = caseContentFragmentFieldValue(contentFragmentFieldValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentFragmentPackage.ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY: {
				AllowedContentFragmentModelPolicy allowedContentFragmentModelPolicy = (AllowedContentFragmentModelPolicy)theEObject;
				T result = caseAllowedContentFragmentModelPolicy(allowedContentFragmentModelPolicy);
				if (result == null) result = caseContextPolicy(allowedContentFragmentModelPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ContentFragmentPackage.MULTI_FIELD_TYPE: {
				MultiFieldType<?> multiFieldType = (MultiFieldType<?>)theEObject;
				T result = caseMultiFieldType(multiFieldType);
				if (result == null) result = caseSimpleFieldType(multiFieldType);
				if (result == null) result = caseContentFragmentFieldType(multiFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentFragmentModel(ContentFragmentModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentFragmentInstance(ContentFragmentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentFragmentFieldInstance(ContentFragmentFieldInstance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Allowed Content Fragment Model Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed Content Fragment Model Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedContentFragmentModelPolicy(AllowedContentFragmentModelPolicy object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Context Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextPolicy(ContextPolicy object) {
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

} //ContentFragmentSwitch
