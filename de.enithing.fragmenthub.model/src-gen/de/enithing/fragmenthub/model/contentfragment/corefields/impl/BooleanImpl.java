/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.impl;

import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.enithing.fragmenthub.model.contentfragment.corefields.BooleanValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.impl.BooleanImpl#isDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.impl.BooleanImpl#isRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanImpl extends ContentFragmentFieldTypeImpl<BooleanValue> implements de.enithing.fragmenthub.model.contentfragment.corefields.Boolean {
	/**
	 * The default value of the '{@link #isDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(boolean newDefaultValue) {
		boolean oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.BOOLEAN__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.BOOLEAN__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorefieldsPackage.BOOLEAN__DEFAULT_VALUE:
				return isDefaultValue();
			case CorefieldsPackage.BOOLEAN__REQUIRED:
				return isRequired();
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
			case CorefieldsPackage.BOOLEAN__DEFAULT_VALUE:
				setDefaultValue((Boolean)newValue);
				return;
			case CorefieldsPackage.BOOLEAN__REQUIRED:
				setRequired((Boolean)newValue);
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
			case CorefieldsPackage.BOOLEAN__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case CorefieldsPackage.BOOLEAN__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
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
			case CorefieldsPackage.BOOLEAN__DEFAULT_VALUE:
				return defaultValue != DEFAULT_VALUE_EDEFAULT;
			case CorefieldsPackage.BOOLEAN__REQUIRED:
				return required != REQUIRED_EDEFAULT;
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //BooleanImpl
