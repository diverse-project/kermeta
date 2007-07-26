/* $Id: CompileFramework.java,v 1.9 2007-07-26 09:35:15 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : CompileFramework.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 avr. 2005
* Author : Franck Fleurey
*/ 
package fr.irisa.triskell.kermeta.dev.framework;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;


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

    	IOPlugin.LOCAL_USE = true;
    	IOPlugin.FRAMEWORK_GENERATION = true;
    	IOPlugin ioPlugin = new IOPlugin();
    	
    	KermetaUnit kermetaUnit = null;
		try {
			kermetaUnit = IOPlugin.getDefault().loadKermetaUnit( "platform:/plugin/fr.irisa.triskell.kermeta.framework/src/kermeta/Standard.kmt" );
		} catch (KermetaIOFileNotFoundException e) {
			e.printStackTrace();
		} catch (URIMalformedException e) {
			e.printStackTrace();
		}
    	 	
        System.out.println("LOADING STANDARD LIBRARY...");
        if ( kermetaUnit.isErrored() ) {
        	System.err.println("Standard library contains errors:");
        	System.err.println( KermetaUnitHelper.getAllErrorsAsString(kermetaUnit) );
        	//System.exit(0);
        }
        
        System.out.println("TYPE CHECKING...");
        KermetaTypeChecker typechecker = new KermetaTypeChecker( kermetaUnit );
        typechecker.checkUnit();
        
        if ( ! kermetaUnit.isErrored() ) {
        	System.out.println("Constraint CHECKING...");
        	KermetaConstraintChecker constraintchecker = new KermetaConstraintChecker( kermetaUnit );
        	constraintchecker.checkUnit();
        }
        
        if ( kermetaUnit.isErrored() ) {
        	System.err.println("Standard library contains type errors:");
        	System.err.println( KermetaUnitHelper.getAllErrorsAsString(kermetaUnit) );
        	//System.exit(0);
        }
        else
        {
        	if( kermetaUnit.isWarned() )
        	{
        		System.err.println("Standard library contains type warnings:");
            	System.err.println( KermetaUnitHelper.getAllWarningsAsString(kermetaUnit) );
        	}
        	System.out.println("SAVING IN KM...");
        	KmExporter exporter = new KmExporter();
        	exporter.export(kermetaUnit, "platform:/plugin/fr.irisa.triskell.kermeta.framework/dist");
        	System.out.println("DONE");

        	System.out.println("SAVING IN ECORE...");
        	EcoreExporter exporter2 = new EcoreExporter();
        	exporter2.export(kermetaUnit, "platform:/plugin/fr.irisa.triskell.kermeta.framework/dist", false);
        	System.out.println("DONE");
        }
    }
}
