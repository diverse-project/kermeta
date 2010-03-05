/* $Id: CompileFramework.java,v 1.21 2008-05-28 15:43:56 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.framework
* File : CompileFramework.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 apr. 2005
* Author : Franck Fleurey <ffleurey@irisa.fr>
*/ 
package fr.irisa.triskell.kermeta.dev.framework;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.loader.plugin.LoaderPlugin;
import org.kermeta.merger.Merger;

import fr.irisa.triskell.kermeta.exceptions.NotRegisteredURIException;
import fr.irisa.triskell.kermeta.exceptions.URIMalformedException;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;


/**
 * this class is supposed to compile the standard library
 * into several km and ecore models
 */
public class MergeKmt {

    public static void main(String[] args) throws NotRegisteredURIException, URIMalformedException, IOException {

    	//IOPlugin.LOCAL_USE = false;
    	//IOPlugin.FRAMEWORK_GENERATION = false;
    	//LoaderPlugin.setFrameworkGeneration(true);
    	//@SuppressWarnings("unused")
		//IOPlugin ioPlugin = IOPlugin.getDefault();
		URIConverterImpl.URI_MAP.put(URI.createURI("platform:/plugin/"), URI.createURI("file:/home/barais/workspaces/kermetacvs1009/"));
		URIConverterImpl.URI_MAP.put(URI.createURI("platform:/resource/"), URI.createURI("file:/home/barais/workspaces/kermetacvs1009/"));
    	
    	KermetaUnit kermetaUnit = null;
    	kermetaUnit = LoaderPlugin.getDefault().load("platform:/resource/fr.irisa.triskell.kermeta.framework/300_testIfAnd.kmt", null);
    	//kermetaUnit = LoaderPlugin.getDefault().getFramework();
    	
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

        	System.out.println("Merging and Saving...");
        	Merger merger = new Merger();
        	
        	Set<KermetaUnit> l = new HashSet<KermetaUnit>();
        	l.add(kermetaUnit);
        	l.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) );
        	System.err.println(l.size());
        	for (KermetaUnit u : l){
        		System.err.println(u.getUri());
        	}
        	KermetaUnit mergedUnit = merger.process(l, "platform:/resource/fr.irisa.triskell.kermeta.framework/dist/test.km", true, true);
        	System.out.println("Mergin and Saving done");
        	//System.out.println("SAVING IN KM...");
//        	KmExporter exporter = new KmExporter();
//        	exporter.export(kermetaUnit, dist_folder, true);
  //      	System.out.println("DONE");

//        	System.out.println("SAVING IN ECORE...");
 //       	EcoreExporter exporter2 = new EcoreExporter();
  //      	exporter2.export(mergedUnit, dist_folder, ExporterOptions.getDefault());
  //      	System.out.println("DONE");
        }
    }
}
