/* $Id: ABaseCommand.java,v 1.2 2005-03-14 18:03:11 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : ICommand.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 14, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 */
package fr.irisa.triskell.kermeta.base;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

/**
 * Implementation of the Command pattern.
 */
public abstract class ABaseCommand {
 
    /** The KermetaObject that we evaluate.*/
    protected KermetaObject kObject;
    /** The interpreter current context */
    protected KermetaObject context;
    /**
     * Set the kObject attribute to <code>object</code>
     * @param object KermetaObject instance to set
     */
    public void setKermetaObject(KermetaObject object) {
        kObject = object;
    }
    
    /**
     * Set the global context to evaluate this kObject
     * @param context
     */
    public void setInterpreterContext(KermetaObject pContext) {
        context = pContext;
    }
    
    /**
     * @return the interpreter context
     */
    public KermetaObject getInterpreterContext() {
        return context;
    }
    
    /**
     * @return Returns the kObject.
     */
    public KermetaObject getKermetaObject() {
        return kObject;
    }
    /**
     * Execute the command
     */
    public abstract void execute();
}
