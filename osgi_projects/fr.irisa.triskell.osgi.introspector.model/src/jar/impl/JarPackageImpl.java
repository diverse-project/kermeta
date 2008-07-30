/**
 * <copyright>
 * </copyright>
 *
 * $Id: JarPackageImpl.java,v 1.1 2008-07-30 14:08:02 edaubert Exp $
 */
package jar.impl;

import jar.BundleEntry;
import jar.File;
import jar.Folder;
import jar.JarFactory;
import jar.JarPackage;
import jar.SystemEntry;
import manifest.ManifestPackage;
import manifest.impl.ManifestPackageImpl;
import option.OptionPackage;
import option.impl.OptionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import framework.FrameworkPackage;
import framework.impl.FrameworkPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class JarPackageImpl extends EPackageImpl implements JarPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bundleEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass systemEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass fileEClass = null;

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
	 * @see jar.JarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JarPackageImpl() {
		super(eNS_URI, JarFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends. Simple dependencies are
	 * satisfied by calling this method on all dependent packages before doing
	 * anything else. This method drives initialization for interdependent
	 * packages directly, in parallel with this package, itself.
	 * <p>
	 * Of this package and its interdependencies, all packages which have not
	 * yet been registered by their URI values are first created and registered.
	 * The packages are then initialized in two steps: meta-model objects for
	 * all of the packages are created before any are initialized, since one
	 * package's meta-model objects may refer to those of another.
	 * <p>
	 * Invocation of this method will not affect any packages that have already
	 * been initialized. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JarPackage init() {
		if (isInited)
			return (JarPackage) EPackage.Registry.INSTANCE
					.getEPackage(JarPackage.eNS_URI);

		// Obtain or create and register package
		JarPackageImpl theJarPackage = (JarPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof JarPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new JarPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FrameworkPackageImpl theFrameworkPackage = (FrameworkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(FrameworkPackage.eNS_URI) instanceof FrameworkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(FrameworkPackage.eNS_URI)
				: FrameworkPackage.eINSTANCE);
		ManifestPackageImpl theManifestPackage = (ManifestPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ManifestPackage.eNS_URI) instanceof ManifestPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ManifestPackage.eNS_URI)
				: ManifestPackage.eINSTANCE);
		OptionPackageImpl theOptionPackage = (OptionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(OptionPackage.eNS_URI) instanceof OptionPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(OptionPackage.eNS_URI)
				: OptionPackage.eINSTANCE);

		// Create package meta-data objects
		theJarPackage.createPackageContents();
		theFrameworkPackage.createPackageContents();
		theManifestPackage.createPackageContents();
		theOptionPackage.createPackageContents();

		// Initialize created meta-data
		theJarPackage.initializePackageContents();
		theFrameworkPackage.initializePackageContents();
		theManifestPackage.initializePackageContents();
		theOptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJarPackage.freeze();

		return theJarPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBundleEntry() {
		return bundleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBundleEntry_FullPath() {
		return (EAttribute) bundleEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getBundleEntry_Name() {
		return (EAttribute) bundleEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSystemEntry() {
		return systemEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackage_Classes() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPackage_SubPackages() {
		return (EReference) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPackage_BundleClassPath() {
		return (EAttribute) packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getFolder_Entries() {
		return (EReference) folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JarFactory getJarFactory() {
		return (JarFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		bundleEntryEClass = createEClass(BUNDLE_ENTRY);
		createEAttribute(bundleEntryEClass, BUNDLE_ENTRY__FULL_PATH);
		createEAttribute(bundleEntryEClass, BUNDLE_ENTRY__NAME);

		systemEntryEClass = createEClass(SYSTEM_ENTRY);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__CLASSES);
		createEReference(packageEClass, PACKAGE__SUB_PACKAGES);
		createEAttribute(packageEClass, PACKAGE__BUNDLE_CLASS_PATH);

		classEClass = createEClass(CLASS);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__ENTRIES);

		fileEClass = createEClass(FILE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ManifestPackage theManifestPackage = (ManifestPackage) EPackage.Registry.INSTANCE
				.getEPackage(ManifestPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemEntryEClass.getESuperTypes().add(this.getBundleEntry());
		packageEClass.getESuperTypes().add(this.getBundleEntry());
		classEClass.getESuperTypes().add(this.getBundleEntry());
		folderEClass.getESuperTypes().add(this.getSystemEntry());
		fileEClass.getESuperTypes().add(this.getSystemEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(bundleEntryEClass, BundleEntry.class, "BundleEntry",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleEntry_FullPath(), theManifestPackage
				.getString(), "fullPath", null, 1, 1, BundleEntry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleEntry_Name(), theManifestPackage.getString(),
				"name", null, 1, 1, BundleEntry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(systemEntryEClass, SystemEntry.class, "SystemEntry",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, jar.Package.class, "Package", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Classes(), this.getClass_(), null, "classes",
				null, 0, -1, jar.Package.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_SubPackages(), this.getPackage(), null,
				"subPackages", null, 0, -1, jar.Package.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_BundleClassPath(), theManifestPackage
				.getboolean(), "bundleClassPath", null, 1, 1,
				jar.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, jar.Class.class, "Class", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_Entries(), this.getSystemEntry(), null,
				"entries", null, 0, -1, Folder.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // JarPackageImpl
