/*
 * Created on 27 janv. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package kermeta_io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;

import fr.irisa.triskell.kermeta.builder.KMBuilder;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.utils.UserDirURI;

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

public void test5_testExternPackageCall() throws Exception {
testWithFile("test/kmt_testcases","5_testExternPackageCall.kmt" );
}

public void test5_testOpPkgCall() throws Exception {
testWithFile("test/kmt_testcases","5_testOpPkgCall.kmt" );
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

/*** END GENERATED TESTS ***/
	// do not modify this comment
	
	public void testWithFile(String dir, String file) throws Exception {
	//	MetaCoreUnit builder = new MetaCoreUnit();
	//	builder.loadMCT(new File(baseDir + file));
		KermetaUnitFactory.getDefaultLoader().unloadAll();
		KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(dir + "/" + file);
		try {
		builder.load();
		} catch(Exception e ) { // throw
			if (builder.getError().size() == 0)  e.printStackTrace();};
		
		if (builder.getError().size() > 0) {
			assertTrue(builder.getMessagesAsString(), false);
		}
		else {	
			
		// the xmi :
		builder.saveMetaCoreModel(dir + "../kcore_testcases");
		// try to pretty-print the result in another file
		URI userLocatedPpfile=UserDirURI.createURI(dir + "../kcore_testcases"  + file.replace('.', '_') + ".kmt",null,true);
		String ppfile =userLocatedPpfile.toFileString();
		//builder.prettyPrint(ppfile);
		KMBuilder pp = new KMBuilder();
		
		BufferedWriter w = new BufferedWriter(new FileWriter(new File(ppfile)));
		String pkg_name = "package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n";
		
		w.write("package " + builder.getQualifiedName(builder.rootPackage) + ";\n\n");
	
		/* imported units needed to recognize the imported classes...*/
		Iterator it = builder.importedUnits.iterator();
		while(it.hasNext()) {
			KermetaUnit iu = (KermetaUnit)it.next();
			if (iu.rootPackage != builder.rootPackage) {
				w.write("require \"" + iu.getUri() + "\"\n");
			}
		}
		
		String str_kmt = pp.ppPackage(builder.rootPackage);
		// Do not write again the package declaration..
		w.write(str_kmt.substring(pkg_name.length()));
		w.close();
		
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
	

}
