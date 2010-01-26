package org.kermeta.compiler.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.kermeta.compiler.test");

		suite.addTestSuite(TestCaseRunner.class);
		suite.addTestSuite(ExceptionTestCases.class);
		suite.addTestSuite(TestCallExpr.class);
		suite.addTestSuite(TestConditionalExpr.class);
		suite.addTestSuite(TestGenericity.class);
		return suite;
	}

}
