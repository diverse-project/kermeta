package kermeta_io.test;

import junit.textui.TestRunner;

/**
 * IO test suite.
 * Needed for coverage test with Cobertura with command line
 * @author Martin
 */
public class IOTestSuite {

	public static void main(String[] args) {
		TestRunner.run(kermeta_io.constraintchecker_test.JunitTestSuite.class);
		TestRunner.run(kermeta_io.roundtrip_test.JunitTestSuite.class);
		TestRunner.run(kermeta_io.typechecker_test.JunitTestSuite.class);
		TestRunner.run(kermeta_io.test.JunitTestSuite.class);

	}

}
