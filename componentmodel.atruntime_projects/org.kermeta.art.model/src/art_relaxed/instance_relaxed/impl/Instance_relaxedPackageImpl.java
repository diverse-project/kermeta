/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed.impl;

import art_relaxed.Art_relaxedPackage;

import art_relaxed.distrib_relaxed.Distrib_relaxedPackage;

import art_relaxed.distrib_relaxed.impl.Distrib_relaxedPackageImpl;

import art_relaxed.group_relaxed.Group_relaxedPackage;

import art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl;

import art_relaxed.impl.Art_relaxedPackageImpl;

import art_relaxed.implem_relaxed.Implem_relaxedPackage;

import art_relaxed.implem_relaxed.impl.Implem_relaxedPackageImpl;

import art_relaxed.instance_relaxed.AttributeInstance;
import art_relaxed.instance_relaxed.Binding;
import art_relaxed.instance_relaxed.ComponentInstance;
import art_relaxed.instance_relaxed.CompositeInstance;
import art_relaxed.instance_relaxed.DefaultEntry;
import art_relaxed.instance_relaxed.DelegationBinding;
import art_relaxed.instance_relaxed.DictionaryValuedAttribute;
import art_relaxed.instance_relaxed.Entry;
import art_relaxed.instance_relaxed.InstanceState;
import art_relaxed.instance_relaxed.Instance_relaxedFactory;
import art_relaxed.instance_relaxed.Instance_relaxedPackage;
import art_relaxed.instance_relaxed.OtherEntry;
import art_relaxed.instance_relaxed.PrimitiveInstance;
import art_relaxed.instance_relaxed.TransmissionBinding;
import art_relaxed.instance_relaxed.ValuedAttribute;

import art_relaxed.type_relaxed.Type_relaxedPackage;

import art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smartadapters4ART.Smartadapters4ARTPackage;

import smartadapters4ART.adaptations.AdaptationsPackage;

import smartadapters4ART.adaptations.impl.AdaptationsPackageImpl;

