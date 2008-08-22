/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleActivationPolicyTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;
import manifest.BundleActivationPolicy;
import manifest.ManifestFactory;
import option.ActivationPolicyDirective;
import option.OptionFactory;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle Activation Policy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleActivationPolicyTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleActivationPolicyTest.class);
	}

	/**
	 * Constructs a new Bundle Activation Policy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleActivationPolicyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle Activation Policy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BundleActivationPolicy getFixture() {
		return (BundleActivationPolicy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createBundleActivationPolicy());
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

	@Test
	public void testAddDirective() {
		ActivationPolicyDirective directive = OptionFactory.eINSTANCE.createExcludePackages();
		getFixture().addDirective(directive);
		
		assertEquals(1, getFixture().getDirectives().size());
		
		ActivationPolicyDirective directive1 = OptionFactory.eINSTANCE.createIncludePackages();
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
		
		directive1 = null;
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
		
		directive1 = OptionFactory.eINSTANCE.createExcludePackages();
		directive1.setToken(null);
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
	}

	@Test
	public void testRemoveDirective() {
		// For the moment, there is nothing to test
	}	
} //BundleActivationPolicyTest
