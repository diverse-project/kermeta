/* $Id: JunitTestSuite.java,v 1.15 2008-07-18 07:06:36 dvojtise Exp $
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

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.constraintchecker.KermetaCycleConstraintChecker;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;


/**
 * @author Didier Vojtisek
 * Kermeta TestSuite for io project, static constraints
 */
public class JunitTestSuite extends TestCase {

	public static final String PLUGIN_TESTS_PATH = "platform:/plugin/fr.irisa.triskell.kermeta.io/";
	
	static private IOPlugin ioPlugin;
	

	public JunitTestSuite(String arg0) throws URISyntaxException {
		super(arg0);
		initialize();
	}
	
	private void initialize() throws URISyntaxException {

		if ( ioPlugin == null ) {
			//IOPlugin.LOCAL_USE = true;
			// initialize URIMap
			// find the root of the environment
			// use http://java.sun.com/j2se/1.5.0/docs/guide/lang/resources.html
			java.net.URI rootDir = null;
			rootDir = getClass().getResource("/").toURI().resolve("..");
			System.out.println("rootDir = "+"file:/"+rootDir.getPath());
			
				
			String resource = "file:/"+rootDir.getPath()+ "test-workspace/";
			ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI.createURI(resource));
			ExtensibleURIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI(resource));
			//System.out.println("");
			System.out.println("\tplatform:/resource/ -> " + resource);
			System.out.println("\tplatform:/plugin/ -> " + resource);
			ioPlugin = IOPlugin.getDefault();
		
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

public void testvalid_002_operationReturnType() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","002_operationReturnType.kmt" );
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

public void testvalid_032_assigned_to_self_02() throws Exception {
testvalidFile("test/io/constraintchecker_tests/valid","032_assigned_to_self_02.kmt" );
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

public void testinvalid_005_undeterministic_several_superoperations_01() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","005_undeterministic_several_superoperations_01.kmt" );
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

public void testinvalid_007_resultNotSet() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","007_resultNotSet.kmt" );
}

public void testinvalid_008_testRequiresColliding() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","008_testRequiresColliding.kmt" );
}

public void testinvalid_009_requiringFiles1() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","009_requiringFiles1.kmt" );
}

public void testinvalid_010_requiringFiles2() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","010_requiringFiles2.kmt" );
}

public void testinvalid_011_requiringFiles3() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","011_requiringFiles3.kmt" );
}

public void testinvalid_012_multipleDeclaration() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","012_multipleDeclaration.kmt" );
}

public void testinvalid_012_multipleDeclarationFromRequire() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","012_multipleDeclarationFromRequire.kmt" );
}

public void testinvalid_013_typeVariablesBadlyNamed() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","013_typeVariablesBadlyNamed.kmt" );
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

public void testinvalid_025_weaving_in_kermeta_aspect8b() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","025_weaving_in_kermeta_aspect8b.kmt" );
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

public void testinvalid_029_DerivedProperties_invalid01() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","029_DerivedProperties_invalid01.kmt" );
}

public void testinvalid_029_DerivedProperties_invalid02() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","029_DerivedProperties_invalid02.kmt" );
}

public void testinvalid_029_DerivedProperties_invalid03() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","029_DerivedProperties_invalid03.kmt" );
}

public void testinvalid_030_weaving_independent_aspects_02() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","030_weaving_independent_aspects_02.kmt" );
}

public void testinvalid_031_useOfDeprecated_attribute() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","031_useOfDeprecated_attribute.kmt" );
}

public void testinvalid_031_useOfDeprecated_Definition_in_attribute() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","031_useOfDeprecated_Definition_in_attribute.kmt" );
}

public void testinvalid_031_useOfDeprecated_Definition_in_inheritance() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","031_useOfDeprecated_Definition_in_inheritance.kmt" );
}

public void testinvalid_031_useOfDeprecated_Definition_in_parameter_type() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","031_useOfDeprecated_Definition_in_parameter_type.kmt" );
}

public void testinvalid_031_useOfDeprecated_Definition_in_returnType() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","031_useOfDeprecated_Definition_in_returnType.kmt" );
}

