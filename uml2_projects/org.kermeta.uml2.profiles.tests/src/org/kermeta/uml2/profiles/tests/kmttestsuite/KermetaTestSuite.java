/* $Id: KermetaTestSuite.java,v 1.3 2008-02-13 16:23:20 vmahe Exp $
 * Project : Kermeta.interpreter
 * File : KermetaTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2008
 * Authors : 
 * 		Didier Vojtisek 
 */
package org.kermeta.uml2.profiles.tests.kmttestsuite;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import junit.framework.Test;
import junit.framework.TestSuite;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;
import org.kermeta.uml2.profiles.tests.Activator;
import org.openembedd.tests.utils.UiTools;

/**
 * Test suite that calls some kermeta code
 */
public class KermetaTestSuite extends TestSuite {

	static final String RUNTIMEPROJECTNAME = "org.kermeta.uml2.profiles.tests";
    
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
		testWithFile("test/kmt_testcases","001_standardProfileTester1.main.kmt" );

/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/" + Activator.PLUGIN_ID + "/" + dir + "/" + file;
		Test tests = new RunJunitFactory("platform:/resource/"+RUNTIMEPROJECTNAME+"/.bin").addTestsForUnit(uri);
		addTest( tests );
	}
	
}
