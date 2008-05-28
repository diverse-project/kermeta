/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmTests.java,v 1.1 2008-05-28 11:33:28 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>kpm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class KpmTests extends TestSuite {

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
	 * @generated NOT
	 */
	public static Test suite() {
		TestSuite suite = new KpmTests("kpm Tests");
//		suite.addTestSuite(OutTest.class);
		suite.addTestSuite(ORExpressionTest.class);
		suite.addTestSuite(ANDExpressionTest.class);
//		suite.addTestSuite(FilterExpressionTest.class);
		suite.addTestSuite(TypeFilterTest.class);
		suite.addTestSuite(NameFilterTest.class);
		suite.addTestSuite(NullExpressionTest.class);
		suite.addTestSuite(EventTest.class);
		suite.addTestSuite(KPMTest.class);
		suite.addTestSuite(UnitTest.class);
		suite.addTestSuite(ExistFilterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpmTests(String name) {
		super(name);
	}

} //KpmTests
