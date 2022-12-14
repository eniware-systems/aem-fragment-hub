/**
 */
package de.enithing.fragmenthub.model.contentfragment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentFieldInstanceImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentFieldInstanceImpl#getFieldtype <em>Fieldtype</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentFieldInstanceImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentFragmentFieldInstanceImpl extends MinimalEObjectImpl.Container implements ContentFragmentFieldInstance {
	/**
	 * The cached value of the '{@link #getFieldtype() <em>Fieldtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldtype()
	 * @generated
	 * @ordered
	 */
	protected ContentFragmentFieldType fieldtype;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ContentFragmentFieldValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentFragmentFieldInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentFragmentPackage.Literals.CONTENT_FRAGMENT_FIELD_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentInstance getInstance() {
		if (eContainerFeatureID() != ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE) return null;
		return (ContentFragmentInstance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(ContentFragmentInstance newInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInstance, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstance(ContentFragmentInstance newInstance) {
		if (newInstance != eInternalContainer() || (eContainerFeatureID() != ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE && newInstance != null)) {
			if (EcoreUtil.isAncestor(this, newInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, ContentFragmentPackage.CONTENT_FRAGMENT_INSTANCE__FIELDS, ContentFragmentInstance.class, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentFieldType getFieldtype() {
		if (fieldtype != null && fieldtype.eIsProxy()) {
			InternalEObject oldFieldtype = (InternalEObject)fieldtype;
			fieldtype = (ContentFragmentFieldType)eResolveProxy(oldFieldtype);
			if (fieldtype != oldFieldtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE, oldFieldtype, fieldtype));
			}
		}
		return fieldtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentFieldType basicGetFieldtype() {
		return fieldtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldtype(ContentFragmentFieldType newFieldtype) {
		ContentFragmentFieldType oldFieldtype = fieldtype;
		fieldtype = newFieldtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE, oldFieldtype, fieldtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentFieldValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ContentFragmentFieldValue newValue, NotificationChain msgs) {
		ContentFragmentFieldValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(ContentFragmentFieldValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInstance((ContentFragmentInstance)otherEnd, msgs);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE:
				return basicSetInstance(null, msgs);
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE:
				return basicSetValue(null, msgs);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE:
				return eInternalContainer().eInverseRemove(this, ContentFragmentPackage.CONTENT_FRAGMENT_INSTANCE__FIELDS, ContentFragmentInstance.class, msgs);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE:
				return getInstance();
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE:
				if (resolve) return getFieldtype();
				return basicGetFieldtype();
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE:
				setInstance((ContentFragmentInstance)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE:
				setFieldtype((ContentFragmentFieldType)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE:
				setValue((ContentFragmentFieldValue)newValue);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE:
				setInstance((ContentFragmentInstance)null);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE:
				setFieldtype((ContentFragmentFieldType)null);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE:
				setValue((ContentFragmentFieldValue)null);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__INSTANCE:
				return getInstance() != null;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE:
				return fieldtype != null;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //ContentFragmentFieldInstanceImpl
