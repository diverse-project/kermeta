
/*$Id: Comp_callResultUseCase.java,v 1.7 2008-06-16 13:34:54 cfaucher Exp $
* Project : org.kermeta.compiler.tests
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* This is generated thanks to the KET template: CompilerUseCase.ket
*/

package org.kermeta.compiler.tests.behavior;

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

public class Comp_callResultUseCase {

	/*
     * 
     * Beginning dynamic code for the current use case
     * 
     */
	private String use_case = "comp_callResult";
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

	private String test_case_comp_callResult_test001 = "test001";
	
	private String input_comp_callResult_test001 = "";
	
	private String output_comp_callResult_test001 = "";
	
	private String expected_output_comp_callResult_test001 = "";
	
	@Before public void setParams_comp_callResult_test001() {
		String prefix = "comp_callResult/test001";
		input_comp_callResult_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_callResult_test001 + ".km";
		output_comp_callResult_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_callResult_test001 + ".ecore";
		expected_output_comp_callResult_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_callResult_test001 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_callResult_test001() {
		run(input_comp_callResult_test001, output_comp_callResult_test001, expected_output_comp_callResult_test001);
	}

	private String test_case_comp_callResult_test002 = "test002";
	
	private String input_comp_callResult_test002 = "";
	
	private String output_comp_callResult_test002 = "";
	
	private String expected_output_comp_callResult_test002 = "";
	
	@Before public void setParams_comp_callResult_test002() {
		String prefix = "comp_callResult/test002";
		input_comp_callResult_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_callResult_test002 + ".km";
		output_comp_callResult_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_callResult_test002 + ".ecore";
		expected_output_comp_callResult_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_callResult_test002 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_callResult_test002() {
		run(input_comp_callResult_test002, output_comp_callResult_test002, expected_output_comp_callResult_test002);
	}

	private String test_case_comp_callResult_test003 = "test003";
	
	private String input_comp_callResult_test003 = "";
	
	private String output_comp_callResult_test003 = "";
	
	private String expected_output_comp_callResult_test003 = "";
	
	@Before public void setParams_comp_callResult_test003() {
		String prefix = "comp_callResult/test003";
		input_comp_callResult_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_callResult_test003 + ".km";
		output_comp_callResult_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_callResult_test003 + ".ecore";
		expected_output_comp_callResult_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_callResult_test003 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_callResult_test003() {
		run(input_comp_callResult_test003, output_comp_callResult_test003, expected_output_comp_callResult_test003);
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