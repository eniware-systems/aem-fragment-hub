/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.NumberValue;

import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl#getPlaceholderText <em>Placeholder Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberImpl extends ContentFragmentFieldTypeImpl<NumberValue> implements de.enithing.contenthub.model.contentfragment.corefields.Number {
	/**
	 * The default value of the '{@link #getPlaceholderText() <em>Placeholder Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderText()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholderText() <em>Placeholder Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholderText()
	 * @generated
	 * @ordered
	 */
	protected String placeholderText = PLACEHOLDER_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlaceholderText() {
		return placeholderText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceholderText(String newPlaceholderText) {
		String oldPlaceholderText = placeholderText;
		placeholderText = newPlaceholderText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__PLACEHOLDER_TEXT, oldPlaceholderText, placeholderText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorefieldsPackage.NUMBER__PLACEHOLDER_TEXT:
				return getPlaceholderText();
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
			case CorefieldsPackage.NUMBER__PLACEHOLDER_TEXT:
				setPlaceholderText((String)newValue);
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
			case CorefieldsPackage.NUMBER__PLACEHOLDER_TEXT:
				setPlaceholderText(PLACEHOLDER_TEXT_EDEFAULT);
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
			case CorefieldsPackage.NUMBER__PLACEHOLDER_TEXT:
				return PLACEHOLDER_TEXT_EDEFAULT == null ? placeholderText != null : !PLACEHOLDER_TEXT_EDEFAULT.equals(placeholderText);
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
		result.append(" (placeholderText: ");
		result.append(placeholderText);
		result.append(')');
		return result.toString();
	}

} //NumberImpl
