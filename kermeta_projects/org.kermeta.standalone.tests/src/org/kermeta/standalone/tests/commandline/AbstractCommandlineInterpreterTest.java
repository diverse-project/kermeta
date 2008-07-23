/*$Id: AbstractCommandlineInterpreterTest.java,v 1.2 2008-07-23 09:23:38 dvojtise Exp $
* Project : org.kermeta.standalone.tests
* File : 	AbstractCommandlineInterpreterTest.java
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 21 juil. 08
* Authors : 
*      Didier Vojtisek <dvojtise@irisa.fr>
*/

package org.kermeta.standalone.tests.commandline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class AbstractCommandlineInterpreterTest {
	public final String STANDALONE_DIST_PATH = "../fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/";
	public final String STANDALONE_CLASSPATH = 
			STANDALONE_DIST_PATH + "kermeta_standalone.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/commons-logging.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/log4j.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/antlr.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/eclipse/core.runtime.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/eclipse/osgi.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/eclipse/equinox.common.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/eclipse/debug.core.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/eclipse/emf/common.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/eclipse/emf/ecore.jar" + ":" +
			STANDALONE_DIST_PATH + "thirdparty/eclipse/emf/ecore.xmi.jar";
	
	public final String FRAMEWORK_PATH = "jar:file:/C:/eclipse3.3/eclipse/workspace/fr.irisa.triskell.kermeta.standalone/dist/no_thirdparty_in_main_jar/kermeta_standalone.jar!/src/kermeta/framework.km";

	/**
	 * allows to run a command using exec and retrieve the output
	 * @param cmdarray
	 * @param printOutput
	 * @return
	 * @throws InterruptedException
	 */		
	public String runCommand(String[] cmdarray, boolean printOutput) throws InterruptedException{
		ProcessLauncher pLaunch= new ProcessLauncher(cmdarray) ; 
        pLaunch.start() ;
        pLaunch.join() ;
        return pLaunch.getAllOutputs();
	}
	
	static class ProcessLauncher extends Thread {
        protected String[] cmdarray ; 
        public PrintStream mainOutStream  = System.out;
        protected StringBuffer sbOutputs = new StringBuffer();
        
        public ProcessLauncher(String[] _cmdarray) {
            if ( _cmdarray != null && _cmdarray.length != 0)
            	cmdarray = _cmdarray ;
            else 
                throw new IllegalArgumentException(_cmdarray+" isn't a valid command") ;                 
        }
        
        public String getAllOutputs(){
        	return sbOutputs.toString();
        }
        
        public void run() { 
            try {
            	//System.out.println("starting exec");
	            Process p = Runtime.getRuntime().exec(cmdarray);
	            InputStream in = p.getInputStream() ;
	            InputStream err = p.getErrorStream() ;
	            OutputStream out = p.getOutputStream ();

	            out.close();
	            ProcessStream streamIn = new ProcessStream(in, mainOutStream, sbOutputs) ;
	            ProcessStream streamInErr = new ProcessStream(err, mainOutStream, sbOutputs) ;
	            streamIn.start() ; 
	            streamInErr.start() ;
	            //System.out.println("waiting subprocess");
	            p.waitFor() ;
	            //System.out.println("exec end");
            } catch (Exception e) {
                System.out.println("exec failed "+e);
            }
            
        }
	}

	static class ProcessStream extends Thread {
        private BufferedReader in ; 
        private PrintStream out;
        public StringBuffer sbOutputs;
        
        public ProcessStream(InputStream _in, PrintStream _out, StringBuffer _sbOutputs) {
            if ( _out != null && _in != null ) {
                    out = _out ; 
                    in = new BufferedReader(new InputStreamReader (_in) ) ;
                    sbOutputs = _sbOutputs;
            } else {
                    throw new IllegalArgumentException("Invalid Stream") ;                 
            }
        }
        
        public void run() {
            try {
                String line ; 
                //System.out.println(this.getName() + ": Waiting line");
                while (  ( line = in.readLine() ) != null ){ 
                	sbOutputs.append(line+"\n");
                    out.println(line) ;
                }
            } catch (IOException e) {
                System.out.println("io error");
            }                
        }
    
	}
}
