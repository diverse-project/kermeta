package fr.irisa.triskell.scala.compilo.test;

import java.io.File;

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
	}	@Test
	public void test014_testPrePost_PostInheritedFailed1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/014_testPrePost_PostInheritedFailed1.main");
	}
	@Test
	public void test019_testPrePost_PreFailedmain() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/019_testPrePost_PreFailed.main");
	}
	@Test
	public void test012_testPrePost_PostFailed2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/012_testPrePost_PostFailed2.main");
	}
	@Test
	public void test011_testPrePost_PostFailed1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/011_testPrePost_PostFailed1.main");
	}
	@Test
	public void test018_testPrePost_PostInheritedInheritedPass1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/018_testPrePost_PostInheritedInheritedPass1.main");
	}
	@Test
	public void test020_testPrePost_PreInheritedFailed1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/020_testPrePost_PreInheritedFailed1.main");
	}
	@Test
	public void test017_testPrePost_PostInheritedInheritedFail2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/017_testPrePost_PostInheritedInheritedFail2.main");
	}
	@Test
	public void test015_testPrePost_PostInheritedFailed2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/015_testPrePost_PostInheritedFailed2.main");
	}
	@Test
	public void test013_testPrePost_PostFailed3main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/013_testPrePost_PostFailed3.main");
	}
	@Test
	public void test016_testPrePost_PostInheritedInheritedFail1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/016_testPrePost_PostInheritedInheritedFail1.main");
	}
	@Test
	public void test022_testPrePost_PreInheritedInheritedFailed1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/022_testPrePost_PreInheritedInheritedFailed1.main");
	}
	@Test
	public void test021_testPrePost_PreInheritedFailed2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/021_testPrePost_PreInheritedFailed2.main");
	}
	@Test
	public void testLambdaExpression_plus1_501() {
		process(this.getClass().getResource("/LambdaExpression_testCases").getPath()
				+ "/LambdaExpression_plus1_501");
	}
	@Test
	public void testLambdaExpression_IntegerTime_501() {
		process(this.getClass().getResource("/LambdaExpression_testCases").getPath()
				+ "/LambdaExpression_IntegerTime_501");
	}
	@Test
	public void testLambdaExpression_CollectionEach_501() {
		process(this.getClass().getResource("/LambdaExpression_testCases").getPath()
				+ "/LambdaExpression_CollectionEach_501");
	}
	@Test
	public void testLambdaExpression_plus1_502() {
		process(this.getClass().getResource("/LambdaExpression_testCases").getPath()
				+ "/LambdaExpression_plus1_502");
	}
	@Test
	public void test068_testVariableInitmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/068_testVariableInit.main");
	}
	@Test
	public void test003_testOpCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/003_testOpCall.main");
	}
	@Test
	public void test013_testStringmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/013_testString.main");
	}
	@Test
	public void test010_testLoopmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/010_testLoop.main");
	}
	@Test
	public void test002_testArithmmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/002_testArithm.main");
	}
	@Test
	public void test078_testAddVoidInReflectiveCollectionmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/078_testAddVoidInReflectiveCollection.main");
	}
	@Test
	public void test015_testAttributesmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/015_testAttributes.main");
	}
	@Test
	public void testAssignment_int_401() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_int_401");
	}
	@Test
	public void testCallResult_String_456() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallResult_String_456");
	}
	@Test
	public void test001testAssignement2() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/001testAssignement2");
	}
	@Test
	public void test005_testExternPackageCall() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/005_testExternPackageCall");
	}
	@Test
	public void testAssignment_classe_405() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_classe_405");
	}
	@Test
	public void test001testAssignement() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/001testAssignement");
	}
	@Test
	public void testCallResult_int_454() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallResult_int_454");
	}
	@Test
	public void test005_testOpPkgCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/005_testOpPkgCall.main");
	}
	@Test
	public void test018_testExceptionsmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/018_testExceptions.main");
	}
	@Test
	public void test016bis_testParametricClassesmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/016bis_testParametricClasses.main");
	}
	@Test
	public void test004_testOpOpCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/004_testOpOpCall.main");
	}
	@Test
	public void test017_testSuperFeaturesCallsmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/017_testSuperFeaturesCalls.main");
	}
	@Test
	public void test016_testParametricClassesmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/016_testParametricClasses.main");
	}
	@Test
	public void testAssignment_bool_402() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_bool_402");
	}
	@Test
	public void testIntegerLiteral_writeln_100() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/IntegerLiteral_writeln_100");
	}
	@Test
	public void test006_testClosure() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/006_testClosure");
	}
	@Test
	public void testCallSuperOperation_one_param_452() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallSuperOperation_one_param_452");
	}
	@Test
	public void test011_testBenchmarkmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/011_testBenchmark.main");
	}
	@Test
	public void testCallSuperOperation_no_params_return_453() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallSuperOperation_no_params_return_453");
	}
	@Test
	public void test075_PropertyEqualityUsingEnummain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/075_PropertyEqualityUsingEnum.main");
	}
	@Test
	public void testAssignment_string_403() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_string_403");
	}
	@Test
	public void testCallResult_Object_457() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallResult_Object_457");
	}
	@Test
	public void test022_InvWithMultipleInheritance() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/022_InvWithMultipleInheritance");
	}
	@Test
	public void test000HelloWorld() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/000HelloWorld");
	}
	@Test
	public void test079_testIntegerComparison() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/079_testIntegerComparison");
	}
	@Test
	public void test037_testLambdamain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/037_testLambda.main");
	}
	@Test
	public void test025simpleInvariant() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/025simpleInvariant");
	}
	@Test
	public void testCallSuperOperation_no_params_451() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallSuperOperation_no_params_451");
	}
	@Test
	public void testAssignment_negint_404() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_negint_404");
	}
	@Test
	public void test001_LoadUML() {
		process(this.getClass().getResource("/uml").getPath()
				+ "/001_LoadUML");
	}
	@Test
	public void test0001LoadAndSaveKm() {
		process(this.getClass().getResource("/LoadSaveKm").getPath()
				+ "/0001LoadAndSaveKm");
	}
	@Test
	public void test016_testEcoreAspectWithInheritance() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/016_testEcoreAspectWithInheritance");
	}
	@Test
	public void test014_LoadKM() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/014_LoadKM");
	}
	@Test
	public void test012_TypeFromEcore() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/012_TypeFromEcore");
	}
	@Test
	public void test015_EcoreDocHelper() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/015_EcoreDocHelper");
	}
	@Test
	public void test014_AspectOnKM() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/014_AspectOnKM");
	}
	@Test
	public void test017_OverrideEcoreOperation() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/017_OverrideEcoreOperation");
	}
	@Test
	public void test013_LoadEcore() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/013_LoadEcore");
	}
	@Test
	public void testconditional_unary_300() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/conditional_unary_300");
	}
	@Test
	public void testconditional_2var_varVar_310() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/conditional_2var_varVar_310");
	}
	@Test
	public void test300_testIfAnd() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/300_testIfAnd");
	}
	@Test
	public void testconditional_2var_constConst_310() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/conditional_2var_constConst_310");
	}
	@Test
	public void testinitialisationDiffInterpreterCompiler() {
		process(this.getClass().getResource("/NewSemantics").getPath()
				+ "/initialisationDiffInterpreterCompiler");
	}
	@Test
	public void testRaise_differentExceptionTypes_202() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Raise_differentExceptionTypes_202");
	}
	@Test
	public void testRaise_simpleRaise_201() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Raise_simpleRaise_201");
	}
	@Test
	public void testPackage_composed_name() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Package_composed_name");
	}
	@Test
	public void testreflection() {
		process(this.getClass().getResource("/kermeta").getPath()
				+ "/reflection");
	}
	@Test
	public void testEcoreUtil() {
		process(this.getClass().getResource("/helpers").getPath()
				+ "/EcoreUtil");
	}
	@Test
	public void testArt2Metadomo() {
		process(this.getClass().getResource("/kermeta").getPath()
				+ "/Art2Metadomo");
	}
	@Test
	public void testMetadomo2Art() {
		process(this.getClass().getResource("/kermeta").getPath()
				+ "/Metadomo2Art");
	}
}
