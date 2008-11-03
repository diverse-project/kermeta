/* $Id: KermetaTestSuite.java,v 1.4 2008-11-03 08:05:44 dvojtise Exp $
 * Project : Kermeta.interpreter
 * File : JunitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 * 		Franck FLEUREY (ffleurey@irisa.fr)
 * Description :  	
 * 	see class javadoc.	 
 */
package fr.irisa.triskell.kermeta.samples.fsm.tests.loading;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

import junit.framework.Test;
import junit.framework.TestSuite;

import fr.irisa.triskell.kermeta.launcher.InterpretedRunJunitFactory;
import fr.irisa.triskell.kermeta.samples.fsm.tests.Utils;

/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class KermetaTestSuite extends TestSuite {

	static final String RUNTIMEPROJECTNAME = "kermeta_mdk.fsm.tests";
    static InterpretedRunJunitFactory runfactory = new InterpretedRunJunitFactory();
    
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
		testWithFile("test/kmt_testcases","001_testLoadingFSMModels.main.kmt" );
/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/" + Utils.PLUGIN_NAME + "/" + dir + "/" + file;
		
		Test tests = runfactory.addTestsForUnit(uri);
		addTest( tests );
	}
	
}
