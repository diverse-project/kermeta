/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.type_relaxed;

import art_relaxed.Art_relaxedPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see art_relaxed.type_relaxed.Type_relaxedFactory
 * @model kind="package"
 * @generated
 */
public interface Type_relaxedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type_relaxed";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://art/type_relaxed";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "type_relaxed";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Type_relaxedPackage eINSTANCE = art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl.init();

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.ComponentTypeImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PID = Art_relaxedPackage.MODEL_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = Art_relaxedPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PORT = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ATTRIBUTE = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__GROUPS = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__IMPLEM = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.PrimitiveTypeImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PID = COMPONENT_TYPE__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PORT = COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ATTRIBUTE = COMPONENT_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__GROUPS = COMPONENT_TYPE__GROUPS;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__IMPLEM = COMPONENT_TYPE__IMPLEM;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.CompositeTypeImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__PID = COMPONENT_TYPE__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__NAME = COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__PORT = COMPONENT_TYPE__PORT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__ATTRIBUTE = COMPONENT_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__GROUPS = COMPONENT_TYPE__GROUPS;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__IMPLEM = COMPONENT_TYPE__IMPLEM;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.ServiceImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PID = Art_relaxedPackage.MODEL_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = Art_relaxedPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OPERATION = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.OperationImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PID = Art_relaxedPackage.MODEL_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = Art_relaxedPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUT = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTPUT = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.ParameterImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PID = Art_relaxedPackage.TYPED_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = Art_relaxedPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = Art_relaxedPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = Art_relaxedPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.FunctionalServiceImpl <em>Functional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.FunctionalServiceImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getFunctionalService()
	 * @generated
	 */
	int FUNCTIONAL_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__PID = SERVICE__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE__OPERATION = SERVICE__OPERATION;

	/**
	 * The number of structural features of the '<em>Functional Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.ControlServiceImpl <em>Control Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.ControlServiceImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getControlService()
	 * @generated
	 */
	int CONTROL_SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SERVICE__PID = SERVICE__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SERVICE__OPERATION = SERVICE__OPERATION;

	/**
	 * The number of structural features of the '<em>Control Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.AbstractPortImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getAbstractPort()
	 * @generated
	 */
	int ABSTRACT_PORT = 8;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__PID = Art_relaxedPackage.NAMED_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__NAME = Art_relaxedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__SERVICE = Art_relaxedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__ROLE = Art_relaxedPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__PROTOCOL = Art_relaxedPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__URI = Art_relaxedPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_FEATURE_COUNT = Art_relaxedPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.PortImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 9;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PID = Art_relaxedPackage.CARDINALITY_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = Art_relaxedPackage.CARDINALITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LOWER = Art_relaxedPackage.CARDINALITY_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__UPPER = Art_relaxedPackage.CARDINALITY_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SERVICE = Art_relaxedPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ROLE = Art_relaxedPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROTOCOL = Art_relaxedPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__URI = Art_relaxedPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = Art_relaxedPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.PortCollectionImpl <em>Port Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.PortCollectionImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPortCollection()
	 * @generated
	 */
	int PORT_COLLECTION = 10;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COLLECTION__PID = ABSTRACT_PORT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COLLECTION__NAME = ABSTRACT_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COLLECTION__SERVICE = ABSTRACT_PORT__SERVICE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COLLECTION__ROLE = ABSTRACT_PORT__ROLE;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COLLECTION__PROTOCOL = ABSTRACT_PORT__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COLLECTION__URI = ABSTRACT_PORT__URI;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COLLECTION__IDS = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_COLLECTION_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.PortIdImpl <em>Port Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.PortIdImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPortId()
	 * @generated
	 */
	int PORT_ID = 11;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ID__PID = Art_relaxedPackage.NAMED_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ID__NAME = Art_relaxedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Port Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ID_FEATURE_COUNT = Art_relaxedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.AttributeImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PID = Art_relaxedPackage.TYPED_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = Art_relaxedPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = Art_relaxedPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = Art_relaxedPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.BasicAttributeImpl <em>Basic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.BasicAttributeImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getBasicAttribute()
	 * @generated
	 */
	int BASIC_ATTRIBUTE = 13;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__PID = ATTRIBUTE__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE__DEFAULT_VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.DictionaryImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 14;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__PID = ATTRIBUTE__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__TYPE = ATTRIBUTE__TYPE;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__VALUE_TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__KEYS = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.impl.DictionaryDefaultValueImpl <em>Dictionary Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.impl.DictionaryDefaultValueImpl
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getDictionaryDefaultValue()
	 * @generated
	 */
	int DICTIONARY_DEFAULT_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_DEFAULT_VALUE__PID = Art_relaxedPackage.ASPECT_MODEL_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_DEFAULT_VALUE__KEY = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_DEFAULT_VALUE__VALUE = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dictionary Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_DEFAULT_VALUE_FEATURE_COUNT = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.type_relaxed.PortRole <em>Port Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.type_relaxed.PortRole
	 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPortRole()
	 * @generated
	 */
	int PORT_ROLE = 16;


	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see art_relaxed.type_relaxed.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.type_relaxed.ComponentType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see art_relaxed.type_relaxed.ComponentType#getPort()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.type_relaxed.ComponentType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see art_relaxed.type_relaxed.ComponentType#getAttribute()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link art_relaxed.type_relaxed.ComponentType#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see art_relaxed.type_relaxed.ComponentType#getGroups()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Groups();

	/**
	 * Returns the meta object for the containment reference '{@link art_relaxed.type_relaxed.ComponentType#getImplem <em>Implem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implem</em>'.
	 * @see art_relaxed.type_relaxed.ComponentType#getImplem()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Implem();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see art_relaxed.type_relaxed.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see art_relaxed.type_relaxed.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see art_relaxed.type_relaxed.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.type_relaxed.Service#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see art_relaxed.type_relaxed.Service#getOperation()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Operation();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see art_relaxed.type_relaxed.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.type_relaxed.Operation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see art_relaxed.type_relaxed.Operation#getInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.type_relaxed.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see art_relaxed.type_relaxed.Operation#getOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Output();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see art_relaxed.type_relaxed.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.FunctionalService <em>Functional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Service</em>'.
	 * @see art_relaxed.type_relaxed.FunctionalService
	 * @generated
	 */
	EClass getFunctionalService();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.ControlService <em>Control Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Service</em>'.
	 * @see art_relaxed.type_relaxed.ControlService
	 * @generated
	 */
	EClass getControlService();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.AbstractPort <em>Abstract Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Port</em>'.
	 * @see art_relaxed.type_relaxed.AbstractPort
	 * @generated
	 */
	EClass getAbstractPort();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.type_relaxed.AbstractPort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see art_relaxed.type_relaxed.AbstractPort#getService()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EReference getAbstractPort_Service();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.type_relaxed.AbstractPort#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see art_relaxed.type_relaxed.AbstractPort#getRole()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EAttribute getAbstractPort_Role();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.type_relaxed.AbstractPort#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see art_relaxed.type_relaxed.AbstractPort#getProtocol()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EAttribute getAbstractPort_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.type_relaxed.AbstractPort#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see art_relaxed.type_relaxed.AbstractPort#getUri()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EAttribute getAbstractPort_Uri();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see art_relaxed.type_relaxed.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.PortCollection <em>Port Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Collection</em>'.
	 * @see art_relaxed.type_relaxed.PortCollection
	 * @generated
	 */
	EClass getPortCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.type_relaxed.PortCollection#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ids</em>'.
	 * @see art_relaxed.type_relaxed.PortCollection#getIds()
	 * @see #getPortCollection()
	 * @generated
	 */
	EReference getPortCollection_Ids();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.PortId <em>Port Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Id</em>'.
	 * @see art_relaxed.type_relaxed.PortId
	 * @generated
	 */
	EClass getPortId();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see art_relaxed.type_relaxed.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.BasicAttribute <em>Basic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Attribute</em>'.
	 * @see art_relaxed.type_relaxed.BasicAttribute
	 * @generated
	 */
	EClass getBasicAttribute();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.type_relaxed.BasicAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see art_relaxed.type_relaxed.BasicAttribute#getDefaultValue()
	 * @see #getBasicAttribute()
	 * @generated
	 */
	EAttribute getBasicAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see art_relaxed.type_relaxed.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.type_relaxed.Dictionary#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see art_relaxed.type_relaxed.Dictionary#getValueType()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_ValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.type_relaxed.Dictionary#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see art_relaxed.type_relaxed.Dictionary#getKeys()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Keys();

	/**
	 * Returns the meta object for class '{@link art_relaxed.type_relaxed.DictionaryDefaultValue <em>Dictionary Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Default Value</em>'.
	 * @see art_relaxed.type_relaxed.DictionaryDefaultValue
	 * @generated
	 */
	EClass getDictionaryDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.type_relaxed.DictionaryDefaultValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see art_relaxed.type_relaxed.DictionaryDefaultValue#getKey()
	 * @see #getDictionaryDefaultValue()
	 * @generated
	 */
	EAttribute getDictionaryDefaultValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.type_relaxed.DictionaryDefaultValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see art_relaxed.type_relaxed.DictionaryDefaultValue#getValue()
	 * @see #getDictionaryDefaultValue()
	 * @generated
	 */
	EAttribute getDictionaryDefaultValue_Value();

	/**
	 * Returns the meta object for enum '{@link art_relaxed.type_relaxed.PortRole <em>Port Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Role</em>'.
	 * @see art_relaxed.type_relaxed.PortRole
	 * @generated
	 */
	EEnum getPortRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Type_relaxedFactory getType_relaxedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.ComponentTypeImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PORT = eINSTANCE.getComponentType_Port();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__ATTRIBUTE = eINSTANCE.getComponentType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__GROUPS = eINSTANCE.getComponentType_Groups();

		/**
		 * The meta object literal for the '<em><b>Implem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__IMPLEM = eINSTANCE.getComponentType_Implem();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.PrimitiveTypeImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.CompositeTypeImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.ServiceImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OPERATION = eINSTANCE.getService_Operation();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.OperationImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INPUT = eINSTANCE.getOperation_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUTPUT = eINSTANCE.getOperation_Output();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.ParameterImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.FunctionalServiceImpl <em>Functional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.FunctionalServiceImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getFunctionalService()
		 * @generated
		 */
		EClass FUNCTIONAL_SERVICE = eINSTANCE.getFunctionalService();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.ControlServiceImpl <em>Control Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.ControlServiceImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getControlService()
		 * @generated
		 */
		EClass CONTROL_SERVICE = eINSTANCE.getControlService();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.AbstractPortImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getAbstractPort()
		 * @generated
		 */
		EClass ABSTRACT_PORT = eINSTANCE.getAbstractPort();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PORT__SERVICE = eINSTANCE.getAbstractPort_Service();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PORT__ROLE = eINSTANCE.getAbstractPort_Role();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PORT__PROTOCOL = eINSTANCE.getAbstractPort_Protocol();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PORT__URI = eINSTANCE.getAbstractPort_Uri();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.PortImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.PortCollectionImpl <em>Port Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.PortCollectionImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPortCollection()
		 * @generated
		 */
		EClass PORT_COLLECTION = eINSTANCE.getPortCollection();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_COLLECTION__IDS = eINSTANCE.getPortCollection_Ids();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.PortIdImpl <em>Port Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.PortIdImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPortId()
		 * @generated
		 */
		EClass PORT_ID = eINSTANCE.getPortId();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.AttributeImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.BasicAttributeImpl <em>Basic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.BasicAttributeImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getBasicAttribute()
		 * @generated
		 */
		EClass BASIC_ATTRIBUTE = eINSTANCE.getBasicAttribute();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getBasicAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.DictionaryImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__VALUE_TYPE = eINSTANCE.getDictionary_ValueType();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__KEYS = eINSTANCE.getDictionary_Keys();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.impl.DictionaryDefaultValueImpl <em>Dictionary Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.impl.DictionaryDefaultValueImpl
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getDictionaryDefaultValue()
		 * @generated
		 */
		EClass DICTIONARY_DEFAULT_VALUE = eINSTANCE.getDictionaryDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY_DEFAULT_VALUE__KEY = eINSTANCE.getDictionaryDefaultValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY_DEFAULT_VALUE__VALUE = eINSTANCE.getDictionaryDefaultValue_Value();

		/**
		 * The meta object literal for the '{@link art_relaxed.type_relaxed.PortRole <em>Port Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.type_relaxed.PortRole
		 * @see art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl#getPortRole()
		 * @generated
		 */
		EEnum PORT_ROLE = eINSTANCE.getPortRole();

	}

} //Type_relaxedPackage
