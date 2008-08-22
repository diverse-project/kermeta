/**
 * <copyright>
 * </copyright>
 *
 * $Id: UsesTest.java,v 1.1 2008-08-22 12:40:03 edaubert Exp $
 */
package option.tests;

import org.junit.Test;

import junit.textui.TestRunner;

import option.OptionFactory;
import option.Uses;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Uses</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsesTest extends ExportPackageDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsesTest.class);
	}

	/**
	 * Constructs a new Uses test case with the given name.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsesTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uses test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected Uses getFixture() {
		return (Uses)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createUses());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	@Test
	public void testAddPackage() {
		// For the moment, there is nothing to test
	}

} // UsesTest
