/* $Id: CallableOperation.java,v 1.1 2005-04-19 08:55:11 ffleurey Exp $
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

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FParameter;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;

/**
 * @author Franck Fleurey IRISA / University of rennes 1 Distributed under the
 *         terms of the GPL license
 */
public class CallableOperation extends CallableElement {

    /**
     * The type on wich the operation can be called
     */
    protected FClass fclass;

    /**
     * The operation
     */
    protected FOperation operation;

    /**
     * Constructor
     */
    public CallableOperation(FOperation op, FClass type) {
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

        FType rt = ((SimpleType) TypeCheckerContext.getTypeFromMultiplicityElement(operation)).getType();

        if (operation.getFOwnedParameter().size() == 0) {
            // it cannot be a generic method
            // The type parameter of the target class should be bound
            result = new SimpleType(TypeVariableEnforcer.getBoundType(rt, bindings));
        } else {
            FFunctionType ft = struct_factory.createFFunctionType();
            FProductType pt = struct_factory.createFProductType();
            Iterator ps = operation.getFOwnedParameter().iterator();
            while (ps.hasNext()) {
                FParameter param = (FParameter) ps.next();
                pt.getFType().add(((SimpleType) TypeCheckerContext.getTypeFromMultiplicityElement(param)).getType());
            }
            ft.setFRight(rt);
            ft.setFLeft(pt);
            result = new SimpleType(TypeVariableEnforcer.getBoundType(ft, bindings));
        }

        return result;
    }

    public String getName() {
        return operation.getFName();
    }

    public FClass getFclass() {
        return fclass;
    }

    public void setFclass(FClass fclass) {
        this.fclass = fclass;
    }

    public FOperation getOperation() {
        return operation;
    }

    public void setOperation(FOperation operation) {
        this.operation = operation;
    }
}