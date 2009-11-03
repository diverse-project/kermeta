/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance.impl;

import art.ArtPackage;

import art.group.GroupPackage;

import art.group.impl.GroupPackageImpl;

import art.impl.ArtPackageImpl;

import art.implem.ImplemPackage;

import art.implem.impl.ImplemPackageImpl;

import art.instance.AttributeInstance;
import art.instance.Binding;
import art.instance.ComponentInstance;
import art.instance.CompositeInstance;
import art.instance.DefaultEntry;
import art.instance.DelegationBinding;
import art.instance.DictionaryValuedAttribute;
import art.instance.Entry;
import art.instance.InstanceFactory;
import art.instance.InstancePackage;
import art.instance.InstanceState;
import art.instance.OtherEntry;
import art.instance.PrimitiveInstance;
import art.instance.TransmissionBinding;
import art.instance.ValuedAttribute;

import art.type.TypePackage;

import art.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancePackageImpl extends EPackageImpl implements InstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictionaryValuedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see art.instance.InstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstancePackageImpl() {
		super(eNS_URI, InstanceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstancePackage init() {
		if (isInited) return (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Obtain or create and register package
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InstancePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArtPackageImpl theArtPackage = (ArtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) instanceof ArtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) : ArtPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI) : ImplemPackage.eINSTANCE);
		GroupPackageImpl theGroupPackage = (GroupPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI) instanceof GroupPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI) : GroupPackage.eINSTANCE);

		// Create package meta-data objects
		theInstancePackage.createPackageContents();
		theArtPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();
		theGroupPackage.createPackageContents();

		// Initialize created meta-data
		theInstancePackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();
		theGroupPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstancePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstancePackage.eNS_URI, theInstancePackage);
		return theInstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Type() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_State() {
		return (EAttribute)componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_SuperComponent() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Attribute() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Binding() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Implem() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Groups() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveInstance() {
		return primitiveInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeInstance() {
		return compositeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeInstance_SubComponent() {
		return (EReference)compositeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeInstance_Delegation() {
		return (EReference)compositeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_ServerInstance() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Id() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmissionBinding() {
		return transmissionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionBinding_Client() {
		return (EReference)transmissionBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionBinding_Server() {
		return (EReference)transmissionBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationBinding() {
		return delegationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationBinding_Source() {
		return (EReference)delegationBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationBinding_Exported() {
		return (EReference)delegationBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeInstance() {
		return attributeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuedAttribute() {
		return valuedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuedAttribute_Value() {
		return (EAttribute)valuedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuedAttribute_Attribute() {
		return (EReference)valuedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDictionaryValuedAttribute() {
		return dictionaryValuedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionaryValuedAttribute_Entries() {
		return (EReference)dictionaryValuedAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDictionaryValuedAttribute_Attribute() {
		return (EReference)dictionaryValuedAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntry_Value() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultEntry() {
		return defaultEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultEntry_Key() {
		return (EReference)defaultEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherEntry() {
		return otherEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOtherEntry_Key() {
		return (EAttribute)otherEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceState() {
		return instanceStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceFactory getInstanceFactory() {
		return (InstanceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__TYPE);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__STATE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__SUPER_COMPONENT);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__ATTRIBUTE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__BINDING);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__IMPLEM);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__GROUPS);

		primitiveInstanceEClass = createEClass(PRIMITIVE_INSTANCE);

		compositeInstanceEClass = createEClass(COMPOSITE_INSTANCE);
		createEReference(compositeInstanceEClass, COMPOSITE_INSTANCE__SUB_COMPONENT);
		createEReference(compositeInstanceEClass, COMPOSITE_INSTANCE__DELEGATION);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__SERVER_INSTANCE);
		createEAttribute(bindingEClass, BINDING__ID);

		transmissionBindingEClass = createEClass(TRANSMISSION_BINDING);
		createEReference(transmissionBindingEClass, TRANSMISSION_BINDING__CLIENT);
		createEReference(transmissionBindingEClass, TRANSMISSION_BINDING__SERVER);

		delegationBindingEClass = createEClass(DELEGATION_BINDING);
		createEReference(delegationBindingEClass, DELEGATION_BINDING__SOURCE);
		createEReference(delegationBindingEClass, DELEGATION_BINDING__EXPORTED);

		attributeInstanceEClass = createEClass(ATTRIBUTE_INSTANCE);

		valuedAttributeEClass = createEClass(VALUED_ATTRIBUTE);
		createEAttribute(valuedAttributeEClass, VALUED_ATTRIBUTE__VALUE);
		createEReference(valuedAttributeEClass, VALUED_ATTRIBUTE__ATTRIBUTE);

		dictionaryValuedAttributeEClass = createEClass(DICTIONARY_VALUED_ATTRIBUTE);
		createEReference(dictionaryValuedAttributeEClass, DICTIONARY_VALUED_ATTRIBUTE__ENTRIES);
		createEReference(dictionaryValuedAttributeEClass, DICTIONARY_VALUED_ATTRIBUTE__ATTRIBUTE);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__VALUE);

		defaultEntryEClass = createEClass(DEFAULT_ENTRY);
		createEReference(defaultEntryEClass, DEFAULT_ENTRY__KEY);

		otherEntryEClass = createEClass(OTHER_ENTRY);
		createEAttribute(otherEntryEClass, OTHER_ENTRY__KEY);

		// Create enums
		instanceStateEEnum = createEEnum(INSTANCE_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArtPackage theArtPackage = (ArtPackage)EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		ImplemPackage theImplemPackage = (ImplemPackage)EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI);
		GroupPackage theGroupPackage = (GroupPackage)EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentInstanceEClass.getESuperTypes().add(theArtPackage.getModelElement());
		primitiveInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		compositeInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		transmissionBindingEClass.getESuperTypes().add(this.getBinding());
		delegationBindingEClass.getESuperTypes().add(this.getBinding());
		valuedAttributeEClass.getESuperTypes().add(this.getAttributeInstance());
		dictionaryValuedAttributeEClass.getESuperTypes().add(this.getAttributeInstance());
		defaultEntryEClass.getESuperTypes().add(this.getEntry());
		otherEntryEClass.getESuperTypes().add(this.getEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_Type(), theTypePackage.getComponentType(), null, "type", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_State(), theArtPackage.getString(), "state", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_SuperComponent(), this.getCompositeInstance(), this.getCompositeInstance_SubComponent(), "superComponent", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Attribute(), this.getAttributeInstance(), null, "attribute", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Binding(), this.getTransmissionBinding(), null, "binding", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Implem(), theImplemPackage.getComponentImplementation(), null, "implem", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Groups(), theGroupPackage.getInstanceGroup(), theGroupPackage.getInstanceGroup_Instances(), "groups", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveInstanceEClass, PrimitiveInstance.class, "PrimitiveInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeInstanceEClass, CompositeInstance.class, "CompositeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeInstance_SubComponent(), this.getComponentInstance(), this.getComponentInstance_SuperComponent(), "subComponent", null, 0, -1, CompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeInstance_Delegation(), this.getDelegationBinding(), null, "delegation", null, 0, -1, CompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_ServerInstance(), this.getComponentInstance(), null, "serverInstance", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Id(), theArtPackage.getString(), "id", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transmissionBindingEClass, TransmissionBinding.class, "TransmissionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransmissionBinding_Client(), theTypePackage.getPort(), null, "client", null, 0, 1, TransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransmissionBinding_Server(), theTypePackage.getPort(), null, "server", null, 0, 1, TransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationBindingEClass, DelegationBinding.class, "DelegationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationBinding_Source(), theTypePackage.getPort(), null, "source", null, 1, 1, DelegationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationBinding_Exported(), theTypePackage.getPort(), null, "exported", null, 1, 1, DelegationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeInstanceEClass, AttributeInstance.class, "AttributeInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuedAttributeEClass, ValuedAttribute.class, "ValuedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuedAttribute_Value(), theArtPackage.getString(), "value", null, 0, 1, ValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuedAttribute_Attribute(), theTypePackage.getBasicAttribute(), null, "attribute", null, 0, 1, ValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dictionaryValuedAttributeEClass, DictionaryValuedAttribute.class, "DictionaryValuedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDictionaryValuedAttribute_Entries(), this.getEntry(), null, "entries", null, 0, -1, DictionaryValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDictionaryValuedAttribute_Attribute(), theTypePackage.getDictionary(), null, "attribute", null, 0, 1, DictionaryValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Value(), theArtPackage.getString(), "value", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultEntryEClass, DefaultEntry.class, "DefaultEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultEntry_Key(), theTypePackage.getDictionaryDefaultValue(), null, "key", null, 1, 1, DefaultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherEntryEClass, OtherEntry.class, "OtherEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOtherEntry_Key(), theArtPackage.getString(), "key", null, 1, 1, OtherEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(instanceStateEEnum, InstanceState.class, "InstanceState");
		addEEnumLiteral(instanceStateEEnum, InstanceState.OFF);
		addEEnumLiteral(instanceStateEEnum, InstanceState.ON);
	}

} //InstancePackageImpl
