/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.impl;

import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentFieldInstance;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Fragment Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.impl.ContentFragmentInstanceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.contentfragment.impl.ContentFragmentInstanceImpl#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentFragmentInstanceImpl extends MinimalEObjectImpl.Container implements ContentFragmentInstance {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected ContentFragmentModel model;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentFieldInstance> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentFragmentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentfragmentPackage.Literals.CONTENT_FRAGMENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentModel getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (ContentFragmentModel)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentModel basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(ContentFragmentModel newModel) {
		ContentFragmentModel oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentFragmentFieldInstance> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<ContentFragmentFieldInstance>(ContentFragmentFieldInstance.class, this, ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__FIELDS:
				return getFields();
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
			case ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__MODEL:
				setModel((ContentFragmentModel)newValue);
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
			case ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__MODEL:
				setModel((ContentFragmentModel)null);
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
			case ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__MODEL:
				return model != null;
			case ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentFragmentInstanceImpl
