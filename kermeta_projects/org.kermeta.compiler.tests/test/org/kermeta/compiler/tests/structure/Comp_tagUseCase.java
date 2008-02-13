
/*$Id: Comp_tagUseCase.java,v 1.3 2008-02-13 10:40:52 cfaucher Exp $
* Project : org.kermeta.compiler.tests
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* This is generated thanks to the KET template: CompilerUseCase.ket
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
import fr.irisa.triskell.kermeta.kpm.helpers.RunnerHelper;
import org.kermeta.loader.LoadingOptions;
import fr.irisa.triskell.eclipse.console.LocalIOConsole;
import org.kermeta.compiler.tests.helper.DiffHelper;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.tests.comparison.EMFCompareModelHelper;

public class Comp_tagUseCase {

	/*
     * 
     * Beginning dynamic code for the current use case
     * 
     */
	private String use_case = "comp_tag";
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

	private String test_case_comp_tag_test001 = "test001";
	
	private String input_comp_tag_test001 = "";
	
	private String output_comp_tag_test001 = "";
	
	private String expected_output_comp_tag_test001 = "";
	
	@Before public void setParams_comp_tag_test001() {
		String prefix = "comp_tag/test001";
		input_comp_tag_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test001 + ".km";
		output_comp_tag_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test001 + ".ecore";
		expected_output_comp_tag_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test001 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test001() {
		run(input_comp_tag_test001, output_comp_tag_test001, expected_output_comp_tag_test001);
	}

	private String test_case_comp_tag_test002 = "test002";
	
	private String input_comp_tag_test002 = "";
	
	private String output_comp_tag_test002 = "";
	
	private String expected_output_comp_tag_test002 = "";
	
	@Before public void setParams_comp_tag_test002() {
		String prefix = "comp_tag/test002";
		input_comp_tag_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test002 + ".km";
		output_comp_tag_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test002 + ".ecore";
		expected_output_comp_tag_test002 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test002 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test002() {
		run(input_comp_tag_test002, output_comp_tag_test002, expected_output_comp_tag_test002);
	}

	private String test_case_comp_tag_test003 = "test003";
	
	private String input_comp_tag_test003 = "";
	
	private String output_comp_tag_test003 = "";
	
	private String expected_output_comp_tag_test003 = "";
	
	@Before public void setParams_comp_tag_test003() {
		String prefix = "comp_tag/test003";
		input_comp_tag_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test003 + ".km";
		output_comp_tag_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test003 + ".ecore";
		expected_output_comp_tag_test003 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test003 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test003() {
		run(input_comp_tag_test003, output_comp_tag_test003, expected_output_comp_tag_test003);
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

	private String test_case_comp_tag_test005 = "test005";
	
	private String input_comp_tag_test005 = "";
	
	private String output_comp_tag_test005 = "";
	
	private String expected_output_comp_tag_test005 = "";
	
	@Before public void setParams_comp_tag_test005() {
		String prefix = "comp_tag/test005";
		input_comp_tag_test005 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test005 + ".km";
		output_comp_tag_test005 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test005 + ".ecore";
		expected_output_comp_tag_test005 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test005 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test005() {
		run(input_comp_tag_test005, output_comp_tag_test005, expected_output_comp_tag_test005);
	}

	private String test_case_comp_tag_test006 = "test006";
	
	private String input_comp_tag_test006 = "";
	
	private String output_comp_tag_test006 = "";
	
	private String expected_output_comp_tag_test006 = "";
	
	@Before public void setParams_comp_tag_test006() {
		String prefix = "comp_tag/test006";
		input_comp_tag_test006 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test006 + ".km";
		output_comp_tag_test006 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test006 + ".ecore";
		expected_output_comp_tag_test006 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test006 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test006() {
		run(input_comp_tag_test006, output_comp_tag_test006, expected_output_comp_tag_test006);
	}

	private String test_case_comp_tag_test007 = "test007";
	
	private String input_comp_tag_test007 = "";
	
	private String output_comp_tag_test007 = "";
	
	private String expected_output_comp_tag_test007 = "";
	
	@Before public void setParams_comp_tag_test007() {
		String prefix = "comp_tag/test007";
		input_comp_tag_test007 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test007 + ".km";
		output_comp_tag_test007 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test007 + ".ecore";
		expected_output_comp_tag_test007 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test007 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test007() {
		run(input_comp_tag_test007, output_comp_tag_test007, expected_output_comp_tag_test007);
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

	private String test_case_comp_tag_test009 = "test009";
	
	private String input_comp_tag_test009 = "";
	
	private String output_comp_tag_test009 = "";
	
	private String expected_output_comp_tag_test009 = "";
	
	@Before public void setParams_comp_tag_test009() {
		String prefix = "comp_tag/test009";
		input_comp_tag_test009 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test009 + ".km";
		output_comp_tag_test009 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test009 + ".ecore";
		expected_output_comp_tag_test009 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test009 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test009() {
		run(input_comp_tag_test009, output_comp_tag_test009, expected_output_comp_tag_test009);
	}

	private String test_case_comp_tag_test010 = "test010";
	
	private String input_comp_tag_test010 = "";
	
	private String output_comp_tag_test010 = "";
	
	private String expected_output_comp_tag_test010 = "";
	
	@Before public void setParams_comp_tag_test010() {
		String prefix = "comp_tag/test010";
		input_comp_tag_test010 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test010 + ".km";
		output_comp_tag_test010 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test010 + ".ecore";
		expected_output_comp_tag_test010 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test010 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test010() {
		run(input_comp_tag_test010, output_comp_tag_test010, expected_output_comp_tag_test010);
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

	private String test_case_comp_tag_test013 = "test013";
	
	private String input_comp_tag_test013 = "";
	
	private String output_comp_tag_test013 = "";
	
	private String expected_output_comp_tag_test013 = "";
	
	@Before public void setParams_comp_tag_test013() {
		String prefix = "comp_tag/test013";
		input_comp_tag_test013 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test013 + ".km";
		output_comp_tag_test013 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test013 + ".ecore";
		expected_output_comp_tag_test013 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test013 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test013() {
		run(input_comp_tag_test013, output_comp_tag_test013, expected_output_comp_tag_test013);
	}

	private String test_case_comp_tag_test014 = "test014";
	
	private String input_comp_tag_test014 = "";
	
	private String output_comp_tag_test014 = "";
	
	private String expected_output_comp_tag_test014 = "";
	
	@Before public void setParams_comp_tag_test014() {
		String prefix = "comp_tag/test014";
		input_comp_tag_test014 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_tag_test014 + ".km";
		output_comp_tag_test014 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_tag_test014 + ".ecore";
		expected_output_comp_tag_test014 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_tag_test014 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_tag_test014() {
		run(input_comp_tag_test014, output_comp_tag_test014, expected_output_comp_tag_test014);
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
     		interpreter.setKStream( new LocalIOConsole() );
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
		boolean result = ! EMFCompareModelHelper.isDifferentAndSaveDiff(expected_output, output,  output + "_diff.xmi");
		if ( ! result )
			result = DiffHelper.interpreteDiff( output + "_diff.xmi" );
		return result;
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