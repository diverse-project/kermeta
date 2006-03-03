/* $Id: CallableProperty.java,v 1.3 2006-03-03 15:22:18 dvojtise Exp $
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

//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.Property;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class CallableProperty extends CallableElement {

    protected Property property;
    
    protected fr.irisa.triskell.kermeta.language.structure.Class fclass;
    
    /**
     * @param property
     * @param fclass
     */
    public CallableProperty(Property property, fr.irisa.triskell.kermeta.language.structure.Class fclass) {
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
    	fr.irisa.triskell.kermeta.language.structure.Type t = ((SimpleType)TypeCheckerContext.getTypeFromMultiplicityElement(property)).type;
        // subtitute varables :
        Hashtable bindings = TypeVariableEnforcer.getTypeVariableBinding(fclass);
        return new SimpleType(TypeVariableEnforcer.getBoundType(t, bindings));
    }
    
    public Property getTypeBoundedProperty() {
        StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
        Property result = struct_factory.createProperty();
        Hashtable bindings = TypeVariableEnforcer.getTypeVariableBinding(fclass);
        
        result.setName(property.getName());
        
        result.setLower(property.getLower());
        result.setUpper(property.getUpper());
        result.setIsOrdered(property.isIsOrdered());
        result.setIsUnique(property.isIsUnique());
        
        result.setIsComposite(property.isIsComposite());
        result.setIsDerived(property.isIsDerived());
        result.setIsID(property.isIsID());

        result.setType(TypeVariableEnforcer.getBoundType(property.getType(), bindings));
        
        return result;
    }

    /**
     * @see fr.irisa.triskell.kermeta.typechecker.CallableElement#getName()
     */
    public String getName() {
        return property.getName();
    }

    public fr.irisa.triskell.kermeta.language.structure.Class getFclass() {
        return fclass;
    }
    public void setFclass(fr.irisa.triskell.kermeta.language.structure.Class fclass) {
        this.fclass = fclass;
    }
    public Property getProperty() {
        return property;
    }
    public void setProperty(Property property) {
        this.property = property;
    }
}
