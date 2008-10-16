/*$Id: SimkModelHelper.java,v 1.4 2008-10-16 09:04:38 cfaucher Exp $
* Project : org.kermeta.compiler.generator
* File : 	SimkModelHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.generator.helper.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.compiler.common.KCompilerConstants;
import org.kermeta.simk.SIMKModel;


public class SimkModelHelper {
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public static SIMKModel getSIMKModel(IFile file) {
		if(file.exists()) {
			// Get a Trek structure
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(KCompilerConstants.SIMK_EXT,new XMIResourceFactoryImpl());
			ResourceSet resource_set = new ResourceSetImpl();
			URI u = URI.createURI(file.getFullPath().toString());
	    	u = new ExtensibleURIConverterImpl().normalize(u);
			Resource resource = resource_set.getResource(u, true);
			return (SIMKModel) resource.getContents().get(0);
		}
		return null;
    }
}


