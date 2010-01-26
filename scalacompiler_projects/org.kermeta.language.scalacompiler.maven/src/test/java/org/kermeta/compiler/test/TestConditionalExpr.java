package org.kermeta.compiler.test;

import org.junit.Test;

public class TestConditionalExpr extends TestCaseRunnerSetup {
	
	@Test
	public void testConditional_unary_300(){
		process("testCases/conditional/conditional_unary_300.km");
	}
	
	@Test
	public void testConditional_2var_constVar_310(){
		process("testCases/conditional/conditional_2var_constVar_310.km");
	}
	
	@Test
	public void testConditional_2var_varConst_310(){
		process("testCases/conditional/conditional_2var_varConst_310.km");
	}
	
	@Test
	public void testConditional_2var_constConst_310(){
		process("testCases/conditional/conditional_2var_constConst_310.km");
	}
	
	@Test
	public void testConditional_2var_opOp_310(){
		process("testCases/conditional/conditional_2var_opOp_310.km");
	}

	@Test
	public void testConditional_2var_varVar_310(){
		process("testCases/conditional/conditional_2var_varVar_310.km");
	}
	
	@Test
	public void testConditional_2varOr_constConst_311(){
		process("testCases/conditional/conditional_2varOr_constConst_311.km");
	}	
	
	@Test
	public void testConditional_3var_320(){
		process("testCases/conditional/Conditional_3var_320.km");
	}
	
	@Test
	public void testConditional_3var_321(){
		process("testCases/conditional/Conditional_3var_321.km");
	}
	
	@Test
	public void testConditional_asignment_330(){
		process("testCases/conditional/conditional_asignment_330.km");
	}
	
	@Test
	public void testConditional_nestedIf_340(){
		process("testCases/conditional/conditional_nestedIf_340.km");
	}
	
	@Test
	public void testLoop_350(){
		process("testCases/conditional/loop_350.km");
	}
	
	@Test
	public void testLoop_351(){
		process("testCases/conditional/loop_350.km");
	}
	
	@Test
	public void testLoop_352(){
		process("testCases/conditional/loop_352_SemiColumnBefore.km");
	}
}
