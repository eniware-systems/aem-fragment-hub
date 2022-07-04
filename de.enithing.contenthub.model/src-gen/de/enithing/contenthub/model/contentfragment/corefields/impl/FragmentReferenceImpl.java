/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReference;
import de.enithing.contenthub.model.contentfragment.corefields.FragmentReferenceValue;

import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;
import de.enithing.contenthub.model.contenthub.PathProvider;
import java.lang.Boolean;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl#getAllowedModels <em>Allowed Models</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl#getRootPath <em>Root Path</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl#isAllowFragmentCreation <em>Allow Fragment Creation</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.FragmentReferenceImpl#isRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FragmentReferenceImpl extends ContentFragmentFieldTypeImpl<FragmentReferenceValue> implements FragmentReference {
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
	 * The cached value of the '{@link #getAllowedModels() <em>Allowed Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentModel> allowedModels;

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
	 * The default value of the '{@link #isAllowFragmentCreation() <em>Allow Fragment Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFragmentCreation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FRAGMENT_CREATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAllowFragmentCreation() <em>Allow Fragment Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFragmentCreation()
	 * @generated
	 * @ordered
	 */
	protected boolean allowFragmentCreation = ALLOW_FRAGMENT_CREATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.FRAGMENT_REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_MULTIPLE, oldAllowMultiple, allowMultiple));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.FRAGMENT_REFERENCE__MAX_ITEMS, oldMaxItems, maxItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.FRAGMENT_REFERENCE__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentModel> getAllowedModels() {
		if (allowedModels == null) {
			allowedModels = new EObjectResolvingEList<ContentFragmentModel>(ContentFragmentModel.class, this, CorefieldsPackage.FRAGMENT_REFERENCE__ALLOWED_MODELS);
		}
		return allowedModels;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH, oldRootPath, newRootPath);
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
				msgs = ((InternalEObject)rootPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH, null, msgs);
			if (newRootPath != null)
				msgs = ((InternalEObject)newRootPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH, null, msgs);
			msgs = basicSetRootPath(newRootPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH, newRootPath, newRootPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowFragmentCreation() {
		return allowFragmentCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowFragmentCreation(boolean newAllowFragmentCreation) {
		boolean oldAllowFragmentCreation = allowFragmentCreation;
		allowFragmentCreation = newAllowFragmentCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_FRAGMENT_CREATION, oldAllowFragmentCreation, allowFragmentCreation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.FRAGMENT_REFERENCE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH:
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
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_MULTIPLE:
				return isAllowMultiple();
			case CorefieldsPackage.FRAGMENT_REFERENCE__MAX_ITEMS:
				return getMaxItems();
			case CorefieldsPackage.FRAGMENT_REFERENCE__PLACEHOLDER:
				return getPlaceholder();
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOWED_MODELS:
				return getAllowedModels();
			case CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH:
				return getRootPath();
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_FRAGMENT_CREATION:
				return isAllowFragmentCreation();
			case CorefieldsPackage.FRAGMENT_REFERENCE__REQUIRED:
				return isRequired();
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
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_MULTIPLE:
				setAllowMultiple((Boolean)newValue);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOWED_MODELS:
				getAllowedModels().clear();
				getAllowedModels().addAll((Collection<? extends ContentFragmentModel>)newValue);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH:
				setRootPath((PathProvider)newValue);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_FRAGMENT_CREATION:
				setAllowFragmentCreation((Boolean)newValue);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__REQUIRED:
				setRequired((Boolean)newValue);
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
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_MULTIPLE:
				setAllowMultiple(ALLOW_MULTIPLE_EDEFAULT);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOWED_MODELS:
				getAllowedModels().clear();
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH:
				setRootPath((PathProvider)null);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_FRAGMENT_CREATION:
				setAllowFragmentCreation(ALLOW_FRAGMENT_CREATION_EDEFAULT);
				return;
			case CorefieldsPackage.FRAGMENT_REFERENCE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
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
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_MULTIPLE:
				return allowMultiple != ALLOW_MULTIPLE_EDEFAULT;
			case CorefieldsPackage.FRAGMENT_REFERENCE__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case CorefieldsPackage.FRAGMENT_REFERENCE__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOWED_MODELS:
				return allowedModels != null && !allowedModels.isEmpty();
			case CorefieldsPackage.FRAGMENT_REFERENCE__ROOT_PATH:
				return rootPath != null;
			case CorefieldsPackage.FRAGMENT_REFERENCE__ALLOW_FRAGMENT_CREATION:
				return allowFragmentCreation != ALLOW_FRAGMENT_CREATION_EDEFAULT;
			case CorefieldsPackage.FRAGMENT_REFERENCE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
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
		result.append(", allowFragmentCreation: ");
		result.append(allowFragmentCreation);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //FragmentReferenceImpl
