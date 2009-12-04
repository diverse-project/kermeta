package fr.irisa.triskell.scala.compilo.test;

import java.io.File;
import java.io.FileNotFoundException;

import junit.framework.TestCase;

import org.junit.Test;

import fr.irisa.triskell.kermeta.compilo.scala.Compiler;

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
		Compiler compilo = new Compiler();
		compilo.compile(testcase + ".km");

		/* Step 2 Compiled Software */
		try {
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
		}
	}

	@Test
	public void test000HelloWorld() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/000HelloWorld");
	}

	@Test
	public void test001testAssignement() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/001testAssignement");
	}

	@Test
	public void test001testAssignement2() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/001testAssignement2");
	}

	@Test
	public void test002_testArithm() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/002_testArithm.main");
	}

	@Test
	public void test003_testOpCall() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/003_testOpCall.main");
	}

	@Test
	public void test004_testOpOpCall() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/004_testOpOpCall.main");
	}

	@Test
	public void test005_testOpPkgCall() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/005_testOpPkgCall.main");
	}

	@Test
	public void test006_testClosure() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/006_testClosure");
	}

	@Test
	public void test010_testLoop() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/010_testLoop.main");
	}

	@Test
	public void test011_testBenchmark() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/011_testBenchmark.main");
	}

	@Test
	public void test013_testString() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/013_testString.main");
	}

	@Test
	public void test015_testAttributes() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/015_testAttributes.main");
	}

	@Test
	public void test016_testParametricClasses() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/016_testParametricClasses.main");
	}

	@Test
	public void test017_testSuperFeaturesCalls() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/017_testSuperFeaturesCalls.main");
	}

	@Test
	public void test018_testExceptions() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/018_testExceptions.main");
	}

	@Test
	public void test025simpleInvariant() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/025simpleInvariant");
	}

	@Test
	public void test037_testLambda() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/037_testLambda.main");
	}

	@Test
	public void test068_testVariableInit() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/068_testVariableInit.main");
	}

	@Test
	public void test075_PropertyEqualityUsingEnum() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/075_PropertyEqualityUsingEnum.main");
	}

	@Test
	public void test078_testAddVoidInReflectiveCollection() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/078_testAddVoidInReflectiveCollection.main");
	}

	@Test
	public void test079_testIntegerComparison() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/079_testIntegerComparison");
	}

}
