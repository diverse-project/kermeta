/* $Id: CompileFramework.java,v 1.13 2007-08-27 12:27:33 cfaucher Exp $
* Project : fr.irisa.triskell.kermeta.framework
* File : CompileFramework.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 apr. 2005
* Author : Franck Fleurey <ffleurey@irisa.fr>
*/ 
package fr.irisa.triskell.kermeta.dev.framework;

import org.kermeta.io.KermetaUnit;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.constraintchecker.KermetaConstraintChecker;
import fr.irisa.triskell.kermeta.exceptions.KermetaIOFileNotFoundException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.exporter.ecore.ExporterOptions;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;


/**
 * this class is supposed to compile the standard library
 * into several km and ecore models
 */
public class CompileFramework {

    public static void main(String[] args) {

    	IOPlugin.LOCAL_USE = true;
    	IOPlugin.FRAMEWORK_GENERATION = true;
    	@SuppressWarnings("unused")
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
        	System.err.println( KermetaUnitHelper.getErrorsAsString(kermetaUnit) );
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
        	
        	final String dist_folder = "platform:/plugin/fr.irisa.triskell.kermeta.framework/dist";
        	
        	System.out.println("SAVING IN KM...");
        	KmExporter exporter = new KmExporter();
        	exporter.export(kermetaUnit, dist_folder);
        	System.out.println("DONE");

        	System.out.println("SAVING IN ECORE...");
        	EcoreExporter exporter2 = new EcoreExporter();
        	exporter2.export(kermetaUnit, dist_folder, ExporterOptions.getDefault());
        	System.out.println("DONE");
        }
    }
}
