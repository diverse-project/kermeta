package org.kermeta.compiler.test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import junit.framework.TestCase;

import org.junit.Test;

public class TestCaseRunnerPlatformDependant extends TestCase {
	public void process(String testcase) {
		
		String basePATH = this.getClass().getResource("/").getPath();
		String kmPATH = basePATH+testcase;
		System.out.println("TestCase Process Begin on : " + kmPATH);


		try {
			// Step 1 : creation URI.map
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(basePATH + "/uri.map", true));
			dos.writeBytes("\"platform:/plugin/\" "+"\"file:"+basePATH+"\"\n");
			dos.writeBytes("\"platform:/resource/\" "+"\"file:"+basePATH+"\"\n");
			dos.close();
			
			
			// Step 2 : Run Interpreter on Merged compiler with KM to Compile
			//String[] args = { "-M" , basePATH + "/uri.map" , "-Merged" , "-TypeChecked" ,"-U","platform:/resource/ScalaCompiler.km", "platform:/resource/"+testcase, basePATH+"/outputScala"};
			String[] args = { "-M" , basePATH + "/uri.map"  ,"-U","platform:/resource/ScalaCompiler.kmt", "platform:/resource/"+testcase, basePATH+"/outputScala"};
			org.kermeta.interpreter.api.RunCommandLine.main(args);
			
			// Step 3 : Run Scala Compiler on OutputDir
			StringBuilder runningCommand = new StringBuilder();
			//TODO modififer pour windows
			//runningCommand.append("C:\\maven\\apache-maven-2.2.1\\bin\\mvn.bat clean scala:compile scala:run -B ");
			runningCommand.append("mvn clean scala:compile scala:run -B ");
			
			runningCommand.append("--file " + basePATH+"/outputScala/pom.xml");
			System.out.println("Maven Task Executing = "
					+ runningCommand.toString());
			
			ExternRunner.launch(runningCommand.toString());

			try {
				FileUtility.compareFiles("outputStream", kmPATH.replace(".km",".trace"));
				assertTrue(true);
			} catch (Exception e) {
				e.printStackTrace();
				assertTrue(false);
			}
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		

		
		
		
		/*
		 * String basePATH = this.getClass().getResource("/").getPath();
		 * basePATH = basePATH.substring(0, basePATH
		 * .lastIndexOf("fr.irisa.triskell.kermeta.scala.compilo.test"));
		 */

		/* Step 1 Launch Compiler */
		/* VERSION 1.1 COMPILER FROM SRC MAVEN */
		/*
		 * StringBuilder compilingCommand = new StringBuilder();
		 * compilingCommand.append("mvn scala:run -B ");
		 * compilingCommand.append("--file "+baseDirectory+
		 * "fr.irisa.triskell.kermeta.scala.compilo/pom.xml ");
		 * compilingCommand.append("-DaddArgs=");
		 * compilingCommand.append("\"-i|"+tescase+".km\"");
		 * System.out.println("Maven Task Compiling  = "
		 * +compilingCommand.toString());
		 * ExternRunner.launch(compilingCommand.toString());
		 */
		/* VERSION 1.2 COMPILER FROM M2 OR NEXUS REPOSITORY */
		// Compiler compilo = new Compiler();
		// compilo.compile(testcase + ".km");

		/* Step 2 Compiled Software */

		/*
		 * try { File f = new File("outputStream"); if (f != null) { f.delete();
		 * } } catch (Exception e) { }
		 */
		/*
		 * 
		 * StringBuilder runningCommand = new StringBuilder();
		 * runningCommand.append("mvn clean scala:compile scala:run -B ");
		 * runningCommand.append("--file " + basePATH +
		 * "fr.irisa.triskell.kermeta.scala.compilo.output/pom.xml");
		 * System.out.println("Maven Task Executing = " +
		 * runningCommand.toString());
		 * ExternRunner.launch(runningCommand.toString());
		 * 
		 * try { FileUtility.compareFiles("outputStream", testcase + ".trace");
		 * assertTrue(true); } catch (Exception e) { e.printStackTrace();
		 * assertTrue(false); }
		 * 
		 * File f = new File("outputStream"); if (f != null) { f.delete(); }
		 */
	}


	

}
