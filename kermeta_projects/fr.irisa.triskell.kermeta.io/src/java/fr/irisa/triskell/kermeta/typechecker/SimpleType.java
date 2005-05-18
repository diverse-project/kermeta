/* $Id: SimpleType.java,v 1.6 2005-05-18 23:42:19 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : SimpleType.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 avr. 2005
* Author : Franck Fleurey
* Description :
*     describe here file content
* TODO :
*  A simple type is a type that direcly corresponds to
*  a Kermeta Type.
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FFunctionType;
import fr.irisa.triskell.kermeta.structure.FProductType;
import fr.irisa.triskell.kermeta.structure.FType;
import fr.irisa.triskell.kermeta.structure.FTypeDefinition;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class SimpleType extends Type {

	/**
	 * The corresponding FType
	 */
	protected FType type;
	
	/**
	 * Constructor
	 */
	public SimpleType(FType type) {
		super();
		this.type = type;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.typechecker.Type#isSubTypeOf(fr.irisa.triskell.kermeta.structure.FType)
	 */
	public boolean isSubTypeOf(Type type) {
		if (type instanceof SimpleType) {
			FType required = ((SimpleType)type).getType();
			return TypeConformanceChecker.conforms(required, getType());
		}
		else {
			Iterator it = ((UnionType)type).types.iterator();
			while(it.hasNext()) {
				if (!this.isSubTypeOf((Type)it.next())) {
					return false;
				}
			}
			return true;
		}
	}
	
	public boolean equals(Object  type) {
	    if (this == type) return true;
		if (type instanceof SimpleType) {
			FType required = ((SimpleType)type).getType();
			return TypeEqualityChecker.equals(required, getType());
		}
		else {
			//TODO: This might be a litle restrictive 
			return false;
		}
	}
	
	public ArrayList callableOperations() {
		// Try to get a FClass
		FType resolved = PrimitiveTypeResolver.getResolvedType(type);
		resolved = TypeVariableUtility.getLeastDerivedAdmissibleType(resolved);
		if (resolved instanceof FClass) {
			return InheritanceSearch.callableOperations((FClass)resolved);
		}
		else {
			return new ArrayList();
		}
	}
	public ArrayList callableProperties() {
		// Try to get a FClass
		FType resolved = PrimitiveTypeResolver.getResolvedType(type);
		resolved = TypeVariableUtility.getLeastDerivedAdmissibleType(resolved);
		if (resolved instanceof FClass) {			
			return InheritanceSearch.callableProperties((FClass)resolved);
		}
		else {
			return new ArrayList();
		}
	}
	
	public Type getFunctionTypeLeft() {
		Type result = TypeCheckerContext.VoidType;
		if (type instanceof FFunctionType) {
			FFunctionType t = (FFunctionType)type;
			result = new SimpleType(t.getFLeft());
		}
		return result;
	}
	
	public Type getFunctionTypeRight() {
		Type result = TypeCheckerContext.VoidType;
		if (type instanceof FFunctionType) {
			FFunctionType t = (FFunctionType)type;
			result = new SimpleType(t.getFRight());
		}
		return result;
	}
	
	public Type[] getProductType() {
		Type[] result;
		if (type instanceof FProductType) {
			FProductType t = (FProductType)type;
			result = new Type[t.getFType().size()];
			for(int i=0;i<t.getFType().size(); i++) {
				result[i] = new SimpleType((FType)t.getFType().get(i));
			}
		}
		else {
			result = new Type[1];
			result[0] = this;
		}
		return result;
	}
	
	
	
	
	/**
	 * infer the actual type of the type variable of the generic type
	 * according to this type.
	 * @param generic 
	 * @return null if this type does not match the generic type
	 */
	public Hashtable inferTypeVariableBinding(Type generic) {
	    if (generic instanceof SimpleType) {
	        FType g = ((SimpleType)generic).type;
	        try {
                return TypeVariableInferer.inferTypeVariableTypes(g, type);
            } catch (TypeDoesNotMatchError e) {
                return null;
            }
	    }
	    else {
	        return null;
	    }
	}
	
    protected void inferTypeVariableBinding(FType generic, Hashtable binding) {
        TypeVariableInferer.inferTypeVariableTypes(generic, type, binding);
    }
    
	public String toString() {
		return (String)FTypePrettyPrinter.getInstance().accept(type);
	}
	
	/**
	 * Return the type definition of the type if it has one, null otherwise
	 * @return
	 */
	public FTypeDefinition getTypeDefinition() {
	    if (type instanceof FTypeDefinition) return (FTypeDefinition)type;
	    else if (type instanceof FClass) {
	        return ((FClass)type).getFClassDefinition();
	    }
	    return null;
	}
	
	public FType getFType() {
		return type;
	}
	
	public FType getType() {
		return type;
	}
	public void setType(FType type) {
		this.type = type;
	}
}
