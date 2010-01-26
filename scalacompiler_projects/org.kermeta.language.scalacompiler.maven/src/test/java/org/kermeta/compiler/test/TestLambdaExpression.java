package org.kermeta.compiler.test;

import org.junit.Test;

public class TestLambdaExpression extends TestCaseRunnerSetup {
	
	@Test
	public void testLambdaExpression_IntegerTime_501() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/LambdaExpression_testCases/LambdaExpression_IntegerTime_501.km");
	} 
	
	 @Test
     public void testLambdaExpression_CollectionEach_501() {
			// System.out.println(this.getClass().getResource("/testCases"));
		 process("testCases/LambdaExpression_testCases/LambdaExpression_CollectionEach_501.km");
	 }
	 @Test
     public void testLambdaExpression_CollectionEach_502() {
			// System.out.println(this.getClass().getResource("/testCases"));
		 process("testCases/LambdaExpression_testCases/LambdaExpression_CollectionEach_502.km");
	}
}
