package org.kermeta.compiler.test;

import org.junit.Test;

public class TestCallExpr extends TestCaseRunnerPlatformDependant {

	@Test
	public void testAssignment_int_401(){
		process("testCases/CallExpressions/Assignment_int_401.km");
	}
	
	@Test
	public void testAssignment_bool_402(){
		process("testCases/CallExpressions/Assignment_bool_402.km");
	}

	@Test
	public void testAssignment_string_403(){
		process("testCases/CallExpressions/Assignment_string_403.km");
	}
	
	@Test
	public void testAssignment_negint_404(){
		process("testCases/CallExpressions/Assignment_negint_404.km");
	}

	@Test
	public void testAssignment_classe_405(){
		process("testCases/CallExpressions/Assignment_classe_405.km");
	}

	@Test
	public void testAssignment_minuszero_406(){
		process("testCases/CallExpressions/Assignment_minuszero_406.km");
	}

	@Test
	public void testAssignment_cast_int_407(){
		process("testCases/CallExpressions/Assignment_cast_int_407.km");
	}
	
	@Test
	public void testAssignment_cast_bool_408(){
		process("testCases/CallExpressions/Assignment_cast_bool_408.km");
	}
	
	@Test
	public void testAssignment_cast_string_409(){
		process("testCases/CallExpressions/Assignment_cast_string_409.km");
	}
	@Test
	public void testAssignment_cast_classe_410(){
		process("testCases/CallExpressions/Assignment_cast_classe_410.km");
	}
	
	@Test
	public void testCallSuperOperation_no_params_451(){
		process("testCases/CallExpressions/CallSuperOperation_no_params_451.km");
	}
	
	@Test
	public void testCallSuperOperation_one_param_452(){
		process("testCases/CallExpressions/CallSuperOperation_one_param_452.km");
	}
	
	@Test
	public void testCallSuperOperation_no_params_return_453(){
		process("testCases/CallExpressions/CallSuperOperation_no_params_return_453.km");
	}
	
	@Test
	public void testCallResult_int_454(){
		process("testCases/CallExpressions/CallResult_int_454.km");
	}
	
	/*@Test
	public void testCallValue_internal_op_455(){
		process("testCases/CallValue_internal_op_455.km");
	}*/
	
	@Test
	public void testCallResult_String_456(){
		process("testCases/CallExpressions/CallResult_String_456.km");
	}
	
	@Test
	public void testCallResult_Object_457(){
		process("testCases/CallExpressions/CallResult_Object_457.km");
	}
	
	@Test
	public void testCallFeature_new_458(){
		process("testCases/CallExpressions/CallFeature_new_458.km");
	}
	
	@Test
	public void testCallFeature_self_param_459(){
		process("testCases/CallExpressions/CallFeature_self_param_459.km");
	}
	
	@Test
	public void testCallFeature_op_class_no_params_460(){
		process("testCases/CallExpressions/CallFeature_op_class_no_params_460.km");
	}
	
	@Test
	public void testCallFeature_op_class_params_461(){
		process("testCases/CallExpressions/CallFeature_op_class_params_461.km");
	}
	
	@Test
	public void testCallFeature_op_class_params_diff_package_462(){
		process("testCases/CallExpressions/CallFeature_op_class_params_diff_package_462.km");
	}
	
	@Test
	public void testCallFeature_attribute_string_same_class_463(){
		process("testCases/CallExpressions/CallFeature_attribute_string_same_class_463.km");
	}
	
	@Test
	public void testCallFeature_attribute_Object_diff_class_464(){
		process("testCases/CallExpressions/CallFeature_attribute_Object_diff_class_464.km");
	}
	
	@Test
	public void testCallFeature_self_operation_465(){
		process("testCases/CallExpressions/CallFeature_self_operation_465.km");
	}
	
	@Test
	public void testCallFeature_obj_operation_operation_466(){
		process("testCases/CallExpressions/CallFeature_obj_operation_operation_466.km");
	}
	
	@Test
	public void testCallFeature_multi_attributes_same_class_467(){
		process("testCases/CallExpressions/CallFeature_multi_attributes_same_class_467.km");
	}
	
	@Test
	public void testCallFeature_plus_468(){
		process("testCases/CallExpressions/CallFeature_plus_468.km");
	}
}
