/* $Id: Variable.java,v 1.2 2005-03-21 08:47:27 zdrey Exp $
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

import fr.irisa.triskell.kermeta.behavior.FVariableDecl;
import fr.irisa.triskell.kermeta.runtime.KermetaObject;

/**
 * 
 */
public class Variable {

    /** The declaration in kermeta that correspond to this Variable */
    protected FVariableDecl declaration ;
    /** The value of the variable */
    protected KermetaObject kermetaObject;
    /** The name of the variable */
    protected String name;
    /**
     * 
     */
    public Variable() {
        // TODO Auto-generated constructor stub
    }
    
    

    /**
     * @return Returns the declaration.
     */
    public FVariableDecl getDeclaration() {
        return declaration;
    }
    /**
     * @param declaration The declaration to set.
     */
    public void setDeclaration(FVariableDecl declaration) {
        this.declaration = declaration;
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
     * @return Returns the value.
     */
    public KermetaObject getKermetaObject() {
        return kermetaObject;
    }
    /**
     * @param value2 The value to set.
     */
    public void setKermetaObject(KermetaObject kObject) {
        this.kermetaObject = kObject;
    }
}
