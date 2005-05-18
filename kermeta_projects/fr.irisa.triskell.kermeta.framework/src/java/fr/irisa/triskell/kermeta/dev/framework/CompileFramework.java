/* $Id: CompileFramework.java,v 1.3 2005-05-18 23:38:33 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : CompileFramework.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2005
* Author : Franck Fleurey
*/ 
package fr.irisa.triskell.kermeta.dev.framework;

import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.loader.KermetaUnitFactory;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 * 
 * this class is suposed to compile the standard library
 * into a big kcore model
 */
public class CompileFramework {



    public static void main(String[] args) {
        
        KermetaUnit u = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("src/kermeta/Standard.kmt");
        System.out.println("LOADING STANDARD LIBRARY...");
        u.load();
        if (u.getAllErrors().size() != 0) {
        	System.err.println("Standard library contains errors:");
        	System.err.println(u.getAllMessagesAsString());
        	//System.exit(0);
        }
        
        System.out.println("TYPE CHECKING...");
        u.typeCheckAllUnits();
        if (u.getAllErrors().size() != 0) {
        	System.err.println("Standard library contains type errors:");
        	System.err.println(u.getAllMessagesAsString());
        	//System.exit(0);
        }
        
        System.out.println("SAVING...");
        u.saveAsXMIModel("dist/framework.km");
        System.out.println("DONE");
        
    }
}
