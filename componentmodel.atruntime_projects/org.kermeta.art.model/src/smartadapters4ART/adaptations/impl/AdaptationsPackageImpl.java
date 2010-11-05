/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations.impl;

import art_relaxed.Art_relaxedPackage;

import art_relaxed.distrib_relaxed.Distrib_relaxedPackage;

import art_relaxed.distrib_relaxed.impl.Distrib_relaxedPackageImpl;

import art_relaxed.group_relaxed.Group_relaxedPackage;

import art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl;

import art_relaxed.impl.Art_relaxedPackageImpl;

import art_relaxed.implem_relaxed.Implem_relaxedPackage;

import art_relaxed.implem_relaxed.impl.Implem_relaxedPackageImpl;

import art_relaxed.instance_relaxed.Instance_relaxedPackage;

import art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl;

import art_relaxed.type_relaxed.Type_relaxedPackage;

import art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smartadapters4ART.Smartadapters4ARTPackage;

import smartadapters4ART.adaptations.AdaptationsFactory;
import smartadapters4ART.adaptations.AdaptationsPackage;
import smartadapters4ART.adaptations.SetruntimeNode;
import smartadapters4ART.adaptations.SetruntimeSystem;
import smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance;
import smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance;
import smartadapters4ART.adaptations.SetruntimeinstancePrimitiveInstance;
import smartadapters4ART.adaptations.SetruntimeinstanceTransmissionBinding;

