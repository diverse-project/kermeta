package fr.irisa.triskell.kermeta.samples.fsm.tests.exemple.junit3;

import junit.framework.*;

public class JUnit3TestSuiteExample {
	public static Test suite() {
	    return new TestSuite(JUnit3SimpleTestCase.class);
	}
}
