/* $Id: JunitTestSuite.java,v 1.2 2006-07-20 11:34:52 zdrey Exp $
 * Project : Kermeta.interpreter
 * File : JunitTestSuite.java
 * License : GPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 * 		Franck FLEUREY  (ffleurey@irisa.fr)
 * 		Didier VOJTISEK (dvojtise@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package kermeta_framework.test;

import junit.framework.TestSuite;
import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;

/**
 * Framework test suite.
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
		testWithFile("test/kmt_testcases","testArithm.main.kmt" );

		testWithFile("test/kmt_testcases","testBoolean.main.kmt" );

		testWithFile("test/kmt_testcases","testBooleanResults.main.kmt" );

		testWithFile("test/kmt_testcases","testHashtable.main.kmt" );

		testWithFile("test/kmt_testcases","testIterator.main.kmt" );

		testWithFile("test/kmt_testcases","testLambda.main.kmt" );

		testWithFile("test/kmt_testcases","testSet.main.kmt" );

		testWithFile("test/kmt_testcases","testSubPackage.main.kmt" );

		testWithFile("test/kmt_testcases","testVariable.main.kmt" );

/*** END GENERATED TESTS ***/
		// do not modify this comment
		
	}
	
	/* the stupid Eclipse UI creates a testsuite from this class 
	 * and then need a least one test method (not called in fact)
	 * It considers all tests as test cases 
	 * even if this is already a testSuite
	 * */
	public void test_kermeta_framework() throws Exception {
	   // testWithFile("test/kmt_testcases","14_testExternJavaCall.main.kmt" );

	}
	
	public void testWithFile(String dir, String file)  {
		//Run.main(new String[] {dir+"/"+file} );
	    addTest(new RunJunitFactory().getTest() );
	    
	}
	

}
