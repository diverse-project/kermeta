/* $Id: JunitTestSuite.java,v 1.5 2007-10-23 09:27:02 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : JunitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 *      Didier Vojtisek	 
 */
package kermeta_interpreter.constraint_test;

import junit.framework.TestSuite;

import org.apache.log4j.Logger;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Interpreter test suite dedicated to model load and save using EMF.
 * @author Franck Fleurey
 */
public class JunitTestSuite extends TestSuite {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("JunitTestSuite");
    RunJunitFactory runfactory = new RunJunitFactory("platform:/resource/fr.irisa.triskell.kermeta.tests/.bin");
    
    static private IOPlugin ioPlugin;

    private void initialize() {
    	
    	if ( ioPlugin == null ) {
		
    		IOPlugin.LOCAL_USE = true;
    		ioPlugin = new IOPlugin();
	
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
		testWithFile("test/interpreter/constraint_testcases","001_testInv_fail_inherited_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","002_testInv_fail_inherited.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","003_testInv_fail_inherited2_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","004_testInv_Redefinition_is_in_fact_UNION_fail_partly_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","005_testParamPass.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","006_testParamPostFailed.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","007_testParamPreFailed.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","008_testPrePost_Pass.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","009_testPrePost_PostFailed_PreFailed_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","010_testPrePost_PostFailed1_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","011_testPrePost_PostFailed1.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","012_testPrePost_PostFailed2.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","013_testPrePost_PostFailed3.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","014_testPrePost_PostInheritedFailed1.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","015_testPrePost_PostInheritedFailed2.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","016_testPrePost_PostInheritedInheritedFail1.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","017_testPrePost_PostInheritedInheritedFail2.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","018_testPrePost_PostInheritedInheritedPass1.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","019_testPrePost_PreFailed.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","020_testPrePost_PreInheritedFailed1.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","021_testPrePost_PreInheritedFailed2.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","022_testPrePost_PreInheritedInheritedFailed1.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","023_testResultFail.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","024_testResultPass.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","025_testUsedRequire_InvFailed_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","026_testUsedRequire_Pass.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","027_testUsedRequire_PostFailed_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","028_testUsedRequire_PostFailed.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","029_testUsedRequire_PreFailed_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","030_testInv_fail_catched.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","031_testInvWithAspects.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","032_atpre_variable_test.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","033_atpre_feature_test.main.kmt" );

		testWithFile("test/interpreter/constraint_testcases","034_atpre_feature_complex_test.main.kmt" );

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
		String uri = TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file;
		addTest(new RunJunitFactory("platform:/resource/fr.irisa.triskell.kermeta.tests/.bin").addTestsForUnit(uri, true));
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
