/* $Id: KMUnit.java,v 1.12 2006-04-10 17:35:50 zdrey Exp $
* Project : Kermeta (First iteration)
* File : 	KMUnit.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 21 févr. 2005
* Author : Franck Fleurey
*/
package fr.irisa.triskell.kermeta.loader.km;

import java.io.StringReader;
import java.util.Hashtable;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.loader.KMUnitError;
import fr.irisa.triskell.kermeta.loader.KMUnitParseError;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.parser.KermetaLexer;
import fr.irisa.triskell.kermeta.parser.KermetaParser;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

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
	
	/**
	 * The resource that contains a kermeta program in its EMF representation
	 */
	Resource resource ;
	
	
	public KMUnit(String uri, Hashtable packages, Resource res) {
		super(uri, packages);
		resource = res;
	}
	
	/** 
	 * This preLoad method loads the packages, class definitions, and enumerations in a hashtable (one for each kind)
	 * so that we can retrieve them more easily 
	 * The preLoad condition for KMUnit is the packages
	 * @see fr.irisa.triskell.kermeta.loader.KMLoader#KMLoader(KermetaUnit).
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
				fr.irisa.triskell.kermeta.language.structure.Object o = (fr.irisa.triskell.kermeta.language.structure.Object)it.next();
				visitor.accept(o);
			}
			
    	}
    	catch(Exception e) {
    		this.messages.addMessage(new KMUnitError("Unable to load program '" + uri +" :" + e, null, null));
    		KermetaUnit.internalLog.error("Unable to load unit " + uri, e);
    	}
    	type_checked = true;
	}
	
	
	/**
	 * This method is for KMUnit what <code>parseString</code> for KMTUnit :
	 * Whereas parseString method is used in KMTUnit when one wants to load a KermetaUnit
	 * from a "cached" document (that is, a String!) instead of the data contained 
	 * in the serialized model (i.e the file whose path is the KermetaUnit.URI),
	 * one can call "setResource" to set a specific resource to load instead of 
	 * a resource that is directly loaded from the serialized model.
	 * @param r the resource from which the KMUnit is loaded.
	 */
	public void setResource(Resource r) {
		resource = r;
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
