/**
 */
package de.enithing.fragmenthub.model.contentfragment.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.enithing.fragmenthub.model.contentfragment.AllowedContentFragmentModelPolicy;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allowed Content Fragment Model Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.impl.AllowedContentFragmentModelPolicyImpl#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllowedContentFragmentModelPolicyImpl extends MinimalEObjectImpl.Container implements AllowedContentFragmentModelPolicy {
	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentModel> models;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedContentFragmentModelPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentFragmentPackage.Literals.ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentModel> getModels() {
		if (models == null) {
			models = new EObjectResolvingEList<ContentFragmentModel>(ContentFragmentModel.class, this, ContentFragmentPackage.ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY__MODELS);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentFragmentPackage.ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY__MODELS:
				return getModels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentFragmentPackage.ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends ContentFragmentModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentFragmentPackage.ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY__MODELS:
				getModels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentFragmentPackage.ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY__MODELS:
				return models != null && !models.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllowedContentFragmentModelPolicyImpl
