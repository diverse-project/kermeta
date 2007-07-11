/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irisa.triskell.kermeta.impl;

import fr.irisa.triskell.kermeta.DummyClass;
import fr.irisa.triskell.kermeta.KmFactory;
import fr.irisa.triskell.kermeta.KmPackage;

import fr.irisa.triskell.kermeta.language.LanguagePackage;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

import fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl;

import fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl;

import fr.irisa.triskell.kermeta.language.structure.StructurePackage;

import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KmPackageImpl extends EPackageImpl implements KmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dummyClassEClass = null;

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
	 * @see fr.irisa.triskell.kermeta.KmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KmPackageImpl() {
		super(eNS_URI, KmFactory.eINSTANCE);
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
	public static KmPackage init() {
		if (isInited) return (KmPackage)EPackage.Registry.INSTANCE.getEPackage(KmPackage.eNS_URI);

		// Obtain or create and register package
		KmPackageImpl theKmPackage = (KmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof KmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new KmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI) : StructurePackage.eINSTANCE);

		// Create package meta-data objects
		theKmPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStructurePackage.createPackageContents();

		// Initialize created meta-data
		theKmPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStructurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKmPackage.freeze();

		return theKmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDummyClass() {
		return dummyClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmFactory getKmFactory() {
		return (KmFactory)getEFactoryInstance();
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
		dummyClassEClass = createEClass(DUMMY_CLASS);
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
		LanguagePackage theLanguagePackage = (LanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theLanguagePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(dummyClassEClass, DummyClass.class, "DummyClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KmPackageImpl
