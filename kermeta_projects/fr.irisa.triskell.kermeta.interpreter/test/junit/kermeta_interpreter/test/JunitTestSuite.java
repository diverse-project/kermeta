/* $Id: JunitTestSuite.java,v 1.6 2005-05-16 17:39:17 ffleurey Exp $
 * Project : Kermeta.interpreter
 * File : JunitTestSuite.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package kermeta_interpreter.test;

import junit.framework.TestSuite;
import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class JunitTestSuite extends TestSuite {

    RunJunitFactory runfactory = new RunJunitFactory();
    
    public JunitTestSuite(java.lang.Class theClass)
    {
        super();
    }
    public JunitTestSuite(java.lang.Class theClass, String bla)
    {
        super();
    }    
	public JunitTestSuite(String arg0) {
		super();
		System.setProperty(fr.irisa.triskell.kermeta.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
        	"../fr.irisa.triskell.kermeta.texteditor/kermeta_log4j_configuration.xml");
		
		KermetaUnit.STD_LIB_URI = "lib/framework.km";

		// do not modify this comment
/*** BEGIN GENERATED TESTS ***/
		 /*
		testWithFile("test/kmt_testcases","2_testArithm.main.kmt" );

		testWithFile("test/kmt_testcases","1_testAssignment.main.kmt" );

		testWithFile("test/kmt_testcases","11_testBenchmark.main.kmt" );

		testWithFile("test/kmt_testcases","4_testOpOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","10_testLoop.main.kmt" );

		testWithFile("test/kmt_testcases","testArithm.main.kmt" );

		testWithFile("test/kmt_testcases","8_testOpInternPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","9_testOpCallObject.main.kmt" );

		testWithFile("test/kmt_testcases","7_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","6_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","3_testOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","5_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","14_testExternJavaCall.main.kmt" );
///*
		testWithFile("test/kmt_testcases","13_testString.main.kmt" );

		testWithFile("test/kmt_testcases","testBoolean.main.kmt" );
		
		testWithFile("test/kmt_testcases","testIterator.main.kmt" );

		testWithFile("test/kmt_testcases","testBooleanResults.main.kmt" );

		testWithFile("test/kmt_testcases","testLambda.main.kmt" );
*/
		testWithFile("test/kmt_testcases","testSet.main.kmt" );
/*
		testWithFile("test/kmt_testcases","testSubPackage.main.kmt" );

		testWithFile("test/kmt_testcases","testVariable.main.kmt" );

		testWithFile("test/kmt_testcases","testHashtable.main.kmt" );

		testWithFile("test/kmt_testcases","19_ReflectionTest.main.kmt" );

		testWithFile("test/kmt_testcases","16_testParametricClasses.main.kmt" );

		testWithFile("test/kmt_testcases","18_testExceptions.main.kmt" );

		testWithFile("test/kmt_testcases","15_testAttributes.main.kmt" );

		testWithFile("test/kmt_testcases","17_testSuperFeaturesCalls.main.kmt" );

		testWithFile("test/kmt_testcases","testReferences.main.kmt" );

		testWithFile("test/kmt_testcases","20_testContainment.main.kmt" );

/*** END GENERATED TESTS ***/
		// do not modify this comment
		//addTest(runfactory.getTest());
	}
	
	/* the stupid Eclipse UI creates a testsuite from this class 
	 * and then need a least one test method (not called in fact)
	 * It considers all tests as test cases 
	 * even if this is already a testSuite
	 * */
	public void test_kermeta_interpreter() throws Exception {
	   // testWithFile("test/kmt_testcases","14_testExternJavaCall.main.kmt" );
	}
	
	public void testWithFile(String dir, String file)  {
	    addTest(runfactory.addTestsForUnit(dir+"/"+file));
	}
	

}
