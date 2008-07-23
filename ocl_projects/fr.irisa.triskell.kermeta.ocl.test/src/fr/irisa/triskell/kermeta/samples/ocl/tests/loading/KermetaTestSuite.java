/* $Id: KermetaTestSuite.java,v 1.2 2008-07-23 13:13:01 dvojtise Exp $
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
package fr.irisa.triskell.kermeta.samples.ocl.tests.loading;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.kermeta.io.plugin.IOPlugin;

import junit.framework.Test;
import junit.framework.TestSuite;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;


/**
 * Interpreter test suite.
 * @author Franck Fleurey
 */
public class KermetaTestSuite extends TestSuite {

	static final String RUNTIMEPROJECTNAME = "kermeta_mdk.ocl.tests";
    static RunJunitFactory runfactory = new RunJunitFactory();
    
    static private IOPlugin ioPlugin;
    
//    private static TestSuite _suite;
    
	public static Test suite() {
		initialize();
	    return new KermetaTestSuite();
		//return new TestSuite(KermetaTestSuite.class);
	}    
    
    private static void initialize() {
    	
    	if ( ioPlugin == null ) {
    		
    		IOPlugin.LOCAL_USE = true;
    		ioPlugin = IOPlugin.getDefault();
	
    	}

   }
     
	public KermetaTestSuite() {
		super();

		// ensure projects are created in the workbench
		/*IProject project =
			ResourcesPlugin.getWorkspace().getRoot().getProject(RUNTIMEPROJECTNAME);
		try{
			project.create( new NullProgressMonitor() );		
			project.open( new NullProgressMonitor() );
		} 
		catch (CoreException e) {
			e.printStackTrace();
		}*/
		
/*** BEGIN GENERATED TESTS ***/
		testWithFile("kermeta/tests","BiteSizeOclTests.kmt" );
/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/" + "fr.irisa.triskell.kermeta.ocl.test" + "/" + dir + "/" + file;
		
		Test tests = runfactory.addTestsForUnit(uri);
		addTest( tests );
	}
	
}
