/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManifestTests.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>manifest</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManifestTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static Test suite() {
		TestSuite suite = new ManifestTests("manifest Tests");
		suite.addTest(new TestSuite(BundleActivationPolicyTest.class));
		suite.addTest(new TestSuite(BundleActivatorTest.class));
		suite.addTest(new TestSuite(BundleCategoryTest.class));
		suite.addTest(new TestSuite(BundleClassPathTest.class));
		suite.addTest(new TestSuite(BundleContactAddressTest.class));
		suite.addTest(new TestSuite(BundleCopyrightTest.class));
		suite.addTest(new TestSuite(BundleDescriptionTest.class));
		suite.addTest(new TestSuite(BundleDocURLTest.class));
		suite.addTest(new TestSuite(BundleLocalizationTest.class));
		suite.addTest(new TestSuite(BundleManifestVersionTest.class));
		suite.addTest(new TestSuite(BundleNameTest.class));
		suite.addTest(new TestSuite(BundleNativeCodeTest.class));
		suite.addTest(new TestSuite(BundleRequiredExecutionEnvironmentTest.class));
		suite.addTest(new TestSuite(BundleSymbolicNameTest.class));
		suite.addTest(new TestSuite(BundleUpdateLocationTest.class));
		suite.addTest(new TestSuite(BundleVendorTest.class));
		suite.addTest(new TestSuite(BundleVersionTest.class));
		//suite.addTest(new TestSuite(ClassPathTest.class));
		suite.addTest(new TestSuite(DynamicImportPackageTest.class));
		suite.addTest(new TestSuite(ExportPackageTest.class));
		suite.addTest(new TestSuite(ExportServiceTest.class));
		suite.addTest(new TestSuite(FragmentHostTest.class));
		suite.addTest(new TestSuite(ImportPackageTest.class));
		suite.addTest(new TestSuite(ImportServiceTest.class));
		//suite.addTest(new TestSuite(MANIFESTEntryTest.class));
		//suite.addTest(new TestSuite(NativeCodeTest.class));
		//suite.addTest(new TestSuite(PackageTest.class));
		suite.addTest(new TestSuite(RequireBundleTest.class));
		//suite.addTest(new TestSuite(ServiceTest.class));
		suite.addTest(new TestSuite(SimpleManifestEntryManyValuesTest.class));
		suite.addTest(new TestSuite(SimpleMANIFESTEntryTest.class));
		//suite.addTest(new TestSuite(URLMANIFESTEntryTest.class));
		suite.addTest(new TestSuite(VersionTest.class));
		suite.addTest(new TestSuite(MANIFESTTest.class));
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManifestTests(String name) {
		super(name);
	}

} //ManifestTests
