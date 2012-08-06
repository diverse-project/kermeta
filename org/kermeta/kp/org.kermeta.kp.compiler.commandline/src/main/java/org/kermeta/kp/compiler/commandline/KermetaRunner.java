/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 22 sept. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
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
	
	public void runK2Program( List<String> params, String uriMapFileLocation) {
		
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
	        	scalaToolJarCP = (new URI(scala.tools.nsc.MainGenericRunner.class.getProtectionDomain().getCodeSource().getLocation().toString().replace(" ", "%20"))).getPath();
	        	scalaToolJarCP += File.pathSeparator+(new URI(scala.ScalaObject.class.getProtectionDomain().getCodeSource().getLocation().toString().replace(" ", "%20"))).getPath();
			} catch (URISyntaxException e1) {
				this.logger.error(e1.toString(), KermetaCompiler.LOG_MESSAGE_GROUP, e1);
			} 
	        ArrayList<String> processBuilderParams = 
	        		new ArrayList<String>(Arrays.asList(getJavaVMbin(), "-cp", scalaToolJarCP,
	        				"-Durimap.file.location="+(uriMapFileLocation!=null?uriMapFileLocation:""),
	        				"scala.tools.nsc.MainGenericRunner", 
	        				"-savecompiled",
	        				"-classpath",f.toString() + outputBinFolder,
	        				scalaAspectPrefix + "runner.MainRunner"));
	        processBuilderParams.addAll(params);
	        ProcessBuilder builder = new ProcessBuilder(processBuilderParams);
	        this.logger.debug("starting new process with command " +builder.command().toString(), KermetaCompiler.LOG_MESSAGE_GROUP);
	       // builder.redirectErrorStream(true); // debug version: merge output and error stream
	        Process process;
			try {
				process = builder.start();
				
				// redirect logger.getReader to process System.in
				KermetaRunner.BufferedReader2Stream in2Stream = new KermetaRunner.BufferedReader2Stream(logger.getReader(), process.getOutputStream(),logger);
				// redirect process System.out to logger.info
				KermetaRunner.Stream2MessagingSystem out2ms = new KermetaRunner.Stream2MessagingSystem(process.getInputStream(),logger, false);
				KermetaRunner.Stream2MessagingSystem err2ms = new KermetaRunner.Stream2MessagingSystem(process.getErrorStream(),logger, true);
				CancelMonitor cancelMonitor = new CancelMonitor(process, this);
				 
				Thread in2StreamThread = new Thread(in2Stream);
				Thread out2msThread = new Thread(out2ms);
				Thread err2msThread = new Thread(err2ms);
				Thread cancelMonitorThread = new Thread(cancelMonitor);
				
				in2StreamThread.start();
				out2msThread.start();
				err2msThread.start();
				cancelMonitorThread.start();
				
				out2msThread.join();
				err2msThread.join();
				in2Stream.close();
				in2StreamThread.interrupt();
				/*int exitVal = */ process.waitFor();
				cancelMonitorThread.interrupt();
				this.logger.debug("stream threads have joined ", KermetaCompiler.LOG_MESSAGE_GROUP);
				
			} catch (IOException e) {
				this.logger.error(e.toString(), KermetaCompiler.LOG_MESSAGE_GROUP, e);
			} catch (InterruptedException e) {
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
	
	/** subclasses might implement this operation to provide ad-hoc code that is able to detect if the run must be cancelled
	 * 
	 * @return
	 */
	public boolean mustCancelRun(){
		return false;
	}
	
	public static class Stream2MessagingSystem implements Runnable {
        private BufferedReader reader;
        private MessagingSystem logger;
        private boolean isError;

        public Stream2MessagingSystem(InputStream inputStream, MessagingSystem logger, boolean isError) {
                this.reader = new BufferedReader(new InputStreamReader(inputStream));
                this.logger = logger;
                this.isError = isError;
        }

        public void run() {
                String line;
                try {
                        while((line = this.reader.readLine()) != null) {
                        	if(isError){
                        		logger.error(line,"");
                        	}
                        	else
                        		logger.info(line,"");
                        }
                        this.reader.close();
                }
                catch (IOException e) {
                	logger.error(e.getMessage(), "",e);
                }
        }
    }
	

	
	
	public static class BufferedReader2Stream implements Runnable {
        private BufferedReader reader;
        private PrintWriter writer;
        private MessagingSystem logger;
        private boolean mustContinue = true;

        public BufferedReader2Stream(BufferedReader reader, OutputStream outputStream, MessagingSystem logger) {
                this.reader = reader;
                this.logger = logger;
                writer = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream)), true);
        }

        public void close(){
        	mustContinue = false;
        	/*try {
				reader.close();
			} catch (IOException e) {
            	logger.error(e.getMessage(), "",e);
			}*/
        	
        }
		public void run() {
			try{
                logger.debug("BufferedReader2Stream started", "");
                String line;
                try {
                	while(mustContinue){
	                	// wait until we have data to complete a readLine()
	                    while (!this.reader.ready()) {
	                          Thread.sleep(200);
	                    }
	                    line = this.reader.readLine();
	                    if(line != null){
	                    	writer.println(line);
	                    }
                    }
	                writer.close();
                }
                catch (IOException e) {
                	//logger.error(e.getMessage(), "",e);
                } catch (InterruptedException e) {
                	//logger.error(e.getMessage(), "",e);
				}
			}
			finally{
                logger.debug("BufferedReader2Stream has stopped", "");
			}
        }
		
        
    }

}
