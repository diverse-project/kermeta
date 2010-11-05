/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed;

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
 * @see art_relaxed.instance_relaxed.Instance_relaxedFactory
 * @model kind="package"
 * @generated
 */
public interface Instance_relaxedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instance_relaxed";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://art/instance_relaxed";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instance_relaxed";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Instance_relaxedPackage eINSTANCE = art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl.init();

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.ComponentInstanceImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PID = Art_relaxedPackage.MODEL_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = Art_relaxedPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__STATE = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SUPER_COMPONENT = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ATTRIBUTE = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BINDING = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__IMPLEM = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__GROUPS = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = Art_relaxedPackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.PrimitiveInstanceImpl <em>Primitive Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.PrimitiveInstanceImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getPrimitiveInstance()
	 * @generated
	 */
	int PRIMITIVE_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__PID = COMPONENT_INSTANCE__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__TYPE = COMPONENT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__STATE = COMPONENT_INSTANCE__STATE;

	/**
	 * The feature id for the '<em><b>Super Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__SUPER_COMPONENT = COMPONENT_INSTANCE__SUPER_COMPONENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__ATTRIBUTE = COMPONENT_INSTANCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__BINDING = COMPONENT_INSTANCE__BINDING;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__IMPLEM = COMPONENT_INSTANCE__IMPLEM;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE__GROUPS = COMPONENT_INSTANCE__GROUPS;

	/**
	 * The number of structural features of the '<em>Primitive Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.CompositeInstanceImpl <em>Composite Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.CompositeInstanceImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getCompositeInstance()
	 * @generated
	 */
	int COMPOSITE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__PID = COMPONENT_INSTANCE__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__NAME = COMPONENT_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__TYPE = COMPONENT_INSTANCE__TYPE;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__STATE = COMPONENT_INSTANCE__STATE;

	/**
	 * The feature id for the '<em><b>Super Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__SUPER_COMPONENT = COMPONENT_INSTANCE__SUPER_COMPONENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__ATTRIBUTE = COMPONENT_INSTANCE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__BINDING = COMPONENT_INSTANCE__BINDING;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__IMPLEM = COMPONENT_INSTANCE__IMPLEM;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__GROUPS = COMPONENT_INSTANCE__GROUPS;

	/**
	 * The feature id for the '<em><b>Sub Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__SUB_COMPONENT = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delegation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE__DELEGATION = COMPONENT_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.BindingImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 3;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PID = Art_relaxedPackage.ASPECT_MODEL_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Server Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SERVER_INSTANCE = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ID = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.TransmissionBindingImpl <em>Transmission Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.TransmissionBindingImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getTransmissionBinding()
	 * @generated
	 */
	int TRANSMISSION_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_BINDING__PID = BINDING__PID;

	/**
	 * The feature id for the '<em><b>Server Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_BINDING__SERVER_INSTANCE = BINDING__SERVER_INSTANCE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_BINDING__ID = BINDING__ID;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_BINDING__CLIENT = BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_BINDING__SERVER = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transmission Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.DelegationBindingImpl <em>Delegation Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.DelegationBindingImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getDelegationBinding()
	 * @generated
	 */
	int DELEGATION_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_BINDING__PID = BINDING__PID;

	/**
	 * The feature id for the '<em><b>Server Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_BINDING__SERVER_INSTANCE = BINDING__SERVER_INSTANCE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_BINDING__ID = BINDING__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_BINDING__SOURCE = BINDING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_BINDING__EXPORTED = BINDING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delegation Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_BINDING_FEATURE_COUNT = BINDING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.AttributeInstanceImpl <em>Attribute Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.AttributeInstanceImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getAttributeInstance()
	 * @generated
	 */
	int ATTRIBUTE_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INSTANCE__PID = Art_relaxedPackage.ASPECT_MODEL_ELEMENT__PID;

	/**
	 * The number of structural features of the '<em>Attribute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INSTANCE_FEATURE_COUNT = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.ValuedAttributeImpl <em>Valued Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.ValuedAttributeImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getValuedAttribute()
	 * @generated
	 */
	int VALUED_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE__PID = ATTRIBUTE_INSTANCE__PID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE__VALUE = ATTRIBUTE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE__ATTRIBUTE = ATTRIBUTE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Valued Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.DictionaryValuedAttributeImpl <em>Dictionary Valued Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.DictionaryValuedAttributeImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getDictionaryValuedAttribute()
	 * @generated
	 */
	int DICTIONARY_VALUED_ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUED_ATTRIBUTE__PID = ATTRIBUTE_INSTANCE__PID;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUED_ATTRIBUTE__ENTRIES = ATTRIBUTE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE = ATTRIBUTE_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dictionary Valued Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_VALUED_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.EntryImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PID = Art_relaxedPackage.ASPECT_MODEL_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = Art_relaxedPackage.ASPECT_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.DefaultEntryImpl <em>Default Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.DefaultEntryImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getDefaultEntry()
	 * @generated
	 */
	int DEFAULT_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ENTRY__PID = ENTRY__PID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ENTRY__VALUE = ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ENTRY__KEY = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ENTRY_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.impl.OtherEntryImpl <em>Other Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.impl.OtherEntryImpl
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getOtherEntry()
	 * @generated
	 */
	int OTHER_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ENTRY__PID = ENTRY__PID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ENTRY__VALUE = ENTRY__VALUE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ENTRY__KEY = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Other Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_ENTRY_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link art_relaxed.instance_relaxed.InstanceState <em>Instance State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.instance_relaxed.InstanceState
	 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getInstanceState()
	 * @generated
	 */
	int INSTANCE_STATE = 12;


	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see art_relaxed.instance_relaxed.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.instance_relaxed.ComponentInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getState()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_State();

	/**
	 * Returns the meta object for the container reference '{@link art_relaxed.instance_relaxed.ComponentInstance#getSuperComponent <em>Super Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Component</em>'.
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getSuperComponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_SuperComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.instance_relaxed.ComponentInstance#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getAttribute()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.instance_relaxed.ComponentInstance#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getBinding()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link art_relaxed.instance_relaxed.ComponentInstance#getImplem <em>Implem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implem</em>'.
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getImplem()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Implem();

	/**
	 * Returns the meta object for the reference list '{@link art_relaxed.instance_relaxed.ComponentInstance#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see art_relaxed.instance_relaxed.ComponentInstance#getGroups()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Groups();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.PrimitiveInstance <em>Primitive Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Instance</em>'.
	 * @see art_relaxed.instance_relaxed.PrimitiveInstance
	 * @generated
	 */
	EClass getPrimitiveInstance();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.CompositeInstance <em>Composite Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Instance</em>'.
	 * @see art_relaxed.instance_relaxed.CompositeInstance
	 * @generated
	 */
	EClass getCompositeInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.instance_relaxed.CompositeInstance#getSubComponent <em>Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Component</em>'.
	 * @see art_relaxed.instance_relaxed.CompositeInstance#getSubComponent()
	 * @see #getCompositeInstance()
	 * @generated
	 */
	EReference getCompositeInstance_SubComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.instance_relaxed.CompositeInstance#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation</em>'.
	 * @see art_relaxed.instance_relaxed.CompositeInstance#getDelegation()
	 * @see #getCompositeInstance()
	 * @generated
	 */
	EReference getCompositeInstance_Delegation();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see art_relaxed.instance_relaxed.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.Binding#getServerInstance <em>Server Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Instance</em>'.
	 * @see art_relaxed.instance_relaxed.Binding#getServerInstance()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ServerInstance();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.instance_relaxed.Binding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see art_relaxed.instance_relaxed.Binding#getId()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Id();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.TransmissionBinding <em>Transmission Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Binding</em>'.
	 * @see art_relaxed.instance_relaxed.TransmissionBinding
	 * @generated
	 */
	EClass getTransmissionBinding();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.TransmissionBinding#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see art_relaxed.instance_relaxed.TransmissionBinding#getClient()
	 * @see #getTransmissionBinding()
	 * @generated
	 */
	EReference getTransmissionBinding_Client();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.TransmissionBinding#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see art_relaxed.instance_relaxed.TransmissionBinding#getServer()
	 * @see #getTransmissionBinding()
	 * @generated
	 */
	EReference getTransmissionBinding_Server();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.DelegationBinding <em>Delegation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Binding</em>'.
	 * @see art_relaxed.instance_relaxed.DelegationBinding
	 * @generated
	 */
	EClass getDelegationBinding();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.DelegationBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see art_relaxed.instance_relaxed.DelegationBinding#getSource()
	 * @see #getDelegationBinding()
	 * @generated
	 */
	EReference getDelegationBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.DelegationBinding#getExported <em>Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exported</em>'.
	 * @see art_relaxed.instance_relaxed.DelegationBinding#getExported()
	 * @see #getDelegationBinding()
	 * @generated
	 */
	EReference getDelegationBinding_Exported();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.AttributeInstance <em>Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Instance</em>'.
	 * @see art_relaxed.instance_relaxed.AttributeInstance
	 * @generated
	 */
	EClass getAttributeInstance();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.ValuedAttribute <em>Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valued Attribute</em>'.
	 * @see art_relaxed.instance_relaxed.ValuedAttribute
	 * @generated
	 */
	EClass getValuedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.instance_relaxed.ValuedAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see art_relaxed.instance_relaxed.ValuedAttribute#getValue()
	 * @see #getValuedAttribute()
	 * @generated
	 */
	EAttribute getValuedAttribute_Value();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.ValuedAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see art_relaxed.instance_relaxed.ValuedAttribute#getAttribute()
	 * @see #getValuedAttribute()
	 * @generated
	 */
	EReference getValuedAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.DictionaryValuedAttribute <em>Dictionary Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Valued Attribute</em>'.
	 * @see art_relaxed.instance_relaxed.DictionaryValuedAttribute
	 * @generated
	 */
	EClass getDictionaryValuedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.instance_relaxed.DictionaryValuedAttribute#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see art_relaxed.instance_relaxed.DictionaryValuedAttribute#getEntries()
	 * @see #getDictionaryValuedAttribute()
	 * @generated
	 */
	EReference getDictionaryValuedAttribute_Entries();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.DictionaryValuedAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see art_relaxed.instance_relaxed.DictionaryValuedAttribute#getAttribute()
	 * @see #getDictionaryValuedAttribute()
	 * @generated
	 */
	EReference getDictionaryValuedAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see art_relaxed.instance_relaxed.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.instance_relaxed.Entry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see art_relaxed.instance_relaxed.Entry#getValue()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Value();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.DefaultEntry <em>Default Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Entry</em>'.
	 * @see art_relaxed.instance_relaxed.DefaultEntry
	 * @generated
	 */
	EClass getDefaultEntry();

	/**
	 * Returns the meta object for the reference '{@link art_relaxed.instance_relaxed.DefaultEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see art_relaxed.instance_relaxed.DefaultEntry#getKey()
	 * @see #getDefaultEntry()
	 * @generated
	 */
	EReference getDefaultEntry_Key();

	/**
	 * Returns the meta object for class '{@link art_relaxed.instance_relaxed.OtherEntry <em>Other Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Entry</em>'.
	 * @see art_relaxed.instance_relaxed.OtherEntry
	 * @generated
	 */
	EClass getOtherEntry();

	/**
	 * Returns the meta object for the attribute '{@link art_relaxed.instance_relaxed.OtherEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see art_relaxed.instance_relaxed.OtherEntry#getKey()
	 * @see #getOtherEntry()
	 * @generated
	 */
	EAttribute getOtherEntry_Key();

	/**
	 * Returns the meta object for enum '{@link art_relaxed.instance_relaxed.InstanceState <em>Instance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instance State</em>'.
	 * @see art_relaxed.instance_relaxed.InstanceState
	 * @generated
	 */
	EEnum getInstanceState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Instance_relaxedFactory getInstance_relaxedFactory();

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
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.ComponentInstanceImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__TYPE = eINSTANCE.getComponentInstance_Type();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__STATE = eINSTANCE.getComponentInstance_State();

		/**
		 * The meta object literal for the '<em><b>Super Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__SUPER_COMPONENT = eINSTANCE.getComponentInstance_SuperComponent();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__ATTRIBUTE = eINSTANCE.getComponentInstance_Attribute();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__BINDING = eINSTANCE.getComponentInstance_Binding();

		/**
		 * The meta object literal for the '<em><b>Implem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__IMPLEM = eINSTANCE.getComponentInstance_Implem();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__GROUPS = eINSTANCE.getComponentInstance_Groups();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.PrimitiveInstanceImpl <em>Primitive Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.PrimitiveInstanceImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getPrimitiveInstance()
		 * @generated
		 */
		EClass PRIMITIVE_INSTANCE = eINSTANCE.getPrimitiveInstance();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.CompositeInstanceImpl <em>Composite Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.CompositeInstanceImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getCompositeInstance()
		 * @generated
		 */
		EClass COMPOSITE_INSTANCE = eINSTANCE.getCompositeInstance();

		/**
		 * The meta object literal for the '<em><b>Sub Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INSTANCE__SUB_COMPONENT = eINSTANCE.getCompositeInstance_SubComponent();

		/**
		 * The meta object literal for the '<em><b>Delegation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_INSTANCE__DELEGATION = eINSTANCE.getCompositeInstance_Delegation();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.BindingImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Server Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__SERVER_INSTANCE = eINSTANCE.getBinding_ServerInstance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__ID = eINSTANCE.getBinding_Id();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.TransmissionBindingImpl <em>Transmission Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.TransmissionBindingImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getTransmissionBinding()
		 * @generated
		 */
		EClass TRANSMISSION_BINDING = eINSTANCE.getTransmissionBinding();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_BINDING__CLIENT = eINSTANCE.getTransmissionBinding_Client();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION_BINDING__SERVER = eINSTANCE.getTransmissionBinding_Server();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.DelegationBindingImpl <em>Delegation Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.DelegationBindingImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getDelegationBinding()
		 * @generated
		 */
		EClass DELEGATION_BINDING = eINSTANCE.getDelegationBinding();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_BINDING__SOURCE = eINSTANCE.getDelegationBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Exported</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION_BINDING__EXPORTED = eINSTANCE.getDelegationBinding_Exported();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.AttributeInstanceImpl <em>Attribute Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.AttributeInstanceImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getAttributeInstance()
		 * @generated
		 */
		EClass ATTRIBUTE_INSTANCE = eINSTANCE.getAttributeInstance();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.ValuedAttributeImpl <em>Valued Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.ValuedAttributeImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getValuedAttribute()
		 * @generated
		 */
		EClass VALUED_ATTRIBUTE = eINSTANCE.getValuedAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUED_ATTRIBUTE__VALUE = eINSTANCE.getValuedAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUED_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getValuedAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.DictionaryValuedAttributeImpl <em>Dictionary Valued Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.DictionaryValuedAttributeImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getDictionaryValuedAttribute()
		 * @generated
		 */
		EClass DICTIONARY_VALUED_ATTRIBUTE = eINSTANCE.getDictionaryValuedAttribute();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_VALUED_ATTRIBUTE__ENTRIES = eINSTANCE.getDictionaryValuedAttribute_Entries();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getDictionaryValuedAttribute_Attribute();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.EntryImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__VALUE = eINSTANCE.getEntry_Value();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.DefaultEntryImpl <em>Default Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.DefaultEntryImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getDefaultEntry()
		 * @generated
		 */
		EClass DEFAULT_ENTRY = eINSTANCE.getDefaultEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_ENTRY__KEY = eINSTANCE.getDefaultEntry_Key();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.impl.OtherEntryImpl <em>Other Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.impl.OtherEntryImpl
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getOtherEntry()
		 * @generated
		 */
		EClass OTHER_ENTRY = eINSTANCE.getOtherEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OTHER_ENTRY__KEY = eINSTANCE.getOtherEntry_Key();

		/**
		 * The meta object literal for the '{@link art_relaxed.instance_relaxed.InstanceState <em>Instance State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.instance_relaxed.InstanceState
		 * @see art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl#getInstanceState()
		 * @generated
		 */
		EEnum INSTANCE_STATE = eINSTANCE.getInstanceState();

	}

} //Instance_relaxedPackage