import smartadapters4ART.impl.Smartadapters4ARTPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptationsPackageImpl extends EPackageImpl implements AdaptationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setruntimeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setruntimeSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setruntimeinstanceComponentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setruntimeinstancePrimitiveInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setruntimeinstanceCompositeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setruntimeinstanceTransmissionBindingEClass = null;

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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptationsPackageImpl() {
		super(eNS_URI, AdaptationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdaptationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptationsPackage init() {
		if (isInited) return (AdaptationsPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI);

		// Obtain or create and register package
		AdaptationsPackageImpl theAdaptationsPackage = (AdaptationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdaptationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdaptationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Smartadapters4ARTPackageImpl theSmartadapters4ARTPackage = (Smartadapters4ARTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI) instanceof Smartadapters4ARTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI) : Smartadapters4ARTPackage.eINSTANCE);
		Art_relaxedPackageImpl theArt_relaxedPackage = (Art_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) instanceof Art_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) : Art_relaxedPackage.eINSTANCE);
		Instance_relaxedPackageImpl theInstance_relaxedPackage = (Instance_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI) instanceof Instance_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI) : Instance_relaxedPackage.eINSTANCE);
		Type_relaxedPackageImpl theType_relaxedPackage = (Type_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) instanceof Type_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) : Type_relaxedPackage.eINSTANCE);
		Implem_relaxedPackageImpl theImplem_relaxedPackage = (Implem_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI) instanceof Implem_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI) : Implem_relaxedPackage.eINSTANCE);
		Group_relaxedPackageImpl theGroup_relaxedPackage = (Group_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI) instanceof Group_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI) : Group_relaxedPackage.eINSTANCE);
		Distrib_relaxedPackageImpl theDistrib_relaxedPackage = (Distrib_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) instanceof Distrib_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) : Distrib_relaxedPackage.eINSTANCE);

		// Create package meta-data objects
		theAdaptationsPackage.createPackageContents();
		theSmartadapters4ARTPackage.createPackageContents();
		theArt_relaxedPackage.createPackageContents();
		theInstance_relaxedPackage.createPackageContents();
		theType_relaxedPackage.createPackageContents();
		theImplem_relaxedPackage.createPackageContents();
		theGroup_relaxedPackage.createPackageContents();
		theDistrib_relaxedPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptationsPackage.initializePackageContents();
		theSmartadapters4ARTPackage.initializePackageContents();
		theArt_relaxedPackage.initializePackageContents();
		theInstance_relaxedPackage.initializePackageContents();
		theType_relaxedPackage.initializePackageContents();
		theImplem_relaxedPackage.initializePackageContents();
		theGroup_relaxedPackage.initializePackageContents();
		theDistrib_relaxedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptationsPackage.eNS_URI, theAdaptationsPackage);
		return theAdaptationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetruntimeNode() {
		return setruntimeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeNode_NodeToSet() {
		return (EReference)setruntimeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeNode_Components() {
		return (EReference)setruntimeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetruntimeSystem() {
		return setruntimeSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeSystem_SystemToSet() {
		return (EReference)setruntimeSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeSystem_Refroot() {
		return (EReference)setruntimeSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeSystem_Refservices() {
		return (EReference)setruntimeSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeSystem_Reftypes() {
		return (EReference)setruntimeSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeSystem_RefdataTypes() {
		return (EReference)setruntimeSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetruntimeSystem_Refname() {
		return (EAttribute)setruntimeSystemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetruntimeinstanceComponentInstance() {
		return setruntimeinstanceComponentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceComponentInstance_ComponentInstanceToSet() {
		return (EReference)setruntimeinstanceComponentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceComponentInstance_Reftype() {
		return (EReference)setruntimeinstanceComponentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetruntimeinstanceComponentInstance_Refstate() {
		return (EAttribute)setruntimeinstanceComponentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceComponentInstance_RefsuperComponent() {
		return (EReference)setruntimeinstanceComponentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceComponentInstance_Refattribute() {
		return (EReference)setruntimeinstanceComponentInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceComponentInstance_Refbinding() {
		return (EReference)setruntimeinstanceComponentInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetruntimeinstanceComponentInstance_Refname() {
		return (EAttribute)setruntimeinstanceComponentInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetruntimeinstancePrimitiveInstance() {
		return setruntimeinstancePrimitiveInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstancePrimitiveInstance_PrimitiveInstanceToSet() {
		return (EReference)setruntimeinstancePrimitiveInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstancePrimitiveInstance_Reftype() {
		return (EReference)setruntimeinstancePrimitiveInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetruntimeinstancePrimitiveInstance_Refstate() {
		return (EAttribute)setruntimeinstancePrimitiveInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstancePrimitiveInstance_RefsuperComponent() {
		return (EReference)setruntimeinstancePrimitiveInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstancePrimitiveInstance_Refattribute() {
		return (EReference)setruntimeinstancePrimitiveInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstancePrimitiveInstance_Refbinding() {
		return (EReference)setruntimeinstancePrimitiveInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetruntimeinstancePrimitiveInstance_Refname() {
		return (EAttribute)setruntimeinstancePrimitiveInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetruntimeinstanceCompositeInstance() {
		return setruntimeinstanceCompositeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceCompositeInstance_CompositeInstanceToSet() {
		return (EReference)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceCompositeInstance_RefsubComponent() {
		return (EReference)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceCompositeInstance_Refdelegation() {
		return (EReference)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceCompositeInstance_Reftype() {
		return (EReference)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetruntimeinstanceCompositeInstance_Refstate() {
		return (EAttribute)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceCompositeInstance_RefsuperComponent() {
		return (EReference)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceCompositeInstance_Refattribute() {
		return (EReference)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceCompositeInstance_Refbinding() {
		return (EReference)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetruntimeinstanceCompositeInstance_Refname() {
		return (EAttribute)setruntimeinstanceCompositeInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetruntimeinstanceTransmissionBinding() {
		return setruntimeinstanceTransmissionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceTransmissionBinding_TransmissionBindingToSet() {
		return (EReference)setruntimeinstanceTransmissionBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceTransmissionBinding_Refclient() {
		return (EReference)setruntimeinstanceTransmissionBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceTransmissionBinding_Refserver() {
		return (EReference)setruntimeinstanceTransmissionBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetruntimeinstanceTransmissionBinding_RefserverInstance() {
		return (EReference)setruntimeinstanceTransmissionBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetruntimeinstanceTransmissionBinding_RefId() {
		return (EAttribute)setruntimeinstanceTransmissionBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationsFactory getAdaptationsFactory() {
		return (AdaptationsFactory)getEFactoryInstance();
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
		setruntimeNodeEClass = createEClass(SETRUNTIME_NODE);
		createEReference(setruntimeNodeEClass, SETRUNTIME_NODE__NODE_TO_SET);
		createEReference(setruntimeNodeEClass, SETRUNTIME_NODE__COMPONENTS);

		setruntimeSystemEClass = createEClass(SETRUNTIME_SYSTEM);
		createEReference(setruntimeSystemEClass, SETRUNTIME_SYSTEM__SYSTEM_TO_SET);
		createEReference(setruntimeSystemEClass, SETRUNTIME_SYSTEM__REFROOT);
		createEReference(setruntimeSystemEClass, SETRUNTIME_SYSTEM__REFSERVICES);
		createEReference(setruntimeSystemEClass, SETRUNTIME_SYSTEM__REFTYPES);
		createEReference(setruntimeSystemEClass, SETRUNTIME_SYSTEM__REFDATA_TYPES);
		createEAttribute(setruntimeSystemEClass, SETRUNTIME_SYSTEM__REFNAME);

		setruntimeinstanceComponentInstanceEClass = createEClass(SETRUNTIMEINSTANCE_COMPONENT_INSTANCE);
		createEReference(setruntimeinstanceComponentInstanceEClass, SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__COMPONENT_INSTANCE_TO_SET);
		createEReference(setruntimeinstanceComponentInstanceEClass, SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFTYPE);
		createEAttribute(setruntimeinstanceComponentInstanceEClass, SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSTATE);
		createEReference(setruntimeinstanceComponentInstanceEClass, SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFSUPER_COMPONENT);
		createEReference(setruntimeinstanceComponentInstanceEClass, SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFATTRIBUTE);
		createEReference(setruntimeinstanceComponentInstanceEClass, SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFBINDING);
		createEAttribute(setruntimeinstanceComponentInstanceEClass, SETRUNTIMEINSTANCE_COMPONENT_INSTANCE__REFNAME);

		setruntimeinstancePrimitiveInstanceEClass = createEClass(SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE);
		createEReference(setruntimeinstancePrimitiveInstanceEClass, SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__PRIMITIVE_INSTANCE_TO_SET);
		createEReference(setruntimeinstancePrimitiveInstanceEClass, SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFTYPE);
		createEAttribute(setruntimeinstancePrimitiveInstanceEClass, SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSTATE);
		createEReference(setruntimeinstancePrimitiveInstanceEClass, SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFSUPER_COMPONENT);
		createEReference(setruntimeinstancePrimitiveInstanceEClass, SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFATTRIBUTE);
		createEReference(setruntimeinstancePrimitiveInstanceEClass, SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFBINDING);
		createEAttribute(setruntimeinstancePrimitiveInstanceEClass, SETRUNTIMEINSTANCE_PRIMITIVE_INSTANCE__REFNAME);

		setruntimeinstanceCompositeInstanceEClass = createEClass(SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE);
		createEReference(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__COMPOSITE_INSTANCE_TO_SET);
		createEReference(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUB_COMPONENT);
		createEReference(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFDELEGATION);
		createEReference(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFTYPE);
		createEAttribute(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSTATE);
		createEReference(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFSUPER_COMPONENT);
		createEReference(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFATTRIBUTE);
		createEReference(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFBINDING);
		createEAttribute(setruntimeinstanceCompositeInstanceEClass, SETRUNTIMEINSTANCE_COMPOSITE_INSTANCE__REFNAME);

		setruntimeinstanceTransmissionBindingEClass = createEClass(SETRUNTIMEINSTANCE_TRANSMISSION_BINDING);
		createEReference(setruntimeinstanceTransmissionBindingEClass, SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__TRANSMISSION_BINDING_TO_SET);
		createEReference(setruntimeinstanceTransmissionBindingEClass, SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFCLIENT);
		createEReference(setruntimeinstanceTransmissionBindingEClass, SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER);
		createEReference(setruntimeinstanceTransmissionBindingEClass, SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REFSERVER_INSTANCE);
		createEAttribute(setruntimeinstanceTransmissionBindingEClass, SETRUNTIMEINSTANCE_TRANSMISSION_BINDING__REF_ID);
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
		Smartadapters4ARTPackage theSmartadapters4ARTPackage = (Smartadapters4ARTPackage)EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI);
		Distrib_relaxedPackage theDistrib_relaxedPackage = (Distrib_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI);
		Instance_relaxedPackage theInstance_relaxedPackage = (Instance_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI);
		Art_relaxedPackage theArt_relaxedPackage = (Art_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI);
		Type_relaxedPackage theType_relaxedPackage = (Type_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		setruntimeNodeEClass.getESuperTypes().add(theSmartadapters4ARTPackage.getSetAdaptation());
		setruntimeSystemEClass.getESuperTypes().add(theSmartadapters4ARTPackage.getSetAdaptation());
		setruntimeinstanceComponentInstanceEClass.getESuperTypes().add(theSmartadapters4ARTPackage.getSetAdaptation());
		setruntimeinstancePrimitiveInstanceEClass.getESuperTypes().add(theSmartadapters4ARTPackage.getSetAdaptation());
		setruntimeinstanceCompositeInstanceEClass.getESuperTypes().add(theSmartadapters4ARTPackage.getSetAdaptation());
		setruntimeinstanceTransmissionBindingEClass.getESuperTypes().add(theSmartadapters4ARTPackage.getSetAdaptation());

		// Initialize classes and features; add operations and parameters
		initEClass(setruntimeNodeEClass, SetruntimeNode.class, "SetruntimeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetruntimeNode_NodeToSet(), theDistrib_relaxedPackage.getNode(), null, "nodeToSet", null, 1, 1, SetruntimeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeNode_Components(), theInstance_relaxedPackage.getComponentInstance(), null, "components", null, 0, -1, SetruntimeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setruntimeSystemEClass, SetruntimeSystem.class, "SetruntimeSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetruntimeSystem_SystemToSet(), theArt_relaxedPackage.getSystem(), null, "SystemToSet", null, 0, 1, SetruntimeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeSystem_Refroot(), theInstance_relaxedPackage.getCompositeInstance(), null, "refroot", null, 0, 1, SetruntimeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeSystem_Refservices(), theType_relaxedPackage.getService(), null, "refservices", null, 0, -1, SetruntimeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeSystem_Reftypes(), theType_relaxedPackage.getComponentType(), null, "reftypes", null, 0, -1, SetruntimeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeSystem_RefdataTypes(), theArt_relaxedPackage.getDataType(), null, "refdataTypes", null, 0, -1, SetruntimeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetruntimeSystem_Refname(), theSmartadapters4ARTPackage.getString(), "refname", null, 0, 1, SetruntimeSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setruntimeinstanceComponentInstanceEClass, SetruntimeinstanceComponentInstance.class, "SetruntimeinstanceComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetruntimeinstanceComponentInstance_ComponentInstanceToSet(), theInstance_relaxedPackage.getComponentInstance(), null, "ComponentInstanceToSet", null, 0, 1, SetruntimeinstanceComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceComponentInstance_Reftype(), theType_relaxedPackage.getComponentType(), null, "reftype", null, 0, 1, SetruntimeinstanceComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetruntimeinstanceComponentInstance_Refstate(), theSmartadapters4ARTPackage.getString(), "refstate", null, 0, 1, SetruntimeinstanceComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceComponentInstance_RefsuperComponent(), theInstance_relaxedPackage.getCompositeInstance(), null, "refsuperComponent", null, 0, 1, SetruntimeinstanceComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceComponentInstance_Refattribute(), theInstance_relaxedPackage.getValuedAttribute(), null, "refattribute", null, 0, -1, SetruntimeinstanceComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceComponentInstance_Refbinding(), theInstance_relaxedPackage.getTransmissionBinding(), null, "refbinding", null, 0, -1, SetruntimeinstanceComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetruntimeinstanceComponentInstance_Refname(), theSmartadapters4ARTPackage.getString(), "refname", null, 0, 1, SetruntimeinstanceComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setruntimeinstancePrimitiveInstanceEClass, SetruntimeinstancePrimitiveInstance.class, "SetruntimeinstancePrimitiveInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetruntimeinstancePrimitiveInstance_PrimitiveInstanceToSet(), theInstance_relaxedPackage.getPrimitiveInstance(), null, "PrimitiveInstanceToSet", null, 0, 1, SetruntimeinstancePrimitiveInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstancePrimitiveInstance_Reftype(), theType_relaxedPackage.getComponentType(), null, "reftype", null, 0, 1, SetruntimeinstancePrimitiveInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetruntimeinstancePrimitiveInstance_Refstate(), theSmartadapters4ARTPackage.getString(), "refstate", null, 0, 1, SetruntimeinstancePrimitiveInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstancePrimitiveInstance_RefsuperComponent(), theInstance_relaxedPackage.getCompositeInstance(), null, "refsuperComponent", null, 0, 1, SetruntimeinstancePrimitiveInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstancePrimitiveInstance_Refattribute(), theInstance_relaxedPackage.getValuedAttribute(), null, "refattribute", null, 0, -1, SetruntimeinstancePrimitiveInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstancePrimitiveInstance_Refbinding(), theInstance_relaxedPackage.getTransmissionBinding(), null, "refbinding", null, 0, -1, SetruntimeinstancePrimitiveInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetruntimeinstancePrimitiveInstance_Refname(), theSmartadapters4ARTPackage.getString(), "refname", null, 0, 1, SetruntimeinstancePrimitiveInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setruntimeinstanceCompositeInstanceEClass, SetruntimeinstanceCompositeInstance.class, "SetruntimeinstanceCompositeInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetruntimeinstanceCompositeInstance_CompositeInstanceToSet(), theInstance_relaxedPackage.getCompositeInstance(), null, "CompositeInstanceToSet", null, 0, 1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceCompositeInstance_RefsubComponent(), theInstance_relaxedPackage.getComponentInstance(), null, "refsubComponent", null, 0, -1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceCompositeInstance_Refdelegation(), theInstance_relaxedPackage.getDelegationBinding(), null, "refdelegation", null, 0, -1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceCompositeInstance_Reftype(), theType_relaxedPackage.getComponentType(), null, "reftype", null, 0, 1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetruntimeinstanceCompositeInstance_Refstate(), theSmartadapters4ARTPackage.getString(), "refstate", null, 0, 1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceCompositeInstance_RefsuperComponent(), theInstance_relaxedPackage.getCompositeInstance(), null, "refsuperComponent", null, 0, 1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceCompositeInstance_Refattribute(), theInstance_relaxedPackage.getValuedAttribute(), null, "refattribute", null, 0, -1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceCompositeInstance_Refbinding(), theInstance_relaxedPackage.getTransmissionBinding(), null, "refbinding", null, 0, -1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetruntimeinstanceCompositeInstance_Refname(), theSmartadapters4ARTPackage.getString(), "refname", null, 0, 1, SetruntimeinstanceCompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setruntimeinstanceTransmissionBindingEClass, SetruntimeinstanceTransmissionBinding.class, "SetruntimeinstanceTransmissionBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetruntimeinstanceTransmissionBinding_TransmissionBindingToSet(), theInstance_relaxedPackage.getTransmissionBinding(), null, "TransmissionBindingToSet", null, 0, 1, SetruntimeinstanceTransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceTransmissionBinding_Refclient(), theType_relaxedPackage.getAbstractPort(), null, "refclient", null, 0, 1, SetruntimeinstanceTransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceTransmissionBinding_Refserver(), theType_relaxedPackage.getAbstractPort(), null, "refserver", null, 0, 1, SetruntimeinstanceTransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetruntimeinstanceTransmissionBinding_RefserverInstance(), theInstance_relaxedPackage.getComponentInstance(), null, "refserverInstance", null, 0, 1, SetruntimeinstanceTransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetruntimeinstanceTransmissionBinding_RefId(), theSmartadapters4ARTPackage.getString(), "refId", null, 0, 1, SetruntimeinstanceTransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta";		
		addAnnotation
		  (getSetruntimeSystem_Refname(), 
		   source, 
		   new String[] {
			 "isComposite", "false"
		   });		
		addAnnotation
		  (getSetruntimeinstanceComponentInstance_Refstate(), 
		   source, 
		   new String[] {
			 "isComposite", "false"
		   });		
		addAnnotation
		  (getSetruntimeinstanceComponentInstance_Refname(), 
		   source, 
		   new String[] {
			 "isComposite", "false"
		   });		
		addAnnotation
		  (getSetruntimeinstancePrimitiveInstance_Refstate(), 
		   source, 
		   new String[] {
			 "isComposite", "false"
		   });		
		addAnnotation
		  (getSetruntimeinstancePrimitiveInstance_Refname(), 
		   source, 
		   new String[] {
			 "isComposite", "false"
		   });		
		addAnnotation
		  (getSetruntimeinstanceCompositeInstance_Refstate(), 
		   source, 
		   new String[] {
			 "isComposite", "false"
		   });		
		addAnnotation
		  (getSetruntimeinstanceCompositeInstance_Refname(), 
		   source, 
		   new String[] {
			 "isComposite", "false"
		   });
	}

} //AdaptationsPackageImpl
