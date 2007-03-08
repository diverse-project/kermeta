/* $Id: Variable.java,v 1.9 2007-03-08 14:16:36 cfaucher Exp $
 * Project : Kermeta (First iteration)
 * File : Variable.java
 * License : EPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mar 16, 2005
 * Author : zdrey
 * Description : describe here file content
 * TODO : 
 * 	- write here your TODO actions
 *  - ...
 */
package fr.irisa.triskell.kermeta.interpreter;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * 
 */
public class Variable {

    /**
     * The value of the variable
     */
    protected RuntimeObject runtimeObject;

    /**
     * The name of the variable
     */
    protected String name;

    /**
     * 
     */
    public Variable(String name, RuntimeObject value) {
        this.name = name;
        this.runtimeObject = value;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns the value of this variable.
     */
    public RuntimeObject getRuntimeObject() {
        return runtimeObject;
    }

    /**
     * @param kObject value to set for this variable.
     */
    public void setRuntimeObject(RuntimeObject kObject) {
        this.runtimeObject = kObject;
    }

}
