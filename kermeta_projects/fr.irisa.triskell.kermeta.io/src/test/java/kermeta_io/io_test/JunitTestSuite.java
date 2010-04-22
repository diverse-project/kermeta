/* $Id: JunitTestSuite.java,v 1.14 2008-05-27 12:58:36 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : JunitTestSuite.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 *        	Franck FLEUREY (ffleurey@irisa.fr)
 * Description : 
 *        	Kermeta TestSuite for io project
 * 			this file is partially generated using GenerateJUnitTestSuite. 
 * 			Do not manually modify the generated part. 
 */

package kermeta_io.io_test;

import java.net.URISyntaxException;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.core.helper.FileHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KMTOutputBuilder;
import org.kermeta.io.util2.UserDirURI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.irisa.triskell.eclipse.resources.URIHelper;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.tests.comparison.EMFCompareModelHelper;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
 */
public class JunitTestSuite extends TestCase {

	public static final String PLUGIN_TESTS_PATH = "platform:/resource/fr.irisa.triskell.kermeta.io/";
	
	static private String EXPECTED_KM_FOLDER = "/expected_output/km";
	
	static private String OUTPUT_KM_FOLDER = "/output";

	static private String OUTPUT_KMT_FOLDER = "/output";
	
	final static public Logger internalLog = LoggerFactory.getLogger(JunitTestSuite.class);

	
	static private IOPlugin ioPlugin;
	
	public JunitTestSuite(String arg0) throws URISyntaxException {
		super(arg0);
		initialize();
	}
	
	private void initialize() throws URISyntaxException {

		if ( ioPlugin == null ) {

			//org.apache.log4j.BasicConfigurator.configure();
			//org.kermeta.slf4j.eclipse.Activator.getDefault().configureLog4JLogger("../org.kermeta.slf4j.eclipse/kermeta_log4j_configuration.xml");			
			//IOPlugin.LOCAL_USE = true;
			// initialize URIMap
			// find the root of the environment
			// use http://java.sun.com/j2se/1.5.0/docs/guide/lang/resources.html
			java.net.URI rootDir = null;
			rootDir = getClass().getResource("/").toURI().resolve("..");
			System.out.println("rootDir = "+"file:/"+rootDir.getPath());
			
				
			String resource = "file:/"+rootDir.getPath()+ "test-workspace/";
			ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI.createURI(resource));
			ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI(resource));
			//System.out.println("");
			System.out.println("\tplatform:/resource/ -> " + resource);
			System.out.println("\tplatform:/plugin/ -> " + resource);
		}

	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}


	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	// do not modify this comment

/*** BEGIN GENERATED TESTS ***/
public void test001_externalSuperType() throws Exception {
testWithFile("src/test/resources/io_tests/ecore_testcases","001_externalSuperType.ecore" );
}

public void test002_externalDataType() throws Exception {
testWithFile("src/test/resources/io_tests/ecore_testcases","002_externalDataType.ecore" );
}

public void test003_externalType() throws Exception {
testWithFile("src/test/resources/io_tests/ecore_testcases","003_externalType.ecore" );
}

public void testpuzzle() throws Exception {
testWithFile("src/test/resources/io_tests/ecore_testcases","puzzle.ecore" );
}

public void testSimple() throws Exception {
testWithFile("src/test/resources/io_tests/ecore_testcases","Simple.ecore" );
}

public void testUML2() throws Exception {
testWithFile("src/test/resources/io_tests/ecore_testcases","UML2.ecore" );
}

public void test001_testPackageDeclaration() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","001_testPackageDeclaration.kmt" );
}

public void test001_testPackageDeclarationWithURI() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","001_testPackageDeclarationWithURI.kmt" );
}

public void test10_testEnum() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","10_testEnum.kmt" );
}

public void test1_testAssignment() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","1_testAssignment.kmt" );
}

public void test2_testArithm() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","2_testArithm.kmt" );
}

public void test3_testOpCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","3_testOpCall.kmt" );
}

public void test4_testOpOpCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","4_testOpOpCall.kmt" );
}

public void test5_testExternPackageCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","5_testExternPackageCall.kmt" );
}

public void test5_testOpPkgCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","5_testOpPkgCall.kmt" );
}

public void test6_failtestExternPackageCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","6_failtestExternPackageCall.kmt" );
}

public void test6_testExternPackageCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","6_testExternPackageCall.kmt" );
}

