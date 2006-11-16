/* $Id: KCoreRuntimeObject.java,v 1.3 2006-11-16 14:10:16 dvojtise Exp $
* Project : Kermeta (First iteration)
* File : KCoreRuntimeObject.java
* License : GPL
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
 * Distributed under the terms of the GPL license
 */
public class KCoreRuntimeObject extends RuntimeObject {

    private boolean loaded = false;
    
    private fr.irisa.triskell.kermeta.language.structure.Object kcoreObject;
    
    /**
     * @param factory
     * @param metaclass
     */
    public KCoreRuntimeObject(RuntimeObjectFactory factory, RuntimeObject metaclass, fr.irisa.triskell.kermeta.language.structure.Object kcoreObject) {
        super(factory, metaclass);
        this.kcoreObject = kcoreObject;
        super.getData().put("kcoreObject", kcoreObject);
        // in order to serialise model that have dependencies to the framework, set the saved emf object to the one used to load it
        super.getData().put("r2e.emfObject", kcoreObject);
    }
    
    private void load() {
        getFactory().loadKCoreRuntimeObject(this);
    }
    
    

    public RuntimeObject getContainer() {
        if (!loaded) load();
        return super.getContainer();
    }
    public Hashtable getData() {
        if (!loaded) load();
        return super.getData();
    }
    public RuntimeObject getMetaclass() {
        if (!loaded) load();
        return super.getMetaclass();
    }
    public Hashtable getProperties() {
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
