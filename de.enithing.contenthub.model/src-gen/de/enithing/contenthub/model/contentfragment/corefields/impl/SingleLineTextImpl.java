/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.SingleLineText;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;
import de.enithing.contenthub.model.contentfragment.corefields.TextValidationType;
import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;

import java.lang.Boolean;
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
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#isTranslatable <em>Translatable</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getValidationType <em>Validation Type</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getValidationRegex <em>Validation Regex</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.SingleLineTextImpl#getCustomErrorMessage <em>Custom Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleLineTextImpl extends ContentFragmentFieldTypeImpl<StringValue> implements SingleLineText {
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
	 * The default value of the '{@link #getValidationType() <em>Validation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationType()
	 * @generated
	 * @ordered
	 */
	protected static final TextValidationType VALIDATION_TYPE_EDEFAULT = TextValidationType.NONE;

	/**
	 * The cached value of the '{@link #getValidationType() <em>Validation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationType()
	 * @generated
	 * @ordered
	 */
	protected TextValidationType validationType = VALIDATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidationRegex() <em>Validation Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATION_REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidationRegex() <em>Validation Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationRegex()
	 * @generated
	 * @ordered
	 */
	protected String validationRegex = VALIDATION_REGEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomErrorMessage() <em>Custom Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomErrorMessage() <em>Custom Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected String customErrorMessage = CUSTOM_ERROR_MESSAGE_EDEFAULT;

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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER, oldPlaceholder, placeholder));
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
	public TextValidationType getValidationType() {
		return validationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationType(TextValidationType newValidationType) {
		TextValidationType oldValidationType = validationType;
		validationType = newValidationType == null ? VALIDATION_TYPE_EDEFAULT : newValidationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_TYPE, oldValidationType, validationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValidationRegex() {
		return validationRegex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidationRegex(String newValidationRegex) {
		String oldValidationRegex = validationRegex;
		validationRegex = newValidationRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_REGEX, oldValidationRegex, validationRegex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomErrorMessage() {
		return customErrorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomErrorMessage(String newCustomErrorMessage) {
		String oldCustomErrorMessage = customErrorMessage;
		customErrorMessage = newCustomErrorMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE, oldCustomErrorMessage, customErrorMessage));
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER:
				return getPlaceholder();
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_TYPE:
				return getValidationType();
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_REGEX:
				return getValidationRegex();
			case CorefieldsPackage.SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE:
				return getCustomErrorMessage();
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER:
				setPlaceholder((String)newValue);
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_TYPE:
				setValidationType((TextValidationType)newValue);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_REGEX:
				setValidationRegex((String)newValue);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE:
				setCustomErrorMessage((String)newValue);
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_TYPE:
				setValidationType(VALIDATION_TYPE_EDEFAULT);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_REGEX:
				setValidationRegex(VALIDATION_REGEX_EDEFAULT);
				return;
			case CorefieldsPackage.SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE:
				setCustomErrorMessage(CUSTOM_ERROR_MESSAGE_EDEFAULT);
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
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
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_TYPE:
				return validationType != VALIDATION_TYPE_EDEFAULT;
			case CorefieldsPackage.SINGLE_LINE_TEXT__VALIDATION_REGEX:
				return VALIDATION_REGEX_EDEFAULT == null ? validationRegex != null : !VALIDATION_REGEX_EDEFAULT.equals(validationRegex);
			case CorefieldsPackage.SINGLE_LINE_TEXT__CUSTOM_ERROR_MESSAGE:
				return CUSTOM_ERROR_MESSAGE_EDEFAULT == null ? customErrorMessage != null : !CUSTOM_ERROR_MESSAGE_EDEFAULT.equals(customErrorMessage);
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
		result.append(", placeholder: ");
		result.append(placeholder);
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
		result.append(", validationType: ");
		result.append(validationType);
		result.append(", validationRegex: ");
		result.append(validationRegex);
		result.append(", customErrorMessage: ");
		result.append(customErrorMessage);
		result.append(')');
		return result.toString();
	}

} //SingleLineTextImpl
