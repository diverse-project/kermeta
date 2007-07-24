/* $Id: JunitTestSuite.java,v 1.5 2007-07-24 13:47:37 ftanguy Exp $
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
package kermeta_interpreter.jar_test;

import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.apache.log4j.Logger;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class JunitTestSuite extends TestSuite {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("JunitTestSuite");
    RunJunitFactory runfactory = new RunJunitFactory();
    
    static private IOPlugin ioPlugin;
    
    private void initialize() {
    	
    	if ( ioPlugin == null ) {
		
    		IOPlugin.LOCAL_USE = true;
    		ioPlugin = new IOPlugin();
	
    	}

    }
    
    public JunitTestSuite(java.lang.Class theClass)
    {
        super();
        initialize();
    }
    public JunitTestSuite(java.lang.Class theClass, String bla)
    {
        super();
        initialize();
    }    
	public JunitTestSuite(String arg0) {
		super();
		initialize();

		// do not modify this comment
/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/jar_testcases/kermeta","001_requireJava_rt_io.main.kmt" );

		testWithFile("test/jar_testcases/kermeta","002_requireJava_rt_awt.main.kmt" );

		testWithFile("test/jar_testcases/kermeta","003_requireJava_rt_math.main.kmt" );

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
	    //addTest(runfactory.addTestsForUnit(dir+"/"+file));
		String uri = "platform:/plugin/fr.irisa.triskell.kermeta.interpreter/" + dir + "/" + file;
		addTest(new RunJunitFactory().addTestsForUnit(uri));
	}
	
	public static void main(String[] args) {
		TestRunner.run(JunitTestSuite.class);
	}
}
