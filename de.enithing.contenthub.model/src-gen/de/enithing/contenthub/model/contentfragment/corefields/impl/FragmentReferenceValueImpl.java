/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceValueImpl#getFragments <em>Fragments</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceValueImpl#getFragmentsByPathPattern <em>Fragments By Path Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FragmentReferenceValueImpl extends MinimalEObjectImpl.Container implements FragmentReferenceValue {
	/**
	 * The cached value of the '{@link #getFragments() <em>Fragments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentInstance> fragments;

	/**
	 * The default value of the '{@link #getFragmentsByPathPattern() <em>Fragments By Path Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragmentsByPathPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String FRAGMENTS_BY_PATH_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFragmentsByPathPattern() <em>Fragments By Path Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragmentsByPathPattern()
	 * @generated
	 * @ordered
	 */
	protected String fragmentsByPathPattern = FRAGMENTS_BY_PATH_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.FRAGMENT_REFERENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentInstance> getFragments() {
		if (fragments == null) {
			fragments = new EObjectResolvingEList<ContentFragmentInstance>(ContentFragmentInstance.class, this, CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS);
		}
		return fragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFragmentsByPathPattern() {
		return fragmentsByPathPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFragmentsByPathPattern(String newFragmentsByPathPattern) {
		String oldFragmentsByPathPattern = fragmentsByPathPattern;
		fragmentsByPathPattern = newFragmentsByPathPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS_BY_PATH_PATTERN, oldFragmentsByPathPattern, fragmentsByPathPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS:
				return getFragments();
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS_BY_PATH_PATTERN:
				return getFragmentsByPathPattern();
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
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS:
				getFragments().clear();
				getFragments().addAll((Collection<? extends ContentFragmentInstance>)newValue);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS_BY_PATH_PATTERN:
				setFragmentsByPathPattern((String)newValue);
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
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS:
				getFragments().clear();
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS_BY_PATH_PATTERN:
				setFragmentsByPathPattern(FRAGMENTS_BY_PATH_PATTERN_EDEFAULT);
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
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS:
				return fragments != null && !fragments.isEmpty();
			case CorefieldsPackage.FRAGMENT_REFERENCE_VALUE__FRAGMENTS_BY_PATH_PATTERN:
				return FRAGMENTS_BY_PATH_PATTERN_EDEFAULT == null ? fragmentsByPathPattern != null : !FRAGMENTS_BY_PATH_PATTERN_EDEFAULT.equals(fragmentsByPathPattern);
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
		result.append(" (fragmentsByPathPattern: ");
		result.append(fragmentsByPathPattern);
		result.append(')');
		return result.toString();
	}

} //FragmentReferenceValueImpl
