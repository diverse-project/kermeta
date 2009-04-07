/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import art.ArtPackage;

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
 * @see art.instance.InstanceFactory
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
	String eNS_URI = "http://art/instance";

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
	InstancePackage eINSTANCE = art.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link art.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.instance.impl.ComponentInstanceImpl
	 * @see art.instance.impl.InstancePackageImpl#getComponentInstance()
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
	int COMPONENT_INSTANCE__NAME = ArtPackage.MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__TYPE = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__STATE = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__SUPER_COMPONENT = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ATTRIBUTE = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BINDING = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Implem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__IMPLEM = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = ArtPackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link art.instance.impl.PrimitiveInstanceImpl <em>Primitive Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.instance.impl.PrimitiveInstanceImpl
	 * @see art.instance.impl.InstancePackageImpl#getPrimitiveInstance()
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
	 * The number of structural features of the '<em>Primitive Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_INSTANCE_FEATURE_COUNT = COMPONENT_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art.instance.impl.CompositeInstanceImpl <em>Composite Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.instance.impl.CompositeInstanceImpl
	 * @see art.instance.impl.InstancePackageImpl#getCompositeInstance()
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
	 * The meta object id for the '{@link art.instance.impl.ValuedAttributeImpl <em>Valued Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.instance.impl.ValuedAttributeImpl
	 * @see art.instance.impl.InstancePackageImpl#getValuedAttribute()
	 * @generated
	 */
	int VALUED_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE__ATTRIBUTE = ArtPackage.UPDATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE__VALUE = ArtPackage.UPDATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Valued Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUED_ATTRIBUTE_FEATURE_COUNT = ArtPackage.UPDATE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art.instance.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.instance.impl.BindingImpl
	 * @see art.instance.impl.InstancePackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 4;

	/**
	 * The feature id for the '<em><b>Server Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SERVER_INSTANCE = ArtPackage.ADD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ID = ArtPackage.ADD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = ArtPackage.ADD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art.instance.impl.TransmissionBindingImpl <em>Transmission Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.instance.impl.TransmissionBindingImpl
	 * @see art.instance.impl.InstancePackageImpl#getTransmissionBinding()
	 * @generated
	 */
	int TRANSMISSION_BINDING = 5;

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
	 * The meta object id for the '{@link art.instance.impl.DelegationBindingImpl <em>Delegation Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.instance.impl.DelegationBindingImpl
	 * @see art.instance.impl.InstancePackageImpl#getDelegationBinding()
	 * @generated
	 */
	int DELEGATION_BINDING = 6;

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
	 * The meta object id for the '{@link art.instance.InstanceState <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art.instance.InstanceState
	 * @see art.instance.impl.InstancePackageImpl#getInstanceState()
	 * @generated
	 */
	int INSTANCE_STATE = 7;


	/**
	 * Returns the meta object for class '{@link art.instance.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see art.instance.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link art.instance.ComponentInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see art.instance.ComponentInstance#getType()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Type();

	/**
	 * Returns the meta object for the attribute '{@link art.instance.ComponentInstance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see art.instance.ComponentInstance#getState()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_State();

	/**
	 * Returns the meta object for the container reference '{@link art.instance.ComponentInstance#getSuperComponent <em>Super Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Component</em>'.
	 * @see art.instance.ComponentInstance#getSuperComponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_SuperComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link art.instance.ComponentInstance#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see art.instance.ComponentInstance#getAttribute()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link art.instance.ComponentInstance#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see art.instance.ComponentInstance#getBinding()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link art.instance.ComponentInstance#getImplem <em>Implem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implem</em>'.
	 * @see art.instance.ComponentInstance#getImplem()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Implem();

	/**
	 * Returns the meta object for class '{@link art.instance.PrimitiveInstance <em>Primitive Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Instance</em>'.
	 * @see art.instance.PrimitiveInstance
	 * @generated
	 */
	EClass getPrimitiveInstance();

	/**
	 * Returns the meta object for class '{@link art.instance.CompositeInstance <em>Composite Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Instance</em>'.
	 * @see art.instance.CompositeInstance
	 * @generated
	 */
	EClass getCompositeInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link art.instance.CompositeInstance#getSubComponent <em>Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Component</em>'.
	 * @see art.instance.CompositeInstance#getSubComponent()
	 * @see #getCompositeInstance()
	 * @generated
	 */
	EReference getCompositeInstance_SubComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link art.instance.CompositeInstance#getDelegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegation</em>'.
	 * @see art.instance.CompositeInstance#getDelegation()
	 * @see #getCompositeInstance()
	 * @generated
	 */
	EReference getCompositeInstance_Delegation();

	/**
	 * Returns the meta object for class '{@link art.instance.ValuedAttribute <em>Valued Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valued Attribute</em>'.
	 * @see art.instance.ValuedAttribute
	 * @generated
	 */
	EClass getValuedAttribute();

	/**
	 * Returns the meta object for the reference '{@link art.instance.ValuedAttribute#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see art.instance.ValuedAttribute#getAttribute()
	 * @see #getValuedAttribute()
	 * @generated
	 */
	EReference getValuedAttribute_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link art.instance.ValuedAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see art.instance.ValuedAttribute#getValue()
	 * @see #getValuedAttribute()
	 * @generated
	 */
	EAttribute getValuedAttribute_Value();

	/**
	 * Returns the meta object for class '{@link art.instance.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see art.instance.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link art.instance.Binding#getServerInstance <em>Server Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server Instance</em>'.
	 * @see art.instance.Binding#getServerInstance()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ServerInstance();

	/**
	 * Returns the meta object for the attribute '{@link art.instance.Binding#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see art.instance.Binding#getId()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Id();

	/**
	 * Returns the meta object for class '{@link art.instance.TransmissionBinding <em>Transmission Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission Binding</em>'.
	 * @see art.instance.TransmissionBinding
	 * @generated
	 */
	EClass getTransmissionBinding();

	/**
	 * Returns the meta object for the reference '{@link art.instance.TransmissionBinding#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see art.instance.TransmissionBinding#getClient()
	 * @see #getTransmissionBinding()
	 * @generated
	 */
	EReference getTransmissionBinding_Client();

	/**
	 * Returns the meta object for the reference '{@link art.instance.TransmissionBinding#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see art.instance.TransmissionBinding#getServer()
	 * @see #getTransmissionBinding()
	 * @generated
	 */
	EReference getTransmissionBinding_Server();

	/**
	 * Returns the meta object for class '{@link art.instance.DelegationBinding <em>Delegation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation Binding</em>'.
	 * @see art.instance.DelegationBinding
	 * @generated
	 */
	EClass getDelegationBinding();

	/**
	 * Returns the meta object for the reference '{@link art.instance.DelegationBinding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see art.instance.DelegationBinding#getSource()
	 * @see #getDelegationBinding()
	 * @generated
	 */
	EReference getDelegationBinding_Source();

	/**
	 * Returns the meta object for the reference '{@link art.instance.DelegationBinding#getExported <em>Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exported</em>'.
	 * @see art.instance.DelegationBinding#getExported()
	 * @see #getDelegationBinding()
	 * @generated
	 */
	EReference getDelegationBinding_Exported();

	/**
	 * Returns the meta object for enum '{@link art.instance.InstanceState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see art.instance.InstanceState
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
		 * The meta object literal for the '{@link art.instance.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.instance.impl.ComponentInstanceImpl
		 * @see art.instance.impl.InstancePackageImpl#getComponentInstance()
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
		 * The meta object literal for the '{@link art.instance.impl.PrimitiveInstanceImpl <em>Primitive Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.instance.impl.PrimitiveInstanceImpl
		 * @see art.instance.impl.InstancePackageImpl#getPrimitiveInstance()
		 * @generated
		 */
		EClass PRIMITIVE_INSTANCE = eINSTANCE.getPrimitiveInstance();

		/**
		 * The meta object literal for the '{@link art.instance.impl.CompositeInstanceImpl <em>Composite Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.instance.impl.CompositeInstanceImpl
		 * @see art.instance.impl.InstancePackageImpl#getCompositeInstance()
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
		 * The meta object literal for the '{@link art.instance.impl.ValuedAttributeImpl <em>Valued Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.instance.impl.ValuedAttributeImpl
		 * @see art.instance.impl.InstancePackageImpl#getValuedAttribute()
		 * @generated
		 */
		EClass VALUED_ATTRIBUTE = eINSTANCE.getValuedAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUED_ATTRIBUTE__ATTRIBUTE = eINSTANCE.getValuedAttribute_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUED_ATTRIBUTE__VALUE = eINSTANCE.getValuedAttribute_Value();

		/**
		 * The meta object literal for the '{@link art.instance.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.instance.impl.BindingImpl
		 * @see art.instance.impl.InstancePackageImpl#getBinding()
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
		 * The meta object literal for the '{@link art.instance.impl.TransmissionBindingImpl <em>Transmission Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.instance.impl.TransmissionBindingImpl
		 * @see art.instance.impl.InstancePackageImpl#getTransmissionBinding()
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
		 * The meta object literal for the '{@link art.instance.impl.DelegationBindingImpl <em>Delegation Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.instance.impl.DelegationBindingImpl
		 * @see art.instance.impl.InstancePackageImpl#getDelegationBinding()
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
		 * The meta object literal for the '{@link art.instance.InstanceState <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art.instance.InstanceState
		 * @see art.instance.impl.InstancePackageImpl#getInstanceState()
		 * @generated
		 */
		EEnum INSTANCE_STATE = eINSTANCE.getInstanceState();

	}

} //InstancePackage
