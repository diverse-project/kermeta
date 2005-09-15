/* $Id: KMUnit.java,v 1.9 2005-09-15 12:40:33 dvojtise Exp $
* Project : Kermeta (First iteration)
* File : 	KMUnit.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 févr. 2005
* Author : Franck Fleurey
*/
package fr.irisa.triskell.kermeta.loader.km;

import java.util.Hashtable;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 */
public class KMUnit extends KermetaUnit {

    private static ResourceSet resource_set = null;
    
    public static ResourceSet getRessourceSet() {
        if (resource_set == null) {
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl()); 
			resource_set = new ResourceSetImpl();
        }
        return resource_set;
    }
    
    public static void clearRessourceSet() {
        resource_set = null;
    }
    
	/**
	 * @param uri
	 */
	public KMUnit(String uri, Hashtable packages) {
		super(uri, packages);
		// TODO Auto-generated constructor stub
	}
	
	Resource resource ;
	
	public KMUnit(String uri, Hashtable packages, Resource res) {
		super(uri, packages);
		resource = res;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#preLoad()
	 */
	public void preLoad() {
		try {
		    if (resource == null) {
				KermetaUnit.internalLog.info("Loading KM ressource " + uri);
		     
				resource = getRessourceSet().getResource(URI.createURI(uri), true);

				resource.load(null);
				KermetaUnit.internalLog.info("Resource set size : " + resource_set.getResources().size());
				
		    
		    }
		    
			KMLoader visitor = new KMLoader(this);
			TreeIterator it = resource.getAllContents();
			while(it.hasNext()) {
				FObject o = (FObject)it.next();
				visitor.accept(o);
			}
			
    	}
    	catch(Exception e) {
    		this.messages.addMessage(new KMUnitError("Unable to load program '" + uri +" :" + e, null));
    		KermetaUnit.internalLog.error("Unable to load unit " + uri, e);
    	}
    	type_checked = true;
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadImportedUnits()
	 */
	public void loadImportedUnits() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadTypeDefinitions()
	 */
	public void loadTypeDefinitions() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadStructuralFeatures()
	 */
	public void loadStructuralFeatures() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadOppositeProperties()
	 */
	public void loadOppositeProperties() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadBodies()
	 */
	public void loadBodies() {
		// TODO Auto-generated method stub

	}
	

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadAnnotations()
     */
    public void loadAnnotations() {
        // TODO Auto-generated method stub

    }
}
