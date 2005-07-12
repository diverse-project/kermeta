/* $Id: EMFRuntimeUnitFactory.java,v 1.2 2005-07-12 16:36:03 zdrey Exp $
 * Project   : Kermeta (First iteration)
 * File      : EMFRuntimeUnitFactory.java
 * License   : GPL
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
    public RuntimeUnit createRuntimeUnit(String uri)
    {
        EMFRuntimeUnit emfUnit = new EMFRuntimeUnit(uri);
        emfUnit.setFactory(this);
        return emfUnit;
    }
    
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
