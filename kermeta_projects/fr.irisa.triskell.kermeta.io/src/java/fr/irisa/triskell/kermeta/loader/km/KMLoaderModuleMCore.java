/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader.km;

import java.util.Iterator;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaLoaderModule;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public class KMLoaderModuleMCore extends KermetaLoaderModule {

    /**
     * 
     */
    public KMLoaderModuleMCore() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaLoaderModule#load(metacore.builder.MetaCoreUnit, java.lang.String)
     */
    public boolean load(KermetaUnit unit, String uri) {
       
    	try {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("mcore",new XMIResourceFactoryImpl()); 
			ResourceSet resource_set = new ResourceSetImpl();
			Resource resource = resource_set.getResource(URI.createURI(uri), true);
			
			KMLoader visitor = new KMLoader(unit);
			Iterator it = resource.getContents().iterator();
			while(it.hasNext()) {
				FObject o = (FObject)it.next();
				visitor.accept(o);
			}
    	}
    	catch(Exception e) {
    		unit.error.add(new KMUnitError("Unable to load program '" + uri +" :" + e, null));
			return false;
    	}
		
        return unit.error.size() == 0;
    }

}