public void testinvalid_031_useOfDeprecated_Definition_in_TypeLiteral() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","031_useOfDeprecated_Definition_in_TypeLiteral.kmt" );
}

public void testinvalid_031_useOfDeprecated_Definition_in_vardecl() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","031_useOfDeprecated_Definition_in_vardecl.kmt" );
}

public void testinvalid_031_useOfDeprecated_operation() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","031_useOfDeprecated_operation.kmt" );
}

public void testinvalid_032_assigned_to_self_01() throws Exception {
testinvalidFile("test/io/constraintchecker_tests/invalid","032_assigned_to_self_01.kmt" );
}

/*** END GENERATED TESTS ***/
	// do not modify this comment




	public void testvalidFile(String dir, String file) throws Exception {
	    
		
		String path = PLUGIN_TESTS_PATH + dir + "/" + file;
		
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(LoadingOptions.ECORE_QuickFixEnabled, true);
		
		KermetaUnit kermetaUnit = IOPlugin.getDefault().getEditionKermetaUnitStore().get(path, options);
		
		if ( kermetaUnit.isIndirectlyErroneous() )
			assertTrue("kermeta unit has errors during loading", false);
		
		KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit );
		typeChecker.checkUnit();
		
		if ( kermetaUnit.isIndirectlyErroneous() )
			assertTrue("Kermeta Unit has errors when type checking.", false);
		
		KermetaConstraintChecker constraintChecker = new KermetaConstraintChecker( kermetaUnit );
		constraintChecker.checkUnit();
		
		
		if ( kermetaUnit.isIndirectlyErroneous() ) {
			System.err.println( KermetaUnitHelper.getAllErrorsAsString(kermetaUnit) );
			assertTrue("Kermeta Unit has errors when constraint checking.", false);
		}
		if ( KermetaUnitHelper.hasWarning(kermetaUnit )) {
			System.err.println( KermetaUnitHelper.getAllWarningsAsString(kermetaUnit) );
			assertTrue("Kermeta Unit has warnings when constraint checking.", false);
		}
		
		KermetaCycleConstraintChecker cycleConstraintChecker = new KermetaCycleConstraintChecker( kermetaUnit );
		cycleConstraintChecker.check();
		
		if ( kermetaUnit.isIndirectlyErroneous() ) {
			System.err.println( KermetaUnitHelper.getAllErrorsAsString(kermetaUnit) );
			assertTrue("Kermeta Unit has errors when cycle constraint checking.", false);
		}
		
		IOPlugin.getDefault().unload( kermetaUnit.getUri() );
	}
	
	public void testinvalidFile(String dir, String file) throws Exception {
	    
		String path = PLUGIN_TESTS_PATH + dir + "/" + file;
		
		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(LoadingOptions.ECORE_QuickFixEnabled, true);
		
		KermetaUnit kermetaUnit = IOPlugin.getDefault().getEditionKermetaUnitStore().get(path, options);

		boolean inheritanceCycleDetected = false;
		if ( kermetaUnit.isIndirectlyErroneous() ) {
			
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
			
			if ( ! kermetaUnit.isIndirectlyErroneous() ) {
				KermetaTypeChecker typeChecker = new KermetaTypeChecker( kermetaUnit );
				typeChecker.checkUnit();
			}
			
			if ( ! kermetaUnit.isIndirectlyErroneous() ) {
				KermetaConstraintChecker constraintChecker = new KermetaConstraintChecker( kermetaUnit );
				constraintChecker.checkUnit();
			}
			
			if ( ! (kermetaUnit.isIndirectlyErroneous() || kermetaUnit.isWarned())) {
				assertTrue("Looking for a constraint error or direct warning but none found", false);
			}
			else {
				System.out.println("succesfully found error in " +file );
				assertTrue( KermetaUnitHelper.getAllErrorsAsString(kermetaUnit), true);
				//System.out.println(builder.messages.getAllMessagesAsString() );
			}
		}
		
		IOPlugin.getDefault().unload( kermetaUnit.getUri() );

	}
}
