
/*$Id: Comp_primitiveTypeUseCase.java,v 1.8 2008-06-16 13:34:54 cfaucher Exp $
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
import org.kermeta.compiler.common.KCompilerConstants;
import org.kermeta.compiler.tests.helper.Constants;
import org.kermeta.compiler.tests.helper.DiffHelper;
import org.kermeta.interpreter.api.InitializationError;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.interpreter.api.InterpreterOptions;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.simk.impl.SimkPackageImpl;

import fr.irisa.triskell.eclipse.console.LocalIOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.tests.comparison.EMFCompareModelHelper;

public class Comp_primitiveTypeUseCase {

	/*
     * 
     * Beginning dynamic code for the current use case
     * 
     */
	private String use_case = "comp_primitiveType";
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
		IOPlugin.getDefault().unload( Constants.TEST_COMP_BEHAVIOR_LAUNCHER );
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

	private String test_case_comp_primitiveType_test001 = "test001";
	
	private String input_comp_primitiveType_test001 = "";
	
	private String output_comp_primitiveType_test001 = "";
	
	private String expected_output_comp_primitiveType_test001 = "";
	
	@Before public void setParams_comp_primitiveType_test001() {
		String prefix = "comp_primitiveType/test001";
		input_comp_primitiveType_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_primitiveType_test001 + ".km";
		output_comp_primitiveType_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_primitiveType_test001 + ".ecore";
		expected_output_comp_primitiveType_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_primitiveType_test001 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_primitiveType_test001() {
		run(input_comp_primitiveType_test001, output_comp_primitiveType_test001, expected_output_comp_primitiveType_test001);
	}

	private String test_case_comp_primitiveType_test002 = "test002";
	
	private String input_comp_primitiveType_test002 = "";
	
	private String output_comp_primitiveType_test002 = "";
	
	private String expected_output_comp_primitiveType_test002 = "";
	
	@Before public void setParams_comp_primitiveType_test002() {
		String prefix = "comp_primitiveType/test002";
		input_comp_primitiveType_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_primitiveType_test002 + ".km";
		output_comp_primitiveType_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_primitiveType_test002 + ".ecore";
		expected_output_comp_primitiveType_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_primitiveType_test002 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_primitiveType_test002() {
		run(input_comp_primitiveType_test002, output_comp_primitiveType_test002, expected_output_comp_primitiveType_test002);
	}

	private String test_case_comp_primitiveType_test003 = "test003";
	
	private String input_comp_primitiveType_test003 = "";
	
	private String output_comp_primitiveType_test003 = "";
	
	private String expected_output_comp_primitiveType_test003 = "";
	
	@Before public void setParams_comp_primitiveType_test003() {
		String prefix = "comp_primitiveType/test003";
		input_comp_primitiveType_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_primitiveType_test003 + ".km";
		output_comp_primitiveType_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_primitiveType_test003 + ".ecore";
		expected_output_comp_primitiveType_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_primitiveType_test003 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_primitiveType_test003() {
		run(input_comp_primitiveType_test003, output_comp_primitiveType_test003, expected_output_comp_primitiveType_test003);
	}

	private String test_case_comp_primitiveType_test004 = "test004";
	
	private String input_comp_primitiveType_test004 = "";
	
	private String output_comp_primitiveType_test004 = "";
	
	private String expected_output_comp_primitiveType_test004 = "";
	
	@Before public void setParams_comp_primitiveType_test004() {
		String prefix = "comp_primitiveType/test004";
		input_comp_primitiveType_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_primitiveType_test004 + ".km";
		output_comp_primitiveType_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_primitiveType_test004 + ".ecore";
		expected_output_comp_primitiveType_test004 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_primitiveType_test004 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_primitiveType_test004() {
		run(input_comp_primitiveType_test004, output_comp_primitiveType_test004, expected_output_comp_primitiveType_test004);
	}

	private String test_case_comp_tag_test011 = "test011";
	
	private String input_comp_tag_test011 = "";
	
	private String output_comp_tag_test011 = "";
	
	private String expected_output_comp_tag_test011 = "";
	
	@Before public void setParams_comp_tag_test011() {
		String prefix = "comp_tag/test011";
		input_comp_tag_test011 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test011 + ".km";
		output_comp_tag_test011 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test011 + ".ecore";
		expected_output_comp_tag_test011 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test011 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test011() {
		run(input_comp_tag_test011, output_comp_tag_test011, expected_output_comp_tag_test011);
	}

	private String test_case_comp_tag_test012 = "test012";
	
	private String input_comp_tag_test012 = "";
	
	private String output_comp_tag_test012 = "";
	
	private String expected_output_comp_tag_test012 = "";
	
	@Before public void setParams_comp_tag_test012() {
		String prefix = "comp_tag/test012";
		input_comp_tag_test012 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test012 + ".km";
		output_comp_tag_test012 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test012 + ".ecore";
		expected_output_comp_tag_test012 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test012 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test012() {
		run(input_comp_tag_test012, output_comp_tag_test012, expected_output_comp_tag_test012);
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