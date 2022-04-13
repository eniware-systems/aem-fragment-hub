/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.RootContext;

import java.nio.file.Path;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.enithing.contenthub.model.contenthub.impl.RootContextImpl#getJcrRootPath <em>Jcr Root Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootContextImpl extends ContextImpl implements RootContext {
	/**
	 * The default value of the '{@link #getJcrRootPath() <em>Jcr Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJcrRootPath()
	 * @generated
	 * @ordered
	 */
	protected static final Path JCR_ROOT_PATH_EDEFAULT = (Path)ContentHubFactory.eINSTANCE.createFromString(ContentHubPackage.eINSTANCE.getPath(), "/src/main/content/jcr_root");

	/**
	 * The cached value of the '{@link #getJcrRootPath() <em>Jcr Root Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJcrRootPath()
	 * @generated
	 * @ordered
	 */
	protected Path jcrRootPath = JCR_ROOT_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentHubPackage.Literals.ROOT_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getJcrRootPath() {
		return jcrRootPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJcrRootPath(Path newJcrRootPath) {
		Path oldJcrRootPath = jcrRootPath;
		jcrRootPath = newJcrRootPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentHubPackage.ROOT_CONTEXT__JCR_ROOT_PATH, oldJcrRootPath, jcrRootPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentHubPackage.ROOT_CONTEXT__JCR_ROOT_PATH:
				return getJcrRootPath();
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
			case ContentHubPackage.ROOT_CONTEXT__JCR_ROOT_PATH:
				setJcrRootPath((Path)newValue);
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
			case ContentHubPackage.ROOT_CONTEXT__JCR_ROOT_PATH:
				setJcrRootPath(JCR_ROOT_PATH_EDEFAULT);
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
			case ContentHubPackage.ROOT_CONTEXT__JCR_ROOT_PATH:
				return JCR_ROOT_PATH_EDEFAULT == null ? jcrRootPath != null : !JCR_ROOT_PATH_EDEFAULT.equals(jcrRootPath);
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
		result.append(" (jcrRootPath: ");
		result.append(jcrRootPath);
		result.append(')');
		return result.toString();
	}

} //RootContextImpl
