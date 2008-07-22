/*$Id: SimpleAPIInterpreterTest.java,v 1.1 2008-07-22 16:01:02 dvojtise Exp $
* Project : org.kermeta.standalone.tests
* File : 	SimpleAPIInterpreterTest.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 22 juil. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.standalone.tests.api;


import java.io.IOException;

import junit.framework.Assert;
import org.junit.Test;

import org.kermeta.interpreter.api.RunCommandLine;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;

public class SimpleAPIInterpreterTest {
	public final String FRAMEWORK_PATH = "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/framework.km";
	
	@Test
	public void runClassHelloWorldKMT() throws IOException, InterruptedException, NotRegisteredURIException, URIMalformedException{
		String[] paramArray = new String[]{
        		"-U", "./tests/simplecomandline/HelloWorld.main.kmt",
        		"-K", FRAMEWORK_PATH
        		};
		RunCommandLine theLauncherRun;				
	    theLauncherRun = new RunCommandLine(paramArray);
	    theLauncherRun.init();
	    theLauncherRun.run();
		//Assert.assertTrue("didn't found \"Hello world\" in output", output.toString().contains("Hello world"));
	}
}
