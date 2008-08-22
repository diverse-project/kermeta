/**
 * <copyright>
 * </copyright>
 *
 * $Id: OsVersionTest.java,v 1.1 2008-08-22 12:40:02 edaubert Exp $
 */
package option.tests;

import junit.textui.TestRunner;

import option.OptionFactory;
import option.OsVersion;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Os Version</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsVersionTest extends NativeCodeDirectiveTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OsVersionTest.class);
	}

	/**
	 * Constructs a new Os Version test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public OsVersionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Os Version test case.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OsVersion getFixture() {
		return (OsVersion)fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionFactory.eINSTANCE.createOsVersion());
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

} // OsVersionTest
