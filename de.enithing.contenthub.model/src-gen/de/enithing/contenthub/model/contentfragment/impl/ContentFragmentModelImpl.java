/**
 */
package de.enithing.contenthub.model.contentfragment.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModelSet;
import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.contenthub.model.contentfragment.util.ContentFragmentModelUtils;
import java.lang.reflect.InvocationTargetException;

import java.nio.file.Path;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl#getModelSet <em>Model Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentFragmentModelImpl extends MinimalEObjectImpl.Container implements ContentFragmentModel {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentFieldType> fields;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	protected ContentFragmentModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentFragmentPackage.Literals.CONTENT_FRAGMENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentFieldType> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<ContentFragmentFieldType>(ContentFragmentFieldType.class, this, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentModelSet getModelSet() {
		if (eContainerFeatureID() != ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET) return null;
		return (ContentFragmentModelSet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelSet(ContentFragmentModelSet newModelSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModelSet, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelSet(ContentFragmentModelSet newModelSet) {
		if (newModelSet != eInternalContainer() || (eContainerFeatureID() != ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET && newModelSet != null)) {
			if (EcoreUtil.isAncestor(this, newModelSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModelSet != null)
				msgs = ((InternalEObject)newModelSet).eInverseAdd(this, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS, ContentFragmentModelSet.class, msgs);
			msgs = basicSetModelSet(newModelSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET, newModelSet, newModelSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<ContentFragmentFieldType<?>> getAllFields() {
		return new BasicEList<ContentFragmentFieldType<?>>(ContentFragmentModelUtils.getAllFields(this));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Path getPath() {
		return ContentFragmentModelUtils.getPath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModelSet((ContentFragmentModelSet)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET:
				return basicSetModelSet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET:
				return eInternalContainer().eInverseRemove(this, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__MODELS, ContentFragmentModelSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__FIELDS:
				return getFields();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__ID:
				return getId();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__TITLE:
				return getTitle();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__DESCRIPTION:
				return getDescription();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET:
				return getModelSet();
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends ContentFragmentFieldType>)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__ID:
				setId((String)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__TITLE:
				setTitle((String)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET:
				setModelSet((ContentFragmentModelSet)newValue);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__FIELDS:
				getFields().clear();
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET:
				setModelSet((ContentFragmentModelSet)null);
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__FIELDS:
				return fields != null && !fields.isEmpty();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__MODEL_SET:
				return getModelSet() != null;
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
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL___GET_ALL_FIELDS:
				return getAllFields();
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL___GET_PATH:
				return getPath();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ContentFragmentModelImpl
