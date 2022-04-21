/**
 */
package de.enithing.contenthub.model.contentfragment;

import de.enithing.contenthub.model.contenthub.ContentHubPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFactory
 * @model kind="package"
 * @generated
 */
public interface ContentFragmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "contentfragment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://aemcontenthub.eniware-systems.de/ns/contentfragments";

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
	ContentFragmentPackage eINSTANCE = de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentModel()
	 * @generated
	 */
	int CONTENT_FRAGMENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_MODEL__FIELDS = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_MODEL__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_MODEL__ID = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_MODEL__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_MODEL__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_MODEL_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Get All Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_MODEL___GET_ALL_CHILDREN = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentFieldType()
	 * @generated
	 */
	int CONTENT_FRAGMENT_FIELD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_TYPE___CREATE_EMPTY_VALUE = 0;

	/**
	 * The number of operations of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_TYPE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentInstanceImpl
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentInstance()
	 * @generated
	 */
	int CONTENT_FRAGMENT_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_INSTANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_INSTANCE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_INSTANCE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_INSTANCE__MODEL = 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_INSTANCE__FIELDS = 4;

	/**
	 * The feature id for the '<em><b>Context</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_INSTANCE__CONTEXT = 5;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldInstanceImpl <em>Field Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldInstanceImpl
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentFieldInstance()
	 * @generated
	 */
	int CONTENT_FRAGMENT_FIELD_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Fieldtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.SimpleFieldType <em>Simple Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.SimpleFieldType
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getSimpleFieldType()
	 * @generated
	 */
	int SIMPLE_FIELD_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE__PROPERTY_NAME = CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE__FIELD_LABEL = CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE__DESCRIPTION = CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Simple Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE_FEATURE_COUNT = CONTENT_FRAGMENT_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE___CREATE_EMPTY_VALUE = CONTENT_FRAGMENT_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Simple Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE_OPERATION_COUNT = CONTENT_FRAGMENT_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.GroupFieldType <em>Group Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.GroupFieldType
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getGroupFieldType()
	 * @generated
	 */
	int GROUP_FIELD_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FIELD_TYPE__PROPERTY_NAME = CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FIELD_TYPE__FIELD_LABEL = CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FIELD_TYPE__DESCRIPTION = CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FIELD_TYPE__FIELDS = CONTENT_FRAGMENT_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FIELD_TYPE_FEATURE_COUNT = CONTENT_FRAGMENT_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FIELD_TYPE___CREATE_EMPTY_VALUE = CONTENT_FRAGMENT_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Group Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FIELD_TYPE_OPERATION_COUNT = CONTENT_FRAGMENT_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue <em>Field Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentFieldValue()
	 * @generated
	 */
	int CONTENT_FRAGMENT_FIELD_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Field Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FRAGMENT_FIELD_VALUE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.impl.AllowedContentFragmentModelPolicyImpl <em>Allowed Content Fragment Model Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.impl.AllowedContentFragmentModelPolicyImpl
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getAllowedContentFragmentModelPolicy()
	 * @generated
	 */
	int ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY = 7;

	/**
	 * The feature id for the '<em><b>Models</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY__MODELS = ContentHubPackage.CONTEXT_POLICY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Allowed Content Fragment Model Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY_FEATURE_COUNT = ContentHubPackage.CONTEXT_POLICY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Allowed Content Fragment Model Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY_OPERATION_COUNT = ContentHubPackage.CONTEXT_POLICY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.enithing.contenthub.model.contentfragment.MultiFieldType <em>Multi Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.enithing.contenthub.model.contentfragment.MultiFieldType
	 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getMultiFieldType()
	 * @generated
	 */
	int MULTI_FIELD_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FIELD_TYPE__PROPERTY_NAME = SIMPLE_FIELD_TYPE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Field Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FIELD_TYPE__FIELD_LABEL = SIMPLE_FIELD_TYPE__FIELD_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FIELD_TYPE__DESCRIPTION = SIMPLE_FIELD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Allow Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FIELD_TYPE__ALLOW_MULTIPLE = SIMPLE_FIELD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FIELD_TYPE__MAX_ITEMS = SIMPLE_FIELD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FIELD_TYPE_FEATURE_COUNT = SIMPLE_FIELD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Empty Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FIELD_TYPE___CREATE_EMPTY_VALUE = SIMPLE_FIELD_TYPE___CREATE_EMPTY_VALUE;

	/**
	 * The number of operations of the '<em>Multi Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FIELD_TYPE_OPERATION_COUNT = SIMPLE_FIELD_TYPE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel
	 * @generated
	 */
	EClass getContentFragmentModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getFields()
	 * @see #getContentFragmentModel()
	 * @generated
	 */
	EReference getContentFragmentModel_Fields();

	/**
	 * Returns the meta object for the container reference '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getContext()
	 * @see #getContentFragmentModel()
	 * @generated
	 */
	EReference getContentFragmentModel_Context();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getId()
	 * @see #getContentFragmentModel()
	 * @generated
	 */
	EAttribute getContentFragmentModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getTitle()
	 * @see #getContentFragmentModel()
	 * @generated
	 */
	EAttribute getContentFragmentModel_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getDescription()
	 * @see #getContentFragmentModel()
	 * @generated
	 */
	EAttribute getContentFragmentModel_Description();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getAllChildren() <em>Get All Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Children</em>' operation.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentModel#getAllChildren()
	 * @generated
	 */
	EOperation getContentFragmentModel__GetAllChildren();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType
	 * @generated
	 */
	EClass getContentFragmentFieldType();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getPropertyName()
	 * @see #getContentFragmentFieldType()
	 * @generated
	 */
	EAttribute getContentFragmentFieldType_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getFieldLabel <em>Field Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Label</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getFieldLabel()
	 * @see #getContentFragmentFieldType()
	 * @generated
	 */
	EAttribute getContentFragmentFieldType_FieldLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#getDescription()
	 * @see #getContentFragmentFieldType()
	 * @generated
	 */
	EAttribute getContentFragmentFieldType_Description();

	/**
	 * Returns the meta object for the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#createEmptyValue() <em>Create Empty Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Empty Value</em>' operation.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldType#createEmptyValue()
	 * @generated
	 */
	EOperation getContentFragmentFieldType__CreateEmptyValue();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance
	 * @generated
	 */
	EClass getContentFragmentInstance();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getId()
	 * @see #getContentFragmentInstance()
	 * @generated
	 */
	EAttribute getContentFragmentInstance_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getTitle()
	 * @see #getContentFragmentInstance()
	 * @generated
	 */
	EAttribute getContentFragmentInstance_Title();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getDescription()
	 * @see #getContentFragmentInstance()
	 * @generated
	 */
	EAttribute getContentFragmentInstance_Description();

	/**
	 * Returns the meta object for the reference '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getModel()
	 * @see #getContentFragmentInstance()
	 * @generated
	 */
	EReference getContentFragmentInstance_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getFields()
	 * @see #getContentFragmentInstance()
	 * @generated
	 */
	EReference getContentFragmentInstance_Fields();

	/**
	 * Returns the meta object for the container reference '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentInstance#getContext()
	 * @see #getContentFragmentInstance()
	 * @generated
	 */
	EReference getContentFragmentInstance_Context();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance <em>Field Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Instance</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance
	 * @generated
	 */
	EClass getContentFragmentFieldInstance();

	/**
	 * Returns the meta object for the reference '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance#getFieldtype <em>Fieldtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fieldtype</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance#getFieldtype()
	 * @see #getContentFragmentFieldInstance()
	 * @generated
	 */
	EReference getContentFragmentFieldInstance_Fieldtype();

	/**
	 * Returns the meta object for the containment reference '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldInstance#getValue()
	 * @see #getContentFragmentFieldInstance()
	 * @generated
	 */
	EReference getContentFragmentFieldInstance_Value();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.SimpleFieldType <em>Simple Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.SimpleFieldType
	 * @generated
	 */
	EClass getSimpleFieldType();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.GroupFieldType <em>Group Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Field Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.GroupFieldType
	 * @generated
	 */
	EClass getGroupFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.enithing.contenthub.model.contentfragment.GroupFieldType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.GroupFieldType#getFields()
	 * @see #getGroupFieldType()
	 * @generated
	 */
	EReference getGroupFieldType_Fields();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue <em>Field Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Value</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue
	 * @generated
	 */
	EClass getContentFragmentFieldValue();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy <em>Allowed Content Fragment Model Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Content Fragment Model Policy</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy
	 * @generated
	 */
	EClass getAllowedContentFragmentModelPolicy();

	/**
	 * Returns the meta object for the reference list '{@link de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Models</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.AllowedContentFragmentModelPolicy#getModels()
	 * @see #getAllowedContentFragmentModelPolicy()
	 * @generated
	 */
	EReference getAllowedContentFragmentModelPolicy_Models();

	/**
	 * Returns the meta object for class '{@link de.enithing.contenthub.model.contentfragment.MultiFieldType <em>Multi Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Field Type</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.MultiFieldType
	 * @generated
	 */
	EClass getMultiFieldType();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.MultiFieldType#isAllowMultiple <em>Allow Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Multiple</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.MultiFieldType#isAllowMultiple()
	 * @see #getMultiFieldType()
	 * @generated
	 */
	EAttribute getMultiFieldType_AllowMultiple();

	/**
	 * Returns the meta object for the attribute '{@link de.enithing.contenthub.model.contentfragment.MultiFieldType#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see de.enithing.contenthub.model.contentfragment.MultiFieldType#getMaxItems()
	 * @see #getMultiFieldType()
	 * @generated
	 */
	EAttribute getMultiFieldType_MaxItems();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentFragmentFactory getContentFragmentFactory();

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
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentModelImpl
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentModel()
		 * @generated
		 */
		EClass CONTENT_FRAGMENT_MODEL = eINSTANCE.getContentFragmentModel();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_FRAGMENT_MODEL__FIELDS = eINSTANCE.getContentFragmentModel_Fields();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_FRAGMENT_MODEL__CONTEXT = eINSTANCE.getContentFragmentModel_Context();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_MODEL__ID = eINSTANCE.getContentFragmentModel_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_MODEL__TITLE = eINSTANCE.getContentFragmentModel_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_MODEL__DESCRIPTION = eINSTANCE.getContentFragmentModel_Description();

		/**
		 * The meta object literal for the '<em><b>Get All Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT_FRAGMENT_MODEL___GET_ALL_CHILDREN = eINSTANCE.getContentFragmentModel__GetAllChildren();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl <em>Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldTypeImpl
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentFieldType()
		 * @generated
		 */
		EClass CONTENT_FRAGMENT_FIELD_TYPE = eINSTANCE.getContentFragmentFieldType();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_FIELD_TYPE__PROPERTY_NAME = eINSTANCE.getContentFragmentFieldType_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Field Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_FIELD_TYPE__FIELD_LABEL = eINSTANCE.getContentFragmentFieldType_FieldLabel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_FIELD_TYPE__DESCRIPTION = eINSTANCE.getContentFragmentFieldType_Description();

		/**
		 * The meta object literal for the '<em><b>Create Empty Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT_FRAGMENT_FIELD_TYPE___CREATE_EMPTY_VALUE = eINSTANCE.getContentFragmentFieldType__CreateEmptyValue();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentInstanceImpl
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentInstance()
		 * @generated
		 */
		EClass CONTENT_FRAGMENT_INSTANCE = eINSTANCE.getContentFragmentInstance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_INSTANCE__ID = eINSTANCE.getContentFragmentInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_INSTANCE__TITLE = eINSTANCE.getContentFragmentInstance_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_FRAGMENT_INSTANCE__DESCRIPTION = eINSTANCE.getContentFragmentInstance_Description();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_FRAGMENT_INSTANCE__MODEL = eINSTANCE.getContentFragmentInstance_Model();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_FRAGMENT_INSTANCE__FIELDS = eINSTANCE.getContentFragmentInstance_Fields();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_FRAGMENT_INSTANCE__CONTEXT = eINSTANCE.getContentFragmentInstance_Context();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldInstanceImpl <em>Field Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentFieldInstanceImpl
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentFieldInstance()
		 * @generated
		 */
		EClass CONTENT_FRAGMENT_FIELD_INSTANCE = eINSTANCE.getContentFragmentFieldInstance();

		/**
		 * The meta object literal for the '<em><b>Fieldtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_FRAGMENT_FIELD_INSTANCE__FIELDTYPE = eINSTANCE.getContentFragmentFieldInstance_Fieldtype();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_FRAGMENT_FIELD_INSTANCE__VALUE = eINSTANCE.getContentFragmentFieldInstance_Value();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.SimpleFieldType <em>Simple Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.SimpleFieldType
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getSimpleFieldType()
		 * @generated
		 */
		EClass SIMPLE_FIELD_TYPE = eINSTANCE.getSimpleFieldType();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.GroupFieldType <em>Group Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.GroupFieldType
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getGroupFieldType()
		 * @generated
		 */
		EClass GROUP_FIELD_TYPE = eINSTANCE.getGroupFieldType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_FIELD_TYPE__FIELDS = eINSTANCE.getGroupFieldType_Fields();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue <em>Field Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.ContentFragmentFieldValue
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getContentFragmentFieldValue()
		 * @generated
		 */
		EClass CONTENT_FRAGMENT_FIELD_VALUE = eINSTANCE.getContentFragmentFieldValue();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.impl.AllowedContentFragmentModelPolicyImpl <em>Allowed Content Fragment Model Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.impl.AllowedContentFragmentModelPolicyImpl
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getAllowedContentFragmentModelPolicy()
		 * @generated
		 */
		EClass ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY = eINSTANCE.getAllowedContentFragmentModelPolicy();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOWED_CONTENT_FRAGMENT_MODEL_POLICY__MODELS = eINSTANCE.getAllowedContentFragmentModelPolicy_Models();

		/**
		 * The meta object literal for the '{@link de.enithing.contenthub.model.contentfragment.MultiFieldType <em>Multi Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.enithing.contenthub.model.contentfragment.MultiFieldType
		 * @see de.enithing.contenthub.model.contentfragment.impl.ContentFragmentPackageImpl#getMultiFieldType()
		 * @generated
		 */
		EClass MULTI_FIELD_TYPE = eINSTANCE.getMultiFieldType();

		/**
		 * The meta object literal for the '<em><b>Allow Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FIELD_TYPE__ALLOW_MULTIPLE = eINSTANCE.getMultiFieldType_AllowMultiple();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FIELD_TYPE__MAX_ITEMS = eINSTANCE.getMultiFieldType_MaxItems();

	}

} //ContentFragmentPackage
