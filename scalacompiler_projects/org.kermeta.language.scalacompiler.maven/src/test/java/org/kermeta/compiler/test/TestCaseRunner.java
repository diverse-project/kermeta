package org.kermeta.compiler.test;



import org.junit.Test;

public class TestCaseRunner extends TestCaseRunnerSetup {
	
	
/*	
	
	@Test
	public void test000HelloWorld() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/000HelloWorld.km");
	}
	
	@Test
	public void test001testAssignement() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/001testAssignement.km");
	}

	@Test
	public void test001testAssignement2() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/001testAssignement2.km");
	}

	@Test
	public void test002testArithm() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/002_testArithm.main.km");
	}
	
	@Test
	public void test003testOpCall() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/003_testOpCall.main.km");
	}	

	@Test
	public void test004testOpOpCall() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/004_testOpOpCall.main.km");
	}		

	@Test
	public void test006testClosure() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/006_testClosure.km");
	}
	*/
	
	@Test
	public void testAssignment_int_401(){
		process("testCases/Assignment_int_401.km");
	}

	@Test
	public void testAssignment_bool_402(){
		process("testCases/Assignment_bool_402.km");
	}

		@Test
	public void test000HelloWorld() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/000HelloWorld.km");
	}
	
	@Test
	public void test001testAssignement() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/001testAssignement.km");
	}

	@Test
	public void test001testAssignement2() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/001testAssignement2.km");
	}

	@Test
	public void test002testArithm() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/002_testArithm.main.km");
	}
	
	@Test
	public void test003testOpCall() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/003_testOpCall.main.km");
	}	

	@Test
	public void test004testOpOpCall() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/004_testOpOpCall.main.km");
	}		

	@Test
	public void test006testClosure() {
		// System.out.println(this.getClass().getResource("/testCases"));
		process("testCases/006_testClosure.km");
	}

	@Test
	public void testAssignment_new_401(){
		process("testCases/Assignment_int_401.km");
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
	public void testIntegerLiteral_writeln_100(){
		process("testCases/IntegerLiteral_writeln_100.km");
	}
	
	
	
}
