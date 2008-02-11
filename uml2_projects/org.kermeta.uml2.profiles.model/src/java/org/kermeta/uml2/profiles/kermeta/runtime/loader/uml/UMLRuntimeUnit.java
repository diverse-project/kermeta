/* $Id: UMLRuntimeUnit.java,v 1.1 2008-02-11 16:48:35 dvojtise Exp $
 * Project   : org.kermeta.uml2.profiles
 * File      : UMLRuntimeUnit.java
 * License   : EPL
 * Copyright : IRISA / INRIA 
 * ----------------------------------------------------------------------------
 * Creation date : Feb 11, 2008
 * Authors       : 
 * 					Didier Vojtisek
 */
package org.kermeta.uml2.profiles.kermeta.runtime.loader.uml;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnitFactory;

/**
 * Runtime unit that knows how to load UML resources
 * including resources using nested profiles
 *
 */
public class UMLRuntimeUnit extends EMFRuntimeUnit {

	public UMLRuntimeUnit(String uri, RuntimeObject emptyInstances,
			EMFRuntimeUnitFactory factory) {
		super(uri, emptyInstances, factory);
	}
	
	public UMLRuntimeUnit(String pUri, String pMMUri, RuntimeObject emptyInstances, EMFRuntimeUnitFactory pFactory)
    {
        super(pUri, pMMUri, emptyInstances, pFactory);
    }
    		   
}

