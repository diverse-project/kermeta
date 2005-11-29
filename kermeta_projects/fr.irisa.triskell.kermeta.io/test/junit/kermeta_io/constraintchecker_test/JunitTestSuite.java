/* $Id: JunitTestSuite.java,v 1.2 2005-11-29 14:17:12 dvojtise Exp $
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
 * 			test that valid test cases have no error
 * 			tests that invalid test cases have at least one error
 */

package kermeta_io.constraintchecker_test;

import junit.framework.TestCase;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;


/**
 * @author Didier Vojtisek
 * Kermeta TestSuite for io project, static constraints
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



/*** BEGIN GENERATED TESTS ***/
public void testvalid_003_associations() throws Exception {
testvalidFile("test/constraintchecker_tests/valid","003_associations.kmt" );
}

public void testinvalid_001_cyclicinheritance_01() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","001_cyclicinheritance_01.kmt" );
}

public void testinvalid_001_cyclicinheritance_02() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","001_cyclicinheritance_02.kmt" );
}

public void testinvalid_001_cyclicinheritance_03() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","001_cyclicinheritance_03.kmt" );
}

public void testinvalid_003_associations_01() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","003_associations_01.kmt" );
}

public void testinvalid_003_associations_02() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","003_associations_02.kmt" );
}

public void testinvalid_003_associations_03() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","003_associations_03.kmt" );
}

public void testinvalid_003_associations_04() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","003_associations_04.kmt" );
}

public void testinvalid_003_associations_05() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","003_associations_05.kmt" );
}

public void testinvalid_004_cyclicCompositions_01() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","004_cyclicCompositions_01.kmt" );
}

public void testinvalid_004_cyclicCompositions_02() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","004_cyclicCompositions_02.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment




	public void testvalidFile(String dir, String file) throws Exception {
	    
	    KermetaUnitFactory.getDefaultLoader().unloadAll();

	    // LOAD THE UNIT
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(dir + "/" + file);
		try {
		builder.load();
		} catch(Exception e ) {if (builder.messages.getErrors().size() == 0) throw e;};
		
		if (builder.messages.getAllErrors().size() > 0) {
			assertTrue(builder.messages.getAllMessagesAsString(), false);
		}
		
		builder.typeCheck(null);
		builder.constraintCheck(null);
		builder.cycleConstraintCheck(null);
		
		
		//KermetaTypeChecker tc = builder.getTypeChecker();
		
		if (builder.messages.getAllErrors().size() > 0) {
			assertTrue(builder.messages.getAllMessagesAsString(), false);
		}
	}
	
	public void testinvalidFile(String dir, String file) throws Exception {
	    
	    KermetaUnitFactory.getDefaultLoader().unloadAll();

	    // LOAD THE UNIT
	    KermetaUnit builder = KermetaUnitFactory.getDefaultLoader().createKermetaUnit(dir + "/" + file);
		try {
		builder.load();
		} catch(Exception e ) {if (builder.messages.getErrors().size() == 0) throw e;};
		
		if (builder.messages.getAllErrors().size() > 0) {
			assertTrue(builder.messages.getAllMessagesAsString(), false);
			// loader test must not be done in this test suite
		}
		
		
		
		builder.typeCheck(null);
		builder.constraintCheck(null);
		builder.cycleConstraintCheck(null);
		
		
		if (builder.messages.getAllErrors().size() == 0) {
			assertTrue("Looking for a constraint error but none found", false);
		}
	}
}
