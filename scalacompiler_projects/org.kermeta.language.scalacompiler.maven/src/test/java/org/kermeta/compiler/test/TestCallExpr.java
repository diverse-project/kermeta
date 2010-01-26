package org.kermeta.compiler.test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import junit.framework.TestCase;

import org.junit.Test;

public class TestCallExpr extends TestCaseRunnerPlatformDependant {

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
}
