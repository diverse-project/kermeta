package org.kermeta.uml2.tests;

//import junit.framework.Test;
//import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.kermeta.uml2.tests.loading.LoadingTestSuite;

@RunWith(Suite.class)  
@Suite.SuiteClasses({
	LoadingTestSuite.class
})
public class UML2TestSuite { }
