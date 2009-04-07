/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.implem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import art.ArtPackage;
import art.impl.ArtPackageImpl;
import art.implem.ComponentImplementation;
import art.implem.FractalComponent;
import art.implem.ImplemFactory;
import art.implem.ImplemPackage;
import art.instance.InstancePackage;
import art.instance.impl.InstancePackageImpl;
import art.type.TypePackage;
import art.type.impl.TypePackageImpl;

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
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
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
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ImplemPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArtPackageImpl theArtPackage = (ArtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) instanceof ArtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) : ArtPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);

		// Create package meta-data objects
		theImplemPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();

		// Initialize created meta-data
		theImplemPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImplemPackage.freeze();

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

		// Initialize classes and features; add operations and parameters
		initEClass(componentImplementationEClass, ComponentImplementation.class, "ComponentImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fractalComponentEClass, FractalComponent.class, "FractalComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFractalComponent_ControllerDesc(), theArtPackage.getString(), "controllerDesc", null, 0, 1, FractalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFractalComponent_ContentDesc(), theArtPackage.getString(), "contentDesc", null, 0, 1, FractalComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ImplemPackageImpl
