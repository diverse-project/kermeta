/* $Id: CompileFramework.java,v 1.6 2006-10-26 12:55:06 dvojtise Exp $
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
import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

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
        
    	StdLibKermetaUnitHelper.unloadStdLib();
        KermetaUnit u = KermetaUnitFactory.getDefaultLoader().createKermetaUnit("src/kermeta/Standard.kmt");

        // As we are checking the standard lib itself, it cannot find it automatically using the usal way ...        
        StdLibKermetaUnitHelper.forceStdLib(u);
        System.out.println("LOADING STANDARD LIBRARY...");
        u.load();
        if (u.messages.getAllErrors().size() != 0) {
        	System.err.println("Standard library contains errors:");
        	System.err.println(u.messages.getAllMessagesAsString());
        	//System.exit(0);
        }
        
        System.out.println("TYPE CHECKING...");
        u.typeCheckAllUnits();
        System.out.println("Constraint CHECKING...");
        u.constraintCheckAllUnits();
        if (u.messages.hasError()) {
        	System.err.println("Standard library contains type errors:");
        	System.err.println(u.messages.getAllMessagesAsString());
        	//System.exit(0);
        }
        else
        {
        	if(u.messages.getAllWarnings().size() > 0)
        	{
        		System.err.println("Standard library contains type warnings:");
            	System.err.println(u.messages.getAllMessagesAsString());
        	}
        	System.out.println("SAVING...");
        	u.saveAsXMIModel("dist/framework.km");
        	System.out.println("DONE");
        }
    }
}
