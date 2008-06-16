
/*$Id: Comp_operationStructureUseCase.java,v 1.7 2008-06-16 13:32:46 cfaucher Exp $
* Project : org.kermeta.compiler.tests
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* This is generated thanks to the KET template: CompilerUseCase.ket
*/

package org.kermeta.compiler.tests.structure;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kermeta.compiler.tests.KCompilerConstants;
import org.kermeta.compiler.tests.helper.Constants;
import org.kermeta.compiler.tests.helper.DiffHelper;
import org.kermeta.interpreter.api.InitializationError;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.simk.impl.SimkPackageImpl;

import fr.irisa.triskell.eclipse.console.LocalIOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.tests.comparison.EMFCompareModelHelper;

public class Comp_operationStructureUseCase {

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
	static private Interpreter _interpreter;
	
	/*
	 * 
	 * We only load one time the program when the current class is loading.
	 * 
	 */
	@BeforeClass
	static public void setInterpreter() {
		IOPlugin.LOCAL_USE = true;
		LoaderPlugin.getDefault();
		
		SimkPackageImpl.init();

		if ( _interpreter == null )
			try {
				//KermetaUnit kermetaUnit = RunnerHelper.getKermetaUnitToExecute(Constants.TEST_COMP_BEHAVIOR_LAUNCHER);
				Map<String, Object> options = new HashMap<String, Object>();
				//options.put( InterpreterOptions.MERGE, false );
				options.put( InterpreterOptions.CLEAN_AT_END, false);
				_interpreter = new Interpreter(Constants.TEST_COMP_BEHAVIOR_LAUNCHER, InterpreterMode.RUN, options);
				_interpreter.setEntryPoint("kermeta::compiler::Main", "main");
			} catch (NotRegisteredURIException e) {
			} catch (URIMalformedException e) {
			}
	}
	
