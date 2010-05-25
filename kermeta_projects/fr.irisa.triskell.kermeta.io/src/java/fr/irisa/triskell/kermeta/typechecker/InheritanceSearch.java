/* $Id: InheritanceSearch.java,v 1.33 2008-04-28 11:50:10 ftanguy Exp $
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
import java.util.Map;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.cache.utilities.KeyTuple;
import fr.irisa.triskell.cache.utilities.SoftReferenceMapCache;
import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.impl.StructurePackageImpl;
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionHelper;

/**
 * @author Franck Fleurey
 * IRISA / University of rennes 1
 * Distributed under the terms of the EPL license
 */
public class InheritanceSearch {

	
	/**
	 * Returns all the conformant types for the class c (including c itself)
	 * @param c
	 * @return
	 */
	public static List<Type> allSuperTypes(Class c, TypeCheckerContext context) {		
		List<Type> result;
		
		// is it in the cache
		KeyTuple<Class, TypeCheckerContext> cacheKey = new KeyTuple<Class, TypeCheckerContext>(c, context);
		result = allSuperTypesCache.get(cacheKey);
		if(result != null) 
			return result;
		
		// not in the cache, calculate it
		result = new ArrayList<Type>();
		result.add(c);
		// get all super types of direct supertypes (also look into aspects)
		Collection<TypeDefinition> typedefAspects = context.getTypeDefinitionContextCache().getTypeDefinitionContext(context.unit, c.getTypeDefinition());
		for(TypeDefinition td : typedefAspects){
			for (Object super_type : ((ClassDefinition) td).getSuperType()) {
				// get the super type
				Class direct_st = (Class)super_type;
				// propagate type variables
				direct_st = (Class)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
				List<Type> sts = allSuperTypes(direct_st, context);
				for ( int i=0; i<sts.size(); i++ ) {
					if ( ! result.contains(sts.get(i)) ) 
						result.add( sts.get(i) );
				}
			}
		}
		// Add the type object which is implicitly a super type of every type
		Class object = (Class)((SimpleType)context.ObjectType).type;
		if ( ! TypeEqualityChecker.equals(c, object) && ! result.contains(object) )
		    result.add(object);
		
		// push the result in cache for possible later use
		allSuperTypesCache.put(cacheKey, result);
		return result;
	}
	
	/** cache for optimizing call to allSuperTypes
	 * the GC may collect its content at any time
	 */
	protected static Map<KeyTuple<Class, TypeCheckerContext>, List<Type>> allSuperTypesCache = new SoftReferenceMapCache<KeyTuple<Class, TypeCheckerContext>, List<Type>>();
	
	
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
	    	
