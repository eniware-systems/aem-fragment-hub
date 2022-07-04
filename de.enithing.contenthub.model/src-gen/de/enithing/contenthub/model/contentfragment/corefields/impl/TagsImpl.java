/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.StringValue;
import de.enithing.contenthub.model.contentfragment.corefields.Tags;

import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;
import de.enithing.contenthub.model.contenthub.PathProvider;
import java.lang.Boolean;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.TagsImpl#getRootPath <em>Root Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagsImpl extends ContentFragmentFieldTypeImpl<StringValue> implements Tags {
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
	 * The cached value of the '{@link #getRootPath() <em>Root Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootPath()
	 * @generated
	 * @ordered
	 */
	protected PathProvider rootPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.TAGS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.TAGS__ALLOW_MULTIPLE, oldAllowMultiple, allowMultiple));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.TAGS__MAX_ITEMS, oldMaxItems, maxItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.TAGS__PLACEHOLDER, oldPlaceholder, placeholder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.TAGS__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathProvider getRootPath() {
		return rootPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootPath(PathProvider newRootPath, NotificationChain msgs) {
		PathProvider oldRootPath = rootPath;
		rootPath = newRootPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorefieldsPackage.TAGS__ROOT_PATH, oldRootPath, newRootPath);
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
	public void setRootPath(PathProvider newRootPath) {
		if (newRootPath != rootPath) {
			NotificationChain msgs = null;
			if (rootPath != null)
				msgs = ((InternalEObject)rootPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.TAGS__ROOT_PATH, null, msgs);
			if (newRootPath != null)
				msgs = ((InternalEObject)newRootPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.TAGS__ROOT_PATH, null, msgs);
			msgs = basicSetRootPath(newRootPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.TAGS__ROOT_PATH, newRootPath, newRootPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorefieldsPackage.TAGS__ROOT_PATH:
				return basicSetRootPath(null, msgs);
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
			case CorefieldsPackage.TAGS__ALLOW_MULTIPLE:
				return isAllowMultiple();
			case CorefieldsPackage.TAGS__MAX_ITEMS:
				return getMaxItems();
			case CorefieldsPackage.TAGS__PLACEHOLDER:
				return getPlaceholder();
			case CorefieldsPackage.TAGS__REQUIRED:
				return isRequired();
			case CorefieldsPackage.TAGS__ROOT_PATH:
				return getRootPath();
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
			case CorefieldsPackage.TAGS__ALLOW_MULTIPLE:
				setAllowMultiple((Boolean)newValue);
				return;
			case CorefieldsPackage.TAGS__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case CorefieldsPackage.TAGS__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case CorefieldsPackage.TAGS__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CorefieldsPackage.TAGS__ROOT_PATH:
				setRootPath((PathProvider)newValue);
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
			case CorefieldsPackage.TAGS__ALLOW_MULTIPLE:
				setAllowMultiple(ALLOW_MULTIPLE_EDEFAULT);
				return;
			case CorefieldsPackage.TAGS__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case CorefieldsPackage.TAGS__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case CorefieldsPackage.TAGS__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CorefieldsPackage.TAGS__ROOT_PATH:
				setRootPath((PathProvider)null);
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
			case CorefieldsPackage.TAGS__ALLOW_MULTIPLE:
				return allowMultiple != ALLOW_MULTIPLE_EDEFAULT;
			case CorefieldsPackage.TAGS__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case CorefieldsPackage.TAGS__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case CorefieldsPackage.TAGS__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CorefieldsPackage.TAGS__ROOT_PATH:
				return rootPath != null;
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
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //TagsImpl
