/**
 */
package de.enithing.contenthub.model.contentfragment.util;

import de.enithing.contenthub.model.contentfragment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentPackage
 * @generated
 */
public class ContentFragmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContentFragmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContentFragmentPackage.eINSTANCE;
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
	protected ContentFragmentSwitch<Adapter> modelSwitch =
		new ContentFragmentSwitch<Adapter>() {
			@Override
			public Adapter caseContentFragmentModel(ContentFragmentModel object) {
				return createContentFragmentModelAdapter();
			}
			@Override
			public <TValue extends ContentFragmentFieldValue> Adapter caseContentFragmentFieldType(ContentFragmentFieldType<TValue> object) {
				return createContentFragmentFieldTypeAdapter();
			}
			@Override
			public Adapter caseContentFragmentInstance(ContentFragmentInstance object) {
				return createContentFragmentInstanceAdapter();
			}
			@Override
			public Adapter caseContentFragmentFieldInstance(ContentFragmentFieldInstance object) {
				return createContentFragmentFieldInstanceAdapter();
			}
			@Override
			public <TValue extends ContentFragmentFieldValue> Adapter caseSimpleFieldType(SimpleFieldType<TValue> object) {
				return createSimpleFieldTypeAdapter();
			}
			@Override
			public <TValue extends ContentFragmentFieldValue> Adapter caseGroupFieldType(GroupFieldType<TValue> object) {
				return createGroupFieldTypeAdapter();
			}
			@Override
			public Adapter caseContentFragmentFieldValue(ContentFragmentFieldValue object) {
				return createContentFragmentFieldValueAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel
	 * @generated
	 */
	public Adapter createContentFragmentModelAdapter() {
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
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance
	 * @generated
	 */
	public Adapter createContentFragmentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance <em>Field Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance
	 * @generated
	 */
	public Adapter createContentFragmentFieldInstanceAdapter() {
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

} //ContentFragmentAdapterFactory
