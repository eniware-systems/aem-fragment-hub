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
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = 5;

	/**
	 * The feature id for the '<em><b>Content Fragment Model Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTENT_FRAGMENT_MODEL_SETS = 6;

	/**
	 * The feature id for the '<em><b>Content Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Content Fragment Model Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTENT_FRAGMENT_MODEL_PATH = 8;

	/**
	 * The feature id for the '<em><b>Content Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTENT_PATH = 9;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Get All Content Fragment Models</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___GET_ALL_CONTENT_FRAGMENT_MODELS = 0;

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
	 * The feature id for the '<em><b>Parent Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PARENT_CONTEXT = 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = 4;

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
	 * The operation id for the '<em>Get Policies By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_POLICIES_BY_TYPE__CLASS = 1;

	/**
	 * The operation id for the '<em>Get Path</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_PATH = 2;

	/**
	 * The operation id for the '<em>Get Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET_PACKAGE = 3;

	/**
	 * The operation id for the '<em>Resolve Contexts By Pattern</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___RESOLVE_CONTEXTS_BY_PATTERN__PATH = 4;

	/**
	 * The operation id for the '<em>Resolve Content Fragment Instances By Pattern</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___RESOLVE_CONTENT_FRAGMENT_INSTANCES_BY_PATTERN__PATH = 5;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.ContextPolicy <em>Context Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.ContextPolicy
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContextPolicy()
	 * @generated
	 */
	int CONTEXT_POLICY = 5;

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
	 * The meta object id for the '{@link de.enithing.contenthub.model.contenthub.ContextType <em>Context Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contenthub.ContextType
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getContextType()
	 * @generated
	 */
	int CONTEXT_TYPE = 6;

	/**
	 * The meta object id for the '<em>Path</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.nio.file.Path
	 * @see de.enithing.contenthub.model.contenthub.impl.ContentHubPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 7;


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
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getTitle()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Title();

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
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contenthub.Package#getContentFragmentModelSets <em>Content Fragment Model Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content Fragment Model Sets</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getContentFragmentModelSets()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ContentFragmentModelSets();

	/**
	 * Returns the meta object for the containment reference '{@link de.enithing.contenthub.model.contenthub.Package#getContentRoot <em>Content Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Root</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getContentRoot()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ContentRoot();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getContentFragmentModelPath <em>Content Fragment Model Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Fragment Model Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getContentFragmentModelPath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_ContentFragmentModelPath();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Package#getContentPath <em>Content Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Path</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Package#getContentPath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_ContentPath();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Package#getAllContentFragmentModels() <em>Get All Content Fragment Models</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Content Fragment Models</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Package#getAllContentFragmentModels()
	 * @generated
	 */
	EOperation getPackage__GetAllContentFragmentModels();

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
	 * Returns the meta object for the container reference '{@link de.enithing.contenthub.model.contenthub.Context#getParentContext <em>Parent Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Context</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getParentContext()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ParentContext();

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
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contenthub.Context#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.enithing.contenthub.model.contenthub.Context#getName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_Name();

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
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#getPoliciesByType(java.lang.Class) <em>Get Policies By Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Policies By Type</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#getPoliciesByType(java.lang.Class)
	 * @generated
	 */
	EOperation getContext__GetPoliciesByType__Class();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#getPath() <em>Get Path</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Path</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#getPath()
	 * @generated
	 */
	EOperation getContext__GetPath();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#getPackage() <em>Get Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Package</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#getPackage()
	 * @generated
	 */
	EOperation getContext__GetPackage();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#resolveContextsByPattern(java.nio.file.Path) <em>Resolve Contexts By Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Contexts By Pattern</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#resolveContextsByPattern(java.nio.file.Path)
	 * @generated
	 */
	EOperation getContext__ResolveContextsByPattern__Path();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contenthub.Context#resolveContentFragmentInstancesByPattern(java.nio.file.Path) <em>Resolve Content Fragment Instances By Pattern</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Content Fragment Instances By Pattern</em>' operation.
	 * @see de.enithing.contenthub.model.contenthub.Context#resolveContentFragmentInstancesByPattern(java.nio.file.Path)
	 * @generated
	 */
	EOperation getContext__ResolveContentFragmentInstancesByPattern__Path();

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
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__TITLE = eINSTANCE.getPackage_Title();

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
		 * The meta object literal for the '<em><b>Content Fragment Model Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTENT_FRAGMENT_MODEL_SETS = eINSTANCE.getPackage_ContentFragmentModelSets();

		/**
		 * The meta object literal for the '<em><b>Content Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTENT_ROOT = eINSTANCE.getPackage_ContentRoot();

		/**
		 * The meta object literal for the '<em><b>Content Fragment Model Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CONTENT_FRAGMENT_MODEL_PATH = eINSTANCE.getPackage_ContentFragmentModelPath();

		/**
		 * The meta object literal for the '<em><b>Content Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CONTENT_PATH = eINSTANCE.getPackage_ContentPath();

		/**
		 * The meta object literal for the '<em><b>Get All Content Fragment Models</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PACKAGE___GET_ALL_CONTENT_FRAGMENT_MODELS = eINSTANCE.getPackage__GetAllContentFragmentModels();

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
		 * The meta object literal for the '<em><b>Parent Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PARENT_CONTEXT = eINSTANCE.getContext_ParentContext();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__NAME = eINSTANCE.getContext_Name();

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
		 * The meta object literal for the '<em><b>Get Policies By Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_POLICIES_BY_TYPE__CLASS = eINSTANCE.getContext__GetPoliciesByType__Class();

		/**
		 * The meta object literal for the '<em><b>Get Path</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_PATH = eINSTANCE.getContext__GetPath();

		/**
		 * The meta object literal for the '<em><b>Get Package</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET_PACKAGE = eINSTANCE.getContext__GetPackage();

		/**
		 * The meta object literal for the '<em><b>Resolve Contexts By Pattern</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___RESOLVE_CONTEXTS_BY_PATTERN__PATH = eINSTANCE.getContext__ResolveContextsByPattern__Path();

		/**
		 * The meta object literal for the '<em><b>Resolve Content Fragment Instances By Pattern</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___RESOLVE_CONTENT_FRAGMENT_INSTANCES_BY_PATTERN__PATH = eINSTANCE.getContext__ResolveContentFragmentInstancesByPattern__Path();

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
