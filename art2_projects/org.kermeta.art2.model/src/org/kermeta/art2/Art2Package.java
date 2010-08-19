/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2;

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
 * @see org.kermeta.art2.Art2Factory
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
	Art2Package eINSTANCE = org.kermeta.art2.impl.Art2PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.NamedElementImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 23;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.ComponentInstanceImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getComponentInstance()
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
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PROVIDED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__DICTIONARY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__REQUIRED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAMESPACE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__METRICS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.DeployUnitImpl <em>Deploy Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.DeployUnitImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getDeployUnit()
	 * @generated
	 */
	int DEPLOY_UNIT = 21;

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
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT__URL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Deploy Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.ComponentTypeImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getComponentType()
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
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__URL = DEPLOY_UNIT__URL;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DICTIONARY = DEPLOY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__FACTORY_BEAN = DEPLOY_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REQUIRED = DEPLOY_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Integration Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__INTEGRATION_PATTERNS = DEPLOY_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extra Fonctional Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__EXTRA_FONCTIONAL_PROPERTIES = DEPLOY_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PROVIDED = DEPLOY_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__BEAN = DEPLOY_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__START_METHOD = DEPLOY_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__STOP_METHOD = DEPLOY_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Required Libs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__REQUIRED_LIBS = DEPLOY_UNIT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = DEPLOY_UNIT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.ContainerNodeImpl <em>Container Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.ContainerNodeImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getContainerNode()
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
	 * The number of structural features of the '<em>Container Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.ContainerRootImpl <em>Container Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.ContainerRootImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getContainerRoot()
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
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__BINDINGS = 3;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__DATA_TYPES = 4;

	/**
	 * The feature id for the '<em><b>Port Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__PORT_TYPES = 5;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__LIBRARIES = 6;

	/**
	 * The feature id for the '<em><b>Message Hub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__MESSAGE_HUB = 7;

	/**
	 * The feature id for the '<em><b>MBindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__MBINDINGS = 8;

	/**
	 * The feature id for the '<em><b>Third Parties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT__THIRD_PARTIES = 9;

	/**
	 * The number of structural features of the '<em>Container Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_ROOT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.PortTypeImpl <em>Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.PortTypeImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getPortType()
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
	 * The feature id for the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE__SYNCHRONE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.PortImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Port Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_TYPE_REF = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__METRICS = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.NamespaceImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getNamespace()
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
	 * The meta object id for the '{@link org.kermeta.art2.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.DictionaryImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 7;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.DictionaryTypeImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getDictionaryType()
	 * @generated
	 */
	int DICTIONARY_TYPE = 8;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.TypedElementImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generic Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__GENERIC_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.DictionaryAttributeImpl <em>Dictionary Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.DictionaryAttributeImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getDictionaryAttribute()
	 * @generated
	 */
	int DICTIONARY_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generic Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_ATTRIBUTE__GENERIC_TYPES = TYPED_ELEMENT__GENERIC_TYPES;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.DictionaryValueImpl <em>Dictionary Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.DictionaryValueImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getDictionaryValue()
	 * @generated
	 */
	int DICTIONARY_VALUE = 10;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.BindingImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 11;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.CompositeTypeImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 12;

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
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__URL = COMPONENT_TYPE__URL;

	/**
	 * The feature id for the '<em><b>Dictionary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__DICTIONARY = COMPONENT_TYPE__DICTIONARY;

	/**
	 * The feature id for the '<em><b>Factory Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__FACTORY_BEAN = COMPONENT_TYPE__FACTORY_BEAN;

	/**
	 * The feature id for the '<em><b>Required</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__REQUIRED = COMPONENT_TYPE__REQUIRED;

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
	 * The feature id for the '<em><b>Provided</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__PROVIDED = COMPONENT_TYPE__PROVIDED;

	/**
	 * The feature id for the '<em><b>Bean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__BEAN = COMPONENT_TYPE__BEAN;

	/**
	 * The feature id for the '<em><b>Start Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__START_METHOD = COMPONENT_TYPE__START_METHOD;

	/**
	 * The feature id for the '<em><b>Stop Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__STOP_METHOD = COMPONENT_TYPE__STOP_METHOD;

	/**
	 * The feature id for the '<em><b>Required Libs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__REQUIRED_LIBS = COMPONENT_TYPE__REQUIRED_LIBS;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__CHILDS = COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE__WIRES = COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.PortTypeRefImpl <em>Port Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.PortTypeRefImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getPortTypeRef()
	 * @generated
	 */
	int PORT_TYPE_REF = 13;

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
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF__MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_REF_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.WireImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 14;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.ServicePortTypeImpl <em>Service Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.ServicePortTypeImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getServicePortType()
	 * @generated
	 */
	int SERVICE_PORT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__NAME = PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__SYNCHRONE = PORT_TYPE__SYNCHRONE;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__OPERATIONS = PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE__INTERFACE = PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PORT_TYPE_FEATURE_COUNT = PORT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.OperationImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 16;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.ParameterImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.MessagePortTypeImpl <em>Message Port Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.MessagePortTypeImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getMessagePortType()
	 * @generated
	 */
	int MESSAGE_PORT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__NAME = PORT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Synchrone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__SYNCHRONE = PORT_TYPE__SYNCHRONE;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE__FILTERS = PORT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Port Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_PORT_TYPE_FEATURE_COUNT = PORT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.RepositoryImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 20;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.ComponentTypeLibraryImpl <em>Component Type Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.ComponentTypeLibraryImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getComponentTypeLibrary()
	 * @generated
	 */
	int COMPONENT_TYPE_LIBRARY = 22;

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
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_LIBRARY__URL = DEPLOY_UNIT__URL;

	/**
	 * The feature id for the '<em><b>Sub Component Types</b></em>' reference list.
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
	 * The meta object id for the '{@link org.kermeta.art2.impl.IntegrationPatternImpl <em>Integration Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.IntegrationPatternImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getIntegrationPattern()
	 * @generated
	 */
	int INTEGRATION_PATTERN = 24;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.ExtraFonctionalPropertyImpl <em>Extra Fonctional Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.ExtraFonctionalPropertyImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getExtraFonctionalProperty()
	 * @generated
	 */
	int EXTRA_FONCTIONAL_PROPERTY = 25;

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
	 * The meta object id for the '{@link org.kermeta.art2.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.MetricImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__AVERAGE = 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__MIN = 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__MAX = 5;

	/**
	 * The feature id for the '<em><b>Best Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__BEST_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.PortTypeMappingImpl <em>Port Type Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.PortTypeMappingImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getPortTypeMapping()
	 * @generated
	 */
	int PORT_TYPE_MAPPING = 27;

	/**
	 * The feature id for the '<em><b>Bean Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_MAPPING__BEAN_METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_MAPPING__SERVICE_METHOD_NAME = 1;

	/**
	 * The number of structural features of the '<em>Port Type Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_TYPE_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.MessageHubImpl <em>Message Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.MessageHubImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getMessageHub()
	 * @generated
	 */
	int MESSAGE_HUB = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_HUB__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Message Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_HUB_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.TopicImpl <em>Topic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.TopicImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getTopic()
	 * @generated
	 */
	int TOPIC = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC__NAME = MESSAGE_HUB__NAME;

	/**
	 * The number of structural features of the '<em>Topic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPIC_FEATURE_COUNT = MESSAGE_HUB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.QueueImpl <em>Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.QueueImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__NAME = MESSAGE_HUB__NAME;

	/**
	 * The number of structural features of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_FEATURE_COUNT = MESSAGE_HUB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.art2.impl.MBindingImpl <em>MBinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.art2.impl.MBindingImpl
	 * @see org.kermeta.art2.impl.Art2PackageImpl#getMBinding()
	 * @generated
	 */
	int MBINDING = 31;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBINDING__PORT = 0;

	/**
	 * The feature id for the '<em><b>Hub</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBINDING__HUB = 1;

	/**
	 * The number of structural features of the '<em>MBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MBINDING_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.kermeta.art2.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.ComponentInstance#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see org.kermeta.art2.ComponentInstance#getComponentType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_ComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ComponentInstance#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided</em>'.
	 * @see org.kermeta.art2.ComponentInstance#getProvided()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Provided();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.art2.ComponentInstance#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary</em>'.
	 * @see org.kermeta.art2.ComponentInstance#getDictionary()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Dictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ComponentInstance#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required</em>'.
	 * @see org.kermeta.art2.ComponentInstance#getRequired()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Required();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.ComponentInstance#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see org.kermeta.art2.ComponentInstance#getNamespace()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Namespace();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.ComponentInstance#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metrics</em>'.
	 * @see org.kermeta.art2.ComponentInstance#getMetrics()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Metrics();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see org.kermeta.art2.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.art2.ComponentType#getDictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictionary</em>'.
	 * @see org.kermeta.art2.ComponentType#getDictionary()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Dictionary();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.ComponentType#getFactoryBean <em>Factory Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory Bean</em>'.
	 * @see org.kermeta.art2.ComponentType#getFactoryBean()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_FactoryBean();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ComponentType#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required</em>'.
	 * @see org.kermeta.art2.ComponentType#getRequired()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Required();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ComponentType#getIntegrationPatterns <em>Integration Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integration Patterns</em>'.
	 * @see org.kermeta.art2.ComponentType#getIntegrationPatterns()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_IntegrationPatterns();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.art2.ComponentType#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extra Fonctional Properties</em>'.
	 * @see org.kermeta.art2.ComponentType#getExtraFonctionalProperties()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ExtraFonctionalProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ComponentType#getProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided</em>'.
	 * @see org.kermeta.art2.ComponentType#getProvided()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Provided();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.ComponentType#getBean <em>Bean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean</em>'.
	 * @see org.kermeta.art2.ComponentType#getBean()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_Bean();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.ComponentType#getStartMethod <em>Start Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Method</em>'.
	 * @see org.kermeta.art2.ComponentType#getStartMethod()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_StartMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.ComponentType#getStopMethod <em>Stop Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Method</em>'.
	 * @see org.kermeta.art2.ComponentType#getStopMethod()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_StopMethod();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.ComponentType#getRequiredLibs <em>Required Libs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Libs</em>'.
	 * @see org.kermeta.art2.ComponentType#getRequiredLibs()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_RequiredLibs();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.ContainerNode <em>Container Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Node</em>'.
	 * @see org.kermeta.art2.ContainerNode
	 * @generated
	 */
	EClass getContainerNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerNode#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.kermeta.art2.ContainerNode#getComponents()
	 * @see #getContainerNode()
	 * @generated
	 */
	EReference getContainerNode_Components();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.ContainerRoot <em>Container Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Root</em>'.
	 * @see org.kermeta.art2.ContainerRoot
	 * @generated
	 */
	EClass getContainerRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getNodes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getComponentTypes <em>Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Types</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getComponentTypes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_ComponentTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getRepositories()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getBindings()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Bindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getDataTypes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getPortTypes <em>Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Types</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getPortTypes()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_PortTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getLibraries()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getMessageHub <em>Message Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Hub</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getMessageHub()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_MessageHub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getMBindings <em>MBindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>MBindings</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getMBindings()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_MBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ContainerRoot#getThirdParties <em>Third Parties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Third Parties</em>'.
	 * @see org.kermeta.art2.ContainerRoot#getThirdParties()
	 * @see #getContainerRoot()
	 * @generated
	 */
	EReference getContainerRoot_ThirdParties();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type</em>'.
	 * @see org.kermeta.art2.PortType
	 * @generated
	 */
	EClass getPortType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.PortType#isSynchrone <em>Synchrone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchrone</em>'.
	 * @see org.kermeta.art2.PortType#isSynchrone()
	 * @see #getPortType()
	 * @generated
	 */
	EAttribute getPortType_Synchrone();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.kermeta.art2.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.Port#getPortTypeRef <em>Port Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type Ref</em>'.
	 * @see org.kermeta.art2.Port#getPortTypeRef()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortTypeRef();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.Port#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metrics</em>'.
	 * @see org.kermeta.art2.Port#getMetrics()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Metrics();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.kermeta.art2.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.Namespace#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see org.kermeta.art2.Namespace#getChilds()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Childs();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.Namespace#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.kermeta.art2.Namespace#getParent()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Parent();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see org.kermeta.art2.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.Dictionary#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.kermeta.art2.Dictionary#getValues()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Values();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Type</em>'.
	 * @see org.kermeta.art2.DictionaryType
	 * @generated
	 */
	EClass getDictionaryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.DictionaryType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.kermeta.art2.DictionaryType#getAttributes()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.DictionaryType#getDefaultValues <em>Default Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Values</em>'.
	 * @see org.kermeta.art2.DictionaryType#getDefaultValues()
	 * @see #getDictionaryType()
	 * @generated
	 */
	EReference getDictionaryType_DefaultValues();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.DictionaryAttribute <em>Dictionary Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Attribute</em>'.
	 * @see org.kermeta.art2.DictionaryAttribute
	 * @generated
	 */
	EClass getDictionaryAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.DictionaryAttribute#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.kermeta.art2.DictionaryAttribute#isOptional()
	 * @see #getDictionaryAttribute()
	 * @generated
	 */
	EAttribute getDictionaryAttribute_Optional();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.DictionaryValue <em>Dictionary Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Value</em>'.
	 * @see org.kermeta.art2.DictionaryValue
	 * @generated
	 */
	EClass getDictionaryValue();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.DictionaryValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.kermeta.art2.DictionaryValue#getAttribute()
	 * @see #getDictionaryValue()
	 * @generated
	 */
	EReference getDictionaryValue_Attribute();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.kermeta.art2.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.Binding#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see org.kermeta.art2.Binding#getPorts()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Ports();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see org.kermeta.art2.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.CompositeType#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Childs</em>'.
	 * @see org.kermeta.art2.CompositeType#getChilds()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Childs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.CompositeType#getWires <em>Wires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wires</em>'.
	 * @see org.kermeta.art2.CompositeType#getWires()
	 * @see #getCompositeType()
	 * @generated
	 */
	EReference getCompositeType_Wires();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.PortTypeRef <em>Port Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Ref</em>'.
	 * @see org.kermeta.art2.PortTypeRef
	 * @generated
	 */
	EClass getPortTypeRef();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.PortTypeRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.kermeta.art2.PortTypeRef#getRef()
	 * @see #getPortTypeRef()
	 * @generated
	 */
	EReference getPortTypeRef_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.PortTypeRef#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.kermeta.art2.PortTypeRef#getMappings()
	 * @see #getPortTypeRef()
	 * @generated
	 */
	EReference getPortTypeRef_Mappings();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see org.kermeta.art2.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.Wire#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see org.kermeta.art2.Wire#getPorts()
	 * @see #getWire()
	 * @generated
	 */
	EReference getWire_Ports();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.ServicePortType <em>Service Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Port Type</em>'.
	 * @see org.kermeta.art2.ServicePortType
	 * @generated
	 */
	EClass getServicePortType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.ServicePortType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see org.kermeta.art2.ServicePortType#getOperations()
	 * @see #getServicePortType()
	 * @generated
	 */
	EReference getServicePortType_Operations();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.ServicePortType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.kermeta.art2.ServicePortType#getInterface()
	 * @see #getServicePortType()
	 * @generated
	 */
	EAttribute getServicePortType_Interface();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.kermeta.art2.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.kermeta.art2.Operation#getParameters()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see org.kermeta.art2.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.kermeta.art2.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.kermeta.art2.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see org.kermeta.art2.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.TypedElement#getGenericTypes <em>Generic Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generic Types</em>'.
	 * @see org.kermeta.art2.TypedElement#getGenericTypes()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_GenericTypes();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.MessagePortType <em>Message Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Port Type</em>'.
	 * @see org.kermeta.art2.MessagePortType
	 * @generated
	 */
	EClass getMessagePortType();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.MessagePortType#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filters</em>'.
	 * @see org.kermeta.art2.MessagePortType#getFilters()
	 * @see #getMessagePortType()
	 * @generated
	 */
	EReference getMessagePortType_Filters();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.kermeta.art2.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.Repository#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Units</em>'.
	 * @see org.kermeta.art2.Repository#getUnits()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Units();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.Repository#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.kermeta.art2.Repository#getUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Url();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.DeployUnit <em>Deploy Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy Unit</em>'.
	 * @see org.kermeta.art2.DeployUnit
	 * @generated
	 */
	EClass getDeployUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.DeployUnit#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see org.kermeta.art2.DeployUnit#getGroupName()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.DeployUnit#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see org.kermeta.art2.DeployUnit#getUnitName()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_UnitName();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.DeployUnit#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.kermeta.art2.DeployUnit#getVersion()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.DeployUnit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.kermeta.art2.DeployUnit#getUrl()
	 * @see #getDeployUnit()
	 * @generated
	 */
	EAttribute getDeployUnit_Url();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.ComponentTypeLibrary <em>Component Type Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Library</em>'.
	 * @see org.kermeta.art2.ComponentTypeLibrary
	 * @generated
	 */
	EClass getComponentTypeLibrary();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.ComponentTypeLibrary#getSubComponentTypes <em>Sub Component Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Component Types</em>'.
	 * @see org.kermeta.art2.ComponentTypeLibrary#getSubComponentTypes()
	 * @see #getComponentTypeLibrary()
	 * @generated
	 */
	EReference getComponentTypeLibrary_SubComponentTypes();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.kermeta.art2.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.art2.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.IntegrationPattern <em>Integration Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integration Pattern</em>'.
	 * @see org.kermeta.art2.IntegrationPattern
	 * @generated
	 */
	EClass getIntegrationPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.art2.IntegrationPattern#getExtraFonctionalProperties <em>Extra Fonctional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extra Fonctional Properties</em>'.
	 * @see org.kermeta.art2.IntegrationPattern#getExtraFonctionalProperties()
	 * @see #getIntegrationPattern()
	 * @generated
	 */
	EReference getIntegrationPattern_ExtraFonctionalProperties();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.IntegrationPattern#getPortTypes <em>Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Types</em>'.
	 * @see org.kermeta.art2.IntegrationPattern#getPortTypes()
	 * @see #getIntegrationPattern()
	 * @generated
	 */
	EReference getIntegrationPattern_PortTypes();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.ExtraFonctionalProperty <em>Extra Fonctional Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extra Fonctional Property</em>'.
	 * @see org.kermeta.art2.ExtraFonctionalProperty
	 * @generated
	 */
	EClass getExtraFonctionalProperty();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.art2.ExtraFonctionalProperty#getPortTypes <em>Port Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port Types</em>'.
	 * @see org.kermeta.art2.ExtraFonctionalProperty#getPortTypes()
	 * @see #getExtraFonctionalProperty()
	 * @generated
	 */
	EReference getExtraFonctionalProperty_PortTypes();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see org.kermeta.art2.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.art2.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.Metric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.art2.Metric#getValue()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.Metric#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.kermeta.art2.Metric#getType()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.Metric#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see org.kermeta.art2.Metric#getAverage()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Average();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.Metric#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.kermeta.art2.Metric#getMin()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.Metric#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.kermeta.art2.Metric#getMax()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.Metric#getBestValue <em>Best Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best Value</em>'.
	 * @see org.kermeta.art2.Metric#getBestValue()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_BestValue();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.PortTypeMapping <em>Port Type Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Type Mapping</em>'.
	 * @see org.kermeta.art2.PortTypeMapping
	 * @generated
	 */
	EClass getPortTypeMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.PortTypeMapping#getBeanMethodName <em>Bean Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bean Method Name</em>'.
	 * @see org.kermeta.art2.PortTypeMapping#getBeanMethodName()
	 * @see #getPortTypeMapping()
	 * @generated
	 */
	EAttribute getPortTypeMapping_BeanMethodName();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.art2.PortTypeMapping#getServiceMethodName <em>Service Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Method Name</em>'.
	 * @see org.kermeta.art2.PortTypeMapping#getServiceMethodName()
	 * @see #getPortTypeMapping()
	 * @generated
	 */
	EAttribute getPortTypeMapping_ServiceMethodName();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Topic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topic</em>'.
	 * @see org.kermeta.art2.Topic
	 * @generated
	 */
	EClass getTopic();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.MessageHub <em>Message Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Hub</em>'.
	 * @see org.kermeta.art2.MessageHub
	 * @generated
	 */
	EClass getMessageHub();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.Queue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see org.kermeta.art2.Queue
	 * @generated
	 */
	EClass getQueue();

	/**
	 * Returns the meta object for class '{@link org.kermeta.art2.MBinding <em>MBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MBinding</em>'.
	 * @see org.kermeta.art2.MBinding
	 * @generated
	 */
	EClass getMBinding();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.MBinding#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.kermeta.art2.MBinding#getPort()
	 * @see #getMBinding()
	 * @generated
	 */
	EReference getMBinding_Port();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.art2.MBinding#getHub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hub</em>'.
	 * @see org.kermeta.art2.MBinding#getHub()
	 * @see #getMBinding()
	 * @generated
	 */
	EReference getMBinding_Hub();

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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.ComponentInstanceImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getComponentInstance()
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
		 * The meta object literal for the '<em><b>Provided</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PROVIDED = eINSTANCE.getComponentInstance_Provided();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__DICTIONARY = eINSTANCE.getComponentInstance_Dictionary();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__REQUIRED = eINSTANCE.getComponentInstance_Required();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__NAMESPACE = eINSTANCE.getComponentInstance_Namespace();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__METRICS = eINSTANCE.getComponentInstance_Metrics();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.ComponentTypeImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Dictionary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__DICTIONARY = eINSTANCE.getComponentType_Dictionary();

		/**
		 * The meta object literal for the '<em><b>Factory Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__FACTORY_BEAN = eINSTANCE.getComponentType_FactoryBean();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__REQUIRED = eINSTANCE.getComponentType_Required();

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
		 * The meta object literal for the '<em><b>Provided</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PROVIDED = eINSTANCE.getComponentType_Provided();

		/**
		 * The meta object literal for the '<em><b>Bean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__BEAN = eINSTANCE.getComponentType_Bean();

		/**
		 * The meta object literal for the '<em><b>Start Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__START_METHOD = eINSTANCE.getComponentType_StartMethod();

		/**
		 * The meta object literal for the '<em><b>Stop Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__STOP_METHOD = eINSTANCE.getComponentType_StopMethod();

		/**
		 * The meta object literal for the '<em><b>Required Libs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__REQUIRED_LIBS = eINSTANCE.getComponentType_RequiredLibs();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.ContainerNodeImpl <em>Container Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.ContainerNodeImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getContainerNode()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.ContainerRootImpl <em>Container Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.ContainerRootImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getContainerRoot()
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
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__BINDINGS = eINSTANCE.getContainerRoot_Bindings();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__DATA_TYPES = eINSTANCE.getContainerRoot_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Port Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__PORT_TYPES = eINSTANCE.getContainerRoot_PortTypes();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__LIBRARIES = eINSTANCE.getContainerRoot_Libraries();

		/**
		 * The meta object literal for the '<em><b>Message Hub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__MESSAGE_HUB = eINSTANCE.getContainerRoot_MessageHub();

		/**
		 * The meta object literal for the '<em><b>MBindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__MBINDINGS = eINSTANCE.getContainerRoot_MBindings();

		/**
		 * The meta object literal for the '<em><b>Third Parties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_ROOT__THIRD_PARTIES = eINSTANCE.getContainerRoot_ThirdParties();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.PortTypeImpl <em>Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.PortTypeImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getPortType()
		 * @generated
		 */
		EClass PORT_TYPE = eINSTANCE.getPortType();

		/**
		 * The meta object literal for the '<em><b>Synchrone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE__SYNCHRONE = eINSTANCE.getPortType_Synchrone();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.PortImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getPort()
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
		 * The meta object literal for the '<em><b>Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__METRICS = eINSTANCE.getPort_Metrics();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.NamespaceImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getNamespace()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.DictionaryImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getDictionary()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.DictionaryTypeImpl <em>Dictionary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.DictionaryTypeImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getDictionaryType()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.DictionaryAttributeImpl <em>Dictionary Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.DictionaryAttributeImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getDictionaryAttribute()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.DictionaryValueImpl <em>Dictionary Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.DictionaryValueImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getDictionaryValue()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.BindingImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getBinding()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.CompositeTypeImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__CHILDS = eINSTANCE.getCompositeType_Childs();

		/**
		 * The meta object literal for the '<em><b>Wires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TYPE__WIRES = eINSTANCE.getCompositeType_Wires();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.PortTypeRefImpl <em>Port Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.PortTypeRefImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getPortTypeRef()
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
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_TYPE_REF__MAPPINGS = eINSTANCE.getPortTypeRef_Mappings();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.WireImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getWire()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.ServicePortTypeImpl <em>Service Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.ServicePortTypeImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getServicePortType()
		 * @generated
		 */
		EClass SERVICE_PORT_TYPE = eINSTANCE.getServicePortType();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PORT_TYPE__OPERATIONS = eINSTANCE.getServicePortType_Operations();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PORT_TYPE__INTERFACE = eINSTANCE.getServicePortType_Interface();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.OperationImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getOperation()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.ParameterImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.TypedElementImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Generic Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__GENERIC_TYPES = eINSTANCE.getTypedElement_GenericTypes();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.MessagePortTypeImpl <em>Message Port Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.MessagePortTypeImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getMessagePortType()
		 * @generated
		 */
		EClass MESSAGE_PORT_TYPE = eINSTANCE.getMessagePortType();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_PORT_TYPE__FILTERS = eINSTANCE.getMessagePortType_Filters();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.RepositoryImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getRepository()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.DeployUnitImpl <em>Deploy Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.DeployUnitImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getDeployUnit()
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
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOY_UNIT__URL = eINSTANCE.getDeployUnit_Url();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.ComponentTypeLibraryImpl <em>Component Type Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.ComponentTypeLibraryImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getComponentTypeLibrary()
		 * @generated
		 */
		EClass COMPONENT_TYPE_LIBRARY = eINSTANCE.getComponentTypeLibrary();

		/**
		 * The meta object literal for the '<em><b>Sub Component Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE_LIBRARY__SUB_COMPONENT_TYPES = eINSTANCE.getComponentTypeLibrary_SubComponentTypes();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.NamedElementImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.IntegrationPatternImpl <em>Integration Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.IntegrationPatternImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getIntegrationPattern()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.ExtraFonctionalPropertyImpl <em>Extra Fonctional Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.ExtraFonctionalPropertyImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getExtraFonctionalProperty()
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
		 * The meta object literal for the '{@link org.kermeta.art2.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.MetricImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__VALUE = eINSTANCE.getMetric_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__TYPE = eINSTANCE.getMetric_Type();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__AVERAGE = eINSTANCE.getMetric_Average();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__MIN = eINSTANCE.getMetric_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__MAX = eINSTANCE.getMetric_Max();

		/**
		 * The meta object literal for the '<em><b>Best Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__BEST_VALUE = eINSTANCE.getMetric_BestValue();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.PortTypeMappingImpl <em>Port Type Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.PortTypeMappingImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getPortTypeMapping()
		 * @generated
		 */
		EClass PORT_TYPE_MAPPING = eINSTANCE.getPortTypeMapping();

		/**
		 * The meta object literal for the '<em><b>Bean Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE_MAPPING__BEAN_METHOD_NAME = eINSTANCE.getPortTypeMapping_BeanMethodName();

		/**
		 * The meta object literal for the '<em><b>Service Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_TYPE_MAPPING__SERVICE_METHOD_NAME = eINSTANCE.getPortTypeMapping_ServiceMethodName();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.TopicImpl <em>Topic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.TopicImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getTopic()
		 * @generated
		 */
		EClass TOPIC = eINSTANCE.getTopic();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.MessageHubImpl <em>Message Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.MessageHubImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getMessageHub()
		 * @generated
		 */
		EClass MESSAGE_HUB = eINSTANCE.getMessageHub();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.QueueImpl <em>Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.QueueImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getQueue()
		 * @generated
		 */
		EClass QUEUE = eINSTANCE.getQueue();

		/**
		 * The meta object literal for the '{@link org.kermeta.art2.impl.MBindingImpl <em>MBinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.art2.impl.MBindingImpl
		 * @see org.kermeta.art2.impl.Art2PackageImpl#getMBinding()
		 * @generated
		 */
		EClass MBINDING = eINSTANCE.getMBinding();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBINDING__PORT = eINSTANCE.getMBinding_Port();

		/**
		 * The meta object literal for the '<em><b>Hub</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MBINDING__HUB = eINSTANCE.getMBinding_Hub();

	}

} //Art2Package
