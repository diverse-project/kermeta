/* $Id: JunitTestSuite.java,v 1.7 2005-05-10 09:03:01 ffleurey Exp $
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

package kermeta_io.typechecker_test;

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
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;
import fr.irisa.triskell.kermeta.typechecker.TypeCheckerContext;
import fr.irisa.triskell.kermeta.utils.UserDirURI;

import junit.framework.TestCase;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
 */
public class JunitTestSuite extends TestCase {


	public JunitTestSuite(String arg0) {
		super(arg0);
		
		 // SET THE STD LIB
	    KermetaUnit.STD_LIB_URI = "lib/framework.km";
	    // INIT TYPE CHECKER
	  //  TypeCheckerContext.initializeTypeChecker(KermetaUnit.getStdLib());
		
	}
	
	protected void setUp() throws Exception {
		super.setUp();
	}


	protected void tearDown() throws Exception {
		super.tearDown();
	}
	/*
	public void testTypeCheckStdLib() {
	    if (KermetaUnit.getStdLib().getAllErrors().size() > 0) {
			assertTrue(KermetaUnit.getStdLib().getAllMessagesAsString(), false);
		}
		
		KermetaTypeChecker tc = new KermetaTypeChecker(KermetaUnit.getStdLib());
	    
		tc.checkUnit();
		
		if (KermetaUnit.getStdLib().getAllErrors().size() > 0) {
			assertTrue(KermetaUnit.getStdLib().getAllMessagesAsString(), false);
		}
	}
	*/
	// do not modify this comment


/*** BEGIN GENERATED TESTS ***/
public void testvalid_1_ClassSubTyping_1() throws Exception {
testvalidFile("test/typechecher_tests/valid","1_ClassSubTyping_1.kmt" );
}

public void testvalid_2_ClassSubTypingWithGenerics() throws Exception {
testvalidFile("test/typechecher_tests/valid","2_ClassSubTypingWithGenerics.kmt" );
}

public void testvalid_ClassSubTypingWithGenericOperations() throws Exception {
testvalidFile("test/typechecher_tests/valid","ClassSubTypingWithGenericOperations.kmt" );
}

public void testvalid_Class_new() throws Exception {
testvalidFile("test/typechecher_tests/valid","Class_new.kmt" );
}

public void testvalid_SimpleOperationCall() throws Exception {
testvalidFile("test/typechecher_tests/valid","SimpleOperationCall.kmt" );
}

public void testvalid_GenericOperationCall() throws Exception {
testvalidFile("test/typechecher_tests/valid","GenericOperationCall.kmt" );
}

public void testvalid_SimpleCtrlStructs() throws Exception {
testvalidFile("test/typechecher_tests/valid","SimpleCtrlStructs.kmt" );
}

public void testvalid_SimpleFunctions() throws Exception {
testvalidFile("test/typechecher_tests/valid","SimpleFunctions.kmt" );
}

public void testvalid_GenericVisitor() throws Exception {
testvalidFile("test/typechecher_tests/valid","GenericVisitor.kmt" );
}

public void testvalid_GenericsAndFunctions() throws Exception {
testvalidFile("test/typechecher_tests/valid","GenericsAndFunctions.kmt" );
}

public void testinvalid_1_ClassSubTyping_1() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","1_ClassSubTyping_1.kmt" );
}

public void testinvalid_2_ClassSubTypingWithGenerics() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","2_ClassSubTypingWithGenerics.kmt" );
}

public void testinvalid_Class_new() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","Class_new.kmt" );
}

public void testinvalid_SimpleOperationCall() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","SimpleOperationCall.kmt" );
}

public void testinvalid_ClassSubTypingWithGenericOperations() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","ClassSubTypingWithGenericOperations.kmt" );
}

public void testinvalid_GenericOperationCall() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","GenericOperationCall.kmt" );
}

public void testinvalid_SimpleCtrlStructs() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","SimpleCtrlStructs.kmt" );
}

public void testinvalid_SimpleFunctions() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","SimpleFunctions.kmt" );
}

public void testinvalid_GenericsAndFunctions() throws Exception {
testinvalidFile("test/typechecher_tests/invalid","GenericsAndFunctions.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment




	public void testvalidFile(String dir, String file) throws Exception {
	    
	    KermetaUnitFactory.getDefaultLoader().unloadAll();

	    // LOAD THE UNIT
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(dir + "/" + file);
		try {
		builder.load();
		} catch(Exception e ) {if (builder.getError().size() == 0) throw e;};
		
		if (builder.getAllErrors().size() > 0) {
			assertTrue(builder.getAllMessagesAsString(), false);
		}
		
		builder.typeCheck();
		
		KermetaTypeChecker tc = builder.getTypeChecker();
		
		if (builder.getAllErrors().size() > 0) {
			assertTrue(builder.getAllMessagesAsString(), false);
		}
	}
	
	public void testinvalidFile(String dir, String file) throws Exception {
	    
	    KermetaUnitFactory.getDefaultLoader().unloadAll();

	    // LOAD THE UNIT
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(dir + "/" + file);
		try {
		builder.load();
		} catch(Exception e ) {if (builder.getError().size() == 0) throw e;};
		
		if (builder.getAllErrors().size() > 0) {
			assertTrue(builder.getAllMessagesAsString(), false);
		}
		
		builder.typeCheck();
		
		KermetaTypeChecker tc = builder.getTypeChecker();
		
		if (tc.correctOperation.size() != 0) {
		    boolean res = true;
		    String message = "Type error not found in operations :";
		    for (int i=0; i<tc.correctOperation.size(); i++) {
		        if (tc.correctOperation.get(i).toString().startsWith("test")) {
		            message += " " + tc.correctOperation.get(i);
		            res = false;
		        }
		    }
		    assertTrue(message, res);
		}
	}
}
