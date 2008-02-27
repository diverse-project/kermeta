/* $Id: JunitTestSuite.java,v 1.8 2008-02-27 12:20:01 dvojtise Exp $
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

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.io.printer.KMTOutputBuilder;
import org.kermeta.io.util2.UserDirURI;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
 */
public class JunitTestSuite extends TestCase {

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
public void testpuzzle() throws Exception {
testWithFile("test/io/ecore_testcases","puzzle.ecore" );
}

public void testSimple() throws Exception {
testWithFile("test/io/ecore_testcases","Simple.ecore" );
}

public void testUML2() throws Exception {
testWithFile("test/io/ecore_testcases","UML2.ecore" );
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
	
public void testWithFile(String dir, String file) throws Exception {
	UserDirURI.createDirFromName(dir+"/output");
	
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
	
	//LoaderPlugin.getDefault().unload(fileURI);
}

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
	}
	/*
	public void ppUnit(KermetaUnit builder, String file, String dir) throws Exception  {
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		
		BufferedWriter w = new BufferedWriter(new FileWriter(new File(file)));
		String pkg_name = "package " + NamedElementHelper.getQualifiedName(builder.rootPackage) + ";\n\n";
		
		w.write("package " + NamedElementHelper.getQualifiedName(builder.rootPackage) + ";\n\n");
	
		Iterator it = builder.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			if (iu.rootPackage != builder.rootPackage) {
				//URI baseURI = UserDirURI.createURI(dir + "/output/", null, true);
				if (iu instanceof KMTUnit || iu instanceof KMUnit)
					w.write("require \"" + iu.getUri() + "\"\n");
				else {
					String f = dir + "/" + "output/" + iu.getRootPackage().getName()+ ".kmt";
					ppUnit(iu, f, dir);
					w.write("require \"" + iu.getRootPackage().getName()+ ".kmt" + "\"\n");
				}
			}
		}
		
		String str_kmt = pp.ppPackage(builder.rootPackage);
		// Do not write again the package declaration..
		w.write(str_kmt.substring(pkg_name.length()));
		w.close();
	}
	*/

}
