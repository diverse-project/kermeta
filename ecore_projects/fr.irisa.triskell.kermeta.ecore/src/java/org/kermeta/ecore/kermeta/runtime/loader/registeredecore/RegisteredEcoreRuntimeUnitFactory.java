/* $Id: UMLRuntimeUnitFactory.java,v 1.1 2008-02-11 16:48:35 dvojtise Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMFRuntimeUnitFactory.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : 
 *		Didier Vojtisek
 */
package org.kermeta.ecore.kermeta.runtime.loader.registeredecore;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnitFactory;

/**
 * The concrete factory that create an EMF RuntimeUnit
 */
public class RegisteredEcoreRuntimeUnitFactory extends EMFRuntimeUnitFactory 
{

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.runtime.RuntimeUnitFactory#createRuntimeUnit(java.lang.String)
     */
    public RuntimeUnit createRuntimeUnit(String uri, RuntimeObject emptyInstances)
    {
        RegisteredEcoreRuntimeUnit emfUnit = new RegisteredEcoreRuntimeUnit(uri, emptyInstances, this);
        return emfUnit;
    }
    
    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.runtime.RuntimeUnitFactory#createRuntimeUnit(java.lang.String)
     */
    public RuntimeUnit createRuntimeUnit(String uri, String mm_uri, RuntimeObject emptyInstances)
    {
    	RegisteredEcoreRuntimeUnit emfUnit = new RegisteredEcoreRuntimeUnit(uri, mm_uri, emptyInstances, this);
        return emfUnit;
    }
   
}
