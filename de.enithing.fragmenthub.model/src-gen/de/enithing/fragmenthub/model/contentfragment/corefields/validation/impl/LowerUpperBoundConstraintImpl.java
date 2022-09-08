/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.enithing.fragmenthub.model.contentfragment.corefields.validation.LowerUpperBoundConstraint;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.UpperBoundConstraint;
import de.enithing.fragmenthub.model.contentfragment.corefields.validation.ValidationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lower Upper Bound Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.validation.impl.LowerUpperBoundConstraintImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LowerUpperBoundConstraintImpl<TValue> extends LowerBoundConstraintImpl<TValue> implements LowerUpperBoundConstraint<TValue> {
	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected TValue max;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LowerUpperBoundConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValidationPackage.Literals.LOWER_UPPER_BOUND_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TValue getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(TValue newMax) {
		TValue oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT__MAX:
				return getMax();
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
			case ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT__MAX:
				setMax((TValue)newValue);
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
			case ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT__MAX:
				setMax((TValue)null);
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
			case ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT__MAX:
				return max != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UpperBoundConstraint.class) {
			switch (derivedFeatureID) {
				case ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT__MAX: return ValidationPackage.UPPER_BOUND_CONSTRAINT__MAX;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UpperBoundConstraint.class) {
			switch (baseFeatureID) {
				case ValidationPackage.UPPER_BOUND_CONSTRAINT__MAX: return ValidationPackage.LOWER_UPPER_BOUND_CONSTRAINT__MAX;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (max: ");
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //LowerUpperBoundConstraintImpl
