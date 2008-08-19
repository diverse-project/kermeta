/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManifestPackage.java,v 1.6 2008-08-19 07:04:45 edaubert Exp $
 */
package manifest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see manifest.ManifestFactory
 * @model kind="package"
 * @generated
 */
public interface ManifestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "manifest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.osgi.framework/manifest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.osgi.framework.manifest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	ManifestPackage eINSTANCE = manifest.impl.ManifestPackageImpl.init();

	/**
	 * The meta object id for the '{@link manifest.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.ServiceImpl
	 * @see manifest.impl.ManifestPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE__RESOLVED = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SERVICE__INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link manifest.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.VersionImpl
	 * @see manifest.impl.ManifestPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 1;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION__MAJOR = 0;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION__MINOR = 1;

	/**
	 * The feature id for the '<em><b>Micro</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION__MICRO = 2;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VERSION__QUALIFIER = 3;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link manifest.impl.MANIFESTImpl <em>MANIFEST</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.MANIFESTImpl
	 * @see manifest.impl.ManifestPackageImpl#getMANIFEST()
	 * @generated
	 */
	int MANIFEST = 2;

	/**
	 * The feature id for the '<em><b>Bundle Class Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_CLASS_PATHS = 0;

	/**
	 * The feature id for the '<em><b>Bundle Native Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_NATIVE_CODES = 1;

	/**
	 * The feature id for the '<em><b>Bundle Version</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Bundle Required Execution Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS = 3;

	/**
	 * The feature id for the '<em><b>Bundle Activation Policy</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_ACTIVATION_POLICY = 4;

	/**
	 * The feature id for the '<em><b>Bundle Activator</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_ACTIVATOR = 5;

	/**
	 * The feature id for the '<em><b>Require Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__REQUIRE_BUNDLES = 6;

	/**
	 * The feature id for the '<em><b>Import Services</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__IMPORT_SERVICES = 7;

	/**
	 * The feature id for the '<em><b>Export Services</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__EXPORT_SERVICES = 8;

	/**
	 * The feature id for the '<em><b>Bundle Symbolic Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_SYMBOLIC_NAME = 9;

	/**
	 * The feature id for the '<em><b>Bundle Vendor</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_VENDOR = 10;

	/**
	 * The feature id for the '<em><b>Bundle Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_COPYRIGHT = 11;

	/**
	 * The feature id for the '<em><b>Bundle Contact Address</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_CONTACT_ADDRESS = 12;

	/**
	 * The feature id for the '<em><b>Bundle Description</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Bundle Name</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_NAME = 14;

	/**
	 * The feature id for the '<em><b>Bundle Category</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_CATEGORY = 15;

	/**
	 * The feature id for the '<em><b>Bundle Update Location</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_UPDATE_LOCATION = 16;

	/**
	 * The feature id for the '<em><b>Bundle Doc URL</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_DOC_URL = 17;

	/**
	 * The feature id for the '<em><b>Import Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__IMPORT_PACKAGES = 18;

	/**
	 * The feature id for the '<em><b>Bundle Localization</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_LOCALIZATION = 19;

	/**
	 * The feature id for the '<em><b>Fragment Host</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__FRAGMENT_HOST = 20;

	/**
	 * The feature id for the '<em><b>Dynamic Import Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__DYNAMIC_IMPORT_PACKAGES = 21;

	/**
	 * The feature id for the '<em><b>Export Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__EXPORT_PACKAGES = 22;

	/**
	 * The feature id for the '<em><b>Unknown Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__UNKNOWN_ENTRIES = 23;

	/**
	 * The feature id for the '<em><b>Native Code Optional</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__NATIVE_CODE_OPTIONAL = 24;

	/**
	 * The feature id for the '<em><b>Bundle Manifest Version</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST__BUNDLE_MANIFEST_VERSION = 25;

	/**
	 * The number of structural features of the '<em>MANIFEST</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link manifest.impl.MANIFESTEntryImpl <em>MANIFEST Entry</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.MANIFESTEntryImpl
	 * @see manifest.impl.ManifestPackageImpl#getMANIFESTEntry()
	 * @generated
	 */
	int MANIFEST_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ENTRY__ENTRY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ENTRY__OPTIONS = 1;

	/**
	 * The number of structural features of the '<em>MANIFEST Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANIFEST_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link manifest.impl.SimpleMANIFESTEntryImpl <em>Simple MANIFEST Entry</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.SimpleMANIFESTEntryImpl
	 * @see manifest.impl.ManifestPackageImpl#getSimpleMANIFESTEntry()
	 * @generated
	 */
	int SIMPLE_MANIFEST_ENTRY = 4;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MANIFEST_ENTRY__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MANIFEST_ENTRY__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MANIFEST_ENTRY__VALUE = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple MANIFEST Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MANIFEST_ENTRY_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleNameImpl <em>Bundle Name</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleNameImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleName()
	 * @generated
	 */
	int BUNDLE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NAME__ENTRY_NAME = SIMPLE_MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NAME__OPTIONS = SIMPLE_MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NAME__VALUE = SIMPLE_MANIFEST_ENTRY__VALUE;

	/**
	 * The number of structural features of the '<em>Bundle Name</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NAME_FEATURE_COUNT = SIMPLE_MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleSymbolicNameImpl <em>Bundle Symbolic Name</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleSymbolicNameImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleSymbolicName()
	 * @generated
	 */
	int BUNDLE_SYMBOLIC_NAME = 6;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SYMBOLIC_NAME__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SYMBOLIC_NAME__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Symbolic Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SYMBOLIC_NAME__DIRECTIVES = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bundle Symbolic Name</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_SYMBOLIC_NAME_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleDescriptionImpl <em>Bundle Description</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleDescriptionImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleDescription()
	 * @generated
	 */
	int BUNDLE_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_DESCRIPTION__ENTRY_NAME = SIMPLE_MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_DESCRIPTION__OPTIONS = SIMPLE_MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_DESCRIPTION__VALUE = SIMPLE_MANIFEST_ENTRY__VALUE;

	/**
	 * The number of structural features of the '<em>Bundle Description</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_DESCRIPTION_FEATURE_COUNT = SIMPLE_MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleLocalizationImpl <em>Bundle Localization</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleLocalizationImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleLocalization()
	 * @generated
	 */
	int BUNDLE_LOCALIZATION = 8;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LOCALIZATION__ENTRY_NAME = SIMPLE_MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LOCALIZATION__OPTIONS = SIMPLE_MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LOCALIZATION__VALUE = SIMPLE_MANIFEST_ENTRY__VALUE;

	/**
	 * The number of structural features of the '<em>Bundle Localization</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_LOCALIZATION_FEATURE_COUNT = SIMPLE_MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleVendorImpl <em>Bundle Vendor</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleVendorImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleVendor()
	 * @generated
	 */
	int BUNDLE_VENDOR = 9;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VENDOR__ENTRY_NAME = SIMPLE_MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VENDOR__OPTIONS = SIMPLE_MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VENDOR__VALUE = SIMPLE_MANIFEST_ENTRY__VALUE;

	/**
	 * The number of structural features of the '<em>Bundle Vendor</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VENDOR_FEATURE_COUNT = SIMPLE_MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleContactAddressImpl <em>Bundle Contact Address</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleContactAddressImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleContactAddress()
	 * @generated
	 */
	int BUNDLE_CONTACT_ADDRESS = 10;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTACT_ADDRESS__ENTRY_NAME = SIMPLE_MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTACT_ADDRESS__OPTIONS = SIMPLE_MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTACT_ADDRESS__VALUE = SIMPLE_MANIFEST_ENTRY__VALUE;

	/**
	 * The number of structural features of the '<em>Bundle Contact Address</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CONTACT_ADDRESS_FEATURE_COUNT = SIMPLE_MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleCopyrightImpl <em>Bundle Copyright</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleCopyrightImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleCopyright()
	 * @generated
	 */
	int BUNDLE_COPYRIGHT = 11;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_COPYRIGHT__ENTRY_NAME = SIMPLE_MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_COPYRIGHT__OPTIONS = SIMPLE_MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_COPYRIGHT__VALUE = SIMPLE_MANIFEST_ENTRY__VALUE;

	/**
	 * The number of structural features of the '<em>Bundle Copyright</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_COPYRIGHT_FEATURE_COUNT = SIMPLE_MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.SimpleManifestEntryManyValuesImpl <em>Simple Manifest Entry Many Values</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.SimpleManifestEntryManyValuesImpl
	 * @see manifest.impl.ManifestPackageImpl#getSimpleManifestEntryManyValues()
	 * @generated
	 */
	int SIMPLE_MANIFEST_ENTRY_MANY_VALUES = 29;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MANIFEST_ENTRY_MANY_VALUES__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MANIFEST_ENTRY_MANY_VALUES__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Manifest Entry Many Values</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MANIFEST_ENTRY_MANY_VALUES_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleCategoryImpl <em>Bundle Category</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleCategoryImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleCategory()
	 * @generated
	 */
	int BUNDLE_CATEGORY = 12;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY__ENTRY_NAME = SIMPLE_MANIFEST_ENTRY_MANY_VALUES__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY__OPTIONS = SIMPLE_MANIFEST_ENTRY_MANY_VALUES__OPTIONS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY__VALUES = SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES;

	/**
	 * The number of structural features of the '<em>Bundle Category</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CATEGORY_FEATURE_COUNT = SIMPLE_MANIFEST_ENTRY_MANY_VALUES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.URLMANIFESTEntryImpl <em>URLMANIFEST Entry</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.URLMANIFESTEntryImpl
	 * @see manifest.impl.ManifestPackageImpl#getURLMANIFESTEntry()
	 * @generated
	 */
	int URLMANIFEST_ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URLMANIFEST_ENTRY__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URLMANIFEST_ENTRY__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URLMANIFEST_ENTRY__URL = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URLMANIFEST Entry</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URLMANIFEST_ENTRY_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleDocURLImpl <em>Bundle Doc URL</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleDocURLImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleDocURL()
	 * @generated
	 */
	int BUNDLE_DOC_URL = 14;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_DOC_URL__ENTRY_NAME = URLMANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_DOC_URL__OPTIONS = URLMANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_DOC_URL__URL = URLMANIFEST_ENTRY__URL;

	/**
	 * The number of structural features of the '<em>Bundle Doc URL</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_DOC_URL_FEATURE_COUNT = URLMANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleUpdateLocationImpl <em>Bundle Update Location</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleUpdateLocationImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleUpdateLocation()
	 * @generated
	 */
	int BUNDLE_UPDATE_LOCATION = 15;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_UPDATE_LOCATION__ENTRY_NAME = URLMANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_UPDATE_LOCATION__OPTIONS = URLMANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_UPDATE_LOCATION__URL = URLMANIFEST_ENTRY__URL;

	/**
	 * The number of structural features of the '<em>Bundle Update Location</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_UPDATE_LOCATION_FEATURE_COUNT = URLMANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleVersionImpl <em>Bundle Version</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleVersionImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleVersion()
	 * @generated
	 */
	int BUNDLE_VERSION = 16;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VERSION__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VERSION__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VERSION__VERSION = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundle Version</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_VERSION_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleActivatorImpl <em>Bundle Activator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleActivatorImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleActivator()
	 * @generated
	 */
	int BUNDLE_ACTIVATOR = 17;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATOR__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATOR__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATOR__REFERENCE = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATOR__RESOLVED = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activator</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATOR__ACTIVATOR = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bundle Activator</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATOR_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleClassPathImpl <em>Bundle Class Path</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleClassPathImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleClassPath()
	 * @generated
	 */
	int BUNDLE_CLASS_PATH = 18;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CLASS_PATH__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CLASS_PATH__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Class Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CLASS_PATH__CLASS_PATHS = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundle Class Path</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_CLASS_PATH_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleNativeCodeImpl <em>Bundle Native Code</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleNativeCodeImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleNativeCode()
	 * @generated
	 */
	int BUNDLE_NATIVE_CODE = 19;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NATIVE_CODE__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NATIVE_CODE__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NATIVE_CODE__OPTIONAL = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NATIVE_CODE__DIRECTIVES = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Native Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NATIVE_CODE__NATIVE_CODES = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bundle Native Code</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_NATIVE_CODE_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link manifest.impl.RequireBundleImpl <em>Require Bundle</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.RequireBundleImpl
	 * @see manifest.impl.ManifestPackageImpl#getRequireBundle()
	 * @generated
	 */
	int REQUIRE_BUNDLE = 20;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE__DIRECTIVES = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE__RESOLVED = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE__REFERENCE = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE__BUNDLE = MANIFEST_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Require Bundle</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRE_BUNDLE_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link manifest.impl.ImportServiceImpl <em>Import Service</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.ImportServiceImpl
	 * @see manifest.impl.ManifestPackageImpl#getImportService()
	 * @generated
	 */
	int IMPORT_SERVICE = 21;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE__RESOLVED = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Reference</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE__SERVICE_REFERENCE = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE__SERVICE = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Import Service</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_SERVICE_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link manifest.impl.ExportServiceImpl <em>Export Service</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.ExportServiceImpl
	 * @see manifest.impl.ManifestPackageImpl#getExportService()
	 * @generated
	 */
	int EXPORT_SERVICE = 22;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_SERVICE__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_SERVICE__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_SERVICE__SERVICE = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Export Service</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_SERVICE_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link manifest.impl.ImportPackageImpl <em>Import Package</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.ImportPackageImpl
	 * @see manifest.impl.ManifestPackageImpl#getImportPackage()
	 * @generated
	 */
	int IMPORT_PACKAGE = 23;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE__DIRECTIVES = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE__BUNDLE = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE__PACKAGES = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package References</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE__PACKAGE_REFERENCES = MANIFEST_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE__RESOLVED = MANIFEST_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Import Package</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_PACKAGE_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link manifest.impl.ExportPackageImpl <em>Export Package</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.ExportPackageImpl
	 * @see manifest.impl.ManifestPackageImpl#getExportPackage()
	 * @generated
	 */
	int EXPORT_PACKAGE = 24;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXPORT_PACKAGE__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_PACKAGE__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_PACKAGE__DIRECTIVES = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_PACKAGE__PACKAGES = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Export Package</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_PACKAGE_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleActivationPolicyImpl <em>Bundle Activation Policy</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleActivationPolicyImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleActivationPolicy()
	 * @generated
	 */
	int BUNDLE_ACTIVATION_POLICY = 25;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATION_POLICY__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATION_POLICY__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATION_POLICY__POLICY = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATION_POLICY__DIRECTIVES = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bundle Activation Policy</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_ACTIVATION_POLICY_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link manifest.impl.FragmentHostImpl <em>Fragment Host</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.FragmentHostImpl
	 * @see manifest.impl.ManifestPackageImpl#getFragmentHost()
	 * @generated
	 */
	int FRAGMENT_HOST = 26;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Directives</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST__DIRECTIVES = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bundle</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST__BUNDLE = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST__REFERENCE = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST__RESOLVED = MANIFEST_ENTRY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fragment Host</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_HOST_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link manifest.impl.DynamicImportPackageImpl <em>Dynamic Import Package</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.DynamicImportPackageImpl
	 * @see manifest.impl.ManifestPackageImpl#getDynamicImportPackage()
	 * @generated
	 */
	int DYNAMIC_IMPORT_PACKAGE = 27;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_IMPORT_PACKAGE__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_IMPORT_PACKAGE__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_IMPORT_PACKAGE__PACKAGES = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Import Package</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_IMPORT_PACKAGE_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleRequiredExecutionEnvironmentImpl <em>Bundle Required Execution Environment</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleRequiredExecutionEnvironmentImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleRequiredExecutionEnvironment()
	 * @generated
	 */
	int BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT = 28;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__PROFILE = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__CONFIGURATION = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bundle Required Execution Environment</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link manifest.impl.BundleManifestVersionImpl <em>Bundle Manifest Version</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.BundleManifestVersionImpl
	 * @see manifest.impl.ManifestPackageImpl#getBundleManifestVersion()
	 * @generated
	 */
	int BUNDLE_MANIFEST_VERSION = 30;

	/**
	 * The feature id for the '<em><b>Entry Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BUNDLE_MANIFEST_VERSION__ENTRY_NAME = MANIFEST_ENTRY__ENTRY_NAME;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_MANIFEST_VERSION__OPTIONS = MANIFEST_ENTRY__OPTIONS;

	/**
	 * The feature id for the '<em><b>Manifest Version</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_MANIFEST_VERSION__MANIFEST_VERSION = MANIFEST_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bundle Manifest Version</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_MANIFEST_VERSION_FEATURE_COUNT = MANIFEST_ENTRY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link manifest.impl.ClassPathImpl <em>Class Path</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.ClassPathImpl
	 * @see manifest.impl.ManifestPackageImpl#getClassPath()
	 * @generated
	 */
	int CLASS_PATH = 31;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_PATH__RESOLVED = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_PATH__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLASS_PATH__ENTRY = 2;

	/**
	 * The number of structural features of the '<em>Class Path</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_PATH_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link manifest.impl.NativeCodeImpl <em>Native Code</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.NativeCodeImpl
	 * @see manifest.impl.ManifestPackageImpl#getNativeCode()
	 * @generated
	 */
	int NATIVE_CODE = 32;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_CODE__RESOLVED = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_CODE__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NATIVE_CODE__FILE = 2;

	/**
	 * The number of structural features of the '<em>Native Code</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_CODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link manifest.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.impl.PackageImpl
	 * @see manifest.impl.ManifestPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 33;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__RESOLVED = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link manifest.MANIFESTVersionEnum <em>MANIFEST Version Enum</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.MANIFESTVersionEnum
	 * @see manifest.impl.ManifestPackageImpl#getMANIFESTVersionEnum()
	 * @generated
	 */
	int MANIFEST_VERSION_ENUM = 34;

	/**
	 * The meta object id for the '{@link manifest.PolicyEnum <em>Policy Enum</em>}' enum.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see manifest.PolicyEnum
	 * @see manifest.impl.ManifestPackageImpl#getPolicyEnum()
	 * @generated
	 */
	int POLICY_ENUM = 35;

	/**
	 * The meta object id for the '<em>URL</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.net.URL
	 * @see manifest.impl.ManifestPackageImpl#getURL()
	 * @generated
	 */
	int URL = 36;

	/**
	 * The meta object id for the '<em>String</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see java.lang.String
	 * @see manifest.impl.ManifestPackageImpl#getString()
	 * @generated
	 */
	int STRING = 37;

	/**
	 * The meta object id for the '<em>boolean</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see manifest.impl.ManifestPackageImpl#getboolean()
	 * @generated
	 */
	int BOOLEAN = 38;

	/**
	 * The meta object id for the '<em>int</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see manifest.impl.ManifestPackageImpl#getint()
	 * @generated
	 */
	int INT = 39;

	/**
	 * Returns the meta object for class '{@link manifest.Service <em>Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see manifest.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link manifest.Service#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see manifest.Service#getReference()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Reference();

	/**
	 * Returns the meta object for the reference '{@link manifest.Service#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see manifest.Service#getInterface()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Interface();

	/**
	 * Returns the meta object for the attribute '{@link manifest.Service#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.Service#isResolved()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Resolved();

	/**
	 * Returns the meta object for class '{@link manifest.Version <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see manifest.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link manifest.Version#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see manifest.Version#getMajor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Major();

	/**
	 * Returns the meta object for the attribute '{@link manifest.Version#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see manifest.Version#getMinor()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Minor();

	/**
	 * Returns the meta object for the attribute '{@link manifest.Version#getMicro <em>Micro</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Micro</em>'.
	 * @see manifest.Version#getMicro()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Micro();

	/**
	 * Returns the meta object for the attribute '{@link manifest.Version#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see manifest.Version#getQualifier()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Qualifier();

	/**
	 * Returns the meta object for class '{@link manifest.MANIFEST <em>MANIFEST</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>MANIFEST</em>'.
	 * @see manifest.MANIFEST
	 * @generated
	 */
	EClass getMANIFEST();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getBundleClassPaths <em>Bundle Class Paths</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle Class Paths</em>'.
	 * @see manifest.MANIFEST#getBundleClassPaths()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleClassPaths();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getBundleNativeCodes <em>Bundle Native Codes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle Native Codes</em>'.
	 * @see manifest.MANIFEST#getBundleNativeCodes()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleNativeCodes();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleVersion <em>Bundle Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Version</em>'.
	 * @see manifest.MANIFEST#getBundleVersion()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getBundleRequiredExecutionEnvironments <em>Bundle Required Execution Environments</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundle Required Execution Environments</em>'.
	 * @see manifest.MANIFEST#getBundleRequiredExecutionEnvironments()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleRequiredExecutionEnvironments();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleActivationPolicy <em>Bundle Activation Policy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Activation Policy</em>'.
	 * @see manifest.MANIFEST#getBundleActivationPolicy()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleActivationPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleActivator <em>Bundle Activator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Activator</em>'.
	 * @see manifest.MANIFEST#getBundleActivator()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleActivator();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getRequireBundles <em>Require Bundles</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Require Bundles</em>'.
	 * @see manifest.MANIFEST#getRequireBundles()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_RequireBundles();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getImportServices <em>Import Services</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Services</em>'.
	 * @see manifest.MANIFEST#getImportServices()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_ImportServices();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getExportServices <em>Export Services</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Export Services</em>'.
	 * @see manifest.MANIFEST#getExportServices()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_ExportServices();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleSymbolicName <em>Bundle Symbolic Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Symbolic Name</em>'.
	 * @see manifest.MANIFEST#getBundleSymbolicName()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleSymbolicName();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleVendor <em>Bundle Vendor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Vendor</em>'.
	 * @see manifest.MANIFEST#getBundleVendor()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleVendor();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleCopyright <em>Bundle Copyright</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Copyright</em>'.
	 * @see manifest.MANIFEST#getBundleCopyright()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleCopyright();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleContactAddress <em>Bundle Contact Address</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Contact Address</em>'.
	 * @see manifest.MANIFEST#getBundleContactAddress()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleContactAddress();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleDescription <em>Bundle Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Description</em>'.
	 * @see manifest.MANIFEST#getBundleDescription()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleDescription();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleName <em>Bundle Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Name</em>'.
	 * @see manifest.MANIFEST#getBundleName()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleName();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleCategory <em>Bundle Category</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Category</em>'.
	 * @see manifest.MANIFEST#getBundleCategory()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleCategory();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleUpdateLocation <em>Bundle Update Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Update Location</em>'.
	 * @see manifest.MANIFEST#getBundleUpdateLocation()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleUpdateLocation();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleDocURL <em>Bundle Doc URL</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Doc URL</em>'.
	 * @see manifest.MANIFEST#getBundleDocURL()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleDocURL();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getImportPackages <em>Import Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import Packages</em>'.
	 * @see manifest.MANIFEST#getImportPackages()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_ImportPackages();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleLocalization <em>Bundle Localization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Localization</em>'.
	 * @see manifest.MANIFEST#getBundleLocalization()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleLocalization();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getFragmentHost <em>Fragment Host</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fragment Host</em>'.
	 * @see manifest.MANIFEST#getFragmentHost()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_FragmentHost();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getDynamicImportPackages <em>Dynamic Import Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dynamic Import Packages</em>'.
	 * @see manifest.MANIFEST#getDynamicImportPackages()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_DynamicImportPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getExportPackages <em>Export Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Export Packages</em>'.
	 * @see manifest.MANIFEST#getExportPackages()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_ExportPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFEST#getUnknownEntries <em>Unknown Entries</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unknown Entries</em>'.
	 * @see manifest.MANIFEST#getUnknownEntries()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_UnknownEntries();

	/**
	 * Returns the meta object for the attribute '{@link manifest.MANIFEST#isNativeCodeOptional <em>Native Code Optional</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native Code Optional</em>'.
	 * @see manifest.MANIFEST#isNativeCodeOptional()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EAttribute getMANIFEST_NativeCodeOptional();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.MANIFEST#getBundleManifestVersion <em>Bundle Manifest Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundle Manifest Version</em>'.
	 * @see manifest.MANIFEST#getBundleManifestVersion()
	 * @see #getMANIFEST()
	 * @generated
	 */
	EReference getMANIFEST_BundleManifestVersion();

	/**
	 * Returns the meta object for class '{@link manifest.MANIFESTEntry <em>MANIFEST Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>MANIFEST Entry</em>'.
	 * @see manifest.MANIFESTEntry
	 * @generated
	 */
	EClass getMANIFESTEntry();

	/**
	 * Returns the meta object for the attribute '{@link manifest.MANIFESTEntry#getEntryName <em>Entry Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entry Name</em>'.
	 * @see manifest.MANIFESTEntry#getEntryName()
	 * @see #getMANIFESTEntry()
	 * @generated
	 */
	EAttribute getMANIFESTEntry_EntryName();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.MANIFESTEntry#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see manifest.MANIFESTEntry#getOptions()
	 * @see #getMANIFESTEntry()
	 * @generated
	 */
	EReference getMANIFESTEntry_Options();

	/**
	 * Returns the meta object for class '{@link manifest.SimpleMANIFESTEntry <em>Simple MANIFEST Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple MANIFEST Entry</em>'.
	 * @see manifest.SimpleMANIFESTEntry
	 * @generated
	 */
	EClass getSimpleMANIFESTEntry();

	/**
	 * Returns the meta object for the attribute '{@link manifest.SimpleMANIFESTEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see manifest.SimpleMANIFESTEntry#getValue()
	 * @see #getSimpleMANIFESTEntry()
	 * @generated
	 */
	EAttribute getSimpleMANIFESTEntry_Value();

	/**
	 * Returns the meta object for class '{@link manifest.BundleName <em>Bundle Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Name</em>'.
	 * @see manifest.BundleName
	 * @generated
	 */
	EClass getBundleName();

	/**
	 * Returns the meta object for class '{@link manifest.BundleSymbolicName <em>Bundle Symbolic Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Symbolic Name</em>'.
	 * @see manifest.BundleSymbolicName
	 * @generated
	 */
	EClass getBundleSymbolicName();

	/**
	 * Returns the meta object for the attribute '{@link manifest.BundleSymbolicName#getSymbolicName <em>Symbolic Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbolic Name</em>'.
	 * @see manifest.BundleSymbolicName#getSymbolicName()
	 * @see #getBundleSymbolicName()
	 * @generated
	 */
	EAttribute getBundleSymbolicName_SymbolicName();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.BundleSymbolicName#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see manifest.BundleSymbolicName#getDirectives()
	 * @see #getBundleSymbolicName()
	 * @generated
	 */
	EReference getBundleSymbolicName_Directives();

	/**
	 * Returns the meta object for class '{@link manifest.BundleDescription <em>Bundle Description</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Description</em>'.
	 * @see manifest.BundleDescription
	 * @generated
	 */
	EClass getBundleDescription();

	/**
	 * Returns the meta object for class '{@link manifest.BundleLocalization <em>Bundle Localization</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Localization</em>'.
	 * @see manifest.BundleLocalization
	 * @generated
	 */
	EClass getBundleLocalization();

	/**
	 * Returns the meta object for class '{@link manifest.BundleVendor <em>Bundle Vendor</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Vendor</em>'.
	 * @see manifest.BundleVendor
	 * @generated
	 */
	EClass getBundleVendor();

	/**
	 * Returns the meta object for class '{@link manifest.BundleContactAddress <em>Bundle Contact Address</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Contact Address</em>'.
	 * @see manifest.BundleContactAddress
	 * @generated
	 */
	EClass getBundleContactAddress();

	/**
	 * Returns the meta object for class '{@link manifest.BundleCopyright <em>Bundle Copyright</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Copyright</em>'.
	 * @see manifest.BundleCopyright
	 * @generated
	 */
	EClass getBundleCopyright();

	/**
	 * Returns the meta object for class '{@link manifest.BundleCategory <em>Bundle Category</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Category</em>'.
	 * @see manifest.BundleCategory
	 * @generated
	 */
	EClass getBundleCategory();

	/**
	 * Returns the meta object for class '{@link manifest.URLMANIFESTEntry <em>URLMANIFEST Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>URLMANIFEST Entry</em>'.
	 * @see manifest.URLMANIFESTEntry
	 * @generated
	 */
	EClass getURLMANIFESTEntry();

	/**
	 * Returns the meta object for the attribute '{@link manifest.URLMANIFESTEntry#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see manifest.URLMANIFESTEntry#getUrl()
	 * @see #getURLMANIFESTEntry()
	 * @generated
	 */
	EAttribute getURLMANIFESTEntry_Url();

	/**
	 * Returns the meta object for class '{@link manifest.BundleDocURL <em>Bundle Doc URL</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Doc URL</em>'.
	 * @see manifest.BundleDocURL
	 * @generated
	 */
	EClass getBundleDocURL();

	/**
	 * Returns the meta object for class '{@link manifest.BundleUpdateLocation <em>Bundle Update Location</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Update Location</em>'.
	 * @see manifest.BundleUpdateLocation
	 * @generated
	 */
	EClass getBundleUpdateLocation();

	/**
	 * Returns the meta object for class '{@link manifest.BundleVersion <em>Bundle Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Version</em>'.
	 * @see manifest.BundleVersion
	 * @generated
	 */
	EClass getBundleVersion();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.BundleVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see manifest.BundleVersion#getVersion()
	 * @see #getBundleVersion()
	 * @generated
	 */
	EReference getBundleVersion_Version();

	/**
	 * Returns the meta object for class '{@link manifest.BundleActivator <em>Bundle Activator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Activator</em>'.
	 * @see manifest.BundleActivator
	 * @generated
	 */
	EClass getBundleActivator();

	/**
	 * Returns the meta object for the attribute '{@link manifest.BundleActivator#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see manifest.BundleActivator#getReference()
	 * @see #getBundleActivator()
	 * @generated
	 */
	EAttribute getBundleActivator_Reference();

	/**
	 * Returns the meta object for the attribute '{@link manifest.BundleActivator#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.BundleActivator#isResolved()
	 * @see #getBundleActivator()
	 * @generated
	 */
	EAttribute getBundleActivator_Resolved();

	/**
	 * Returns the meta object for the reference '{@link manifest.BundleActivator#getActivator <em>Activator</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activator</em>'.
	 * @see manifest.BundleActivator#getActivator()
	 * @see #getBundleActivator()
	 * @generated
	 */
	EReference getBundleActivator_Activator();

	/**
	 * Returns the meta object for class '{@link manifest.BundleClassPath <em>Bundle Class Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Class Path</em>'.
	 * @see manifest.BundleClassPath
	 * @generated
	 */
	EClass getBundleClassPath();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.BundleClassPath#getClassPaths <em>Class Paths</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Paths</em>'.
	 * @see manifest.BundleClassPath#getClassPaths()
	 * @see #getBundleClassPath()
	 * @generated
	 */
	EReference getBundleClassPath_ClassPaths();

	/**
	 * Returns the meta object for class '{@link manifest.BundleNativeCode <em>Bundle Native Code</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Native Code</em>'.
	 * @see manifest.BundleNativeCode
	 * @generated
	 */
	EClass getBundleNativeCode();

	/**
	 * Returns the meta object for the attribute '{@link manifest.BundleNativeCode#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see manifest.BundleNativeCode#isOptional()
	 * @see #getBundleNativeCode()
	 * @generated
	 */
	EAttribute getBundleNativeCode_Optional();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.BundleNativeCode#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see manifest.BundleNativeCode#getDirectives()
	 * @see #getBundleNativeCode()
	 * @generated
	 */
	EReference getBundleNativeCode_Directives();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.BundleNativeCode#getNativeCodes <em>Native Codes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Native Codes</em>'.
	 * @see manifest.BundleNativeCode#getNativeCodes()
	 * @see #getBundleNativeCode()
	 * @generated
	 */
	EReference getBundleNativeCode_NativeCodes();

	/**
	 * Returns the meta object for class '{@link manifest.RequireBundle <em>Require Bundle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Require Bundle</em>'.
	 * @see manifest.RequireBundle
	 * @generated
	 */
	EClass getRequireBundle();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.RequireBundle#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see manifest.RequireBundle#getDirectives()
	 * @see #getRequireBundle()
	 * @generated
	 */
	EReference getRequireBundle_Directives();

	/**
	 * Returns the meta object for the attribute '{@link manifest.RequireBundle#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.RequireBundle#isResolved()
	 * @see #getRequireBundle()
	 * @generated
	 */
	EAttribute getRequireBundle_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link manifest.RequireBundle#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see manifest.RequireBundle#getReference()
	 * @see #getRequireBundle()
	 * @generated
	 */
	EAttribute getRequireBundle_Reference();

	/**
	 * Returns the meta object for the reference '{@link manifest.RequireBundle#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle</em>'.
	 * @see manifest.RequireBundle#getBundle()
	 * @see #getRequireBundle()
	 * @generated
	 */
	EReference getRequireBundle_Bundle();

	/**
	 * Returns the meta object for class '{@link manifest.ImportService <em>Import Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Service</em>'.
	 * @see manifest.ImportService
	 * @generated
	 */
	EClass getImportService();

	/**
	 * Returns the meta object for the attribute '{@link manifest.ImportService#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.ImportService#isResolved()
	 * @see #getImportService()
	 * @generated
	 */
	EAttribute getImportService_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link manifest.ImportService#getServiceReference <em>Service Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Reference</em>'.
	 * @see manifest.ImportService#getServiceReference()
	 * @see #getImportService()
	 * @generated
	 */
	EAttribute getImportService_ServiceReference();

	/**
	 * Returns the meta object for the reference '{@link manifest.ImportService#getService <em>Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see manifest.ImportService#getService()
	 * @see #getImportService()
	 * @generated
	 */
	EReference getImportService_Service();

	/**
	 * Returns the meta object for class '{@link manifest.ExportService <em>Export Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Service</em>'.
	 * @see manifest.ExportService
	 * @generated
	 */
	EClass getExportService();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.ExportService#getService <em>Service</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see manifest.ExportService#getService()
	 * @see #getExportService()
	 * @generated
	 */
	EReference getExportService_Service();

	/**
	 * Returns the meta object for class '{@link manifest.ImportPackage <em>Import Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Package</em>'.
	 * @see manifest.ImportPackage
	 * @generated
	 */
	EClass getImportPackage();

	/**
	 * Returns the meta object for the reference list '{@link manifest.ImportPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packages</em>'.
	 * @see manifest.ImportPackage#getPackages()
	 * @see #getImportPackage()
	 * @generated
	 */
	EReference getImportPackage_Packages();

	/**
	 * Returns the meta object for the attribute list '{@link manifest.ImportPackage#getPackageReferences <em>Package References</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Package References</em>'.
	 * @see manifest.ImportPackage#getPackageReferences()
	 * @see #getImportPackage()
	 * @generated
	 */
	EAttribute getImportPackage_PackageReferences();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.ImportPackage#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Directives</em>'.
	 * @see manifest.ImportPackage#getDirectives()
	 * @see #getImportPackage()
	 * @generated
	 */
	EReference getImportPackage_Directives();

	/**
	 * Returns the meta object for the reference '{@link manifest.ImportPackage#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle</em>'.
	 * @see manifest.ImportPackage#getBundle()
	 * @see #getImportPackage()
	 * @generated
	 */
	EReference getImportPackage_Bundle();

	/**
	 * Returns the meta object for the attribute '{@link manifest.ImportPackage#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.ImportPackage#isResolved()
	 * @see #getImportPackage()
	 * @generated
	 */
	EAttribute getImportPackage_Resolved();

	/**
	 * Returns the meta object for class '{@link manifest.ExportPackage <em>Export Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Package</em>'.
	 * @see manifest.ExportPackage
	 * @generated
	 */
	EClass getExportPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.ExportPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see manifest.ExportPackage#getPackages()
	 * @see #getExportPackage()
	 * @generated
	 */
	EReference getExportPackage_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.ExportPackage#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see manifest.ExportPackage#getDirectives()
	 * @see #getExportPackage()
	 * @generated
	 */
	EReference getExportPackage_Directives();

	/**
	 * Returns the meta object for class '{@link manifest.BundleActivationPolicy <em>Bundle Activation Policy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Activation Policy</em>'.
	 * @see manifest.BundleActivationPolicy
	 * @generated
	 */
	EClass getBundleActivationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link manifest.BundleActivationPolicy#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see manifest.BundleActivationPolicy#getPolicy()
	 * @see #getBundleActivationPolicy()
	 * @generated
	 */
	EAttribute getBundleActivationPolicy_Policy();

	/**
	 * Returns the meta object for the containment reference list '{@link manifest.BundleActivationPolicy#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directives</em>'.
	 * @see manifest.BundleActivationPolicy#getDirectives()
	 * @see #getBundleActivationPolicy()
	 * @generated
	 */
	EReference getBundleActivationPolicy_Directives();

	/**
	 * Returns the meta object for class '{@link manifest.FragmentHost <em>Fragment Host</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment Host</em>'.
	 * @see manifest.FragmentHost
	 * @generated
	 */
	EClass getFragmentHost();

	/**
	 * Returns the meta object for the containment reference '{@link manifest.FragmentHost#getDirectives <em>Directives</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Directives</em>'.
	 * @see manifest.FragmentHost#getDirectives()
	 * @see #getFragmentHost()
	 * @generated
	 */
	EReference getFragmentHost_Directives();

	/**
	 * Returns the meta object for the reference '{@link manifest.FragmentHost#getBundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bundle</em>'.
	 * @see manifest.FragmentHost#getBundle()
	 * @see #getFragmentHost()
	 * @generated
	 */
	EReference getFragmentHost_Bundle();

	/**
	 * Returns the meta object for the attribute '{@link manifest.FragmentHost#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see manifest.FragmentHost#getReference()
	 * @see #getFragmentHost()
	 * @generated
	 */
	EAttribute getFragmentHost_Reference();

	/**
	 * Returns the meta object for the attribute '{@link manifest.FragmentHost#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.FragmentHost#isResolved()
	 * @see #getFragmentHost()
	 * @generated
	 */
	EAttribute getFragmentHost_Resolved();

	/**
	 * Returns the meta object for class '{@link manifest.DynamicImportPackage <em>Dynamic Import Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Import Package</em>'.
	 * @see manifest.DynamicImportPackage
	 * @generated
	 */
	EClass getDynamicImportPackage();

	/**
	 * Returns the meta object for the attribute list '{@link manifest.DynamicImportPackage#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Packages</em>'.
	 * @see manifest.DynamicImportPackage#getPackages()
	 * @see #getDynamicImportPackage()
	 * @generated
	 */
	EAttribute getDynamicImportPackage_Packages();

	/**
	 * Returns the meta object for class '{@link manifest.BundleRequiredExecutionEnvironment <em>Bundle Required Execution Environment</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Required Execution Environment</em>'.
	 * @see manifest.BundleRequiredExecutionEnvironment
	 * @generated
	 */
	EClass getBundleRequiredExecutionEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link manifest.BundleRequiredExecutionEnvironment#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile</em>'.
	 * @see manifest.BundleRequiredExecutionEnvironment#getProfile()
	 * @see #getBundleRequiredExecutionEnvironment()
	 * @generated
	 */
	EAttribute getBundleRequiredExecutionEnvironment_Profile();

	/**
	 * Returns the meta object for the attribute '{@link manifest.BundleRequiredExecutionEnvironment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration</em>'.
	 * @see manifest.BundleRequiredExecutionEnvironment#getConfiguration()
	 * @see #getBundleRequiredExecutionEnvironment()
	 * @generated
	 */
	EAttribute getBundleRequiredExecutionEnvironment_Configuration();

	/**
	 * Returns the meta object for class '{@link manifest.SimpleManifestEntryManyValues <em>Simple Manifest Entry Many Values</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Manifest Entry Many Values</em>'.
	 * @see manifest.SimpleManifestEntryManyValues
	 * @generated
	 */
	EClass getSimpleManifestEntryManyValues();

	/**
	 * Returns the meta object for the attribute list '{@link manifest.SimpleManifestEntryManyValues#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see manifest.SimpleManifestEntryManyValues#getValues()
	 * @see #getSimpleManifestEntryManyValues()
	 * @generated
	 */
	EAttribute getSimpleManifestEntryManyValues_Values();

	/**
	 * Returns the meta object for class '{@link manifest.BundleManifestVersion <em>Bundle Manifest Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle Manifest Version</em>'.
	 * @see manifest.BundleManifestVersion
	 * @generated
	 */
	EClass getBundleManifestVersion();

	/**
	 * Returns the meta object for the attribute '{@link manifest.BundleManifestVersion#getManifestVersion <em>Manifest Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manifest Version</em>'.
	 * @see manifest.BundleManifestVersion#getManifestVersion()
	 * @see #getBundleManifestVersion()
	 * @generated
	 */
	EAttribute getBundleManifestVersion_ManifestVersion();

	/**
	 * Returns the meta object for class '{@link manifest.ClassPath <em>Class Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Path</em>'.
	 * @see manifest.ClassPath
	 * @generated
	 */
	EClass getClassPath();

	/**
	 * Returns the meta object for the attribute '{@link manifest.ClassPath#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.ClassPath#isResolved()
	 * @see #getClassPath()
	 * @generated
	 */
	EAttribute getClassPath_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link manifest.ClassPath#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see manifest.ClassPath#getReference()
	 * @see #getClassPath()
	 * @generated
	 */
	EAttribute getClassPath_Reference();

	/**
	 * Returns the meta object for the reference '{@link manifest.ClassPath#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry</em>'.
	 * @see manifest.ClassPath#getEntry()
	 * @see #getClassPath()
	 * @generated
	 */
	EReference getClassPath_Entry();

	/**
	 * Returns the meta object for class '{@link manifest.NativeCode <em>Native Code</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Code</em>'.
	 * @see manifest.NativeCode
	 * @generated
	 */
	EClass getNativeCode();

	/**
	 * Returns the meta object for the attribute '{@link manifest.NativeCode#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.NativeCode#isResolved()
	 * @see #getNativeCode()
	 * @generated
	 */
	EAttribute getNativeCode_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link manifest.NativeCode#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see manifest.NativeCode#getReference()
	 * @see #getNativeCode()
	 * @generated
	 */
	EAttribute getNativeCode_Reference();

	/**
	 * Returns the meta object for the reference '{@link manifest.NativeCode#getFile <em>File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see manifest.NativeCode#getFile()
	 * @see #getNativeCode()
	 * @generated
	 */
	EReference getNativeCode_File();

	/**
	 * Returns the meta object for class '{@link manifest.Package <em>Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see manifest.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link manifest.Package#isResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see manifest.Package#isResolved()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link manifest.Package#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see manifest.Package#getReference()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Reference();

	/**
	 * Returns the meta object for the reference '{@link manifest.Package#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see manifest.Package#getPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Package();

	/**
	 * Returns the meta object for enum '{@link manifest.MANIFESTVersionEnum <em>MANIFEST Version Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MANIFEST Version Enum</em>'.
	 * @see manifest.MANIFESTVersionEnum
	 * @generated
	 */
	EEnum getMANIFESTVersionEnum();

	/**
	 * Returns the meta object for enum '{@link manifest.PolicyEnum <em>Policy Enum</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Policy Enum</em>'.
	 * @see manifest.PolicyEnum
	 * @generated
	 */
	EEnum getPolicyEnum();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '<em>boolean</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getboolean();

	/**
	 * Returns the meta object for data type '<em>int</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for data type '<em>int</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getint();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ManifestFactory getManifestFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link manifest.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.ServiceImpl
		 * @see manifest.impl.ManifestPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__REFERENCE = eINSTANCE.getService_Reference();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INTERFACE = eINSTANCE.getService_Interface();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__RESOLVED = eINSTANCE.getService_Resolved();

		/**
		 * The meta object literal for the '{@link manifest.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.VersionImpl
		 * @see manifest.impl.ManifestPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MAJOR = eINSTANCE.getVersion_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MINOR = eINSTANCE.getVersion_Minor();

		/**
		 * The meta object literal for the '<em><b>Micro</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__MICRO = eINSTANCE.getVersion_Micro();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__QUALIFIER = eINSTANCE.getVersion_Qualifier();

		/**
		 * The meta object literal for the '{@link manifest.impl.MANIFESTImpl <em>MANIFEST</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.MANIFESTImpl
		 * @see manifest.impl.ManifestPackageImpl#getMANIFEST()
		 * @generated
		 */
		EClass MANIFEST = eINSTANCE.getMANIFEST();

		/**
		 * The meta object literal for the '<em><b>Bundle Class Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_CLASS_PATHS = eINSTANCE.getMANIFEST_BundleClassPaths();

		/**
		 * The meta object literal for the '<em><b>Bundle Native Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_NATIVE_CODES = eINSTANCE.getMANIFEST_BundleNativeCodes();

		/**
		 * The meta object literal for the '<em><b>Bundle Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_VERSION = eINSTANCE.getMANIFEST_BundleVersion();

		/**
		 * The meta object literal for the '<em><b>Bundle Required Execution Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_REQUIRED_EXECUTION_ENVIRONMENTS = eINSTANCE.getMANIFEST_BundleRequiredExecutionEnvironments();

		/**
		 * The meta object literal for the '<em><b>Bundle Activation Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_ACTIVATION_POLICY = eINSTANCE.getMANIFEST_BundleActivationPolicy();

		/**
		 * The meta object literal for the '<em><b>Bundle Activator</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_ACTIVATOR = eINSTANCE.getMANIFEST_BundleActivator();

		/**
		 * The meta object literal for the '<em><b>Require Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__REQUIRE_BUNDLES = eINSTANCE.getMANIFEST_RequireBundles();

		/**
		 * The meta object literal for the '<em><b>Import Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__IMPORT_SERVICES = eINSTANCE.getMANIFEST_ImportServices();

		/**
		 * The meta object literal for the '<em><b>Export Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__EXPORT_SERVICES = eINSTANCE.getMANIFEST_ExportServices();

		/**
		 * The meta object literal for the '<em><b>Bundle Symbolic Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_SYMBOLIC_NAME = eINSTANCE.getMANIFEST_BundleSymbolicName();

		/**
		 * The meta object literal for the '<em><b>Bundle Vendor</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_VENDOR = eINSTANCE.getMANIFEST_BundleVendor();

		/**
		 * The meta object literal for the '<em><b>Bundle Copyright</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_COPYRIGHT = eINSTANCE.getMANIFEST_BundleCopyright();

		/**
		 * The meta object literal for the '<em><b>Bundle Contact Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_CONTACT_ADDRESS = eINSTANCE.getMANIFEST_BundleContactAddress();

		/**
		 * The meta object literal for the '<em><b>Bundle Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_DESCRIPTION = eINSTANCE.getMANIFEST_BundleDescription();

		/**
		 * The meta object literal for the '<em><b>Bundle Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_NAME = eINSTANCE.getMANIFEST_BundleName();

		/**
		 * The meta object literal for the '<em><b>Bundle Category</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_CATEGORY = eINSTANCE.getMANIFEST_BundleCategory();

		/**
		 * The meta object literal for the '<em><b>Bundle Update Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_UPDATE_LOCATION = eINSTANCE.getMANIFEST_BundleUpdateLocation();

		/**
		 * The meta object literal for the '<em><b>Bundle Doc URL</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_DOC_URL = eINSTANCE.getMANIFEST_BundleDocURL();

		/**
		 * The meta object literal for the '<em><b>Import Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__IMPORT_PACKAGES = eINSTANCE.getMANIFEST_ImportPackages();

		/**
		 * The meta object literal for the '<em><b>Bundle Localization</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_LOCALIZATION = eINSTANCE.getMANIFEST_BundleLocalization();

		/**
		 * The meta object literal for the '<em><b>Fragment Host</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__FRAGMENT_HOST = eINSTANCE.getMANIFEST_FragmentHost();

		/**
		 * The meta object literal for the '<em><b>Dynamic Import Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__DYNAMIC_IMPORT_PACKAGES = eINSTANCE.getMANIFEST_DynamicImportPackages();

		/**
		 * The meta object literal for the '<em><b>Export Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__EXPORT_PACKAGES = eINSTANCE.getMANIFEST_ExportPackages();

		/**
		 * The meta object literal for the '<em><b>Unknown Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__UNKNOWN_ENTRIES = eINSTANCE.getMANIFEST_UnknownEntries();

		/**
		 * The meta object literal for the '<em><b>Native Code Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST__NATIVE_CODE_OPTIONAL = eINSTANCE.getMANIFEST_NativeCodeOptional();

		/**
		 * The meta object literal for the '<em><b>Bundle Manifest Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST__BUNDLE_MANIFEST_VERSION = eINSTANCE.getMANIFEST_BundleManifestVersion();

		/**
		 * The meta object literal for the '{@link manifest.impl.MANIFESTEntryImpl <em>MANIFEST Entry</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.MANIFESTEntryImpl
		 * @see manifest.impl.ManifestPackageImpl#getMANIFESTEntry()
		 * @generated
		 */
		EClass MANIFEST_ENTRY = eINSTANCE.getMANIFESTEntry();

		/**
		 * The meta object literal for the '<em><b>Entry Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANIFEST_ENTRY__ENTRY_NAME = eINSTANCE.getMANIFESTEntry_EntryName();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MANIFEST_ENTRY__OPTIONS = eINSTANCE.getMANIFESTEntry_Options();

		/**
		 * The meta object literal for the '{@link manifest.impl.SimpleMANIFESTEntryImpl <em>Simple MANIFEST Entry</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.SimpleMANIFESTEntryImpl
		 * @see manifest.impl.ManifestPackageImpl#getSimpleMANIFESTEntry()
		 * @generated
		 */
		EClass SIMPLE_MANIFEST_ENTRY = eINSTANCE.getSimpleMANIFESTEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_MANIFEST_ENTRY__VALUE = eINSTANCE.getSimpleMANIFESTEntry_Value();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleNameImpl <em>Bundle Name</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleNameImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleName()
		 * @generated
		 */
		EClass BUNDLE_NAME = eINSTANCE.getBundleName();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleSymbolicNameImpl <em>Bundle Symbolic Name</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleSymbolicNameImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleSymbolicName()
		 * @generated
		 */
		EClass BUNDLE_SYMBOLIC_NAME = eINSTANCE.getBundleSymbolicName();

		/**
		 * The meta object literal for the '<em><b>Symbolic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_SYMBOLIC_NAME__SYMBOLIC_NAME = eINSTANCE.getBundleSymbolicName_SymbolicName();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_SYMBOLIC_NAME__DIRECTIVES = eINSTANCE.getBundleSymbolicName_Directives();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleDescriptionImpl <em>Bundle Description</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleDescriptionImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleDescription()
		 * @generated
		 */
		EClass BUNDLE_DESCRIPTION = eINSTANCE.getBundleDescription();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleLocalizationImpl <em>Bundle Localization</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleLocalizationImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleLocalization()
		 * @generated
		 */
		EClass BUNDLE_LOCALIZATION = eINSTANCE.getBundleLocalization();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleVendorImpl <em>Bundle Vendor</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleVendorImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleVendor()
		 * @generated
		 */
		EClass BUNDLE_VENDOR = eINSTANCE.getBundleVendor();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleContactAddressImpl <em>Bundle Contact Address</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleContactAddressImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleContactAddress()
		 * @generated
		 */
		EClass BUNDLE_CONTACT_ADDRESS = eINSTANCE.getBundleContactAddress();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleCopyrightImpl <em>Bundle Copyright</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleCopyrightImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleCopyright()
		 * @generated
		 */
		EClass BUNDLE_COPYRIGHT = eINSTANCE.getBundleCopyright();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleCategoryImpl <em>Bundle Category</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleCategoryImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleCategory()
		 * @generated
		 */
		EClass BUNDLE_CATEGORY = eINSTANCE.getBundleCategory();

		/**
		 * The meta object literal for the '{@link manifest.impl.URLMANIFESTEntryImpl <em>URLMANIFEST Entry</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.URLMANIFESTEntryImpl
		 * @see manifest.impl.ManifestPackageImpl#getURLMANIFESTEntry()
		 * @generated
		 */
		EClass URLMANIFEST_ENTRY = eINSTANCE.getURLMANIFESTEntry();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URLMANIFEST_ENTRY__URL = eINSTANCE.getURLMANIFESTEntry_Url();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleDocURLImpl <em>Bundle Doc URL</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleDocURLImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleDocURL()
		 * @generated
		 */
		EClass BUNDLE_DOC_URL = eINSTANCE.getBundleDocURL();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleUpdateLocationImpl <em>Bundle Update Location</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleUpdateLocationImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleUpdateLocation()
		 * @generated
		 */
		EClass BUNDLE_UPDATE_LOCATION = eINSTANCE.getBundleUpdateLocation();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleVersionImpl <em>Bundle Version</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleVersionImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleVersion()
		 * @generated
		 */
		EClass BUNDLE_VERSION = eINSTANCE.getBundleVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_VERSION__VERSION = eINSTANCE.getBundleVersion_Version();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleActivatorImpl <em>Bundle Activator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleActivatorImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleActivator()
		 * @generated
		 */
		EClass BUNDLE_ACTIVATOR = eINSTANCE.getBundleActivator();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_ACTIVATOR__REFERENCE = eINSTANCE.getBundleActivator_Reference();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_ACTIVATOR__RESOLVED = eINSTANCE.getBundleActivator_Resolved();

		/**
		 * The meta object literal for the '<em><b>Activator</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_ACTIVATOR__ACTIVATOR = eINSTANCE.getBundleActivator_Activator();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleClassPathImpl <em>Bundle Class Path</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleClassPathImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleClassPath()
		 * @generated
		 */
		EClass BUNDLE_CLASS_PATH = eINSTANCE.getBundleClassPath();

		/**
		 * The meta object literal for the '<em><b>Class Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_CLASS_PATH__CLASS_PATHS = eINSTANCE.getBundleClassPath_ClassPaths();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleNativeCodeImpl <em>Bundle Native Code</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleNativeCodeImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleNativeCode()
		 * @generated
		 */
		EClass BUNDLE_NATIVE_CODE = eINSTANCE.getBundleNativeCode();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_NATIVE_CODE__OPTIONAL = eINSTANCE.getBundleNativeCode_Optional();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_NATIVE_CODE__DIRECTIVES = eINSTANCE.getBundleNativeCode_Directives();

		/**
		 * The meta object literal for the '<em><b>Native Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_NATIVE_CODE__NATIVE_CODES = eINSTANCE.getBundleNativeCode_NativeCodes();

		/**
		 * The meta object literal for the '{@link manifest.impl.RequireBundleImpl <em>Require Bundle</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.RequireBundleImpl
		 * @see manifest.impl.ManifestPackageImpl#getRequireBundle()
		 * @generated
		 */
		EClass REQUIRE_BUNDLE = eINSTANCE.getRequireBundle();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_BUNDLE__DIRECTIVES = eINSTANCE.getRequireBundle_Directives();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE_BUNDLE__RESOLVED = eINSTANCE.getRequireBundle_Resolved();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRE_BUNDLE__REFERENCE = eINSTANCE.getRequireBundle_Reference();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRE_BUNDLE__BUNDLE = eINSTANCE.getRequireBundle_Bundle();

		/**
		 * The meta object literal for the '{@link manifest.impl.ImportServiceImpl <em>Import Service</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.ImportServiceImpl
		 * @see manifest.impl.ManifestPackageImpl#getImportService()
		 * @generated
		 */
		EClass IMPORT_SERVICE = eINSTANCE.getImportService();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_SERVICE__RESOLVED = eINSTANCE.getImportService_Resolved();

		/**
		 * The meta object literal for the '<em><b>Service Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_SERVICE__SERVICE_REFERENCE = eINSTANCE.getImportService_ServiceReference();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_SERVICE__SERVICE = eINSTANCE.getImportService_Service();

		/**
		 * The meta object literal for the '{@link manifest.impl.ExportServiceImpl <em>Export Service</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.ExportServiceImpl
		 * @see manifest.impl.ManifestPackageImpl#getExportService()
		 * @generated
		 */
		EClass EXPORT_SERVICE = eINSTANCE.getExportService();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_SERVICE__SERVICE = eINSTANCE.getExportService_Service();

		/**
		 * The meta object literal for the '{@link manifest.impl.ImportPackageImpl <em>Import Package</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.ImportPackageImpl
		 * @see manifest.impl.ManifestPackageImpl#getImportPackage()
		 * @generated
		 */
		EClass IMPORT_PACKAGE = eINSTANCE.getImportPackage();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_PACKAGE__PACKAGES = eINSTANCE.getImportPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Package References</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_PACKAGE__PACKAGE_REFERENCES = eINSTANCE.getImportPackage_PackageReferences();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_PACKAGE__DIRECTIVES = eINSTANCE.getImportPackage_Directives();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_PACKAGE__BUNDLE = eINSTANCE.getImportPackage_Bundle();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_PACKAGE__RESOLVED = eINSTANCE.getImportPackage_Resolved();

		/**
		 * The meta object literal for the '{@link manifest.impl.ExportPackageImpl <em>Export Package</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.ExportPackageImpl
		 * @see manifest.impl.ManifestPackageImpl#getExportPackage()
		 * @generated
		 */
		EClass EXPORT_PACKAGE = eINSTANCE.getExportPackage();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_PACKAGE__PACKAGES = eINSTANCE.getExportPackage_Packages();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EXPORT_PACKAGE__DIRECTIVES = eINSTANCE.getExportPackage_Directives();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleActivationPolicyImpl <em>Bundle Activation Policy</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleActivationPolicyImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleActivationPolicy()
		 * @generated
		 */
		EClass BUNDLE_ACTIVATION_POLICY = eINSTANCE.getBundleActivationPolicy();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_ACTIVATION_POLICY__POLICY = eINSTANCE.getBundleActivationPolicy_Policy();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference BUNDLE_ACTIVATION_POLICY__DIRECTIVES = eINSTANCE.getBundleActivationPolicy_Directives();

		/**
		 * The meta object literal for the '{@link manifest.impl.FragmentHostImpl <em>Fragment Host</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.FragmentHostImpl
		 * @see manifest.impl.ManifestPackageImpl#getFragmentHost()
		 * @generated
		 */
		EClass FRAGMENT_HOST = eINSTANCE.getFragmentHost();

		/**
		 * The meta object literal for the '<em><b>Directives</b></em>' containment reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_HOST__DIRECTIVES = eINSTANCE.getFragmentHost_Directives();

		/**
		 * The meta object literal for the '<em><b>Bundle</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT_HOST__BUNDLE = eINSTANCE.getFragmentHost_Bundle();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_HOST__REFERENCE = eINSTANCE.getFragmentHost_Reference();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENT_HOST__RESOLVED = eINSTANCE.getFragmentHost_Resolved();

		/**
		 * The meta object literal for the '{@link manifest.impl.DynamicImportPackageImpl <em>Dynamic Import Package</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.DynamicImportPackageImpl
		 * @see manifest.impl.ManifestPackageImpl#getDynamicImportPackage()
		 * @generated
		 */
		EClass DYNAMIC_IMPORT_PACKAGE = eINSTANCE.getDynamicImportPackage();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DYNAMIC_IMPORT_PACKAGE__PACKAGES = eINSTANCE.getDynamicImportPackage_Packages();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleRequiredExecutionEnvironmentImpl <em>Bundle Required Execution Environment</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleRequiredExecutionEnvironmentImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleRequiredExecutionEnvironment()
		 * @generated
		 */
		EClass BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT = eINSTANCE.getBundleRequiredExecutionEnvironment();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__PROFILE = eINSTANCE.getBundleRequiredExecutionEnvironment_Profile();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_REQUIRED_EXECUTION_ENVIRONMENT__CONFIGURATION = eINSTANCE.getBundleRequiredExecutionEnvironment_Configuration();

		/**
		 * The meta object literal for the '{@link manifest.impl.SimpleManifestEntryManyValuesImpl <em>Simple Manifest Entry Many Values</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.SimpleManifestEntryManyValuesImpl
		 * @see manifest.impl.ManifestPackageImpl#getSimpleManifestEntryManyValues()
		 * @generated
		 */
		EClass SIMPLE_MANIFEST_ENTRY_MANY_VALUES = eINSTANCE.getSimpleManifestEntryManyValues();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_MANIFEST_ENTRY_MANY_VALUES__VALUES = eINSTANCE.getSimpleManifestEntryManyValues_Values();

		/**
		 * The meta object literal for the '{@link manifest.impl.BundleManifestVersionImpl <em>Bundle Manifest Version</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.BundleManifestVersionImpl
		 * @see manifest.impl.ManifestPackageImpl#getBundleManifestVersion()
		 * @generated
		 */
		EClass BUNDLE_MANIFEST_VERSION = eINSTANCE.getBundleManifestVersion();

		/**
		 * The meta object literal for the '<em><b>Manifest Version</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUNDLE_MANIFEST_VERSION__MANIFEST_VERSION = eINSTANCE.getBundleManifestVersion_ManifestVersion();

		/**
		 * The meta object literal for the '{@link manifest.impl.ClassPathImpl <em>Class Path</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.ClassPathImpl
		 * @see manifest.impl.ManifestPackageImpl#getClassPath()
		 * @generated
		 */
		EClass CLASS_PATH = eINSTANCE.getClassPath();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_PATH__RESOLVED = eINSTANCE.getClassPath_Resolved();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_PATH__REFERENCE = eINSTANCE.getClassPath_Reference();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_PATH__ENTRY = eINSTANCE.getClassPath_Entry();

		/**
		 * The meta object literal for the '{@link manifest.impl.NativeCodeImpl <em>Native Code</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.NativeCodeImpl
		 * @see manifest.impl.ManifestPackageImpl#getNativeCode()
		 * @generated
		 */
		EClass NATIVE_CODE = eINSTANCE.getNativeCode();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_CODE__RESOLVED = eINSTANCE.getNativeCode_Resolved();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_CODE__REFERENCE = eINSTANCE.getNativeCode_Reference();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATIVE_CODE__FILE = eINSTANCE.getNativeCode_File();

		/**
		 * The meta object literal for the '{@link manifest.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.PackageImpl
		 * @see manifest.impl.ManifestPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__RESOLVED = eINSTANCE.getPackage_Resolved();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__REFERENCE = eINSTANCE.getPackage_Reference();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGE = eINSTANCE.getPackage_Package();

		/**
		 * The meta object literal for the '{@link manifest.MANIFESTVersionEnum <em>MANIFEST Version Enum</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.MANIFESTVersionEnum
		 * @see manifest.impl.ManifestPackageImpl#getMANIFESTVersionEnum()
		 * @generated
		 */
		EEnum MANIFEST_VERSION_ENUM = eINSTANCE.getMANIFESTVersionEnum();

		/**
		 * The meta object literal for the '{@link manifest.PolicyEnum <em>Policy Enum</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.PolicyEnum
		 * @see manifest.impl.ManifestPackageImpl#getPolicyEnum()
		 * @generated
		 */
		EEnum POLICY_ENUM = eINSTANCE.getPolicyEnum();

		/**
		 * The meta object literal for the '<em>URL</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.net.URL
		 * @see manifest.impl.ManifestPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>String</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see java.lang.String
		 * @see manifest.impl.ManifestPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>boolean</em>' data type.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see manifest.impl.ManifestPackageImpl#getboolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getboolean();

		/**
		 * The meta object literal for the '<em>int</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see manifest.impl.ManifestPackageImpl#getint()
		 * @generated
		 */
		EDataType INT = eINSTANCE.getint();

	}

} // ManifestPackage
