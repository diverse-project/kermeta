/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.impl;

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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import smartadapters4ART.Adaptation;
import smartadapters4ART.AdviceModel;
import smartadapters4ART.Aspect;
import smartadapters4ART.CloneAdaptation;
import smartadapters4ART.CreateAdaptation;
import smartadapters4ART.GlobalInstantiation;
import smartadapters4ART.InstantiationStrategy;
import smartadapters4ART.PerElementMatch;
import smartadapters4ART.PerRoleMatch;
import smartadapters4ART.PointcutModel;
import smartadapters4ART.ScopedInstantiation;
import smartadapters4ART.SetAdaptation;
import smartadapters4ART.Smartadapters4ARTFactory;
import smartadapters4ART.Smartadapters4ARTPackage;
import smartadapters4ART.UnsetAdaptation;

import smartadapters4ART.adaptations.AdaptationsPackage;

import smartadapters4ART.adaptations.impl.AdaptationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Smartadapters4ARTPackageImpl extends EPackageImpl implements Smartadapters4ARTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloneAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetAdaptationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointcutModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantiationStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopedInstantiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perRoleMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perElementMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

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
	 * @see smartadapters4ART.Smartadapters4ARTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Smartadapters4ARTPackageImpl() {
		super(eNS_URI, Smartadapters4ARTFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Smartadapters4ARTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Smartadapters4ARTPackage init() {
		if (isInited) return (Smartadapters4ARTPackage)EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI);

		// Obtain or create and register package
		Smartadapters4ARTPackageImpl theSmartadapters4ARTPackage = (Smartadapters4ARTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Smartadapters4ARTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Smartadapters4ARTPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AdaptationsPackageImpl theAdaptationsPackage = (AdaptationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) instanceof AdaptationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) : AdaptationsPackage.eINSTANCE);
		Art_relaxedPackageImpl theArt_relaxedPackage = (Art_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) instanceof Art_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) : Art_relaxedPackage.eINSTANCE);
		Instance_relaxedPackageImpl theInstance_relaxedPackage = (Instance_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI) instanceof Instance_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI) : Instance_relaxedPackage.eINSTANCE);
		Type_relaxedPackageImpl theType_relaxedPackage = (Type_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) instanceof Type_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) : Type_relaxedPackage.eINSTANCE);
		Implem_relaxedPackageImpl theImplem_relaxedPackage = (Implem_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI) instanceof Implem_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI) : Implem_relaxedPackage.eINSTANCE);
		Group_relaxedPackageImpl theGroup_relaxedPackage = (Group_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI) instanceof Group_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI) : Group_relaxedPackage.eINSTANCE);
		Distrib_relaxedPackageImpl theDistrib_relaxedPackage = (Distrib_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) instanceof Distrib_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) : Distrib_relaxedPackage.eINSTANCE);

		// Create package meta-data objects
		theSmartadapters4ARTPackage.createPackageContents();
		theAdaptationsPackage.createPackageContents();
		theArt_relaxedPackage.createPackageContents();
		theInstance_relaxedPackage.createPackageContents();
		theType_relaxedPackage.createPackageContents();
		theImplem_relaxedPackage.createPackageContents();
		theGroup_relaxedPackage.createPackageContents();
		theDistrib_relaxedPackage.createPackageContents();

		// Initialize created meta-data
		theSmartadapters4ARTPackage.initializePackageContents();
		theAdaptationsPackage.initializePackageContents();
		theArt_relaxedPackage.initializePackageContents();
		theInstance_relaxedPackage.initializePackageContents();
		theType_relaxedPackage.initializePackageContents();
		theImplem_relaxedPackage.initializePackageContents();
		theGroup_relaxedPackage.initializePackageContents();
		theDistrib_relaxedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSmartadapters4ARTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Smartadapters4ARTPackage.eNS_URI, theSmartadapters4ARTPackage);
		return theSmartadapters4ARTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAspect_Name() {
		return (EAttribute)aspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Pointcut() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Advice() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Strategies() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAspect_Adapt() {
		return (EReference)aspectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptation() {
		return adaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloneAdaptation() {
		return cloneAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAdaptation() {
		return createAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAdaptation() {
		return setAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsetAdaptation() {
		return unsetAdaptationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdviceModel() {
		return adviceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdviceModel_Content() {
		return (EReference)adviceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointcutModel() {
		return pointcutModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointcutModel_Content() {
		return (EReference)pointcutModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantiationStrategy() {
		return instantiationStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstantiationStrategy_AdviceElements() {
		return (EReference)instantiationStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalInstantiation() {
		return globalInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopedInstantiation() {
		return scopedInstantiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopedInstantiation_PointcutElements() {
		return (EReference)scopedInstantiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerRoleMatch() {
		return perRoleMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerElementMatch() {
		return perElementMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smartadapters4ARTFactory getSmartadapters4ARTFactory() {
		return (Smartadapters4ARTFactory)getEFactoryInstance();
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
		aspectEClass = createEClass(ASPECT);
		createEAttribute(aspectEClass, ASPECT__NAME);
		createEReference(aspectEClass, ASPECT__POINTCUT);
		createEReference(aspectEClass, ASPECT__ADVICE);
		createEReference(aspectEClass, ASPECT__STRATEGIES);
		createEReference(aspectEClass, ASPECT__ADAPT);

		adaptationEClass = createEClass(ADAPTATION);

		cloneAdaptationEClass = createEClass(CLONE_ADAPTATION);

		createAdaptationEClass = createEClass(CREATE_ADAPTATION);

		setAdaptationEClass = createEClass(SET_ADAPTATION);

		unsetAdaptationEClass = createEClass(UNSET_ADAPTATION);

		adviceModelEClass = createEClass(ADVICE_MODEL);
		createEReference(adviceModelEClass, ADVICE_MODEL__CONTENT);

		pointcutModelEClass = createEClass(POINTCUT_MODEL);
		createEReference(pointcutModelEClass, POINTCUT_MODEL__CONTENT);

		instantiationStrategyEClass = createEClass(INSTANTIATION_STRATEGY);
		createEReference(instantiationStrategyEClass, INSTANTIATION_STRATEGY__ADVICE_ELEMENTS);

		globalInstantiationEClass = createEClass(GLOBAL_INSTANTIATION);

		scopedInstantiationEClass = createEClass(SCOPED_INSTANTIATION);
		createEReference(scopedInstantiationEClass, SCOPED_INSTANTIATION__POINTCUT_ELEMENTS);

		perRoleMatchEClass = createEClass(PER_ROLE_MATCH);

		perElementMatchEClass = createEClass(PER_ELEMENT_MATCH);

		// Create data types
		stringEDataType = createEDataType(STRING);
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
		AdaptationsPackage theAdaptationsPackage = (AdaptationsPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI);
		Art_relaxedPackage theArt_relaxedPackage = (Art_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAdaptationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cloneAdaptationEClass.getESuperTypes().add(this.getAdaptation());
		createAdaptationEClass.getESuperTypes().add(this.getAdaptation());
		setAdaptationEClass.getESuperTypes().add(this.getAdaptation());
		unsetAdaptationEClass.getESuperTypes().add(this.getAdaptation());
		globalInstantiationEClass.getESuperTypes().add(this.getInstantiationStrategy());
		scopedInstantiationEClass.getESuperTypes().add(this.getInstantiationStrategy());
		perRoleMatchEClass.getESuperTypes().add(this.getScopedInstantiation());
		perElementMatchEClass.getESuperTypes().add(this.getScopedInstantiation());

		// Initialize classes and features; add operations and parameters
		initEClass(aspectEClass, Aspect.class, "Aspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAspect_Name(), this.getString(), "name", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Pointcut(), this.getPointcutModel(), null, "pointcut", null, 0, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Advice(), this.getAdviceModel(), null, "advice", null, 1, 1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Strategies(), this.getInstantiationStrategy(), null, "strategies", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAspect_Adapt(), this.getAdaptation(), null, "adapt", null, 0, -1, Aspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adaptationEClass, Adaptation.class, "Adaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloneAdaptationEClass, CloneAdaptation.class, "CloneAdaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAdaptationEClass, CreateAdaptation.class, "CreateAdaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setAdaptationEClass, SetAdaptation.class, "SetAdaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsetAdaptationEClass, UnsetAdaptation.class, "UnsetAdaptation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adviceModelEClass, AdviceModel.class, "AdviceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdviceModel_Content(), theArt_relaxedPackage.getAspectModelElement(), null, "content", null, 0, -1, AdviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointcutModelEClass, PointcutModel.class, "PointcutModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointcutModel_Content(), theArt_relaxedPackage.getAspectModelElement(), null, "content", null, 0, -1, PointcutModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantiationStrategyEClass, InstantiationStrategy.class, "InstantiationStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstantiationStrategy_AdviceElements(), theArt_relaxedPackage.getAspectModelElement(), null, "adviceElements", null, 0, -1, InstantiationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalInstantiationEClass, GlobalInstantiation.class, "GlobalInstantiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scopedInstantiationEClass, ScopedInstantiation.class, "ScopedInstantiation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopedInstantiation_PointcutElements(), theArt_relaxedPackage.getAspectModelElement(), null, "pointcutElements", null, 0, -1, ScopedInstantiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perRoleMatchEClass, PerRoleMatch.class, "PerRoleMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(perElementMatchEClass, PerElementMatch.class, "PerElementMatch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Smartadapters4ARTPackageImpl
