/**
 */
package de.enithing.fragmenthub.model.contentfragment.impl;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModelSet;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.fragmenthub.model.fragmenthub.ContentHubPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentModelSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentModelSetImpl#getModels <em>Models</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentModelSetImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentFragmentModelSetImpl extends MinimalEObjectImpl.Container implements ContentFragmentModelSet {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
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
	protected ContentFragmentModelSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentModel> getModels() {
		if (models == null) {
			models = new EObjectContainmentWithInverseEList<ContentFragmentModel>(ContentFragmentModel.class, this, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.enithing.fragmenthub.model.fragmenthub.Package getPackage() {
		if (eContainerFeatureID() != ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE) return null;
		return (de.enithing.fragmenthub.model.fragmenthub.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(de.enithing.fragmenthub.model.fragmenthub.Package newPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackage, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackage(de.enithing.fragmenthub.model.fragmenthub.Package newPackage) {
		if (newPackage != eInternalContainer() || (eContainerFeatureID() != ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE && newPackage != null)) {
			if (EcoreUtil.isAncestor(this, newPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackage != null)
				msgs = ((InternalEObject)newPackage).eInverseAdd(this, ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS, de.enithing.fragmenthub.model.fragmenthub.Package.class, msgs);
			msgs = basicSetPackage(newPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE, newPackage, newPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModels()).basicAdd(otherEnd, msgs);
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackage((de.enithing.fragmenthub.model.fragmenthub.Package)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE:
				return basicSetPackage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE:
				return eInternalContainer().eInverseRemove(this, ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS, de.enithing.fragmenthub.model.fragmenthub.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__NAME:
				return getName();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS:
				return getModels();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE:
				return getPackage();
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__NAME:
				setName((String)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends ContentFragmentModel>)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE:
				setPackage((de.enithing.fragmenthub.model.fragmenthub.Package)newValue);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS:
				getModels().clear();
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE:
				setPackage((de.enithing.fragmenthub.model.fragmenthub.Package)null);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS:
				return models != null && !models.isEmpty();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE:
				return getPackage() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ContentFragmentModelSetImpl
