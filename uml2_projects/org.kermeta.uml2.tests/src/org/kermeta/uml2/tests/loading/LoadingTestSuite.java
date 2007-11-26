/* $Id: LoadingTestSuite.java,v 1.4 2007-11-26 12:51:15 dvojtise Exp $
 * Project : Kermeta MDK UML2
 * File : LoadingTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1 
 */
package org.kermeta.uml2.tests.loading;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import junit.framework.Test;
import junit.framework.TestSuite;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;

/**
 * UML2 Loading test suite.
 */
public class LoadingTestSuite extends TestSuite {
	static final String RUNTIMEPROJECTNAME = "kermeta_mdk.uml2.tests";
    
	public static Test suite() {
	    return new LoadingTestSuite();
	}    
     
	public LoadingTestSuite() {
		super();
		
		// ensure projects are created in the workbench
		IProject project =
			ResourcesPlugin.getWorkspace().getRoot().getProject(RUNTIMEPROJECTNAME);
		try{
			project.create( new NullProgressMonitor() );		
			project.open( new NullProgressMonitor() );
		} 
		catch (CoreException e) {
			e.printStackTrace();
		}

/*** BEGIN GENERATED TESTS ***/
		testWithFile("test/kmt_testcases","001_testLoadingBankModel.main.kmt" );
		testWithFile("test/kmt_testcases","002_testLoadingImprovedVehiclesModel.main.kmt" );
		testWithFile("test/kmt_testcases","003_testLoadingGOFStatePatternModel.main.kmt" );
		testWithFile("test/kmt_testcases","004_testLoadingSimulatorDesignModel.main.kmt" );
		testWithFile("test/kmt_testcases","005_testLoadingSimpleBehavioredClassModel.main.kmt" );
/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/org.kermeta.uml2.tests/" + dir + "/" + file;
		
		Test tests = new RunJunitFactory("platform:/resource/"+RUNTIMEPROJECTNAME+"/.bin").addTestsForUnit(uri);
		addTest( tests );
	}
	
}
