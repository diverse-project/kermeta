/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReflectPackageImpl.java,v 1.1 2007/02/14 20:38:05 barais Exp $
 */
package emf.spoon.reflect.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import emf.spoon.SpoonPackage;
import emf.spoon.facade.FacadePackage;
import emf.spoon.facade.impl.FacadePackageImpl;
import emf.spoon.impl.SpoonPackageImpl;
import emf.spoon.reflect.Dummy;
import emf.spoon.reflect.ReflectFactory;
import emf.spoon.reflect.ReflectPackage;
import emf.spoon.reflect.code.CodePackage;
import emf.spoon.reflect.code.impl.CodePackageImpl;
import emf.spoon.reflect.declaration.DeclarationPackage;
import emf.spoon.reflect.declaration.impl.DeclarationPackageImpl;
import emf.spoon.reflect.reference.ReferencePackage;
import emf.spoon.reflect.reference.impl.ReferencePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReflectPackageImpl extends EPackageImpl implements ReflectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyEClass = null;

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
	 * @see emf.spoon.reflect.ReflectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReflectPackageImpl() {
		super(eNS_URI, ReflectFactory.eINSTANCE);
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
	public static ReflectPackage init() {
		if (isInited) return (ReflectPackage)EPackage.Registry.INSTANCE.getEPackage(ReflectPackage.eNS_URI);

		// Obtain or create and register package
		ReflectPackageImpl theReflectPackage = (ReflectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ReflectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ReflectPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SpoonPackageImpl theSpoonPackage = (SpoonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI) instanceof SpoonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SpoonPackage.eNS_URI) : SpoonPackage.eINSTANCE);
		ReferencePackageImpl theReferencePackage = (ReferencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI) instanceof ReferencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI) : ReferencePackage.eINSTANCE);
		CodePackageImpl theCodePackage = (CodePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) instanceof CodePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI) : CodePackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);
		FacadePackageImpl theFacadePackage = (FacadePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) : FacadePackage.eINSTANCE);

		// Create package meta-data objects
		theReflectPackage.createPackageContents();
		theSpoonPackage.createPackageContents();
		theReferencePackage.createPackageContents();
		theCodePackage.createPackageContents();
		theDeclarationPackage.createPackageContents();
		theFacadePackage.createPackageContents();

		// Initialize created meta-data
		theReflectPackage.initializePackageContents();
		theSpoonPackage.initializePackageContents();
		theReferencePackage.initializePackageContents();
		theCodePackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();
		theFacadePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReflectPackage.freeze();

		return theReflectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummy() {
		return dummyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectFactory getReflectFactory() {
		return (ReflectFactory)getEFactoryInstance();
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
		dummyEClass = createEClass(DUMMY);
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
		ReferencePackage theReferencePackage = (ReferencePackage)EPackage.Registry.INSTANCE.getEPackage(ReferencePackage.eNS_URI);
		CodePackage theCodePackage = (CodePackage)EPackage.Registry.INSTANCE.getEPackage(CodePackage.eNS_URI);
		DeclarationPackage theDeclarationPackage = (DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theReferencePackage);
		getESubpackages().add(theCodePackage);
		getESubpackages().add(theDeclarationPackage);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dummyEClass, Dummy.class, "Dummy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ReflectPackageImpl
