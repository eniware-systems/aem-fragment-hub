/**
 */
package de.enithing.contenthub.model.contenthub.impl;

import de.enithing.contenthub.model.contenthub.ContentHubFactory;
import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import de.enithing.contenthub.model.contenthub.Context;
import de.enithing.contenthub.model.contenthub.ContextPath;
import de.enithing.contenthub.model.contenthub.ContextType;
import de.enithing.contenthub.model.contenthub.SimplePath;
import java.nio.file.Path;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ContentHubFactoryImpl extends EFactoryImpl implements ContentHubFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static ContentHubFactory init() {
		try {
			ContentHubFactory theContentHubFactory = (ContentHubFactory)EPackage.Registry.INSTANCE.getEFactory(ContentHubPackage.eNS_URI);
			if (theContentHubFactory != null) {
				return theContentHubFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		// This was changed manually to get the extended factory.
		return new ContentHubFactoryExtendedImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentHubFactoryImpl() {
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
			case ContentHubPackage.SIMPLE_PATH: return createSimplePath();
			case ContentHubPackage.CONTEXT_PATH: return createContextPath();
			case ContentHubPackage.PACKAGE: return createPackage();
			case ContentHubPackage.CONTEXT: return createContext();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ContentHubPackage.CONTEXT_TYPE:
				return createContextTypeFromString(eDataType, initialValue);
			case ContentHubPackage.PATH:
				return createPathFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ContentHubPackage.CONTEXT_TYPE:
				return convertContextTypeToString(eDataType, instanceValue);
			case ContentHubPackage.PATH:
				return convertPathToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimplePath createSimplePath() {
		SimplePathImpl simplePath = new SimplePathImpl();
		return simplePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextPath createContextPath() {
		ContextPathImpl contextPath = new ContextPathImpl();
		return contextPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public de.enithing.contenthub.model.contenthub.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextType createContextTypeFromString(EDataType eDataType, String initialValue) {
		ContextType result = ContextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPathFromString(EDataType eDataType, String initialValue) {
		return (Path)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentHubPackage getContentHubPackage() {
		return (ContentHubPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContentHubPackage getPackage() {
		return ContentHubPackage.eINSTANCE;
	}

} //ContentHubFactoryImpl
