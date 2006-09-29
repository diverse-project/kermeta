/* $Id: InheritanceSearch.java,v 1.10 2006-09-29 13:29:04 zdrey Exp $
* Project : Kermeta 0.3.0
* File : InheritanceSearchUtilities.java
* License : GPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2005
* Author : Franck Fleurey
* Description :
*   Some utilities to collect inherited features
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the GPL license
 */
public class InheritanceSearch {

	
	/**
	 * Returns all the conformant types for the class c (including c itself)
	 * @param c
	 * @return
	 */
	public static ArrayList allSuperTypes(fr.irisa.triskell.kermeta.language.structure.Class c) {
		ArrayList result = new ArrayList();
		result.add(c);
		// get all super types of direct supertypes
		for (Object super_type : ((ClassDefinition) c.getTypeDefinition()).getSuperType()) {
			// get the super type
			fr.irisa.triskell.kermeta.language.structure.Class direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)super_type;
			// propagate type variables
			direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
			ArrayList sts = allSuperTypes(direct_st);
			for(int i=0; i<sts.size(); i++) {
				if (!result.contains(sts.get(i))) result.add(sts.get(i));
			}
		}
		// Add the type object which is implicitly a super type of every type
		fr.irisa.triskell.kermeta.language.structure.Class object = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ObjectType).type;
		if (! TypeEqualityChecker.equals(c, object) && !result.contains(object)) {
		    result.add(object);
		}
		return result;
	}
	
	/**
	 * Returns the direct super types of a class.
	 * Including the Object type which is implicitly a direct supertype of every class.
	 * @param c
	 * @return
	 */
	public static ArrayList getDirectSuperTypes(fr.irisa.triskell.kermeta.language.structure.Class c) {
	    
		fr.irisa.triskell.kermeta.language.structure.Class object = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ObjectType).type;
	    ArrayList result = new ArrayList();
	    // The class Object is the Root Class
	    if (TypeEqualityChecker.equals(c, object)) return result;
	    
	    for (Object super_type : ((ClassDefinition) c.getTypeDefinition()).getSuperType()) {
			// get the super type
	    	fr.irisa.triskell.kermeta.language.structure.Class direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)super_type;
			// propagate type variables
			direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
			result.add(direct_st);
	    }
	    
	    // Add the type object which is implicitly a super type of every type
		if (!result.contains(object)) {
		    result.add(object);
		}
	    return result;
	}
	
	
	/**
	 * Get the Callable operations on class c
	 * @param c
	 * @return
	 */	
	public static ArrayList callableOperations(fr.irisa.triskell.kermeta.language.structure.Class c) {
		ArrayList result = new ArrayList();
		Hashtable found_ops = new Hashtable();
		ArrayList toVisit = new ArrayList();
		toVisit.add(c);
		
		while(!toVisit.isEmpty()) {
			fr.irisa.triskell.kermeta.language.structure.Class current = (fr.irisa.triskell.kermeta.language.structure.Class)toVisit.get(0);
		    toVisit.remove(0);
		    // Get the direct super type of the current parsed class
		    for (Object next_t : getDirectSuperTypes(current)) {
		    	fr.irisa.triskell.kermeta.language.structure.Class stype = (fr.irisa.triskell.kermeta.language.structure.Class)next_t;
		        if (!toVisit.contains(stype)) toVisit.add(stype);
		    }
		    // Add all operations of current parsed class
		    for (Object next_op : ((ClassDefinition) current.getTypeDefinition()).getOwnedOperation()) {
		    	Operation op = (Operation)next_op;
		    	if (!found_ops.containsKey(op.getName())) {
		    		found_ops.put(op.getName(),op);
		    		result.add(new CallableOperation(op,current));
		    	}
		    }
		}
		// TODO And only finally, handle the object kind -> consequently, remove
		// from getDirectSuperTypes() the code that adds object to the list of direct super types.
		// Implies to change all the methods of getDirectSuperTypes.
		
		
		return result;
	}
	
	
	public static CallableOperation getSuperOperation(fr.irisa.triskell.kermeta.language.structure.Class c, Operation method) {		
		ArrayList toVisit = new ArrayList();
		toVisit.add(c);
		
		while(!toVisit.isEmpty()) {
			fr.irisa.triskell.kermeta.language.structure.Class current = (fr.irisa.triskell.kermeta.language.structure.Class)toVisit.get(0);
		    toVisit.remove(0);
		    for (Object next : getDirectSuperTypes(current)) {
		    	fr.irisa.triskell.kermeta.language.structure.Class stype = (fr.irisa.triskell.kermeta.language.structure.Class)next;
		        if (!toVisit.contains(stype)) toVisit.add(stype);
		    }
		    
			// Add all operations
			for (Object next : ((ClassDefinition) current.getTypeDefinition()).getOwnedOperation()) {
				Operation op = (Operation)next;
				if (method.getSuperOperation() == op) {
				    return new CallableOperation(op,current);
				}
			}
		    
		}
		
		return null;
	}
	
	/**
	 * Get a Parametized class from a class definition. 
	 * Type parameter are bound with type variables.
	 * @param cdef
	 * @return
	 */
	public static fr.irisa.triskell.kermeta.language.structure.Class getFClassForClassDefinition(ClassDefinition cdef) {
	    StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
	    fr.irisa.triskell.kermeta.language.structure.Class fclass = struct_factory.createClass();
	    fclass.setTypeDefinition(cdef);
	    for (Object next : cdef.getTypeParameter()) {
	        TypeVariable tv = (TypeVariable)next;
	        TypeVariableBinding binding = struct_factory.createTypeVariableBinding();
	        binding.setType(tv);
	        binding.setVariable(tv);
	        fclass.getTypeParamBinding().add(binding);
	    }
	    return fclass;
	}
	
	
	/**
	 * Get the callable Properties on class c
	 * @param c
	 * @return
	 */
	public static ArrayList callableProperties(fr.irisa.triskell.kermeta.language.structure.Class c) {
	    ArrayList allTypes = allSuperTypes(c);
		ArrayList result = new ArrayList();
		Hashtable found_properties = new Hashtable();
		
		for (Object next_t : allTypes) {
			fr.irisa.triskell.kermeta.language.structure.Class fclass = (fr.irisa.triskell.kermeta.language.structure.Class)next_t;
			// Add all properties
			for (Object next_at : ((ClassDefinition) fclass.getTypeDefinition()).getOwnedAttribute()) {
				Property prop = (Property)next_at;
				if (!found_properties.containsKey(prop)) {
					found_properties.put(prop, prop);
					result.add(new CallableProperty(prop,fclass));
				}
			}
		}
		return result;
	}

}
