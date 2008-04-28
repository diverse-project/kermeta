/* $Id: CompileFramework.java,v 1.19 2008-04-28 11:49:48 ftanguy Exp $
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
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.exporter.ecore.EcoreExporter;
import fr.irisa.triskell.kermeta.exporter.ecore.ExporterOptions;
import fr.irisa.triskell.kermeta.exporter.km.KmExporter;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;


/**
 * this class is supposed to compile the standard library
 * into several km and ecore models
 */
public class CompileFramework {

    public static void main(String[] args) {

    	IOPlugin.LOCAL_USE = true;
    	IOPlugin.FRAMEWORK_GENERATION = true;
    	LoaderPlugin.setFrameworkGeneration(true);
    	@SuppressWarnings("unused")
		IOPlugin ioPlugin = IOPlugin.getDefault();
    	
    	KermetaUnit kermetaUnit = null;
//    	kermetaUnit = LoaderPlugin.getDefault().load("platform:/plugin/fr.irisa.triskell.kermeta.framework/src/kermeta/Standard.kmt", null);
    	kermetaUnit = LoaderPlugin.getDefault().getFramework();
    	
    	kermetaUnit.setFramework(false);
    	for ( KermetaUnit unit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) )
    		unit.setFramework(false);
    	
        if ( kermetaUnit.isIndirectlyErroneous() ) {
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
        	exporter.export(kermetaUnit, dist_folder, true);
        	System.out.println("DONE");

        	System.out.println("SAVING IN ECORE...");
        	EcoreExporter exporter2 = new EcoreExporter();
        	exporter2.export(kermetaUnit, dist_folder, ExporterOptions.getDefault());
        	System.out.println("DONE");
        }
    }
}
