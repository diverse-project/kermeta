package fr.irisa.triskell.kermeta.samples.fsm.tests;

//import junit.framework.Test;
//import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import fr.irisa.triskell.kermeta.samples.fsm.tests.launcher.FSMLauncherTestSuite;
import fr.irisa.triskell.kermeta.samples.fsm.tests.loading.KermetaTestSuite;
import fr.irisa.triskell.kermeta.samples.fsm.tests.ui.FsmUITestSuite;

@RunWith(Suite.class)  
@Suite.SuiteClasses({
	FsmUITestSuite.class,
	KermetaTestSuite.class,
	FSMLauncherTestSuite.class
})
public class FSMTestSuite { }
