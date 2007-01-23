/* $Id: KermetaUnitFactory.java,v 1.1 2007-01-23 15:04:13 dvojtise Exp $
 * Project: Kermeta.io
 * File: KermetaUnitFactory.java
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: 10 févr. 2005
 * Authors: Franck FLEUREY (ffleurey@irisa.fr)
 */

package fr.irisa.triskell.kermeta.migrationv032_v040.loader;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.error.KermetaLoaderError;
import fr.irisa.triskell.kermeta.loader.ecore.KMLoaderModuleECore;
import fr.irisa.triskell.kermeta.loader.emfatic.KMLoaderModuleEmfatic;
import fr.irisa.triskell.kermeta.loader.java.KMLoaderModuleJar;
import fr.irisa.triskell.kermeta.loader.km.KMLoaderModuleKM;
import fr.irisa.triskell.kermeta.loader.km.KMUnit;
import fr.irisa.triskell.kermeta.migrationv032_v040.loader.kmt.KMLoaderModuleMCT;


/**
 * This class is used to provide the LoaderModule that are able to crea KermetaUnit 
 * from various formats.
 * Supported formats are : kmt, km, emf, ecore, jar
 */
public class KermetaUnitFactory extends fr.irisa.triskell.kermeta.loader.KermetaUnitFactory{
    
	/**
	 * this will use a default loader that use the migration version of kmt loader
	 * the application must ensure that it doesn't remains like this for too long, oterwise 
	 * it won't load the new version of the file
	 * An alternative way would be to first rename the old syntax into another extension and then simply add a new loader
	 * @return
	 */
	public static fr.irisa.triskell.kermeta.loader.KermetaUnitFactory getDefaultLoader() {
		if (defaultLoader == null) {
			defaultLoader = new KermetaUnitFactory();
			((KermetaUnitFactory)defaultLoader).loadModules.put("emf",   new KMLoaderModuleEmfatic());
			((KermetaUnitFactory)defaultLoader).loadModules.put("km",    new KMLoaderModuleKM());
			((KermetaUnitFactory)defaultLoader).loadModules.put("kmt",   new KMLoaderModuleMCT());
			((KermetaUnitFactory)defaultLoader).loadModules.put("ecore", new KMLoaderModuleECore());
			((KermetaUnitFactory)defaultLoader).loadModules.put("jar",   new KMLoaderModuleJar());
		}
		return (fr.irisa.triskell.kermeta.loader.KermetaUnitFactory)defaultLoader;
	}
	
}
