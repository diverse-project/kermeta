/* $Id: JunitTestSuite.java,v 1.25 2008-07-18 07:06:36 dvojtise Exp $
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
package kermeta_interpreter.test;

import junit.framework.TestSuite;

import org.apache.commons.logging.Log;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;

import org.kermeta.log4j.util.LogConfigurationHelper;



/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class JunitTestSuite extends TestSuite {

	final static public Log internalLog = LogConfigurationHelper.getLogger("JunitTestSuite");
    
    static private IOPlugin ioPlugin;
    
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

    private void initialize() {

    	System.setProperty(org.kermeta.log4j.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
    	"../fr.irisa.triskell.kermeta.model/kermeta_log4j_configuration.xml");
    	// reload conf in case iwas loaded befaore with another configuration
    	org.kermeta.log4j.util.LogConfigurationHelper.configureLog4JLogger(org.kermeta.log4j.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName);
    	
    	if ( ioPlugin == null ) {
		
    		IOPlugin.LOCAL_USE = true;
    		ioPlugin = IOPlugin.getDefault();
	
    	}

    }
    
	public JunitTestSuite(String arg0) {
		super();
		initialize();
		generatedCall();
	}
	private void generatedCall(){
		
		// do not modify this comment
/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/interpreter/kmt_testcases","001_testAssignment.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","002_testArithm.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","003_testOpCall.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","004_testOpOpCall.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","005_testOpPkgCall.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","006_testOpPkgCall.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","007_testOpPkgCall.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","008_testOpInternPkgCall.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","009_testOpCallObject.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","010_testLoop.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","011_testBenchmark.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","013_testString.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","014_testExternJavaCall.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","015_testAttributes.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","016_testParametricClasses.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","017_testSuperFeaturesCalls.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","018_testExceptions.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","019_ReflectionTest.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","020_testContainment.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","021_testOpposites.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","022_testEnum.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","023_testSimpleException.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","024_testZeroDivision.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","025_testParametricOperations.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","026_testMetaClass.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","027_testObjectTagAccess.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","029_testClone1.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","029_testClone2.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","030_kermetaSignature.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","031_testVariable.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","032_testBoolean.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","033_testBooleanResults.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","034_testFrameworkToString.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","035_testHashtableIntegerKey.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","035_testHashtableObjectEqualsKey.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","035_testHashtableObjectKey.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","035_testHashtableStringKey.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","036_testIterator.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","037_testLambda.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","038_testReferences.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","039_testSequence.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","040_testSet.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","041_testDynamicExpression.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","041_testSimpleEval.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","042_testSubPackage.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","043_testUML2km.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","045_testContainsInCollection.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","046_testClassEquals.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","051_scopeVisibility.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","052_testReadWriteParameter.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","053_testCollection.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","054_testIsKindOf.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","057_weaving_in_kermeta_old_syntax_aspect1.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","058_testEqualsOnCollection.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","059_testFreezeOnNewClass.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","060_testNewOnModelTypeClass.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","061_weaving_in_kermeta_aspect1.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","062_testIsInstanceOf.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","063_testAsType.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","064_testReals.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","065_testInheritFromCollection.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","066_testHasSubType.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","067_testHasSubTypeLoadingModel.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","068_testVariableInit.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","069_testToStringRedifinition.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","070_testSameClassInDifferentPackages.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","071_mergerPbWithFunctionType.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","072_testProperty.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","073_AliasOnEnumCrash.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","074_testRequireEcoreWithOppositeInDifferentFiles.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","075_PropertyEqualityUsingEnum.main.kmt" );

		testWithFile("test/interpreter/kmt_testcases","076_testMultipleInheritance.main.kmt" );

/*** END GENERATED TESTS ***/
		// do not modify this comment
		//IOPlugin.getDefault().unloadAll();
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
		addTest( new RunJunitFactory().addTestsForUnit(uri) );
	}

	/**
	 * Used when called by a JUnit4 test suite
	 * @return
	 */
	public static junit.framework.Test suite() {
		return new JunitTestSuite();
		//return new JUnit4TestAdapter(JunitTestSuite.class);  
	}
		
}

