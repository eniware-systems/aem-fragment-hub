/**
 */
package de.enithing.fragmenthub.model.fragmenthub.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage;
import de.enithing.fragmenthub.model.fragmenthub.Context;
import de.enithing.fragmenthub.model.fragmenthub.ContextPath;
import de.enithing.fragmenthub.model.fragmenthub.ContextPolicy;
import de.enithing.fragmenthub.model.fragmenthub.PathProvider;
import de.enithing.fragmenthub.model.fragmenthub.SimplePath;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage
 * @generated
 */
public class FragmentHubAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FragmentHubPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentHubAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FragmentHubPackage.eINSTANCE;
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
	protected FragmentHubSwitch<Adapter> modelSwitch =
		new FragmentHubSwitch<Adapter>() {
			@Override
			public Adapter casePathProvider(PathProvider object) {
				return createPathProviderAdapter();
			}
			@Override
			public Adapter caseSimplePath(SimplePath object) {
				return createSimplePathAdapter();
			}
			@Override
			public Adapter caseContextPath(ContextPath object) {
				return createContextPathAdapter();
			}
			@Override
			public Adapter casePackage(de.enithing.fragmenthub.model.fragmenthub.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseContextPolicy(ContextPolicy object) {
				return createContextPolicyAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.enithing.fragmenthub.model.fragmenthub.PathProvider <em>Path Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.fragmenthub.model.fragmenthub.PathProvider
	 * @generated
	 */
	public Adapter createPathProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.fragmenthub.model.fragmenthub.SimplePath <em>Simple Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.fragmenthub.model.fragmenthub.SimplePath
	 * @generated
	 */
	public Adapter createSimplePathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.fragmenthub.model.fragmenthub.ContextPath <em>Context Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.fragmenthub.model.fragmenthub.ContextPath
	 * @generated
	 */
	public Adapter createContextPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.fragmenthub.model.fragmenthub.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.fragmenthub.model.fragmenthub.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.fragmenthub.model.fragmenthub.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.fragmenthub.model.fragmenthub.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.enithing.fragmenthub.model.fragmenthub.ContextPolicy <em>Context Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.enithing.fragmenthub.model.fragmenthub.ContextPolicy
	 * @generated
	 */
	public Adapter createContextPolicyAdapter() {
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

} //FragmentHubAdapterFactory