public void test6_testExternPackageCall2() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","6_testExternPackageCall2.kmt" );
}

public void test6_testOpPkgCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","6_testOpPkgCall.kmt" );
}

public void test7_testInterPackageCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","7_testInterPackageCall.kmt" );
}

public void test7_testOpPkgCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","7_testOpPkgCall.kmt" );
}

public void test8_testOpInternPkgCall() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","8_testOpInternPkgCall.kmt" );
}

public void test9_testOpCallObject() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","9_testOpCallObject.kmt" );
}

public void testtestBlock() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testBlock.kmt" );
}

public void testtestBlocksSequence() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testBlocksSequence.kmt" );
}

public void testtestCallExp() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testCallExp.kmt" );
}

public void testtestClass() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testClass.kmt" );
}

public void testtestConditional() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testConditional.kmt" );
}

public void testtestCycleA() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testCycleA.kmt" );
}

public void testtestCycleB() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testCycleB.kmt" );
}

public void testtestCycleC() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testCycleC.kmt" );
}

public void testtestCycleD() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testCycleD.kmt" );
}

public void testtestCycleE() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testCycleE.kmt" );
}

public void testtestEnum() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testEnum.kmt" );
}

public void testtestExpression() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testExpression.kmt" );
}

public void testtestExtractOperation() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testExtractOperation.kmt" );
}

public void testtestGenericClass() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testGenericClass.kmt" );
}

public void testtestImportAlias() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testImportAlias.kmt" );
}

public void testtestInjectOperation() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testInjectOperation.kmt" );
}

public void testtestInterDependA() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testInterDependA.kmt" );
}

public void testtestInterDependB() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testInterDependB.kmt" );
}

public void testtestLambdaExpressionAsCallFeature() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testLambdaExpressionAsCallFeature.kmt" );
}

public void testtestLoadStdLibSource() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testLoadStdLibSource.kmt" );
}

public void testtestMCommentAlone() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testMCommentAlone.kmt" );
}

public void testtestMCommentBegin() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testMCommentBegin.kmt" );
}

public void testtestMCommentEmptyOp() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testMCommentEmptyOp.kmt" );
}

public void testtestMCommentInline() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testMCommentInline.kmt" );
}

public void testtestMCommentMany() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testMCommentMany.kmt" );
}

public void testtestMCommentMiddleOfLoop() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testMCommentMiddleOfLoop.kmt" );
}

public void testtestModelType() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testModelType.kmt" );
}

public void testtestModelTypesStateMachines() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testModelTypesStateMachines.kmt" );
}

public void testtestOperation() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testOperation.kmt" );
}

public void testtestOperationOnObject() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testOperationOnObject.kmt" );
}

public void testtestPackage() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackage.kmt" );
}

public void testtestPackageDepA() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackageDepA.kmt" );
}

public void testtestPackageDepA2() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackageDepA2.kmt" );
}

public void testtestPackageDepB() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackageDepB.kmt" );
}

public void testtestPackageDepB2() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackageDepB2.kmt" );
}

public void testtestPackageDepC() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackageDepC.kmt" );
}

public void testtestPackageDepC2() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackageDepC2.kmt" );
}

public void testtestPackageDepD() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackageDepD.kmt" );
}

public void testtestPackageDepD2() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPackageDepD2.kmt" );
}

public void testtestPrimitiveType() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPrimitiveType.kmt" );
}

public void testtestPrimitiveType2() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testPrimitiveType2.kmt" );
}

public void testtestProperty() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testProperty.kmt" );
}

public void testtestResult() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testResult.kmt" );
}

public void testtestSCommentAlone() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSCommentAlone.kmt" );
}

public void testtestSCommentBegin() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSCommentBegin.kmt" );
}

public void testtestSCommentEmptyOp() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSCommentEmptyOp.kmt" );
}

public void testtestSCommentEndOfFile() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSCommentEndOfFile.kmt" );
}

public void testtestSCommentInline() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSCommentInline.kmt" );
}

public void testtestSCommentMany() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSCommentMany.kmt" );
}

public void testtestSCommentMiddleOfLoop() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSCommentMiddleOfLoop.kmt" );
}

public void testtestSimpleAnnotations() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSimpleAnnotations.kmt" );
}

public void testtestSimpleAnnotations2() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSimpleAnnotations2.kmt" );
}

public void testtestSimpleCond() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSimpleCond.kmt" );
}

