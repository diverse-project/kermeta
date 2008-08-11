/**
 * <copyright>
 * </copyright>
 *
 * $Id: FrameworkPackageImpl.java,v 1.4 2008-08-11 14:19:27 edaubert Exp $
 */
package framework.impl;

import jar.JarPackage;
import jar.impl.JarPackageImpl;
import manifest.ManifestPackage;
import manifest.impl.ManifestPackageImpl;
import option.OptionPackage;
import option.impl.OptionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import framework.Bundle;
import framework.Framework;
import framework.FrameworkFactory;
import framework.FrameworkPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class FrameworkPackageImpl extends EPackageImpl implements
		FrameworkPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see framework.FrameworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FrameworkPackageImpl() {
		super(eNS_URI, FrameworkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FrameworkPackage init() {
		if (isInited) return (FrameworkPackage)EPackage.Registry.INSTANCE.getEPackage(FrameworkPackage.eNS_URI);

		// Obtain or create and register package
		FrameworkPackageImpl theFrameworkPackage = (FrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof FrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new FrameworkPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ManifestPackageImpl theManifestPackage = (ManifestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI) instanceof ManifestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI) : ManifestPackage.eINSTANCE);
		JarPackageImpl theJarPackage = (JarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI) instanceof JarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI) : JarPackage.eINSTANCE);
		OptionPackageImpl theOptionPackage = (OptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OptionPackage.eNS_URI) instanceof OptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OptionPackage.eNS_URI) : OptionPackage.eINSTANCE);

		// Create package meta-data objects
		theFrameworkPackage.createPackageContents();
		theManifestPackage.createPackageContents();
		theJarPackage.createPackageContents();
		theOptionPackage.createPackageContents();

		// Initialize created meta-data
		theFrameworkPackage.initializePackageContents();
		theManifestPackage.initializePackageContents();
		theJarPackage.initializePackageContents();
		theOptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFrameworkPackage.freeze();

		return theFrameworkPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFramework() {
		return frameworkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFramework_Bundles() {
		return (EReference)frameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Fragments() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundle_Location() {
		return (EAttribute)bundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Manifest() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Folder() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Package() {
		return (EReference)bundleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundle_FragmentsReference() {
		return (EAttribute)bundleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkFactory getFrameworkFactory() {
		return (FrameworkFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		frameworkEClass = createEClass(FRAMEWORK);
		createEReference(frameworkEClass, FRAMEWORK__BUNDLES);

		bundleEClass = createEClass(BUNDLE);
		createEReference(bundleEClass, BUNDLE__FRAGMENTS);
		createEAttribute(bundleEClass, BUNDLE__LOCATION);
		createEReference(bundleEClass, BUNDLE__MANIFEST);
		createEReference(bundleEClass, BUNDLE__FOLDER);
		createEReference(bundleEClass, BUNDLE__PACKAGE);
		createEAttribute(bundleEClass, BUNDLE__FRAGMENTS_REFERENCE);

		// Create data types
		stringEDataType = createEDataType(STRING);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		ManifestPackage theManifestPackage = (ManifestPackage)EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI);
		JarPackage theJarPackage = (JarPackage)EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(frameworkEClass, Framework.class, "Framework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFramework_Bundles(), this.getBundle(), null, "bundles", null, 0, -1, Framework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleEClass, Bundle.class, "Bundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundle_Fragments(), this.getBundle(), null, "fragments", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundle_Location(), this.getString(), "location", "", 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Manifest(), theManifestPackage.getMANIFEST(), null, "manifest", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Folder(), theJarPackage.getFolder(), null, "folder", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundle_Package(), theJarPackage.getPackage(), null, "package", null, 1, 1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundle_FragmentsReference(), this.getString(), "fragmentsReference", null, 0, -1, Bundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // FrameworkPackageImpl
