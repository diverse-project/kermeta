package org.kermeta.kp.compiler.commandline.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.kermeta.language.compiler.commandline.KermetaCompiler;

public class KermetaV2OPKmtLanguageOperationTestSuite extends TestSuite {
	
	// @Override
    public static Test suite() {

		KermetaCompiler.initializeFactory();
    	TestSuite suite = new TestSuite("KermetaV2OPKmtLanguageOperationTestSuite");
    	suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/operations/kmt_testcases/languageOp_testcase/001_testAssignment.main.kpt",
    													  "target/test/languageOp_testcase")); 
    	
    	suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/operations/kmt_testcases/languageOp_testcase/002_testArithm.main.kpt",
		  "target/test/languageOp_testcase"));
        return suite;
    }

}
