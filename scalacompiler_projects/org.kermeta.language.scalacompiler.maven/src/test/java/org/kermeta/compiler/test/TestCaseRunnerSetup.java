package org.kermeta.compiler.test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import junit.framework.TestCase;

public abstract class TestCaseRunnerSetup extends TestCase {

	public TestCaseRunnerSetup() {
		super();
	}

	public TestCaseRunnerSetup(String name) {
		super(name);
	}

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

	}
	
}