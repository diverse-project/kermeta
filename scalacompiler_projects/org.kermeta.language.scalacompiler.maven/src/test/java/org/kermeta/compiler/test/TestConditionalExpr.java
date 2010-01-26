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
	
	@Test
	public void testConditional_2varOr_constConst_311(){
		process("testCases/conditional_2varOr_constConst_311.km");
	}	
	
	@Test
	public void testConditional_3var_320(){
		process("testCases/Conditional_3var_320.km");
	}
	
	@Test
	public void testConditional_3var_321(){
		process("testCases/Conditional_3var_321.km");
	}
	
	@Test
	public void testConditional_asignment_330(){
		process("testCases/conditional_asignment_330.km");
	}
	
	@Test
	public void testConditional_nestedIf_340(){
		process("testCases/conditional_nestedIf_340.km");
	}
	
	@Test
	public void testConditional_unary_300(){
		process("testCases/conditional_unary_300.km");
	}
	
	@Test
	public void testLoop_350(){
		process("testCases/loop_350.km");
	}
}
