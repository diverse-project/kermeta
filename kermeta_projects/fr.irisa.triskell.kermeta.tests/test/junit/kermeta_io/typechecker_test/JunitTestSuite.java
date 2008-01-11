/* $Id: JunitTestSuite.java,v 1.6 2008-01-11 15:46:49 dvojtise Exp $
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
 * 			checks that the valid test cases have no error
 * 			checks that the invalid test cases have at least one error per operation
 */

package kermeta_io.typechecker_test;

import junit.framework.TestCase;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.tests.plugin.TestPlugin;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;


/**
 * @author Franck Fleurey
 * Kermeta TestSuite for io project
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
public void testvalid_001_simpleUML_MM_behavior() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","001_simpleUML_MM_behavior.kmt" );
}

public void testvalid_021_basic_fsm_type() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","021_basic_fsm_type.kmt" );
}

public void testvalid_021_composite_fsm_type() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","021_composite_fsm_type.kmt" );
}

public void testvalid_021_finalstates_fsm_type() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","021_finalstates_fsm_type.kmt" );
}

public void testvalid_021_fsm_quicktest() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","021_fsm_quicktest.kmt" );
}

public void testvalid_021_mandstart_fsm_type() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","021_mandstart_fsm_type.kmt" );
}

public void testvalid_021_minimization() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","021_minimization.kmt" );
}

public void testvalid_021_multstart_fsm_type() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","021_multstart_fsm_type.kmt" );
}

public void testvalid_022_mt_multiplicity() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","022_mt_multiplicity.kmt" );
}

public void testvalid_022_mt_multiplicity_valid_tests() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","022_mt_multiplicity_valid_tests.kmt" );
}

public void testvalid_023_mt_att_ref() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","023_mt_att_ref.kmt" );
}

public void testvalid_023_mt_att_ref_valid_tests() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","023_mt_att_ref_valid_tests.kmt" );
}

public void testvalid_024_mt_property_order() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","024_mt_property_order.kmt" );
}

public void testvalid_024_mt_property_order_valid_tests() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","024_mt_property_order_valid_tests.kmt" );
}

public void testvalid_025_weaving_in_kermeta_aspect1() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","025_weaving_in_kermeta_aspect1.kmt" );
}

public void testvalid_025_weaving_in_kermeta_aspect8() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","025_weaving_in_kermeta_aspect8.kmt" );
}

public void testvalid_026_weaving_in_kermeta_mixed_base_aspect() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","026_weaving_in_kermeta_mixed_base_aspect.kmt" );
}

public void testvalid_027_weaving_in_kermeta_aspect1() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","027_weaving_in_kermeta_aspect1.kmt" );
}

public void testvalid_027_weaving_in_kermeta_base() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","027_weaving_in_kermeta_base.kmt" );
}

public void testvalid_1_ClassSubTyping_1() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","1_ClassSubTyping_1.kmt" );
}

public void testvalid_2_ClassSubTypingWithGenerics() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","2_ClassSubTypingWithGenerics.kmt" );
}

public void testvalid_AliasAndFunctions() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","AliasAndFunctions.kmt" );
}

public void testvalid_AllocationUsingVariable_Alias() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","AllocationUsingVariable_Alias.kmt" );
}

public void testvalid_basic_fsm_modeltype() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","basic_fsm_modeltype.kmt" );
}

public void testvalid_Class_new() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","Class_new.kmt" );
}

public void testvalid_ClassSubTypingWithGenericOperations() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","ClassSubTypingWithGenericOperations.kmt" );
}

public void testvalid_Enum() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","Enum.kmt" );
}

public void testvalid_GenericOperationCall() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","GenericOperationCall.kmt" );
}

public void testvalid_GenericsAndFunctions() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","GenericsAndFunctions.kmt" );
}

public void testvalid_GenericsWithSupertypes() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","GenericsWithSupertypes.kmt" );
}

public void testvalid_GenericVisitor() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","GenericVisitor.kmt" );
}

public void testvalid_ModelTypeOperations() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","ModelTypeOperations.kmt" );
}

public void testvalid_ModelTypesTemp() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","ModelTypesTemp.kmt" );
}

public void testvalid_ObjectAndVoid() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","ObjectAndVoid.kmt" );
}

public void testvalid_SimpleCtrlStructs() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","SimpleCtrlStructs.kmt" );
}

public void testvalid_SimpleFunctions() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","SimpleFunctions.kmt" );
}

public void testvalid_SimpleOperationCall() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","SimpleOperationCall.kmt" );
}

public void testvalid_test_clone() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","test_clone.kmt" );
}

public void testvalid_testModelTypesStateMachines() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","testModelTypesStateMachines.kmt" );
}

public void testvalid_VirtualTypeInheritance() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","VirtualTypeInheritance.kmt" );
}

public void testinvalid_002_GenericsWithSupertypes() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","002_GenericsWithSupertypes.kmt" );
}

public void testinvalid_005_several_superoperations() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","005_several_superoperations.kmt" );
}

public void testinvalid_013_kermetaSignature() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","013_kermetaSignature.kmt" );
}

public void testinvalid_014_scopevisibility() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","014_scopevisibility.kmt" );
}

public void testinvalid_021_fsm_mustfail() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","021_fsm_mustfail.kmt" );
}

public void testinvalid_022_mt_multiplicity_invalid_tests() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","022_mt_multiplicity_invalid_tests.kmt" );
}

public void testinvalid_023_mt_att_ref_invalid_tests() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","023_mt_att_ref_invalid_tests.kmt" );
}

public void testinvalid_024_mt_property_order_invalid_tests() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","024_mt_property_order_invalid_tests.kmt" );
}

public void testinvalid_1_ClassSubTyping_1() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","1_ClassSubTyping_1.kmt" );
}

public void testinvalid_2_ClassSubTypingWithGenerics() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","2_ClassSubTypingWithGenerics.kmt" );
}

public void testinvalid_5_failtestExternPackageCall() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","5_failtestExternPackageCall.kmt" );
}

public void testinvalid_Class_new() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","Class_new.kmt" );
}

public void testinvalid_ClassSubTypingWithGenericOperations() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","ClassSubTypingWithGenericOperations.kmt" );
}

public void testinvalid_CollectionsAttributeReferenceAssignment() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","CollectionsAttributeReferenceAssignment.kmt" );
}

public void testinvalid_Enum() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","Enum.kmt" );
}

public void testinvalid_GenericOperationCall() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","GenericOperationCall.kmt" );
}

public void testinvalid_GenericsAndFunctions() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","GenericsAndFunctions.kmt" );
}

public void testinvalid_GenericsWithSupertypes() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","GenericsWithSupertypes.kmt" );
}

public void testinvalid_ModelTypeOperations() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","ModelTypeOperations.kmt" );
}

public void testinvalid_ObjectAndVoid() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","ObjectAndVoid.kmt" );
}

public void testinvalid_parserError01() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError01.kmt" );
}

public void testinvalid_SimpleCtrlStructs() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","SimpleCtrlStructs.kmt" );
}

public void testinvalid_SimpleFunctions() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","SimpleFunctions.kmt" );
}

public void testinvalid_SimpleOperationCall() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","SimpleOperationCall.kmt" );
}

public void testinvalid_test_clone() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","test_clone.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment




	public void testvalidFile(String dir, String file) throws Exception {
				
		String path = TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file;
		
		KermetaUnit kermetaUnit = IOPlugin.getDefault().loadKermetaUnit(path, new NullProgressMonitor());
		
		if ( kermetaUnit.isIndirectlyErroneous() )
			//assertTrue("kermeta unit has errors during loading", false);
			assertTrue( KermetaUnitHelper.getErrorsAsString(kermetaUnit), false );
			
		KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit, new NullProgressMonitor() );
		typeChecker.checkUnit();
	
		if ( kermetaUnit.isIndirectlyErroneous() )
			//assertTrue("kermeta unit has errors during type checking", false);
			assertTrue( KermetaUnitHelper.getErrorsAsString(kermetaUnit), false );
			
		IOPlugin.getDefault().unload( path );
		
	}
	
	/** Testing invalid file means that we are looking for one error per operation of the given file */
	public void testinvalidFile(String dir, String file) throws Exception {

		KermetaUnit kermetaUnit = IOPlugin.getDefault().loadKermetaUnit( TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file, new NullProgressMonitor());
		
		if ( ! kermetaUnit.isIndirectlyErroneous() ) {
			KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit, new NullProgressMonitor() );
			typeChecker.checkUnit();

			/*if ( ! kermetaUnit.isErrored() )
				assertTrue("kermeta unit has no errors during type checking", false);*/
				
			// check that all operations have at least one error
			if (typeChecker.correctOperation.size() != 0) {
				boolean res = true;
				String message = "All operations must have at least one error or warning. Type error not found in operations :";
				for (int i=0; i<typeChecker.correctOperation.size(); i++) {
					if (typeChecker.correctOperation.get(i).toString().startsWith("test")) {
						message += " " + typeChecker.correctOperation.get(i);
						res = false;
					}
				}
				assertTrue(message, res);
			}
			else {
				// if there is no operation, check that there is at least an error in the unit 
				if ( ! kermetaUnit.isErroneous() )
					assertTrue("kermeta unit has no errors during type checking", false);
			}
		
		}
		
		IOPlugin.getDefault().unload( kermetaUnit.getUri() );
	}
}
