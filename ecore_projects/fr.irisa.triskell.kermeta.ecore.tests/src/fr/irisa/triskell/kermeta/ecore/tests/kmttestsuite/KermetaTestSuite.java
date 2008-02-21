/* $Id: KermetaTestSuite.java,v 1.5 2008-02-21 15:39:10 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : KermetaTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2008
 * Authors : 
 * 		Didier Vojtisek 
 */
package fr.irisa.triskell.kermeta.ecore.tests.kmttestsuite;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import junit.framework.Test;
import junit.framework.TestSuite;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import fr.irisa.triskell.kermeta.ecore.tests.Activator;

/**
 * Test suite that calls some kermeta code
 */
public class KermetaTestSuite extends TestSuite {

	static final String RUNTIMEPROJECTNAME = "fr.irisa.triskell.kermeta.ecore.tests";
    
//    private static TestSuite _suite;
    
	public static Test suite() {
	    return new KermetaTestSuite();
		//return new TestSuite(KermetaTestSuite.class);
	}    
    
 //   private static void initialize() {
    	
//    	_suite = new TestSuite();

 //   }
     
	public KermetaTestSuite() {
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
		testWithFile("test/kmt_testcases","001_testAB.main.kmt" );

		testWithFile("test/kmt_testcases","001_testABTypes.main.kmt" );

		testWithFile("test/kmt_testcases","002_testPatterns.main.kmt" );

/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/" + Activator.PLUGIN_ID + "/" + dir + "/" + file;
		Test tests = new RunJunitFactory("platform:/resource/"+RUNTIMEPROJECTNAME+"/.bin").addTestsForUnit(uri);
		addTest( tests );
	}
	
}
