/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 22 sept. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.List;

import org.kermeta.language.km2bytecode.embedded.scala.EmbeddedScalaRunner;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

/**
 * Runner for Kermeta compiled programs
 * Programs are run in a command line mode, ie. like a system.exec and classpath with parameter, other Runner migt be depvelopped for other embedded run mode (ex: OSGI, kevoree...)
 * Is able to use a separate JVM to be able to redirect output of the kermeta programs to a MessagingSystem
 */
public class KermetaRunner {

	public boolean runResultInSeparateVM = true;
	public MessagingSystem logger;
	
	public String outputBinFolder;
	public String scalaAspectPrefix;
	public List<String> classpath;
	
	protected String javaVMbin;
	public KermetaRunner(String outputBinFolder, String scalaAspectPrefix, List<String> classpath, MessagingSystem logger){
		this.outputBinFolder = outputBinFolder;
		this.scalaAspectPrefix = scalaAspectPrefix;
		this.classpath = classpath;
		this.logger = logger;
	}
	
	public void runK2Program( List<String> params) {
		
		this.logger.initProgress(scalaAspectPrefix, "Starting "+scalaAspectPrefix + "runner.MainRunner", KermetaCompiler.LOG_MESSAGE_GROUP, 0);
		StringBuffer f = new StringBuffer();
		for (String s : classpath) {
			f.append(s);
			f.append(File.pathSeparator);

		}
		
		if(runResultInSeparateVM){
	        //scala.tools.nsc.MainGenericRunner.class.getClassLoader().getResource("/");
	        String scalaToolJarCP = "";
	        try { // get classpath for scala compiler from current classpath (we suppose that it should run if run in the same VM using EmbeddedScalaRunner)
	        	scalaToolJarCP = scala.tools.nsc.MainGenericRunner.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
	        	scalaToolJarCP += File.pathSeparator+scala.ScalaObject.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
			} catch (URISyntaxException e1) {
				this.logger.error(e1.toString(), KermetaCompiler.LOG_MESSAGE_GROUP, e1);
			} 
	        
	        ProcessBuilder builder = new ProcessBuilder(
	        		getJavaVMbin(), "-cp", scalaToolJarCP, "scala.tools.nsc.MainGenericRunner", "-savecompiled",
	                "-classpath",f.toString() + outputBinFolder,
	                scalaAspectPrefix + "runner.MainRunner", 
	                params.toString());
	        this.logger.debug("starting new process with command " +builder.command().toString(), KermetaCompiler.LOG_MESSAGE_GROUP);
	        builder.redirectErrorStream(true); // debug version: merge output and error stream
	        Process process;
			try {
				process = builder.start();
				InputStream is = process.getInputStream();
			    InputStreamReader isr = new InputStreamReader(is);
			    BufferedReader br = new BufferedReader(isr);
			    String line;
			    while ((line = br.readLine()) != null) {
			    	this.logger.info(line, KermetaCompiler.LOG_MESSAGE_GROUP);
			    }
			    br.close();
			    //this.logger.debug("Program terminated!", KermetaCompiler.LOG_MESSAGE_GROUP);
			} catch (IOException e) {
				this.logger.error(e.toString(), KermetaCompiler.LOG_MESSAGE_GROUP, e);
			}

		}
		else{
			// in the same JVM, but classpath is still different, output not redirected
			EmbeddedScalaRunner.run(f.toString() + outputBinFolder, scalaAspectPrefix + "runner.MainRunner", params);
		}
		this.logger.doneProgress(scalaAspectPrefix, "Program terminated!", KermetaCompiler.LOG_MESSAGE_GROUP);

	}

	public String getJavaVMbin() {
		if (javaVMbin == null){
			// if not set, by default use java.home JVM
			String javaHome = System.getProperty("java.home");
	        javaVMbin = javaHome +
	                File.separator + "bin" +
	                File.separator + "java";
		}
		return javaVMbin;
	}

	public void setJavaVMbin(String javaVMbin) {
		this.javaVMbin = javaVMbin;
	}
}
