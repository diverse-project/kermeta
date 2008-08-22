/**
 * <copyright>
 * </copyright>
 *
 * $Id: FrameworkTests.java,v 1.1 2008-08-22 12:40:06 edaubert Exp $
 */
package framework.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>framework</b></em>'
 * package. <!-- end-user-doc -->
 * @generated
 */
public class FrameworkTests extends TestSuite {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public static Test suite() {
		TestSuite suite = new FrameworkTests("framework Tests");
		suite.addTest(new TestSuite(BundleTest.class));
		suite.addTest(new TestSuite(FrameworkTest.class));
		return suite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkTests(String name) {
		super(name);
	}

} // FrameworkTests
