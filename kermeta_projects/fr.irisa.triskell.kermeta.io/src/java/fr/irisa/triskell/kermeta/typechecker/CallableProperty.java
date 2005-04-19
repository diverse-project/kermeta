/* $Id: CallableProperty.java,v 1.1 2005-04-19 08:55:22 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : CallableProperty.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2005
* Author : Franck Fleurey
* Description : callable property
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FType;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class CallableProperty extends CallableElement {

    protected FProperty property;
    
    protected FClass fclass;
    
    /**
     * @param property
     * @param fclass
     */
    public CallableProperty(FProperty property, FClass fclass) {
        super();
        this.property = property;
        this.fclass = fclass;
    }
    
    public boolean equals(Object other) {
        if (other instanceof CallableProperty) {
            CallableProperty p = (CallableProperty)other;
            return p.getProperty() == property && TypeEqualityChecker.equals(fclass, p.fclass);
        }
        return false;
    }
    
    /**
     * @see fr.irisa.triskell.kermeta.typechecker.CallableElement#getType()
     */
    public Type getType() {
        // The type of the property
        FType t = ((SimpleType)TypeCheckerContext.getTypeFromMultiplicityElement(property)).type;
        // subtitute varables :
        Hashtable bindings = TypeVariableEnforcer.getTypeVariableBinding(fclass);
        return new SimpleType(TypeVariableEnforcer.getBoundType(t, bindings));
    }

    /**
     * @see fr.irisa.triskell.kermeta.typechecker.CallableElement#getName()
     */
    public String getName() {
        return property.getFName();
    }

    public FClass getFclass() {
        return fclass;
    }
    public void setFclass(FClass fclass) {
        this.fclass = fclass;
    }
    public FProperty getProperty() {
        return property;
    }
    public void setProperty(FProperty property) {
        this.property = property;
    }
}
