/* $Id: Variable.java,v 1.4 2005-03-25 16:42:17 zdrey Exp $
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
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FType;

/**
 * 
 */
public class Variable {

    /**
     * @deprecated The declaration in kermeta that correspond to this Variable
     * 
     * @uml.property name="declaration"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    protected FVariableDecl declaration;

    /**
     * The type of the variable
     * 
     * @uml.property name="type"
     * @uml.associationEnd multiplicity="(0 1)"
     */
    protected FType type;

    /**
     * The value of the variable
     * 
     * @uml.property name="runtimeObject"
     * @uml.associationEnd qualifier="constant:java.lang.String java.util.ArrayList" multiplicity=
     * "(0 1)"
     */
    protected RuntimeObject RuntimeObject;

    /**
     * The name of the variable
     * 
     * @uml.property name="name" multiplicity="(0 1)"
     */
    protected String name;

    /**
     * 
     */
    public Variable() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return Returns the declaration.
     * 
     * @uml.property name="declaration"
     */
    public FVariableDecl getDeclaration() {
        return declaration;
    }

    /**
     * @param declaration The declaration to set.
     * 
     * @uml.property name="declaration"
     */
    public void setDeclaration(FVariableDecl declaration) {
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
     * @return Returns the value.
     * 
     * @uml.property name="runtimeObject"
     */
    public RuntimeObject getRuntimeObject() {
        return RuntimeObject;
    }

    /**
     * @param value2 The value to set.
     * 
     * @uml.property name="runtimeObject"
     */
    public void setRuntimeObject(RuntimeObject kObject) {
        this.RuntimeObject = kObject;
    }

    /**
     * 
     * @uml.property name="type"
     */
    public FType getType() {
        return type;
    }

    /**
     * 
     * @uml.property name="type"
     */
    public void setType(FType pType) {
        type = pType;
    }

}
