package org.kermeta.compiler.test;

import org.junit.Test;

public class TestCallExpr extends TestCaseRunnerPlatformDependant {

	
	@Test
	public void testAssignment_int_401(){
		process("testCases/Assignment_int_401.km");
	}
	
	@Test
	public void testAssignment_bool_402(){
		process("testCases/Assignment_bool_402.km");
	}

	@Test
	public void testAssignment_string_403(){
		process("testCases/Assignment_string_403.km");
	}
	
	@Test
	public void testAssignment_negint_404(){
		process("testCases/Assignment_negint_404.km");
	}

	@Test
	public void testAssignment_classe_405(){
		process("testCases/Assignment_classe_405.km");
	}

	@Test
	public void testAssignment_minuszero_406(){
		process("testCases/Assignment_minuszero_406.km");
	}

	@Test
	public void testAssignment_cast_int_407(){
		process("testCases/Assignment_cast_int_407.km");
	}
	
	
	@Test
	public void testAssignment_cast_bool_408(){
		process("testCases/Assignment_cast_bool_408.km");
	}
	
	
	@Test
	public void testAssignment_cast_string_409(){
		process("testCases/Assignment_cast_string_409.km");
	}
	@Test
	public void testAssignment_cast_classe_410(){
		process("testCases/Assignment_cast_classe_410.km");
	}
	
	@Test
	public void testCallSuperOperation_no_params_451(){
		process("testCases/CallSuperOperation_no_params_451.km");
	}
	
	@Test
	public void testCallSuperOperation_one_param_452(){
		process("testCases/CallSuperOperation_one_param_452.km");
	}
	
	@Test
	public void testCallSuperOperation_no_params_return_453(){
		process("testCases/CallSuperOperation_no_params_return_453.km");
	}
	
	@Test
	public void testCallResult_int_454(){
		process("testCases/CallResult_int_454.km");
	}
	
	@Test
	public void testCallValue_internal_op_455(){
		process("testCases/CallValue_internal_op_455.km");
	}
	
	@Test
	public void testCallResult_String_456(){
		process("testCases/CallResult_String_456.km");
	}
	
	@Test
	public void testCallResult_Object_457(){
		process("testCases/CallResult_Object_457.km");
	}
	
	@Test
	public void testCallFeature_new_458(){
		process("testCases/CallFeature_new_458.km");
	}
	
	@Test
	public void testCallFeature_self_param_459(){
		process("testCases/CallFeature_self_param_459.km");
	}

	@Test
	public void testCallFeature_self_operation_464(){
		process("testCases/CallFeature_self_operation_464.km");
	}
	
	@Test
	public void testCallFeature_obj_operation_operation_465(){
		process("testCases/CallFeature_obj_operation_operation_465.km");
	}
	
}
