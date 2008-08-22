/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManifestFactory.java,v 1.4 2008-08-22 12:43:34 edaubert Exp $
 */
package manifest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * @see manifest.ManifestPackage
 * @generated
 */
public interface ManifestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	ManifestFactory eINSTANCE = manifest.impl.ManifestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>MANIFEST</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>MANIFEST</em>'.
	 * @generated
	 */
	MANIFEST createMANIFEST();

	/**
	 * Returns a new object of class '<em>Simple MANIFEST Entry</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Simple MANIFEST Entry</em>'.
	 * @generated
	 */
	SimpleMANIFESTEntry createSimpleMANIFESTEntry();

	/**
	 * Returns a new object of class '<em>Bundle Name</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Name</em>'.
	 * @generated
	 */
	BundleName createBundleName();

	/**
	 * Returns a new object of class '<em>Bundle Symbolic Name</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Symbolic Name</em>'.
	 * @generated
	 */
	BundleSymbolicName createBundleSymbolicName();

	/**
	 * Returns a new object of class '<em>Bundle Description</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Description</em>'.
	 * @generated
	 */
	BundleDescription createBundleDescription();

	/**
	 * Returns a new object of class '<em>Bundle Localization</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Localization</em>'.
	 * @generated
	 */
	BundleLocalization createBundleLocalization();

	/**
	 * Returns a new object of class '<em>Bundle Vendor</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Vendor</em>'.
	 * @generated
	 */
	BundleVendor createBundleVendor();

	/**
	 * Returns a new object of class '<em>Bundle Contact Address</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Contact Address</em>'.
	 * @generated
	 */
	BundleContactAddress createBundleContactAddress();

	/**
	 * Returns a new object of class '<em>Bundle Copyright</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Copyright</em>'.
	 * @generated
	 */
	BundleCopyright createBundleCopyright();

	/**
	 * Returns a new object of class '<em>Bundle Category</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Category</em>'.
	 * @generated
	 */
	BundleCategory createBundleCategory();

	/**
	 * Returns a new object of class '<em>Bundle Doc URL</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Doc URL</em>'.
	 * @generated
	 */
	BundleDocURL createBundleDocURL();

	/**
	 * Returns a new object of class '<em>Bundle Update Location</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Update Location</em>'.
	 * @generated
	 */
	BundleUpdateLocation createBundleUpdateLocation();

	/**
	 * Returns a new object of class '<em>Bundle Version</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Version</em>'.
	 * @generated
	 */
	BundleVersion createBundleVersion();

	/**
	 * Returns a new object of class '<em>Bundle Activator</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Activator</em>'.
	 * @generated
	 */
	BundleActivator createBundleActivator();

	/**
	 * Returns a new object of class '<em>Bundle Class Path</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Class Path</em>'.
	 * @generated
	 */
	BundleClassPath createBundleClassPath();

	/**
	 * Returns a new object of class '<em>Bundle Native Code</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Bundle Native Code</em>'.
	 * @generated
	 */
	BundleNativeCode createBundleNativeCode();

	/**
	 * Returns a new object of class '<em>Require Bundle</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Require Bundle</em>'.
	 * @generated
	 */
	RequireBundle createRequireBundle();

	/**
	 * Returns a new object of class '<em>Import Service</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Import Service</em>'.
	 * @generated
	 */
	ImportService createImportService();

	/**
	 * Returns a new object of class '<em>Export Service</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Export Service</em>'.
	 * @generated
	 */
	ExportService createExportService();

	/**
	 * Returns a new object of class '<em>Import Package</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Import Package</em>'.
	 * @generated
	 */
	ImportPackage createImportPackage();

	/**
	 * Returns a new object of class '<em>Export Package</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Export Package</em>'.
	 * @generated
	 */
	ExportPackage createExportPackage();

	/**
	 * Returns a new object of class '<em>Bundle Activation Policy</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Activation Policy</em>'.
	 * @generated
	 */
	BundleActivationPolicy createBundleActivationPolicy();

	/**
	 * Returns a new object of class '<em>Fragment Host</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Fragment Host</em>'.
	 * @generated
	 */
	FragmentHost createFragmentHost();

	/**
	 * Returns a new object of class '<em>Dynamic Import Package</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Dynamic Import Package</em>'.
	 * @generated
	 */
	DynamicImportPackage createDynamicImportPackage();

	/**
	 * Returns a new object of class '<em>Bundle Required Execution Environment</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Required Execution Environment</em>'.
	 * @generated
	 */
	BundleRequiredExecutionEnvironment createBundleRequiredExecutionEnvironment();

	/**
	 * Returns a new object of class '<em>Simple Manifest Entry Many Values</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Manifest Entry Many Values</em>'.
	 * @generated
	 */
	SimpleManifestEntryManyValues createSimpleManifestEntryManyValues();

	/**
	 * Returns a new object of class '<em>Bundle Manifest Version</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle Manifest Version</em>'.
	 * @generated
	 */
	BundleManifestVersion createBundleManifestVersion();

	/**
	 * Returns a new object of class '<em>Class Path</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Class Path</em>'.
	 * @generated
	 */
	ClassPath createClassPath();

	/**
	 * Returns a new object of class '<em>Native Code</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Native Code</em>'.
	 * @generated
	 */
	NativeCode createNativeCode();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	manifest.Package createPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ManifestPackage getManifestPackage();

} // ManifestFactory
