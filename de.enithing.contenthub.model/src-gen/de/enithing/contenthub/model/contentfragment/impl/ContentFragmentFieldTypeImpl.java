/**
 */
package de.enithing.contenthub.model.contentfragment.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue;
import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.contenthub.model.contentfragment.util.ContentFragmentFieldTypeUtils;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl#getFieldLabel <em>Field Label</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentFragmentFieldTypeImpl<TValue extends ContentFragmentFieldValue> extends MinimalEObjectImpl.Container implements ContentFragmentFieldType<TValue> {
	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldLabel() <em>Field Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldLabel() <em>Field Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldLabel()
	 * @generated
	 * @ordered
	 */
	protected String fieldLabel = FIELD_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentFragmentFieldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentFragmentPackage.Literals.CONTENT_FRAGMENT_FIELD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldLabel() {
		return fieldLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldLabel(String newFieldLabel) {
		String oldFieldLabel = fieldLabel;
		fieldLabel = newFieldLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL, oldFieldLabel, fieldLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public TValue createEmptyValue() {
		return ContentFragmentFieldTypeUtils.createEmptyValue(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME:
				return getPropertyName();
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL:
				return getFieldLabel();
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION:
				return getDescription();
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL:
				setFieldLabel((String)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION:
				setDescription((String)newValue);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL:
				setFieldLabel(FIELD_LABEL_EDEFAULT);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL:
				return FIELD_LABEL_EDEFAULT == null ? fieldLabel != null : !FIELD_LABEL_EDEFAULT.equals(fieldLabel);
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_TYPE___CREATE_EMPTY_VALUE:
				return createEmptyValue();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(", fieldLabel: ");
		result.append(fieldLabel);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ContentFragmentFieldTypeImpl
