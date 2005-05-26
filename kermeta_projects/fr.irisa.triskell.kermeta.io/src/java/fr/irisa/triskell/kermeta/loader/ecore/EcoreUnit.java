/* $Id: EcoreUnit.java,v 1.1 2005-05-26 15:40:52 ffleurey Exp $
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

import fr.irisa.triskell.kermeta.loader.KermetaUnit;

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
    }

    /**
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#preLoad()
     */
    public void preLoad() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see fr.irisa.triskell.kermeta.loader.KermetaUnit#loadAnnotations()
     */
    public void loadAnnotations() {
        // TODO Auto-generated method stub

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

}
