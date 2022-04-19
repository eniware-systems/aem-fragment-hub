/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.util;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.contenthub.model.contentfragment.GroupFieldType;
import de.enithing.contenthub.model.contentfragment.MultiFieldType;
import de.enithing.contenthub.model.contentfragment.SimpleFieldType;
import de.enithing.contenthub.model.contentfragment.corefields.BooleanValue;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.DateTime;
import de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue;
import de.enithing.contenthub.model.contentfragment.corefields.Enumeration;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;
import de.enithing.contenthub.model.contentfragment.corefields.Json;
import de.enithing.contenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.contenthub.model.contentfragment.corefields.NumberValue;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;
import de.enithing.contenthub.model.contentfragment.corefields.Tab;
import de.enithing.contenthub.model.contentfragment.corefields.Tags;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage
 * @generated
 */
public class CorefieldsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorefieldsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorefieldsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorefieldsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorefieldsSwitch<Adapter> modelSwitch =
		new CorefieldsSwitch<Adapter>() {
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseSingleLineText(SingleLineText object) {
				return createSingleLineTextAdapter();
			}
			@Override
			public Adapter caseMultiLineText(MultiLineText object) {
				return createMultiLineTextAdapter();
			}
			@Override
			public Adapter caseNumber(de.enithing.contenthub.model.contentfragment.corefields.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseNumberValue(NumberValue object) {
				return createNumberValueAdapter();
			}
			@Override
			public Adapter caseBoolean(de.enithing.contenthub.model.contentfragment.corefields.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseDateTimeValue(DateTimeValue object) {
				return createDateTimeValueAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseTags(Tags object) {
				return createTagsAdapter();
			}
			@Override
			public Adapter caseContentReference(ContentReference object) {
				return createContentReferenceAdapter();
			}
			@Override
			public Adapter caseContentReferenceValue(ContentReferenceValue object) {
				return createContentReferenceValueAdapter();
			}
			@Override
			public Adapter caseFragmentReference(FragmentReference object) {
				return createFragmentReferenceAdapter();
			}
			@Override
			public Adapter caseFragmentReferenceValue(FragmentReferenceValue object) {
				return createFragmentReferenceValueAdapter();
			}
			@Override
			public Adapter caseJson(Json object) {
				return createJsonAdapter();
			}
			@Override
			public Adapter caseTab(Tab object) {
				return createTabAdapter();
			}
			@Override
			public Adapter caseContentFragmentFieldValue(ContentFragmentFieldValue object) {
				return createContentFragmentFieldValueAdapter();
			}
			@Override
			public <TValue extends ContentFragmentFieldValue> Adapter caseContentFragmentFieldType(ContentFragmentFieldType<TValue> object) {
				return createContentFragmentFieldTypeAdapter();
			}
			@Override
			public <TValue extends ContentFragmentFieldValue> Adapter caseSimpleFieldType(SimpleFieldType<TValue> object) {
				return createSimpleFieldTypeAdapter();
			}
			@Override
			public <TValue extends ContentFragmentFieldValue> Adapter caseMultiFieldType(MultiFieldType<TValue> object) {
				return createMultiFieldTypeAdapter();
			}
			@Override
			public <TValue extends ContentFragmentFieldValue> Adapter caseGroupFieldType(GroupFieldType<TValue> object) {
				return createGroupFieldTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.NumberValue
	 * @generated
	 */
	public Adapter createNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue <em>Date Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.DateTimeValue
	 * @generated
	 */
	public Adapter createDateTimeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Tags
	 * @generated
	 */
	public Adapter createTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReference <em>Content Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReference
	 * @generated
	 */
	public Adapter createContentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue <em>Content Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue
	 * @generated
	 */
	public Adapter createContentReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReference <em>Fragment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReference
	 * @generated
	 */
	public Adapter createFragmentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue <em>Fragment Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue
	 * @generated
	 */
	public Adapter createFragmentReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.Json <em>Json</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Json
	 * @generated
	 */
	public Adapter createJsonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.SingleLineText <em>Single Line Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.SingleLineText
	 * @generated
	 */
	public Adapter createSingleLineTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.MultiLineText <em>Multi Line Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.MultiLineText
	 * @generated
	 */
	public Adapter createMultiLineTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.corefields.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.corefields.Tab
	 * @generated
	 */
	public Adapter createTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType
	 * @generated
	 */
	public Adapter createContentFragmentFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.SimpleFieldType <em>Simple Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.SimpleFieldType
	 * @generated
	 */
	public Adapter createSimpleFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue
	 * @generated
	 */
	public Adapter createContentFragmentFieldValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.GroupFieldType <em>Group Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.GroupFieldType
	 * @generated
	 */
	public Adapter createGroupFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.MultiFieldType <em>Multi Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.MultiFieldType
	 * @generated
	 */
	public Adapter createMultiFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CorefieldsAdapterFactory
