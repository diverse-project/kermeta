/**
 * <copyright>
 * </copyright>
 *
 * $Id: FrameworkAllTests.java,v 1.1 2008-08-22 12:40:06 edaubert Exp $
 */
package framework.tests;

import jar.tests.JarTests;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;
import manifest.tests.ManifestTests;
import option.tests.OptionTests;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>Framework</b></em>'
 * model. <!-- end-user-doc -->
 * @generated
 */
public class FrameworkAllTests extends TestSuite {

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
		TestSuite suite = new FrameworkAllTests("Framework Tests");
		suite.addTest(FrameworkTests.suite());
		suite.addTest(JarTests.suite());
		suite.addTest(OptionTests.suite());
		suite.addTest(ManifestTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkAllTests(String name) {
		super(name);
	}

} // FrameworkAllTests
