/* $Id: JunitTestSuite.java,v 1.16 2008-05-27 12:58:37 dvojtise Exp $
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
package kermeta_interpreter.emf_test;

import junit.framework.TestSuite;

import org.apache.log4j.Logger;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;

import org.kermeta.log4j.util.LogConfigurationHelper;

/**
 * Interpreter test suite dedicated to model load and save using EMF.
 * @author Franck Fleurey
 */
public class JunitTestSuite extends TestSuite {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("JunitTestSuite");
    RunJunitFactory runfactory = new RunJunitFactory();
    
    static private IOPlugin ioPlugin;
    
    private void initialize() {
    	System.setProperty(org.kermeta.log4j.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
    	"../fr.irisa.triskell.kermeta.model/kermeta_log4j_configuration.xml");
    	// reload conf in case iwas loaded befaore with another configuration
    	org.kermeta.log4j.util.LogConfigurationHelper.configureLogger(org.kermeta.log4j.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName);
    	
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
		testWithFile("test/interpreter/emf_testcases/kermeta","001_testLoadEcoreFileWithEChar.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","002_loadAndSaveEcoreInDifferentRepository.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","003_loadAndSaveEcoreInTheSameRepository.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","027_testRuntimeModelImport.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","028_testLoadEcoreFile.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","044_testFrameworkModelConformance.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","047_testLoadEcoreSplittedModel.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","048_testLoadEcoreSplittedModel_withCyclicref.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","049_testSplittedMetaModel.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","050_testChunkedModel.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","051_testSaveEcoreSplittedXRefModel.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","052_testSaveEcoreSplittedModel.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","053_savingKM.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","053_savingKM_2.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","054_pb_olivier1213.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","055_MT_FSM_simpleLoadFromDynamicInstance.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","056_load_and_save_in_another_location.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","057_saveDependentModels.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","058_loadSaveIndirectUseOfEcoreEnum.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","058_loadSaveUseOfEcoreEnum.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","059_loadSaveKMEnum.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","059_loadUseOfKMEnum.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","060_createSaveEcoreEnum.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","060_loadSaveEcoreEnum.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","061_multipleIndirectLoad.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","062_resourceTests.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","067_testHasSubTypeLoadingModel.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","068_saveEcoreLinkedToTheFramework.main.kmt" );

		testWithFile("test/interpreter/emf_testcases/kermeta","069_copy_km_model.main.kmt" );

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
		String uri = TestPlugin.PLUGIN_TESTS_PATH + dir+"/"+file;
		addTest( new RunJunitFactory().addTestsForUnit(uri) );
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
