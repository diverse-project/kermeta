/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see art2.Art2Factory
 * @model kind="package"
 * @generated
 */
public interface Art2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "art2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://art/2.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "art2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Art2Package eINSTANCE = art2.impl.Art2PackageImpl.init();

	/**
	 * The meta object id for the '{@link art2.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.NamedElementImpl
	 * @see art2.impl.Art2PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link art2.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.ComponentInstanceImpl
	 * @see art2.impl.Art2PackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hosted Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__HOSTED_PORTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__DICTIONARY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Require Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__REQUIRE_PORTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAMESPACE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link art2.impl.DeployUnitImpl <em>Deploy Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.DeployUnitImpl
	 * @see art2.impl.Art2PackageImpl#getDeployUnit()
	 * @generated
	 */
	int DEPLOY_UNIT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__GROUP_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__UNIT_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Deploy Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link art2.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.ComponentTypeImpl
	 * @see art2.impl.Art2PackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = DEPLOY_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__GROUP_NAME = DEPLOY_UNIT__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__UNIT_NAME = DEPLOY_UNIT__UNIT_NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__VERSION = DEPLOY_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Hosted Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__HOSTED_PORT_TYPES = DEPLOY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DICTIONARY = DEPLOY_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__BEAN = DEPLOY_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Needed Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NEEDED_PORT_TYPES = DEPLOY_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Integration Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INTEGRATION_PATTERNS = DEPLOY_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Extra Fonctional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES = DEPLOY_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Offered Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__OFFERED_PORT_TYPES = DEPLOY_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = DEPLOY_UNIT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link art2.impl.ContainerNodeImpl <em>Container Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.ContainerNodeImpl
	 * @see art2.impl.Art2PackageImpl#getContainerNode()
	 * @generated
	 */
	int CONTAINER_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__COMPONENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE__BINDINGS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art2.impl.ContainerRootImpl <em>Container Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.ContainerRootImpl
	 * @see art2.impl.Art2PackageImpl#getContainerRoot()
	 * @generated
	 */
	int CONTAINER_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__NODES = 0;

	/**
	 * The feature id for the '<em><b>Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__COMPONENT_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__REPOSITORIES = 2;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__DATA_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Available Port Impl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__AVAILABLE_PORT_IMPL = 4;

	/**
	 * The number of structural features of the '<em>Container Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link art2.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.PortTypeImpl
	 * @see art2.impl.Art2PackageImpl#getPortType()
	 * @generated
	 */
	int PORT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__IMPL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__SYNCHRONE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__BEAN = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link art2.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.PortImpl
	 * @see art2.impl.Art2PackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art2.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.NamespaceImpl
	 * @see art2.impl.Art2PackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__CHILDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art2.impl.AbstractPortImplImpl <em>Abstract Port Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.AbstractPortImplImpl
	 * @see art2.impl.Art2PackageImpl#getAbstractPortImpl()
	 * @generated
	 */
	int ABSTRACT_PORT_IMPL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_IMPL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Port Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_IMPL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art2.impl.AbstractDataTypeImpl <em>Abstract Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.AbstractDataTypeImpl
	 * @see art2.impl.Art2PackageImpl#getAbstractDataType()
	 * @generated
	 */
	int ABSTRACT_DATA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATA_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art2.impl.PortServiceImplImpl <em>Port Service Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.PortServiceImplImpl
	 * @see art2.impl.Art2PackageImpl#getPortServiceImpl()
	 * @generated
	 */
	int PORT_SERVICE_IMPL = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVICE_IMPL__NAME = ABSTRACT_PORT_IMPL__NAME;

	/**
	 * The number of structural features of the '<em>Port Service Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SERVICE_IMPL_FEATURE_COUNT = ABSTRACT_PORT_IMPL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art2.impl.PortActorImplImpl <em>Port Actor Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.PortActorImplImpl
	 * @see art2.impl.Art2PackageImpl#getPortActorImpl()
	 * @generated
	 */
	int PORT_ACTOR_IMPL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ACTOR_IMPL__NAME = ABSTRACT_PORT_IMPL__NAME;

	/**
	 * The number of structural features of the '<em>Port Actor Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ACTOR_IMPL_FEATURE_COUNT = ABSTRACT_PORT_IMPL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art2.impl.PortMessageImplImpl <em>Port Message Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.PortMessageImplImpl
	 * @see art2.impl.Art2PackageImpl#getPortMessageImpl()
	 * @generated
	 */
	int PORT_MESSAGE_IMPL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MESSAGE_IMPL__NAME = ABSTRACT_PORT_IMPL__NAME;

	/**
	 * The number of structural features of the '<em>Port Message Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MESSAGE_IMPL_FEATURE_COUNT = ABSTRACT_PORT_IMPL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art2.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.DictionaryImpl
	 * @see art2.impl.Art2PackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 12;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__VALUES = 0;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link art2.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.DictionaryTypeImpl
	 * @see art2.impl.Art2PackageImpl#getDictionaryType()
	 * @generated
	 */
	int DICTIONARY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__ATTRIBUTES = 0;

	/**
	 * The feature id for the '<em><b>Default Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE__DEFAULT_VALUES = 1;

	/**
	 * The number of structural features of the '<em>Dictionary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link art2.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.TypedElementImpl
	 * @see art2.impl.Art2PackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__DATATYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art2.impl.DictionaryAttributeImpl <em>Dictionary Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.DictionaryAttributeImpl
	 * @see art2.impl.Art2PackageImpl#getDictionaryAttribute()
	 * @generated
	 */
	int DICTIONARY_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__DATATYPE = TYPED_ELEMENT__DATATYPE;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__OPTIONAL = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dictionary Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art2.impl.DictionaryValueImpl <em>Dictionary Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.DictionaryValueImpl
	 * @see art2.impl.Art2PackageImpl#getDictionaryValue()
	 * @generated
	 */
	int DICTIONARY_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUE__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Dictionary Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link art2.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.BindingImpl
	 * @see art2.impl.Art2PackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 16;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORTS = 0;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link art2.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.CompositeTypeImpl
	 * @see art2.impl.Art2PackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__NAME = COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__GROUP_NAME = COMPONENT_TYPE__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__UNIT_NAME = COMPONENT_TYPE__UNIT_NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__VERSION = COMPONENT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Hosted Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__HOSTED_PORT_TYPES = COMPONENT_TYPE__HOSTED_PORT_TYPES;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__DICTIONARY = COMPONENT_TYPE__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__BEAN = COMPONENT_TYPE__BEAN;

	/**
	 * The feature id for the '<em><b>Needed Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__NEEDED_PORT_TYPES = COMPONENT_TYPE__NEEDED_PORT_TYPES;

	/**
	 * The feature id for the '<em><b>Integration Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__INTEGRATION_PATTERNS = COMPONENT_TYPE__INTEGRATION_PATTERNS;

	/**
	 * The feature id for the '<em><b>Extra Fonctional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__EXTRA_FONCTIONAL_PROPERTIES = COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Offered Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__OFFERED_PORT_TYPES = COMPONENT_TYPE__OFFERED_PORT_TYPES;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__CHILDS = COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__CHILD_PORT_TYPES = COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__WIRES = COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link art2.impl.PortTypeRefImpl <em>Port Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.PortTypeRefImpl
	 * @see art2.impl.Art2PackageImpl#getPortTypeRef()
	 * @generated
	 */
	int PORT_TYPE_REF = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF__REF = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art2.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.WireImpl
	 * @see art2.impl.Art2PackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 19;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__PORTS = 0;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link art2.impl.ServiceDataTypeImpl <em>Service Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.ServiceDataTypeImpl
	 * @see art2.impl.Art2PackageImpl#getServiceDataType()
	 * @generated
	 */
	int SERVICE_DATA_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DATA_TYPE__NAME = ABSTRACT_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DATA_TYPE__OPERATIONS = ABSTRACT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DATA_TYPE_FEATURE_COUNT = ABSTRACT_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art2.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.OperationImpl
	 * @see art2.impl.Art2PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art2.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.ParameterImpl
	 * @see art2.impl.Art2PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DATATYPE = TYPED_ELEMENT__DATATYPE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art2.impl.MessageDataTypeImpl <em>Message Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.MessageDataTypeImpl
	 * @see art2.impl.Art2PackageImpl#getMessageDataType()
	 * @generated
	 */
	int MESSAGE_DATA_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_TYPE__NAME = ABSTRACT_DATA_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Message Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_DATA_TYPE_FEATURE_COUNT = ABSTRACT_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art2.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.RepositoryImpl
	 * @see art2.impl.Art2PackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__UNITS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__URL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art2.impl.ComponentTypeLibraryImpl <em>Component Type Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.ComponentTypeLibraryImpl
	 * @see art2.impl.Art2PackageImpl#getComponentTypeLibrary()
	 * @generated
	 */
	int COMPONENT_TYPE_LIBRARY = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_LIBRARY__NAME = DEPLOY_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_LIBRARY__GROUP_NAME = DEPLOY_UNIT__GROUP_NAME;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_LIBRARY__UNIT_NAME = DEPLOY_UNIT__UNIT_NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_LIBRARY__VERSION = DEPLOY_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Sub Component Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_LIBRARY__SUB_COMPONENT_TYPES = DEPLOY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Type Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_LIBRARY_FEATURE_COUNT = DEPLOY_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art2.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.DataTypeImpl
	 * @see art2.impl.Art2PackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art2.impl.IntegrationPatternImpl <em>Integration Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.IntegrationPatternImpl
	 * @see art2.impl.Art2PackageImpl#getIntegrationPattern()
	 * @generated
	 */
	int INTEGRATION_PATTERN = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extra Fonctional Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN__PORT_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integration Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATION_PATTERN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art2.impl.ExtraFonctionalPropertyImpl <em>Extra Fonctional Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.ExtraFonctionalPropertyImpl
	 * @see art2.impl.Art2PackageImpl#getExtraFonctionalProperty()
	 * @generated
	 */
	int EXTRA_FONCTIONAL_PROPERTY = 31;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Extra Fonctional Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRA_FONCTIONAL_PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link art2.impl.OSGiScrDataTypeImpl <em>OS Gi Scr Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art2.impl.OSGiScrDataTypeImpl
	 * @see art2.impl.Art2PackageImpl#getOSGiScrDataType()
	 * @generated
	 */
	int OS_GI_SCR_DATA_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_SCR_DATA_TYPE__NAME = SERVICE_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_SCR_DATA_TYPE__OPERATIONS = SERVICE_DATA_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Interface Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_SCR_DATA_TYPE__INTERFACE_IMPL = SERVICE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OS Gi Scr Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_GI_SCR_DATA_TYPE_FEATURE_COUNT = SERVICE_DATA_TYPE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link art2.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see art2.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link art2.ComponentInstance#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see art2.ComponentInstance#getComponentType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ComponentInstance#getHostedPorts <em>Hosted Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosted Ports</em>'.
	 * @see art2.ComponentInstance#getHostedPorts()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_HostedPorts();

	/**
	 * Returns the meta object for the containment reference '{@link art2.ComponentInstance#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary</em>'.
	 * @see art2.ComponentInstance#getDictionary()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Dictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ComponentInstance#getRequirePorts <em>Require Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Require Ports</em>'.
	 * @see art2.ComponentInstance#getRequirePorts()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_RequirePorts();

	/**
	 * Returns the meta object for the reference '{@link art2.ComponentInstance#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see art2.ComponentInstance#getNamespace()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Namespace();

	/**
	 * Returns the meta object for class '{@link art2.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see art2.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ComponentType#getHostedPortTypes <em>Hosted Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosted Port Types</em>'.
	 * @see art2.ComponentType#getHostedPortTypes()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_HostedPortTypes();

	/**
	 * Returns the meta object for the containment reference '{@link art2.ComponentType#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary</em>'.
	 * @see art2.ComponentType#getDictionary()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Dictionary();

	/**
	 * Returns the meta object for the attribute '{@link art2.ComponentType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see art2.ComponentType#getBean()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Bean();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ComponentType#getNeededPortTypes <em>Needed Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Needed Port Types</em>'.
	 * @see art2.ComponentType#getNeededPortTypes()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_NeededPortTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ComponentType#getIntegrationPatterns <em>Integration Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integration Patterns</em>'.
	 * @see art2.ComponentType#getIntegrationPatterns()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_IntegrationPatterns();

	/**
	 * Returns the meta object for the containment reference '{@link art2.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extra Fonctional Properties</em>'.
	 * @see art2.ComponentType#getExtraFonctionalProperties()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ExtraFonctionalProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ComponentType#getOfferedPortTypes <em>Offered Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Port Types</em>'.
	 * @see art2.ComponentType#getOfferedPortTypes()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_OfferedPortTypes();

	/**
	 * Returns the meta object for class '{@link art2.ContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Node</em>'.
	 * @see art2.ContainerNode
	 * @generated
	 */
	EClass getContainerNode();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ContainerNode#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see art2.ContainerNode#getComponents()
	 * @see #getContainerNode()
	 * @generated
	 */
	EReference getContainerNode_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ContainerNode#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see art2.ContainerNode#getBindings()
	 * @see #getContainerNode()
	 * @generated
	 */
	EReference getContainerNode_Bindings();

	/**
	 * Returns the meta object for class '{@link art2.ContainerRoot <em>Container Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Root</em>'.
	 * @see art2.ContainerRoot
	 * @generated
	 */
	EClass getContainerRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ContainerRoot#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see art2.ContainerRoot#getNodes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ContainerRoot#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see art2.ContainerRoot#getComponentTypes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_ComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ContainerRoot#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see art2.ContainerRoot#getRepositories()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ContainerRoot#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see art2.ContainerRoot#getDataTypes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ContainerRoot#getAvailablePortImpl <em>Available Port Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Port Impl</em>'.
	 * @see art2.ContainerRoot#getAvailablePortImpl()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_AvailablePortImpl();

	/**
	 * Returns the meta object for class '{@link art2.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see art2.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the reference '{@link art2.PortType#getImpl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Impl</em>'.
	 * @see art2.PortType#getImpl()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Impl();

	/**
	 * Returns the meta object for the containment reference '{@link art2.PortType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see art2.PortType#getInterface()
	 * @see #getPortType()
	 * @generated
	 */
	EReference getPortType_Interface();

	/**
	 * Returns the meta object for the attribute '{@link art2.PortType#isSynchrone <em>Synchrone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchrone</em>'.
	 * @see art2.PortType#isSynchrone()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Synchrone();

	/**
	 * Returns the meta object for the attribute '{@link art2.PortType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see art2.PortType#getBean()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Bean();

	/**
	 * Returns the meta object for class '{@link art2.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see art2.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link art2.Port#getPortTypeRef <em>Port Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type Ref</em>'.
	 * @see art2.Port#getPortTypeRef()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortTypeRef();

	/**
	 * Returns the meta object for class '{@link art2.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see art2.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.Namespace#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see art2.Namespace#getChilds()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Childs();

	/**
	 * Returns the meta object for the reference '{@link art2.Namespace#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see art2.Namespace#getParent()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Parent();

	/**
	 * Returns the meta object for class '{@link art2.AbstractPortImpl <em>Abstract Port Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Port Impl</em>'.
	 * @see art2.AbstractPortImpl
	 * @generated
	 */
	EClass getAbstractPortImpl();

	/**
	 * Returns the meta object for class '{@link art2.AbstractDataType <em>Abstract Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Data Type</em>'.
	 * @see art2.AbstractDataType
	 * @generated
	 */
	EClass getAbstractDataType();

	/**
	 * Returns the meta object for class '{@link art2.PortServiceImpl <em>Port Service Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Service Impl</em>'.
	 * @see art2.PortServiceImpl
	 * @generated
	 */
	EClass getPortServiceImpl();

	/**
	 * Returns the meta object for class '{@link art2.PortActorImpl <em>Port Actor Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Actor Impl</em>'.
	 * @see art2.PortActorImpl
	 * @generated
	 */
	EClass getPortActorImpl();

	/**
	 * Returns the meta object for class '{@link art2.PortMessageImpl <em>Port Message Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Message Impl</em>'.
	 * @see art2.PortMessageImpl
	 * @generated
	 */
	EClass getPortMessageImpl();

	/**
	 * Returns the meta object for class '{@link art2.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see art2.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.Dictionary#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see art2.Dictionary#getValues()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Values();

	/**
	 * Returns the meta object for class '{@link art2.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Type</em>'.
	 * @see art2.DictionaryType
	 * @generated
	 */
	EClass getDictionaryType();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.DictionaryType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see art2.DictionaryType#getAttributes()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.DictionaryType#getDefaultValues <em>Default Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Values</em>'.
	 * @see art2.DictionaryType#getDefaultValues()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_DefaultValues();

	/**
	 * Returns the meta object for class '{@link art2.DictionaryAttribute <em>Dictionary Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Attribute</em>'.
	 * @see art2.DictionaryAttribute
	 * @generated
	 */
	EClass getDictionaryAttribute();

	/**
	 * Returns the meta object for the attribute '{@link art2.DictionaryAttribute#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see art2.DictionaryAttribute#isOptional()
	 * @see #getDictionaryAttribute()
	 * @generated
	 */
	EAttribute getDictionaryAttribute_Optional();

	/**
	 * Returns the meta object for class '{@link art2.DictionaryValue <em>Dictionary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Value</em>'.
	 * @see art2.DictionaryValue
	 * @generated
	 */
	EClass getDictionaryValue();

	/**
	 * Returns the meta object for the reference '{@link art2.DictionaryValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see art2.DictionaryValue#getAttribute()
	 * @see #getDictionaryValue()
	 * @generated
	 */
	EReference getDictionaryValue_Attribute();

	/**
	 * Returns the meta object for class '{@link art2.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see art2.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference list '{@link art2.Binding#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see art2.Binding#getPorts()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Ports();

	/**
	 * Returns the meta object for class '{@link art2.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see art2.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.CompositeType#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see art2.CompositeType#getChilds()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Childs();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.CompositeType#getChildPortTypes <em>Child Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Port Types</em>'.
	 * @see art2.CompositeType#getChildPortTypes()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_ChildPortTypes();

	/**
	 * Returns the meta object for the reference '{@link art2.CompositeType#getWires <em>Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wires</em>'.
	 * @see art2.CompositeType#getWires()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Wires();

	/**
	 * Returns the meta object for class '{@link art2.PortTypeRef <em>Port Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Ref</em>'.
	 * @see art2.PortTypeRef
	 * @generated
	 */
	EClass getPortTypeRef();

	/**
	 * Returns the meta object for the reference '{@link art2.PortTypeRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see art2.PortTypeRef#getRef()
	 * @see #getPortTypeRef()
	 * @generated
	 */
	EReference getPortTypeRef_Ref();

	/**
	 * Returns the meta object for class '{@link art2.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see art2.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the reference list '{@link art2.Wire#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see art2.Wire#getPorts()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Ports();

	/**
	 * Returns the meta object for class '{@link art2.ServiceDataType <em>Service Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Data Type</em>'.
	 * @see art2.ServiceDataType
	 * @generated
	 */
	EClass getServiceDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ServiceDataType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see art2.ServiceDataType#getOperations()
	 * @see #getServiceDataType()
	 * @generated
	 */
	EReference getServiceDataType_Operations();

	/**
	 * Returns the meta object for class '{@link art2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see art2.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see art2.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the reference '{@link art2.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see art2.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link art2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see art2.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link art2.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see art2.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link art2.TypedElement#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datatype</em>'.
	 * @see art2.TypedElement#getDatatype()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Datatype();

	/**
	 * Returns the meta object for class '{@link art2.MessageDataType <em>Message Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Data Type</em>'.
	 * @see art2.MessageDataType
	 * @generated
	 */
	EClass getMessageDataType();

	/**
	 * Returns the meta object for class '{@link art2.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see art2.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the reference list '{@link art2.Repository#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Units</em>'.
	 * @see art2.Repository#getUnits()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Units();

	/**
	 * Returns the meta object for the attribute '{@link art2.Repository#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see art2.Repository#getUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Url();

	/**
	 * Returns the meta object for class '{@link art2.DeployUnit <em>Deploy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy Unit</em>'.
	 * @see art2.DeployUnit
	 * @generated
	 */
	EClass getDeployUnit();

	/**
	 * Returns the meta object for the attribute '{@link art2.DeployUnit#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see art2.DeployUnit#getGroupName()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link art2.DeployUnit#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see art2.DeployUnit#getUnitName()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_UnitName();

	/**
	 * Returns the meta object for the attribute '{@link art2.DeployUnit#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see art2.DeployUnit#getVersion()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_Version();

	/**
	 * Returns the meta object for class '{@link art2.ComponentTypeLibrary <em>Component Type Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Library</em>'.
	 * @see art2.ComponentTypeLibrary
	 * @generated
	 */
	EClass getComponentTypeLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.ComponentTypeLibrary#getSubComponentTypes <em>Sub Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Component Types</em>'.
	 * @see art2.ComponentTypeLibrary#getSubComponentTypes()
	 * @see #getComponentTypeLibrary()
	 * @generated
	 */
	EReference getComponentTypeLibrary_SubComponentTypes();

	/**
	 * Returns the meta object for class '{@link art2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see art2.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link art2.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see art2.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link art2.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see art2.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link art2.IntegrationPattern <em>Integration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Pattern</em>'.
	 * @see art2.IntegrationPattern
	 * @generated
	 */
	EClass getIntegrationPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link art2.IntegrationPattern#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extra Fonctional Properties</em>'.
	 * @see art2.IntegrationPattern#getExtraFonctionalProperties()
	 * @see #getIntegrationPattern()
	 * @generated
	 */
	EReference getIntegrationPattern_ExtraFonctionalProperties();

	/**
	 * Returns the meta object for the reference list '{@link art2.IntegrationPattern#getPortTypes <em>Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Types</em>'.
	 * @see art2.IntegrationPattern#getPortTypes()
	 * @see #getIntegrationPattern()
	 * @generated
	 */
	EReference getIntegrationPattern_PortTypes();

	/**
	 * Returns the meta object for class '{@link art2.ExtraFonctionalProperty <em>Extra Fonctional Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Fonctional Property</em>'.
	 * @see art2.ExtraFonctionalProperty
	 * @generated
	 */
	EClass getExtraFonctionalProperty();

	/**
	 * Returns the meta object for the reference list '{@link art2.ExtraFonctionalProperty#getPortTypes <em>Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Types</em>'.
	 * @see art2.ExtraFonctionalProperty#getPortTypes()
	 * @see #getExtraFonctionalProperty()
	 * @generated
	 */
	EReference getExtraFonctionalProperty_PortTypes();

	/**
	 * Returns the meta object for class '{@link art2.OSGiScrDataType <em>OS Gi Scr Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Gi Scr Data Type</em>'.
	 * @see art2.OSGiScrDataType
	 * @generated
	 */
	EClass getOSGiScrDataType();

	/**
	 * Returns the meta object for the attribute '{@link art2.OSGiScrDataType#getInterfaceImpl <em>Interface Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Impl</em>'.
	 * @see art2.OSGiScrDataType#getInterfaceImpl()
	 * @see #getOSGiScrDataType()
	 * @generated
	 */
	EAttribute getOSGiScrDataType_InterfaceImpl();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Art2Factory getArt2Factory();

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
		 * The meta object literal for the '{@link art2.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.ComponentInstanceImpl
		 * @see art2.impl.Art2PackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT_TYPE = eINSTANCE.getComponentInstance_ComponentType();

		/**
		 * The meta object literal for the '<em><b>Hosted Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__HOSTED_PORTS = eINSTANCE.getComponentInstance_HostedPorts();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__DICTIONARY = eINSTANCE.getComponentInstance_Dictionary();

		/**
		 * The meta object literal for the '<em><b>Require Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__REQUIRE_PORTS = eINSTANCE.getComponentInstance_RequirePorts();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__NAMESPACE = eINSTANCE.getComponentInstance_Namespace();

		/**
		 * The meta object literal for the '{@link art2.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.ComponentTypeImpl
		 * @see art2.impl.Art2PackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Hosted Port Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__HOSTED_PORT_TYPES = eINSTANCE.getComponentType_HostedPortTypes();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__DICTIONARY = eINSTANCE.getComponentType_Dictionary();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__BEAN = eINSTANCE.getComponentType_Bean();

		/**
		 * The meta object literal for the '<em><b>Needed Port Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__NEEDED_PORT_TYPES = eINSTANCE.getComponentType_NeededPortTypes();

		/**
		 * The meta object literal for the '<em><b>Integration Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__INTEGRATION_PATTERNS = eINSTANCE.getComponentType_IntegrationPatterns();

		/**
		 * The meta object literal for the '<em><b>Extra Fonctional Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES = eINSTANCE.getComponentType_ExtraFonctionalProperties();

		/**
		 * The meta object literal for the '<em><b>Offered Port Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__OFFERED_PORT_TYPES = eINSTANCE.getComponentType_OfferedPortTypes();

		/**
		 * The meta object literal for the '{@link art2.impl.ContainerNodeImpl <em>Container Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.ContainerNodeImpl
		 * @see art2.impl.Art2PackageImpl#getContainerNode()
		 * @generated
		 */
		EClass CONTAINER_NODE = eINSTANCE.getContainerNode();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_NODE__COMPONENTS = eINSTANCE.getContainerNode_Components();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_NODE__BINDINGS = eINSTANCE.getContainerNode_Bindings();

		/**
		 * The meta object literal for the '{@link art2.impl.ContainerRootImpl <em>Container Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.ContainerRootImpl
		 * @see art2.impl.Art2PackageImpl#getContainerRoot()
		 * @generated
		 */
		EClass CONTAINER_ROOT = eINSTANCE.getContainerRoot();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__NODES = eINSTANCE.getContainerRoot_Nodes();

		/**
		 * The meta object literal for the '<em><b>Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__COMPONENT_TYPES = eINSTANCE.getContainerRoot_ComponentTypes();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__REPOSITORIES = eINSTANCE.getContainerRoot_Repositories();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__DATA_TYPES = eINSTANCE.getContainerRoot_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Available Port Impl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__AVAILABLE_PORT_IMPL = eINSTANCE.getContainerRoot_AvailablePortImpl();

		/**
		 * The meta object literal for the '{@link art2.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.PortTypeImpl
		 * @see art2.impl.Art2PackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Impl</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__IMPL = eINSTANCE.getPortType_Impl();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE__INTERFACE = eINSTANCE.getPortType_Interface();

		/**
		 * The meta object literal for the '<em><b>Synchrone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__SYNCHRONE = eINSTANCE.getPortType_Synchrone();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__BEAN = eINSTANCE.getPortType_Bean();

		/**
		 * The meta object literal for the '{@link art2.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.PortImpl
		 * @see art2.impl.Art2PackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Port Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_TYPE_REF = eINSTANCE.getPort_PortTypeRef();

		/**
		 * The meta object literal for the '{@link art2.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.NamespaceImpl
		 * @see art2.impl.Art2PackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__CHILDS = eINSTANCE.getNamespace_Childs();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PARENT = eINSTANCE.getNamespace_Parent();

		/**
		 * The meta object literal for the '{@link art2.impl.AbstractPortImplImpl <em>Abstract Port Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.AbstractPortImplImpl
		 * @see art2.impl.Art2PackageImpl#getAbstractPortImpl()
		 * @generated
		 */
		EClass ABSTRACT_PORT_IMPL = eINSTANCE.getAbstractPortImpl();

		/**
		 * The meta object literal for the '{@link art2.impl.AbstractDataTypeImpl <em>Abstract Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.AbstractDataTypeImpl
		 * @see art2.impl.Art2PackageImpl#getAbstractDataType()
		 * @generated
		 */
		EClass ABSTRACT_DATA_TYPE = eINSTANCE.getAbstractDataType();

		/**
		 * The meta object literal for the '{@link art2.impl.PortServiceImplImpl <em>Port Service Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.PortServiceImplImpl
		 * @see art2.impl.Art2PackageImpl#getPortServiceImpl()
		 * @generated
		 */
		EClass PORT_SERVICE_IMPL = eINSTANCE.getPortServiceImpl();

		/**
		 * The meta object literal for the '{@link art2.impl.PortActorImplImpl <em>Port Actor Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.PortActorImplImpl
		 * @see art2.impl.Art2PackageImpl#getPortActorImpl()
		 * @generated
		 */
		EClass PORT_ACTOR_IMPL = eINSTANCE.getPortActorImpl();

		/**
		 * The meta object literal for the '{@link art2.impl.PortMessageImplImpl <em>Port Message Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.PortMessageImplImpl
		 * @see art2.impl.Art2PackageImpl#getPortMessageImpl()
		 * @generated
		 */
		EClass PORT_MESSAGE_IMPL = eINSTANCE.getPortMessageImpl();

		/**
		 * The meta object literal for the '{@link art2.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.DictionaryImpl
		 * @see art2.impl.Art2PackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__VALUES = eINSTANCE.getDictionary_Values();

		/**
		 * The meta object literal for the '{@link art2.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.DictionaryTypeImpl
		 * @see art2.impl.Art2PackageImpl#getDictionaryType()
		 * @generated
		 */
		EClass DICTIONARY_TYPE = eINSTANCE.getDictionaryType();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_TYPE__ATTRIBUTES = eINSTANCE.getDictionaryType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Default Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_TYPE__DEFAULT_VALUES = eINSTANCE.getDictionaryType_DefaultValues();

		/**
		 * The meta object literal for the '{@link art2.impl.DictionaryAttributeImpl <em>Dictionary Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.DictionaryAttributeImpl
		 * @see art2.impl.Art2PackageImpl#getDictionaryAttribute()
		 * @generated
		 */
		EClass DICTIONARY_ATTRIBUTE = eINSTANCE.getDictionaryAttribute();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTIONARY_ATTRIBUTE__OPTIONAL = eINSTANCE.getDictionaryAttribute_Optional();

		/**
		 * The meta object literal for the '{@link art2.impl.DictionaryValueImpl <em>Dictionary Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.DictionaryValueImpl
		 * @see art2.impl.Art2PackageImpl#getDictionaryValue()
		 * @generated
		 */
		EClass DICTIONARY_VALUE = eINSTANCE.getDictionaryValue();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_VALUE__ATTRIBUTE = eINSTANCE.getDictionaryValue_Attribute();

		/**
		 * The meta object literal for the '{@link art2.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.BindingImpl
		 * @see art2.impl.Art2PackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORTS = eINSTANCE.getBinding_Ports();

		/**
		 * The meta object literal for the '{@link art2.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.CompositeTypeImpl
		 * @see art2.impl.Art2PackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__CHILDS = eINSTANCE.getCompositeType_Childs();

		/**
		 * The meta object literal for the '<em><b>Child Port Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__CHILD_PORT_TYPES = eINSTANCE.getCompositeType_ChildPortTypes();

		/**
		 * The meta object literal for the '<em><b>Wires</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__WIRES = eINSTANCE.getCompositeType_Wires();

		/**
		 * The meta object literal for the '{@link art2.impl.PortTypeRefImpl <em>Port Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.PortTypeRefImpl
		 * @see art2.impl.Art2PackageImpl#getPortTypeRef()
		 * @generated
		 */
		EClass PORT_TYPE_REF = eINSTANCE.getPortTypeRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE_REF__REF = eINSTANCE.getPortTypeRef_Ref();

		/**
		 * The meta object literal for the '{@link art2.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.WireImpl
		 * @see art2.impl.Art2PackageImpl#getWire()
		 * @generated
		 */
		EClass WIRE = eINSTANCE.getWire();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIRE__PORTS = eINSTANCE.getWire_Ports();

		/**
		 * The meta object literal for the '{@link art2.impl.ServiceDataTypeImpl <em>Service Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.ServiceDataTypeImpl
		 * @see art2.impl.Art2PackageImpl#getServiceDataType()
		 * @generated
		 */
		EClass SERVICE_DATA_TYPE = eINSTANCE.getServiceDataType();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DATA_TYPE__OPERATIONS = eINSTANCE.getServiceDataType_Operations();

		/**
		 * The meta object literal for the '{@link art2.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.OperationImpl
		 * @see art2.impl.Art2PackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '{@link art2.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.ParameterImpl
		 * @see art2.impl.Art2PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link art2.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.TypedElementImpl
		 * @see art2.impl.Art2PackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__DATATYPE = eINSTANCE.getTypedElement_Datatype();

		/**
		 * The meta object literal for the '{@link art2.impl.MessageDataTypeImpl <em>Message Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.MessageDataTypeImpl
		 * @see art2.impl.Art2PackageImpl#getMessageDataType()
		 * @generated
		 */
		EClass MESSAGE_DATA_TYPE = eINSTANCE.getMessageDataType();

		/**
		 * The meta object literal for the '{@link art2.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.RepositoryImpl
		 * @see art2.impl.Art2PackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__UNITS = eINSTANCE.getRepository_Units();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__URL = eINSTANCE.getRepository_Url();

		/**
		 * The meta object literal for the '{@link art2.impl.DeployUnitImpl <em>Deploy Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.DeployUnitImpl
		 * @see art2.impl.Art2PackageImpl#getDeployUnit()
		 * @generated
		 */
		EClass DEPLOY_UNIT = eINSTANCE.getDeployUnit();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__GROUP_NAME = eINSTANCE.getDeployUnit_GroupName();

		/**
		 * The meta object literal for the '<em><b>Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__UNIT_NAME = eINSTANCE.getDeployUnit_UnitName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__VERSION = eINSTANCE.getDeployUnit_Version();

		/**
		 * The meta object literal for the '{@link art2.impl.ComponentTypeLibraryImpl <em>Component Type Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.ComponentTypeLibraryImpl
		 * @see art2.impl.Art2PackageImpl#getComponentTypeLibrary()
		 * @generated
		 */
		EClass COMPONENT_TYPE_LIBRARY = eINSTANCE.getComponentTypeLibrary();

		/**
		 * The meta object literal for the '<em><b>Sub Component Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE_LIBRARY__SUB_COMPONENT_TYPES = eINSTANCE.getComponentTypeLibrary_SubComponentTypes();

		/**
		 * The meta object literal for the '{@link art2.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.NamedElementImpl
		 * @see art2.impl.Art2PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link art2.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.DataTypeImpl
		 * @see art2.impl.Art2PackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link art2.impl.IntegrationPatternImpl <em>Integration Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.IntegrationPatternImpl
		 * @see art2.impl.Art2PackageImpl#getIntegrationPattern()
		 * @generated
		 */
		EClass INTEGRATION_PATTERN = eINSTANCE.getIntegrationPattern();

		/**
		 * The meta object literal for the '<em><b>Extra Fonctional Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PATTERN__EXTRA_FONCTIONAL_PROPERTIES = eINSTANCE.getIntegrationPattern_ExtraFonctionalProperties();

		/**
		 * The meta object literal for the '<em><b>Port Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATION_PATTERN__PORT_TYPES = eINSTANCE.getIntegrationPattern_PortTypes();

		/**
		 * The meta object literal for the '{@link art2.impl.ExtraFonctionalPropertyImpl <em>Extra Fonctional Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.ExtraFonctionalPropertyImpl
		 * @see art2.impl.Art2PackageImpl#getExtraFonctionalProperty()
		 * @generated
		 */
		EClass EXTRA_FONCTIONAL_PROPERTY = eINSTANCE.getExtraFonctionalProperty();

		/**
		 * The meta object literal for the '<em><b>Port Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRA_FONCTIONAL_PROPERTY__PORT_TYPES = eINSTANCE.getExtraFonctionalProperty_PortTypes();

		/**
		 * The meta object literal for the '{@link art2.impl.OSGiScrDataTypeImpl <em>OS Gi Scr Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art2.impl.OSGiScrDataTypeImpl
		 * @see art2.impl.Art2PackageImpl#getOSGiScrDataType()
		 * @generated
		 */
		EClass OS_GI_SCR_DATA_TYPE = eINSTANCE.getOSGiScrDataType();

		/**
		 * The meta object literal for the '<em><b>Interface Impl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_GI_SCR_DATA_TYPE__INTERFACE_IMPL = eINSTANCE.getOSGiScrDataType_InterfaceImpl();

	}

} //Art2Package
