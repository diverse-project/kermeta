package org.kermeta.kp.compiler.commandline.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.kermeta.kp.compiler.commandline.KermetaCompiler;

public class KermetaV2OPKmtCallOpTestSuite extends TestSuite {
	
	
	// @Override
    public static Test suite() {

		KermetaCompiler.initializeFactory();
    	TestSuite suite = new TestSuite("KermetaV2OPKmtCallOpTestSuite");
    	
    	suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/operations/kmt_testcases/callOpTestCase/003_testOpCall.main.kpt",
		  "target/test/callOpTestCase"));
    	
    	suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/operations/kmt_testcases/callOpTestCase/004_testOpOpCall.main.kpt",
		  "target/test/callOpTestCase"));
    	
        return suite;
    }

}
