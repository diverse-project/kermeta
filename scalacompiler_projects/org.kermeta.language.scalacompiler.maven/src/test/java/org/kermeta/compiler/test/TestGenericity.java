package org.kermeta.compiler.test;

import org.junit.Test;

public class TestGenericity extends TestCaseRunnerPlatformDependant {

	
	@Test
	public void testGenericity_build_100(){
		process("testCases/Genericity_build_100.km");
	}
		
}