	    	if (super_type instanceof VirtualType){
	    		VirtualType vt = (VirtualType)super_type;
	    		for (Object virtualsuper_type : (vt.getClassDefinition()).getSuperType()) {
	    			fr.irisa.triskell.kermeta.language.structure.Type virtualdirect_st = (fr.irisa.triskell.kermeta.language.structure.Type)virtualsuper_type;
					// propagate type variables
	    			virtualdirect_st = (fr.irisa.triskell.kermeta.language.structure.Class)TypeVariableEnforcer.getBoundType(virtualdirect_st, TypeVariableEnforcer.getTypeVariableBinding(c));
					result.add(virtualdirect_st);
	    		}
	    		
	    	}
	    	else{
		    	fr.irisa.triskell.kermeta.language.structure.Type direct_st = (fr.irisa.triskell.kermeta.language.structure.Type)super_type;
				// propagate type variables
				direct_st = (fr.irisa.triskell.kermeta.language.structure.Class)TypeVariableEnforcer.getBoundType(direct_st, TypeVariableEnforcer.getTypeVariableBinding(c));
				result.add(direct_st);
	    	}
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
	public static ArrayList<CallableOperation> callableOperations(Class c, KermetaUnit source, TypeCheckerContext context) {
	//	List<KermetaUnit> units = new ArrayList<KermetaUnit>();
	//	if ( source != null ) {
	//		units.add(source);
	//		units.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(source) );
	//	}
		ArrayList<CallableOperation> result = new ArrayList<CallableOperation>();
		Hashtable<String, CallableOperation> found_ops = new Hashtable<String, CallableOperation>();
		ArrayList<Class> toVisit = new ArrayList<Class>();
		List<ClassDefinition> classDefinitionProcessed = new ArrayList<ClassDefinition> ();
		toVisit.add(c);

		while( ! toVisit.isEmpty() ) {

			Class current = toVisit.get(0);
			toVisit.remove(0);
	//		KermetaUnit u = KermetaUnitHelper.getKermetaUnitFromObject( current.getTypeDefinition() );
	//		if ( units.size() == 0 || units.contains(u) ) {
				
				if ( ! classDefinitionProcessed.contains(current.getTypeDefinition()) ) {
					classDefinitionProcessed.add( (ClassDefinition) current.getTypeDefinition() );
				 				
					// Add all operations of current parsed class
					for (Object next_op : ((ClassDefinition) current.getTypeDefinition()).getOwnedOperation()) {
						Operation op = (Operation)next_op;
				    	
						if ( ! found_ops.containsKey(op.getName()) ) {
							CallableOperation callableOperation = new CallableOperation(op, current, context);
							found_ops.put(op.getName(), callableOperation);
							result.add( callableOperation );
						} else if (found_ops.get(op.getName()).getOperation() == op.getSuperOperation() ) {
							CallableOperation callableOperation = new CallableOperation(op, current, context);
							found_ops.put(op.getName(), callableOperation);
							CallableOperation currentCallableOperation = found_ops.get( op.getName() );
							result.remove( currentCallableOperation );
							result.add( callableOperation );
						} else {
							CallableOperation currentCallableOperation = found_ops.get( op.getName() );
				    		if ( currentCallableOperation.getOperation().isIsAbstract() /*|| OperationHelper.isOverloadable(currentCallableOperation.operation)*/ ) {
				    			CallableOperation callableOperation = new CallableOperation(op, current, context);
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

				    
					for ( TypeDefinition aspectClass : TypeDefinitionHelper.getAllAspects(context.unit, KermetaModelHelper.ClassDefinition.qualifiedName((ClassDefinition) current.getTypeDefinition())) ) {
						if ( aspectClass instanceof ClassDefinition ) {
							Class aspectClassType = StructureFactory.eINSTANCE.createClass();
							aspectClassType.setTypeDefinition( (ClassDefinition) aspectClass );
							toVisit.add(aspectClassType);
						}
					}
				}
			}
	//	}

		return result;
	}

	
	/**
	 * @param ft
	 * @return
	 */
	public static ArrayList<CallableOperation> callableOperations(fr.irisa.triskell.kermeta.language.structure.FunctionType ft,
			TypeCheckerContext context) {
		ArrayList<CallableOperation> result = new ArrayList<CallableOperation>();
		
		// Add all operations defined by class Object
		fr.irisa.triskell.kermeta.language.structure.Class objectClass = (fr.irisa.triskell.kermeta.language.structure.Class)((SimpleType)context.ObjectType).type;
	    for (Object next_op : ((ClassDefinition) objectClass.getTypeDefinition()).getOwnedOperation()) {
	    	Operation op = (Operation) next_op;
    		result.add(new CallableOperation(op, objectClass, context));
	    }

		return result;
	}
	
	
	public static CallableOperation getSuperOperation( fr.irisa.triskell.kermeta.language.structure.Class c, Operation method,
			TypeCheckerContext context) {		
		ArrayList<fr.irisa.triskell.kermeta.language.structure.Class> toVisit = new ArrayList<fr.irisa.triskell.kermeta.language.structure.Class>();
		toVisit.add(c);
		List<ClassDefinition> classDefinitionProcessed = new ArrayList<ClassDefinition> ();

		while(!toVisit.isEmpty()) {
			fr.irisa.triskell.kermeta.language.structure.Class current = (fr.irisa.triskell.kermeta.language.structure.Class)toVisit.get(0);
		    toVisit.remove(0);
		   
		    if ( ! classDefinitionProcessed.contains(current.getTypeDefinition()) ) {
		    	classDefinitionProcessed.add( (ClassDefinition) current.getTypeDefinition() );
				// Add all operations
				for (Object next : ((ClassDefinition) current.getTypeDefinition()).getOwnedOperation()) {
					Operation op = (Operation)next;
					if (method.getSuperOperation() == op) {
					    return new CallableOperation(op,current, context);
					}
				}
	
			    // Get the direct super type of the current parsed class
			    for (Object next_t : getDirectSuperTypes(current)) {
			    	fr.irisa.triskell.kermeta.language.structure.Class stype = (fr.irisa.triskell.kermeta.language.structure.Class)next_t;
			        if ( ! toVisit.contains(stype) ) 
			        	toVisit.add(stype);
			    }
		
					    
				for ( TypeDefinition aspectClass : TypeDefinitionHelper.getAllAspects(context.unit, KermetaModelHelper.ClassDefinition.qualifiedName((ClassDefinition) current.getTypeDefinition()) )) {
					if ( aspectClass instanceof ClassDefinition ) {
						Class aspectClassType = StructureFactory.eINSTANCE.createClass();
						aspectClassType.setTypeDefinition( (ClassDefinition) aspectClass );
						toVisit.add(aspectClassType);
					}
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
	public static ArrayList<CallableProperty> callableProperties(fr.irisa.triskell.kermeta.language.structure.Class c, 
			TypeCheckerContext context) {
		ArrayList<CallableProperty> result = new ArrayList<CallableProperty>();
		Hashtable<String, CallableProperty> found_poperties = new Hashtable<String, CallableProperty>();
		ArrayList<Class> toVisit = new ArrayList<Class>();
		List<ClassDefinition> classDefinitionProcessed = new ArrayList<ClassDefinition> ();
		toVisit.add(c);

		while( ! toVisit.isEmpty() ) {

			Class current = toVisit.get(0);
			toVisit.remove(0);
			//KermetaUnitHelper.getKermetaUnitFromObject( current.getTypeDefinition() );

			if ( ! classDefinitionProcessed.contains(current.getTypeDefinition()) ) {
				classDefinitionProcessed.add( (ClassDefinition) current.getTypeDefinition() );
		 				
				// Add all operations of current parsed class
				for (Object next_prop : ((ClassDefinition) current.getTypeDefinition()).getOwnedAttribute()) {
					Property property = (Property)next_prop;
			    	
					if ( ! found_poperties.containsKey(property.getName()) ) {
						CallableProperty callableProperty = new CallableProperty(property, current, context);
						found_poperties.put(property.getName(), callableProperty);
						result.add( callableProperty );				    	
					}
				}
	
				    
				// Get the direct super type of the current parsed class
				for (Object next_t : getDirectSuperTypes(current)) {
				 	fr.irisa.triskell.kermeta.language.structure.Class stype = (fr.irisa.triskell.kermeta.language.structure.Class)next_t;
				    if ( ! toVisit.contains(stype) ) 
				    	toVisit.add(stype);
				}
		
				
			    
				for ( TypeDefinition aspectClass : TypeDefinitionHelper.getAllAspects(context.unit, KermetaModelHelper.ClassDefinition.qualifiedName((ClassDefinition) current.getTypeDefinition())) ) {
					if ( aspectClass instanceof ClassDefinition ) {
						Class aspectClassType = StructureFactory.eINSTANCE.createClass();
						aspectClassType.setTypeDefinition( (ClassDefinition) aspectClass );
			    		toVisit.add(aspectClassType);
					}
				}
			}
		}		    
 		return result;
	}

}
