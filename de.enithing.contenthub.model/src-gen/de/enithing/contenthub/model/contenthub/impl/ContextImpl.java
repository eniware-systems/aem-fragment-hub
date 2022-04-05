/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contenthub.ChildContext;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;

import de.enithing.contenthub.model.contenthub.RootContext;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentInstance;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentFragmentModel;
import de.enithing.contenthub.model.contenthub.contentfragment.ContentfragmentPackage;
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
	public EList<ContentFragmentModel> getContentFragmentModels() {
		if (contentFragmentModels == null) {
			contentFragmentModels = new EObjectContainmentWithInverseEList<ContentFragmentModel>(ContentFragmentModel.class, this, ContentHubPackage.CONTEXT__CONTENT_FRAGMENT_MODELS, ContentfragmentPackage.CONTENT_FRAGMENT_MODEL__CONTEXT);
		}
		return contentFragmentModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentFragmentInstance> getContentFragments() {
		if (contentFragments == null) {
			contentFragments = new EObjectContainmentEList<ContentFragmentInstance>(ContentFragmentInstance.class, this, ContentHubPackage.CONTEXT__CONTENT_FRAGMENTS);
		}
		return contentFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public RootContext getRootContext() {
		return ContextUtils.getRootContext(this);
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
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContextImpl
