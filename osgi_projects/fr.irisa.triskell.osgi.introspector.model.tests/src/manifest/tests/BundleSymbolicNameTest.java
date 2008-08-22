/**
 * <copyright>
 * </copyright>
 *
 * $Id: BundleSymbolicNameTest.java,v 1.1 2008-08-22 12:40:00 edaubert Exp $
 */
package manifest.tests;

import junit.textui.TestRunner;
import manifest.BundleSymbolicName;
import manifest.ManifestFactory;
import option.OptionFactory;
import option.SymbolicNameDirective;

import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bundle Symbolic Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BundleSymbolicNameTest extends MANIFESTEntryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BundleSymbolicNameTest.class);
	}

	/**
	 * Constructs a new Bundle Symbolic Name test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BundleSymbolicNameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bundle Symbolic Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BundleSymbolicName getFixture() {
		return (BundleSymbolicName)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ManifestFactory.eINSTANCE.createBundleSymbolicName());
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
		SymbolicNameDirective directive = OptionFactory.eINSTANCE.createFragmentAttachment();
		getFixture().addDirective(directive);
		
		assertEquals(1, getFixture().getDirectives().size());
		assertEquals(directive, getFixture().getDirectives().get(0));
		
		SymbolicNameDirective directive1 = OptionFactory.eINSTANCE.createSingleton();
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
		
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
		
		getFixture().addDirective(null);
		
		assertEquals(2, getFixture().getDirectives().size());
		
		directive1 = OptionFactory.eINSTANCE.createSingleton();
		directive1.setToken(null);
		getFixture().addDirective(directive1);
		
		assertEquals(2, getFixture().getDirectives().size());
	}

} //BundleSymbolicNameTest
