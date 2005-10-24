/* $Id: JunitTestSuite.java,v 1.18 2005-10-24 16:14:57 dvojtise Exp $
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

import junit.framework.TestSuite;
import junit.textui.TestRunner;
import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.util.LogConfigurationHelper;
import fr.irisa.triskell.kermeta.utils.URIMapUtil;

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class JunitTestSuite extends TestSuite {

	final static public Logger internalLog = LogConfigurationHelper.getLogger("JunitTestSuite");
    RunJunitFactory runfactory = new RunJunitFactory();
    
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
		
		KermetaUnit.STD_LIB_URI = "lib/framework.km";
		
		File file = new File("uri.map");
		if (file.exists())
		{	// if this file exists, load its content as a uri.map, this map is used by EMF while loading indirect files
			URIConverterImpl.URI_MAP.putAll(URIMapUtil.readMapFile(file));
			URI u = URI.createURI(file.getName());
	    	if (u.isRelative()) {
	    		URIConverter c = new URIConverterImpl();
	    		u = u.resolve(c.normalize(URI.createURI(file.getName())));    			
	    	}
			internalLog.info("Loading URI_MAP from file: " + u.toFileString());
		}

		// do not modify this comment
/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/kmt_testcases","027_testRuntimeModelImport.main.kmt" );

		testWithFile("test/kmt_testcases","10_testLoop.main.kmt" );

		testWithFile("test/kmt_testcases","11_testBenchmark.main.kmt" );

		testWithFile("test/kmt_testcases","13_testString.main.kmt" );

		testWithFile("test/kmt_testcases","14_testExternJavaCall.main.kmt" );

		testWithFile("test/kmt_testcases","15_testAttributes.main.kmt" );

		testWithFile("test/kmt_testcases","16_testParametricClasses.main.kmt" );

		testWithFile("test/kmt_testcases","17_testSuperFeaturesCalls.main.kmt" );

		testWithFile("test/kmt_testcases","18_testExceptions.main.kmt" );

		testWithFile("test/kmt_testcases","19_ReflectionTest.main.kmt" );

		testWithFile("test/kmt_testcases","1_testAssignment.main.kmt" );

		testWithFile("test/kmt_testcases","20_testContainment.main.kmt" );

		testWithFile("test/kmt_testcases","21_testOpposites.main.kmt" );

		testWithFile("test/kmt_testcases","22_testEnum.main.kmt" );

		testWithFile("test/kmt_testcases","23_testSimpleException.main.kmt" );

		testWithFile("test/kmt_testcases","24_testZeroDivision.main.kmt" );

		testWithFile("test/kmt_testcases","25_testParametricOperations.main.kmt" );

		testWithFile("test/kmt_testcases","26_testMetaClass.main.kmt" );

		testWithFile("test/kmt_testcases","2_testArithm.main.kmt" );

		testWithFile("test/kmt_testcases","3_testOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","4_testOpOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","5_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","6_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","7_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","8_testOpInternPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","9_testOpCallObject.main.kmt" );

		testWithFile("test/kmt_testcases","testArithm.main.kmt" );

		testWithFile("test/kmt_testcases","testBoolean.main.kmt" );

		testWithFile("test/kmt_testcases","testBooleanResults.main.kmt" );

		testWithFile("test/kmt_testcases","testFrameworkToString.main.kmt" );

		testWithFile("test/kmt_testcases","testHashtable.main.kmt" );

		testWithFile("test/kmt_testcases","testIterator.main.kmt" );

		testWithFile("test/kmt_testcases","testLambda.main.kmt" );

		testWithFile("test/kmt_testcases","testReferences.main.kmt" );

		testWithFile("test/kmt_testcases","testSequence.main.kmt" );

		testWithFile("test/kmt_testcases","testSet.main.kmt" );

		testWithFile("test/kmt_testcases","testSimpleEval.main.kmt" );

		testWithFile("test/kmt_testcases","testSubPackage.main.kmt" );

		testWithFile("test/kmt_testcases","testVariable.main.kmt" );

		testWithFile("test/kmt_testcases","test_clone.main.kmt" );

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
	    addTest(runfactory.addTestsForUnit(dir+"/"+file));
	}
	
	public static void main(String[] args) {
		TestRunner.run(JunitTestSuite.class);
	}
}
