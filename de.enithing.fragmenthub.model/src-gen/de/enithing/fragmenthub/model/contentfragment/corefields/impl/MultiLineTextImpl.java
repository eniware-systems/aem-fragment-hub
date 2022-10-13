/**
 */
package de.enithing.fragmenthub.model.contentfragment.corefields.impl;

import java.lang.Boolean;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.fragmenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.fragmenthub.model.contentfragment.corefields.MultiLineText;
import de.enithing.fragmenthub.model.contentfragment.corefields.StringValue;
import de.enithing.fragmenthub.model.contentfragment.corefields.TextMimeType;
import de.enithing.fragmenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Line Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.impl.MultiLineTextImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.impl.MultiLineTextImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.impl.MultiLineTextImpl#getDefaultType <em>Default Type</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.impl.MultiLineTextImpl#getAllowedFragmentModels <em>Allowed Fragment Models</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.impl.MultiLineTextImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.contentfragment.corefields.impl.MultiLineTextImpl#isTranslatable <em>Translatable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiLineTextImpl extends ContentFragmentFieldTypeImpl<StringValue> implements MultiLineText {
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
	 * The default value of the '{@link #getDefaultType() <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultType()
	 * @generated
	 * @ordered
	 */
	protected static final TextMimeType DEFAULT_TYPE_EDEFAULT = TextMimeType.RICHTEXT;

	/**
	 * The cached value of the '{@link #getDefaultType() <em>Default Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultType()
	 * @generated
	 * @ordered
	 */
	protected TextMimeType defaultType = DEFAULT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedFragmentModels() <em>Allowed Fragment Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedFragmentModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentModel> allowedFragmentModels;

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
	protected MultiLineTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.MULTI_LINE_TEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.MULTI_LINE_TEXT__ALLOW_MULTIPLE, oldAllowMultiple, allowMultiple));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.MULTI_LINE_TEXT__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextMimeType getDefaultType() {
		return defaultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultType(TextMimeType newDefaultType) {
		TextMimeType oldDefaultType = defaultType;
		defaultType = newDefaultType == null ? DEFAULT_TYPE_EDEFAULT : newDefaultType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.MULTI_LINE_TEXT__DEFAULT_TYPE, oldDefaultType, defaultType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentModel> getAllowedFragmentModels() {
		if (allowedFragmentModels == null) {
			allowedFragmentModels = new EObjectResolvingEList.Unsettable<ContentFragmentModel>(ContentFragmentModel.class, this, CorefieldsPackage.MULTI_LINE_TEXT__ALLOWED_FRAGMENT_MODELS);
		}
		return allowedFragmentModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAllowedFragmentModels() {
		if (allowedFragmentModels != null) ((InternalEList.Unsettable<?>)allowedFragmentModels).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAllowedFragmentModels() {
		return allowedFragmentModels != null && ((InternalEList.Unsettable<?>)allowedFragmentModels).isSet();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.MULTI_LINE_TEXT__REQUIRED, oldRequired, required));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.MULTI_LINE_TEXT__TRANSLATABLE, oldTranslatable, translatable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorefieldsPackage.MULTI_LINE_TEXT__ALLOW_MULTIPLE:
				return isAllowMultiple();
			case CorefieldsPackage.MULTI_LINE_TEXT__MAX_ITEMS:
				return getMaxItems();
			case CorefieldsPackage.MULTI_LINE_TEXT__DEFAULT_TYPE:
				return getDefaultType();
			case CorefieldsPackage.MULTI_LINE_TEXT__ALLOWED_FRAGMENT_MODELS:
				return getAllowedFragmentModels();
			case CorefieldsPackage.MULTI_LINE_TEXT__REQUIRED:
				return isRequired();
			case CorefieldsPackage.MULTI_LINE_TEXT__TRANSLATABLE:
				return isTranslatable();
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
			case CorefieldsPackage.MULTI_LINE_TEXT__ALLOW_MULTIPLE:
				setAllowMultiple((Boolean)newValue);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__DEFAULT_TYPE:
				setDefaultType((TextMimeType)newValue);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__ALLOWED_FRAGMENT_MODELS:
				getAllowedFragmentModels().clear();
				getAllowedFragmentModels().addAll((Collection<? extends ContentFragmentModel>)newValue);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__TRANSLATABLE:
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
			case CorefieldsPackage.MULTI_LINE_TEXT__ALLOW_MULTIPLE:
				setAllowMultiple(ALLOW_MULTIPLE_EDEFAULT);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__DEFAULT_TYPE:
				setDefaultType(DEFAULT_TYPE_EDEFAULT);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__ALLOWED_FRAGMENT_MODELS:
				unsetAllowedFragmentModels();
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CorefieldsPackage.MULTI_LINE_TEXT__TRANSLATABLE:
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
			case CorefieldsPackage.MULTI_LINE_TEXT__ALLOW_MULTIPLE:
				return allowMultiple != ALLOW_MULTIPLE_EDEFAULT;
			case CorefieldsPackage.MULTI_LINE_TEXT__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case CorefieldsPackage.MULTI_LINE_TEXT__DEFAULT_TYPE:
				return defaultType != DEFAULT_TYPE_EDEFAULT;
			case CorefieldsPackage.MULTI_LINE_TEXT__ALLOWED_FRAGMENT_MODELS:
				return isSetAllowedFragmentModels();
			case CorefieldsPackage.MULTI_LINE_TEXT__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CorefieldsPackage.MULTI_LINE_TEXT__TRANSLATABLE:
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
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", defaultType: ");
		result.append(defaultType);
		result.append(", required: ");
		result.append(required);
		result.append(", translatable: ");
		result.append(translatable);
		result.append(')');
		return result.toString();
	}

} //MultiLineTextImpl