import smartadapters4ART.impl.Smartadapters4ARTPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Instance_relaxedPackageImpl extends EPackageImpl implements Instance_relaxedPackage {
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
	 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Instance_relaxedPackageImpl() {
		super(eNS_URI, Instance_relaxedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Instance_relaxedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Instance_relaxedPackage init() {
		if (isInited) return (Instance_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI);

		// Obtain or create and register package
		Instance_relaxedPackageImpl theInstance_relaxedPackage = (Instance_relaxedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Instance_relaxedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Instance_relaxedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Smartadapters4ARTPackageImpl theSmartadapters4ARTPackage = (Smartadapters4ARTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI) instanceof Smartadapters4ARTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI) : Smartadapters4ARTPackage.eINSTANCE);
		AdaptationsPackageImpl theAdaptationsPackage = (AdaptationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) instanceof AdaptationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) : AdaptationsPackage.eINSTANCE);
		Art_relaxedPackageImpl theArt_relaxedPackage = (Art_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) instanceof Art_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) : Art_relaxedPackage.eINSTANCE);
		Type_relaxedPackageImpl theType_relaxedPackage = (Type_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) instanceof Type_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) : Type_relaxedPackage.eINSTANCE);
		Implem_relaxedPackageImpl theImplem_relaxedPackage = (Implem_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI) instanceof Implem_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI) : Implem_relaxedPackage.eINSTANCE);
		Group_relaxedPackageImpl theGroup_relaxedPackage = (Group_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI) instanceof Group_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI) : Group_relaxedPackage.eINSTANCE);
		Distrib_relaxedPackageImpl theDistrib_relaxedPackage = (Distrib_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) instanceof Distrib_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) : Distrib_relaxedPackage.eINSTANCE);

		// Create package meta-data objects
		theInstance_relaxedPackage.createPackageContents();
		theSmartadapters4ARTPackage.createPackageContents();
		theAdaptationsPackage.createPackageContents();
		theArt_relaxedPackage.createPackageContents();
		theType_relaxedPackage.createPackageContents();
		theImplem_relaxedPackage.createPackageContents();
		theGroup_relaxedPackage.createPackageContents();
		theDistrib_relaxedPackage.createPackageContents();

		// Initialize created meta-data
		theInstance_relaxedPackage.initializePackageContents();
		theSmartadapters4ARTPackage.initializePackageContents();
		theAdaptationsPackage.initializePackageContents();
		theArt_relaxedPackage.initializePackageContents();
		theType_relaxedPackage.initializePackageContents();
		theImplem_relaxedPackage.initializePackageContents();
		theGroup_relaxedPackage.initializePackageContents();
		theDistrib_relaxedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstance_relaxedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Instance_relaxedPackage.eNS_URI, theInstance_relaxedPackage);
		return theInstance_relaxedPackage;
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
	public Instance_relaxedFactory getInstance_relaxedFactory() {
		return (Instance_relaxedFactory)getEFactoryInstance();
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
		Art_relaxedPackage theArt_relaxedPackage = (Art_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI);
		Type_relaxedPackage theType_relaxedPackage = (Type_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI);
		Implem_relaxedPackage theImplem_relaxedPackage = (Implem_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI);
		Group_relaxedPackage theGroup_relaxedPackage = (Group_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentInstanceEClass.getESuperTypes().add(theArt_relaxedPackage.getModelElement());
		primitiveInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		compositeInstanceEClass.getESuperTypes().add(this.getComponentInstance());
		bindingEClass.getESuperTypes().add(theArt_relaxedPackage.getAspectModelElement());
		transmissionBindingEClass.getESuperTypes().add(this.getBinding());
		delegationBindingEClass.getESuperTypes().add(this.getBinding());
		attributeInstanceEClass.getESuperTypes().add(theArt_relaxedPackage.getAspectModelElement());
		valuedAttributeEClass.getESuperTypes().add(this.getAttributeInstance());
		dictionaryValuedAttributeEClass.getESuperTypes().add(this.getAttributeInstance());
		entryEClass.getESuperTypes().add(theArt_relaxedPackage.getAspectModelElement());
		defaultEntryEClass.getESuperTypes().add(this.getEntry());
		otherEntryEClass.getESuperTypes().add(this.getEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_Type(), theType_relaxedPackage.getComponentType(), null, "type", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_State(), theArt_relaxedPackage.getString(), "state", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_SuperComponent(), this.getCompositeInstance(), this.getCompositeInstance_SubComponent(), "superComponent", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Attribute(), this.getAttributeInstance(), null, "attribute", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Binding(), this.getTransmissionBinding(), null, "binding", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Implem(), theImplem_relaxedPackage.getComponentImplementation(), null, "implem", null, 0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Groups(), theGroup_relaxedPackage.getInstanceGroup(), theGroup_relaxedPackage.getInstanceGroup_Instances(), "groups", null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveInstanceEClass, PrimitiveInstance.class, "PrimitiveInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeInstanceEClass, CompositeInstance.class, "CompositeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeInstance_SubComponent(), this.getComponentInstance(), this.getComponentInstance_SuperComponent(), "subComponent", null, 0, -1, CompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeInstance_Delegation(), this.getDelegationBinding(), null, "delegation", null, 0, -1, CompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_ServerInstance(), this.getComponentInstance(), null, "serverInstance", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Id(), theArt_relaxedPackage.getString(), "id", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transmissionBindingEClass, TransmissionBinding.class, "TransmissionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransmissionBinding_Client(), theType_relaxedPackage.getAbstractPort(), null, "client", null, 1, 1, TransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransmissionBinding_Server(), theType_relaxedPackage.getAbstractPort(), null, "server", null, 1, 1, TransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationBindingEClass, DelegationBinding.class, "DelegationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationBinding_Source(), theType_relaxedPackage.getAbstractPort(), null, "source", null, 1, 1, DelegationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegationBinding_Exported(), theType_relaxedPackage.getAbstractPort(), null, "exported", null, 1, 1, DelegationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeInstanceEClass, AttributeInstance.class, "AttributeInstance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuedAttributeEClass, ValuedAttribute.class, "ValuedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuedAttribute_Value(), theArt_relaxedPackage.getString(), "value", null, 1, 1, ValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValuedAttribute_Attribute(), theType_relaxedPackage.getBasicAttribute(), null, "attribute", null, 1, 1, ValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dictionaryValuedAttributeEClass, DictionaryValuedAttribute.class, "DictionaryValuedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDictionaryValuedAttribute_Entries(), this.getEntry(), null, "entries", null, 0, -1, DictionaryValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDictionaryValuedAttribute_Attribute(), theType_relaxedPackage.getDictionary(), null, "attribute", null, 1, 1, DictionaryValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Value(), theArt_relaxedPackage.getString(), "value", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultEntryEClass, DefaultEntry.class, "DefaultEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultEntry_Key(), theType_relaxedPackage.getDictionaryDefaultValue(), null, "key", null, 1, 1, DefaultEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherEntryEClass, OtherEntry.class, "OtherEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOtherEntry_Key(), theArt_relaxedPackage.getString(), "key", null, 1, 1, OtherEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(instanceStateEEnum, InstanceState.class, "InstanceState");
		addEEnumLiteral(instanceStateEEnum, InstanceState.OFF);
		addEEnumLiteral(instanceStateEEnum, InstanceState.ON);
	}

} //Instance_relaxedPackageImpl
