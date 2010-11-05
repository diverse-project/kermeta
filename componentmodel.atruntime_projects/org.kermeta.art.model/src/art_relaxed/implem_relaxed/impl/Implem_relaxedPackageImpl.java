/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.implem_relaxed.impl;

import art_relaxed.Art_relaxedPackage;

import art_relaxed.distrib_relaxed.Distrib_relaxedPackage;

import art_relaxed.distrib_relaxed.impl.Distrib_relaxedPackageImpl;

import art_relaxed.group_relaxed.Group_relaxedPackage;

import art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl;

import art_relaxed.impl.Art_relaxedPackageImpl;

import art_relaxed.implem_relaxed.ComponentImplementation;
import art_relaxed.implem_relaxed.FractalComponent;
import art_relaxed.implem_relaxed.Implem_relaxedFactory;
import art_relaxed.implem_relaxed.Implem_relaxedPackage;
import art_relaxed.implem_relaxed.OSGiComponent;
import art_relaxed.implem_relaxed.OSGiType;
import art_relaxed.implem_relaxed.TypeImplementation;

import art_relaxed.instance_relaxed.Instance_relaxedPackage;

import art_relaxed.instance_relaxed.impl.Instance_relaxedPackageImpl;

import art_relaxed.type_relaxed.Type_relaxedPackage;

import art_relaxed.type_relaxed.impl.Type_relaxedPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
public class Implem_relaxedPackageImpl extends EPackageImpl implements Implem_relaxedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fractalComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osGiComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osGiTypeEClass = null;

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
	 * @see art_relaxed.implem_relaxed.Implem_relaxedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Implem_relaxedPackageImpl() {
		super(eNS_URI, Implem_relaxedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Implem_relaxedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Implem_relaxedPackage init() {
		if (isInited) return (Implem_relaxedPackage)EPackage.Registry.INSTANCE.getEPackage(Implem_relaxedPackage.eNS_URI);

		// Obtain or create and register package
		Implem_relaxedPackageImpl theImplem_relaxedPackage = (Implem_relaxedPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Implem_relaxedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Implem_relaxedPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Smartadapters4ARTPackageImpl theSmartadapters4ARTPackage = (Smartadapters4ARTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI) instanceof Smartadapters4ARTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Smartadapters4ARTPackage.eNS_URI) : Smartadapters4ARTPackage.eINSTANCE);
		AdaptationsPackageImpl theAdaptationsPackage = (AdaptationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) instanceof AdaptationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdaptationsPackage.eNS_URI) : AdaptationsPackage.eINSTANCE);
		Art_relaxedPackageImpl theArt_relaxedPackage = (Art_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) instanceof Art_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Art_relaxedPackage.eNS_URI) : Art_relaxedPackage.eINSTANCE);
		Instance_relaxedPackageImpl theInstance_relaxedPackage = (Instance_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI) instanceof Instance_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Instance_relaxedPackage.eNS_URI) : Instance_relaxedPackage.eINSTANCE);
		Type_relaxedPackageImpl theType_relaxedPackage = (Type_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) instanceof Type_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Type_relaxedPackage.eNS_URI) : Type_relaxedPackage.eINSTANCE);
		Group_relaxedPackageImpl theGroup_relaxedPackage = (Group_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI) instanceof Group_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Group_relaxedPackage.eNS_URI) : Group_relaxedPackage.eINSTANCE);
		Distrib_relaxedPackageImpl theDistrib_relaxedPackage = (Distrib_relaxedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) instanceof Distrib_relaxedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Distrib_relaxedPackage.eNS_URI) : Distrib_relaxedPackage.eINSTANCE);

		// Create package meta-data objects
		theImplem_relaxedPackage.createPackageContents();
		theSmartadapters4ARTPackage.createPackageContents();
		theAdaptationsPackage.createPackageContents();
		theArt_relaxedPackage.createPackageContents();
		theInstance_relaxedPackage.createPackageContents();
		theType_relaxedPackage.createPackageContents();
		theGroup_relaxedPackage.createPackageContents();
		theDistrib_relaxedPackage.createPackageContents();

		// Initialize created meta-data
		theImplem_relaxedPackage.initializePackageContents();
		theSmartadapters4ARTPackage.initializePackageContents();
		theAdaptationsPackage.initializePackageContents();
		theArt_relaxedPackage.initializePackageContents();
		theInstance_relaxedPackage.initializePackageContents();
		theType_relaxedPackage.initializePackageContents();
		theGroup_relaxedPackage.initializePackageContents();
		theDistrib_relaxedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImplem_relaxedPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Implem_relaxedPackage.eNS_URI, theImplem_relaxedPackage);
		return theImplem_relaxedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentImplementation() {
		return componentImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFractalComponent() {
		return fractalComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFractalComponent_ControllerDesc() {
		return (EAttribute)fractalComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFractalComponent_ContentDesc() {
		return (EAttribute)fractalComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSGiComponent() {
		return osGiComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSGiComponent_ImplementingClass() {
		return (EAttribute)osGiComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeImplementation() {
		return typeImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSGiType() {
		return osGiTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSGiType_GenerateInstanceBundle() {
		return (EAttribute)osGiTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implem_relaxedFactory getImplem_relaxedFactory() {
		return (Implem_relaxedFactory)getEFactoryInstance();
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
		componentImplementationEClass = createEClass(COMPONENT_IMPLEMENTATION);

		fractalComponentEClass = createEClass(FRACTAL_COMPONENT);
		createEAttribute(fractalComponentEClass, FRACTAL_COMPONENT__CONTROLLER_DESC);
		createEAttribute(fractalComponentEClass, FRACTAL_COMPONENT__CONTENT_DESC);

		osGiComponentEClass = createEClass(OS_GI_COMPONENT);
		createEAttribute(osGiComponentEClass, OS_GI_COMPONENT__IMPLEMENTING_CLASS);

		typeImplementationEClass = createEClass(TYPE_IMPLEMENTATION);

		osGiTypeEClass = createEClass(OS_GI_TYPE);
		createEAttribute(osGiTypeEClass, OS_GI_TYPE__GENERATE_INSTANCE_BUNDLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentImplementationEClass.getESuperTypes().add(theArt_relaxedPackage.getAspectModelElement());
		fractalComponentEClass.getESuperTypes().add(this.getComponentImplementation());
		osGiComponentEClass.getESuperTypes().add(this.getComponentImplementation());
		typeImplementationEClass.getESuperTypes().add(theArt_relaxedPackage.getAspectModelElement());
		osGiTypeEClass.getESuperTypes().add(this.getTypeImplementation());

		// Initialize classes and features; add operations and parameters
		initEClass(componentImplementationEClass, ComponentImplementation.class, "ComponentImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fractalComponentEClass, FractalComponent.class, "FractalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFractalComponent_ControllerDesc(), theArt_relaxedPackage.getString(), "controllerDesc", null, 1, 1, FractalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFractalComponent_ContentDesc(), theArt_relaxedPackage.getString(), "contentDesc", null, 1, 1, FractalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osGiComponentEClass, OSGiComponent.class, "OSGiComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSGiComponent_ImplementingClass(), theArt_relaxedPackage.getString(), "implementingClass", null, 1, 1, OSGiComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeImplementationEClass, TypeImplementation.class, "TypeImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(osGiTypeEClass, OSGiType.class, "OSGiType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSGiType_GenerateInstanceBundle(), theArt_relaxedPackage.getBoolean(), "generateInstanceBundle", "true", 1, 1, OSGiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //Implem_relaxedPackageImpl
