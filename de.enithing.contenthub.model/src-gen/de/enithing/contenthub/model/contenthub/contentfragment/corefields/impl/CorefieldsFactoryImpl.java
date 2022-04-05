/**
 */
package de.enithing.contenthub.model.contenthub.contentfragment.corefields.impl;

import de.enithing.contenthub.model.contenthub.contentfragment.corefields.*;

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
public class CorefieldsFactoryImpl extends EFactoryImpl implements CorefieldsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CorefieldsFactory init() {
		try {
			CorefieldsFactory theCorefieldsFactory = (CorefieldsFactory)EPackage.Registry.INSTANCE.getEFactory(CorefieldsPackage.eNS_URI);
			if (theCorefieldsFactory != null) {
				return theCorefieldsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CorefieldsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorefieldsFactoryImpl() {
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
			case CorefieldsPackage.SINGLE_LINE_TEXT: return createSingleLineText();
			case CorefieldsPackage.SINGLE_LINE_TEXT_VALUE: return createSingleLineTextValue();
			case CorefieldsPackage.TAB: return createTab();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLineText createSingleLineText() {
		SingleLineTextImpl singleLineText = new SingleLineTextImpl();
		return singleLineText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleLineTextValue createSingleLineTextValue() {
		SingleLineTextValueImpl singleLineTextValue = new SingleLineTextValueImpl();
		return singleLineTextValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorefieldsPackage getCorefieldsPackage() {
		return (CorefieldsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorefieldsPackage getPackage() {
		return CorefieldsPackage.eINSTANCE;
	}

} //CorefieldsFactoryImpl
