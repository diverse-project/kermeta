/* $Id: JunitTestSuite.java,v 1.3 2005-04-28 10:01:40 dvojtise Exp $
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

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class JunitTestSuite extends TestSuite {

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

		// do not modify this comment
/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/kmt_testcases","10_testLoop.main.kmt" );

		testWithFile("test/kmt_testcases","11_testBenchmark.main.kmt" );

/*		testWithFile("test/kmt_testcases","13_testString.main.kmt" );

		testWithFile("test/kmt_testcases","14_testExternJavaCall.main.kmt" );

		testWithFile("test/kmt_testcases","1_testAssignment.main.kmt" );
*/
		testWithFile("test/kmt_testcases","2_testArithm.main.kmt" );
/*
		testWithFile("test/kmt_testcases","3_testOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","4_testOpOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","5_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","6_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","7_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","8_testOpInternPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","9_testOpCallObject.main.kmt" );

		testWithFile("test/kmt_testcases","testBoolean.main.kmt" );
*/
/*** END GENERATED TESTS ***/
		// do not modify this comment
		
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
		//Run.main(new String[] {dir+"/"+file} );
	    addTest((new RunJunitFactory(new String[] {dir+"/"+file})).getTest() );
	    
	}
	

}
