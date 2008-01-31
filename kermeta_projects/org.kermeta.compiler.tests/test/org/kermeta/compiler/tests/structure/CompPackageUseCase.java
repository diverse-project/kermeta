

/*$Id: CompPackageUseCase.java,v 1.1 2008-01-31 09:06:24 ftanguy Exp $
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

public class CompPackageUseCase {

	private String use_case = "comp_package";
	
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
			executable = LoaderPlugin.getDefault().load( "platform:/resource/org.kermeta.compiler.kmt/src/kermeta/StructureCompiler.kmt", options);
		} catch (URIMalformedException e) {
			e.printStackTrace();
		} catch (NotRegisteredURIException e) {
			e.printStackTrace();
		}
    }
	
    /*
     * 
     * Beginning test case 001.
     * 
     */
	private String test_case001 = "test001";
	
	private String input001 = "";
	
	private String output001 = "";
	
	private String expected_output001 = "";
	
	@Before public void setParams001() {
		String prefix = "/" + use_case + "/" + test_case001;
		input001 = Constants.SOURCE_PATH + prefix + "/input/kermeta/" + use_case + "_" + test_case001 + ".km";
		output001 = Constants.SOURCE_PATH + prefix + "/output/" + use_case + "_" + test_case001 + ".ecore";
		expected_output001 = Constants.SOURCE_PATH + prefix + "/expected_output/ecore/" + use_case + "_" + test_case001 + ".ecore";
	}
	
	@Test public void comp_package_test001() {
		run(input001, output001, expected_output001);
	}
	/*
	 * 
	 * Ending test case 001.
	 * 
	 */
	
	private void run(String input, String output, String expected_output) {
		try {
			/*
			 * 
			 * Getting the kermeta unit to execute.
			 * 
			 */
			KermetaUnit unitToExecute = RunnerHelper.getKermetaUnitToExecute( executable, Constants.BIN_PATH);
			/*
			 * 
			 * Creating the interpreter.
			 * 
			 */
			KermetaInterpreter interpreter = new KermetaInterpreter(unitToExecute, null);
			/*
			 * 
			 * Setting the parameters.
			 * 
			 */
			ArrayList<RuntimeObject> params = new ArrayList<RuntimeObject>();
			params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(input, interpreter.getMemory().getROFactory()));
			params.add(fr.irisa.triskell.kermeta.runtime.basetypes.String.create(output, interpreter.getMemory().getROFactory()));
			interpreter.setEntryParameters(params);
			/*
			 * 
			 * Start the interpreter.
			 * 
			 */
			interpreter.launch();
			/*
			 * 
			 * Assertion
			 * 
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
		return EMFCompareModelHelper.compare(expected_output, output);
	}
	
	/*
	 * 
	 * Once all the tests have been run, unload the program.
	 * 
	 */
    @AfterClass
    public static void unloadProgram() {
		LoaderPlugin.getDefault().unload( executable.getUri() );
    }
}


