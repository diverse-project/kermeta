/* $Id: LoadTest.java,v 1.2 2005-06-09 17:49:15 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : LoadTest.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 3 juin 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.interpreter.test;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import junit.framework.TestCase;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class LoadTest extends TestCase {

    public static void main(String[] args) {
    }

    /**
     * @see TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        KermetaUnit.STD_LIB_URI = "lib/framework.km";
    }

    /**
     * @see TestCase#tearDown()
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    
    public void test25Hello() {
        for (int i=0; i<100; i++) {
            KermetaInterpreter inter = new KermetaInterpreter("test/titi.kmt");
            inter.launch();
            System.err.println(" > Execution " + i + " memory used : " + Runtime.getRuntime().totalMemory());
        }
        
    }
    

}
