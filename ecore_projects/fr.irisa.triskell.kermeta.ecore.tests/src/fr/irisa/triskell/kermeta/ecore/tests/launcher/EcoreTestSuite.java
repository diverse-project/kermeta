package fr.irisa.triskell.kermeta.ecore.tests.launcher;

//import junit.framework.Test;
//import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import fr.irisa.triskell.kermeta.ecore.tests.kmttestsuite.KermetaTestSuite;

@RunWith(Suite.class)  
@Suite.SuiteClasses({
	// generic test suites that call some kermeta code
	KermetaTestSuite.class,
	
	// you can add here some other junit4 test suites
})
public class EcoreTestSuite { }
