/* $Id: JunitTestSuite.java,v 1.2 2007-09-13 09:03:04 ftanguy Exp $
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

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaCycleConstraintChecker;
import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;
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
public void testvalid_001_oclcstvisitor() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","001_oclcstvisitor.kmt" );
}

public void testvalid_003_associations() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","003_associations.kmt" );
}

public void testvalid_005_operations() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","005_operations.kmt" );
}

public void testvalid_005_operations_dep() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","005_operations_dep.kmt" );
}

public void testvalid_006_constraint_type_boolean_valid1() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","006_constraint_type_boolean_valid1.kmt" );
}

public void testvalid_006_constraint_type_boolean_valid2() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","006_constraint_type_boolean_valid2.kmt" );
}

public void testvalid_006_constraint_type_boolean_valid3() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","006_constraint_type_boolean_valid3.kmt" );
}

public void testvalid_028_weaving_in_kermeta_aspect9() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","028_weaving_in_kermeta_aspect9.kmt" );
}

public void testinvalid_001_cyclicinheritance_01() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","001_cyclicinheritance_01.kmt" );
}

public void testinvalid_001_cyclicinheritance_02() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","001_cyclicinheritance_02.kmt" );
}

public void testinvalid_001_cyclicinheritance_03() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","001_cyclicinheritance_03.kmt" );
}

public void testinvalid_002_oclcstvisitor() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","002_oclcstvisitor.kmt" );
}

public void testinvalid_003_associations_01() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_01.kmt" );
}

public void testinvalid_003_associations_02() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_02.kmt" );
}

public void testinvalid_003_associations_03() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_03.kmt" );
}

public void testinvalid_003_associations_04() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_04.kmt" );
}

public void testinvalid_003_associations_05() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_05.kmt" );
}

public void testinvalid_003_associations_06() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_06.kmt" );
}

public void testinvalid_003_associations_07() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_07.kmt" );
}

public void testinvalid_003_associations_08() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_08.kmt" );
}

public void testinvalid_003_associations_09() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","003_associations_09.kmt" );
}

public void testinvalid_004_cyclicCompositions_01() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","004_cyclicCompositions_01.kmt" );
}

public void testinvalid_004_cyclicCompositions_02() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","004_cyclicCompositions_02.kmt" );
}

public void testinvalid_004_cyclicCompositions_03() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","004_cyclicCompositions_03.kmt" );
}

public void testinvalid_004_cyclicCompositions_04() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","004_cyclicCompositions_04.kmt" );
}

public void testinvalid_004_cyclicCompositions_05() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","004_cyclicCompositions_05.kmt" );
}

public void testinvalid_005_superoperations_parammismatch1_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","005_superoperations_parammismatch1_inv.kmt" );
}

public void testinvalid_005_superoperations_parammismatch2_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","005_superoperations_parammismatch2_inv.kmt" );
}

public void testinvalid_005_superoperations_parammismatch3_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","005_superoperations_parammismatch3_inv.kmt" );
}

public void testinvalid_005_superoperations_parammismatch4_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","005_superoperations_parammismatch4_inv.kmt" );
}

public void testinvalid_005_superoperations_parammismatch5_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","005_superoperations_parammismatch5_inv.kmt" );
}

public void testinvalid_006_inheritedproperty1_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","006_inheritedproperty1_inv.kmt" );
}

public void testinvalid_006_inheritedproperty2_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","006_inheritedproperty2_inv.kmt" );
}

public void testinvalid_006_inheritedproperty3_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","006_inheritedproperty3_inv.kmt" );
}

public void testinvalid_006_inheritedproperty4_inv() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","006_inheritedproperty4_inv.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect1() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect1.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect2() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect2.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect3() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect3.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect4() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect4.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect5() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect5.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect6() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect6.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect7() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect7.kmt" );
}

public void testinvalid_025_weaving_in_kermeta_aspect8() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect8.kmt" );
}

public void testinvalid_026_atpre_feature_complex_test_invalid1() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","026_atpre_feature_complex_test_invalid1.kmt" );
}

public void testinvalid_026_atpre_feature_complex_test_invalid2() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","026_atpre_feature_complex_test_invalid2.kmt" );
}

public void testinvalid_026_atpre_feature_complex_test_invalid3() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","026_atpre_feature_complex_test_invalid3.kmt" );
}

public void testinvalid_026_atpre_feature_complex_test_invalid4() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","026_atpre_feature_complex_test_invalid4.kmt" );
}

public void testinvalid_026_atpre_feature_complex_test_invalid5() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","026_atpre_feature_complex_test_invalid5.kmt" );
}

public void testinvalid_027_constraint_type_boolean1() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean1.kmt" );
}

public void testinvalid_027_constraint_type_boolean2() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean2.kmt" );
}

public void testinvalid_027_constraint_type_boolean3() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean3.kmt" );
}

public void testinvalid_027_constraint_type_boolean4() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean4.kmt" );
}

public void testinvalid_027_constraint_type_boolean5() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean5.kmt" );
}

public void testinvalid_027_constraint_type_boolean6() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean6.kmt" );
}

public void testinvalid_027_constraint_type_boolean7() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean7.kmt" );
}

public void testinvalid_027_constraint_type_boolean8() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean8.kmt" );
}

public void testinvalid_027_constraint_type_boolean9() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","027_constraint_type_boolean9.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment




	public void testvalidFile(String dir, String file) throws Exception {
	    
		
		String path = TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file;
		
		KermetaUnit kermetaUnit = ioPlugin.loadKermetaUnit(path, new NullProgressMonitor());
		
		if ( kermetaUnit.isErrored() )
			assertTrue("kermeta unit has errors during loading", false);
		
		KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit, new NullProgressMonitor() );
		typeChecker.checkUnit();
		
		if ( kermetaUnit.isErrored() )
			assertTrue("Kermeta Unit has errors when type checking.", false);
		
		KermetaConstraintChecker constraintChecker = new KermetaConstraintChecker( kermetaUnit, new NullProgressMonitor() );
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
	    
		String path = TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file;
		
		KermetaUnit kermetaUnit = ioPlugin.loadKermetaUnit(path, new NullProgressMonitor());

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
				KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit, new NullProgressMonitor() );
				typeChecker.checkUnit();
			}
			
			if ( ! kermetaUnit.isErrored() ) {
				KermetaConstraintChecker constraintChecker = new KermetaConstraintChecker( kermetaUnit, new NullProgressMonitor() );
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
