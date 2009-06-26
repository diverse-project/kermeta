/* $Id: JunitTestSuite.java,v 1.19 2009-02-20 08:19:33 dvojtise Exp $
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

import java.util.HashMap;

import junit.framework.TestCase;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.LoadingOptions;

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

public void testvalid_002_inheritanceWithAspectAndGenerics() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","002_inheritanceWithAspectAndGenerics.kmt" );
}

public void testvalid_003_ClassSubTyping_1() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","003_ClassSubTyping_1.kmt" );
}

public void testvalid_004_ClassSubTypingWithGenerics() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","004_ClassSubTypingWithGenerics.kmt" );
}

public void testvalid_005_ClassSubTypingWithGenerics2() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","005_ClassSubTypingWithGenerics2.kmt" );
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

public void testvalid_028_testValidCastOnCollection() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","028_testValidCastOnCollection.kmt" );
}

public void testvalid_029_testGenericTypeAsParameter1() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","029_testGenericTypeAsParameter1.kmt" );
}

public void testvalid_029_testGenericTypeAsParameter2() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","029_testGenericTypeAsParameter2.kmt" );
}

public void testvalid_030_requireEcoreUsingGenerics() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","030_requireEcoreUsingGenerics.kmt" );
}

public void testvalid_031_testGenericTypeAsReturnParameterAndSelf1() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","031_testGenericTypeAsReturnParameterAndSelf1.kmt" );
}

public void testvalid_031_testGenericTypeAsReturnParameterAndSelf2() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","031_testGenericTypeAsReturnParameterAndSelf2.kmt" );
}

public void testvalid_031_testGenericTypeAsReturnParameterAndSelf3() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","031_testGenericTypeAsReturnParameterAndSelf3.kmt" );
}

public void testvalid_031_testGenericTypeAsReturnParameterAndSelf4() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","031_testGenericTypeAsReturnParameterAndSelf4.kmt" );
}

public void testvalid_032_classNameScopeMultipackage() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","032_classNameScopeMultipackage.kmt" );
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

public void testvalid_DerivedProperties() throws Exception {
testvalidFile("test/io/typechecher_tests/valid","DerivedProperties.kmt" );
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

public void testinvalid_026_assignmenterror() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","026_assignmenterror.kmt" );
}

public void testinvalid_028_testInvalidCastOnCollection() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","028_testInvalidCastOnCollection.kmt" );
}

public void testinvalid_029_namingPropertyOperationConflict() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","029_namingPropertyOperationConflict.kmt" );
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

public void testinvalid_genericOperationDefinition_001() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","genericOperationDefinition_001.kmt" );
}

public void testinvalid_genericOperationDefinition_002() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","genericOperationDefinition_002.kmt" );
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

public void testinvalid_parserError02() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError02.kmt" );
}

public void testinvalid_parserError03() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError03.kmt" );
}

public void testinvalid_parserError04() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError04.kmt" );
}

public void testinvalid_parserError05() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError05.kmt" );
}

public void testinvalid_parserError07() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError07.kmt" );
}

public void testinvalid_parserError08() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError08.kmt" );
}

public void testinvalid_parserError09() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError09.kmt" );
}

public void testinvalid_parserError10() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError10.kmt" );
}

public void testinvalid_parserError11() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError11.kmt" );
}

public void testinvalid_parserError12() throws Exception {
testinvalidFile("test/io/typechecher_tests/invalid","parserError12.kmt" );
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
		
		HashMap<String, Object> loaderOptions = new HashMap<String, Object>();
		loaderOptions.put( LoadingOptions.ECORE_QuickFixEnabled, true );
		KermetaUnit kermetaUnit = LoaderPlugin.getDefault().load(path, loaderOptions);
		
		if ( kermetaUnit.isIndirectlyErroneous() ){
			//assertTrue("kermeta unit has errors during loading", false);
			
			assertTrue( KermetaUnitHelper.getAllErrorsAsString(kermetaUnit), false );
		}
		KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit );
		typeChecker.checkUnit();
	
		if ( kermetaUnit.isIndirectlyErroneous() ) {
			System.err.println( KermetaUnitHelper.getErrorsAsString(kermetaUnit) );
			assertTrue( KermetaUnitHelper.getErrorsAsString(kermetaUnit), false );
		}
			
		LoaderPlugin.getDefault().unload( path );
		
	}
	
	/** Testing invalid file means that we are looking for one error per operation of the given file */
	public void testinvalidFile(String dir, String file) throws Exception {

		KermetaUnit kermetaUnit = LoaderPlugin.getDefault().load( TestPlugin.PLUGIN_TESTS_PATH + dir + "/" + file, null);
		
		if ( ! kermetaUnit.isIndirectlyErroneous() ) {
			KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit );
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
				// if there is no operation, check that there is at least an error or warning in the unit 
				if ( (! kermetaUnit.isErroneous()) && (! KermetaUnitHelper.hasWarning(kermetaUnit))  )
					assertTrue("kermeta unit has no error or warning during type checking", false);
			}
		
		}
		
		LoaderPlugin.getDefault().unload( kermetaUnit.getUri() );
	}
}
