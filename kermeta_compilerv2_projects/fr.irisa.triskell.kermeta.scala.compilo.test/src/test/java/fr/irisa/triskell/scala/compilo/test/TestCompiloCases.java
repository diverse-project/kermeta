package fr.irisa.triskell.scala.compilo.test;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

public class TestCompiloCases extends TestCase {
	

	void listJar(File folderTest, List<String> files) {
		System.err.println(folderTest.getAbsolutePath());
		for (File f : folderTest.listFiles(new FileFilter() {

			public boolean accept(File arg0) {
				return (!arg0.isDirectory()) && arg0.getName().endsWith(".jar");
			}

		})) {
			files.add((f.getAbsolutePath()));
		}
	}

	
	public List<String> getJars(String testcase){
		
		List<String> res = new ArrayList<String>();		
		listJar(new File((testcase.substring(0, testcase.lastIndexOf("/")))),res);
		return res;
	}
	
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

		fr.irisa.triskell.kermeta.compilo.scala.Main.init("Compiler.properties", "", "", "", this.getJars(testcase), "", null);
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
		
	}	@Test
	public void testArt2DroolsMatcherArt2DROOLSPatternFramework() {
		process(this.getClass().getResource("/Art2DroolsMatcher").getPath()
				+ "/Art2DROOLSPatternFramework");
	}
	@Test
	public void testreflexivitySerializer() {
		process(this.getClass().getResource("/reflexivity").getPath()
				+ "/Serializer");
	}
	@Test
	public void testreflexivityreflexivity() {
		process(this.getClass().getResource("/reflexivity").getPath()
				+ "/reflexivity");
	}
	@Test
	public void testtestConstraints016_testPrePost_PostInheritedInheritedFail1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/016_testPrePost_PostInheritedInheritedFail1.main");
	}
	@Test
	public void testtestConstraints021_testPrePost_PreInheritedFailed2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/021_testPrePost_PreInheritedFailed2.main");
	}
	@Test
	public void testtestConstraints014_testPrePost_PostInheritedFailed1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/014_testPrePost_PostInheritedFailed1.main");
	}
	@Test
	public void testtestConstraints017_testPrePost_PostInheritedInheritedFail2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/017_testPrePost_PostInheritedInheritedFail2.main");
	}
	@Test
	public void testtestConstraints019_testPrePost_PreFailedmain() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/019_testPrePost_PreFailed.main");
	}
	@Test
	public void testtestConstraints020_testPrePost_PreInheritedFailed1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/020_testPrePost_PreInheritedFailed1.main");
	}
	@Test
	public void testtestConstraints018_testPrePost_PostInheritedInheritedPass1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/018_testPrePost_PostInheritedInheritedPass1.main");
	}
	@Test
	public void testtestConstraints011_testPrePost_PostFailed1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/011_testPrePost_PostFailed1.main");
	}
	@Test
	public void testtestConstraints015_testPrePost_PostInheritedFailed2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/015_testPrePost_PostInheritedFailed2.main");
	}
	@Test
	public void testtestConstraints012_testPrePost_PostFailed2main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/012_testPrePost_PostFailed2.main");
	}
	@Test
	public void testtestConstraints013_testPrePost_PostFailed3main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/013_testPrePost_PostFailed3.main");
	}
	@Test
	public void testtestConstraints022_testPrePost_PreInheritedInheritedFailed1main() {
		process(this.getClass().getResource("/testConstraints").getPath()
				+ "/022_testPrePost_PreInheritedInheritedFailed1.main");
	}
	@Test
	public void testSpeedsStaticSemanticChecker() {
		process(this.getClass().getResource("/Speeds").getPath()
				+ "/StaticSemanticChecker");
	}
	@Test
	public void testLambdaExpression_testCasesLambdaExpression_IntegerTime_501() {
		process(this.getClass().getResource("/LambdaExpression_testCases").getPath()
				+ "/LambdaExpression_IntegerTime_501");
	}
	@Test
	public void testLambdaExpression_testCasesLambdaExpression_plus1_502() {
		process(this.getClass().getResource("/LambdaExpression_testCases").getPath()
				+ "/LambdaExpression_plus1_502");
	}
	@Test
	public void testLambdaExpression_testCasesLambdaExpression_CollectionEach_501() {
		process(this.getClass().getResource("/LambdaExpression_testCases").getPath()
				+ "/LambdaExpression_CollectionEach_501");
	}
	@Test
	public void testLambdaExpression_testCasesLambdaExpression_plus1_501() {
		process(this.getClass().getResource("/LambdaExpression_testCases").getPath()
				+ "/LambdaExpression_plus1_501");
	}
	@Test
	public void testtestsCallSuperOperation_no_params_return_453() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallSuperOperation_no_params_return_453");
	}
	@Test
	public void testtests025simpleInvariant() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/025simpleInvariant");
	}
	@Test
	public void testtests002_testArithmmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/002_testArithm.main");
	}
	@Test
	public void testtestsIntegerLiteral_writeln_100() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/IntegerLiteral_writeln_100");
	}
	@Test
	public void testtestsAssignment_int_401() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_int_401");
	}
	@Test
	public void testtestsAssignment_classe_405() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_classe_405");
	}
	@Test
	public void testtests079_testIntegerComparison() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/079_testIntegerComparison");
	}
	@Test
	public void testtests005_testExternPackageCall() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/005_testExternPackageCall");
	}
	@Test
	public void testtestsCallResult_int_454() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallResult_int_454");
	}
	@Test
	public void testtests001testAssignement2() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/001testAssignement2");
	}
	@Test
	public void testtestsCallResult_String_456() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallResult_String_456");
	}
	@Test
	public void testtests001testAssignement() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/001testAssignement");
	}
	@Test
	public void testtests004_testOpOpCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/004_testOpOpCall.main");
	}
	@Test
	public void testtests011_testBenchmarkmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/011_testBenchmark.main");
	}
	@Test
	public void testtests015_testAttributesmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/015_testAttributes.main");
	}
	@Test
	public void testtests068_testVariableInitmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/068_testVariableInit.main");
	}
	@Test
	public void testtestsAssignment_bool_402() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_bool_402");
	}
	@Test
	public void testtests022_InvWithMultipleInheritance() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/022_InvWithMultipleInheritance");
	}
	@Test
	public void testtests075_PropertyEqualityUsingEnummain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/075_PropertyEqualityUsingEnum.main");
	}
	@Test
	public void testtests078_testAddVoidInReflectiveCollectionmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/078_testAddVoidInReflectiveCollection.main");
	}
	@Test
	public void testtestsCallResult_Object_457() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallResult_Object_457");
	}
	@Test
	public void testtests000HelloWorld() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/000HelloWorld");
	}
	@Test
	public void testtests016_testParametricClassesmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/016_testParametricClasses.main");
	}
	@Test
	public void testteststoto() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/toto");
	}
	@Test
	public void testtests003_testOpCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/003_testOpCall.main");
	}
	@Test
	public void testtestsCallSuperOperation_no_params_451() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallSuperOperation_no_params_451");
	}
	@Test
	public void testtests017_testSuperFeaturesCallsmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/017_testSuperFeaturesCalls.main");
	}
	@Test
	public void testtestsAssignment_string_403() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_string_403");
	}
	@Test
	public void testtests006_testClosure() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/006_testClosure");
	}
	@Test
	public void testtestsCallSuperOperation_one_param_452() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/CallSuperOperation_one_param_452");
	}
	@Test
	public void testtests013_testStringmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/013_testString.main");
	}
	@Test
	public void testtests016bis_testParametricClassesmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/016bis_testParametricClasses.main");
	}
	@Test
	public void testtests018_testExceptionsmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/018_testExceptions.main");
	}
	@Test
	public void testtestsAssignment_negint_404() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/Assignment_negint_404");
	}
	@Test
	public void testtests037_testLambdamain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/037_testLambda.main");
	}
	@Test
	public void testtests0012_kunit() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/0012_kunit");
	}
	@Test
	public void testtests005_testOpPkgCallmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/005_testOpPkgCall.main");
	}
	@Test
	public void testtests010_testLoopmain() {
		process(this.getClass().getResource("/tests").getPath()
				+ "/010_testLoop.main");
	}
	@Test
	public void testuml001_LoadUML() {
		process(this.getClass().getResource("/uml").getPath()
				+ "/001_LoadUML");
	}
	@Test
	public void testLoadSaveKm000HelloWorld() {
		process(this.getClass().getResource("/LoadSaveKm").getPath()
				+ "/000HelloWorld");
	}
	@Test
	public void testLoadSaveKm0001LoadAndSaveKm() {
		process(this.getClass().getResource("/LoadSaveKm").getPath()
				+ "/0001LoadAndSaveKm");
	}
	@Test
	public void testperfsAntWorldSimulator() {
		process(this.getClass().getResource("/perfs").getPath()
				+ "/AntWorldSimulator");
	}
	@Test
	public void testperfsHelloWorld() {
		process(this.getClass().getResource("/perfs").getPath()
				+ "/HelloWorld");
	}
	@Test
	public void testperfsmetamodelPruner() {
		process(this.getClass().getResource("/perfs").getPath()
				+ "/metamodelPruner");
	}
	@Test
	public void testperfs001_LoadUML() {
		process(this.getClass().getResource("/perfs").getPath()
				+ "/001_LoadUML");
	}
	@Test
	public void testtestEcore012_TypeFromEcore() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/012_TypeFromEcore");
	}
	@Test
	public void testtestEcore013_LoadEcore() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/013_LoadEcore");
	}
	@Test
	public void testtestEcore014_LoadKM() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/014_LoadKM");
	}
	@Test
	public void testtestEcore016_testEcoreAspectWithInheritance() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/016_testEcoreAspectWithInheritance");
	}
	@Test
	public void testtestEcore017_OverrideEcoreOperation() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/017_OverrideEcoreOperation");
	}
	@Test
	public void testtestEcore014_AspectOnKM() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/014_AspectOnKM");
	}
	@Test
	public void testtestEcore015_EcoreDocHelper() {
		process(this.getClass().getResource("/testEcore").getPath()
				+ "/015_EcoreDocHelper");
	}
	@Test
	public void testprunerTestCollection() {
		process(this.getClass().getResource("/pruner").getPath()
				+ "/TestCollection");
	}
	@Test
	public void testprunermetamodelPruner() {
		process(this.getClass().getResource("/pruner").getPath()
				+ "/metamodelPruner");
	}
	@Test
	public void testkomposeflowComposer() {
		process(this.getClass().getResource("/kompose").getPath()
				+ "/flowComposer");
	}
	@Test
	public void testconditionalconditional_unary_300() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/conditional_unary_300");
	}
	@Test
	public void testconditional300_testIfAnd() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/300_testIfAnd");
	}
	@Test
	public void testconditionalconditional_2var_constConst_310() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/conditional_2var_constConst_310");
	}
	@Test
	public void testconditionalconditional_2var_varVar_310() {
		process(this.getClass().getResource("/conditional").getPath()
				+ "/conditional_2var_varVar_310");
	}
	@Test
	public void testNewSemanticsinitialisationDiffInterpreterCompiler() {
		process(this.getClass().getResource("/NewSemantics").getPath()
				+ "/initialisationDiffInterpreterCompiler");
	}
	@Test
	public void testexception000TestClass() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/000TestClass");
	}
	@Test
	public void testexceptionRaise_differentExceptionTypes_202() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Raise_differentExceptionTypes_202");
	}
	@Test
	public void testexception0001TestException() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/0001TestException");
	}
	@Test
	public void testexceptionRaise_simpleRaise_201() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Raise_simpleRaise_201");
	}
	@Test
	public void testexceptionPackage_composed_name() {
		process(this.getClass().getResource("/exception").getPath()
				+ "/Package_composed_name");
	}
	@Test
	public void testtestReflection_kermetareflection() {
		process(this.getClass().getResource("/testReflection/kermeta").getPath()
				+ "/reflection");
	}
	@Test
	public void testtestReflection_kermeta_helpersEcoreUtil() {
		process(this.getClass().getResource("/testReflection/kermeta/helpers").getPath()
				+ "/EcoreUtil");
	}
	@Test
	public void testtestFumlFUMLStarter() {
		process(this.getClass().getResource("/testFuml").getPath()
				+ "/FUMLStarter");
	}
	@Test
	public void testtestGreg_TransfoMetadomoArt_kermetaArt2Metadomo() {
		process(this.getClass().getResource("/testGreg/TransfoMetadomoArt/kermeta").getPath()
				+ "/Art2Metadomo");
	}
	@Test
	public void testtestGreg_TransfoMetadomoArt_kermetaMetadomo2Art() {
		process(this.getClass().getResource("/testGreg/TransfoMetadomoArt/kermeta").getPath()
				+ "/Metadomo2Art");
	}
}