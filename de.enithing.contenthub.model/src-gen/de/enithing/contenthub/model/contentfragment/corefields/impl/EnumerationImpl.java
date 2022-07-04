/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.Enumeration;

import de.enithing.contenthub.model.contentfragment.corefields.EnumerationOption;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;
import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;
import java.lang.Boolean;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.EnumerationImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.EnumerationImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.EnumerationImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.EnumerationImpl#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends ContentFragmentFieldTypeImpl<StringValue> implements Enumeration {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationOption> options;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

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
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationOption> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<EnumerationOption>(EnumerationOption.class, this, CorefieldsPackage.ENUMERATION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.ENUMERATION__PLACEHOLDER, oldPlaceholder, placeholder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.ENUMERATION__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.ENUMERATION__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorefieldsPackage.ENUMERATION__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case CorefieldsPackage.ENUMERATION__OPTIONS:
				return getOptions();
			case CorefieldsPackage.ENUMERATION__PLACEHOLDER:
				return getPlaceholder();
			case CorefieldsPackage.ENUMERATION__REQUIRED:
				return isRequired();
			case CorefieldsPackage.ENUMERATION__UNIQUE:
				return isUnique();
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
			case CorefieldsPackage.ENUMERATION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends EnumerationOption>)newValue);
				return;
			case CorefieldsPackage.ENUMERATION__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case CorefieldsPackage.ENUMERATION__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CorefieldsPackage.ENUMERATION__UNIQUE:
				setUnique((Boolean)newValue);
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
			case CorefieldsPackage.ENUMERATION__OPTIONS:
				getOptions().clear();
				return;
			case CorefieldsPackage.ENUMERATION__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case CorefieldsPackage.ENUMERATION__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CorefieldsPackage.ENUMERATION__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
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
			case CorefieldsPackage.ENUMERATION__OPTIONS:
				return options != null && !options.isEmpty();
			case CorefieldsPackage.ENUMERATION__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case CorefieldsPackage.ENUMERATION__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CorefieldsPackage.ENUMERATION__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
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
		result.append(" (placeholder: ");
		result.append(placeholder);
		result.append(", required: ");
		result.append(required);
		result.append(", unique: ");
		result.append(unique);
		result.append(')');
		return result.toString();
	}

} //EnumerationImpl
