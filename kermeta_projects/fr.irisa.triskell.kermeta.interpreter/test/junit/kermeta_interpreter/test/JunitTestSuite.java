/* $Id: JunitTestSuite.java,v 1.28 2007-02-22 14:28:06 ffleurey Exp $
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
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;
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
		
		StdLibKermetaUnitHelper.STD_LIB_URI = "lib/framework.km";
		
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
		testWithFile("test/kmt_testcases","001_testAssignment.main.kmt" );

		testWithFile("test/kmt_testcases","002_testArithm.main.kmt" );

		testWithFile("test/kmt_testcases","003_testOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","004_testOpOpCall.main.kmt" );

		testWithFile("test/kmt_testcases","005_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","006_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","007_testOpPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","008_testOpInternPkgCall.main.kmt" );

		testWithFile("test/kmt_testcases","009_testOpCallObject.main.kmt" );

		testWithFile("test/kmt_testcases","010_testLoop.main.kmt" );

		testWithFile("test/kmt_testcases","011_testBenchmark.main.kmt" );

		testWithFile("test/kmt_testcases","013_testString.main.kmt" );

		testWithFile("test/kmt_testcases","014_testExternJavaCall.main.kmt" );

		testWithFile("test/kmt_testcases","015_testAttributes.main.kmt" );

		testWithFile("test/kmt_testcases","016_testParametricClasses.main.kmt" );

		testWithFile("test/kmt_testcases","017_testSuperFeaturesCalls.main.kmt" );

		testWithFile("test/kmt_testcases","018_testExceptions.main.kmt" );

		testWithFile("test/kmt_testcases","019_ReflectionTest.main.kmt" );

		testWithFile("test/kmt_testcases","020_testContainment.main.kmt" );

		testWithFile("test/kmt_testcases","021_testOpposites.main.kmt" );

		testWithFile("test/kmt_testcases","022_testEnum.main.kmt" );

		testWithFile("test/kmt_testcases","023_testSimpleException.main.kmt" );

		testWithFile("test/kmt_testcases","024_testZeroDivision.main.kmt" );

		testWithFile("test/kmt_testcases","025_testParametricOperations.main.kmt" );

		testWithFile("test/kmt_testcases","026_testMetaClass.main.kmt" );

		testWithFile("test/kmt_testcases","029_testClone1.main.kmt" );

		testWithFile("test/kmt_testcases","029_testClone2.main.kmt" );

		testWithFile("test/kmt_testcases","030_kermetaSignature.main.kmt" );

		testWithFile("test/kmt_testcases","031_testVariable.main.kmt" );

		testWithFile("test/kmt_testcases","032_testBoolean.main.kmt" );

		testWithFile("test/kmt_testcases","033_testBooleanResults.main.kmt" );

		testWithFile("test/kmt_testcases","034_testFrameworkToString.main.kmt" );

		testWithFile("test/kmt_testcases","035_testHashtable.main.kmt" );

		testWithFile("test/kmt_testcases","036_testIterator.main.kmt" );

		testWithFile("test/kmt_testcases","037_testLambda.main.kmt" );

		testWithFile("test/kmt_testcases","038_testReferences.main.kmt" );

		testWithFile("test/kmt_testcases","039_testSequence.main.kmt" );

		testWithFile("test/kmt_testcases","040_testSet.main.kmt" );

		testWithFile("test/kmt_testcases","041_testDynamicExpression.main.kmt" );

		testWithFile("test/kmt_testcases","041_testSimpleEval.main.kmt" );

		testWithFile("test/kmt_testcases","042_testSubPackage.main.kmt" );

		testWithFile("test/kmt_testcases","043_testUML2km.main.kmt" );

		testWithFile("test/kmt_testcases","045_testContainsInCollection.main.kmt" );

		testWithFile("test/kmt_testcases","046_testClassEquals.main.kmt" );

		testWithFile("test/kmt_testcases","051_scopeVisibility.main.kmt" );

		testWithFile("test/kmt_testcases","052_testReadWriteParameter.main.kmt" );

		testWithFile("test/kmt_testcases","053_testCollection.main.kmt" );

		testWithFile("test/kmt_testcases","054_testIsKindOf.main.kmt" );

		testWithFile("test/kmt_testcases","056_testIsSameAs.main.kmt" );

		testWithFile("test/kmt_testcases","057_testIsNotSameAs.main.kmt" );

		testWithFile("test/kmt_testcases","058_testEqualsOnCollection.main.kmt" );

		testWithFile("test/kmt_testcases","059_testFreezeOnNewClass.main.kmt" );

		testWithFile("test/kmt_testcases","060_testNewOnModelTypeClass.main.kmt" );

		testWithFile("test/kmt_testcases","061_weaving_in_kermeta_aspect1.main.kmt" );

		testWithFile("test/kmt_testcases","62_testIsInstanceOf.main.kmt" );

		testWithFile("test/kmt_testcases","63_testAsType.main.kmt" );

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
		addTest(new RunJunitFactory().addTestsForUnit(dir+"/"+file));
	}
	
	public static void main(String[] args) {
		TestRunner.run(JunitTestSuite.class);
	}
}
