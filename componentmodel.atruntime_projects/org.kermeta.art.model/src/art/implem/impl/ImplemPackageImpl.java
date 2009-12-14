/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem.impl;

import art.ArtPackage;

import art.group.GroupPackage;

import art.group.impl.GroupPackageImpl;

import art.impl.ArtPackageImpl;

import art.implem.ComponentImplementation;
import art.implem.FractalComponent;
import art.implem.ImplemFactory;
import art.implem.ImplemPackage;
import art.implem.OSGiComponent;
import art.implem.OSGiPort;
import art.implem.OSGiType;
import art.implem.PortImplementation;
import art.implem.TypeImplementation;

import art.instance.InstancePackage;

import art.instance.impl.InstancePackageImpl;

import art.type.TypePackage;

import art.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplemPackageImpl extends EPackageImpl implements ImplemPackage {
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
	private EClass portImplementationEClass = null;

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
	 * @see art.implem.ImplemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImplemPackageImpl() {
		super(eNS_URI, ImplemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ImplemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImplemPackage init() {
		if (isInited) return (ImplemPackage)EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI);

		// Obtain or create and register package
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ImplemPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArtPackageImpl theArtPackage = (ArtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) instanceof ArtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) : ArtPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		GroupPackageImpl theGroupPackage = (GroupPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI) instanceof GroupPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI) : GroupPackage.eINSTANCE);

		// Create package meta-data objects
		theImplemPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theGroupPackage.createPackageContents();

		// Initialize created meta-data
		theImplemPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theGroupPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImplemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImplemPackage.eNS_URI, theImplemPackage);
		return theImplemPackage;
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
	public EClass getPortImplementation() {
		return portImplementationEClass;
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
	public ImplemFactory getImplemFactory() {
		return (ImplemFactory)getEFactoryInstance();
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

		portImplementationEClass = createEClass(PORT_IMPLEMENTATION);

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
		ArtPackage theArtPackage = (ArtPackage)EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fractalComponentEClass.getESuperTypes().add(this.getComponentImplementation());
		osGiComponentEClass.getESuperTypes().add(this.getComponentImplementation());
		osGiTypeEClass.getESuperTypes().add(this.getTypeImplementation());

		// Initialize classes and features; add operations and parameters
		initEClass(componentImplementationEClass, ComponentImplementation.class, "ComponentImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fractalComponentEClass, FractalComponent.class, "FractalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFractalComponent_ControllerDesc(), theArtPackage.getString(), "controllerDesc", null, 1, 1, FractalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFractalComponent_ContentDesc(), theArtPackage.getString(), "contentDesc", null, 1, 1, FractalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(osGiComponentEClass, OSGiComponent.class, "OSGiComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSGiComponent_ImplementingClass(), theArtPackage.getString(), "implementingClass", null, 1, 1, OSGiComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portImplementationEClass, PortImplementation.class, "PortImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeImplementationEClass, TypeImplementation.class, "TypeImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(osGiTypeEClass, OSGiType.class, "OSGiType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSGiType_GenerateInstanceBundle(), theArtPackage.getBoolean(), "generateInstanceBundle", "true", 1, 1, OSGiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ImplemPackageImpl
