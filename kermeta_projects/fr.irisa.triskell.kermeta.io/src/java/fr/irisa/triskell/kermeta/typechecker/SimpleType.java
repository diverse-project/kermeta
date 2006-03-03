/* $Id: SimpleType.java,v 1.8 2006-03-03 15:22:18 dvojtise Exp $
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

//import fr.irisa.triskell.kermeta.language.structure.FClass;
//import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
//import fr.irisa.triskell.kermeta.language.structure.FType;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class SimpleType extends Type {

	/**
	 * The corresponding fr.irisa.triskell.kermeta.language.structure.Type
	 */
	protected fr.irisa.triskell.kermeta.language.structure.Type type;
	
	/**
	 * Constructor
	 */
	public SimpleType(fr.irisa.triskell.kermeta.language.structure.Type type) {
		super();
		this.type = type;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.typechecker.Type#isSubTypeOf(fr.irisa.triskell.kermeta.language.structure.Type)
	 */
	public boolean isSubTypeOf(Type type) {
		if (type instanceof SimpleType) {
			fr.irisa.triskell.kermeta.language.structure.Type required = ((SimpleType)type).getType();
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
			fr.irisa.triskell.kermeta.language.structure.Type required = ((SimpleType)type).getType();
			return TypeEqualityChecker.equals(required, getType());
		}
		else {
			//TODO: This might be a litle restrictive 
			return false;
		}
	}
	
	public ArrayList callableOperations() {
		// Try to get a FClass
		fr.irisa.triskell.kermeta.language.structure.Type resolved = PrimitiveTypeResolver.getResolvedType(type);
		resolved = TypeVariableUtility.getLeastDerivedAdmissibleType(resolved);
		if (resolved instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
			return InheritanceSearch.callableOperations((fr.irisa.triskell.kermeta.language.structure.Class)resolved);
		}
		else {
			return new ArrayList();
		}
	}
	public ArrayList callableProperties() {
		// Try to get a FClass
		fr.irisa.triskell.kermeta.language.structure.Type resolved = PrimitiveTypeResolver.getResolvedType(type);
		resolved = TypeVariableUtility.getLeastDerivedAdmissibleType(resolved);
		if (resolved instanceof fr.irisa.triskell.kermeta.language.structure.Class) {			
			return InheritanceSearch.callableProperties((fr.irisa.triskell.kermeta.language.structure.Class)resolved);
		}
		else {
			return new ArrayList();
		}
	}
	
	public Type getFunctionTypeLeft() {
		Type result = TypeCheckerContext.VoidType;
		if (type instanceof FunctionType) {
			FunctionType t = (FunctionType)type;
			result = new SimpleType(t.getLeft());
		}
		return result;
	}
	
	public Type getFunctionTypeRight() {
		Type result = TypeCheckerContext.VoidType;
		if (type instanceof FunctionType) {
			FunctionType t = (FunctionType)type;
			result = new SimpleType(t.getRight());
		}
		return result;
	}
	
	public Type[] getProductType() {
		Type[] result;
		if (type instanceof ProductType) {
			ProductType t = (ProductType)type;
			result = new Type[t.getType().size()];
			for(int i=0;i<t.getType().size(); i++) {
				result[i] = new SimpleType((fr.irisa.triskell.kermeta.language.structure.Type)t.getType().get(i));
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
	        fr.irisa.triskell.kermeta.language.structure.Type g = ((SimpleType)generic).type;
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
	
    protected void inferTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.Type generic, Hashtable binding) {
        TypeVariableInferer.inferTypeVariableTypes(generic, type, binding);
    }
    
	public String toString() {
		return (String)FTypePrettyPrinter.getInstance().accept(type);
	}
	
	/**
	 * Return the type definition of the type if it has one, null otherwise
	 * @return
	 */
	public TypeDefinition getTypeDefinition() {
	    if (type instanceof TypeDefinition) return (TypeDefinition)type;
	    else if (type instanceof fr.irisa.triskell.kermeta.language.structure.Class) {
	        return ((fr.irisa.triskell.kermeta.language.structure.Class)type).getTypeDefinition();
	    }
	    return null;
	}
	
	public fr.irisa.triskell.kermeta.language.structure.Type getFType() {
		return type;
	}
	
	public fr.irisa.triskell.kermeta.language.structure.Type getType() {
		return type;
	}
	public void setType(fr.irisa.triskell.kermeta.language.structure.Type type) {
		this.type = type;
	}
}
