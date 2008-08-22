/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManifestFactoryImpl.java,v 1.5 2008-08-22 12:43:33 edaubert Exp $
 */
package manifest.impl;

import java.net.URL;

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
import manifest.MANIFEST;
import manifest.MANIFESTVersionEnum;
import manifest.ManifestFactory;
import manifest.ManifestPackage;
import manifest.NativeCode;
import manifest.PolicyEnum;
import manifest.RequireBundle;
import manifest.Service;
import manifest.SimpleMANIFESTEntry;
import manifest.SimpleManifestEntryManyValues;
import manifest.Version;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ManifestFactoryImpl extends EFactoryImpl implements
		ManifestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static ManifestFactory init() {
		try {
			ManifestFactory theManifestFactory = (ManifestFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.osgi.framework/manifest"); 
			if (theManifestFactory != null) {
				return theManifestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ManifestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public ManifestFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ManifestPackage.SERVICE: return createService();
			case ManifestPackage.VERSION: return createVersion();
			case ManifestPackage.MANIFEST: return createMANIFEST();
			case ManifestPackage.SIMPLE_MANIFEST_ENTRY: return createSimpleMANIFESTEntry();
			case ManifestPackage.BUNDLE_NAME: return createBundleName();
			case ManifestPackage.BUNDLE_SYMBOLIC_NAME: return createBundleSymbolicName();
			case ManifestPackage.BUNDLE_DESCRIPTION: return createBundleDescription();
			case ManifestPackage.BUNDLE_LOCALIZATION: return createBundleLocalization();
			case ManifestPackage.BUNDLE_VENDOR: return createBundleVendor();
			case ManifestPackage.BUNDLE_CONTACT_ADDRESS: return createBundleContactAddress();
			case ManifestPackage.BUNDLE_COPYRIGHT: return createBundleCopyright();
			case ManifestPackage.BUNDLE_CATEGORY: return createBundleCategory();
			case ManifestPackage.BUNDLE_DOC_URL: return createBundleDocURL();
			case ManifestPackage.BUNDLE_UPDATE_LOCATION: return createBundleUpdateLocation();
			case ManifestPackage.BUNDLE_VERSION: return createBundleVersion();
			case ManifestPackage.BUNDLE_ACTIVATOR: return createBundleActivator();
			case ManifestPackage.BUNDLE_CLASS_PATH: return createBundleClassPath();
			case ManifestPackage.BUNDLE_NATIVE_CODE: return createBundleNativeCode();
			case ManifestPackage.REQUIRE_BUNDLE: return createRequireBundle();
			case ManifestPackage.IMPORT_SERVICE: return createImportService();
			case ManifestPackage.EXPORT_SERVICE: return createExportService();
			case ManifestPackage.IMPORT_PACKAGE: return createImportPackage();
			case ManifestPackage.EXPORT_PACKAGE: return createExportPackage();
			case ManifestPackage.BUNDLE_ACTIVATION_POLICY: return createBundleActivationPolicy();
			case ManifestPackage.FRAGMENT_HOST: return createFragmentHost();
			case ManifestPackage.DYNAMIC_IMPORT_PACKAGE: return createDynamicImportPackage();
			case ManifestPackage.BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT: return createBundleRequiredExecutionEnvironment();
			case ManifestPackage.SIMPLE_MANIFEST_ENTRY_MANY_VALUES: return createSimpleManifestEntryManyValues();
			case ManifestPackage.BUNDLE_MANIFEST_VERSION: return createBundleManifestVersion();
			case ManifestPackage.CLASS_PATH: return createClassPath();
			case ManifestPackage.NATIVE_CODE: return createNativeCode();
			case ManifestPackage.PACKAGE: return createPackage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ManifestPackage.MANIFEST_VERSION_ENUM:
				return createMANIFESTVersionEnumFromString(eDataType, initialValue);
			case ManifestPackage.POLICY_ENUM:
				return createPolicyEnumFromString(eDataType, initialValue);
			case ManifestPackage.URL:
				return createURLFromString(eDataType, initialValue);
			case ManifestPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case ManifestPackage.BOOLEAN:
				return createbooleanFromString(eDataType, initialValue);
			case ManifestPackage.INT:
				return createintFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ManifestPackage.MANIFEST_VERSION_ENUM:
				return convertMANIFESTVersionEnumToString(eDataType, instanceValue);
			case ManifestPackage.POLICY_ENUM:
				return convertPolicyEnumToString(eDataType, instanceValue);
			case ManifestPackage.URL:
				return convertURLToString(eDataType, instanceValue);
			case ManifestPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case ManifestPackage.BOOLEAN:
				return convertbooleanToString(eDataType, instanceValue);
			case ManifestPackage.INT:
				return convertintToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MANIFEST createMANIFEST() {
		MANIFESTImpl manifest = new MANIFESTImpl();
		return manifest;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMANIFESTEntry createSimpleMANIFESTEntry() {
		SimpleMANIFESTEntryImpl simpleMANIFESTEntry = new SimpleMANIFESTEntryImpl();
		return simpleMANIFESTEntry;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleName createBundleName() {
		BundleNameImpl bundleName = new BundleNameImpl();
		return bundleName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleSymbolicName createBundleSymbolicName() {
		BundleSymbolicNameImpl bundleSymbolicName = new BundleSymbolicNameImpl();
		return bundleSymbolicName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleDescription createBundleDescription() {
		BundleDescriptionImpl bundleDescription = new BundleDescriptionImpl();
		return bundleDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleLocalization createBundleLocalization() {
		BundleLocalizationImpl bundleLocalization = new BundleLocalizationImpl();
		return bundleLocalization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleVendor createBundleVendor() {
		BundleVendorImpl bundleVendor = new BundleVendorImpl();
		return bundleVendor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleContactAddress createBundleContactAddress() {
		BundleContactAddressImpl bundleContactAddress = new BundleContactAddressImpl();
		return bundleContactAddress;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleCopyright createBundleCopyright() {
		BundleCopyrightImpl bundleCopyright = new BundleCopyrightImpl();
		return bundleCopyright;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleCategory createBundleCategory() {
		BundleCategoryImpl bundleCategory = new BundleCategoryImpl();
		return bundleCategory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleDocURL createBundleDocURL() {
		BundleDocURLImpl bundleDocURL = new BundleDocURLImpl();
		return bundleDocURL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleUpdateLocation createBundleUpdateLocation() {
		BundleUpdateLocationImpl bundleUpdateLocation = new BundleUpdateLocationImpl();
		return bundleUpdateLocation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleVersion createBundleVersion() {
		BundleVersionImpl bundleVersion = new BundleVersionImpl();
		return bundleVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleActivator createBundleActivator() {
		BundleActivatorImpl bundleActivator = new BundleActivatorImpl();
		return bundleActivator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleClassPath createBundleClassPath() {
		BundleClassPathImpl bundleClassPath = new BundleClassPathImpl();
		return bundleClassPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleNativeCode createBundleNativeCode() {
		BundleNativeCodeImpl bundleNativeCode = new BundleNativeCodeImpl();
		return bundleNativeCode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RequireBundle createRequireBundle() {
		RequireBundleImpl requireBundle = new RequireBundleImpl();
		return requireBundle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ImportService createImportService() {
		ImportServiceImpl importService = new ImportServiceImpl();
		return importService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExportService createExportService() {
		ExportServiceImpl exportService = new ExportServiceImpl();
		return exportService;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ImportPackage createImportPackage() {
		ImportPackageImpl importPackage = new ImportPackageImpl();
		return importPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ExportPackage createExportPackage() {
		ExportPackageImpl exportPackage = new ExportPackageImpl();
		return exportPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleActivationPolicy createBundleActivationPolicy() {
		BundleActivationPolicyImpl bundleActivationPolicy = new BundleActivationPolicyImpl();
		return bundleActivationPolicy;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FragmentHost createFragmentHost() {
		FragmentHostImpl fragmentHost = new FragmentHostImpl();
		return fragmentHost;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicImportPackage createDynamicImportPackage() {
		DynamicImportPackageImpl dynamicImportPackage = new DynamicImportPackageImpl();
		return dynamicImportPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleRequiredExecutionEnvironment createBundleRequiredExecutionEnvironment() {
		BundleRequiredExecutionEnvironmentImpl bundleRequiredExecutionEnvironment = new BundleRequiredExecutionEnvironmentImpl();
		return bundleRequiredExecutionEnvironment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleManifestEntryManyValues createSimpleManifestEntryManyValues() {
		SimpleManifestEntryManyValuesImpl simpleManifestEntryManyValues = new SimpleManifestEntryManyValuesImpl();
		return simpleManifestEntryManyValues;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BundleManifestVersion createBundleManifestVersion() {
		BundleManifestVersionImpl bundleManifestVersion = new BundleManifestVersionImpl();
		return bundleManifestVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ClassPath createClassPath() {
		ClassPathImpl classPath = new ClassPathImpl();
		return classPath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NativeCode createNativeCode() {
		NativeCodeImpl nativeCode = new NativeCodeImpl();
		return nativeCode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public manifest.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MANIFESTVersionEnum createMANIFESTVersionEnumFromString(
			EDataType eDataType, String initialValue) {
		MANIFESTVersionEnum result = MANIFESTVersionEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMANIFESTVersionEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyEnum createPolicyEnumFromString(EDataType eDataType,
			String initialValue) {
		PolicyEnum result = PolicyEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolicyEnumToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType,
			String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createbooleanFromString(EDataType eDataType,
			String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbooleanToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createintFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertintToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestPackage getManifestPackage() {
		return (ManifestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ManifestPackage getPackage() {
		return ManifestPackage.eINSTANCE;
	}

} // ManifestFactoryImpl
