/* $Id: ABaseCommand.java,v 1.1 2005-03-14 16:02:41 zdrey Exp $
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
 
    protected KermetaObject kObject;
    /**
     * Set the kObject attribute to <code>object</code>
     * @param object KermetaObject instance to set
     */
    public void setKermetaObject(KermetaObject object)
    {
        kObject = object;
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
