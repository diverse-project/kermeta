/* $Id: Type.java,v 1.10 2008-03-05 08:18:10 ftanguy Exp $
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

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

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
	public abstract List<CallableProperty> callableProperties();
	
	/**
	 * returns a list of CallableOperation that corresponds to the operations that can be
	 * called on this type
	 * @return
	 */
	public abstract List<CallableOperation> callableOperations(KermetaUnit source);
	
	/**
	 * inferTypeVariableBinding
	 * @param generic
	 * @return
	 */
	public abstract Hashtable<TypeVariable, fr.irisa.triskell.kermeta.language.structure.Type> inferTypeVariableBinding(Type generic);
	
	/**
	 * inferTypeVariableBinding
	 * @param generic
	 * @param binding
	 */
	protected abstract void inferTypeVariableBinding(fr.irisa.triskell.kermeta.language.structure.Type generic, 
													Hashtable<TypeVariable, fr.irisa.triskell.kermeta.language.structure.Type> binding);
	
	/**
	 * Get a callable operation by its name.
	 * return null if no operation matche the given name
	 * @param name
	 * @param unit
	 * @return
	 */
	public CallableOperation getOperationByName(String name, KermetaUnit source) {
		Collection<CallableOperation> ops = callableOperations(source);
		if (ops == null) 
			return null;
		for ( CallableOperation op : ops )
			if (op.operation.getName().equals(name)) 
				return op;
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
		Collection<CallableProperty> props = callableProperties();
		if (props == null) 
			return null;
		for ( CallableProperty prop : props )
			if (prop.property.getName().equals(name)) 
				return prop;
		return null;
	}
	

}
