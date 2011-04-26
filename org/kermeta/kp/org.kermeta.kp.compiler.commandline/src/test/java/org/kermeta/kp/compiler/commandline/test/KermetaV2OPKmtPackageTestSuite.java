package org.kermeta.kp.compiler.commandline.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.kermeta.kp.compiler.commandline.KermetaCompiler;

public class KermetaV2OPKmtPackageTestSuite extends TestSuite {
	
	// @Override
    public static Test suite() {

		KermetaCompiler.initializeFactory();
    	TestSuite suite = new TestSuite("KermetaV2OPKmtPackageTestSuite");
    	
    	suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/operations/kmt_testcases/package_testCase/externPackageCall/005_testOpPkgCall.main.kpt",
    													  "target/test/package_testcase/externPackageCall")); 
    	
    	suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/operations/kmt_testcases/package_testCase/failTestExternalPackageCall/006_testOpPkgCall.main.kpt",
		  "target/test/package_testcase/failTestExternalPackageCall")); 
    	
    	/*suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/operations/kmt_testcases/package_testCase/interPackageCall/007_testInterPackageCall.kpt",
		  "target/test/package_testcase/interPackageCall")); 
    	
    	suite.addTest(new CommandLineKermetaCompilerTest("src/test/resources/operations/kmt_testcases/package_testCase/interPackageCall/007_testOpPkgCall.main.kpt",
		  "target/test/package_testcase/interPackageCall")); */
    	


        return suite;
    }

}
