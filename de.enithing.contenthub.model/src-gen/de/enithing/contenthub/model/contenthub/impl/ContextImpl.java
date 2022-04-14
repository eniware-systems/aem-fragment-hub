/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contentfragment.ContentFragmentPackage;

import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPolicy;
import de.enithing.contenthub.model.contenthub.RootContext;
import de.enithing.contenthub.model.contenthub.util.ContextUtils;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContextImpl
