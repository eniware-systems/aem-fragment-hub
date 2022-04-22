/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModelSet;
import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.util.PackageUtils;

import java.lang.reflect.InvocationTargetException;
import java.nio.file.Path;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getContentFragmentModelSets <em>Content Fragment Model Sets</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getContentRoot <em>Content Root</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getContentFragmentModelPath <em>Content Fragment Model Path</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl#getContentPath <em>Content Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements de.enithing.contenthub.model.contenthub.Package {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "my.content";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = "de.enithing";

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "My Content";

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
	protected static final String DESCRIPTION_EDEFAULT = "A new package";

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
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = "admin";

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContentFragmentModelSets() <em>Content Fragment Model Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFragmentModelSets()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentModelSet> contentFragmentModelSets;

	/**
	 * The cached value of the '{@link #getContentRoot() <em>Content Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentRoot()
	 * @generated
	 * @ordered
	 */
	protected Context contentRoot;

	/**
	 * The default value of the '{@link #getContentFragmentModelPath() <em>Content Fragment Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFragmentModelPath()
	 * @generated
	 * @ordered
	 */
	protected static final Path CONTENT_FRAGMENT_MODEL_PATH_EDEFAULT = (Path)ContentHubFactory.eINSTANCE.createFromString(ContentHubPackage.eINSTANCE.getPath(), "/conf/$packageName/settings/dam/cfm/models");

	/**
	 * The cached value of the '{@link #getContentFragmentModelPath() <em>Content Fragment Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFragmentModelPath()
	 * @generated
	 * @ordered
	 */
	protected Path contentFragmentModelPath = CONTENT_FRAGMENT_MODEL_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentPath() <em>Content Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPath()
	 * @generated
	 * @ordered
	 */
	protected static final Path CONTENT_PATH_EDEFAULT = (Path)ContentHubFactory.eINSTANCE.createFromString(ContentHubPackage.eINSTANCE.getPath(), "/content/dam/$packageName");

	/**
	 * The cached value of the '{@link #getContentPath() <em>Content Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentPath()
	 * @generated
	 * @ordered
	 */
	protected Path contentPath = CONTENT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentHubPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__GROUP, oldGroup, group));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentModelSet> getContentFragmentModelSets() {
		if (contentFragmentModelSets == null) {
			contentFragmentModelSets = new EObjectContainmentWithInverseEList<ContentFragmentModelSet>(ContentFragmentModelSet.class, this, ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL_SET__PACKAGE);
		}
		return contentFragmentModelSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getContentRoot() {
		return contentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentRoot(Context newContentRoot, NotificationChain msgs) {
		Context oldContentRoot = contentRoot;
		contentRoot = newContentRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__CONTENT_ROOT, oldContentRoot, newContentRoot);
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
	public void setContentRoot(Context newContentRoot) {
		if (newContentRoot != contentRoot) {
			NotificationChain msgs = null;
			if (contentRoot != null)
				msgs = ((InternalEObject)contentRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContentHubPackage.PACKAGE__CONTENT_ROOT, null, msgs);
			if (newContentRoot != null)
				msgs = ((InternalEObject)newContentRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContentHubPackage.PACKAGE__CONTENT_ROOT, null, msgs);
			msgs = basicSetContentRoot(newContentRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__CONTENT_ROOT, newContentRoot, newContentRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getContentFragmentModelPath() {
		return contentFragmentModelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentFragmentModelPath(Path newContentFragmentModelPath) {
		Path oldContentFragmentModelPath = contentFragmentModelPath;
		contentFragmentModelPath = newContentFragmentModelPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_PATH, oldContentFragmentModelPath, contentFragmentModelPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getContentPath() {
		return contentPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentPath(Path newContentPath) {
		Path oldContentPath = contentPath;
		contentPath = newContentPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.PACKAGE__CONTENT_PATH, oldContentPath, contentPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<ContentFragmentModel> getAllContentFragmentModels() {
		return PackageUtils.getAllContentFragmentModels(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContentFragmentModelSets()).basicAdd(otherEnd, msgs);
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
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS:
				return ((InternalEList<?>)getContentFragmentModelSets()).basicRemove(otherEnd, msgs);
			case ContentHubPackage.PACKAGE__CONTENT_ROOT:
				return basicSetContentRoot(null, msgs);
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
			case ContentHubPackage.PACKAGE__NAME:
				return getName();
			case ContentHubPackage.PACKAGE__GROUP:
				return getGroup();
			case ContentHubPackage.PACKAGE__TITLE:
				return getTitle();
			case ContentHubPackage.PACKAGE__DESCRIPTION:
				return getDescription();
			case ContentHubPackage.PACKAGE__AUTHOR:
				return getAuthor();
			case ContentHubPackage.PACKAGE__VERSION:
				return getVersion();
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS:
				return getContentFragmentModelSets();
			case ContentHubPackage.PACKAGE__CONTENT_ROOT:
				return getContentRoot();
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_PATH:
				return getContentFragmentModelPath();
			case ContentHubPackage.PACKAGE__CONTENT_PATH:
				return getContentPath();
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
			case ContentHubPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case ContentHubPackage.PACKAGE__GROUP:
				setGroup((String)newValue);
				return;
			case ContentHubPackage.PACKAGE__TITLE:
				setTitle((String)newValue);
				return;
			case ContentHubPackage.PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ContentHubPackage.PACKAGE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case ContentHubPackage.PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS:
				getContentFragmentModelSets().clear();
				getContentFragmentModelSets().addAll((Collection<? extends ContentFragmentModelSet>)newValue);
				return;
			case ContentHubPackage.PACKAGE__CONTENT_ROOT:
				setContentRoot((Context)newValue);
				return;
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_PATH:
				setContentFragmentModelPath((Path)newValue);
				return;
			case ContentHubPackage.PACKAGE__CONTENT_PATH:
				setContentPath((Path)newValue);
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
			case ContentHubPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ContentHubPackage.PACKAGE__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case ContentHubPackage.PACKAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ContentHubPackage.PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ContentHubPackage.PACKAGE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case ContentHubPackage.PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS:
				getContentFragmentModelSets().clear();
				return;
			case ContentHubPackage.PACKAGE__CONTENT_ROOT:
				setContentRoot((Context)null);
				return;
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_PATH:
				setContentFragmentModelPath(CONTENT_FRAGMENT_MODEL_PATH_EDEFAULT);
				return;
			case ContentHubPackage.PACKAGE__CONTENT_PATH:
				setContentPath(CONTENT_PATH_EDEFAULT);
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
			case ContentHubPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ContentHubPackage.PACKAGE__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case ContentHubPackage.PACKAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ContentHubPackage.PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ContentHubPackage.PACKAGE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case ContentHubPackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_SETS:
				return contentFragmentModelSets != null && !contentFragmentModelSets.isEmpty();
			case ContentHubPackage.PACKAGE__CONTENT_ROOT:
				return contentRoot != null;
			case ContentHubPackage.PACKAGE__CONTENT_FRAGMENT_MODEL_PATH:
				return CONTENT_FRAGMENT_MODEL_PATH_EDEFAULT == null ? contentFragmentModelPath != null : !CONTENT_FRAGMENT_MODEL_PATH_EDEFAULT.equals(contentFragmentModelPath);
			case ContentHubPackage.PACKAGE__CONTENT_PATH:
				return CONTENT_PATH_EDEFAULT == null ? contentPath != null : !CONTENT_PATH_EDEFAULT.equals(contentPath);
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
			case ContentHubPackage.PACKAGE___GET_ALL_CONTENT_FRAGMENT_MODELS:
				return getAllContentFragmentModels();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", group: ");
		result.append(group);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", author: ");
		result.append(author);
		result.append(", version: ");
		result.append(version);
		result.append(", contentFragmentModelPath: ");
		result.append(contentFragmentModelPath);
		result.append(", contentPath: ");
		result.append(contentPath);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
