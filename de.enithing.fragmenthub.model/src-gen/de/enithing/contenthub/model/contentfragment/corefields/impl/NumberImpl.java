/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.NumberTypeHint;
import de.enithing.contenthub.model.contentfragment.corefields.NumberValue;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint;
import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;

import java.lang.Boolean;
import java.math.BigDecimal;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.NumberImpl#getValidationConstraint <em>Validation Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberImpl extends ContentFragmentFieldTypeImpl<NumberValue> implements de.enithing.contenthub.model.contentfragment.corefields.Number {
	/**
	 * The default value of the '{@link #isAllowMultiple() <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_MULTIPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowMultiple() <em>Allow Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowMultiple()
	 * @generated
	 * @ordered
	 */
	protected boolean allowMultiple = ALLOW_MULTIPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected int maxItems = MAX_ITEMS_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NumberTypeHint TYPE_EDEFAULT = NumberTypeHint.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NumberTypeHint type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal DEFAULT_VALUE_EDEFAULT = new BigDecimal("0");

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal defaultValue = DEFAULT_VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getValidationConstraint() <em>Validation Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValidationConstraint<BigDecimal> validationConstraint;

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
	public boolean isAllowMultiple() {
		return allowMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMultiple(boolean newAllowMultiple) {
		boolean oldAllowMultiple = allowMultiple;
		allowMultiple = newAllowMultiple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__ALLOW_MULTIPLE, oldAllowMultiple, allowMultiple));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxItems(int newMaxItems) {
		int oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__MAX_ITEMS, oldMaxItems, maxItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberTypeHint getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(NumberTypeHint newType) {
		NumberTypeHint oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(BigDecimal newDefaultValue) {
		BigDecimal oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationConstraint<BigDecimal> getValidationConstraint() {
		return validationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationConstraint(ValidationConstraint<BigDecimal> newValidationConstraint, NotificationChain msgs) {
		ValidationConstraint<BigDecimal> oldValidationConstraint = validationConstraint;
		validationConstraint = newValidationConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT, oldValidationConstraint, newValidationConstraint);
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
	public void setValidationConstraint(ValidationConstraint<BigDecimal> newValidationConstraint) {
		if (newValidationConstraint != validationConstraint) {
			NotificationChain msgs = null;
			if (validationConstraint != null)
				msgs = ((InternalEObject)validationConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT, null, msgs);
			if (newValidationConstraint != null)
				msgs = ((InternalEObject)newValidationConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT, null, msgs);
			msgs = basicSetValidationConstraint(newValidationConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT, newValidationConstraint, newValidationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT:
				return basicSetValidationConstraint(null, msgs);
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
			case CorefieldsPackage.NUMBER__ALLOW_MULTIPLE:
				return isAllowMultiple();
			case CorefieldsPackage.NUMBER__MAX_ITEMS:
				return getMaxItems();
			case CorefieldsPackage.NUMBER__PLACEHOLDER:
				return getPlaceholder();
			case CorefieldsPackage.NUMBER__TYPE:
				return getType();
			case CorefieldsPackage.NUMBER__DEFAULT_VALUE:
				return getDefaultValue();
			case CorefieldsPackage.NUMBER__REQUIRED:
				return isRequired();
			case CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT:
				return getValidationConstraint();
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
			case CorefieldsPackage.NUMBER__ALLOW_MULTIPLE:
				setAllowMultiple((Boolean)newValue);
				return;
			case CorefieldsPackage.NUMBER__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case CorefieldsPackage.NUMBER__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case CorefieldsPackage.NUMBER__TYPE:
				setType((NumberTypeHint)newValue);
				return;
			case CorefieldsPackage.NUMBER__DEFAULT_VALUE:
				setDefaultValue((BigDecimal)newValue);
				return;
			case CorefieldsPackage.NUMBER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT:
				setValidationConstraint((ValidationConstraint<BigDecimal>)newValue);
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
			case CorefieldsPackage.NUMBER__ALLOW_MULTIPLE:
				setAllowMultiple(ALLOW_MULTIPLE_EDEFAULT);
				return;
			case CorefieldsPackage.NUMBER__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case CorefieldsPackage.NUMBER__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case CorefieldsPackage.NUMBER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorefieldsPackage.NUMBER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case CorefieldsPackage.NUMBER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT:
				setValidationConstraint((ValidationConstraint<BigDecimal>)null);
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
			case CorefieldsPackage.NUMBER__ALLOW_MULTIPLE:
				return allowMultiple != ALLOW_MULTIPLE_EDEFAULT;
			case CorefieldsPackage.NUMBER__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case CorefieldsPackage.NUMBER__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case CorefieldsPackage.NUMBER__TYPE:
				return type != TYPE_EDEFAULT;
			case CorefieldsPackage.NUMBER__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case CorefieldsPackage.NUMBER__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CorefieldsPackage.NUMBER__VALIDATION_CONSTRAINT:
				return validationConstraint != null;
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
		result.append(" (allowMultiple: ");
		result.append(allowMultiple);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", type: ");
		result.append(type);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //NumberImpl
