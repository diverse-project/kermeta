/* $Id: JunitTestSuite.java,v 1.17 2005-05-26 22:39:02 ffleurey Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : JunitTestSuite.java
 * License    : GPL
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.exporter.kmt.KM2KMTPrettyPrinter;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.kmt.KMTUnit;
import fr.irisa.triskell.kermeta.utils.UserDirURI;

import junit.framework.TestCase;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
 */
public class JunitTestSuite extends TestCase {


	public JunitTestSuite(String arg0) {
		super(arg0);
		System.setProperty(fr.irisa.triskell.kermeta.util.LogConfigurationHelper.DefaultKermetaConfigurationFilePropertyName,
		        "../fr.irisa.triskell.kermeta.texteditor/kermeta_log4j_configuration.xml");
		KermetaUnit.STD_LIB_URI = "./lib/framework.km";
	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}


	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	// do not modify this comment


/*** BEGIN GENERATED TESTS ***/
public void testSimple() throws Exception {
testWithFile("test/ecore_testcases","Simple.ecore" );
}

public void testemof() throws Exception {
testWithFile("test/emfatic_testcases","emof.emf" );
}

public void testmetacore() throws Exception {
testWithFile("test/emfatic_testcases","metacore.emf" );
}

public void test1_testAssignment() throws Exception {
testWithFile("test/kmt_testcases","1_testAssignment.kmt" );
}

public void test2_testArithm() throws Exception {
testWithFile("test/kmt_testcases","2_testArithm.kmt" );
}

public void test3_testOpCall() throws Exception {
testWithFile("test/kmt_testcases","3_testOpCall.kmt" );
}

public void test4_testOpOpCall() throws Exception {
testWithFile("test/kmt_testcases","4_testOpOpCall.kmt" );
}

public void test5_failtestExternPackageCall() throws Exception {
testWithFile("test/kmt_testcases","5_failtestExternPackageCall.kmt" );
}

public void test5_testExternPackageCall() throws Exception {
testWithFile("test/kmt_testcases","5_testExternPackageCall.kmt" );
}

public void test5_testOpPkgCall() throws Exception {
testWithFile("test/kmt_testcases","5_testOpPkgCall.kmt" );
}

public void test6_failtestExternPackageCall() throws Exception {
testWithFile("test/kmt_testcases","6_failtestExternPackageCall.kmt" );
}

public void test6_testExternPackageCall() throws Exception {
testWithFile("test/kmt_testcases","6_testExternPackageCall.kmt" );
}

public void test6_testExternPackageCall2() throws Exception {
testWithFile("test/kmt_testcases","6_testExternPackageCall2.kmt" );
}

public void test6_testOpPkgCall() throws Exception {
testWithFile("test/kmt_testcases","6_testOpPkgCall.kmt" );
}

public void test7_testInterPackageCall() throws Exception {
testWithFile("test/kmt_testcases","7_testInterPackageCall.kmt" );
}

public void test7_testOpPkgCall() throws Exception {
testWithFile("test/kmt_testcases","7_testOpPkgCall.kmt" );
}

public void test8_testOpInternPkgCall() throws Exception {
testWithFile("test/kmt_testcases","8_testOpInternPkgCall.kmt" );
}

public void test9_testOpCallObject() throws Exception {
testWithFile("test/kmt_testcases","9_testOpCallObject.kmt" );
}

public void testtestBlock() throws Exception {
testWithFile("test/kmt_testcases","testBlock.kmt" );
}

public void testtestBlocksSequence() throws Exception {
testWithFile("test/kmt_testcases","testBlocksSequence.kmt" );
}

public void testtestCallExp() throws Exception {
testWithFile("test/kmt_testcases","testCallExp.kmt" );
}

public void testtestClass() throws Exception {
testWithFile("test/kmt_testcases","testClass.kmt" );
}

public void testtestConditional() throws Exception {
testWithFile("test/kmt_testcases","testConditional.kmt" );
}

public void testtestCycleA() throws Exception {
testWithFile("test/kmt_testcases","testCycleA.kmt" );
}

public void testtestCycleB() throws Exception {
testWithFile("test/kmt_testcases","testCycleB.kmt" );
}

public void testtestCycleC() throws Exception {
testWithFile("test/kmt_testcases","testCycleC.kmt" );
}

public void testtestCycleD() throws Exception {
testWithFile("test/kmt_testcases","testCycleD.kmt" );
}

public void testtestCycleE() throws Exception {
testWithFile("test/kmt_testcases","testCycleE.kmt" );
}

public void testtestEnum() throws Exception {
testWithFile("test/kmt_testcases","testEnum.kmt" );
}

public void testtestExpression() throws Exception {
testWithFile("test/kmt_testcases","testExpression.kmt" );
}

public void testtestExtractOperation() throws Exception {
testWithFile("test/kmt_testcases","testExtractOperation.kmt" );
}

public void testtestImportAlias() throws Exception {
testWithFile("test/kmt_testcases","testImportAlias.kmt" );
}

public void testtestInjectOperation() throws Exception {
testWithFile("test/kmt_testcases","testInjectOperation.kmt" );
}

public void testtestInterDependA() throws Exception {
testWithFile("test/kmt_testcases","testInterDependA.kmt" );
}

public void testtestInterDependB() throws Exception {
testWithFile("test/kmt_testcases","testInterDependB.kmt" );
}

public void testtestLambdaExpressionAsCallFeature() throws Exception {
testWithFile("test/kmt_testcases","testLambdaExpressionAsCallFeature.kmt" );
}

public void testtestLoadStdLibSource() throws Exception {
testWithFile("test/kmt_testcases","testLoadStdLibSource.kmt" );
}

public void testtestMCommentAlone() throws Exception {
testWithFile("test/kmt_testcases","testMCommentAlone.kmt" );
}

public void testtestMCommentBegin() throws Exception {
testWithFile("test/kmt_testcases","testMCommentBegin.kmt" );
}

public void testtestMCommentEmptyOp() throws Exception {
testWithFile("test/kmt_testcases","testMCommentEmptyOp.kmt" );
}

public void testtestMCommentInline() throws Exception {
testWithFile("test/kmt_testcases","testMCommentInline.kmt" );
}

public void testtestMCommentMany() throws Exception {
testWithFile("test/kmt_testcases","testMCommentMany.kmt" );
}

public void testtestMCommentMiddleOfLoop() throws Exception {
testWithFile("test/kmt_testcases","testMCommentMiddleOfLoop.kmt" );
}

public void testtestOperation() throws Exception {
testWithFile("test/kmt_testcases","testOperation.kmt" );
}

public void testtestOperationOnObject() throws Exception {
testWithFile("test/kmt_testcases","testOperationOnObject.kmt" );
}

public void testtestPackage() throws Exception {
testWithFile("test/kmt_testcases","testPackage.kmt" );
}

public void testtestPackageDepA() throws Exception {
testWithFile("test/kmt_testcases","testPackageDepA.kmt" );
}

public void testtestPackageDepA2() throws Exception {
testWithFile("test/kmt_testcases","testPackageDepA2.kmt" );
}

public void testtestPackageDepB() throws Exception {
testWithFile("test/kmt_testcases","testPackageDepB.kmt" );
}

public void testtestPackageDepB2() throws Exception {
testWithFile("test/kmt_testcases","testPackageDepB2.kmt" );
}

public void testtestPackageDepC() throws Exception {
testWithFile("test/kmt_testcases","testPackageDepC.kmt" );
}

public void testtestPackageDepC2() throws Exception {
testWithFile("test/kmt_testcases","testPackageDepC2.kmt" );
}

public void testtestPackageDepD() throws Exception {
testWithFile("test/kmt_testcases","testPackageDepD.kmt" );
}

public void testtestPackageDepD2() throws Exception {
testWithFile("test/kmt_testcases","testPackageDepD2.kmt" );
}

public void testtestPrimitiveType() throws Exception {
testWithFile("test/kmt_testcases","testPrimitiveType.kmt" );
}

public void testtestProperty() throws Exception {
testWithFile("test/kmt_testcases","testProperty.kmt" );
}

public void testtestResult() throws Exception {
testWithFile("test/kmt_testcases","testResult.kmt" );
}

public void testtestSCommentAlone() throws Exception {
testWithFile("test/kmt_testcases","testSCommentAlone.kmt" );
}

public void testtestSCommentBegin() throws Exception {
testWithFile("test/kmt_testcases","testSCommentBegin.kmt" );
}

public void testtestSCommentEmptyOp() throws Exception {
testWithFile("test/kmt_testcases","testSCommentEmptyOp.kmt" );
}

public void testtestSCommentEndOfFile() throws Exception {
testWithFile("test/kmt_testcases","testSCommentEndOfFile.kmt" );
}

public void testtestSCommentInline() throws Exception {
testWithFile("test/kmt_testcases","testSCommentInline.kmt" );
}

public void testtestSCommentMany() throws Exception {
testWithFile("test/kmt_testcases","testSCommentMany.kmt" );
}

public void testtestSCommentMiddleOfLoop() throws Exception {
testWithFile("test/kmt_testcases","testSCommentMiddleOfLoop.kmt" );
}

public void testtestSimpleAnnotations() throws Exception {
testWithFile("test/kmt_testcases","testSimpleAnnotations.kmt" );
}

public void testtestSimpleCond() throws Exception {
testWithFile("test/kmt_testcases","testSimpleCond.kmt" );
}

public void testtestSimpleExpression() throws Exception {
testWithFile("test/kmt_testcases","testSimpleExpression.kmt" );
}

public void testtestSimpleLoop() throws Exception {
testWithFile("test/kmt_testcases","testSimpleLoop.kmt" );
}

public void testtestVariable() throws Exception {
testWithFile("test/kmt_testcases","testVariable.kmt" );
}

public void testtestExtOperation() throws Exception {
testWithFile("test/kmtbodies_testcases","testExtOperation.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment
	
	public void testWithFile(String dir, String file) throws Exception {
	//	MetaCoreUnit builder = new MetaCoreUnit();
	//	builder.loadMCT(new File(baseDir + file));
		KermetaUnitFactory.getDefaultLoader().unloadAll();
		KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(dir + "/" + file);
		try {
		builder.load();
		} catch(Exception e ) {if (builder.getError().size() == 0) throw e;};
		
		if (builder.getAllErrors().size() > 0) {
			assertTrue(builder.getAllMessagesAsString(), false);
		}
		else {	
			
		// the xmi :
		builder.saveAsXMIModel(dir + "/" + "output/" + file.replace('.', '_') + ".km");
		// try to pretty-print the result in another file
		URI userLocatedPpfile=UserDirURI.createURI(dir + "/output/"  + file.replace('.', '_') + ".kmt",null,true);
		String ppfile =userLocatedPpfile.toString();
		//builder.prettyPrint(ppfile);
		
		ppUnit(builder, userLocatedPpfile.toFileString());
		
		KermetaUnitFactory.getDefaultLoader().unloadAll();
		
		// try to re-parse the pretty-printed version
		KermetaUnit builder2 = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(ppfile);
		try {
		builder2.load();
		} catch(Exception e ) {if (builder2.getError().size() == 0) throw e;};
		if (builder2.getError().size() > 0) {
				assertTrue("RE-PARSE : " + builder2.getMessagesAsString(), false);
			}
		}
	}
	
	public void ppUnit(KermetaUnit builder, String file) throws Exception  {
		KM2KMTPrettyPrinter pp = new KM2KMTPrettyPrinter();
		
		BufferedWriter w = new BufferedWriter(new FileWriter(new File(file)));
		String pkg_name = "package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n";
		
		w.write("package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n");
	
		/* imported units needed to recognize the imported classes...*/
		Iterator it = builder.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			if (iu.rootPackage != builder.rootPackage) {
				
				if (iu instanceof KMTUnit)
					w.write("require \"" + iu.getUri() + "\"\n");
				else {
					String f = file.replaceAll(".kmt", iu.rootPackage.getFName() + ".kmt");
					ppUnit(iu, f);
					w.write("require \"" + f + "\"\n");
				}
			}
		}
		
		String str_kmt = pp.ppPackage(builder.rootPackage);
		// Do not write again the package declaration..
		w.write(str_kmt.substring(pkg_name.length()));
		w.close();
	}
	

}
