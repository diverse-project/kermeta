package fr.irisa.triskell.scala.compilo.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCompiloCases extends TestCase {	
	
	
	String baseDirectory = "/Users/ffouquet/Documents/DEV/workspaces/fr.irisa.triskell.kermeta.compiloV2/";
	
	public void process(String tescase){
		/* Step 1 Launch Compiler */
		StringBuilder compilingCommand = new StringBuilder();
		compilingCommand.append("mvn scala:run -B ");
		compilingCommand.append("--file "+baseDirectory+"fr.irisa.triskell.kermeta.scala.compilo/pom.xml ");
		compilingCommand.append("-DaddArgs=");
		compilingCommand.append("\"-i|"+tescase+".km\"");
		System.out.println("Maven Task Compiling  = "+compilingCommand.toString());
		ExternRunner.launch(compilingCommand.toString());
		/* Step 2 Compiled Software */
		StringBuilder runningCommand = new StringBuilder();
		runningCommand.append("mvn clean scala:compile scala:run -B ");
		runningCommand.append("--file "+baseDirectory+"outputScala/pom.xml");
		System.out.println("Maven Task Executing = "+runningCommand.toString());
		ExternRunner.launch(runningCommand.toString());
	
		try {
			FileUtility.compareFiles("outputStream", tescase+".trace");
			assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}		
		
		File f = new File("outputStream");
		if(f != null){
			f.delete();
		}
	}
	
	@Test
	public void test000() {
		process(baseDirectory+"compilerv2_test/tests/000HelloWorld");
	}
	@Test
	public void test001() {
		process(baseDirectory+"compilerv2_test/tests/001testAssignement");
	}
	@Test
	public void test001_2() {
		process(baseDirectory+"compilerv2_test/tests/001testAssignement2");
	}	
	
	
}
