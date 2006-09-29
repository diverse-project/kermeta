/* $Id: CallableOperation.java,v 1.5 2006-09-29 13:29:04 zdrey Exp $
 * Project : Kermeta (First iteration)
 * File : CallableOperation.java
 * License : GPL
 * Copyright : IRISA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 15 avr. 2005
 * Author : Franck Fleurey
 * Description :
 *     describe here file content
 * TODO :
 *     The class encapsulate information about operation call
 */
package fr.irisa.triskell.kermeta.typechecker;

import java.util.Hashtable;
import java.util.Iterator;

//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

/**
 * @author Franck Fleurey IRISA / University of rennes 1 Distributed under the
 *         terms of the GPL license
 */
public class CallableOperation extends CallableElement {

    /**
     * The type on wich the operation can be called
     */
    protected fr.irisa.triskell.kermeta.language.structure.Class fclass;

    /**
     * The operation
     */
    protected Operation operation;

    /**
     * Constructor
     */
    public CallableOperation(Operation op, fr.irisa.triskell.kermeta.language.structure.Class type) {
        super();
        operation = op;
        fclass = type;
    }

    public boolean equals(Object other) {
        if (other instanceof CallableOperation) {
            CallableOperation o = (CallableOperation)other;
            return o.getOperation() == operation && TypeEqualityChecker.equals(fclass, o.fclass);
        }
        return false;
    }
    
	/**
	 * Return the type of an operation
	 * If the operation does not have parameters then it is its return type
	 * Otherwise it is a function type <P1, ..., PN> -> R
	 * @param target the type that is supposed to contain an operation named name
	 * @param name name of the operation
	 * @return null if the operation was not found
	 */
    public Type getType() {
        StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();

        Type result = null;

        Hashtable bindings = TypeVariableEnforcer.getTypeVariableBinding(fclass);

        fr.irisa.triskell.kermeta.language.structure.Type rt = ((SimpleType) TypeCheckerContext.getTypeFromMultiplicityElement(operation)).getType();

        if (operation.getOwnedParameter().size() == 0) {
            // it cannot be a generic method
            // The type parameter of the target class should be bound
            result = new SimpleType(TypeVariableEnforcer.getBoundType(rt, bindings));
        } else {
            FunctionType ft = struct_factory.createFunctionType();
            ProductType pt = struct_factory.createProductType();
            for (Object param : operation.getOwnedParameter()) {
                pt.getType().add(((SimpleType) TypeCheckerContext.getTypeFromMultiplicityElement((Parameter)param)).getType());
            }
            ft.setRight(rt);
            ft.setLeft(pt);
            result = new SimpleType(TypeVariableEnforcer.getBoundType(ft, bindings));
        }

        return result;
    }
    
    public Operation getTypeBoundedOperation() {
        StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
        Operation result = struct_factory.createOperation();
        Hashtable bindings = TypeVariableEnforcer.getTypeVariableBinding(fclass);
        
        result.setName(operation.getName());
        
        result.setLower(operation.getLower());
        result.setUpper(operation.getUpper());
        result.setIsAbstract(operation.isIsAbstract());
        result.setIsOrdered(operation.isIsOrdered());
        result.setIsUnique(operation.isIsUnique());
        
       
        result.setSuperOperation(operation.getSuperOperation());
        
        for (Object next : operation.getTypeParameter()) {
            TypeVariable otv = (TypeVariable)next;
            TypeVariable ntv = struct_factory.createTypeVariable();
            ntv.setName(otv.getName());
            if (otv.getSupertype() != null)
                ntv.setSupertype(TypeVariableEnforcer.getBoundType(otv.getSupertype(), bindings));
            bindings.put(otv, ntv);
            result.getTypeParameter().add(ntv);
        }
        
        if (operation.getType() != null)
            result.setType(TypeVariableEnforcer.getBoundType(operation.getType(), bindings));
        
        for (Object next : operation.getRaisedException()) {
        	fr.irisa.triskell.kermeta.language.structure.Type extype = (fr.irisa.triskell.kermeta.language.structure.Type)next;
            result.getRaisedException().add(TypeVariableEnforcer.getBoundType(extype, bindings));
        }
        
        for (Object next : operation.getOwnedParameter()) {
            Parameter op = (Parameter)next;
            Parameter np = struct_factory.createParameter();
            np.setLower(op.getLower());
            np.setUpper(op.getUpper());
            np.setIsOrdered(op.isIsOrdered());
            np.setIsUnique(op.isIsUnique());
            np.setName(op.getName());
            np.setOperation(result);
            np.setType(TypeVariableEnforcer.getBoundType(op.getType(), bindings));
        }
        return result;
    }

    public String getName() {
        return operation.getName();
    }

    public fr.irisa.triskell.kermeta.language.structure.Class getFclass() {
        return fclass;
    }

    public void setFclass(fr.irisa.triskell.kermeta.language.structure.Class fclass) {
        this.fclass = fclass;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
   
}