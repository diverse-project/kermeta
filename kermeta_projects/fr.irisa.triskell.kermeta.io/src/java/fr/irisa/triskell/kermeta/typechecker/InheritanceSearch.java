/* $Id: InheritanceSearch.java,v 1.22 2007-10-23 11:31:11 dvojtise Exp $
* Project : Kermeta 0.3.0
* File : InheritanceSearchUtilities.java
* License : EPL
* Copyright : IRISA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2005
* Author : Franck Fleurey
* Description :
*   Some utilities to collect inherited features
*/ 
package fr.irisa.triskell.kermeta.typechecker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import org.kermeta.io.plugin.IOPlugin;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;
import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.modelhelper.OperationHelper;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionHelper;

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
	public static ArrayList<Type> allSuperTypes(fr.irisa.triskell.kermeta.language.structure.Class c) {
		ArrayList<Type> result = new ArrayList<Type>();
		result.add(c);
		try  {
		// get all super types of direct supertypes
		for (Object super_type : ((ClassDefinition) c.getTypeDefinition()).getSuperType()) {
			// get the super type
			fr.irisa.triskell.kermeta.language.structure.Class direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)super_type;
			// propagate type variables
			direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
			ArrayList<Type> sts = allSuperTypes(direct_st);
			for(int i=0; i<sts.size(); i++) {
				if (!result.contains(sts.get(i))) result.add(sts.get(i));
			}
		}
		// Add the type object which is implicitly a super type of every type
		fr.irisa.triskell.kermeta.language.structure.Class object = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ObjectType).type;
		if (! TypeEqualityChecker.equals(c, object) && !result.contains(object)) {
		    result.add(object);
		}} catch (Exception e) {
			IOPlugin.internalLog.warn("Exception received",e);
		}
		return result;
	}
	
	/**
	 * Returns the direct super types of a class.
	 * Including the Object type which is implicitly a direct supertype of every class.
	 * @param c
	 * @return
	 */
	public static ArrayList<Type> getDirectSuperTypes(fr.irisa.triskell.kermeta.language.structure.Class c) {
		//fr.irisa.triskell.kermeta.language.structure.Class object = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ObjectType).type;
	    ArrayList<Type> result = new ArrayList<Type>();
	    // The class Object is the Root Class
	   // if (TypeEqualityChecker.equals(c, object)) return result;
	    
	    for (Object super_type : ((ClassDefinition) c.getTypeDefinition()).getSuperType()) {
			// get the super type
	    	fr.irisa.triskell.kermeta.language.structure.Class direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)super_type;
			// propagate type variables
			direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
			result.add(direct_st);
	    }
	    
	    // Add the type object which is implicitly a super type of every type
		/*if (!result.contains(object)) {
		    result.add(object);
		}*/
	    return result;
	}
	
	
	/**
	 * Get the Callable operations on class c
	 * @param c
	 * @return
	 */	
	public static ArrayList<CallableOperation> callableOperations(Class c) {
		ArrayList<CallableOperation> result = new ArrayList<CallableOperation>();
		Hashtable<String, CallableOperation> found_ops = new Hashtable<String, CallableOperation>();
		ArrayList<Class> toVisit = new ArrayList<Class>();
		List<ClassDefinition> classDefinitionProcessed = new ArrayList<ClassDefinition> ();
		toVisit.add(c);

		while( ! toVisit.isEmpty() ) {

			Class current = toVisit.get(0);
			toVisit.remove(0);
			KermetaUnitHelper.getKermetaUnitFromObject( current.getTypeDefinition() );
			/*
			 * 
			 * Patch for bugs #1124
			 * When redifining operations from Object class definition, the wrong one is called when interpreting.
			 * Just make sure that the Object class definition is processed the last.
			 * 
			 */
			if ( NamedElementHelper.getQualifiedName(current.getTypeDefinition()).equals("kermeta::language::structure::Object") && toVisit.size() >= 1 )
				toVisit.add(current);
			else {
				if ( ! classDefinitionProcessed.contains(current.getTypeDefinition()) ) {
					classDefinitionProcessed.add( (ClassDefinition) current.getTypeDefinition() );
			 				
					// Add all operations of current parsed class
					for (Object next_op : ((ClassDefinition) current.getTypeDefinition()).getOwnedOperation()) {
						Operation op = (Operation)next_op;
			    	
						if ( ! found_ops.containsKey(op.getName()) ) {
							CallableOperation callableOperation = new CallableOperation(op, current);
							found_ops.put(op.getName(), callableOperation);
							result.add( callableOperation );
						} else if (found_ops.get(op.getName()).getOperation() == op.getSuperOperation() ) {
							CallableOperation callableOperation = new CallableOperation(op, current);
							found_ops.put(op.getName(), callableOperation);
							CallableOperation currentCallableOperation = found_ops.get( op.getName() );
							result.remove( currentCallableOperation );
							result.add( callableOperation );
						} else {
								CallableOperation currentCallableOperation = found_ops.get( op.getName() );
				    		if ( currentCallableOperation.getOperation().isIsAbstract() /*|| OperationHelper.isOverloadable(currentCallableOperation.operation)*/ ) {
				    			CallableOperation callableOperation = new CallableOperation(op, current);
				    			found_ops.put(op.getName(), callableOperation);
				    			result.remove( currentCallableOperation );
					    		result.add( callableOperation );
					    	}
				    	
						}
					}
	
				    
				    // Get the direct super type of the current parsed class
				    for (Object next_t : getDirectSuperTypes(current)) {
				    	fr.irisa.triskell.kermeta.language.structure.Class stype = (fr.irisa.triskell.kermeta.language.structure.Class)next_t;
				        if ( ! toVisit.contains(stype) ) 
				        	toVisit.add(stype);
				    }
		
				    for ( TypeDefinition baseClass : current.getTypeDefinition().getBaseAspects() ) {
			    		if ( baseClass instanceof ClassDefinition ) {
			    			Class baseClassType = StructureFactory.eINSTANCE.createClass();
			    			baseClassType.setTypeDefinition( (ClassDefinition) baseClass );
			    			toVisit.add(baseClassType);
			    		}
			    	}
			    
					for ( TypeDefinition aspectClass : TypeDefinitionHelper.getAspects( (ClassDefinition) current.getTypeDefinition()) ) {
						if ( aspectClass instanceof ClassDefinition ) {
							Class aspectClassType = StructureFactory.eINSTANCE.createClass();
							aspectClassType.setTypeDefinition( (ClassDefinition) aspectClass );
			    			toVisit.add(aspectClassType);
						}
					}
				}
			}		    

		}
		
		// TODO And only finally, handle the object kind -> consequently, remove
		// from getDirectSuperTypes() the code that adds object to the list of direct super types.
		// Implies to change all the methods of getDirectSuperTypes.
		
		
		return result;
	}

	
	/**
	 * @param ft
	 * @return
	 */
	public static ArrayList<CallableOperation> callableOperations(fr.irisa.triskell.kermeta.language.structure.FunctionType ft) {
		ArrayList<CallableOperation> result = new ArrayList<CallableOperation>();
		
		// Add all operations defined by class Object
		fr.irisa.triskell.kermeta.language.structure.Class objectClass = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)TypeCheckerContext.ObjectType).type;
	    for (Object next_op : ((ClassDefinition) objectClass.getTypeDefinition()).getOwnedOperation()) {
	    	Operation op = (Operation) next_op;
    		result.add(new CallableOperation(op, objectClass));
	    }

		return result;
	}
	
	
	public static CallableOperation getSuperOperation(fr.irisa.triskell.kermeta.language.structure.Class c, Operation method) {		
		ArrayList<fr.irisa.triskell.kermeta.language.structure.Class> toVisit = new ArrayList<fr.irisa.triskell.kermeta.language.structure.Class>();
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
	public static ArrayList<CallableProperty> callableProperties(fr.irisa.triskell.kermeta.language.structure.Class c) {
	    ArrayList<Type> allTypes = allSuperTypes(c);
		ArrayList<CallableProperty> result = new ArrayList<CallableProperty>();
		Hashtable<Property, Property> found_properties = new Hashtable<Property, Property>();
		
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
