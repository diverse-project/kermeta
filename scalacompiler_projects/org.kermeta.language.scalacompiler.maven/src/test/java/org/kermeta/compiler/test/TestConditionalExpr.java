package org.kermeta.compiler.test;

import org.junit.Test;

public class TestConditionalExpr extends TestCaseRunnerSetup {
	
	@Test
	public void testConditional_2var_constConst_310(){
		process("testCases/conditional_2var_constConst_310.km");
	}
	
	@Test
	public void testConditional_2var_opOp_310(){
		process("testCases/conditional_2var_opOp_310.km");
	}

	@Test
	public void testConditional_2var_varVar_310(){
		process("testCases/conditional_2var_varVar_310.km");
	}	
}
