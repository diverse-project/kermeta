
/*$Id: BasicClockProfile2Ecore_001.java,v 1.4 2008-04-28 13:37:45 ftanguy Exp $
* Project : org.kermeta.compiler.tests
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* This is generated thanks to the KET template: CompilerUseCase.ket
*/

package org.kermeta.uml2.profiles.tests.toecoretestsuite;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kermeta.interpreter.api.Interpreter;
import org.kermeta.interpreter.api.InterpreterMode;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;
import org.kermeta.loader.LoadingOptions;
import org.kermeta.uml2.profiles.tests.helper.Constants;
import org.kermeta.uml2.profiles.tests.helper.DiffHelper;
import org.openembedd.tests.utils.UiTools;

import fr.irisa.triskell.eclipse.console.LocalIOConsole;
import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.tests.comparison.EMFCompareModelHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

public class BasicClockProfile2Ecore_001 {

	/*
     * 
     * Beginning dynamic code for the current use case
     * 
     */
	private String use_case = "basicclock";
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
			executable = LoaderPlugin.getDefault().load( Constants.TEST_COMP_PROFILE2ECORE_LAUNCHER, null);
			KermetaTypeChecker typechecker = new KermetaTypeChecker( executable );
        	typechecker.checkUnit();			
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

	
	private String input_test001 = "";
	
	private String output_test001 = "";
	
	private String expected_output_test001 = "";
	
	@Before public void setParams_basic_clock_test001() {
		String prefix = "basicclock/test001";
		input_test001 = Constants.SOURCE_PATH + prefix + "/" + Constants.INPUT_FOLDER + "/001_BasicClock.profile.uml";
		/* no file can be put in plugins!!!!!!
		output_test001 = Constants.SOURCE_PATH + prefix + "/" + Constants.OUTPUT_FOLDER + "/001_BasicClock.profile.ecore";
		expected_output_test001 = Constants.SOURCE_PATH + prefix + "/" + Constants.EXPECTED_OUTPUT_FOLDER +"/001_BasicClock.profile.ecore";
		*/
		output_test001 = UiTools.getWorkspacePath() + prefix + "/" + Constants.OUTPUT_FOLDER + "/001_BasicClock.profile.ecore";
		expected_output_test001 = UiTools.getWorkspacePath() + prefix + "/" + Constants.EXPECTED_OUTPUT_FOLDER +"/001_BasicClock.profile.ecore";
	}
	
	@Test public void basic_clock_test001() {
		run(input_test001, output_test001, expected_output_test001);
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
			 * Creating the interpreter.
			 */
			Interpreter interpreter = new Interpreter(Constants.TEST_COMP_PROFILE2ECORE_LAUNCHER, InterpreterMode.RUN, null);
			/*
			 * Setting the parameters.
			 */
			String[] param = new String[2];
			param[0] = input;
			param[1] = output;
			interpreter.setParameters(param);
			interpreter.setEntryPoint("UMLProfileUtils::Main", "main");
			/*
			 * Start the interpreter.
			 */
     		interpreter.setStreams( new LocalIOConsole() );
			interpreter.launch();
			/*
			 * Assertion
			 */
			Assert.assertTrue( compare(output, expected_output) );
		} catch (NotRegisteredURIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URIMalformedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		}
		/* catch (URIMalformedException e) {
		}
			e.printStackTrace();		
		} catch (IOException e) {
			e.printStackTrace();
		}*/
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
		IOPlugin.getDefault().unload( executable.getUri() );
    }
    /*
	 * 
	 * Ending static code
	 *  
	 */
}