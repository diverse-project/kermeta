/* $Id: KermetaTestSuite.java,v 1.1 2007-09-14 07:28:10 vmahe Exp $
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

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestSuite;

//import org.apache.log4j.Logger;
//import org.kermeta.io.plugin.IOPlugin;
import org.openembedd.tests.utils.UiTools;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
//import fr.irisa.triskell.kermeta.tests.samples.fsm.Utils;
//import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.samples.fsm.tests.Utils;

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class KermetaTestSuite extends TestSuite {

//	final static public Logger internalLog = LogConfigurationHelper.getLogger("JunitTestSuite");
    static RunJunitFactory runfactory = new RunJunitFactory();
    
    private static TestSuite _suite;
//    private static IOPlugin ioPlugin;

	public static Test suite() {
		_suite = new TestSuite();

//    	if ( ioPlugin == null ) {
//		
//    		IOPlugin.LOCAL_USE = true;
//    		ioPlugin = new IOPlugin();
//	
//    	}
    	
		// do not modify this comment
	/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/kmt_testcases","000_testBidon.main.kmt" );

	/*** END GENERATED TESTS ***/
		// do not modify this comment
		//addTest(runfactory.getTest());
	    return _suite;
	}

//    static private IOPlugin ioPlugin;
    
//    public KermetaTestSuite(java.lang.Class<?> theClass)
//    {
//        super();
//        initialize();
//    }
//    public KermetaTestSuite(java.lang.Class<?> theClass, String bla)
//    {
//        super();
//        initialize();
//    }    
//
//    private static void initialize() {
//    	
//    	if ( ioPlugin == null ) {
//		
//    		IOPlugin.LOCAL_USE = true;
//    		ioPlugin = new IOPlugin();
//	
//    	}
//    	
//    	_suite = new TestSuite();
//
//    }
//    
//	public KermetaTestSuite(String arg0) {
//		super();
//		initialize();
//
//		// do not modify this comment
///*** BEGIN GENERATED TESTS ***/
//		testWithFile("test/kmt_testcases","000_testBidon.main.kmt" );
//
///*** END GENERATED TESTS ***/
//		// do not modify this comment
//		//addTest(runfactory.getTest());
//	}
	
	/* the stupid Eclipse UI creates a testsuite from this class 
	 * and then need at least one test method (not called in fact)
	 * It considers all tests as test cases 
	 * even if this is already a testSuite
	 * */
	public void test_kermeta_interpreter() throws Exception {
	   // Empty
	}
	
	public static void testWithFile(String dir, String file)  {
	    //addTest(runfactory.addTestsForUnit(dir+"/"+file));
		String uri = null;
		try {
			uri = UiTools.getPluginPath(Utils.PLUGIN_NAME) + dir + "/" + file;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//DEBUG
		System.out.println("DEBUG KermetaTestSuite - runfactory = "+runfactory.getUnit());
		System.out.println("DEBUG KermetaTestSuite - runfactory = "+runfactory.getTest());
		
		Test tests = runfactory.addTestsForUnit(uri);
		_suite.addTest( tests );
	}
	
//	public static void main(String[] args) {
//		TestRunner.run(JunitTestSuite.class);
//	}
}
