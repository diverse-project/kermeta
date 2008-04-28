/* $Id: LoadingTestSuite.java,v 1.3 2008-04-28 13:37:37 ftanguy Exp $
 * Project : Kermeta MDK UML2
 * File : LoadingTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1 
 */
package org.kermeta.uml2.umlaut.tests.loading;

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
	static final String RUNTIMEPROJECTNAME = "kermeta_mdk.uml2.umlaut.tests";
    
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
		testWithFile("test/kmt_testcases","001test_Tool_Valooder.main.kmt" );

/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/org.kermeta.uml2.umlaut.tests/" + dir + "/" + file;
		
		Test tests = new RunJunitFactory().addTestsForUnit(uri);
		addTest( tests );
	}
	
}
