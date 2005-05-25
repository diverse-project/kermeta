/*
 * Created on 21 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 */
package fr.irisa.triskell.kermeta.loader.km;

import java.util.Hashtable;
import java.util.Iterator;

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
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KMUnit extends KermetaUnit {

	/**
	 * @param uri
	 */
	public KMUnit(String uri, Hashtable packages) {
		super(uri, packages);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#preLoad()
	 */
	public void preLoad() {
		try {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl()); 
			ResourceSet resource_set = new ResourceSetImpl();
			Resource resource = resource_set.getResource(URI.createURI(uri), true);
			
			KMLoader visitor = new KMLoader(this);
			Iterator it = resource.getContents().iterator();
			while(it.hasNext()) {
				FObject o = (FObject)it.next();
				visitor.accept(o);
			}
    	}
    	catch(Exception e) {
    		this.error.add(new KMUnitError("Unable to load program '" + uri +" :" + e, null));
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