	/**
	 * 
	 * Once all the tests have been run, unload the program.
	 * 
	 */
	@AfterClass
	static public void unsetInterpreter() {
		LoaderPlugin.getDefault().unload( Constants.TEST_COMP_BEHAVIOR_LAUNCHER );
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
		String prefix = "comp_operationStructure/test001";
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
		String prefix = "comp_operationStructure/test002";
		input_comp_operationStructure_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_operationStructure_test002 + ".km";
		output_comp_operationStructure_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_operationStructure_test002 + ".ecore";
		expected_output_comp_operationStructure_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_operationStructure_test002 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_operationStructure_test002() {
		run(input_comp_operationStructure_test002, output_comp_operationStructure_test002, expected_output_comp_operationStructure_test002);
	}

	private String test_case_comp_operationStructure_test003 = "test003";
	
	private String input_comp_operationStructure_test003 = "";
	
	private String output_comp_operationStructure_test003 = "";
	
	private String expected_output_comp_operationStructure_test003 = "";
	
	@Before public void setParams_comp_operationStructure_test003() {
		String prefix = "comp_operationStructure/test003";
		input_comp_operationStructure_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_operationStructure_test003 + ".km";
		output_comp_operationStructure_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_operationStructure_test003 + ".ecore";
		expected_output_comp_operationStructure_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_operationStructure_test003 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_operationStructure_test003() {
		run(input_comp_operationStructure_test003, output_comp_operationStructure_test003, expected_output_comp_operationStructure_test003);
	}

	private String test_case_comp_operationStructure_test004 = "test004";
	
	private String input_comp_operationStructure_test004 = "";
	
	private String output_comp_operationStructure_test004 = "";
	
	private String expected_output_comp_operationStructure_test004 = "";
	
	@Before public void setParams_comp_operationStructure_test004() {
		String prefix = "comp_operationStructure/test004";
		input_comp_operationStructure_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_operationStructure_test004 + ".km";
		output_comp_operationStructure_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_operationStructure_test004 + ".ecore";
		expected_output_comp_operationStructure_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_operationStructure_test004 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_operationStructure_test004() {
		run(input_comp_operationStructure_test004, output_comp_operationStructure_test004, expected_output_comp_operationStructure_test004);
	}

	private String test_case_comp_operationStructure_test005 = "test005";
	
	private String input_comp_operationStructure_test005 = "";
	
	private String output_comp_operationStructure_test005 = "";
	
	private String expected_output_comp_operationStructure_test005 = "";
	
	@Before public void setParams_comp_operationStructure_test005() {
		String prefix = "comp_operationStructure/test005";
		input_comp_operationStructure_test005 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_operationStructure_test005 + ".km";
		output_comp_operationStructure_test005 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_operationStructure_test005 + ".ecore";
		expected_output_comp_operationStructure_test005 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_operationStructure_test005 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_operationStructure_test005() {
		run(input_comp_operationStructure_test005, output_comp_operationStructure_test005, expected_output_comp_operationStructure_test005);
	}

	private String test_case_comp_operationStructure_test006 = "test006";
	
	private String input_comp_operationStructure_test006 = "";
	
	private String output_comp_operationStructure_test006 = "";
	
	private String expected_output_comp_operationStructure_test006 = "";
	
	@Before public void setParams_comp_operationStructure_test006() {
		String prefix = "comp_operationStructure/test006";
		input_comp_operationStructure_test006 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_operationStructure_test006 + ".km";
		output_comp_operationStructure_test006 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_operationStructure_test006 + ".ecore";
		expected_output_comp_operationStructure_test006 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_operationStructure_test006 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_operationStructure_test006() {
		run(input_comp_operationStructure_test006, output_comp_operationStructure_test006, expected_output_comp_operationStructure_test006);
	}

	private String test_case_comp_parameter_test003 = "test003";
	
	private String input_comp_parameter_test003 = "";
	
	private String output_comp_parameter_test003 = "";
	
	private String expected_output_comp_parameter_test003 = "";
	
	@Before public void setParams_comp_parameter_test003() {
		String prefix = "comp_parameter/test003";
		input_comp_parameter_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_parameter_test003 + ".km";
		output_comp_parameter_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_parameter_test003 + ".ecore";
		expected_output_comp_parameter_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_parameter_test003 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_parameter_test003() {
		run(input_comp_parameter_test003, output_comp_parameter_test003, expected_output_comp_parameter_test003);
	}

	private String test_case_comp_parameter_test004 = "test004";
	
	private String input_comp_parameter_test004 = "";
	
	private String output_comp_parameter_test004 = "";
	
	private String expected_output_comp_parameter_test004 = "";
	
	@Before public void setParams_comp_parameter_test004() {
		String prefix = "comp_parameter/test004";
		input_comp_parameter_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_parameter_test004 + ".km";
		output_comp_parameter_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_parameter_test004 + ".ecore";
		expected_output_comp_parameter_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_parameter_test004 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_parameter_test004() {
		run(input_comp_parameter_test004, output_comp_parameter_test004, expected_output_comp_parameter_test004);
	}

	private String test_case_comp_tag_test004 = "test004";
	
	private String input_comp_tag_test004 = "";
	
	private String output_comp_tag_test004 = "";
	
	private String expected_output_comp_tag_test004 = "";
	
	@Before public void setParams_comp_tag_test004() {
		String prefix = "comp_tag/test004";
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
		String prefix = "comp_tag/test008";
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
			 * Setting the parameters.
			 */
			String[] args = new String[3];
			args[0] = input;
			args[1] = "";//trace; path for the generated traceability file.
			args[2] = output;
			_interpreter.setParameters(args);
				
			/*
			 * Start the interpreter.
			 */
	   		_interpreter.setStreams( new LocalIOConsole() );
			_interpreter.launch();
				
			/*
			 * Assertion
			 */
			Assert.assertTrue( compare(output, expected_output) );
		} catch (InitializationError e) {
			Assert.assertTrue(e.getErrorsAsString(), false);
		}
	}
	
	private boolean compare(String output, String expected_output) {
		boolean result = ! EMFCompareModelHelper.isDifferentAndSaveDiff(expected_output, output,  output + "_diff.xmi");
		if ( ! result )
			result = DiffHelper.interpreteDiff( output + "_diff.xmi" );
		return result;
	}
    /*
	 * 
	 * Ending static code
	 *  
	 */
}