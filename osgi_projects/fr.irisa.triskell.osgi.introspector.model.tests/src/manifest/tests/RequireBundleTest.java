/**
 * <copyright>
 * </copyright>
 *
 * $Id: RequireBundleTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;
import manifest.ManifestFactory;
import manifest.RequireBundle;

import option.OptionFactory;
import option.RequireBundleDirective;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Require Bundle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequireBundleTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequireBundleTest.class);
	}

	/**
	 * Constructs a new Require Bundle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequireBundleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Require Bundle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequireBundle getFixture() {
		return (RequireBundle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createRequireBundle());
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
		RequireBundleDirective directive = OptionFactory.eINSTANCE.createVisibility();
		getFixture().addDirective(directive);
		
		assertEquals(1, getFixture().getDirectives().size());
		assertEquals(directive, getFixture().getDirectives().get(0));
		
		RequireBundleDirective directive1 = OptionFactory.eINSTANCE.createResolution();
		getFixture().addDirective(directive1);

		assertEquals(2, getFixture().getDirectives().size());
		assertTrue(getFixture().getDirectives().get(0).equals(directive1) || getFixture().getDirectives().get(0).equals(directive));
		assertTrue(getFixture().getDirectives().get(1).equals(directive1) || getFixture().getDirectives().get(0).equals(directive));
		
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
	}

} //RequireBundleTest
