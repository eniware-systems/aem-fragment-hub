/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.impl;

import de.enithing.contenthub.model.contenthub.contentfragment.*;

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
public class ContentfragmentFactoryImpl extends EFactoryImpl implements ContentfragmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static ContentfragmentFactory init() {
		try {
			ContentfragmentFactory theContentfragmentFactory = (ContentfragmentFactory)EPackage.Registry.INSTANCE.getEFactory(ContentfragmentPackage.eNS_URI);
			if (theContentfragmentFactory != null) {
				return theContentfragmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContentfragmentFactoryExtendedImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentfragmentFactoryImpl() {
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
			case ContentfragmentPackage.CONTENT_FRAGMENT_MODEL: return createContentFragmentModel();
			case ContentfragmentPackage.CONTENT_FRAGMENT_INSTANCE: return createContentFragmentInstance();
			case ContentfragmentPackage.CONTENT_FRAGMENT_FIELD_INSTANCE: return createContentFragmentFieldInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentModel createContentFragmentModel() {
		ContentFragmentModelImpl contentFragmentModel = new ContentFragmentModelImpl();
		return contentFragmentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentInstance createContentFragmentInstance() {
		ContentFragmentInstanceImpl contentFragmentInstance = new ContentFragmentInstanceImpl();
		return contentFragmentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentFragmentFieldInstance createContentFragmentFieldInstance() {
		ContentFragmentFieldInstanceImpl contentFragmentFieldInstance = new ContentFragmentFieldInstanceImpl();
		return contentFragmentFieldInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentfragmentPackage getContentfragmentPackage() {
		return (ContentfragmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContentfragmentPackage getPackage() {
		return ContentfragmentPackage.eINSTANCE;
	}

} //ContentfragmentFactoryImpl
