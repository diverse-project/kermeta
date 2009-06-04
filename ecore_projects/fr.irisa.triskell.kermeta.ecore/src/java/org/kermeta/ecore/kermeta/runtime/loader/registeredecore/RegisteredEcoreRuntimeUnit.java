/* $Id: UMLRuntimeUnit.java,v 1.5 2008-11-13 10:09:27 dvojtise Exp $
 * Project   : org.kermeta.uml2.profiles
 * File      : UMLRuntimeUnit.java
 * License   : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : Feb 11, 2008
 * Authors       : 
 * 					Didier Vojtisek
 */
package org.kermeta.ecore.kermeta.runtime.loader.registeredecore;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irisa.triskell.eclipse.emf.EMFRegistryHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnitFactory;

/**
 * Runtime unit that knows how to load UML resources
 * including resources using nested profiles
 *
 */
public class RegisteredEcoreRuntimeUnit extends EMFRuntimeUnit {

	
	public RegisteredEcoreRuntimeUnit(String uri, RuntimeObject emptyInstances,
			EMFRuntimeUnitFactory factory) {
		super(uri, emptyInstances, factory);
	}
	
	public RegisteredEcoreRuntimeUnit(String pUri, String pMMUri, RuntimeObject emptyInstances, EMFRuntimeUnitFactory pFactory)
    {
        super(pUri, pMMUri, emptyInstances, pFactory);
    }



	@Override
	protected Resource loadEMFResource(EMFRuntimeUnit unit, RuntimeObject resRO)
			throws IOException {
		// Overwrite default EMF2Runtime by a dedicated one
		Resource resource = null;
		URI u = createURI(unit.getUriAsString());
		resource = EMFRegistryHelper.getResource(u);
		if(resource == null){
			throwKermetaRaisedExceptionOnLoad(
					"Not able to load " + unit.getUriAsString() + " from EMF EPackage registry", null);
		}
		return resource;
	}
	
	
	
	
	    		   
}

