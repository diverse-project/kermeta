package fr.irisa.triskell.kermeta.samples.fsm.tests;

//import junit.framework.Test;
//import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import fr.irisa.triskell.kermeta.samples.fsm.tests.exemple.junit3.JUnit3TestSuiteExample;
import fr.irisa.triskell.kermeta.samples.fsm.tests.exemple.junit4.*;
import fr.irisa.triskell.kermeta.samples.fsm.tests.exemple.kermeta.KermetaTestSuite;

@RunWith(Suite.class)  
@Suite.SuiteClasses({
	ExampleCreationTestSuite.class,
	JUnit3TestSuiteExample.class,
	KermetaTestSuite.class
})
public class FSMTestSuite { }
