/* $Id: InterpreterTestCase.java,v 1.1 2007-09-10 08:35:15 cfaucher Exp $
* Project : Kermeta (First iteration)
* File : LoadTest.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 3 juin 2005
* Author : Franck Fleurey
*/ 

package kermeta_interpreter.test;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import junit.framework.TestCase;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * Runs 25 times a kermeta program and check that memory does not increase
 */
public class InterpreterTestCase extends TestCase {
	
    /**
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /** Test that after 25 launches of the same kermeta program, the memory does not evolve. */
    public void test25Hello() {
    	long mem = 0;
        for (int i=0; i<25; i++) {
        	mem = Runtime.getRuntime().totalMemory();
            KermetaInterpreter inter = new KermetaInterpreter("test/interpreter/kmt_testcases/013_testString.main.kmt");
            inter.launch();
            inter.freeJavaMemory();
            System.err.println(" > Execution " + i + " memory used : " + Runtime.getRuntime().totalMemory() + ";  " + mem);
            // We noticed that, after 4 launches, used memory become stable...
            if (i > 4)
            	assertTrue(mem == Runtime.getRuntime().totalMemory());
            
        }
        
    }
    

}
