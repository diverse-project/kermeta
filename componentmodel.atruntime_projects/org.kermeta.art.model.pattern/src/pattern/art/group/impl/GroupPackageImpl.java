/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pattern.art.group.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pattern.art.ArtPackage;

import pattern.art.group.Group;
import pattern.art.group.GroupFactory;
import pattern.art.group.GroupPackage;
import pattern.art.group.InstanceGroup;
import pattern.art.group.TypeGroup;

import pattern.art.impl.ArtPackageImpl;

import pattern.art.implem.ImplemPackage;

import pattern.art.implem.impl.ImplemPackageImpl;

import pattern.art.instance.InstancePackage;

import pattern.art.instance.impl.InstancePackageImpl;

import pattern.art.type.TypePackage;

import pattern.art.type.impl.TypePackageImpl;

import patternframework.PatternframeworkPackage;

import patternframework.impl.PatternframeworkPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupPackageImpl extends EPackageImpl implements GroupPackage {
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
	 * @see pattern.art.group.GroupPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GroupPackageImpl() {
		super(eNS_URI, GroupFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GroupPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GroupPackage init() {
		if (isInited) return (GroupPackage)EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI);

		// Obtain or create and register package
		GroupPackageImpl theGroupPackage = (GroupPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GroupPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GroupPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArtPackageImpl theArtPackage = (ArtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) instanceof ArtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) : ArtPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI) : ImplemPackage.eINSTANCE);
		PatternframeworkPackageImpl thePatternframeworkPackage = (PatternframeworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternframeworkPackage.eNS_URI) instanceof PatternframeworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternframeworkPackage.eNS_URI) : PatternframeworkPackage.eINSTANCE);

		// Create package meta-data objects
		theGroupPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();
		thePatternframeworkPackage.createPackageContents();

		// Initialize created meta-data
		theGroupPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();
		thePatternframeworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGroupPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GroupPackage.eNS_URI, theGroupPackage);
		return theGroupPackage;
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
	public GroupFactory getGroupFactory() {
		return (GroupFactory)getEFactoryInstance();
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
		ArtPackage theArtPackage = (ArtPackage)EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		InstancePackage theInstancePackage = (InstancePackage)EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		groupEClass.getESuperTypes().add(theArtPackage.getNamedElement());
		typeGroupEClass.getESuperTypes().add(this.getGroup());
		instanceGroupEClass.getESuperTypes().add(this.getGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeGroupEClass, TypeGroup.class, "TypeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeGroup_Types(), theTypePackage.getComponentType(), theTypePackage.getComponentType_Groups(), "types", null, 0, -1, TypeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeGroup_SubGroups(), this.getTypeGroup(), null, "subGroups", null, 0, -1, TypeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceGroupEClass, InstanceGroup.class, "InstanceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceGroup_Instances(), theInstancePackage.getComponentInstance(), theInstancePackage.getComponentInstance_Groups(), "instances", null, 0, -1, InstanceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstanceGroup_SubGroups(), this.getInstanceGroup(), null, "subGroups", null, 0, -1, InstanceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //GroupPackageImpl
