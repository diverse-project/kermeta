/* $Id: JunitTestSuite.java,v 1.10 2007-07-24 13:46:47 ftanguy Exp $
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

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaCycleConstraintChecker;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;


/**
 * @author Didier Vojtisek
 * Kermeta TestSuite for io project, static constraints
 */
public class JunitTestSuite extends TestCase {

	static private IOPlugin ioPlugin;
	
	public JunitTestSuite(String arg0) {
		super(arg0);	
		initialize();
	}
	
	private void initialize() {

		if ( ioPlugin == null ) {
		
			IOPlugin.LOCAL_USE = true;
			ioPlugin = new IOPlugin();
		
		}

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

public void testvalid_005_operations() throws Exception {
testvalidFile("test/constraintchecker_tests/valid","005_operations.kmt" );
}

public void testvalid_005_operations_dep() throws Exception {
testvalidFile("test/constraintchecker_tests/valid","005_operations_dep.kmt" );
}

public void testinvalid_005_superoperations_parammismatch1_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","005_superoperations_parammismatch1_inv.kmt" );
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

public void testinvalid_004_cyclicCompositions_01() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","004_cyclicCompositions_01.kmt" );
}

public void testinvalid_004_cyclicCompositions_02() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","004_cyclicCompositions_02.kmt" );
}

public void testinvalid_004_cyclicCompositions_03() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","004_cyclicCompositions_03.kmt" );
}

public void testinvalid_004_cyclicCompositions_04() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","004_cyclicCompositions_04.kmt" );
}

public void testinvalid_004_cyclicCompositions_05() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","004_cyclicCompositions_05.kmt" );
}

public void testinvalid_005_superoperations_parammismatch3_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","005_superoperations_parammismatch3_inv.kmt" );
}

public void testinvalid_006_inheritedproperty2_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","006_inheritedproperty2_inv.kmt" );
}

public void testinvalid_005_superoperations_parammismatch5_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","005_superoperations_parammismatch5_inv.kmt" );
}

public void testinvalid_006_inheritedproperty4_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","006_inheritedproperty4_inv.kmt" );
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

public void testinvalid_003_associations_06() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","003_associations_06.kmt" );
}

public void testinvalid_003_associations_07() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","003_associations_07.kmt" );
}

public void testinvalid_005_superoperations_parammismatch2_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","005_superoperations_parammismatch2_inv.kmt" );
}

public void testinvalid_006_inheritedproperty1_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","006_inheritedproperty1_inv.kmt" );
}

public void testinvalid_005_superoperations_parammismatch4_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","005_superoperations_parammismatch4_inv.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect1() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect1.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect2() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect2.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect3() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect3.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect4() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect4.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect5() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect5.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect6() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect6.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect7() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect7.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect8() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect8.kmt" );
}

public void testinvalid_006_inheritedproperty3_inv() throws Exception {
testinvalidFile("test/constraintchecker_tests/invalid","006_inheritedproperty3_inv.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment




	public void testvalidFile(String dir, String file) throws Exception {
	    
		
		String path = "platform:/plugin/fr.irisa.triskell.kermeta.io/" + dir + "/" + file;
		
		KermetaUnit kermetaUnit = ioPlugin.loadKermetaUnit(path);
		
		if ( kermetaUnit.isErrored() )
			assertTrue("kermeta unit has errors during loading", false);
		
		KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit );
		typeChecker.checkUnit();
		
		if ( kermetaUnit.isErrored() )
			assertTrue("Kermeta Unit has errors when type checking.", false);
		
		KermetaConstraintChecker constraintChecker = new KermetaConstraintChecker( kermetaUnit );
		constraintChecker.checkUnit();
		
		if ( kermetaUnit.isErrored() )
			assertTrue("Kermeta Unit has errors when constraint checking.", false);
		
		KermetaCycleConstraintChecker cycleConstraintChecker = new KermetaCycleConstraintChecker( kermetaUnit );
		cycleConstraintChecker.check();
		
		if ( kermetaUnit.isErrored() )
			assertTrue("Kermeta Unit has errors when cycle constraint checking.", false);

		ioPlugin.unload( kermetaUnit.getUri() );
	}
	
	public void testinvalidFile(String dir, String file) throws Exception {
	    
		String path = "platform:/plugin/fr.irisa.triskell.kermeta.io/" + dir + "/" + file;
		
		KermetaUnit kermetaUnit = ioPlugin.loadKermetaUnit(path);

		boolean inheritanceCycleDetected = false;
		if ( kermetaUnit.isErrored() ) {
			
			// Patch: the inheritance cycle detection is done in the loader...
	/*		String msg = builder.messages.getMessagesAsString();
			if( msg.contains("Cycle in the inheritance tree"))
				inheritanceCycleDetected = true;
			else assertTrue(builder.messages.getAllMessagesAsString(), false);*/
			// loader test must not be done in this test suite
		}
		
		System.out.println("load Ok for " +file);
		if(!inheritanceCycleDetected) {

			KermetaCycleConstraintChecker cycleConstraintChecker = new KermetaCycleConstraintChecker( kermetaUnit );
			cycleConstraintChecker.check();
			
			if ( ! kermetaUnit.isErrored() ) {
				KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit );
				typeChecker.checkUnit();
			}
			
			if ( ! kermetaUnit.isErrored() ) {
				KermetaConstraintChecker constraintChecker = new KermetaConstraintChecker( kermetaUnit );
				constraintChecker.checkUnit();
			}
			
			if ( ! kermetaUnit.isErrored() ) {
				assertTrue("Looking for a constraint error but none found", false);
			}
			else {
				System.out.println("succesfully found error in " +file );
				//System.out.println(builder.messages.getAllMessagesAsString() );
			}
		}
		
		ioPlugin.unload( kermetaUnit.getUri() );

	}
}
