/**
 */
package de.enithing.contenthub.model.contenthub;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.enithing.contenthub.model.contenthub.ContentHubFactory
 * @model kind="package"
 * @generated
 */
public interface ContentHubPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contenthub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://aemcontenthub.eniware-systems.de/ns/contenthub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chub";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentHubPackage eINSTANCE = de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.PackageImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PATH = 1;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.ContextImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CHILD_CONTEXTS = 0;

	/**
	 * The feature id for the '<em><b>Content Fragment Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTENT_FRAGMENT_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Content Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTENT_FRAGMENTS = 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Root Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_ROOT_CONTEXT = 0;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.RootContextImpl <em>Root Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.RootContextImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getRootContext()
	 * @generated
	 */
	int ROOT_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT__CHILD_CONTEXTS = CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Content Fragment Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT__CONTENT_FRAGMENT_MODELS = CONTEXT__CONTENT_FRAGMENT_MODELS;

	/**
	 * The feature id for the '<em><b>Content Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT__CONTENT_FRAGMENTS = CONTEXT__CONTENT_FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Jcr Root Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT__JCR_ROOT_PATH = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Root Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT___GET_ROOT_CONTEXT = CONTEXT___GET_ROOT_CONTEXT;

	/**
	 * The number of operations of the '<em>Root Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.ChildContextImpl <em>Child Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.ChildContextImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getChildContext()
	 * @generated
	 */
	int CHILD_CONTEXT = 3;

	/**
	 * The feature id for the '<em><b>Child Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__CHILD_CONTEXTS = CONTEXT__CHILD_CONTEXTS;

	/**
	 * The feature id for the '<em><b>Content Fragment Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__CONTENT_FRAGMENT_MODELS = CONTEXT__CONTENT_FRAGMENT_MODELS;

	/**
	 * The feature id for the '<em><b>Content Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__CONTENT_FRAGMENTS = CONTEXT__CONTENT_FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__PARENT_CONTEXT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__RELATIVE_PATH = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Child Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT___GET_ROOT_CONTEXT = CONTEXT___GET_ROOT_CONTEXT;

	/**
	 * The number of operations of the '<em>Child Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Path</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.file.Path
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 4;


	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contenthub.Package#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getContexts()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Contexts();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getPath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Path();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contenthub.Context#getChildContexts <em>Child Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Contexts</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getChildContexts()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ChildContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contenthub.Context#getContentFragmentModels <em>Content Fragment Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Fragment Models</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getContentFragmentModels()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContentFragmentModels();

	/**
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contenthub.Context#getContentFragments <em>Content Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Fragments</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getContentFragments()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContentFragments();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#getRootContext() <em>Get Root Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Root Context</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#getRootContext()
	 * @generated
	 */
	EOperation getContext__GetRootContext();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.RootContext <em>Root Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Context</em>'.
	 * @see de.enithing.contenthub.model.contenthub.RootContext
	 * @generated
	 */
	EClass getRootContext();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.RootContext#getJcrRootPath <em>Jcr Root Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jcr Root Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.RootContext#getJcrRootPath()
	 * @see #getRootContext()
	 * @generated
	 */
	EAttribute getRootContext_JcrRootPath();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.ChildContext <em>Child Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Context</em>'.
	 * @see de.enithing.contenthub.model.contenthub.ChildContext
	 * @generated
	 */
	EClass getChildContext();

	/**
	 * Returns the meta object for the container reference '{@link de.enithing.contenthub.model.contenthub.ChildContext#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Context</em>'.
	 * @see de.enithing.contenthub.model.contenthub.ChildContext#getParentContext()
	 * @see #getChildContext()
	 * @generated
	 */
	EReference getChildContext_ParentContext();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.ChildContext#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.ChildContext#getRelativePath()
	 * @see #getChildContext()
	 * @generated
	 */
	EAttribute getChildContext_RelativePath();

	/**
	 * Returns the meta object for data type '{@link java.nio.file.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path</em>'.
	 * @see java.nio.file.Path
	 * @model instanceClass="java.nio.file.Path"
	 * @generated
	 */
	EDataType getPath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentHubFactory getContentHubFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.impl.PackageImpl
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTEXTS = eINSTANCE.getPackage_Contexts();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PATH = eINSTANCE.getPackage_Path();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.impl.ContextImpl
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Child Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CHILD_CONTEXTS = eINSTANCE.getContext_ChildContexts();

		/**
		 * The meta object literal for the '<em><b>Content Fragment Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTENT_FRAGMENT_MODELS = eINSTANCE.getContext_ContentFragmentModels();

		/**
		 * The meta object literal for the '<em><b>Content Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTENT_FRAGMENTS = eINSTANCE.getContext_ContentFragments();

		/**
		 * The meta object literal for the '<em><b>Get Root Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_ROOT_CONTEXT = eINSTANCE.getContext__GetRootContext();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.impl.RootContextImpl <em>Root Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.impl.RootContextImpl
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getRootContext()
		 * @generated
		 */
		EClass ROOT_CONTEXT = eINSTANCE.getRootContext();

		/**
		 * The meta object literal for the '<em><b>Jcr Root Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_CONTEXT__JCR_ROOT_PATH = eINSTANCE.getRootContext_JcrRootPath();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.impl.ChildContextImpl <em>Child Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.impl.ChildContextImpl
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getChildContext()
		 * @generated
		 */
		EClass CHILD_CONTEXT = eINSTANCE.getChildContext();

		/**
		 * The meta object literal for the '<em><b>Parent Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_CONTEXT__PARENT_CONTEXT = eINSTANCE.getChildContext_ParentContext();

		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILD_CONTEXT__RELATIVE_PATH = eINSTANCE.getChildContext_RelativePath();

		/**
		 * The meta object literal for the '<em>Path</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.nio.file.Path
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPath()
		 * @generated
		 */
		EDataType PATH = eINSTANCE.getPath();

	}

} //ContentHubPackage
