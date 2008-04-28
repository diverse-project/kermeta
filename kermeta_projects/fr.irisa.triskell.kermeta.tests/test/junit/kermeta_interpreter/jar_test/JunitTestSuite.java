/* $Id: JunitTestSuite.java,v 1.8 2008-04-28 11:51:16 ftanguy Exp $
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
package kermeta_interpreter.jar_test;

import junit.framework.TestSuite;

import org.apache.log4j.Logger;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;
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
    	System.setProperty(fr.irisa.triskell.kermeta.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
    	"../fr.irisa.triskell.kermeta.model/kermeta_log4j_configuration.xml");
    	// reload conf in case iwas loaded befaore with another configuration
    	fr.irisa.triskell.kermeta.util.LogConfigurationHelper.configureLogger(fr.irisa.triskell.kermeta.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName);
    	
    	if ( ioPlugin == null ) {
		
    		IOPlugin.LOCAL_USE = true;
    		ioPlugin = IOPlugin.getDefault();
	
    	}

    }
    public JunitTestSuite() {
    	super();
    	initialize();
		generatedCall();
    }
    public JunitTestSuite(java.lang.Class<?> theClass)
    {
        super();
        initialize();
		generatedCall();
    }
    public JunitTestSuite(java.lang.Class<?> theClass, String bla)
    {
        super();
        initialize();
		generatedCall();
    }    
	public JunitTestSuite(String arg0) {
		super();
		initialize();
		generatedCall();
	}
	
	private void generatedCall(){	
		// do not modify this comment
/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/interpreter/jar_testcases/kermeta","001_requireJava_rt_io.main.kmt" );

		testWithFile("test/interpreter/jar_testcases/kermeta","002_requireJava_rt_awt.main.kmt" );

		testWithFile("test/interpreter/jar_testcases/kermeta","003_requireJava_rt_math.main.kmt" );

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
		String uri = TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file;
		addTest(new RunJunitFactory().addTestsForUnit(uri));
	}
	
	/*public static void main(String[] args) {
		TestRunner.run(JunitTestSuite.class);
	}*/
	
	/**
	 * Used when called by a JUnit4 test suite
	 * @return
	 */
	public static junit.framework.Test suite() {
		return new JunitTestSuite(); 
	}
}
