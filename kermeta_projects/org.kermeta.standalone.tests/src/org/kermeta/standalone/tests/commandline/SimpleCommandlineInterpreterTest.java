/*$Id: SimpleCommandlineInterpreterTest.java,v 1.1 2008-07-22 16:01:01 dvojtise Exp $
* Project : org.kermeta.standalone.tests
* File : 	CommandlineTest001.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 21 juil. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.standalone.tests.commandline;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import junit.framework.Assert;

import org.junit.Test;
import org.kermeta.interpreter.api.RunCommandLine;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;


/**
 * This class tests various ways to start the Hello world sample
 *
 */
public class SimpleCommandlineInterpreterTest extends AbstractCommandlineInterpreterTest{
	@Test
	public void javaExecClassHelloWorldKMT() throws IOException, InterruptedException{        
        /*String[] cmdarray = new String[]{"java", 
        		"-cp", "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/thirdparty/commons-logging.jar",
        		"-jar", "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/kermeta_standalone.jar"
        		};
        		*/
		String[] cmdarray = new String[]{"java", 
        		"-cp", STANDALONE_CLASSPATH,
        		"org.kermeta.interpreter.api.RunCommandLine",
        		"-U", "platform:/resource/tests/simplecommandline/HelloWorld.main.kmt"
        		};
		//String cmdarray = "java -showversion";
		String output = runCommand(cmdarray, true);
            
        Assert.assertTrue("didn't found \"Hello world\" in output", output.toString().contains("Hello world"));
       
	}
	@Test
	public void javaExecJarHelloWorldKMT() throws IOException, InterruptedException{        
        /*String[] cmdarray = new String[]{"java", 
        		"-cp", "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/thirdparty/commons-logging.jar",
        		"-jar", "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/kermeta_standalone.jar"
        		};
        		*/
		String[] cmdarray = new String[]{"java", 
        		"-cp", STANDALONE_CLASSPATH,
        		"-jar", "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/kermeta_standalone.jar",
        		"-U", "platform:/resource/tests/simplecommandline/HelloWorld.main.kmt" 
        		};
		//String cmdarray = "java -showversion";
		String output = runCommand(cmdarray, true);
            
        Assert.assertTrue("didn't found \"Hello world\" in output", output.toString().contains("Hello world"));
       
	}
	
	@Test
	public void javaExecJarHelloWorldKMT_minimal_args() throws IOException, InterruptedException{        
        /*String[] cmdarray = new String[]{"java", 
        		"-cp", "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/thirdparty/commons-logging.jar",
        		"-jar", "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/kermeta_standalone.jar"
        		};
        		*/
		String[] cmdarray = new String[]{"java",
        		"-jar", "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/kermeta_standalone.jar",
        		"-U", "platform:/resource/tests/simplecommandline/HelloWorld.main.kmt" 
        		};
		//String cmdarray = "java -showversion";
		String output = runCommand(cmdarray, true);
            
        Assert.assertTrue("didn't found \"Hello world\" in output", output.toString().contains("Hello world"));
       
	}
	
	// direct test of the arguments
	@Test
	public void runClassHelloWorldKMT() throws IOException, InterruptedException, NotRegisteredURIException, URIMalformedException{
		
		// capture out stream
		PrintStream originalOutStream  = System.out;
		ByteArrayOutputStream buffer =  new ByteArrayOutputStream();
		PrintStream newOutStream  = new PrintStream( new BufferedOutputStream(buffer));
		System.setOut(newOutStream);
		String[] paramArray = new String[]{
        		"-U", "platform:/resource/tests/simplecommandline/HelloWorld.main.kmt",
        		"-K", FRAMEWORK_PATH,
        		"-M", "./conf/no_thirdparty_in_main_jar/uri.map"
        		};
		RunCommandLine theLauncherRun;				
	    theLauncherRun = new RunCommandLine(paramArray);
	    theLauncherRun.init();
	    theLauncherRun.run();

	    // set back the stream 
	    System.setOut(originalOutStream);
	    System.out.print(buffer);
	    
		Assert.assertTrue("didn't found \"Hello world\" in output", buffer.toString().contains("Hello world"));
	    
	}
	// direct test of the arguments, using as few arguments as possible
	@Test
	public void runClassHelloWorldKMT_minimal_args() throws IOException, InterruptedException, NotRegisteredURIException, URIMalformedException{
		
		// capture out stream
		PrintStream originalOutStream  = System.out;
		ByteArrayOutputStream buffer =  new ByteArrayOutputStream();
		PrintStream newOutStream  = new PrintStream( new BufferedOutputStream(buffer));
		System.setOut(newOutStream);
		String[] paramArray = new String[]{
        		"-U", "platform:/resource/tests/simplecommandline/HelloWorld.main.kmt"
        		};
		RunCommandLine theLauncherRun;				
	    theLauncherRun = new RunCommandLine(paramArray);
	    theLauncherRun.init();
	    theLauncherRun.run();

	    // set back the stream 
	    System.setOut(originalOutStream);
	    System.out.print(buffer);
	    
		Assert.assertTrue("didn't found \"Hello world\" in output", buffer.toString().contains("Hello world"));
	    
	}
}
