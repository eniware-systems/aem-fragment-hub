/**
 */
package de.enithing.fragmenthub.model.fragmenthub.impl;

import de.enithing.fragmenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.fragmenthub.model.contentfragment.ContentFragmentPackage;
import de.enithing.fragmenthub.model.fragmenthub.Context;
import de.enithing.fragmenthub.model.fragmenthub.ContextPolicy;
import de.enithing.fragmenthub.model.fragmenthub.ContextType;
import de.enithing.fragmenthub.model.fragmenthub.FragmentHubPackage;
import de.enithing.fragmenthub.model.fragmenthub.util.ContextUtils;

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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.impl.ContextImpl#getChildContexts <em>Child Contexts</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.impl.ContextImpl#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.impl.ContextImpl#getContentFragments <em>Content Fragments</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.impl.ContextImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.impl.ContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.impl.ContextImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.enithing.fragmenthub.model.fragmenthub.impl.ContextImpl#getPrimaryType <em>Primary Type</em>}</li>
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
	protected EList<Context> childContexts;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "new_context";

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
	protected static final ContextType PRIMARY_TYPE_EDEFAULT = ContextType.FOLDER;

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
		return FragmentHubPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Context> getChildContexts() {
		if (childContexts == null) {
			childContexts = new EObjectContainmentWithInverseEList<Context>(Context.class, this, FragmentHubPackage.CONTEXT__CHILD_CONTEXTS, FragmentHubPackage.CONTEXT__PARENT_CONTEXT);
		}
		return childContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context getParentContext() {
		if (eContainerFeatureID() != FragmentHubPackage.CONTEXT__PARENT_CONTEXT) return null;
		return (Context)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentContext(Context newParentContext, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentContext, FragmentHubPackage.CONTEXT__PARENT_CONTEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentContext(Context newParentContext) {
		if (newParentContext != eInternalContainer() || (eContainerFeatureID() != FragmentHubPackage.CONTEXT__PARENT_CONTEXT && newParentContext != null)) {
			if (EcoreUtil.isAncestor(this, newParentContext))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentContext != null)
				msgs = ((InternalEObject)newParentContext).eInverseAdd(this, FragmentHubPackage.CONTEXT__CHILD_CONTEXTS, Context.class, msgs);
			msgs = basicSetParentContext(newParentContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentHubPackage.CONTEXT__PARENT_CONTEXT, newParentContext, newParentContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContentFragmentInstance> getContentFragments() {
		if (contentFragments == null) {
			contentFragments = new EObjectContainmentWithInverseEList<ContentFragmentInstance>(ContentFragmentInstance.class, this, FragmentHubPackage.CONTEXT__CONTENT_FRAGMENTS, ContentFragmentPackage.CONTENT_FRAGMENT_INSTANCE__CONTEXT);
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
			policies = new EObjectContainmentEList<ContextPolicy>(ContextPolicy.class, this, FragmentHubPackage.CONTEXT__POLICIES);
		}
		return policies;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentHubPackage.CONTEXT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentHubPackage.CONTEXT__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FragmentHubPackage.CONTEXT__PRIMARY_TYPE, oldPrimaryType, primaryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Context getRootContext() {
		return ContextUtils.getRootContext(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public <TPolicy extends ContextPolicy> EList<TPolicy> getPoliciesByType(Class<TPolicy> clazz) {
		return ContextUtils.getPoliciesByType(this, clazz);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public Path getPath() {
		return ContextUtils.getPath(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->	 * 
	 */
	@Override
	public de.enithing.fragmenthub.model.fragmenthub.Package getPackage() {
		return ContextUtils.getPackage(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<Context> resolveContextsByPattern(Path pattern) {
		return new BasicEList<Context>(ContextUtils.resolveContextsByPattern(this, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public EList<ContentFragmentInstance> resolveContentFragmentInstancesByPattern(Path pattern) {
		return new BasicEList<ContentFragmentInstance>(ContextUtils.resolveContentFragmentInstancesByPattern(this, pattern));
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
			case FragmentHubPackage.CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildContexts()).basicAdd(otherEnd, msgs);
			case FragmentHubPackage.CONTEXT__PARENT_CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentContext((Context)otherEnd, msgs);
			case FragmentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
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
			case FragmentHubPackage.CONTEXT__CHILD_CONTEXTS:
				return ((InternalEList<?>)getChildContexts()).basicRemove(otherEnd, msgs);
			case FragmentHubPackage.CONTEXT__PARENT_CONTEXT:
				return basicSetParentContext(null, msgs);
			case FragmentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				return ((InternalEList<?>)getContentFragments()).basicRemove(otherEnd, msgs);
			case FragmentHubPackage.CONTEXT__POLICIES:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FragmentHubPackage.CONTEXT__PARENT_CONTEXT:
				return eInternalContainer().eInverseRemove(this, FragmentHubPackage.CONTEXT__CHILD_CONTEXTS, Context.class, msgs);
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
			case FragmentHubPackage.CONTEXT__CHILD_CONTEXTS:
				return getChildContexts();
			case FragmentHubPackage.CONTEXT__PARENT_CONTEXT:
				return getParentContext();
			case FragmentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				return getContentFragments();
			case FragmentHubPackage.CONTEXT__POLICIES:
				return getPolicies();
			case FragmentHubPackage.CONTEXT__NAME:
				return getName();
			case FragmentHubPackage.CONTEXT__TITLE:
				return getTitle();
			case FragmentHubPackage.CONTEXT__PRIMARY_TYPE:
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
			case FragmentHubPackage.CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				getChildContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case FragmentHubPackage.CONTEXT__PARENT_CONTEXT:
				setParentContext((Context)newValue);
				return;
			case FragmentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				getContentFragments().clear();
				getContentFragments().addAll((Collection<? extends ContentFragmentInstance>)newValue);
				return;
			case FragmentHubPackage.CONTEXT__POLICIES:
				getPolicies().clear();
				getPolicies().addAll((Collection<? extends ContextPolicy>)newValue);
				return;
			case FragmentHubPackage.CONTEXT__NAME:
				setName((String)newValue);
				return;
			case FragmentHubPackage.CONTEXT__TITLE:
				setTitle((String)newValue);
				return;
			case FragmentHubPackage.CONTEXT__PRIMARY_TYPE:
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
			case FragmentHubPackage.CONTEXT__CHILD_CONTEXTS:
				getChildContexts().clear();
				return;
			case FragmentHubPackage.CONTEXT__PARENT_CONTEXT:
				setParentContext((Context)null);
				return;
			case FragmentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				getContentFragments().clear();
				return;
			case FragmentHubPackage.CONTEXT__POLICIES:
				getPolicies().clear();
				return;
			case FragmentHubPackage.CONTEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FragmentHubPackage.CONTEXT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case FragmentHubPackage.CONTEXT__PRIMARY_TYPE:
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
			case FragmentHubPackage.CONTEXT__CHILD_CONTEXTS:
				return childContexts != null && !childContexts.isEmpty();
			case FragmentHubPackage.CONTEXT__PARENT_CONTEXT:
				return getParentContext() != null;
			case FragmentHubPackage.CONTEXT__CONTENT_FRAGMENTS:
				return contentFragments != null && !contentFragments.isEmpty();
			case FragmentHubPackage.CONTEXT__POLICIES:
				return policies != null && !policies.isEmpty();
			case FragmentHubPackage.CONTEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FragmentHubPackage.CONTEXT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case FragmentHubPackage.CONTEXT__PRIMARY_TYPE:
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
	@SuppressWarnings({"rawtypes", "unchecked" })
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FragmentHubPackage.CONTEXT___GET_ROOT_CONTEXT:
				return getRootContext();
			case FragmentHubPackage.CONTEXT___GET_POLICIES_BY_TYPE__CLASS:
				return getPoliciesByType((Class)arguments.get(0));
			case FragmentHubPackage.CONTEXT___GET_PATH:
				return getPath();
			case FragmentHubPackage.CONTEXT___GET_PACKAGE:
				return getPackage();
			case FragmentHubPackage.CONTEXT___RESOLVE_CONTEXTS_BY_PATTERN__PATH:
				return resolveContextsByPattern((Path)arguments.get(0));
			case FragmentHubPackage.CONTEXT___RESOLVE_CONTENT_FRAGMENT_INSTANCES_BY_PATTERN__PATH:
				return resolveContentFragmentInstancesByPattern((Path)arguments.get(0));
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
		result.append(", title: ");
		result.append(title);
		result.append(", primaryType: ");
		result.append(primaryType);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
