/* $Id: InheritanceSearch.java,v 1.8 2006-03-03 15:22:18 dvojtise Exp $
* Project : Kermeta (First iteration)
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
		Iterator it = ((ClassDefinition) c.getTypeDefinition()).getSuperType().iterator();
		while(it.hasNext()) {
			// get the super type
			fr.irisa.triskell.kermeta.language.structure.Class direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
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
	    
	    Iterator it = ((ClassDefinition) c.getTypeDefinition()).getSuperType().iterator();
	    while(it.hasNext()) {
			// get the super type
	    	fr.irisa.triskell.kermeta.language.structure.Class direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
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
		ArrayList allTypes = allSuperTypes(c);
		ArrayList result = new ArrayList();
		Hashtable found_ops = new Hashtable();
		
		ArrayList toVisit = new ArrayList();
		toVisit.add(c);
		
		
		while(!toVisit.isEmpty()) {
			fr.irisa.triskell.kermeta.language.structure.Class current = (fr.irisa.triskell.kermeta.language.structure.Class)toVisit.get(0);
		    toVisit.remove(0);
		    Iterator it = getDirectSuperTypes(current).iterator();
		    while(it.hasNext()) {
		    	fr.irisa.triskell.kermeta.language.structure.Class stype = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
		        if (!toVisit.contains(stype)) toVisit.add(stype);
		    }
		    
		    Iterator ops = ((ClassDefinition) current.getTypeDefinition()).getOwnedOperation().iterator();
			// Add all operations
			while (ops.hasNext()) {
				Operation op = (Operation)ops.next();
				if (!found_ops.containsKey(op.getName())) {
				    found_ops.put(op.getName(),op);
				    result.add(new CallableOperation(op,current));
				}
			}
		    
		}
		
		return result;
	}
	
	
	public static CallableOperation getSuperOperation(fr.irisa.triskell.kermeta.language.structure.Class c, Operation method) {
	    
		ArrayList allTypes = allSuperTypes(c);
		ArrayList result = new ArrayList();
		Hashtable found_ops = new Hashtable();
		
		ArrayList toVisit = new ArrayList();
		toVisit.add(c);
		
		
		while(!toVisit.isEmpty()) {
			fr.irisa.triskell.kermeta.language.structure.Class current = (fr.irisa.triskell.kermeta.language.structure.Class)toVisit.get(0);
		    toVisit.remove(0);
		    Iterator it = getDirectSuperTypes(current).iterator();
		    while(it.hasNext()) {
		    	fr.irisa.triskell.kermeta.language.structure.Class stype = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
		        if (!toVisit.contains(stype)) toVisit.add(stype);
		    }
		    
		    Iterator ops = ((ClassDefinition) current.getTypeDefinition()).getOwnedOperation().iterator();
			// Add all operations
			while (ops.hasNext()) {
				Operation op = (Operation)ops.next();
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
	    Iterator it = cdef.getTypeParameter().iterator();
	    while(it.hasNext()) {
	        TypeVariable tv = (TypeVariable)it.next();
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
		
		Iterator it = allTypes.iterator();
		while (it.hasNext()) {
			fr.irisa.triskell.kermeta.language.structure.Class fclass = (fr.irisa.triskell.kermeta.language.structure.Class)it.next();
			Iterator ops = ((ClassDefinition) fclass.getTypeDefinition()).getOwnedAttribute().iterator();
			// Add all operations
			while (ops.hasNext()) {
				Property prop = (Property)ops.next();
				if (!found_properties.containsKey(prop)) {
					found_properties.put(prop, prop);
					result.add(new CallableProperty(prop,fclass));
				}
			}
		}
		return result;
	}

}
