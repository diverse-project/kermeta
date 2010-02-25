/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pattern.art.ArtPackage;

import patternframework.PatternframeworkPackage;

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
 * @see pattern.art.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://art/pattern/art/type";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "type";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypePackage eINSTANCE = pattern.art.type.impl.TypePackageImpl.init();

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.ComponentTypeImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = ArtPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PORT = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ATTRIBUTE = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__GROUPS = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__IMPLEM = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.PrimitiveTypeImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 1;

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
	 * The meta object id for the '{@link pattern.art.type.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.CompositeTypeImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getCompositeType()
	 * @generated
	 */
	int COMPOSITE_TYPE = 2;

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
	 * The meta object id for the '{@link pattern.art.type.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.ServiceImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = ArtPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OPERATION = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.OperationImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = ArtPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUT = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTPUT = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.ParameterImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = ArtPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = ArtPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = ArtPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.FunctionalServiceImpl <em>Functional Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.FunctionalServiceImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getFunctionalService()
	 * @generated
	 */
	int FUNCTIONAL_SERVICE = 6;

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
	 * The meta object id for the '{@link pattern.art.type.impl.ControlServiceImpl <em>Control Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.ControlServiceImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getControlService()
	 * @generated
	 */
	int CONTROL_SERVICE = 7;

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
	 * The meta object id for the '{@link pattern.art.type.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.AbstractPortImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getAbstractPort()
	 * @generated
	 */
	int ABSTRACT_PORT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__NAME = ArtPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__SERVICE = ArtPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__ROLE = ArtPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_FEATURE_COUNT = ArtPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.PortImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getPort()
	 * @generated
	 */
	int PORT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ArtPackage.CARDINALITY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LOWER = ArtPackage.CARDINALITY_ELEMENT__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__UPPER = ArtPackage.CARDINALITY_ELEMENT__UPPER;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SERVICE = ArtPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ROLE = ArtPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IS_OPTIONAL = ArtPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ArtPackage.CARDINALITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.PortCollectionImpl <em>Port Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.PortCollectionImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getPortCollection()
	 * @generated
	 */
	int PORT_COLLECTION = 10;

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
	 * The meta object id for the '{@link pattern.art.type.impl.PortIdImpl <em>Port Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.PortIdImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getPortId()
	 * @generated
	 */
	int PORT_ID = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ID__NAME = ArtPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Port Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_ID_FEATURE_COUNT = ArtPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.AttributeImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ArtPackage.TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ArtPackage.TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ArtPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pattern.art.type.impl.BasicAttributeImpl <em>Basic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.BasicAttributeImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getBasicAttribute()
	 * @generated
	 */
	int BASIC_ATTRIBUTE = 13;

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
	 * The meta object id for the '{@link pattern.art.type.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.DictionaryImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 14;

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
	 * The meta object id for the '{@link pattern.art.type.impl.DictionaryDefaultValueImpl <em>Dictionary Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.impl.DictionaryDefaultValueImpl
	 * @see pattern.art.type.impl.TypePackageImpl#getDictionaryDefaultValue()
	 * @generated
	 */
	int DICTIONARY_DEFAULT_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_DEFAULT_VALUE__KEY = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_DEFAULT_VALUE__VALUE = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dictionary Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_DEFAULT_VALUE_FEATURE_COUNT = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pattern.art.type.PortRole <em>Port Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.type.PortRole
	 * @see pattern.art.type.impl.TypePackageImpl#getPortRole()
	 * @generated
	 */
	int PORT_ROLE = 16;


	/**
	 * Returns the meta object for class '{@link pattern.art.type.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see pattern.art.type.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.type.ComponentType#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see pattern.art.type.ComponentType#getPort()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.type.ComponentType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see pattern.art.type.ComponentType#getAttribute()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Attribute();

	/**
	 * Returns the meta object for the reference list '{@link pattern.art.type.ComponentType#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see pattern.art.type.ComponentType#getGroups()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Groups();

	/**
	 * Returns the meta object for the containment reference '{@link pattern.art.type.ComponentType#getImplem <em>Implem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implem</em>'.
	 * @see pattern.art.type.ComponentType#getImplem()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Implem();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see pattern.art.type.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.CompositeType <em>Composite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type</em>'.
	 * @see pattern.art.type.CompositeType
	 * @generated
	 */
	EClass getCompositeType();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see pattern.art.type.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.type.Service#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see pattern.art.type.Service#getOperation()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Operation();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see pattern.art.type.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.type.Operation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see pattern.art.type.Operation#getInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.type.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see pattern.art.type.Operation#getOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Output();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see pattern.art.type.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.FunctionalService <em>Functional Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Service</em>'.
	 * @see pattern.art.type.FunctionalService
	 * @generated
	 */
	EClass getFunctionalService();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.ControlService <em>Control Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Service</em>'.
	 * @see pattern.art.type.ControlService
	 * @generated
	 */
	EClass getControlService();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.AbstractPort <em>Abstract Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Port</em>'.
	 * @see pattern.art.type.AbstractPort
	 * @generated
	 */
	EClass getAbstractPort();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.type.AbstractPort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see pattern.art.type.AbstractPort#getService()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EReference getAbstractPort_Service();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.type.AbstractPort#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see pattern.art.type.AbstractPort#getRole()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EAttribute getAbstractPort_Role();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see pattern.art.type.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.type.Port#getIsOptional <em>Is Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Optional</em>'.
	 * @see pattern.art.type.Port#getIsOptional()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_IsOptional();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.PortCollection <em>Port Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Collection</em>'.
	 * @see pattern.art.type.PortCollection
	 * @generated
	 */
	EClass getPortCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.type.PortCollection#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ids</em>'.
	 * @see pattern.art.type.PortCollection#getIds()
	 * @see #getPortCollection()
	 * @generated
	 */
	EReference getPortCollection_Ids();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.PortId <em>Port Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Id</em>'.
	 * @see pattern.art.type.PortId
	 * @generated
	 */
	EClass getPortId();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see pattern.art.type.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.BasicAttribute <em>Basic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Attribute</em>'.
	 * @see pattern.art.type.BasicAttribute
	 * @generated
	 */
	EClass getBasicAttribute();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.type.BasicAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see pattern.art.type.BasicAttribute#getDefaultValue()
	 * @see #getBasicAttribute()
	 * @generated
	 */
	EAttribute getBasicAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see pattern.art.type.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.type.Dictionary#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see pattern.art.type.Dictionary#getValueType()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_ValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.type.Dictionary#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see pattern.art.type.Dictionary#getKeys()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Keys();

	/**
	 * Returns the meta object for class '{@link pattern.art.type.DictionaryDefaultValue <em>Dictionary Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Default Value</em>'.
	 * @see pattern.art.type.DictionaryDefaultValue
	 * @generated
	 */
	EClass getDictionaryDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.type.DictionaryDefaultValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see pattern.art.type.DictionaryDefaultValue#getKey()
	 * @see #getDictionaryDefaultValue()
	 * @generated
	 */
	EAttribute getDictionaryDefaultValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.type.DictionaryDefaultValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pattern.art.type.DictionaryDefaultValue#getValue()
	 * @see #getDictionaryDefaultValue()
	 * @generated
	 */
	EAttribute getDictionaryDefaultValue_Value();

	/**
	 * Returns the meta object for enum '{@link pattern.art.type.PortRole <em>Port Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Role</em>'.
	 * @see pattern.art.type.PortRole
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
	TypeFactory getTypeFactory();

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
		 * The meta object literal for the '{@link pattern.art.type.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.ComponentTypeImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getComponentType()
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
		 * The meta object literal for the '{@link pattern.art.type.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.PrimitiveTypeImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link pattern.art.type.impl.CompositeTypeImpl <em>Composite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.CompositeTypeImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getCompositeType()
		 * @generated
		 */
		EClass COMPOSITE_TYPE = eINSTANCE.getCompositeType();

		/**
		 * The meta object literal for the '{@link pattern.art.type.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.ServiceImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getService()
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
		 * The meta object literal for the '{@link pattern.art.type.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.OperationImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getOperation()
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
		 * The meta object literal for the '{@link pattern.art.type.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.ParameterImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link pattern.art.type.impl.FunctionalServiceImpl <em>Functional Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.FunctionalServiceImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getFunctionalService()
		 * @generated
		 */
		EClass FUNCTIONAL_SERVICE = eINSTANCE.getFunctionalService();

		/**
		 * The meta object literal for the '{@link pattern.art.type.impl.ControlServiceImpl <em>Control Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.ControlServiceImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getControlService()
		 * @generated
		 */
		EClass CONTROL_SERVICE = eINSTANCE.getControlService();

		/**
		 * The meta object literal for the '{@link pattern.art.type.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.AbstractPortImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getAbstractPort()
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
		 * The meta object literal for the '{@link pattern.art.type.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.PortImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Is Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__IS_OPTIONAL = eINSTANCE.getPort_IsOptional();

		/**
		 * The meta object literal for the '{@link pattern.art.type.impl.PortCollectionImpl <em>Port Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.PortCollectionImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getPortCollection()
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
		 * The meta object literal for the '{@link pattern.art.type.impl.PortIdImpl <em>Port Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.PortIdImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getPortId()
		 * @generated
		 */
		EClass PORT_ID = eINSTANCE.getPortId();

		/**
		 * The meta object literal for the '{@link pattern.art.type.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.AttributeImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link pattern.art.type.impl.BasicAttributeImpl <em>Basic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.BasicAttributeImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getBasicAttribute()
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
		 * The meta object literal for the '{@link pattern.art.type.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.DictionaryImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getDictionary()
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
		 * The meta object literal for the '{@link pattern.art.type.impl.DictionaryDefaultValueImpl <em>Dictionary Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.impl.DictionaryDefaultValueImpl
		 * @see pattern.art.type.impl.TypePackageImpl#getDictionaryDefaultValue()
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
		 * The meta object literal for the '{@link pattern.art.type.PortRole <em>Port Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.type.PortRole
		 * @see pattern.art.type.impl.TypePackageImpl#getPortRole()
		 * @generated
		 */
		EEnum PORT_ROLE = eINSTANCE.getPortRole();

	}

} //TypePackage
