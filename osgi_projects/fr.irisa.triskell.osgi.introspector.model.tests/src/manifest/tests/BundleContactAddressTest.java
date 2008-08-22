/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleContactAddressTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;

import manifest.BundleContactAddress;
import manifest.ManifestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle Contact Address</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleContactAddressTest extends SimpleMANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleContactAddressTest.class);
	}

	/**
	 * Constructs a new Bundle Contact Address test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleContactAddressTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle Contact Address test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BundleContactAddress getFixture() {
		return (BundleContactAddress)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createBundleContactAddress());
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

} //BundleContactAddressTest
