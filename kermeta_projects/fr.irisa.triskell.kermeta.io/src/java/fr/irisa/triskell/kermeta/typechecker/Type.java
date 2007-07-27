/* $Id: Type.java,v 1.6 2007-07-27 07:12:17 ftanguy Exp $
* Project : Kermeta io
* File : Type.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 10 avr. 2005
* Author : Franck Fleurey
* Description :
*  This is the implementation of Type for the type checker.
*  This class defines the sub-typing relationship
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Hashtable;

//import fr.irisa.triskell.kermeta.language.structure.FType;

/**
 * @author Franck Fleurey
 * This is the implementation of Type for the type checker.
*  This class defines the sub-typing relationship
 */
public abstract class Type {
	
	/**
	 * Constructor
	 */
	public Type() {
		super();
	}
	
	/**
	 * Implementation of the sub-typing relationship
	 * Returns true if this type is a sub-type of type
	 */
	public abstract boolean isSubTypeOf(Type type);
	
	/**
	 * Return an fr.irisa.triskell.kermeta.language.structure.Type : the corresponding FType if this is a
	 * simple type and the most derived ftype as possible if it is a 
	 * union type
	 */
	public abstract fr.irisa.triskell.kermeta.language.structure.Type getFType();
	
	/**
	 * Return the Left type of this Type if it is a function type.
	 * Return VoidType otherwise
	 * @return
	 */
	public abstract Type getFunctionTypeLeft();
	
	/**
	 * Return the Right type of this type if it is a function type
	 * Return this Type otherwise
	 * @return
	 */
	public abstract Type getFunctionTypeRight();
	
	/**
	 * Get the corresponding product type.
	 * The Type should contain a product type otherwise a product type
	 * with only one type is returned
	 * @return
	 */
	public abstract Type[] getProductType();
	
	/**
	 * returns a list of CallableProperty that corresponds to the properties that can be
	 * called on this type
	 * @return
	 */
	public abstract ArrayList callableProperties();
	
	/**
	 * returns a list of CallableOperation that corresponds to the operations that can be
	 * called on this type
	 * @return
	 */
	public abstract ArrayList callableOperations();
	
	/**
	 * inferTypeVariableBinding
	 * @param generic
	 * @return
	 */
	public abstract Hashtable inferTypeVariableBinding(Type generic);
	
	/**
	 * inferTypeVariableBinding
	 * @param generic
	 * @param binding
	 */
	protected abstract void inferTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.Type generic, Hashtable binding);
	
	/**
	 * Get a callable operation by its name.
	 * return null if no operation matche the given name
	 * @param name
	 * @param unit
	 * @return
	 */
	public CallableOperation getOperationByName(String name) {
		ArrayList ops = callableOperations();
		if (ops == null) return null;
		java.util.Iterator it = ops.iterator();
		while(it.hasNext()) {
		    CallableOperation op = (CallableOperation)it.next();
			if (op.operation.getName().equals(name)) return op;
		}
		return null;
	}
	
	/**
	 * Get a callable property by its name.
	 * return null if no property matche the given name
	 * @param name
	 * @param unit
	 * @return
	 */
	public CallableProperty getPropertyByName(String name) {
		ArrayList props = callableProperties();
		if (props == null) return null;
		java.util.Iterator it = props.iterator();
		while(it.hasNext()) {
		    CallableProperty prop = (CallableProperty)it.next();
			if (prop.property.getName().equals(name)) 
				return prop;
		}
		return null;
	}
	

}
