/* $Id: JunitTestSuite.java,v 1.11 2008-04-07 15:33:48 dvojtise Exp $
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

package kermeta_io.test;

import junit.framework.TestCase;

import org.kermeta.core.helper.FileHelper;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KMTOutputBuilder;
import org.kermeta.io.util2.UserDirURI;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.tests.comparison.EMFCompareModelHelper;
import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
 */
public class JunitTestSuite extends TestCase {

	static private String EXPECTED_KM_FOLDER = "/expected_output/km";
	
	static private String OUTPUT_KM_FOLDER = "/output";

	static private String OUTPUT_KMT_FOLDER = "/output";

	
	static private IOPlugin ioPlugin;
	
	public JunitTestSuite(String arg0) {
		super(arg0);
		initialize();
		System.setProperty(fr.irisa.triskell.kermeta.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
		        "../fr.irisa.triskell.kermeta.texteditor/kermeta_log4j_configuration.xml");
	}
	
	private void initialize() {

		if ( ioPlugin == null ) {

			IOPlugin.LOCAL_USE = true;
			ioPlugin = IOPlugin.getDefault();
			//LoaderPlugin.LOAD_FRAMEWORK = false;
		
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
testWithFile("test/io/ecore_testcases","001_externalSuperType.ecore" );
}

public void test002_externalDataType() throws Exception {
	testWithFile("test/io/ecore_testcases","002_externalDataType.ecore" );
}

public void test003_externalType() throws Exception {
	testWithFile("test/io/ecore_testcases","003_externalType.ecore" );
}

public void testSimple() throws Exception {
testWithFile("test/io/ecore_testcases","Simple.ecore" );
}

public void testUML2() throws Exception {
testWithFile("test/io/ecore_testcases","UML2.ecore" );
}

public void testpuzzle() throws Exception {
testWithFile("test/io/ecore_testcases","puzzle.ecore" );
}

public void test001_testPackageDeclaration() throws Exception {
testWithFile("test/io/kmt_testcases","001_testPackageDeclaration.kmt" );
}

public void test001_testPackageDeclarationWithURI() throws Exception {
testWithFile("test/io/kmt_testcases","001_testPackageDeclarationWithURI.kmt" );
}

public void test10_testEnum() throws Exception {
testWithFile("test/io/kmt_testcases","10_testEnum.kmt" );
}

public void test1_testAssignment() throws Exception {
testWithFile("test/io/kmt_testcases","1_testAssignment.kmt" );
}

public void test2_testArithm() throws Exception {
testWithFile("test/io/kmt_testcases","2_testArithm.kmt" );
}

public void test3_testOpCall() throws Exception {
testWithFile("test/io/kmt_testcases","3_testOpCall.kmt" );
}

public void test4_testOpOpCall() throws Exception {
testWithFile("test/io/kmt_testcases","4_testOpOpCall.kmt" );
}

public void test5_testExternPackageCall() throws Exception {
testWithFile("test/io/kmt_testcases","5_testExternPackageCall.kmt" );
}

public void test5_testOpPkgCall() throws Exception {
testWithFile("test/io/kmt_testcases","5_testOpPkgCall.kmt" );
}

public void test6_failtestExternPackageCall() throws Exception {
testWithFile("test/io/kmt_testcases","6_failtestExternPackageCall.kmt" );
}

public void test6_testExternPackageCall() throws Exception {
testWithFile("test/io/kmt_testcases","6_testExternPackageCall.kmt" );
}

public void test6_testExternPackageCall2() throws Exception {
testWithFile("test/io/kmt_testcases","6_testExternPackageCall2.kmt" );
}

public void test6_testOpPkgCall() throws Exception {
testWithFile("test/io/kmt_testcases","6_testOpPkgCall.kmt" );
}

public void test7_testInterPackageCall() throws Exception {
testWithFile("test/io/kmt_testcases","7_testInterPackageCall.kmt" );
}

public void test7_testOpPkgCall() throws Exception {
testWithFile("test/io/kmt_testcases","7_testOpPkgCall.kmt" );
}

public void test8_testOpInternPkgCall() throws Exception {
testWithFile("test/io/kmt_testcases","8_testOpInternPkgCall.kmt" );
}

public void test9_testOpCallObject() throws Exception {
testWithFile("test/io/kmt_testcases","9_testOpCallObject.kmt" );
}

public void testtestBlock() throws Exception {
testWithFile("test/io/kmt_testcases","testBlock.kmt" );
}

public void testtestBlocksSequence() throws Exception {
testWithFile("test/io/kmt_testcases","testBlocksSequence.kmt" );
}

public void testtestCallExp() throws Exception {
testWithFile("test/io/kmt_testcases","testCallExp.kmt" );
}

public void testtestClass() throws Exception {
testWithFile("test/io/kmt_testcases","testClass.kmt" );
}

public void testtestConditional() throws Exception {
testWithFile("test/io/kmt_testcases","testConditional.kmt" );
}

public void testtestCycleA() throws Exception {
testWithFile("test/io/kmt_testcases","testCycleA.kmt" );
}

public void testtestCycleB() throws Exception {
testWithFile("test/io/kmt_testcases","testCycleB.kmt" );
}

public void testtestCycleC() throws Exception {
testWithFile("test/io/kmt_testcases","testCycleC.kmt" );
}

public void testtestCycleD() throws Exception {
testWithFile("test/io/kmt_testcases","testCycleD.kmt" );
}

public void testtestCycleE() throws Exception {
testWithFile("test/io/kmt_testcases","testCycleE.kmt" );
}

public void testtestEnum() throws Exception {
testWithFile("test/io/kmt_testcases","testEnum.kmt" );
}

public void testtestExpression() throws Exception {
testWithFile("test/io/kmt_testcases","testExpression.kmt" );
}

public void testtestExtractOperation() throws Exception {
testWithFile("test/io/kmt_testcases","testExtractOperation.kmt" );
}

public void testtestGenericClass() throws Exception {
testWithFile("test/io/kmt_testcases","testGenericClass.kmt" );
}

public void testtestImportAlias() throws Exception {
testWithFile("test/io/kmt_testcases","testImportAlias.kmt" );
}

public void testtestInjectOperation() throws Exception {
testWithFile("test/io/kmt_testcases","testInjectOperation.kmt" );
}

public void testtestInterDependA() throws Exception {
testWithFile("test/io/kmt_testcases","testInterDependA.kmt" );
}

public void testtestInterDependB() throws Exception {
testWithFile("test/io/kmt_testcases","testInterDependB.kmt" );
}

public void testtestLambdaExpressionAsCallFeature() throws Exception {
testWithFile("test/io/kmt_testcases","testLambdaExpressionAsCallFeature.kmt" );
}

public void testtestLoadStdLibSource() throws Exception {
testWithFile("test/io/kmt_testcases","testLoadStdLibSource.kmt" );
}

public void testtestMCommentAlone() throws Exception {
testWithFile("test/io/kmt_testcases","testMCommentAlone.kmt" );
}

public void testtestMCommentBegin() throws Exception {
testWithFile("test/io/kmt_testcases","testMCommentBegin.kmt" );
}

public void testtestMCommentEmptyOp() throws Exception {
testWithFile("test/io/kmt_testcases","testMCommentEmptyOp.kmt" );
}

public void testtestMCommentInline() throws Exception {
testWithFile("test/io/kmt_testcases","testMCommentInline.kmt" );
}

public void testtestMCommentMany() throws Exception {
testWithFile("test/io/kmt_testcases","testMCommentMany.kmt" );
}

public void testtestMCommentMiddleOfLoop() throws Exception {
testWithFile("test/io/kmt_testcases","testMCommentMiddleOfLoop.kmt" );
}

public void testtestModelType() throws Exception {
testWithFile("test/io/kmt_testcases","testModelType.kmt" );
}

public void testtestModelTypesStateMachines() throws Exception {
testWithFile("test/io/kmt_testcases","testModelTypesStateMachines.kmt" );
}

public void testtestOperation() throws Exception {
testWithFile("test/io/kmt_testcases","testOperation.kmt" );
}

public void testtestOperationOnObject() throws Exception {
testWithFile("test/io/kmt_testcases","testOperationOnObject.kmt" );
}

public void testtestPackage() throws Exception {
testWithFile("test/io/kmt_testcases","testPackage.kmt" );
}

public void testtestPackageDepA() throws Exception {
testWithFile("test/io/kmt_testcases","testPackageDepA.kmt" );
}

public void testtestPackageDepA2() throws Exception {
testWithFile("test/io/kmt_testcases","testPackageDepA2.kmt" );
}

public void testtestPackageDepB() throws Exception {
testWithFile("test/io/kmt_testcases","testPackageDepB.kmt" );
}

public void testtestPackageDepB2() throws Exception {
testWithFile("test/io/kmt_testcases","testPackageDepB2.kmt" );
}

public void testtestPackageDepC() throws Exception {
testWithFile("test/io/kmt_testcases","testPackageDepC.kmt" );
}

public void testtestPackageDepC2() throws Exception {
testWithFile("test/io/kmt_testcases","testPackageDepC2.kmt" );
}

public void testtestPackageDepD() throws Exception {
testWithFile("test/io/kmt_testcases","testPackageDepD.kmt" );
}

public void testtestPackageDepD2() throws Exception {
testWithFile("test/io/kmt_testcases","testPackageDepD2.kmt" );
}

public void testtestPrimitiveType() throws Exception {
testWithFile("test/io/kmt_testcases","testPrimitiveType.kmt" );
}

public void testtestPrimitiveType2() throws Exception {
testWithFile("test/io/kmt_testcases","testPrimitiveType2.kmt" );
}

public void testtestProperty() throws Exception {
testWithFile("test/io/kmt_testcases","testProperty.kmt" );
}

public void testtestResult() throws Exception {
testWithFile("test/io/kmt_testcases","testResult.kmt" );
}

public void testtestSCommentAlone() throws Exception {
testWithFile("test/io/kmt_testcases","testSCommentAlone.kmt" );
}

public void testtestSCommentBegin() throws Exception {
testWithFile("test/io/kmt_testcases","testSCommentBegin.kmt" );
}

public void testtestSCommentEmptyOp() throws Exception {
testWithFile("test/io/kmt_testcases","testSCommentEmptyOp.kmt" );
}

public void testtestSCommentEndOfFile() throws Exception {
testWithFile("test/io/kmt_testcases","testSCommentEndOfFile.kmt" );
}

public void testtestSCommentInline() throws Exception {
testWithFile("test/io/kmt_testcases","testSCommentInline.kmt" );
}

public void testtestSCommentMany() throws Exception {
testWithFile("test/io/kmt_testcases","testSCommentMany.kmt" );
}

public void testtestSCommentMiddleOfLoop() throws Exception {
testWithFile("test/io/kmt_testcases","testSCommentMiddleOfLoop.kmt" );
}

public void testtestSimpleAnnotations() throws Exception {
testWithFile("test/io/kmt_testcases","testSimpleAnnotations.kmt" );
}

public void testtestSimpleAnnotations2() throws Exception {
testWithFile("test/io/kmt_testcases","testSimpleAnnotations2.kmt" );
}

public void testtestSimpleCond() throws Exception {
testWithFile("test/io/kmt_testcases","testSimpleCond.kmt" );
}

public void testtestSimpleExpression() throws Exception {
testWithFile("test/io/kmt_testcases","testSimpleExpression.kmt" );
}

public void testtestSimpleLoop() throws Exception {
testWithFile("test/io/kmt_testcases","testSimpleLoop.kmt" );
}

public void testtestVariable() throws Exception {
testWithFile("test/io/kmt_testcases","testVariable.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment
	
public void testWithFile(String dir, String file) {
	UserDirURI.createDirFromName(dir+"/output");
	
	String kmFile = FileHelper.replaceExtension(file, "km");
	// The file can either be an ecore or a kmt
	String kmtFile = FileHelper.replaceExtension(file, "kmt");
	
	String outputKMFolder = TestPlugin.PLUGIN_TESTS_PATH + dir + OUTPUT_KM_FOLDER;
	String outputKMTFolder = TestPlugin.PLUGIN_TESTS_PATH + dir + OUTPUT_KMT_FOLDER;
	
	String sourceFileURI = TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file;
	String outputFileURI = outputKMTFolder + "/" + kmtFile;
	String expectedKMFileURI = TestPlugin.PLUGIN_TESTS_PATH + dir + EXPECTED_KM_FOLDER + "/" + kmFile;
	String outputKMFileURI =  outputKMFolder + "/" + kmFile;
	
	try {
		// Loading the source file
		KermetaUnit source = LoaderPlugin.getDefault().load(sourceFileURI, null);

		// Is the load correct ?
		assertTrue("Errors when loading the source kmt : " + KermetaUnitHelper.getAllErrorsAsString(source), KermetaUnitHelper.getAllErrors(source).isEmpty() );
		
		// Pretty print the file
		KMTOutputBuilder builder = new KMTOutputBuilder();
		builder.print(source, null, outputFileURI);
		builder.flush();
		
		for (KermetaUnit importedUnit : source.getImportedKermetaUnits()){
			if(importedUnit.getUri().startsWith(TestPlugin.PLUGIN_TESTS_PATH + dir)){
				// then the imported units also need to be printed for a comparison against expected_output
				builder = new KMTOutputBuilder();
				String importedUnitOutputFileURI = importedUnit.getUri().replaceFirst(TestPlugin.PLUGIN_TESTS_PATH + dir, outputKMTFolder);
				builder.print(importedUnit, null, importedUnitOutputFileURI);
				builder.flush();
			}
		}
			
		
		// Loading the generated kmt file
		KermetaUnit kmtOutput = LoaderPlugin.getDefault().load(outputFileURI, null);

		// Is the load correct ?
		assertTrue("Errors when loading the output kmt : " + KermetaUnitHelper.getAllErrorsAsString(kmtOutput), KermetaUnitHelper.getAllErrors(kmtOutput).isEmpty() );
		
		// Exporting the source file into km
		KmExporter exporter = new KmExporter();
		exporter.export(source, null, outputKMFileURI);
		
		// Loading the generated km file
		KermetaUnit kmOutput = LoaderPlugin.getDefault().load(outputKMFileURI, null);

		// Is the load correct ?
		assertTrue("Errors when loading the output km : " + KermetaUnitHelper.getAllErrorsAsString(kmOutput), KermetaUnitHelper.getAllErrors(kmOutput).isEmpty() );
		
		// Loading the expected file
		if ( FileHelper.exists(expectedKMFileURI) ) {
			KermetaUnit expected = LoaderPlugin.getDefault().load(expectedKMFileURI, null);			
			// Is the load correct ?
			assertTrue("Errors when loading the expected km : " + KermetaUnitHelper.getAllErrorsAsString(expected), KermetaUnitHelper.getAllErrors(expected).isEmpty() );		
			// Comparing
			assertTrue( "Comparison between source and expected", compare(kmOutput, expected) );
		}	
	} catch (URIMalformedException e) {
		assertTrue(e.getLocalizedMessage(), false);
	} catch (NotRegisteredURIException e) {
		assertTrue(e.getLocalizedMessage(), false);
	} finally {
	
		LoaderPlugin.getDefault().unload( sourceFileURI );
		LoaderPlugin.getDefault().unload( expectedKMFileURI );
		LoaderPlugin.getDefault().unload( outputKMFileURI );
		LoaderPlugin.getDefault().unload( outputFileURI );
	
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
