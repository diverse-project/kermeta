/*$Id: SimkModelHelper.java,v 1.1 2007-12-21 14:24:21 cfaucher Exp $
* Project : org.kermeta.compiler
* File : 	HelperModel.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 nov. 07
* Authors : Cyril Faucher <cfaucher@irisa.fr>
*/

package org.kermeta.compiler.generator.helper.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.simk.SIMKModel;
import org.kermeta.simk.SimkFactory;


public class SimkModelHelper {

	public static final String SIMK_EXT = "simk";
	
	public List<SimkMethodHelper> helperMethods = null;
	
	public SimkModelHelper() {
		helperMethods = new ArrayList<SimkMethodHelper>();
	}
	
	/*public int getNextId() {
		return helperMethods.size()+1;
	}*/
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public static SIMKModel createSIMKModel(IFile file)
    {
		// Create a Trek structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(SIMK_EXT,new XMIResourceFactoryImpl());
		ResourceSet resource_set = new ResourceSetImpl();
		URI u = URI.createURI(file.getFullPath().toString());
    	u = new URIConverterImpl().normalize(u);
		Resource resource = resource_set.createResource(u);
		resource.getContents().add(SimkFactory.eINSTANCE.createSIMKModel());
		return (SIMKModel) resource.getContents().get(0);
    }
	
	/**
	 * 
	 * @param file
	 * @return
	 */
	public static SIMKModel getSIMKModel(IFile file)
    {
		// Get a Trek structure
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(SIMK_EXT,new XMIResourceFactoryImpl());
		ResourceSet resource_set = new ResourceSetImpl();
		URI u = URI.createURI(file.getFullPath().toString());
    	u = new URIConverterImpl().normalize(u);
		Resource resource = resource_set.getResource(u, true);
		return (SIMKModel) resource.getContents().get(0);
    }
}


