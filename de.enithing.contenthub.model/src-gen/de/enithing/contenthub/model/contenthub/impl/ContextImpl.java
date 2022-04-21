/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPolicy;
import de.enithing.contenthub.model.contenthub.ContextType;
import de.enithing.contenthub.model.contenthub.RootContext;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl#getContentFragmentModels <em>Content Fragment Models</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl#getContentFragments <em>Content Fragments</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl#getPrimaryType <em>Primary Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The cached value of the '{@link #getChildContexts() <em>Child Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildContext> childContexts;

	/**
	 * The cached value of the '{@link #getContentFragmentModels() <em>Content Fragment Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFragmentModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentModel> contentFragmentModels;

	/**
	 * The cached value of the '{@link #getContentFragments() <em>Content Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentFragmentInstance> contentFragments;

	/**
	 * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextPolicy> policies;

	/**
	 * The default value of the '{@link #getRelativePath() <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected static final Path RELATIVE_PATH_EDEFAULT = (Path)ContentHubFactory.eINSTANCE.createFromString(ContentHubPackage.eINSTANCE.getPath(), "/child");

	/**
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected Path relativePath = RELATIVE_PATH_EDEFAULT;

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
	 * The default value of the '{@link #getPrimaryType() <em>Primary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryType()
	 * @generated
	 * @ordered
	 */
	protected static final ContextType PRIMARY_TYPE_EDEFAULT = ContextType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getPrimaryType() <em>Primary Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryType()
	 * @generated
	 * @ordered
	 */
	protected ContextType primaryType = PRIMARY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentHubPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildContext> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<ChildContext>(ChildContext.class, this, ContentHubPackage.CONTEXT__CHILD_CONTEXTS, ContentHubPackage.CHILD_CONTEXT__PARENT_CONTEXT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentModel> getContentFragmentModels() {
		if (contentFragmentModels == null) {
			contentFragmentModels = new EObjectContainmentWithInverseEList<ContentFragmentModel>(ContentFragmentModel.class, this, ContentHubPackage.CONTEXT__CONTENT_FRAGMENT_MODELS, ContentFragmentPackage.CONTENT_FRAGMENT_MODEL__CONTEXT);
		}
		return contentFragmentModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentInstance> getContentFragments() {
		if (contentFragments == null) {
			contentFragments = new EObjectContainmentWithInverseEList<ContentFragmentInstance>(ContentFragmentInstance.class, this, ContentHubPackage.CONTEXT__CONTENT_FRAGMENTS, ContentFragmentPackage.CONTENT_FRAGMENT_INSTANCE__CONTEXT);
		}
		return contentFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextPolicy> getPolicies() {
		if (policies == null) {
			policies = new EObjectContainmentEList<ContextPolicy>(ContextPolicy.class, this, ContentHubPackage.CONTEXT__POLICIES);
		}
		return policies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePath(Path newRelativePath) {
		Path oldRelativePath = relativePath;
		relativePath = newRelativePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.CONTEXT__RELATIVE_PATH, oldRelativePath, relativePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.CONTEXT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextType getPrimaryType() {
		return primaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryType(ContextType newPrimaryType) {
		ContextType oldPrimaryType = primaryType;
		primaryType = newPrimaryType == null ? PRIMARY_TYPE_EDEFAULT : newPrimaryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.CONTEXT__PRIMARY_TYPE, oldPrimaryType, primaryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public RootContext getRootContext() {
		return ContextUtils.getRootContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<Context> getRelatedContexts() {
		return ContextUtils.getRelatedContexts(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<ContextPolicy> getRelatedPolicies() {
		return ContextUtils.getRelatedPolicies(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getUnifiedTitle() {
		return ContextUtils.getUnifiedTitle(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public ContextType getUnifiedPrimaryType() {
		return ContextUtils.getUnifiedPrimaryType(this);
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
			case ContentHubPackage.CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENT_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContentFragmentModels()).basicAdd(otherEnd, msgs);
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContentFragments()).basicAdd(otherEnd, msgs);
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
			case ContentHubPackage.CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENT_MODELS:
				return ((InternalEList<?>)getContentFragmentModels()).basicRemove(otherEnd, msgs);
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				return ((InternalEList<?>)getContentFragments()).basicRemove(otherEnd, msgs);
			case ContentHubPackage.CONTEXT__POLICIES:
				return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
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
			case ContentHubPackage.CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENT_MODELS:
				return getContentFragmentModels();
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				return getContentFragments();
			case ContentHubPackage.CONTEXT__POLICIES:
				return getPolicies();
			case ContentHubPackage.CONTEXT__RELATIVE_PATH:
				return getRelativePath();
			case ContentHubPackage.CONTEXT__TITLE:
				return getTitle();
			case ContentHubPackage.CONTEXT__PRIMARY_TYPE:
				return getPrimaryType();
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
			case ContentHubPackage.CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends ChildContext>)newValue);
				return;
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENT_MODELS:
				getContentFragmentModels().clear();
				getContentFragmentModels().addAll((Collection<? extends ContentFragmentModel>)newValue);
				return;
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				getContentFragments().clear();
				getContentFragments().addAll((Collection<? extends ContentFragmentInstance>)newValue);
				return;
			case ContentHubPackage.CONTEXT__POLICIES:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends ContextPolicy>)newValue);
				return;
			case ContentHubPackage.CONTEXT__RELATIVE_PATH:
				setRelativePath((Path)newValue);
				return;
			case ContentHubPackage.CONTEXT__TITLE:
				setTitle((String)newValue);
				return;
			case ContentHubPackage.CONTEXT__PRIMARY_TYPE:
				setPrimaryType((ContextType)newValue);
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
			case ContentHubPackage.CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENT_MODELS:
				getContentFragmentModels().clear();
				return;
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				getContentFragments().clear();
				return;
			case ContentHubPackage.CONTEXT__POLICIES:
				getPolicies().clear();
				return;
			case ContentHubPackage.CONTEXT__RELATIVE_PATH:
				setRelativePath(RELATIVE_PATH_EDEFAULT);
				return;
			case ContentHubPackage.CONTEXT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ContentHubPackage.CONTEXT__PRIMARY_TYPE:
				setPrimaryType(PRIMARY_TYPE_EDEFAULT);
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
			case ContentHubPackage.CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENT_MODELS:
				return contentFragmentModels != null && !contentFragmentModels.isEmpty();
			case ContentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				return contentFragments != null && !contentFragments.isEmpty();
			case ContentHubPackage.CONTEXT__POLICIES:
				return policies != null && !policies.isEmpty();
			case ContentHubPackage.CONTEXT__RELATIVE_PATH:
				return RELATIVE_PATH_EDEFAULT == null ? relativePath != null : !RELATIVE_PATH_EDEFAULT.equals(relativePath);
			case ContentHubPackage.CONTEXT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ContentHubPackage.CONTEXT__PRIMARY_TYPE:
				return primaryType != PRIMARY_TYPE_EDEFAULT;
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
			case ContentHubPackage.CONTEXT___GET_ROOT_CONTEXT:
				return getRootContext();
			case ContentHubPackage.CONTEXT___GET_RELATED_CONTEXTS:
				return getRelatedContexts();
			case ContentHubPackage.CONTEXT___GET_RELATED_POLICIES:
				return getRelatedPolicies();
			case ContentHubPackage.CONTEXT___GET_UNIFIED_TITLE:
				return getUnifiedTitle();
			case ContentHubPackage.CONTEXT___GET_UNIFIED_PRIMARY_TYPE:
				return getUnifiedPrimaryType();
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
		result.append(" (relativePath: ");
		result.append(relativePath);
		result.append(", title: ");
		result.append(title);
		result.append(", primaryType: ");
		result.append(primaryType);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
