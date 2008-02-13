package org.kermeta.uml2.profiles.tests.launcher;

//import junit.framework.Test;
//import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.kermeta.uml2.profiles.tests.kmttestsuite.KermetaTestSuite;
import org.kermeta.uml2.profiles.tests.toecoretestsuite.ProfileToEcoreTestSuite;


@RunWith(Suite.class)  
@Suite.SuiteClasses({
	// generic test suites that call some kermeta code
	KermetaTestSuite.class,
	// you can add here some other junit4 test suites
	ProfileToEcoreTestSuite.class
})
public class UMLProfilesTestSuite { }
