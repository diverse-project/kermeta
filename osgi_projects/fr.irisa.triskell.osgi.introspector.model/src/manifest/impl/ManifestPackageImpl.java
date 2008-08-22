/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManifestPackageImpl.java,v 1.7 2008-08-22 12:43:34 edaubert Exp $
 */
package manifest.impl;

import jar.JarPackage;
import jar.impl.JarPackageImpl;
import manifest.BundleActivationPolicy;
import manifest.BundleActivator;
import manifest.BundleCategory;
import manifest.BundleClassPath;
import manifest.BundleContactAddress;
import manifest.BundleCopyright;
import manifest.BundleDescription;
import manifest.BundleDocURL;
import manifest.BundleLocalization;
import manifest.BundleManifestVersion;
import manifest.BundleName;
import manifest.BundleNativeCode;
import manifest.BundleRequiredExecutionEnvironment;
import manifest.BundleSymbolicName;
import manifest.BundleUpdateLocation;
import manifest.BundleVendor;
import manifest.BundleVersion;
import manifest.ClassPath;
import manifest.DynamicImportPackage;
import manifest.ExportPackage;
import manifest.ExportService;
import manifest.FragmentHost;
import manifest.ImportPackage;
import manifest.ImportService;
import manifest.MANIFESTEntry;
import manifest.MANIFESTVersionEnum;
import manifest.ManifestFactory;
import manifest.ManifestPackage;
import manifest.NativeCode;
import manifest.PolicyEnum;
import manifest.RequireBundle;
import manifest.Service;
import manifest.SimpleMANIFESTEntry;
import manifest.SimpleManifestEntryManyValues;
import manifest.URLMANIFESTEntry;
import manifest.Version;
import option.OptionPackage;
import option.impl.OptionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import framework.FrameworkPackage;
import framework.impl.FrameworkPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ManifestPackageImpl extends EPackageImpl implements
		ManifestPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMANIFESTEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleNameEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleSymbolicNameEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleLocalizationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleVendorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleContactAddressEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleCopyrightEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleCategoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlmanifestEntryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleDocURLEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleUpdateLocationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleVersionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleActivatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleClassPathEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleNativeCodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireBundleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportServiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importPackageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportPackageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleActivationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentHostEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicImportPackageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleRequiredExecutionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleManifestEntryManyValuesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleManifestVersionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classPathEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeCodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum manifestVersionEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum policyEnumEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intEDataType = null;

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
	 * @see manifest.ManifestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ManifestPackageImpl() {
		super(eNS_URI, ManifestFactory.eINSTANCE);
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
	public static ManifestPackage init() {
		if (isInited) return (ManifestPackage)EPackage.Registry.INSTANCE.getEPackage(ManifestPackage.eNS_URI);

		// Obtain or create and register package
		ManifestPackageImpl theManifestPackage = (ManifestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ManifestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ManifestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FrameworkPackageImpl theFrameworkPackage = (FrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FrameworkPackage.eNS_URI) instanceof FrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FrameworkPackage.eNS_URI) : FrameworkPackage.eINSTANCE);
		JarPackageImpl theJarPackage = (JarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI) instanceof JarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI) : JarPackage.eINSTANCE);
		OptionPackageImpl theOptionPackage = (OptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OptionPackage.eNS_URI) instanceof OptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OptionPackage.eNS_URI) : OptionPackage.eINSTANCE);

		// Create package meta-data objects
		theManifestPackage.createPackageContents();
		theFrameworkPackage.createPackageContents();
		theJarPackage.createPackageContents();
		theOptionPackage.createPackageContents();

		// Initialize created meta-data
		theManifestPackage.initializePackageContents();
		theFrameworkPackage.initializePackageContents();
		theJarPackage.initializePackageContents();
		theOptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theManifestPackage.freeze();

		return theManifestPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Reference() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Interface() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Resolved() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Major() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Minor() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Micro() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Qualifier() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMANIFEST() {
		return manifestEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleClassPaths() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleNativeCodes() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleVersion() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleRequiredExecutionEnvironments() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleActivationPolicy() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleActivator() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_RequireBundles() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_ImportServices() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_ExportServices() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleSymbolicName() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleVendor() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleCopyright() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleContactAddress() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleDescription() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleName() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleCategory() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleUpdateLocation() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleDocURL() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_ImportPackages() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleLocalization() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_FragmentHost() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_DynamicImportPackages() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_ExportPackages() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_UnknownEntries() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMANIFEST_NativeCodeOptional() {
		return (EAttribute)manifestEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFEST_BundleManifestVersion() {
		return (EReference)manifestEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMANIFESTEntry() {
		return manifestEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMANIFESTEntry_EntryName() {
		return (EAttribute)manifestEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMANIFESTEntry_Options() {
		return (EReference)manifestEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMANIFESTEntry() {
		return simpleMANIFESTEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleMANIFESTEntry_Value() {
		return (EAttribute)simpleMANIFESTEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleName() {
		return bundleNameEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleSymbolicName() {
		return bundleSymbolicNameEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleSymbolicName_SymbolicName() {
		return (EAttribute)bundleSymbolicNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleSymbolicName_Directives() {
		return (EReference)bundleSymbolicNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleDescription() {
		return bundleDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleLocalization() {
		return bundleLocalizationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleVendor() {
		return bundleVendorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleContactAddress() {
		return bundleContactAddressEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleCopyright() {
		return bundleCopyrightEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleCategory() {
		return bundleCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLMANIFESTEntry() {
		return urlmanifestEntryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLMANIFESTEntry_Url() {
		return (EAttribute)urlmanifestEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleDocURL() {
		return bundleDocURLEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleUpdateLocation() {
		return bundleUpdateLocationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleVersion() {
		return bundleVersionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleVersion_Version() {
		return (EReference)bundleVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleActivator() {
		return bundleActivatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleActivator_Reference() {
		return (EAttribute)bundleActivatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleActivator_Resolved() {
		return (EAttribute)bundleActivatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleActivator_Activator() {
		return (EReference)bundleActivatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleClassPath() {
		return bundleClassPathEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleClassPath_ClassPaths() {
		return (EReference)bundleClassPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleNativeCode() {
		return bundleNativeCodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleNativeCode_Optional() {
		return (EAttribute)bundleNativeCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleNativeCode_Directives() {
		return (EReference)bundleNativeCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleNativeCode_NativeCodes() {
		return (EReference)bundleNativeCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequireBundle() {
		return requireBundleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequireBundle_Directives() {
		return (EReference)requireBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequireBundle_Resolved() {
		return (EAttribute)requireBundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequireBundle_Reference() {
		return (EAttribute)requireBundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequireBundle_Bundle() {
		return (EReference)requireBundleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportService() {
		return importServiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportService_Resolved() {
		return (EAttribute)importServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportService_ServiceReference() {
		return (EAttribute)importServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportService_Service() {
		return (EReference)importServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportService() {
		return exportServiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExportService_Service() {
		return (EReference)exportServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportPackage() {
		return importPackageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportPackage_Packages() {
		return (EReference)importPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportPackage_PackageReferences() {
		return (EAttribute)importPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportPackage_Directives() {
		return (EReference)importPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportPackage_Bundle() {
		return (EReference)importPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportPackage_Resolved() {
		return (EAttribute)importPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportPackage() {
		return exportPackageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExportPackage_Packages() {
		return (EReference)exportPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExportPackage_Directives() {
		return (EReference)exportPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleActivationPolicy() {
		return bundleActivationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleActivationPolicy_Policy() {
		return (EAttribute)bundleActivationPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleActivationPolicy_Directives() {
		return (EReference)bundleActivationPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFragmentHost() {
		return fragmentHostEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentHost_Directives() {
		return (EReference)fragmentHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFragmentHost_Bundle() {
		return (EReference)fragmentHostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFragmentHost_Reference() {
		return (EAttribute)fragmentHostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFragmentHost_Resolved() {
		return (EAttribute)fragmentHostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicImportPackage() {
		return dynamicImportPackageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicImportPackage_Packages() {
		return (EAttribute)dynamicImportPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleRequiredExecutionEnvironment() {
		return bundleRequiredExecutionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleRequiredExecutionEnvironment_Profile() {
		return (EAttribute)bundleRequiredExecutionEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleRequiredExecutionEnvironment_Configuration() {
		return (EAttribute)bundleRequiredExecutionEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleManifestEntryManyValues() {
		return simpleManifestEntryManyValuesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleManifestEntryManyValues_Values() {
		return (EAttribute)simpleManifestEntryManyValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleManifestVersion() {
		return bundleManifestVersionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleManifestVersion_ManifestVersion() {
		return (EAttribute)bundleManifestVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassPath() {
		return classPathEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassPath_Resolved() {
		return (EAttribute)classPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassPath_Reference() {
		return (EAttribute)classPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassPath_Entry() {
		return (EReference)classPathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNativeCode() {
		return nativeCodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNativeCode_Resolved() {
		return (EAttribute)nativeCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNativeCode_Reference() {
		return (EAttribute)nativeCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNativeCode_File() {
		return (EReference)nativeCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Resolved() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Reference() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Package() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMANIFESTVersionEnum() {
		return manifestVersionEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolicyEnum() {
		return policyEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURL() {
		return urlEDataType;
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
	public EDataType getboolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getint() {
		return intEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestFactory getManifestFactory() {
		return (ManifestFactory)getEFactoryInstance();
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
		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__REFERENCE);
		createEAttribute(serviceEClass, SERVICE__RESOLVED);
		createEReference(serviceEClass, SERVICE__INTERFACE);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__MAJOR);
		createEAttribute(versionEClass, VERSION__MINOR);
		createEAttribute(versionEClass, VERSION__MICRO);
		createEAttribute(versionEClass, VERSION__QUALIFIER);

		manifestEClass = createEClass(MANIFEST);
		createEReference(manifestEClass, MANIFEST__BUNDLE_CLASS_PATHS);
		createEReference(manifestEClass, MANIFEST__BUNDLE_NATIVE_CODES);
		createEReference(manifestEClass, MANIFEST__BUNDLE_VERSION);
		createEReference(manifestEClass, MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS);
		createEReference(manifestEClass, MANIFEST__BUNDLE_ACTIVATION_POLICY);
		createEReference(manifestEClass, MANIFEST__BUNDLE_ACTIVATOR);
		createEReference(manifestEClass, MANIFEST__REQUIRE_BUNDLES);
		createEReference(manifestEClass, MANIFEST__IMPORT_SERVICES);
		createEReference(manifestEClass, MANIFEST__EXPORT_SERVICES);
		createEReference(manifestEClass, MANIFEST__BUNDLE_SYMBOLIC_NAME);
		createEReference(manifestEClass, MANIFEST__BUNDLE_VENDOR);
		createEReference(manifestEClass, MANIFEST__BUNDLE_COPYRIGHT);
		createEReference(manifestEClass, MANIFEST__BUNDLE_CONTACT_ADDRESS);
		createEReference(manifestEClass, MANIFEST__BUNDLE_DESCRIPTION);
		createEReference(manifestEClass, MANIFEST__BUNDLE_NAME);
		createEReference(manifestEClass, MANIFEST__BUNDLE_CATEGORY);
		createEReference(manifestEClass, MANIFEST__BUNDLE_UPDATE_LOCATION);
		createEReference(manifestEClass, MANIFEST__BUNDLE_DOC_URL);
		createEReference(manifestEClass, MANIFEST__IMPORT_PACKAGES);
		createEReference(manifestEClass, MANIFEST__BUNDLE_LOCALIZATION);
		createEReference(manifestEClass, MANIFEST__FRAGMENT_HOST);
		createEReference(manifestEClass, MANIFEST__DYNAMIC_IMPORT_PACKAGES);
		createEReference(manifestEClass, MANIFEST__EXPORT_PACKAGES);
		createEReference(manifestEClass, MANIFEST__UNKNOWN_ENTRIES);
		createEAttribute(manifestEClass, MANIFEST__NATIVE_CODE_OPTIONAL);
		createEReference(manifestEClass, MANIFEST__BUNDLE_MANIFEST_VERSION);

		manifestEntryEClass = createEClass(MANIFEST_ENTRY);
		createEAttribute(manifestEntryEClass, MANIFEST_ENTRY__ENTRY_NAME);
		createEReference(manifestEntryEClass, MANIFEST_ENTRY__OPTIONS);

		simpleMANIFESTEntryEClass = createEClass(SIMPLE_MANIFEST_ENTRY);
		createEAttribute(simpleMANIFESTEntryEClass, SIMPLE_MANIFEST_ENTRY__VALUE);

		bundleNameEClass = createEClass(BUNDLE_NAME);

		bundleSymbolicNameEClass = createEClass(BUNDLE_SYMBOLIC_NAME);
		createEAttribute(bundleSymbolicNameEClass, BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME);
		createEReference(bundleSymbolicNameEClass, BUNDLE_SYMBOLIC_NAME__DIRECTIVES);

		bundleDescriptionEClass = createEClass(BUNDLE_DESCRIPTION);

		bundleLocalizationEClass = createEClass(BUNDLE_LOCALIZATION);

		bundleVendorEClass = createEClass(BUNDLE_VENDOR);

		bundleContactAddressEClass = createEClass(BUNDLE_CONTACT_ADDRESS);

		bundleCopyrightEClass = createEClass(BUNDLE_COPYRIGHT);

		bundleCategoryEClass = createEClass(BUNDLE_CATEGORY);

		urlmanifestEntryEClass = createEClass(URLMANIFEST_ENTRY);
		createEAttribute(urlmanifestEntryEClass, URLMANIFEST_ENTRY__URL);

		bundleDocURLEClass = createEClass(BUNDLE_DOC_URL);

		bundleUpdateLocationEClass = createEClass(BUNDLE_UPDATE_LOCATION);

		bundleVersionEClass = createEClass(BUNDLE_VERSION);
		createEReference(bundleVersionEClass, BUNDLE_VERSION__VERSION);

		bundleActivatorEClass = createEClass(BUNDLE_ACTIVATOR);
		createEAttribute(bundleActivatorEClass, BUNDLE_ACTIVATOR__REFERENCE);
		createEAttribute(bundleActivatorEClass, BUNDLE_ACTIVATOR__RESOLVED);
		createEReference(bundleActivatorEClass, BUNDLE_ACTIVATOR__ACTIVATOR);

		bundleClassPathEClass = createEClass(BUNDLE_CLASS_PATH);
		createEReference(bundleClassPathEClass, BUNDLE_CLASS_PATH__CLASS_PATHS);

		bundleNativeCodeEClass = createEClass(BUNDLE_NATIVE_CODE);
		createEAttribute(bundleNativeCodeEClass, BUNDLE_NATIVE_CODE__OPTIONAL);
		createEReference(bundleNativeCodeEClass, BUNDLE_NATIVE_CODE__DIRECTIVES);
		createEReference(bundleNativeCodeEClass, BUNDLE_NATIVE_CODE__NATIVE_CODES);

		requireBundleEClass = createEClass(REQUIRE_BUNDLE);
		createEReference(requireBundleEClass, REQUIRE_BUNDLE__DIRECTIVES);
		createEAttribute(requireBundleEClass, REQUIRE_BUNDLE__RESOLVED);
		createEAttribute(requireBundleEClass, REQUIRE_BUNDLE__REFERENCE);
		createEReference(requireBundleEClass, REQUIRE_BUNDLE__BUNDLE);

		importServiceEClass = createEClass(IMPORT_SERVICE);
		createEAttribute(importServiceEClass, IMPORT_SERVICE__RESOLVED);
		createEAttribute(importServiceEClass, IMPORT_SERVICE__SERVICE_REFERENCE);
		createEReference(importServiceEClass, IMPORT_SERVICE__SERVICE);

		exportServiceEClass = createEClass(EXPORT_SERVICE);
		createEReference(exportServiceEClass, EXPORT_SERVICE__SERVICE);

		importPackageEClass = createEClass(IMPORT_PACKAGE);
		createEReference(importPackageEClass, IMPORT_PACKAGE__DIRECTIVES);
		createEReference(importPackageEClass, IMPORT_PACKAGE__BUNDLE);
		createEReference(importPackageEClass, IMPORT_PACKAGE__PACKAGES);
		createEAttribute(importPackageEClass, IMPORT_PACKAGE__PACKAGE_REFERENCES);
		createEAttribute(importPackageEClass, IMPORT_PACKAGE__RESOLVED);

		exportPackageEClass = createEClass(EXPORT_PACKAGE);
		createEReference(exportPackageEClass, EXPORT_PACKAGE__DIRECTIVES);
		createEReference(exportPackageEClass, EXPORT_PACKAGE__PACKAGES);

		bundleActivationPolicyEClass = createEClass(BUNDLE_ACTIVATION_POLICY);
		createEAttribute(bundleActivationPolicyEClass, BUNDLE_ACTIVATION_POLICY__POLICY);
		createEReference(bundleActivationPolicyEClass, BUNDLE_ACTIVATION_POLICY__DIRECTIVES);

		fragmentHostEClass = createEClass(FRAGMENT_HOST);
		createEReference(fragmentHostEClass, FRAGMENT_HOST__DIRECTIVES);
		createEReference(fragmentHostEClass, FRAGMENT_HOST__BUNDLE);
		createEAttribute(fragmentHostEClass, FRAGMENT_HOST__REFERENCE);
		createEAttribute(fragmentHostEClass, FRAGMENT_HOST__RESOLVED);

		dynamicImportPackageEClass = createEClass(DYNAMIC_IMPORT_PACKAGE);
		createEAttribute(dynamicImportPackageEClass, DYNAMIC_IMPORT_PACKAGE__PACKAGES);

		bundleRequiredExecutionEnvironmentEClass = createEClass(BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT);
		createEAttribute(bundleRequiredExecutionEnvironmentEClass, BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__PROFILE);
		createEAttribute(bundleRequiredExecutionEnvironmentEClass, BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__CONFIGURATION);

		simpleManifestEntryManyValuesEClass = createEClass(SIMPLE_MANIFEST_ENTRY_MANY_VALUES);
		createEAttribute(simpleManifestEntryManyValuesEClass, SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES);

		bundleManifestVersionEClass = createEClass(BUNDLE_MANIFEST_VERSION);
		createEAttribute(bundleManifestVersionEClass, BUNDLE_MANIFEST_VERSION__MANIFEST_VERSION);

		classPathEClass = createEClass(CLASS_PATH);
		createEAttribute(classPathEClass, CLASS_PATH__RESOLVED);
		createEAttribute(classPathEClass, CLASS_PATH__REFERENCE);
		createEReference(classPathEClass, CLASS_PATH__ENTRY);

		nativeCodeEClass = createEClass(NATIVE_CODE);
		createEAttribute(nativeCodeEClass, NATIVE_CODE__RESOLVED);
		createEAttribute(nativeCodeEClass, NATIVE_CODE__REFERENCE);
		createEReference(nativeCodeEClass, NATIVE_CODE__FILE);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__RESOLVED);
		createEAttribute(packageEClass, PACKAGE__REFERENCE);
		createEReference(packageEClass, PACKAGE__PACKAGE);

		// Create enums
		manifestVersionEnumEEnum = createEEnum(MANIFEST_VERSION_ENUM);
		policyEnumEEnum = createEEnum(POLICY_ENUM);

		// Create data types
		urlEDataType = createEDataType(URL);
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		intEDataType = createEDataType(INT);
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
		FrameworkPackage theFrameworkPackage = (FrameworkPackage)EPackage.Registry.INSTANCE.getEPackage(FrameworkPackage.eNS_URI);
		JarPackage theJarPackage = (JarPackage)EPackage.Registry.INSTANCE.getEPackage(JarPackage.eNS_URI);
		OptionPackage theOptionPackage = (OptionPackage)EPackage.Registry.INSTANCE.getEPackage(OptionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleMANIFESTEntryEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleNameEClass.getESuperTypes().add(this.getSimpleMANIFESTEntry());
		bundleSymbolicNameEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleDescriptionEClass.getESuperTypes().add(this.getSimpleMANIFESTEntry());
		bundleLocalizationEClass.getESuperTypes().add(this.getSimpleMANIFESTEntry());
		bundleVendorEClass.getESuperTypes().add(this.getSimpleMANIFESTEntry());
		bundleContactAddressEClass.getESuperTypes().add(this.getSimpleMANIFESTEntry());
		bundleCopyrightEClass.getESuperTypes().add(this.getSimpleMANIFESTEntry());
		bundleCategoryEClass.getESuperTypes().add(this.getSimpleManifestEntryManyValues());
		urlmanifestEntryEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleDocURLEClass.getESuperTypes().add(this.getURLMANIFESTEntry());
		bundleUpdateLocationEClass.getESuperTypes().add(this.getURLMANIFESTEntry());
		bundleVersionEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleActivatorEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleClassPathEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleNativeCodeEClass.getESuperTypes().add(this.getMANIFESTEntry());
		requireBundleEClass.getESuperTypes().add(this.getMANIFESTEntry());
		importServiceEClass.getESuperTypes().add(this.getMANIFESTEntry());
		exportServiceEClass.getESuperTypes().add(this.getMANIFESTEntry());
		importPackageEClass.getESuperTypes().add(this.getMANIFESTEntry());
		exportPackageEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleActivationPolicyEClass.getESuperTypes().add(this.getMANIFESTEntry());
		fragmentHostEClass.getESuperTypes().add(this.getMANIFESTEntry());
		dynamicImportPackageEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleRequiredExecutionEnvironmentEClass.getESuperTypes().add(this.getMANIFESTEntry());
		simpleManifestEntryManyValuesEClass.getESuperTypes().add(this.getMANIFESTEntry());
		bundleManifestVersionEClass.getESuperTypes().add(this.getMANIFESTEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Reference(), theFrameworkPackage.getString(), "reference", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Resolved(), this.getboolean(), "resolved", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Interface(), theJarPackage.getClass_(), null, "interface", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Major(), this.getint(), "major", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Minor(), this.getint(), "minor", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Micro(), this.getint(), "micro", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Qualifier(), this.getString(), "qualifier", "", 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manifestEClass, manifest.MANIFEST.class, "MANIFEST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMANIFEST_BundleClassPaths(), this.getBundleClassPath(), null, "bundleClassPaths", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleNativeCodes(), this.getBundleNativeCode(), null, "bundleNativeCodes", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleVersion(), this.getBundleVersion(), null, "bundleVersion", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleRequiredExecutionEnvironments(), this.getBundleRequiredExecutionEnvironment(), null, "bundleRequiredExecutionEnvironments", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleActivationPolicy(), this.getBundleActivationPolicy(), null, "bundleActivationPolicy", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleActivator(), this.getBundleActivator(), null, "bundleActivator", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_RequireBundles(), this.getRequireBundle(), null, "requireBundles", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_ImportServices(), this.getImportService(), null, "importServices", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_ExportServices(), this.getExportService(), null, "exportServices", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleSymbolicName(), this.getBundleSymbolicName(), null, "bundleSymbolicName", null, 1, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleVendor(), this.getBundleVendor(), null, "bundleVendor", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleCopyright(), this.getBundleCopyright(), null, "bundleCopyright", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleContactAddress(), this.getBundleContactAddress(), null, "bundleContactAddress", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleDescription(), this.getBundleDescription(), null, "bundleDescription", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleName(), this.getBundleName(), null, "bundleName", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleCategory(), this.getBundleCategory(), null, "bundleCategory", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleUpdateLocation(), this.getBundleUpdateLocation(), null, "bundleUpdateLocation", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleDocURL(), this.getBundleDocURL(), null, "BundleDocURL", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_ImportPackages(), this.getImportPackage(), null, "importPackages", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleLocalization(), this.getBundleLocalization(), null, "bundleLocalization", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_FragmentHost(), this.getFragmentHost(), null, "fragmentHost", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_DynamicImportPackages(), this.getDynamicImportPackage(), null, "dynamicImportPackages", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_ExportPackages(), this.getExportPackage(), null, "exportPackages", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_UnknownEntries(), this.getSimpleManifestEntryManyValues(), null, "unknownEntries", null, 0, -1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMANIFEST_NativeCodeOptional(), this.getboolean(), "NativeCodeOptional", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFEST_BundleManifestVersion(), this.getBundleManifestVersion(), null, "bundleManifestVersion", null, 0, 1, manifest.MANIFEST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manifestEntryEClass, MANIFESTEntry.class, "MANIFESTEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMANIFESTEntry_EntryName(), this.getString(), "entryName", null, 1, 1, MANIFESTEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMANIFESTEntry_Options(), theOptionPackage.getAttributEntry(), null, "options", null, 0, -1, MANIFESTEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleMANIFESTEntryEClass, SimpleMANIFESTEntry.class, "SimpleMANIFESTEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleMANIFESTEntry_Value(), this.getString(), "value", null, 1, 1, SimpleMANIFESTEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleNameEClass, BundleName.class, "BundleName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleSymbolicNameEClass, BundleSymbolicName.class, "BundleSymbolicName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleSymbolicName_SymbolicName(), theFrameworkPackage.getString(), "symbolicName", null, 1, 1, BundleSymbolicName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleSymbolicName_Directives(), theOptionPackage.getSymbolicNameDirective(), null, "directives", null, 0, 2, BundleSymbolicName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleDescriptionEClass, BundleDescription.class, "BundleDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleLocalizationEClass, BundleLocalization.class, "BundleLocalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleVendorEClass, BundleVendor.class, "BundleVendor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleContactAddressEClass, BundleContactAddress.class, "BundleContactAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleCopyrightEClass, BundleCopyright.class, "BundleCopyright", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleCategoryEClass, BundleCategory.class, "BundleCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(urlmanifestEntryEClass, URLMANIFESTEntry.class, "URLMANIFESTEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLMANIFESTEntry_Url(), this.getURL(), "url", null, 1, 1, URLMANIFESTEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleDocURLEClass, BundleDocURL.class, "BundleDocURL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleUpdateLocationEClass, BundleUpdateLocation.class, "BundleUpdateLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bundleVersionEClass, BundleVersion.class, "BundleVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleVersion_Version(), this.getVersion(), null, "version", null, 1, 1, BundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleActivatorEClass, BundleActivator.class, "BundleActivator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleActivator_Reference(), theFrameworkPackage.getString(), "reference", null, 1, 1, BundleActivator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleActivator_Resolved(), this.getboolean(), "resolved", null, 1, 1, BundleActivator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleActivator_Activator(), theJarPackage.getClass_(), null, "activator", null, 0, 1, BundleActivator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleClassPathEClass, BundleClassPath.class, "BundleClassPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBundleClassPath_ClassPaths(), this.getClassPath(), null, "classPaths", null, 1, -1, BundleClassPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleNativeCodeEClass, BundleNativeCode.class, "BundleNativeCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleNativeCode_Optional(), this.getboolean(), "optional", null, 0, 1, BundleNativeCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleNativeCode_Directives(), theOptionPackage.getNativeCodeDirective(), null, "directives", null, 1, -1, BundleNativeCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleNativeCode_NativeCodes(), this.getNativeCode(), null, "nativeCodes", null, 1, -1, BundleNativeCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requireBundleEClass, RequireBundle.class, "RequireBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequireBundle_Directives(), theOptionPackage.getRequireBundleDirective(), null, "directives", null, 0, 2, RequireBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequireBundle_Resolved(), this.getboolean(), "resolved", null, 1, 1, RequireBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequireBundle_Reference(), theFrameworkPackage.getString(), "reference", null, 1, 1, RequireBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequireBundle_Bundle(), theFrameworkPackage.getBundle(), null, "bundle", null, 0, 1, RequireBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importServiceEClass, ImportService.class, "ImportService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportService_Resolved(), this.getboolean(), "resolved", null, 1, 1, ImportService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportService_ServiceReference(), theFrameworkPackage.getString(), "serviceReference", null, 1, 1, ImportService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportService_Service(), this.getService(), null, "service", null, 0, 1, ImportService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportServiceEClass, ExportService.class, "ExportService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExportService_Service(), this.getService(), null, "service", null, 1, 1, ExportService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importPackageEClass, ImportPackage.class, "ImportPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportPackage_Directives(), theOptionPackage.getImportPackageDirective(), null, "directives", null, 0, 1, ImportPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportPackage_Bundle(), theFrameworkPackage.getBundle(), null, "bundle", null, 0, 1, ImportPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImportPackage_Packages(), this.getPackage(), null, "packages", null, 0, -1, ImportPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportPackage_PackageReferences(), this.getString(), "packageReferences", null, 1, -1, ImportPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportPackage_Resolved(), this.getboolean(), "resolved", null, 0, 1, ImportPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exportPackageEClass, ExportPackage.class, "ExportPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExportPackage_Directives(), theOptionPackage.getExportPackageDirective(), null, "directives", null, 0, -1, ExportPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExportPackage_Packages(), this.getPackage(), null, "packages", null, 1, -1, ExportPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleActivationPolicyEClass, BundleActivationPolicy.class, "BundleActivationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleActivationPolicy_Policy(), this.getPolicyEnum(), "policy", null, 1, 1, BundleActivationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBundleActivationPolicy_Directives(), theOptionPackage.getActivationPolicyDirective(), null, "directives", null, 0, -1, BundleActivationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fragmentHostEClass, FragmentHost.class, "FragmentHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragmentHost_Directives(), theOptionPackage.getFragmentHostDirective(), null, "directives", null, 0, 1, FragmentHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFragmentHost_Bundle(), theFrameworkPackage.getBundle(), null, "bundle", null, 0, 1, FragmentHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFragmentHost_Reference(), theFrameworkPackage.getString(), "reference", null, 1, 1, FragmentHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFragmentHost_Resolved(), this.getboolean(), "resolved", "false", 1, 1, FragmentHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicImportPackageEClass, DynamicImportPackage.class, "DynamicImportPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDynamicImportPackage_Packages(), this.getString(), "packages", null, 1, -1, DynamicImportPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleRequiredExecutionEnvironmentEClass, BundleRequiredExecutionEnvironment.class, "BundleRequiredExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleRequiredExecutionEnvironment_Profile(), this.getString(), "profile", null, 1, 1, BundleRequiredExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBundleRequiredExecutionEnvironment_Configuration(), this.getString(), "configuration", null, 0, 1, BundleRequiredExecutionEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleManifestEntryManyValuesEClass, SimpleManifestEntryManyValues.class, "SimpleManifestEntryManyValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleManifestEntryManyValues_Values(), this.getString(), "values", null, 1, -1, SimpleManifestEntryManyValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bundleManifestVersionEClass, BundleManifestVersion.class, "BundleManifestVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBundleManifestVersion_ManifestVersion(), this.getMANIFESTVersionEnum(), "manifestVersion", null, 1, 1, BundleManifestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classPathEClass, ClassPath.class, "ClassPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassPath_Resolved(), this.getboolean(), "resolved", null, 0, 1, ClassPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassPath_Reference(), this.getString(), "reference", null, 0, 1, ClassPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassPath_Entry(), theJarPackage.getSystemEntry(), null, "entry", null, 0, 1, ClassPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nativeCodeEClass, NativeCode.class, "NativeCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNativeCode_Resolved(), this.getboolean(), "resolved", null, 0, 1, NativeCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNativeCode_Reference(), this.getString(), "reference", null, 0, 1, NativeCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNativeCode_File(), theJarPackage.getSystemEntry(), null, "file", null, 0, 1, NativeCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, manifest.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Resolved(), this.getboolean(), "resolved", null, 0, 1, manifest.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Reference(), this.getString(), "reference", null, 0, 1, manifest.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_Package(), theJarPackage.getPackage(), null, "package", null, 0, 1, manifest.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(manifestVersionEnumEEnum, MANIFESTVersionEnum.class, "MANIFESTVersionEnum");
		addEEnumLiteral(manifestVersionEnumEEnum, MANIFESTVersionEnum.MORE_THAN1_3);
		addEEnumLiteral(manifestVersionEnumEEnum, MANIFESTVersionEnum.LESS_THAN1_3);

		initEEnum(policyEnumEEnum, PolicyEnum.class, "PolicyEnum");
		addEEnumLiteral(policyEnumEEnum, PolicyEnum.LAZY);

		// Initialize data types
		initEDataType(urlEDataType, java.net.URL.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intEDataType, int.class, "int", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // ManifestPackageImpl
