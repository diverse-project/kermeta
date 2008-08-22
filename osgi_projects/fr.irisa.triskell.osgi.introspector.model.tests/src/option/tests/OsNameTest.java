/**
 * <copyright>
 * </copyright>
 *
 * $Id: OsNameTest.java,v 1.1 2008-08-22 12:40:04 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.OptionFactory;
import option.OsName;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Os Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsNameTest extends NativeCodeDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OsNameTest.class);
	}

	/**
	 * Constructs a new Os Name test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OsNameTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Os Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OsName getFixture() {
		return (OsName)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createOsName());
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

} // OsNameTest
