/* $Id: KermetaTestSuite.java,v 1.2 2007-09-19 11:21:31 vmahe Exp $
 * Project : Kermeta.interpreter
 * File : JunitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package fr.irisa.triskell.kermeta.samples.fsm.tests.exemple.kermeta;

import junit.framework.Test;
import junit.framework.TestSuite;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.samples.fsm.tests.Utils;

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class KermetaTestSuite extends TestSuite {

    static RunJunitFactory runfactory = new RunJunitFactory();
    
//    private static TestSuite _suite;
    
	public static Test suite() {
	    return new KermetaTestSuite();
		//return new TestSuite(KermetaTestSuite.class);
	}    
    
 //   private static void initialize() {
    	
//    	_suite = new TestSuite();

 //   }
    
	public KermetaTestSuite() {
		super();
//		initialize();

		// do not modify this comment
/*** BEGIN GENERATED TESTS ***/
		
		testWithFile("test/kmt_testcases","000_testBidon.main.kmt" );

/*** END GENERATED TESTS ***/
		// do not modify this comment
		//addTest(runfactory.getTest());
	}

//	/* the stupid Eclipse UI creates a testsuite from this class 
//	 * and then need at least one test method (not called in fact)
//	 * It considers all tests as test cases 
//	 * even if this is already a testSuite
//	 * */
//	public void test_kermeta_interpreter() throws Exception {
//	   // Empty
//	}
	
	public void testWithFile(String dir, String file)  {
	    //addTest(runfactory.addTestsForUnit(dir+"/"+file));
		String uri = null;
		uri = "platform:/plugin/" + Utils.PLUGIN_NAME + "/" + dir + "/" + file;
		
		Test tests = runfactory.addTestsForUnit(uri);
		addTest( tests );
	}
	
}
