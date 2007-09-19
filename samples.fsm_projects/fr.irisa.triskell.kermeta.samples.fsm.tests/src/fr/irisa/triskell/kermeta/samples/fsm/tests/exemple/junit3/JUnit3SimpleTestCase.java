package fr.irisa.triskell.kermeta.samples.fsm.tests.exemple.junit3;

import junit.framework.*;

public class JUnit3SimpleTestCase extends TestCase {
	public void testSimple1() {
	    Assert.assertTrue("Successful JUnit3 true assert", true);
	}
	public void testSimple2() {
	    Assert.assertTrue("Sample of JUnit3 true assert failure", false);
	}
}
