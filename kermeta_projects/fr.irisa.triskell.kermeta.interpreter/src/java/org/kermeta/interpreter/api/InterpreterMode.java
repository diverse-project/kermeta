package org.kermeta.interpreter.api;

public enum InterpreterMode {

	/**
	 * An execution with the run mode does not not check pre/post conditions neither the class invariants.
	 */
	RUN,
	
	/**
	 * An execution with the debug mode can stop the execution if a breakpoint is hit or if the user suspends it.
	 * When a breakpoint is hit, the debug view is opened allowing the user to execute code step by step or by stepping into it.
	 */
	DEBUG,
	
	/**
	 * A constraint execution is the same as the run execution with the pre/post conditions and the class invariants being checked.
	 */
	CONSTRAINT_RUN,
	
	/**
	 * 
	 */
	CONSTRAINT_DEBUG,
	
	/**
	 * A test run execution does the same as the run execution but it will also execute the set up and tear down operation for each test case.
	 */
	TEST_RUN,
	
	/**
	 * 
	 */
	TEST_CONSTRAINT_RUN,
	
	TRACE

}
