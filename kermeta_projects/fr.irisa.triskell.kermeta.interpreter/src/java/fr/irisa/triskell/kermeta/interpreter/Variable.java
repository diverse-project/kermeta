/* $Id: Variable.java,v 1.8 2006-03-03 15:21:47 dvojtise Exp $
 * Project : Kermeta (First iteration)
 * File : Variable.java
 * License : GPL
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

import fr.irisa.triskell.kermeta.language.behavior.VariableDecl;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

/**
 * 
 */
public class Variable {

    /**
     * @deprecated The declaration in kermeta that correspond to this Variable
     */
    protected VariableDecl declaration;

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
     * @return Returns the declaration.
     * 
     * @uml.property name="declaration"
     */
    public VariableDecl getDeclaration() {
        return declaration;
    }

    /**
     * @param declaration The declaration to set.
     * 
     * @uml.property name="declaration"
     */
    public void setDeclaration(VariableDecl declaration) {
        this.declaration = declaration;
    }

    /**
     * @return Returns the name.
     * 
     * @uml.property name="name"
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     * 
     * @uml.property name="name"
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
