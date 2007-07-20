/* $Id: JunitTestSuite.java,v 1.36 2007-07-20 15:07:48 ftanguy Exp $
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

import java.io.File;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.io.plugin.IOPlugin;

import junit.framework.TestSuite;
import junit.textui.TestRunner;
import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.modelhelper.URIMapUtil;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class JunitTestSuite extends TestSuite {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("JunitTestSuite");
    RunJunitFactory runfactory = new RunJunitFactory();
    
    static private IOPlugin ioPlugin;
    
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

    private void initialize() {
    	
    	if ( ioPlugin == null ) {
		
    		IOPlugin.LOCAL_USE = true;
    		ioPlugin = new IOPlugin();
	
    	}

    }
    
	public JunitTestSuite(String arg0) {
		super();
		initialize();

		// do not modify this comment
/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/kmt_testcases","046_testClassEquals.main.kmt" );

		testWithFile("test/kmt_testcases","060_testNewOnModelTypeClass.main.kmt" );

		testWithFile("test/kmt_testcases","038_testReferences.main.kmt" );

		testWithFile("test/kmt_testcases","029_testClone2.main.kmt" );

		testWithFile("test/kmt_testcases","037_testLambda.main.kmt" );

		testWithFile("test/kmt_testcases","036_testIterator.main.kmt" );

		testWithFile("test/kmt_testcases","024_testZeroDivision.main.kmt" );

		testWithFile("test/kmt_testcases","041_testDynamicExpression.main.kmt" );

		testWithFile("test/kmt_testcases","067_testHasSubTypeLoadingModel.main.kmt" );

		testWithFile("test/kmt_testcases","008_testOpInternPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","020_testContainment.main.kmt" );

		testWithFile("test/kmt_testcases","019_ReflectionTest.main.kmt" );

		testWithFile("test/kmt_testcases","034_testFrameworkToString.main.kmt" );

		testWithFile("test/kmt_testcases","035_testHashtableIntegerKey.main.kmt" );

		testWithFile("test/kmt_testcases","021_testOpposites.main.kmt" );

		testWithFile("test/kmt_testcases","014_testExternJavaCall.main.kmt" );

		testWithFile("test/kmt_testcases","063_testAsType.main.kmt" );

		testWithFile("test/kmt_testcases","031_testVariable.main.kmt" );

		testWithFile("test/kmt_testcases","039_testSequence.main.kmt" );

		testWithFile("test/kmt_testcases","017_testSuperFeaturesCalls.main.kmt" );

		testWithFile("test/kmt_testcases","066_testHasSubType.main.kmt" );

		testWithFile("test/kmt_testcases","040_testSet.main.kmt" );

		testWithFile("test/kmt_testcases","001_testAssignment.main.kmt" );

		testWithFile("test/kmt_testcases","033_testBooleanResults.main.kmt" );

		testWithFile("test/kmt_testcases","023_testSimpleException.main.kmt" );

		testWithFile("test/kmt_testcases","054_testIsKindOf.main.kmt" );

		testWithFile("test/kmt_testcases","011_testBenchmark.main.kmt" );

		testWithFile("test/kmt_testcases","022_testEnum.main.kmt" );

		testWithFile("test/kmt_testcases","053_testCollection.main.kmt" );

		testWithFile("test/kmt_testcases","051_scopeVisibility.main.kmt" );

		testWithFile("test/kmt_testcases","035_testHashtableStringKey.main.kmt" );

		testWithFile("test/kmt_testcases","065_testInheritFromCollection.main.kmt" );

		testWithFile("test/kmt_testcases","045_testContainsInCollection.main.kmt" );

		testWithFile("test/kmt_testcases","002_testArithm.main.kmt" );

		testWithFile("test/kmt_testcases","030_kermetaSignature.main.kmt" );

		testWithFile("test/kmt_testcases","043_testUML2km.main.kmt" );

		testWithFile("test/kmt_testcases","041_testSimpleEval.main.kmt" );

		testWithFile("test/kmt_testcases","052_testReadWriteParameter.main.kmt" );

		testWithFile("test/kmt_testcases","003_testOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","009_testOpCallObject.main.kmt" );

		testWithFile("test/kmt_testcases","042_testSubPackage.main.kmt" );

		testWithFile("test/kmt_testcases","015_testAttributes.main.kmt" );

		testWithFile("test/kmt_testcases","058_testEqualsOnCollection.main.kmt" );

		testWithFile("test/kmt_testcases","007_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","025_testParametricOperations.main.kmt" );

		testWithFile("test/kmt_testcases","016_testParametricClasses.main.kmt" );

		testWithFile("test/kmt_testcases","035_testHashtableObjectKey.main.kmt" );

		testWithFile("test/kmt_testcases","026_testMetaClass.main.kmt" );

		testWithFile("test/kmt_testcases","035_testHashtableObjectEqualsKey.main.kmt" );

		testWithFile("test/kmt_testcases","004_testOpOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","029_testClone1.main.kmt" );

		testWithFile("test/kmt_testcases","062_testIsInstanceOf.main.kmt" );

		testWithFile("test/kmt_testcases","010_testLoop.main.kmt" );

		testWithFile("test/kmt_testcases","006_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","032_testBoolean.main.kmt" );

		testWithFile("test/kmt_testcases","061_weaving_in_kermeta_aspect1.main.kmt" );

		testWithFile("test/kmt_testcases","005_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","013_testString.main.kmt" );

		testWithFile("test/kmt_testcases","064_testReals.main.kmt" );

		testWithFile("test/kmt_testcases","059_testFreezeOnNewClass.main.kmt" );

		testWithFile("test/kmt_testcases","018_testExceptions.main.kmt" );

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
		addTest( new RunJunitFactory().addTestsForUnit(uri) );
	}
	
	public static void main(String[] args) {
		TestRunner.run(JunitTestSuite.class);
	}
}
