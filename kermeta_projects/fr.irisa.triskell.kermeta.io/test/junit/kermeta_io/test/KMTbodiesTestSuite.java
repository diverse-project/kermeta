/* $Id: KMTbodiesTestSuite.java,v 1.1 2005-02-22 14:39:02 zdrey Exp $
 * Created on Feb 21, 2005
 * Author : zdrey
 * License : GPL
 * Organization : IRISA / Universite de Rennes 1
 * Description : 
 * 		Stupid tests for KMTBodies management
 * TODO : 
 */
package kermeta_io.test;

import fr.irisa.triskell.kermeta.utils.KMTBodiesHandler;
import junit.framework.TestCase;

/**
 * @author zdrey
 * Description
 */
public class KMTbodiesTestSuite extends TestCase {

    public void testSuite() {
        
        // get source_file
        String source_file = "test/kmt_testcases/testExtractOperation.kmt";
        // get target_file
        String target_file = "test/kmt_testcases/testInjectOperation.kmt";
        // extract operation from source and inject into target
        KMTBodiesHandler kmtbhandler = new KMTBodiesHandler("test/kmtbodies_testcases/");
        kmtbhandler.extractAndInjectForPackageFromFiles(source_file, target_file, "testExtractOperation");
        //todo : in test case we must create a kmtbodie that should correspond to the expected file result
        // and a final kmt that should contain the included operations
        System.out.println("KMTBodies test case executed");
        
    }

}
