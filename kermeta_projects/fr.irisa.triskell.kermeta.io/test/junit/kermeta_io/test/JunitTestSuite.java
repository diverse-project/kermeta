/*
 * Created on 27 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package kermeta_io.test;

import java.io.File;
import java.io.FileReader;

import fr.irisa.triskell.kermeta.loader.KMUnitMessage;
import fr.irisa.triskell.kermeta.loader.KermetaLoader;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;

import junit.framework.TestCase;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class JunitTestSuite extends TestCase {


	public JunitTestSuite(String arg0) {
		super(arg0);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}


	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	// do not modify this comment
	





/*** BEGIN GENERATED TESTS ***/
public void testmetacore() throws Exception {
testWithFile("test/emfatic_testcases","metacore.emf" );
}

public void testtestEnum() throws Exception {
testWithFile("test/kmt_testcases","testEnum.kmt" );
}

public void testtestVariable() throws Exception {
testWithFile("test/kmt_testcases","testVariable.kmt" );
}

public void testtestPackage() throws Exception {
testWithFile("test/kmt_testcases","testPackage.kmt" );
}

public void testtestSimpleExpression() throws Exception {
testWithFile("test/kmt_testcases","testSimpleExpression.kmt" );
}

public void testtestExpression() throws Exception {
testWithFile("test/kmt_testcases","testExpression.kmt" );
}

public void testtestClass() throws Exception {
testWithFile("test/kmt_testcases","testClass.kmt" );
}

public void testtestResult() throws Exception {
testWithFile("test/kmt_testcases","testResult.kmt" );
}

public void testtestProperty() throws Exception {
testWithFile("test/kmt_testcases","testProperty.kmt" );
}

public void testtestSimpleCond() throws Exception {
testWithFile("test/kmt_testcases","testSimpleCond.kmt" );
}

public void testtestSimpleLoop() throws Exception {
testWithFile("test/kmt_testcases","testSimpleLoop.kmt" );
}

public void testtestOperation() throws Exception {
testWithFile("test/kmt_testcases","testOperation.kmt" );
}

public void testtestCallExp() throws Exception {
testWithFile("test/kmt_testcases","testCallExp.kmt" );
}

public void testtestPrimitiveType() throws Exception {
testWithFile("test/kmt_testcases","testPrimitiveType.kmt" );
}

public void testtestImportAlias() throws Exception {
testWithFile("test/kmt_testcases","testImportAlias.kmt" );
}

public void testtestBlock() throws Exception {
testWithFile("test/kmt_testcases","testBlock.kmt" );
}

public void testtestConditional() throws Exception {
testWithFile("test/kmt_testcases","testConditional.kmt" );
}

public void testtestSimpleAnnotations() throws Exception {
testWithFile("test/kmt_testcases","testSimpleAnnotations.kmt" );
}

public void testtestExtOperation() throws Exception {
testWithFile("test/kmtbodies_testcases","testExtOperation.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment
	
	public void testWithFile(String dir, String file) throws Exception {
	//	MetaCoreUnit builder = new MetaCoreUnit();
	//	builder.loadMCT(new File(baseDir + file));
		
		KermetaUnit builder = KermetaLoader.getDefaultLoader().load(dir + "/" + file);
		
		if (builder.getError().size() > 0) {
			assertTrue(((KMUnitMessage)builder.getError().get(0)).getMessage(), false);
		}
		else {	
		// the xmi :
		builder.saveMetaCoreModel(dir + "/" + "output");
		// try to pretty-print the result in another file
		String ppfile =dir + "/output/"  + file.replace('.', '_') + ".kmt";
		builder.prettyPrint(ppfile);
		// try to re-parse the pretty-printed version
		KermetaUnit builder2 = KermetaLoader.getDefaultLoader().load(ppfile);
			if (builder2.getError().size() > 0) {
				assertTrue("RE-PARSE : " + ((KMUnitMessage)builder2.getError().get(0)).getMessage(), false);
			}
		}
	}
	

}
