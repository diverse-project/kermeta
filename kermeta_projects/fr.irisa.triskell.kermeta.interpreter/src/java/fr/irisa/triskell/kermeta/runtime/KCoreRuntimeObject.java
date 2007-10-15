/* $Id: KCoreRuntimeObject.java,v 1.7 2007-10-15 07:13:59 barais Exp $
* Project : Kermeta (First iteration)
* File : KCoreRuntimeObject.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 7 juin 2005
* Author : Franck Fleurey
*/ 

package fr.irisa.triskell.kermeta.runtime;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.factory.RuntimeObjectFactory;
//import fr.irisa.triskell.kermeta.language.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class KCoreRuntimeObject extends RuntimeObjectImpl {

    private boolean loaded = false;
    
    private fr.irisa.triskell.kermeta.language.structure.Object kcoreObject;
    
    /**
     * @param factory
     * @param metaclass
     */
    public KCoreRuntimeObject(RuntimeObjectFactory factory, RuntimeObject metaclass, fr.irisa.triskell.kermeta.language.structure.Object kcoreObject) {
        super(factory, metaclass);
        this.kcoreObject = kcoreObject;
        super.setKCoreObject(kcoreObject);
        // in order to serialise model that have dependencies to the framework, set the saved emf object to the one used to load it
        super.setR2eEmfObject(kcoreObject);
    }
    
    private void load() {
        getFactory().loadKCoreRuntimeObject(this);
    }
    
    

    public RuntimeObject getContainer() {
        if (!loaded) load();
        return super.getContainer();
    }
    /*public Hashtable<String,Object> getData() {
        if (!loaded) load();
        return super.getData();
    }*/
    public RuntimeObject getMetaclass() {
        if (!loaded) load();
        return super.getMetaclass();
    }
    public Hashtable<String, RuntimeObject> getProperties() {
        if (!loaded) load();
        return super.getProperties();
    }
    public boolean isFrozen() {
        if (!loaded) load();
        return super.isFrozen();
    }
    public fr.irisa.triskell.kermeta.language.structure.Object getKcoreObject() {
        return kcoreObject;
    }
    public boolean isLoaded() {
        return loaded;
    }
    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
}
