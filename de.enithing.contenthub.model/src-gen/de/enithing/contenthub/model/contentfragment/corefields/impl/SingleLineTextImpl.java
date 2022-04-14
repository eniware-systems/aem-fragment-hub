/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.TextValue;

import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Line Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getPlaceholderText <em>Placeholder Text</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#isTranslatable <em>Translatable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleLineTextImpl extends ContentFragmentFieldTypeImpl<TextValue> implements SingleLineText {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 255;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #isTranslatable() <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSLATABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTranslatable() <em>Translatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslatable()
	 * @generated
	 * @ordered
	 */
	protected boolean translatable = TRANSLATABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleLineTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.SINGLE_LINE_TEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__ALLOW_MULTIPLE, oldAllowMultiple, allowMultiple));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER_TEXT, oldPlaceholderText, placeholderText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__MAX_LENGTH, oldMaxLength, maxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__REQUIRED, oldRequired, required));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTranslatable() {
		return translatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslatable(boolean newTranslatable) {
		boolean oldTranslatable = translatable;
		translatable = newTranslatable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__TRANSLATABLE, oldTranslatable, translatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorefieldsPackage.SINGLE_LINE_TEXT__ALLOW_MULTIPLE:
				return isAllowMultiple();
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER_TEXT:
				return getPlaceholderText();
			case CorefieldsPackage.SINGLE_LINE_TEXT__DEFAULT_VALUE:
				return getDefaultValue();
			case CorefieldsPackage.SINGLE_LINE_TEXT__MAX_LENGTH:
				return getMaxLength();
			case CorefieldsPackage.SINGLE_LINE_TEXT__REQUIRED:
				return isRequired();
			case CorefieldsPackage.SINGLE_LINE_TEXT__UNIQUE:
				return isUnique();
			case CorefieldsPackage.SINGLE_LINE_TEXT__TRANSLATABLE:
				return isTranslatable();
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__ALLOW_MULTIPLE:
				setAllowMultiple((Boolean)newValue);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER_TEXT:
				setPlaceholderText((String)newValue);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__TRANSLATABLE:
				setTranslatable((Boolean)newValue);
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__ALLOW_MULTIPLE:
				setAllowMultiple(ALLOW_MULTIPLE_EDEFAULT);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER_TEXT:
				setPlaceholderText(PLACEHOLDER_TEXT_EDEFAULT);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__TRANSLATABLE:
				setTranslatable(TRANSLATABLE_EDEFAULT);
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__ALLOW_MULTIPLE:
				return allowMultiple != ALLOW_MULTIPLE_EDEFAULT;
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER_TEXT:
				return PLACEHOLDER_TEXT_EDEFAULT == null ? placeholderText != null : !PLACEHOLDER_TEXT_EDEFAULT.equals(placeholderText);
			case CorefieldsPackage.SINGLE_LINE_TEXT__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case CorefieldsPackage.SINGLE_LINE_TEXT__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case CorefieldsPackage.SINGLE_LINE_TEXT__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CorefieldsPackage.SINGLE_LINE_TEXT__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case CorefieldsPackage.SINGLE_LINE_TEXT__TRANSLATABLE:
				return translatable != TRANSLATABLE_EDEFAULT;
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
		result.append(", placeholderText: ");
		result.append(placeholderText);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", required: ");
		result.append(required);
		result.append(", unique: ");
		result.append(unique);
		result.append(", translatable: ");
		result.append(translatable);
		result.append(')');
		return result.toString();
	}

} //SingleLineTextImpl
