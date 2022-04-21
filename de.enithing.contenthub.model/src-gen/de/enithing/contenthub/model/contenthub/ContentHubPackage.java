/**
 */
package de.enithing.contenthub.model.contenthub;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.PathProvider <em>Path Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.PathProvider
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPathProvider()
	 * @generated
	 */
	int PATH_PROVIDER = 0;

	/**
	 * The number of structural features of the '<em>Path Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PROVIDER___GET_PATH = 0;

	/**
	 * The number of operations of the '<em>Path Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.SimplePathImpl <em>Simple Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.SimplePathImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getSimplePath()
	 * @generated
	 */
	int SIMPLE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PATH__PATH = PATH_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PATH_FEATURE_COUNT = PATH_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PATH___GET_PATH = PATH_PROVIDER___GET_PATH;

	/**
	 * The number of operations of the '<em>Simple Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PATH_OPERATION_COUNT = PATH_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.ContextPathImpl <em>Context Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.ContextPathImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContextPath()
	 * @generated
	 */
	int CONTEXT_PATH = 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PATH__CONTEXT = PATH_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PATH_FEATURE_COUNT = PATH_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PATH___GET_PATH = PATH_PROVIDER___GET_PATH;

	/**
	 * The number of operations of the '<em>Context Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_PATH_OPERATION_COUNT = PATH_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.PackageImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__AUTHOR = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTEXTS = 5;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Create Default Package Structure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CREATE_DEFAULT_PACKAGE_STRUCTURE = 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.ContextImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 4;

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
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__POLICIES = 3;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__RELATIVE_PATH = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TITLE = 5;

	/**
	 * The feature id for the '<em><b>Primary Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PRIMARY_TYPE = 6;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Root Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_ROOT_CONTEXT = 0;

	/**
	 * The operation id for the '<em>Get Related Contexts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_RELATED_CONTEXTS = 1;

	/**
	 * The operation id for the '<em>Get Related Policies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_RELATED_POLICIES = 2;

	/**
	 * The operation id for the '<em>Get Unified Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_UNIFIED_TITLE = 3;

	/**
	 * The operation id for the '<em>Get Unified Primary Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_UNIFIED_PRIMARY_TYPE = 4;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.RootContextImpl <em>Root Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.RootContextImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getRootContext()
	 * @generated
	 */
	int ROOT_CONTEXT = 5;

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
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT__POLICIES = CONTEXT__POLICIES;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT__RELATIVE_PATH = CONTEXT__RELATIVE_PATH;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT__TITLE = CONTEXT__TITLE;

	/**
	 * The feature id for the '<em><b>Primary Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT__PRIMARY_TYPE = CONTEXT__PRIMARY_TYPE;

	/**
	 * The number of structural features of the '<em>Root Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Root Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT___GET_ROOT_CONTEXT = CONTEXT___GET_ROOT_CONTEXT;

	/**
	 * The operation id for the '<em>Get Related Contexts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT___GET_RELATED_CONTEXTS = CONTEXT___GET_RELATED_CONTEXTS;

	/**
	 * The operation id for the '<em>Get Related Policies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT___GET_RELATED_POLICIES = CONTEXT___GET_RELATED_POLICIES;

	/**
	 * The operation id for the '<em>Get Unified Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT___GET_UNIFIED_TITLE = CONTEXT___GET_UNIFIED_TITLE;

	/**
	 * The operation id for the '<em>Get Unified Primary Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTEXT___GET_UNIFIED_PRIMARY_TYPE = CONTEXT___GET_UNIFIED_PRIMARY_TYPE;

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
	int CHILD_CONTEXT = 6;

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
	 * The feature id for the '<em><b>Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__POLICIES = CONTEXT__POLICIES;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__RELATIVE_PATH = CONTEXT__RELATIVE_PATH;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__TITLE = CONTEXT__TITLE;

	/**
	 * The feature id for the '<em><b>Primary Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__PRIMARY_TYPE = CONTEXT__PRIMARY_TYPE;

	/**
	 * The feature id for the '<em><b>Parent Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT__PARENT_CONTEXT = CONTEXT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Child Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT_FEATURE_COUNT = CONTEXT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Context</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT___GET_ROOT_CONTEXT = CONTEXT___GET_ROOT_CONTEXT;

	/**
	 * The operation id for the '<em>Get Related Contexts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT___GET_RELATED_CONTEXTS = CONTEXT___GET_RELATED_CONTEXTS;

	/**
	 * The operation id for the '<em>Get Related Policies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT___GET_RELATED_POLICIES = CONTEXT___GET_RELATED_POLICIES;

	/**
	 * The operation id for the '<em>Get Unified Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT___GET_UNIFIED_TITLE = CONTEXT___GET_UNIFIED_TITLE;

	/**
	 * The operation id for the '<em>Get Unified Primary Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT___GET_UNIFIED_PRIMARY_TYPE = CONTEXT___GET_UNIFIED_PRIMARY_TYPE;

	/**
	 * The number of operations of the '<em>Child Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_CONTEXT_OPERATION_COUNT = CONTEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.ContextPolicy <em>Context Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.ContextPolicy
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContextPolicy()
	 * @generated
	 */
	int CONTEXT_POLICY = 7;

	/**
	 * The number of structural features of the '<em>Context Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_POLICY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Context Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.impl.PairImpl
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.ContextType <em>Context Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.ContextType
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContextType()
	 * @generated
	 */
	int CONTEXT_TYPE = 9;

	/**
	 * The meta object id for the '<em>Path</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.file.Path
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 10;


	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.PathProvider <em>Path Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Provider</em>'.
	 * @see de.enithing.contenthub.model.contenthub.PathProvider
	 * @generated
	 */
	EClass getPathProvider();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.PathProvider#getPath() <em>Get Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.PathProvider#getPath()
	 * @generated
	 */
	EOperation getPathProvider__GetPath();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.SimplePath <em>Simple Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.SimplePath
	 * @generated
	 */
	EClass getSimplePath();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.SimplePath#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.SimplePath#getPath()
	 * @see #getSimplePath()
	 * @generated
	 */
	EAttribute getSimplePath_Path();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.ContextPath <em>Context Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.ContextPath
	 * @generated
	 */
	EClass getContextPath();

	/**
	 * Returns the meta object for the reference '{@link de.enithing.contenthub.model.contenthub.ContextPath#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see de.enithing.contenthub.model.contenthub.ContextPath#getContext()
	 * @see #getContextPath()
	 * @generated
	 */
	EReference getContextPath_Context();

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
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getGroup()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Group();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getDescription()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getAuthor()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Author();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

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
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Package#createDefaultPackageStructure() <em>Create Default Package Structure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Default Package Structure</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Package#createDefaultPackageStructure()
	 * @generated
	 */
	EOperation getPackage__CreateDefaultPackageStructure();

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
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contenthub.Context#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policies</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getPolicies()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Policies();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Context#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getRelativePath()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_RelativePath();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Context#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getTitle()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Context#getPrimaryType <em>Primary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Type</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getPrimaryType()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_PrimaryType();

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
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#getRelatedContexts() <em>Get Related Contexts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Related Contexts</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#getRelatedContexts()
	 * @generated
	 */
	EOperation getContext__GetRelatedContexts();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#getRelatedPolicies() <em>Get Related Policies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Related Policies</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#getRelatedPolicies()
	 * @generated
	 */
	EOperation getContext__GetRelatedPolicies();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#getUnifiedTitle() <em>Get Unified Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unified Title</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#getUnifiedTitle()
	 * @generated
	 */
	EOperation getContext__GetUnifiedTitle();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#getUnifiedPrimaryType() <em>Get Unified Primary Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unified Primary Type</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#getUnifiedPrimaryType()
	 * @generated
	 */
	EOperation getContext__GetUnifiedPrimaryType();

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
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.ContextPolicy <em>Context Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Policy</em>'.
	 * @see de.enithing.contenthub.model.contenthub.ContextPolicy
	 * @generated
	 */
	EClass getContextPolicy();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contenthub.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Pair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Pair#getKey()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Pair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Pair#getValue()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Value();

	/**
	 * Returns the meta object for enum '{@link de.enithing.contenthub.model.contenthub.ContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Context Type</em>'.
	 * @see de.enithing.contenthub.model.contenthub.ContextType
	 * @generated
	 */
	EEnum getContextType();

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
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.PathProvider <em>Path Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.PathProvider
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPathProvider()
		 * @generated
		 */
		EClass PATH_PROVIDER = eINSTANCE.getPathProvider();

		/**
		 * The meta object literal for the '<em><b>Get Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATH_PROVIDER___GET_PATH = eINSTANCE.getPathProvider__GetPath();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.impl.SimplePathImpl <em>Simple Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.impl.SimplePathImpl
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getSimplePath()
		 * @generated
		 */
		EClass SIMPLE_PATH = eINSTANCE.getSimplePath();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PATH__PATH = eINSTANCE.getSimplePath_Path();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.impl.ContextPathImpl <em>Context Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.impl.ContextPathImpl
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContextPath()
		 * @generated
		 */
		EClass CONTEXT_PATH = eINSTANCE.getContextPath();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_PATH__CONTEXT = eINSTANCE.getContextPath_Context();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__GROUP = eINSTANCE.getPackage_Group();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__DESCRIPTION = eINSTANCE.getPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__AUTHOR = eINSTANCE.getPackage_Author();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTEXTS = eINSTANCE.getPackage_Contexts();

		/**
		 * The meta object literal for the '<em><b>Create Default Package Structure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___CREATE_DEFAULT_PACKAGE_STRUCTURE = eINSTANCE.getPackage__CreateDefaultPackageStructure();

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
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__POLICIES = eINSTANCE.getContext_Policies();

		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__RELATIVE_PATH = eINSTANCE.getContext_RelativePath();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__TITLE = eINSTANCE.getContext_Title();

		/**
		 * The meta object literal for the '<em><b>Primary Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__PRIMARY_TYPE = eINSTANCE.getContext_PrimaryType();

		/**
		 * The meta object literal for the '<em><b>Get Root Context</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_ROOT_CONTEXT = eINSTANCE.getContext__GetRootContext();

		/**
		 * The meta object literal for the '<em><b>Get Related Contexts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_RELATED_CONTEXTS = eINSTANCE.getContext__GetRelatedContexts();

		/**
		 * The meta object literal for the '<em><b>Get Related Policies</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_RELATED_POLICIES = eINSTANCE.getContext__GetRelatedPolicies();

		/**
		 * The meta object literal for the '<em><b>Get Unified Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_UNIFIED_TITLE = eINSTANCE.getContext__GetUnifiedTitle();

		/**
		 * The meta object literal for the '<em><b>Get Unified Primary Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_UNIFIED_PRIMARY_TYPE = eINSTANCE.getContext__GetUnifiedPrimaryType();

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
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.ContextPolicy <em>Context Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.ContextPolicy
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContextPolicy()
		 * @generated
		 */
		EClass CONTEXT_POLICY = eINSTANCE.getContextPolicy();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.impl.PairImpl
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__KEY = eINSTANCE.getPair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__VALUE = eINSTANCE.getPair_Value();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contenthub.ContextType <em>Context Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contenthub.ContextType
		 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContextType()
		 * @generated
		 */
		EEnum CONTEXT_TYPE = eINSTANCE.getContextType();

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
