/* $Id: UnionType.java,v 1.3 2005-05-18 23:42:27 ffleurey Exp $
* Project : Kermeta (First iteration)
* File : UnionType.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 avr. 2005
* Author : Franck Fleurey
* Description :
*     describe here file content
* TODO :
* A union type coorespond to the alternative between
* several Kermeta Types
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import fr.irisa.triskell.kermeta.structure.FType;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class UnionType extends Type {

	/**
	 * A set of Type
	 */
	protected ArrayList types;
	
	
	/**
	 * Constructor
	 */
	public UnionType() {
		super();
		types = new ArrayList();
	}
	
	/**
	 * Add a type
	 * @param type
	 */
	public void addType(Type type) {
		types.add(type);
	}
	
	/**
	 * Get the type at index
	 * @param index
	 * @return
	 */
	public Type getType(int index) {
		return (Type)types.get(index);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.typechecker.Type#isSubTypeOf(fr.irisa.triskell.kermeta.structure.FType)
	 */
	public boolean isSubTypeOf(Type type) {
		boolean result = true;
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			result = t.isSubTypeOf(type);
			if(!result) break;
		}
		return result;
	}
	
	public boolean equals(Object other) {
		// TODO : This might be a little restrictive
	    if (this == other) return true;
		boolean result = false;
	    if (other instanceof UnionType) {
	        UnionType o = (UnionType)other;
	        if (o.types.size() == this.types.size()) {
	            for(int i=0; i<this.types.size(); i++) {
	                result = this.types.get(i).equals(o.types.get(i));
	                if(!result) break;
	            }
	        }
	    }
	    return result;
	}
	
	/**
	 * @see fr.irisa.triskell.kermeta.typechecker.Type#callableProperties()
	 */
	public ArrayList callableProperties() {
		ArrayList result = null;
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			if (result == null) result = t.callableProperties();
			else result = inter(result, t.callableProperties());
		}
		return result;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.typechecker.Type#callableOperations()
	 */
	public ArrayList callableOperations() {
		ArrayList result = null;
		// Get intersection of valid operation
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			if (result == null) result = t.callableOperations();
			else result = inter(result, t.callableOperations());
		}
		return result;
	}
	
	protected ArrayList inter(ArrayList l1, ArrayList l2) {
		ArrayList result = new ArrayList();
		for(int i=0; i<l1.size(); i++) {
			if (l2.contains(l1.get(i))) {
				result.add(l1.get(i));
			}
		}
		return result;
	}
	

	public Type getFunctionTypeLeft() {
		UnionType result = new UnionType();
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			result.addType(t.getFunctionTypeLeft());
		}
		return result;
	}
	
	public Type getFunctionTypeRight() {
		UnionType result = new UnionType();
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			result.addType(t.getFunctionTypeRight());
		}
		return result;
	}
	
	public Type[] getProductType() {
		Type[] result;
		// The max size of union produc types
		int pt_size = 1;
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			Type[] pt = t.getProductType();
			if (pt.length > pt_size) pt_size = pt.length;
		}
		// initialize result
		result = new Type[pt_size];
		for(int j=0; j<pt_size; j++) {
			result[j] = new UnionType();
		}
		// Build result. Add Void types when necessary
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			Type[] pt = t.getProductType();
			for(int j=0; j<pt_size; j++) {
				if (j<pt.length) ((UnionType)result[j]).addType(pt[j]);
				else ((UnionType)result[j]).addType(TypeCheckerContext.VoidType);
			}
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
	    if (!(generic instanceof SimpleType)) {
	        return null;
	    }
	    Hashtable result = new Hashtable();
	    try {
	        this.inferTypeVariableBinding(((SimpleType)generic).type, result);
	    }
	    catch(TypeDoesNotMatchError e) {
	        result = null;
	    }
	    return result;
	}
	
	protected void inferTypeVariableBinding(FType generic, Hashtable binding) {
        for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			t.inferTypeVariableBinding(generic, binding);
        }

	}
	
	public SimpleType transformAsSimpleType() {
	    SimpleType result = (SimpleType)TypeCheckerContext.ObjectType;
	    
	    Iterator it = types.iterator();
	    while(it.hasNext()) {
	        Type t = (Type)it.next();
	        if (t instanceof SimpleType) {
	            if (isSuperTypeOfOthers((SimpleType)t)) return (SimpleType)t;
	        }
	        else {
	            if (isSuperTypeOfOthers(((UnionType)t).transformAsSimpleType())) return ((UnionType)t).transformAsSimpleType();
	        }
	    }
	    return result;
	}
	
	public FType getFType() {
		return transformAsSimpleType().getFType();
	}
	
	private boolean isSuperTypeOfOthers(SimpleType sup) {
	    boolean result = true;
	    Iterator it = types.iterator();
	    while(it.hasNext()) {
	        Type t = (Type)it.next();
	        if (t instanceof SimpleType) {
	            result = TypeConformanceChecker.conforms(sup.type, ((SimpleType)t).type);
	        }
	        else {
	            result = TypeConformanceChecker.conforms(sup.type, ((UnionType)t).transformAsSimpleType().type);
	        }
	        if (!result) break;
	    }
	    return result;
	}
	
	public String toString() {
		String result = "Union( ";
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			result += t.toString();
			if (i != types.size()-1) result += ", ";
		}
		result += " )";
		return result;
	}
}
