/* $Id: EcoreUnit.java,v 1.7 2006-06-20 09:07:58 zdrey Exp $
* Project : Kermeta (First iteration)
* File : EcoreUnit.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 26 mai 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.loader.ecore;

import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.irisa.triskell.kermeta.exporter.ecore.KM2Ecore;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.utils.KM2ECoreConversionException;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class EcoreUnit extends KermetaUnit {

    /**
     * @param uri
     * @param packages
     */
    public EcoreUnit(String uri, Hashtable packages) {
        super(uri, packages);
        Ecore2KM.isQuickFixEnabled = true;
    }
    
    public EcoreUnit(Resource resource, Hashtable packages) {
        this(resource.getURI().toString(), packages);
    }
    
    public void load() {
		try {
			// Load ressource
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
			ResourceSet resource_set = new ResourceSetImpl();
			Resource resource = resource_set.getResource(URI.createURI(this.getUri()), true);
			this.load(resource);
		} catch (Throwable e) {
			this.messages.addError("Error loading ECore model " + this.getUri() + " : " + e, null);
			KermetaUnit.internalLog.error("Error loading ECore model " + this.getUri() + " : " + e, e);
		}
	}
    
	public void load(Resource resource) {
		try {
			new Ecore2KM(resource, this).export();
		} catch (Throwable e) {
			this.messages.addError("Error loading ECore model " + this.getUri() + " : " + e, null);
			KermetaUnit.internalLog.error("Error loading ECore model " + this.getUri() + " : " + e, e);
		}
	}
	
    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#preLoad()
     */
    public void preLoad() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadAnnotations()
     */
    public void loadAnnotations() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadImportedUnits()
     */
    public void loadImportedUnits() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadTypeDefinitions()
     */
    public void loadTypeDefinitions() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadStructuralFeatures()
     */
    public void loadStructuralFeatures() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadOppositeProperties()
     */
    public void loadOppositeProperties() {}

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadBodies()
     */
    public void loadBodies() {}
    
    

}
