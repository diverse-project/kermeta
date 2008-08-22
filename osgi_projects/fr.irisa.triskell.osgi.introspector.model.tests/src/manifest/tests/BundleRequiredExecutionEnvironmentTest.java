/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleRequiredExecutionEnvironmentTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;

import manifest.BundleRequiredExecutionEnvironment;
import manifest.ManifestFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle Required Execution Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleRequiredExecutionEnvironmentTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleRequiredExecutionEnvironmentTest.class);
	}

	/**
	 * Constructs a new Bundle Required Execution Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleRequiredExecutionEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle Required Execution Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BundleRequiredExecutionEnvironment getFixture() {
		return (BundleRequiredExecutionEnvironment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createBundleRequiredExecutionEnvironment());
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

} //BundleRequiredExecutionEnvironmentTest
