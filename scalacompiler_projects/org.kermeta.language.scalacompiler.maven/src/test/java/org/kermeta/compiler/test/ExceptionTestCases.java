package org.kermeta.compiler.test;

import org.junit.Test;


public class ExceptionTestCases extends TestCaseRunnerSetup {

	@Test
	public void testRaise_simpleRaise_201(){
		process("testCases/exception/Raise_simpleRaise_201.km");
	}
	
	@Test
	public void testRaise_Raise_differentExceptionTypes_202(){
		process("testCases/exception/Raise_differentExceptionTypes_202.km");
	}
	
	@Test
	public void testRaise_Raise_subClassException_203(){
		process("testCases/exception/Raise_subClassException_203.km");
	}
}
