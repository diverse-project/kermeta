/*
 * Created on 10 févr. 2005
 * By Franck FLEUREY (ffleurey@irisa.fr)
 * 
 */
package fr.irisa.triskell.kermeta.loader;

/**
 * @author Franck Fleurey
 * IRISA / University of Rennes 1 (France)
 * Distributed under the terms of the GPL licence
 * 
 */
public abstract class KermetaLoaderModule {

    /**
     * 
     */
    public KermetaLoaderModule() {
        super();
    }
    
    /**
     * Load the ressourc at URI in the MetaCoreUnit given as parameter
     * return true if sucess.
     * return false if the ressource was not found or contain errors...
     * @param unit
     * @param uri
     * @return
     */
    public abstract KermetaUnit createKermetaUnit(String uri);

}
