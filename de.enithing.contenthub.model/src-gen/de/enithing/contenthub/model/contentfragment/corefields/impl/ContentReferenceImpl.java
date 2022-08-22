/**
 */
package de.enithing.contenthub.model.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contentfragment.corefields.ContentReference;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceType;
import de.enithing.contenthub.model.contentfragment.corefields.ContentReferenceValue;
import de.enithing.contenthub.model.contentfragment.corefields.CorefieldsPackage;

import de.enithing.contenthub.model.contentfragment.corefields.validation.FileSizeValue;
import de.enithing.contenthub.model.contentfragment.corefields.validation.ValidationConstraint;

import de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl;

import de.enithing.contenthub.model.contenthub.PathProvider;

import java.lang.Boolean;

import java.math.BigInteger;

import java.nio.file.Path;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#isAllowMultiple <em>Allow Multiple</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#getRootPath <em>Root Path</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#getAllowedContentTypes <em>Allowed Content Types</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#isShowThumbnail <em>Show Thumbnail</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#getFileSizeValidationConstraint <em>File Size Validation Constraint</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#getImageWidthConstraint <em>Image Width Constraint</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contentfragment.corefields.impl.ContentReferenceImpl#getImageHeightConstraint <em>Image Height Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentReferenceImpl extends ContentFragmentFieldTypeImpl<ContentReferenceValue> implements ContentReference {
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
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final Path DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Path defaultValue = DEFAULT_VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getAllowedContentTypes() <em>Allowed Content Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedContentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentReferenceType> allowedContentTypes;

	/**
	 * The default value of the '{@link #isShowThumbnail() <em>Show Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowThumbnail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_THUMBNAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isShowThumbnail() <em>Show Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowThumbnail()
	 * @generated
	 * @ordered
	 */
	protected boolean showThumbnail = SHOW_THUMBNAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFileSizeValidationConstraint() <em>File Size Validation Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSizeValidationConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValidationConstraint<FileSizeValue> fileSizeValidationConstraint;

	/**
	 * The cached value of the '{@link #getImageWidthConstraint() <em>Image Width Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageWidthConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValidationConstraint<BigInteger> imageWidthConstraint;

	/**
	 * The cached value of the '{@link #getImageHeightConstraint() <em>Image Height Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageHeightConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValidationConstraint<BigInteger> imageHeightConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorefieldsPackage.Literals.CONTENT_REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__ALLOW_MULTIPLE, oldAllowMultiple, allowMultiple));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__MAX_ITEMS, oldMaxItems, maxItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(Path newDefaultValue) {
		Path oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH, oldRootPath, newRootPath);
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
				msgs = ((InternalEObject)rootPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH, null, msgs);
			if (newRootPath != null)
				msgs = ((InternalEObject)newRootPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH, null, msgs);
			msgs = basicSetRootPath(newRootPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH, newRootPath, newRootPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentReferenceType> getAllowedContentTypes() {
		if (allowedContentTypes == null) {
			allowedContentTypes = new EDataTypeUniqueEList<ContentReferenceType>(ContentReferenceType.class, this, CorefieldsPackage.CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES);
		}
		return allowedContentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShowThumbnail() {
		return showThumbnail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShowThumbnail(boolean newShowThumbnail) {
		boolean oldShowThumbnail = showThumbnail;
		showThumbnail = newShowThumbnail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__SHOW_THUMBNAIL, oldShowThumbnail, showThumbnail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationConstraint<FileSizeValue> getFileSizeValidationConstraint() {
		return fileSizeValidationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSizeValidationConstraint(ValidationConstraint<FileSizeValue> newFileSizeValidationConstraint, NotificationChain msgs) {
		ValidationConstraint<FileSizeValue> oldFileSizeValidationConstraint = fileSizeValidationConstraint;
		fileSizeValidationConstraint = newFileSizeValidationConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT, oldFileSizeValidationConstraint, newFileSizeValidationConstraint);
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
	public void setFileSizeValidationConstraint(ValidationConstraint<FileSizeValue> newFileSizeValidationConstraint) {
		if (newFileSizeValidationConstraint != fileSizeValidationConstraint) {
			NotificationChain msgs = null;
			if (fileSizeValidationConstraint != null)
				msgs = ((InternalEObject)fileSizeValidationConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT, null, msgs);
			if (newFileSizeValidationConstraint != null)
				msgs = ((InternalEObject)newFileSizeValidationConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT, null, msgs);
			msgs = basicSetFileSizeValidationConstraint(newFileSizeValidationConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT, newFileSizeValidationConstraint, newFileSizeValidationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationConstraint<BigInteger> getImageWidthConstraint() {
		return imageWidthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageWidthConstraint(ValidationConstraint<BigInteger> newImageWidthConstraint, NotificationChain msgs) {
		ValidationConstraint<BigInteger> oldImageWidthConstraint = imageWidthConstraint;
		imageWidthConstraint = newImageWidthConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT, oldImageWidthConstraint, newImageWidthConstraint);
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
	public void setImageWidthConstraint(ValidationConstraint<BigInteger> newImageWidthConstraint) {
		if (newImageWidthConstraint != imageWidthConstraint) {
			NotificationChain msgs = null;
			if (imageWidthConstraint != null)
				msgs = ((InternalEObject)imageWidthConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT, null, msgs);
			if (newImageWidthConstraint != null)
				msgs = ((InternalEObject)newImageWidthConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT, null, msgs);
			msgs = basicSetImageWidthConstraint(newImageWidthConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT, newImageWidthConstraint, newImageWidthConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidationConstraint<BigInteger> getImageHeightConstraint() {
		return imageHeightConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageHeightConstraint(ValidationConstraint<BigInteger> newImageHeightConstraint, NotificationChain msgs) {
		ValidationConstraint<BigInteger> oldImageHeightConstraint = imageHeightConstraint;
		imageHeightConstraint = newImageHeightConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT, oldImageHeightConstraint, newImageHeightConstraint);
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
	public void setImageHeightConstraint(ValidationConstraint<BigInteger> newImageHeightConstraint) {
		if (newImageHeightConstraint != imageHeightConstraint) {
			NotificationChain msgs = null;
			if (imageHeightConstraint != null)
				msgs = ((InternalEObject)imageHeightConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT, null, msgs);
			if (newImageHeightConstraint != null)
				msgs = ((InternalEObject)newImageHeightConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT, null, msgs);
			msgs = basicSetImageHeightConstraint(newImageHeightConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT, newImageHeightConstraint, newImageHeightConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH:
				return basicSetRootPath(null, msgs);
			case CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT:
				return basicSetFileSizeValidationConstraint(null, msgs);
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT:
				return basicSetImageWidthConstraint(null, msgs);
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT:
				return basicSetImageHeightConstraint(null, msgs);
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
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOW_MULTIPLE:
				return isAllowMultiple();
			case CorefieldsPackage.CONTENT_REFERENCE__MAX_ITEMS:
				return getMaxItems();
			case CorefieldsPackage.CONTENT_REFERENCE__PLACEHOLDER:
				return getPlaceholder();
			case CorefieldsPackage.CONTENT_REFERENCE__DEFAULT_VALUE:
				return getDefaultValue();
			case CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH:
				return getRootPath();
			case CorefieldsPackage.CONTENT_REFERENCE__REQUIRED:
				return isRequired();
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES:
				return getAllowedContentTypes();
			case CorefieldsPackage.CONTENT_REFERENCE__SHOW_THUMBNAIL:
				return isShowThumbnail();
			case CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT:
				return getFileSizeValidationConstraint();
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT:
				return getImageWidthConstraint();
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT:
				return getImageHeightConstraint();
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
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOW_MULTIPLE:
				setAllowMultiple((Boolean)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__DEFAULT_VALUE:
				setDefaultValue((Path)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH:
				setRootPath((PathProvider)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES:
				getAllowedContentTypes().clear();
				getAllowedContentTypes().addAll((Collection<? extends ContentReferenceType>)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__SHOW_THUMBNAIL:
				setShowThumbnail((Boolean)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT:
				setFileSizeValidationConstraint((ValidationConstraint<FileSizeValue>)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT:
				setImageWidthConstraint((ValidationConstraint<BigInteger>)newValue);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT:
				setImageHeightConstraint((ValidationConstraint<BigInteger>)newValue);
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
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOW_MULTIPLE:
				setAllowMultiple(ALLOW_MULTIPLE_EDEFAULT);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH:
				setRootPath((PathProvider)null);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES:
				getAllowedContentTypes().clear();
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__SHOW_THUMBNAIL:
				setShowThumbnail(SHOW_THUMBNAIL_EDEFAULT);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT:
				setFileSizeValidationConstraint((ValidationConstraint<FileSizeValue>)null);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT:
				setImageWidthConstraint((ValidationConstraint<BigInteger>)null);
				return;
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT:
				setImageHeightConstraint((ValidationConstraint<BigInteger>)null);
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
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOW_MULTIPLE:
				return allowMultiple != ALLOW_MULTIPLE_EDEFAULT;
			case CorefieldsPackage.CONTENT_REFERENCE__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case CorefieldsPackage.CONTENT_REFERENCE__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case CorefieldsPackage.CONTENT_REFERENCE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case CorefieldsPackage.CONTENT_REFERENCE__ROOT_PATH:
				return rootPath != null;
			case CorefieldsPackage.CONTENT_REFERENCE__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CorefieldsPackage.CONTENT_REFERENCE__ALLOWED_CONTENT_TYPES:
				return allowedContentTypes != null && !allowedContentTypes.isEmpty();
			case CorefieldsPackage.CONTENT_REFERENCE__SHOW_THUMBNAIL:
				return showThumbnail != SHOW_THUMBNAIL_EDEFAULT;
			case CorefieldsPackage.CONTENT_REFERENCE__FILE_SIZE_VALIDATION_CONSTRAINT:
				return fileSizeValidationConstraint != null;
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_WIDTH_CONSTRAINT:
				return imageWidthConstraint != null;
			case CorefieldsPackage.CONTENT_REFERENCE__IMAGE_HEIGHT_CONSTRAINT:
				return imageHeightConstraint != null;
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
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", required: ");
		result.append(required);
		result.append(", allowedContentTypes: ");
		result.append(allowedContentTypes);
		result.append(", showThumbnail: ");
		result.append(showThumbnail);
		result.append(')');
		return result.toString();
	}

} //ContentReferenceImpl
