/* $Id: OCL2KermetaTestSuite.java,v 1.1 2008-07-25 12:38:04 dvojtise Exp $
 * Project : fr.irisa.triskell.kermeta.ocl.test
 * File : JunitTestSuite.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 27 janv. 2005
 * Authors : 
 * 		Franck Fleurey
 * 		Mark Skipper
 * 		Didier Vojtisek 
 */
package fr.irisa.triskell.kermeta.ocl.tests.ocl2kmt;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.launcher.RunJunitFactory;


/**
 * OCL 2 kermeta test suite.
 */
public class OCL2KermetaTestSuite extends TestSuite {

	static final String RUNTIMEPROJECTNAME = "kermeta_mdk.ocl.tests";
    
    static private IOPlugin ioPlugin;
    
//    private static TestSuite _suite;
    
	public static Test suite() {
		initialize();
	    return new OCL2KermetaTestSuite();
		//return new TestSuite(KermetaTestSuite.class);
	}    
    
    private static void initialize() {
    	
    	if ( ioPlugin == null ) {
    		
    		IOPlugin.LOCAL_USE = true;
    		ioPlugin = IOPlugin.getDefault();
	
    	}

   }
     
	public OCL2KermetaTestSuite() {
		super();
		
/*** BEGIN GENERATED TESTS ***/
		testWithFile("kermeta/tests/ocl2kmt","company_SnackSizeOclTests.main.kmt" );

		testWithFile("kermeta/tests/ocl2kmt","sample_BiteSizeOclTests.main.kmt" );

		testWithFile("kermeta/tests/ocl2kmt","sample_StructuralOclTests.main.kmt" );

/*** END GENERATED TESTS ***/
	}

	
	public void testWithFile(String dir, String file)  {
		String uri = null;
		uri = "platform:/plugin/" + "fr.irisa.triskell.kermeta.ocl.test" + "/" + dir + "/" + file;
				
		addTest( new RunJunitFactory().addTestsForUnit(uri) );
	}
	
}
