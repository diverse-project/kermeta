
/*$Id: Kcomp_operationStructureUseCase.java,v 1.1 2008-01-31 14:34:07 cfaucher Exp $
* Project : org.kermeta.compiler.tests
* File : 	CompPackageTestCase.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 08
* Authors : paco
*/

package org.kermeta.compiler.tests.structure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kermeta.compiler.tests.KCompilerConstants;
import org.kermeta.compiler.tests.helper.Constants;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.kpm.helper.RunnerHelper;
import org.kermeta.loader.LoadingOptions;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.tests.comparison.EMFCompareModelHelper;

public class Kcomp_operationStructureUseCase {

	/*
     * 
     * Beginning dynamic code for the current use case
     * 
     */
	private String use_case = "comp_operationStructure";
	/*
     * 
     * Ending dynamic code for the current use case
     * 
     */
	
	/*
	 * 
	 * Beginning static code
	 *  
	 */
	static private KermetaUnit executable;
	
	/*
	 * 
	 * We only load one time the program when the current class is loading.
	 * 
	 */
    @BeforeClass
    public static void loadProgram() {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put( LoadingOptions.ECORE_QuickFixEnabled, true );
		try {
			IOPlugin.LOCAL_USE = true;
			IOPlugin.getDefault();
			executable = LoaderPlugin.getDefault().load( Constants.TEST_COMP_STRUCTURE_LAUNCHER, options);
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		}
    }
    /*
	 * 
	 * Ending static code
	 *  
	 */
	
    /*
     * 
     * Beginning dynamic code for each test case
     * 
     */

	private String test_case_comp_operationStructure_test001 = "test001";
	
	private String input_comp_operationStructure_test001 = "";
	
	private String output_comp_operationStructure_test001 = "";
	
	private String expected_output_comp_operationStructure_test001 = "";
	
	@Before public void setParams_comp_operationStructure_test001() {
		String prefix = "/" + "comp_operationStructure/test001" + "/";
		input_comp_operationStructure_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_operationStructure_test001 + ".km";
		output_comp_operationStructure_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_operationStructure_test001 + ".ecore";
		expected_output_comp_operationStructure_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_operationStructure_test001 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_operationStructure_test001() {
		run(input_comp_operationStructure_test001, output_comp_operationStructure_test001, expected_output_comp_operationStructure_test001);
	}

	private String test_case_comp_operationStructure_test002 = "test002";
	
	private String input_comp_operationStructure_test002 = "";
	
	private String output_comp_operationStructure_test002 = "";
	
	private String expected_output_comp_operationStructure_test002 = "";
	
	@Before public void setParams_comp_operationStructure_test002() {
		String prefix = "/" + "comp_operationStructure/test002" + "/";
		input_comp_operationStructure_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_operationStructure_test002 + ".km";
		output_comp_operationStructure_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_operationStructure_test002 + ".ecore";
		expected_output_comp_operationStructure_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_operationStructure_test002 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_operationStructure_test002() {
		run(input_comp_operationStructure_test002, output_comp_operationStructure_test002, expected_output_comp_operationStructure_test002);
	}

	private String test_case_comp_tag_test004 = "test004";
	
	private String input_comp_tag_test004 = "";
	
	private String output_comp_tag_test004 = "";
	
	private String expected_output_comp_tag_test004 = "";
	
	@Before public void setParams_comp_tag_test004() {
		String prefix = "/" + "comp_tag/test004" + "/";
		input_comp_tag_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test004 + ".km";
		output_comp_tag_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test004 + ".ecore";
		expected_output_comp_tag_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test004 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test004() {
		run(input_comp_tag_test004, output_comp_tag_test004, expected_output_comp_tag_test004);
	}

	private String test_case_comp_tag_test008 = "test008";
	
	private String input_comp_tag_test008 = "";
	
	private String output_comp_tag_test008 = "";
	
	private String expected_output_comp_tag_test008 = "";
	
	@Before public void setParams_comp_tag_test008() {
		String prefix = "/" + "comp_tag/test008" + "/";
		input_comp_tag_test008 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test008 + ".km";
		output_comp_tag_test008 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test008 + ".ecore";
		expected_output_comp_tag_test008 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test008 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test008() {
		run(input_comp_tag_test008, output_comp_tag_test008, expected_output_comp_tag_test008);
	}
	/*
	 * 
	 * Ending dynamic code for each test case
	 * 
	 */
	
	
	/*
	 * 
	 * Beginning static code
	 *  
	 */
	private void run(String input, String output, String expected_output) {
		try {
			/*
			 * Getting the kermeta unit to execute.
			 */
			KermetaUnit unitToExecute = RunnerHelper.getKermetaUnitToExecute( executable, Constants.BIN_PATH);
			/*
			 * Creating the interpreter.
			 */
			KermetaInterpreter interpreter = new KermetaInterpreter(unitToExecute, null);
			/*
			 * Setting the parameters.
			 */
			ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
			params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(input, interpreter.getMemory().getROFactory()));
			params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(output, interpreter.getMemory().getROFactory()));
			interpreter.setEntryParameters(params);
			/*
			 * Start the interpreter.
			 */
			interpreter.launch();
			/*
			 * Assertion
			 */
			Assert.assertTrue( compare(output, expected_output) );
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private boolean compare(String output, String expected_output) {
		return EMFCompareModelHelper.isDifferentAndSaveDiff(expected_output, output,  output + ".diff");
	}
	
	/**
	 * 
	 * Once all the tests have been run, unload the program.
	 * 
	 */
    @AfterClass
    public static void unloadProgram() {
		LoaderPlugin.getDefault().unload( executable.getUri() );
    }
    /*
	 * 
	 * Ending static code
	 *  
	 */
}