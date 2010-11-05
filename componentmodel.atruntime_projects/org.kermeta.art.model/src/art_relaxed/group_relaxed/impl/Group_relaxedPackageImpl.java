/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.group_relaxed.impl;

import art_relaxed.Art_relaxedPackage;

import art_relaxed.distrib_relaxed.Distrib_relaxedPackage;

import art_relaxed.distrib_relaxed.impl.Distrib_relaxedPackageImpl;

import art_relaxed.group_relaxed.Group;
import art_relaxed.group_relaxed.Group_relaxedFactory;
import art_relaxed.group_relaxed.Group_relaxedPackage;
import art_relaxed.group_relaxed.InstanceGroup;
import art_relaxed.group_relaxed.TypeGroup;

import art_relaxed.impl.Art_relaxedPackageImpl;

import art_relaxed.implem_relaxed.Implem_relaxedPackage;

import art_relaxed.implem_relaxed.impl.Implem_relaxedPackageImpl;

import art_relaxed.instance_relaxed.Instance_relaxedPackage;

import art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl;

import art_relaxed.type_relaxed.Type_relaxedPackage;

import art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl;

import org.eclipse.emf.ecore.EClass;
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
public class Group_relaxedPackageImpl extends EPackageImpl implements Group_relaxedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceGroupEClass = null;

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
	 * @see art_relaxed.group_relaxed.Group_relaxedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Group_relaxedPackageImpl() {
		super(eNS_URI, Group_relaxedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Group_relaxedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Group_relaxedPackage init() {
		if (isInited) return (Group_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI);

		// Obtain or create and register package
		Group_relaxedPackageImpl theGroup_relaxedPackage = (Group_relaxedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Group_relaxedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Group_relaxedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Smartadapters4ARTPackageImpl theSmartadapters4ARTPackage = (Smartadapters4ARTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI) instanceof Smartadapters4ARTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI) : Smartadapters4ARTPackage.eINSTANCE);
		AdaptationsPackageImpl theAdaptationsPackage = (AdaptationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) instanceof AdaptationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) : AdaptationsPackage.eINSTANCE);
		Art_relaxedPackageImpl theArt_relaxedPackage = (Art_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) instanceof Art_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) : Art_relaxedPackage.eINSTANCE);
		Instance_relaxedPackageImpl theInstance_relaxedPackage = (Instance_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI) instanceof Instance_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI) : Instance_relaxedPackage.eINSTANCE);
		Type_relaxedPackageImpl theType_relaxedPackage = (Type_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) instanceof Type_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) : Type_relaxedPackage.eINSTANCE);
		Implem_relaxedPackageImpl theImplem_relaxedPackage = (Implem_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI) instanceof Implem_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI) : Implem_relaxedPackage.eINSTANCE);
		Distrib_relaxedPackageImpl theDistrib_relaxedPackage = (Distrib_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) instanceof Distrib_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) : Distrib_relaxedPackage.eINSTANCE);

		// Create package meta-data objects
		theGroup_relaxedPackage.createPackageContents();
		theSmartadapters4ARTPackage.createPackageContents();
		theAdaptationsPackage.createPackageContents();
		theArt_relaxedPackage.createPackageContents();
		theInstance_relaxedPackage.createPackageContents();
		theType_relaxedPackage.createPackageContents();
		theImplem_relaxedPackage.createPackageContents();
		theDistrib_relaxedPackage.createPackageContents();

		// Initialize created meta-data
		theGroup_relaxedPackage.initializePackageContents();
		theSmartadapters4ARTPackage.initializePackageContents();
		theAdaptationsPackage.initializePackageContents();
		theArt_relaxedPackage.initializePackageContents();
		theInstance_relaxedPackage.initializePackageContents();
		theType_relaxedPackage.initializePackageContents();
		theImplem_relaxedPackage.initializePackageContents();
		theDistrib_relaxedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGroup_relaxedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Group_relaxedPackage.eNS_URI, theGroup_relaxedPackage);
		return theGroup_relaxedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeGroup() {
		return typeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGroup_Types() {
		return (EReference)typeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeGroup_SubGroups() {
		return (EReference)typeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceGroup() {
		return instanceGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceGroup_Instances() {
		return (EReference)instanceGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceGroup_SubGroups() {
		return (EReference)instanceGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group_relaxedFactory getGroup_relaxedFactory() {
		return (Group_relaxedFactory)getEFactoryInstance();
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
		groupEClass = createEClass(GROUP);

		typeGroupEClass = createEClass(TYPE_GROUP);
		createEReference(typeGroupEClass, TYPE_GROUP__TYPES);
		createEReference(typeGroupEClass, TYPE_GROUP__SUB_GROUPS);

		instanceGroupEClass = createEClass(INSTANCE_GROUP);
		createEReference(instanceGroupEClass, INSTANCE_GROUP__INSTANCES);
		createEReference(instanceGroupEClass, INSTANCE_GROUP__SUB_GROUPS);
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
		Instance_relaxedPackage theInstance_relaxedPackage = (Instance_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groupEClass.getESuperTypes().add(theArt_relaxedPackage.getNamedElement());
		typeGroupEClass.getESuperTypes().add(this.getGroup());
		instanceGroupEClass.getESuperTypes().add(this.getGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(groupEClass, Group.class, "Group", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeGroupEClass, TypeGroup.class, "TypeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeGroup_Types(), theType_relaxedPackage.getComponentType(), theType_relaxedPackage.getComponentType_Groups(), "types", null, 0, -1, TypeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGroup_SubGroups(), this.getTypeGroup(), null, "subGroups", null, 0, -1, TypeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceGroupEClass, InstanceGroup.class, "InstanceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceGroup_Instances(), theInstance_relaxedPackage.getComponentInstance(), theInstance_relaxedPackage.getComponentInstance_Groups(), "instances", null, 0, -1, InstanceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceGroup_SubGroups(), this.getInstanceGroup(), null, "subGroups", null, 0, -1, InstanceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Group_relaxedPackageImpl
