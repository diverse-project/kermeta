/* $Id: KCoreRuntimeObject.java,v 1.1 2005-06-07 12:06:14 ffleurey Exp $
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
import fr.irisa.triskell.kermeta.structure.FObject;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class KCoreRuntimeObject extends RuntimeObject {

    private boolean loaded = false;
    
    private FObject kcoreObject;
    
    /**
     * @param factory
     * @param metaclass
     */
    public KCoreRuntimeObject(RuntimeObjectFactory factory, RuntimeObject metaclass, FObject kcoreObject) {
        super(factory, metaclass);
        this.kcoreObject = kcoreObject;
        super.getData().put("kcoreObject", kcoreObject);
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
    public FObject getKcoreObject() {
        return kcoreObject;
    }
    public boolean isLoaded() {
        return loaded;
    }
    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
}
