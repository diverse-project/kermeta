/* $Id: UnionType.java,v 1.10 2008-04-28 11:50:10 ftanguy Exp $
* Project : Kermeta (First iteration)
* File : UnionType.java
* License : EPL
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
import java.util.List;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

//import fr.irisa.triskell.kermeta.language.structure.FType;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class UnionType extends Type {

	/**
	 * A set of Type
	 */
	protected ArrayList<Type> types;
	
	
	/**
	 * Constructor
	 */
	public UnionType() {
		super();
		types = new ArrayList<Type>();
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
		return types.get(index);
	}

	/**
	 * @see fr.irisa.triskell.kermeta.typechecker.Type#isSubTypeOf(fr.irisa.triskell.kermeta.language.structure.FType)
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
	public List<CallableProperty> callableProperties() {
		List<CallableProperty> result = null;
		for ( Type t : types ) {
			if (result == null) 
				result = t.callableProperties();
			else 
				result = inter(result, t.callableProperties());
		}
		return result;
	}

	/**
	 * @see fr.irisa.triskell.kermeta.typechecker.Type#callableOperations()
	 */
	public List<CallableOperation> callableOperations(KermetaUnit source) {
		List<CallableOperation> result = null;
		// Get intersection of valid operation
		for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			if (result == null) 
				result = t.callableOperations(source);
			else 
				result = inter(result, t.callableOperations(source));
		}
		return result;
	}
	
	/**
	 * Intersection between two ArrayList
	 * @param <T>
	 * @param l1
	 * @param l2
	 * @return
	 */
	protected <T> List<T> inter(List<T> l1, List<T> l2) {
		ArrayList<T> result = new ArrayList<T>();
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
	public Hashtable<TypeVariable, fr.irisa.triskell.kermeta.language.structure.Type> inferTypeVariableBinding(Type generic) {
	    if (!(generic instanceof SimpleType)) {
	        return null;
	    }
	    Hashtable<TypeVariable, fr.irisa.triskell.kermeta.language.structure.Type> result = 
	    	new Hashtable<TypeVariable, fr.irisa.triskell.kermeta.language.structure.Type>();
	    try {
	        this.inferTypeVariableBinding(((SimpleType)generic).type, result);
	    }
	    catch(TypeDoesNotMatchError e) {
	        result = null;
	    }
	    return result;
	}
	
	protected void inferTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.Type generic, 
			Hashtable<TypeVariable, fr.irisa.triskell.kermeta.language.structure.Type> binding) {
        for(int i=0; i<types.size();i++) {
			Type t = (Type)types.get(i);
			t.inferTypeVariableBinding(generic, binding);
        }

	}
	
	public SimpleType transformAsSimpleType() {
	    SimpleType result = (SimpleType)TypeCheckerContext.ObjectType;
	    
	    Iterator<Type> it = types.iterator(); 
	    while(it.hasNext()) {
	        Type t = it.next();
	        if (t instanceof SimpleType) {
	            if (isSuperTypeOfOthers((SimpleType)t)) return (SimpleType)t;
	        }
	        else {
	            if (isSuperTypeOfOthers(((UnionType)t).transformAsSimpleType())) return ((UnionType)t).transformAsSimpleType();
	        }
	    }
	    return result;
	}
	
	public fr.irisa.triskell.kermeta.language.structure.Type getFType() {
		return transformAsSimpleType().getFType();
	}
	
	private boolean isSuperTypeOfOthers(SimpleType sup) {
	    boolean result = true;
	    Iterator<Type> it = types.iterator();
	    while(it.hasNext()) {
	        Type t = it.next();
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
