/* $Id: JunitTestSuite.java,v 1.4 2006-10-25 08:30:35 dvojtise Exp $
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
package kermeta_interpreter.emf_test;

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
		testWithFile("test/emf_testcases/kermeta","027_testRuntimeModelImport.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","028_testLoadEcoreFile.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","044_testFrameworkModelConformance.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","047_testLoadEcoreSplittedModel.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","048_testLoadEcoreSplittedModel_withCyclicref.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","049_testSplittedMetaModel.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","050_testChunkedModel.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","051_testSaveEcoreSplittedXRefModel.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","052_testSaveEcoreSplittedModel.main.kmt" );

		testWithFile("test/emf_testcases/kermeta","053_savingKM.main.kmt" );

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
