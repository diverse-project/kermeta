package fr.irisa.triskell.scala.compilo.test;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;

public class TestCompiloCases extends TestCase {

	public void process(String testcase) {

		String basePATH = this.getClass().getResource("/").getPath();
		basePATH = basePATH.substring(0, basePATH
				.lastIndexOf("fr.irisa.triskell.kermeta.scala.compilo.test"));

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
//	    def init(propertyurl:String, projectName:String, classqname:String,  operationName:String, classpath:java.util.Collection[String], args:String, outputStream : java.io.OutputStream):Unit ={

		fr.irisa.triskell.kermeta.compilo.scala.Main.init("Compiler.properties", "", "", "", new ArrayList<String>(), "", null);
		String[] arg = new String[2];
		arg[0] = "-i";
		arg[1] = testcase + ".km";

		fr.irisa.triskell.kermeta.compilo.scala.Main.main(arg);
		assertEquals(fr.irisa.triskell.kermeta.compilo.scala.Main.getResult(), 0);
		
		
		//Compiler compilo = new Compiler();

		
//		compilo.compile(testcase + ".km");

         
        //Scala runner
        
		
		/* Step 2 Compiled Software */
/*		try {
			File f = new File("outputStream");
			if (f != null) {
				f.delete();
			}
		} catch (Exception e) {
		}
		StringBuilder runningCommand = new StringBuilder();
		runningCommand.append("mvn clean scala:compile scala:run -B ");
		runningCommand.append("--file " + basePATH
				+ "fr.irisa.triskell.kermeta.scala.compilo.output/pom.xml");
		System.out.println("Maven Task Executing = "
				+ runningCommand.toString());
		ExternRunner.launch(runningCommand.toString());

		try {
			FileUtility.compareFiles("outputStream", testcase + ".trace");
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}

		File f = new File("outputStream");
		if (f != null) {
			f.delete();
		}*/
		
	}	
	@Test
	public void testtests000HelloWorld() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/000HelloWorld");
	}
}