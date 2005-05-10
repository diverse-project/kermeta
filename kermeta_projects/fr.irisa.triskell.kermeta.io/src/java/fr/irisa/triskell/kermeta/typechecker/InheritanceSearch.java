/* $Id: InheritanceSearch.java,v 1.5 2005-05-10 20:33:09 ffleurey Exp $
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

import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FOperation;
import fr.irisa.triskell.kermeta.structure.FProperty;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;
import fr.irisa.triskell.kermeta.structure.StructureFactory;
import fr.irisa.triskell.kermeta.structure.impl.StructurePackageImpl;

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
	public static ArrayList allSuperTypes(FClass c) {
		ArrayList result = new ArrayList();
		result.add(c);
		// get all super types of direct supertypes
		Iterator it = c.getFClassDefinition().getFSuperType().iterator();
		while(it.hasNext()) {
			// get the super type
			FClass direct_st = (FClass)it.next();
			// propagate type variables
			direct_st = (FClass)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
			ArrayList sts = allSuperTypes(direct_st);
			for(int i=0; i<sts.size(); i++) {
				if (!result.contains(sts.get(i))) result.add(sts.get(i));
			}
		}
		// Add the type object which is implicitly a super type of every type
		FClass object = (FClass)((SimpleType)TypeCheckerContext.ObjectType).type;
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
	public static ArrayList getDirectSuperTypes(FClass c) {
	    
	    FClass object = (FClass)((SimpleType)TypeCheckerContext.ObjectType).type;
	    ArrayList result = new ArrayList();
	    // The class Object is the Root Class
	    if (TypeEqualityChecker.equals(c, object)) return result;
	    
	    Iterator it = c.getFClassDefinition().getFSuperType().iterator();
	    while(it.hasNext()) {
			// get the super type
			FClass direct_st = (FClass)it.next();
			// propagate type variables
			direct_st = (FClass)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
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
	public static ArrayList callableOperations(FClass c) {
		ArrayList allTypes = allSuperTypes(c);
		ArrayList result = new ArrayList();
		Hashtable found_ops = new Hashtable();
		
		ArrayList toVisit = new ArrayList();
		toVisit.add(c);
		
		
		while(!toVisit.isEmpty()) {
		    FClass current = (FClass)toVisit.get(0);
		    toVisit.remove(0);
		    Iterator it = getDirectSuperTypes(current).iterator();
		    while(it.hasNext()) {
		        FClass stype = (FClass)it.next();
		        if (!toVisit.contains(stype)) toVisit.add(stype);
		    }
		    
		    Iterator ops = current.getFClassDefinition().getFOwnedOperation().iterator();
			// Add all operations
			while (ops.hasNext()) {
				FOperation op = (FOperation)ops.next();
				if (!found_ops.containsKey(op.getFName())) {
				    found_ops.put(op.getFName(),op);
				    result.add(new CallableOperation(op,current));
				}
			}
		    
		}
		
		return result;
	}
	
	/**
	 * Get a Parametized class from a class definition. 
	 * Type parameter are bound with type variables.
	 * @param cdef
	 * @return
	 */
	public static FClass getFClassForClassDefinition(FClassDefinition cdef) {
	    StructureFactory struct_factory = StructurePackageImpl.init().getStructureFactory();
	    FClass fclass = struct_factory.createFClass();
	    fclass.setFClassDefinition(cdef);
	    Iterator it = cdef.getFTypeParameter().iterator();
	    while(it.hasNext()) {
	        FTypeVariable tv = (FTypeVariable)it.next();
	        FTypeVariableBinding binding = struct_factory.createFTypeVariableBinding();
	        binding.setFType(tv);
	        binding.setFVariable(tv);
	        fclass.getFTypeParamBinding().add(binding);
	    }
	    return fclass;
	}
	
	
	/**
	 * Get the callable Properties on class c
	 * @param c
	 * @return
	 */
	public static ArrayList callableProperties(FClass c) {
	    ArrayList allTypes = allSuperTypes(c);
		ArrayList result = new ArrayList();
		Hashtable found_properties = new Hashtable();
		
		Iterator it = allTypes.iterator();
		while (it.hasNext()) {
			FClass fclass = (FClass)it.next();
			Iterator ops = fclass.getFClassDefinition().getFOwnedAttributes().iterator();
			// Add all operations
			while (ops.hasNext()) {
				FProperty prop = (FProperty)ops.next();
				if (!found_properties.containsKey(prop)) {
					found_properties.put(prop, prop);
					result.add(new CallableProperty(prop,fclass));
				}
			}
		}
		return result;
	}

}
