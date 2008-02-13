
/*$Id: Comp_lambdaExpressionUseCase.java,v 1.1 2008-02-13 10:32:09 cfaucher Exp $
* Project : org.kermeta.compiler.tests
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* This is generated thanks to the KET template: CompilerUseCase.ket
*/

package org.kermeta.compiler.tests.behavior;

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

public class Kcomp_lambdaExpressionUseCase {

	/*
     * 
     * Beginning dynamic code for the current use case
     * 
     */
	private String use_case = "comp_lambdaExpression";
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
			executable = LoaderPlugin.getDefault().load( Constants.TEST_COMP_BEHAVIOR_LAUNCHER, options);
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

	private String test_case_comp_lambdaExpression_test001 = "test001";
	
	private String input_comp_lambdaExpression_test001 = "";
	
	private String output_comp_lambdaExpression_test001 = "";
	
	private String expected_output_comp_lambdaExpression_test001 = "";
	
	@Before public void setParams_comp_lambdaExpression_test001() {
		String prefix = "comp_lambdaExpression/test001";
		input_comp_lambdaExpression_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.INPUT_FOLDER + "/kermeta/" + use_case + "_" + test_case_comp_lambdaExpression_test001 + ".km";
		output_comp_lambdaExpression_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.OUTPUT_FOLDER + "/" + use_case + "_" + test_case_comp_lambdaExpression_test001 + ".ecore";
		expected_output_comp_lambdaExpression_test001 = Constants.SOURCE_PATH + prefix + "/" + KCompilerConstants.EXPECTED_OUTPUT_FOLDER +"/ecore/" + use_case + "_" + test_case_comp_lambdaExpression_test001 + ".ecore";
	}
	
	@Test public void comp_package_test_comp_lambdaExpression_test001() {
		run(input_comp_lambdaExpression_test001, output_comp_lambdaExpression_test001, expected_output_comp_lambdaExpression_test001);
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