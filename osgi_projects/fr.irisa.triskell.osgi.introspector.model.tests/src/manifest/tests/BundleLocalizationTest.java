/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleLocalizationTest.java,v 1.1 2008-08-22 12:39:59 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;

import manifest.BundleLocalization;
import manifest.ManifestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle Localization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleLocalizationTest extends SimpleMANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleLocalizationTest.class);
	}

	/**
	 * Constructs a new Bundle Localization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleLocalizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle Localization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BundleLocalization getFixture() {
		return (BundleLocalization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createBundleLocalization());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BundleLocalizationTest