public void testtestSimpleExpression() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSimpleExpression.kmt" );
}

public void testtestSimpleLoop() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testSimpleLoop.kmt" );
}

public void testtestVariable() throws Exception {
testWithFile("src/test/resources/io_tests/kmt_testcases","testVariable.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment
	
public void testWithFile(String dir, String file) {
	internalLog.debug(" *** testWithFile " + file);
	
	UserDirURI.createDirFromName(PLUGIN_TESTS_PATH+dir+"/output");
	internalLog.debug("createDirFromName " +PLUGIN_TESTS_PATH+dir+"/output");
	
	String kmFile = FileHelper.replaceExtension(file, "km");
	// The file can either be an ecore or a kmt
	String kmtFile = FileHelper.replaceExtension(file, "kmt");
	
	String outputKMFolder = PLUGIN_TESTS_PATH + dir + OUTPUT_KM_FOLDER;
	String outputKMTFolder = PLUGIN_TESTS_PATH + dir + OUTPUT_KMT_FOLDER;
	
	String sourceFileURI = PLUGIN_TESTS_PATH + dir + "/" + file;
	String outputFileURI = outputKMTFolder + "/" + kmtFile;
	String expectedKMFileURI = PLUGIN_TESTS_PATH + dir + EXPECTED_KM_FOLDER + "/" + kmFile;
	String outputKMFileURI =  outputKMFolder + "/" + kmFile;
	
	try {
		// Loading the source file
		KermetaUnit source = IOPlugin.getDefault().getEditionKermetaUnitStore().get(sourceFileURI, null);

		// Is the load correct ?
		assertTrue("Errors when loading the source kmt : " + KermetaUnitHelper.getAllErrorsAsString(source), KermetaUnitHelper.getAllErrors(source).isEmpty() );
		
		// Pretty print the file
		KMTOutputBuilder builder = new KMTOutputBuilder();
		internalLog.debug("outputFileURI=" +outputFileURI);
		builder.print(source, null, outputFileURI);
		builder.flush();
		
		for (KermetaUnit importedUnit : source.getImportedKermetaUnits()){
			if(importedUnit.getUri().startsWith(PLUGIN_TESTS_PATH + dir)){
				// then the imported units also need to be printed for a comparison against expected_output
				builder = new KMTOutputBuilder();
				String importedUnitOutputFileURI = importedUnit.getUri().replaceFirst(PLUGIN_TESTS_PATH + dir, outputKMTFolder);
				UserDirURI.createDirFromName(URIHelper.removeFileName(importedUnitOutputFileURI));
				internalLog.debug("importedUnitOutputFileURI=" +importedUnitOutputFileURI);
				builder.print(importedUnit, null, importedUnitOutputFileURI);
				builder.flush();
			}
		}
			
		
		// Loading the generated kmt file
		KermetaUnit kmtOutput = IOPlugin.getDefault().getEditionKermetaUnitStore().get(outputFileURI, null);

		// Is the load correct ?
		assertTrue("Errors when loading the output kmt : " + KermetaUnitHelper.getAllErrorsAsString(kmtOutput), KermetaUnitHelper.getAllErrors(kmtOutput).isEmpty() );
		
		// Exporting the source file into km
		KmExporter exporter = new KmExporter();
		internalLog.debug("outputKMFileURI=" +outputKMFileURI);
		exporter.export(source, "", outputKMFileURI, false);
		
		// Loading the generated km file
		KermetaUnit kmOutput = IOPlugin.getDefault().getEditionKermetaUnitStore().get(outputKMFileURI, null);

		// Is the load correct ?
		assertTrue("Errors when loading the output km : " + KermetaUnitHelper.getAllErrorsAsString(kmOutput), KermetaUnitHelper.getAllErrors(kmOutput).isEmpty() );
		
		// Loading the expected file
		if ( FileHelper.exists(expectedKMFileURI) ) {
			KermetaUnit expected = IOPlugin.getDefault().getEditionKermetaUnitStore().get(expectedKMFileURI, null);			
			// Is the load correct ?
			assertTrue("Errors when loading the expected km : " + KermetaUnitHelper.getAllErrorsAsString(expected), KermetaUnitHelper.getAllErrors(expected).isEmpty() );		
			// Comparing
			assertTrue( "Comparison between source and expected", compare(kmOutput, expected) );
		}	
	} catch (URIMalformedException e) {
		assertTrue(e.getLocalizedMessage() != null ? e.getLocalizedMessage(): e.toString(), false);
	} catch (NotRegisteredURIException e) {
		assertTrue(e.getLocalizedMessage() != null ? e.getLocalizedMessage(): e.toString(), false);
	} catch (Exception e){
		assertTrue(e.getLocalizedMessage() != null ? e.getLocalizedMessage(): e.toString(), false);
	}	
	finally {
		
		/* LoaderPlugin.getDefault().unload( sourceFileURI );
		LoaderPlugin.getDefault().unload( expectedKMFileURI );
		LoaderPlugin.getDefault().unload( outputKMFileURI );
		LoaderPlugin.getDefault().unload( outputFileURI );*/
		IOPlugin.internalLog.debug(" Clearing LoaderPlugin between tests "); // note, this means that tests cannot be run in parallel
		IOPlugin.getDefault().unloadAll();
	
	}
	
	
	
	/*
	String fileURI = TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file;
	// phase 1 : test that it load correctly
	Map<Object, Object> options = new HashMap<Object, Object> ();
	options.put( LoadingOptions.ECORE_QuickFixEnabled, true );

	KermetaUnit builder = LoaderPlugin.getDefault().load(fileURI, options);
		
	if ( builder.isIndirectlyErroneous() )
		assertTrue( KermetaUnitHelper.getAllErrorsAsString(builder), false);
	
	else {	
	
		
		// phase 2 : verify that it can be save as an xmi (km file)
		try {				
			KmExporter exporter = new KmExporter();
			String outputDir = TestPlugin.PLUGIN_TESTS_PATH + dir + "/output";
			exporter.export(builder, outputDir);
		}
		catch (Throwable t){
			fail("file "+file+" didn't serialize correctly into km; "+t.getMessage());
		}
		
		// phase 3 :
		// try to pretty-print the result in another file
		//URI userLocatedPpfile=UserDirURI.createURI(dir + "/output/"  + file.replace('.', '_') + ".kmt",null,true);
		//String ppfile =userLocatedPpfile.toString();
		String outputFile = file.replaceAll("(.+)\\.+.+", "$1\\.kmt");
		String ppfile = TestPlugin.PLUGIN_TESTS_PATH + dir + "/output/"  + outputFile;
		
		KMTOutputBuilder kmtExporter = new KMTOutputBuilder();
		kmtExporter.print(builder, TestPlugin.PLUGIN_TESTS_PATH + dir + "/output");
		kmtExporter.flush();
				
		// Phase 3 bis cannot be run on a per file basis if there is a cycle in the file dependencies
		// this should be run globally, currently, just ignore this phase
		// test for require cycles
		if( ! hasDependencyCycle(builder) ){
			
			LoaderPlugin.getDefault().unload(fileURI);
			// phase 3 bis, check that the prettyprinted version can be parsed 
			// try to re-parse the pretty-printed version
			KermetaUnit builder2 = LoaderPlugin.getDefault().load(ppfile, options);
			if ( builder2.isIndirectlyErroneous() )
				assertTrue("RE-PARSE : " + KermetaUnitHelper.getErrorsAsString(builder2), false);
			LoaderPlugin.getDefault().unload( builder2.getUri() );
		} else
			System.out.println("Ignoring phase 3bis of " + builder.getUri() + ", due to a cycle in its require statements. \n (in this case a per file basis test cannot be applied)");
	}
	*/
	//LoaderPlugin.getDefault().unload(fileURI);
}
/*
	protected boolean hasDependencyCycle(KermetaUnit ku){
		List<KermetaUnit> kuList = ku.getImportedKermetaUnits();
		boolean hasDependencyCycle = false;
		Iterator<KermetaUnit> it = kuList.iterator();
		while(!hasDependencyCycle && it.hasNext()){
			KermetaUnit importedKU = (KermetaUnit)it.next();
			List<KermetaUnit> kuSubList = importedKU.getImportedKermetaUnits();
			Iterator<KermetaUnit> subIt = kuSubList.iterator();
			while(!hasDependencyCycle && subIt.hasNext()){
				if(subIt.next() == ku) hasDependencyCycle = true; 
		
			}
		}
			
		return hasDependencyCycle;	
	}*/

	private boolean compare(KermetaUnit source, KermetaUnit expected) {
		return ! EMFCompareModelHelper.isDifferent(source.getModelingUnit(), expected.getModelingUnit());
	}

}
