/**
 */
package de.enithing.contenthub.model.contentfragment.impl;

import de.enithing.contenthub.model.contentfragment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentFragmentFactoryImpl extends EFactoryImpl implements ContentFragmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static ContentFragmentFactory init() {
		try {
			ContentFragmentFactory theContentFragmentFactory = (ContentFragmentFactory)EPackage.Registry.INSTANCE.getEFactory(ContentFragmentPackage.eNS_URI);
			if (theContentFragmentFactory != null) {
				return theContentFragmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		// This was changed manually to get the extended factory.
		return new ContentFragmentFactoryExtendedImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContentFragmentPackage.CONTENT_FRAGMENT_MODEL: return createContentFragmentModel();
			case ContentFragmentPackage.CONTENT_FRAGMENT_INSTANCE: return createContentFragmentInstance();
			case ContentFragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE: return createContentFragmentFieldInstance();
			case ContentFragmentPackage.ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY: return createAllowedContentFragmentModelPolicy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentModel createContentFragmentModel() {
		ContentFragmentModelImpl contentFragmentModel = new ContentFragmentModelImpl();
		return contentFragmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentInstance createContentFragmentInstance() {
		ContentFragmentInstanceImpl contentFragmentInstance = new ContentFragmentInstanceImpl();
		return contentFragmentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentFieldInstance createContentFragmentFieldInstance() {
		ContentFragmentFieldInstanceImpl contentFragmentFieldInstance = new ContentFragmentFieldInstanceImpl();
		return contentFragmentFieldInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllowedContentFragmentModelPolicy createAllowedContentFragmentModelPolicy() {
		AllowedContentFragmentModelPolicyImpl allowedContentFragmentModelPolicy = new AllowedContentFragmentModelPolicyImpl();
		return allowedContentFragmentModelPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFragmentPackage getContentFragmentPackage() {
		return (ContentFragmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContentFragmentPackage getPackage() {
		return ContentFragmentPackage.eINSTANCE;
	}

} //ContentFragmentFactoryImpl
