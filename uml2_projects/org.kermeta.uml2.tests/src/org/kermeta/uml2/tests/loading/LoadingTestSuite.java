/* $Id: LoadingTestSuite.java,v 1.2 2007-10-25 12:04:28 ftanguy Exp $
 * Project : Kermeta.interpreter
 * File : JunitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1 
 */
package org.kermeta.uml2.tests.loading;

import junit.framework.Test;
import junit.framework.TestSuite;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class LoadingTestSuite extends TestSuite {

	public static Test suite() {
	    return new LoadingTestSuite();
	}    
     
	public LoadingTestSuite() {
		super();

/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/kmt_testcases","001_testLoadingBankModel.main.kmt" );
		testWithFile("test/kmt_testcases","002_testLoadingImprovedVehiclesModel.main.kmt" );
		testWithFile("test/kmt_testcases","003_testLoadingGOFStatePatternModel.main.kmt" );
		testWithFile("test/kmt_testcases","004_testLoadingSimulatorDesignModel.main.kmt" );
/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/org.kermeta.uml2.tests/" + dir + "/" + file;
		
		Test tests = new RunJunitFactory("platform:/resource/org.kermeta.mdk.tests/.bin").addTestsForUnit(uri);
		addTest( tests );
	}
	
}
