
/*$Id: Comp_functionTypeUseCase.java,v 1.4 2008-05-20 08:22:47 ftanguy Exp $
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

public class Comp_functionTypeUseCase {

	/*
     * 
     * Beginning dynamic code for the current use case
     * 
     */
	private String use_case = "comp_functionType";
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