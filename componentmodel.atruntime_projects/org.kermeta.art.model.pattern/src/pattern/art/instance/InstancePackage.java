/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.instance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import pattern.art.ArtPatternPackage;

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
 * @see pattern.art.instance.InstanceFactory
 * @model kind="package"
 * @generated
 */
public interface InstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://art/pattern/art/instance";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancePackage eINSTANCE = pattern.art.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link pattern.art.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.ComponentInstanceImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getComponentInstance()
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
	int COMPONENT_INSTANCE__NAME = ArtPatternPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = ArtPatternPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__STATE = ArtPatternPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SUPER_COMPONENT = ArtPatternPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ATTRIBUTE = ArtPatternPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BINDING = ArtPatternPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__IMPLEM = ArtPatternPackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__GROUPS = ArtPatternPackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = ArtPatternPackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link pattern.art.instance.impl.PrimitiveInstanceImpl <em>Primitive Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.PrimitiveInstanceImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getPrimitiveInstance()
	 * @generated
	 */
	int PRIMITIVE_INSTANCE = 1;

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
	 * The meta object id for the '{@link pattern.art.instance.impl.CompositeInstanceImpl <em>Composite Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.CompositeInstanceImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getCompositeInstance()
	 * @generated
	 */
	int COMPOSITE_INSTANCE = 2;

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
	 * The meta object id for the '{@link pattern.art.instance.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.BindingImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 3;

	/**
	 * The feature id for the '<em><b>Server Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SERVER_INSTANCE = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ID = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link pattern.art.instance.impl.TransmissionBindingImpl <em>Transmission Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.TransmissionBindingImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getTransmissionBinding()
	 * @generated
	 */
	int TRANSMISSION_BINDING = 4;

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
	 * The meta object id for the '{@link pattern.art.instance.impl.DelegationBindingImpl <em>Delegation Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.DelegationBindingImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getDelegationBinding()
	 * @generated
	 */
	int DELEGATION_BINDING = 5;

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
	 * The meta object id for the '{@link pattern.art.instance.impl.AttributeInstanceImpl <em>Attribute Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.AttributeInstanceImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getAttributeInstance()
	 * @generated
	 */
	int ATTRIBUTE_INSTANCE = 6;

	/**
	 * The number of structural features of the '<em>Attribute Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_INSTANCE_FEATURE_COUNT = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link pattern.art.instance.impl.ValuedAttributeImpl <em>Valued Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.ValuedAttributeImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getValuedAttribute()
	 * @generated
	 */
	int VALUED_ATTRIBUTE = 7;

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
	 * The meta object id for the '{@link pattern.art.instance.impl.DictionaryValuedAttributeImpl <em>Dictionary Valued Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.DictionaryValuedAttributeImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getDictionaryValuedAttribute()
	 * @generated
	 */
	int DICTIONARY_VALUED_ATTRIBUTE = 8;

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
	 * The meta object id for the '{@link pattern.art.instance.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.EntryImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__VALUE = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = PatternframeworkPackage.POBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link pattern.art.instance.impl.DefaultEntryImpl <em>Default Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.DefaultEntryImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getDefaultEntry()
	 * @generated
	 */
	int DEFAULT_ENTRY = 10;

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
	 * The meta object id for the '{@link pattern.art.instance.impl.OtherEntryImpl <em>Other Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.impl.OtherEntryImpl
	 * @see pattern.art.instance.impl.InstancePackageImpl#getOtherEntry()
	 * @generated
	 */
	int OTHER_ENTRY = 11;

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
	 * The meta object id for the '{@link pattern.art.instance.InstanceState <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pattern.art.instance.InstanceState
	 * @see pattern.art.instance.impl.InstancePackageImpl#getInstanceState()
	 * @generated
	 */
	int INSTANCE_STATE = 12;


	/**
	 * Returns the meta object for class '{@link pattern.art.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see pattern.art.instance.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see pattern.art.instance.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.instance.ComponentInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see pattern.art.instance.ComponentInstance#getState()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_State();

	/**
	 * Returns the meta object for the container reference '{@link pattern.art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Component</em>'.
	 * @see pattern.art.instance.ComponentInstance#getSuperComponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_SuperComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.instance.ComponentInstance#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see pattern.art.instance.ComponentInstance#getAttribute()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.instance.ComponentInstance#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see pattern.art.instance.ComponentInstance#getBinding()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link pattern.art.instance.ComponentInstance#getImplem <em>Implem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implem</em>'.
	 * @see pattern.art.instance.ComponentInstance#getImplem()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Implem();

	/**
	 * Returns the meta object for the reference list '{@link pattern.art.instance.ComponentInstance#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see pattern.art.instance.ComponentInstance#getGroups()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Groups();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.PrimitiveInstance <em>Primitive Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Instance</em>'.
	 * @see pattern.art.instance.PrimitiveInstance
	 * @generated
	 */
	EClass getPrimitiveInstance();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.CompositeInstance <em>Composite Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Instance</em>'.
	 * @see pattern.art.instance.CompositeInstance
	 * @generated
	 */
	EClass getCompositeInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.instance.CompositeInstance#getSubComponent <em>Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Component</em>'.
	 * @see pattern.art.instance.CompositeInstance#getSubComponent()
	 * @see #getCompositeInstance()
	 * @generated
	 */
	EReference getCompositeInstance_SubComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.instance.CompositeInstance#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation</em>'.
	 * @see pattern.art.instance.CompositeInstance#getDelegation()
	 * @see #getCompositeInstance()
	 * @generated
	 */
	EReference getCompositeInstance_Delegation();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see pattern.art.instance.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.Binding#getServerInstance <em>Server Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Instance</em>'.
	 * @see pattern.art.instance.Binding#getServerInstance()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ServerInstance();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.instance.Binding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pattern.art.instance.Binding#getId()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Id();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.TransmissionBinding <em>Transmission Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Binding</em>'.
	 * @see pattern.art.instance.TransmissionBinding
	 * @generated
	 */
	EClass getTransmissionBinding();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.TransmissionBinding#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see pattern.art.instance.TransmissionBinding#getClient()
	 * @see #getTransmissionBinding()
	 * @generated
	 */
	EReference getTransmissionBinding_Client();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.TransmissionBinding#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see pattern.art.instance.TransmissionBinding#getServer()
	 * @see #getTransmissionBinding()
	 * @generated
	 */
	EReference getTransmissionBinding_Server();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.DelegationBinding <em>Delegation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Binding</em>'.
	 * @see pattern.art.instance.DelegationBinding
	 * @generated
	 */
	EClass getDelegationBinding();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.DelegationBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see pattern.art.instance.DelegationBinding#getSource()
	 * @see #getDelegationBinding()
	 * @generated
	 */
	EReference getDelegationBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.DelegationBinding#getExported <em>Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exported</em>'.
	 * @see pattern.art.instance.DelegationBinding#getExported()
	 * @see #getDelegationBinding()
	 * @generated
	 */
	EReference getDelegationBinding_Exported();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.AttributeInstance <em>Attribute Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Instance</em>'.
	 * @see pattern.art.instance.AttributeInstance
	 * @generated
	 */
	EClass getAttributeInstance();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.ValuedAttribute <em>Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valued Attribute</em>'.
	 * @see pattern.art.instance.ValuedAttribute
	 * @generated
	 */
	EClass getValuedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.instance.ValuedAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pattern.art.instance.ValuedAttribute#getValue()
	 * @see #getValuedAttribute()
	 * @generated
	 */
	EAttribute getValuedAttribute_Value();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.ValuedAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see pattern.art.instance.ValuedAttribute#getAttribute()
	 * @see #getValuedAttribute()
	 * @generated
	 */
	EReference getValuedAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.DictionaryValuedAttribute <em>Dictionary Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary Valued Attribute</em>'.
	 * @see pattern.art.instance.DictionaryValuedAttribute
	 * @generated
	 */
	EClass getDictionaryValuedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link pattern.art.instance.DictionaryValuedAttribute#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see pattern.art.instance.DictionaryValuedAttribute#getEntries()
	 * @see #getDictionaryValuedAttribute()
	 * @generated
	 */
	EReference getDictionaryValuedAttribute_Entries();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.DictionaryValuedAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see pattern.art.instance.DictionaryValuedAttribute#getAttribute()
	 * @see #getDictionaryValuedAttribute()
	 * @generated
	 */
	EReference getDictionaryValuedAttribute_Attribute();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see pattern.art.instance.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.instance.Entry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pattern.art.instance.Entry#getValue()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Value();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.DefaultEntry <em>Default Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Entry</em>'.
	 * @see pattern.art.instance.DefaultEntry
	 * @generated
	 */
	EClass getDefaultEntry();

	/**
	 * Returns the meta object for the reference '{@link pattern.art.instance.DefaultEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see pattern.art.instance.DefaultEntry#getKey()
	 * @see #getDefaultEntry()
	 * @generated
	 */
	EReference getDefaultEntry_Key();

	/**
	 * Returns the meta object for class '{@link pattern.art.instance.OtherEntry <em>Other Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Entry</em>'.
	 * @see pattern.art.instance.OtherEntry
	 * @generated
	 */
	EClass getOtherEntry();

	/**
	 * Returns the meta object for the attribute '{@link pattern.art.instance.OtherEntry#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see pattern.art.instance.OtherEntry#getKey()
	 * @see #getOtherEntry()
	 * @generated
	 */
	EAttribute getOtherEntry_Key();

	/**
	 * Returns the meta object for enum '{@link pattern.art.instance.InstanceState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see pattern.art.instance.InstanceState
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
	InstanceFactory getInstanceFactory();

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
		 * The meta object literal for the '{@link pattern.art.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.ComponentInstanceImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getComponentInstance()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.PrimitiveInstanceImpl <em>Primitive Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.PrimitiveInstanceImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getPrimitiveInstance()
		 * @generated
		 */
		EClass PRIMITIVE_INSTANCE = eINSTANCE.getPrimitiveInstance();

		/**
		 * The meta object literal for the '{@link pattern.art.instance.impl.CompositeInstanceImpl <em>Composite Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.CompositeInstanceImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getCompositeInstance()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.BindingImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getBinding()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.TransmissionBindingImpl <em>Transmission Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.TransmissionBindingImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getTransmissionBinding()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.DelegationBindingImpl <em>Delegation Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.DelegationBindingImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getDelegationBinding()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.AttributeInstanceImpl <em>Attribute Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.AttributeInstanceImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getAttributeInstance()
		 * @generated
		 */
		EClass ATTRIBUTE_INSTANCE = eINSTANCE.getAttributeInstance();

		/**
		 * The meta object literal for the '{@link pattern.art.instance.impl.ValuedAttributeImpl <em>Valued Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.ValuedAttributeImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getValuedAttribute()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.DictionaryValuedAttributeImpl <em>Dictionary Valued Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.DictionaryValuedAttributeImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getDictionaryValuedAttribute()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.EntryImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getEntry()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.DefaultEntryImpl <em>Default Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.DefaultEntryImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getDefaultEntry()
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
		 * The meta object literal for the '{@link pattern.art.instance.impl.OtherEntryImpl <em>Other Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.impl.OtherEntryImpl
		 * @see pattern.art.instance.impl.InstancePackageImpl#getOtherEntry()
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
		 * The meta object literal for the '{@link pattern.art.instance.InstanceState <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pattern.art.instance.InstanceState
		 * @see pattern.art.instance.impl.InstancePackageImpl#getInstanceState()
		 * @generated
		 */
		EEnum INSTANCE_STATE = eINSTANCE.getInstanceState();

	}

} //InstancePackage
