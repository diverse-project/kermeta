/**
 * <copyright>
 * </copyright>
 *
 * $Id: KmLogoPackageImpl.java,v 1.1 2007-05-30 13:23:35 ffleurey Exp $
 */
package fr.irisa.triskell.kmLogo.impl;

import fr.irisa.triskell.kmLogo.ASM.ASMPackage;

import fr.irisa.triskell.kmLogo.ASM.impl.ASMPackageImpl;

import fr.irisa.triskell.kmLogo.KmLogoFactory;
import fr.irisa.triskell.kmLogo.KmLogoPackage;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KmLogoPackageImpl extends EPackageImpl implements KmLogoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

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
	 * @see fr.irisa.triskell.kmLogo.KmLogoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KmLogoPackageImpl() {
		super(eNS_URI, KmLogoFactory.eINSTANCE);
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
	public static KmLogoPackage init() {
		if (isInited) return (KmLogoPackage)EPackage.Registry.INSTANCE.getEPackage(KmLogoPackage.eNS_URI);

		// Obtain or create and register package
		KmLogoPackageImpl theKmLogoPackage = (KmLogoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof KmLogoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new KmLogoPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ASMPackageImpl theASMPackage = (ASMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ASMPackage.eNS_URI) instanceof ASMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ASMPackage.eNS_URI) : ASMPackage.eINSTANCE);

		// Create package meta-data objects
		theKmLogoPackage.createPackageContents();
		theASMPackage.createPackageContents();

		// Initialize created meta-data
		theKmLogoPackage.initializePackageContents();
		theASMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKmLogoPackage.freeze();

		return theKmLogoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
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
	public KmLogoFactory getKmLogoFactory() {
		return (KmLogoFactory)getEFactoryInstance();
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

		// Create data types
		integerEDataType = createEDataType(INTEGER);
		booleanEDataType = createEDataType(BOOLEAN);
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
		ASMPackage theASMPackage = (ASMPackage)EPackage.Registry.INSTANCE.getEPackage(ASMPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theASMPackage);

		// Initialize data types
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KmLogoPackageImpl
