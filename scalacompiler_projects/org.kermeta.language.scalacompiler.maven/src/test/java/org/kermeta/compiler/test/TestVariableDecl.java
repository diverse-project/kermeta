package org.kermeta.compiler.test;

import org.junit.Test;

public class TestVariableDecl extends TestCaseRunnerSetup {
	
	@Test
	public void testLambdaExpression_IntegerTime_501() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/VariableDecl_testCases/VariableDecl_FunctionType_501.km");
	} 
	
}
