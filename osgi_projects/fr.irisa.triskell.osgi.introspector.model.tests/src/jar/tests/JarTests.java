/**
 * <copyright>
 * </copyright>
 *
 * $Id: JarTests.java,v 1.1 2008-08-22 12:40:07 edaubert Exp $
 */
package jar.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>jar</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class JarTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static Test suite() {
		TestSuite suite = new JarTests("jar Tests");
		//suite.addTest(new TestSuite(SystemEntryTest.class));
		//suite.addTest(new TestSuite(BundleEntryTest.class));
		//suite.addTest(new TestSuite(FileTest.class));
		//suite.addTest(new TestSuite(ClassTest.class));
		suite.addTest(new TestSuite(FolderTest.class));
		suite.addTest(new TestSuite(PackageTest.class));
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JarTests(String name) {
		super(name);
	}

} //JarTests
