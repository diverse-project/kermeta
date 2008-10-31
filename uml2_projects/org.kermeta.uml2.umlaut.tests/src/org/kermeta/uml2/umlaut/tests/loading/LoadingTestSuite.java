/* $Id: LoadingTestSuite.java,v 1.4 2008-10-31 16:06:49 dvojtise Exp $
 * Project : Kermeta MDK UML2
 * File : LoadingTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1 
 */
package org.kermeta.uml2.umlaut.tests.loading;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import fr.irisa.triskell.kermeta.launcher.InterpretedRunJunitFactory;

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
		
		Test tests = new InterpretedRunJunitFactory().addTestsForUnit(uri);
		addTest( tests );
	}
	
}
