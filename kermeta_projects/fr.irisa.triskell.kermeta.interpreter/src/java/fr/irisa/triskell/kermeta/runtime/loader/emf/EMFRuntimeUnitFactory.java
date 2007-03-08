/* $Id: EMFRuntimeUnitFactory.java,v 1.6 2007-03-08 14:16:37 cfaucher Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMFRuntimeUnitFactory.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jul 6, 2005
 * Authors       : zdrey
 */
package fr.irisa.triskell.kermeta.runtime.loader.emf;

import fr.irisa.triskell.kermeta.builder.RuntimeMemory;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnitFactory;

/**
 * The concrete factory that create an EMF RuntimeUnit
 */
public class EMFRuntimeUnitFactory extends RuntimeUnitFactory 
{

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.runtime.RuntimeUnitFactory#createRuntimeUnit(java.lang.String)
     */
    public RuntimeUnit createRuntimeUnit(String uri, RuntimeObject emptyInstances)
    {
        EMFRuntimeUnit emfUnit = new EMFRuntimeUnit(uri, emptyInstances, this);
        return emfUnit;
    }
    
    /**
     * Create an EMFRuntimeUnit
     * @param uri : relative path of the EMF resource to load/save
     * @param mm_uri : relative path of the URI of the resource where meta-model of uri-located model.
     * @param emptyInstances
     */
    public RuntimeUnit createRuntimeUnit(String uri, String mm_uri, RuntimeObject emptyInstances)
    {
        EMFRuntimeUnit emfUnit = new EMFRuntimeUnit(uri, mm_uri, emptyInstances, this);
        return emfUnit;
    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.runtime.RuntimeUnitFactory#getMemory()
     */
    public RuntimeMemory getMemory() {
        // TODO Auto-generated method stub
        return null;
    }
   
}
