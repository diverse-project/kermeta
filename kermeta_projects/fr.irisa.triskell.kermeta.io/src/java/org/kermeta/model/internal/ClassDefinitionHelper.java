

/*$Id: ClassDefinitionHelper.java,v 1.13 2008-07-17 16:10:42 dvojtise Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	ClassDefinitionHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;

public class ClassDefinitionHelper {
	
	static public ClassDefinition create(String name) {
		return create(name, false);
	}
	
	static public ClassDefinition create(String name, boolean isAbstract) {
		return create(name, isAbstract, false);
	}
	
	static public ClassDefinition create(String name, boolean isAbstract, boolean isAspect) {
		ClassDefinition c = StructureFactory.eINSTANCE.createClassDefinition();
		c.setName( name );
		c.setIsAbstract( isAbstract );
		c.setIsAspect( isAspect );
		return c;
	}
	
	/**
	 * Look into the super types of the base class definition if an operation matches with the given name.
	 * @param base
	 * @param operationName
	 * @return
	 */
	static public List<Operation> getSuperOperations(ClassDefinition base, String operationName) {
		TreeMap<Integer, List<TypeDefinition>> l = _getContext(base);
		/*
		 * 
		 * Getting the class definition to remove. We do not want the base class and its aspects.
		 * 
		 */
	/*	String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(base);
		List<ClassDefinition> classDefinitionToRemove = new ArrayList<ClassDefinition>();
		for ( TypeDefinition td : l.() ) {
			if ( td instanceof ClassDefinition) {
				ClassDefinition cd = (ClassDefinition) td;
				if ( KermetaModelHelper.NamedElement.qualifiedName(cd).equals(qualifiedName) )
					classDefinitionToRemove.add(cd);
			}
		}*/
		/*
		 * 
		 * Removing the extra class definitions.
		 * 
		 */
/*		for ( ClassDefinition cd : classDefinitionToRemove )
			l.remove(cd);*/
		
		l.remove(0);
				
		TreeMap<Integer, List<Operation>> result = new TreeMap<Integer, List<Operation>>();
		for (Entry<Integer, List<TypeDefinition>> entry : l.entrySet()) {
			for (TypeDefinition td : entry.getValue() ) {
				if ( td instanceof ClassDefinition ) {
					ClassDefinition cd = (ClassDefinition) td;
					for ( Operation operation : cd.getOwnedOperation() )
						if ( operation.getName().equals(operationName) ) {
							List<Operation> operations = result.get( entry.getKey() );
							if ( operations == null ) {
								operations = new ArrayList<Operation>();
								result.put( entry.getKey(), operations );
							}
							operations.add( operation );
						}
				}
			}
		}
		
		
		/*for ( Entry<TypeDefinition, Integer> entry : l.entrySet() ) {
			if ( entry.getKey() instanceof ClassDefinition ) {
				ClassDefinition cd = (ClassDefinition) entry.getKey();
				for ( Operation operation : cd.getOwnedOperation() )
					if ( operation.getName().equals(operationName) ) {
						List<Operation> operations = result.get( entry.getValue() );
						if ( operations == null ) {
							operations = new ArrayList<Operation>();
							result.put( entry.getValue(), operations );
						}
						operations.add( operation );
					}
			}
		}*/
		
		if ( result.size() == 0 || result.get(result.firstKey()) == null )
			return new ArrayList<Operation>();
		return result.get(result.firstKey());
	}
	
	static private TreeMap<Integer, List<TypeDefinition>> _getContext(ClassDefinition c) {
		TreeMap<Integer, List<TypeDefinition>> result = new TreeMap<Integer, List<TypeDefinition>>();
		List<KermetaUnit> units = new ArrayList<KermetaUnit>();
		KermetaUnit initialUnit = KermetaUnitHelper.getKermetaUnitFromObject(c);
		units.add(initialUnit);
		units.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(initialUnit) );
		getContext(units, c, result, 0);
		return result;
	}
	
	/**
	 * Return all the classes related to this one :
	 * This includes the aspects and the inherited class definition
	 * @param c
	 * @return
	 */
	static public List<TypeDefinition> getContext(ClassDefinition c) {
		List<TypeDefinition> result = new ArrayList<TypeDefinition>();
		TreeMap<Integer, List<TypeDefinition>> context = _getContext(c);
		for (Entry<Integer, List<TypeDefinition>> e : context.entrySet())
			result.addAll(e.getValue());
		return result;
	}
	
	static public List<TypeDefinition> getFullContext(ClassDefinition c) {
		List<TypeDefinition> result = new ArrayList<TypeDefinition>();
		TreeMap<Integer, List<TypeDefinition>> context = _getFullContext(c);
		for (Entry<Integer, List<TypeDefinition>> e : context.entrySet())
			result.addAll(e.getValue());
		return result;
	}
	
	static private TreeMap<Integer, List<TypeDefinition>> _getFullContext(ClassDefinition c) {
		TreeMap<Integer, List<TypeDefinition>> result = new TreeMap<Integer, List<TypeDefinition>>();
		getFullContext(c, result, 0);
		return result;
	}
	
	static private void getFullContext(ClassDefinition current, TreeMap<Integer, List<TypeDefinition>> map, int deep) {
		for ( List<TypeDefinition> l : map.values() )
			if ( l.contains(current) )
				return;
		
		List<TypeDefinition> l = map.get(deep);
		if ( l == null ) {
			l = new ArrayList<TypeDefinition>();
			map.put(deep, l);
		}
		l.add(current);
		
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(current);
		/*
		 * 
		 * Supertypes
		 * 
		 */
		for ( Type supertype : current.getSuperType() ) {
			if ( supertype instanceof Class ) {
				Class superclass = (Class) supertype;
				getFullContext( (ClassDefinition) superclass.getTypeDefinition(), map, deep+1);
			}
		}
			
		/*
		 * 
		 * Aspects
		 * 
		 */
		if(unit == null){
			System.out.println("uh oh ..");
			KermetaUnitHelper.getKermetaUnitFromObject(current);
		}
		if ( unit.getAspects() != null && unit.getAspects().get(current) != null ) {
			for ( TypeDefinition aspect : unit.getAspects().get(current) )  {
				if ( aspect instanceof ClassDefinition )
					getFullContext( (ClassDefinition) aspect, map, deep );
			}
		}
		
		/*
		 * 
		 * Base Classes
		 *  
		 */
		if ( unit.getBaseAspects() != null && unit.getBaseAspects().get(current) != null ) {
			for ( TypeDefinition base : unit.getBaseAspects().get(current) )  {
				if ( base instanceof ClassDefinition )
					getFullContext( (ClassDefinition) base, map, deep );
			}
		}
	}	
	
	static private void getContext(List<KermetaUnit> units, ClassDefinition current, TreeMap<Integer, List<TypeDefinition>> map, int deep) {
		for ( List<TypeDefinition> l : map.values() )
			if ( l.contains(current))
				return;/* // several definition of the same class will have to stop the recursion*/
			/*	if(map.get(deep) != null)
					if (! map.get(deep).contains(current) )
						// ignore several definition at the same inheritance depth (may be due to aspects)
						return;
					else {
						// several definitions of the same class at various inheritance depth. Stop the recursion but add the classdef to the list
						map.get(deep).add(current); 
						return;
					}
				else {
					// several definitions of the same class at various inheritance depth. Stop the recursion but add the classdef to the list
					List<TypeDefinition> list2 = new ArrayList<TypeDefinition>();
					map.put(deep, list2);
				
					list2.add(current);
					return;
				}	
		*/
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(current);
		if ( units.contains(unit) ) {
			List<TypeDefinition> l = map.get(deep);
			if ( l == null ) {
				l = new ArrayList<TypeDefinition>();
				map.put(deep, l);
			}
			l.add(current);
		
			/*
			 * 
			 * Supertypes
			 * 
			 */
			for ( Type supertype : current.getSuperType() ) {
				if ( supertype instanceof Class ) {
					Class superclass = (Class) supertype;
					getContext(units, (ClassDefinition) superclass.getTypeDefinition(), map, deep+1);
				}
			}
			
			/*
			 * 
			 * Aspects
			 * 
			 */
			if ( unit.getAspects() != null && unit.getAspects().get(current) != null ) {
				for ( TypeDefinition aspect : unit.getAspects().get(current) )  {
					if ( aspect instanceof ClassDefinition )
						getContext( units, (ClassDefinition) aspect, map, deep );
				}
			}
			
			/*
			 * 
			 * Base Classes
			 *  
			 */
			if ( unit.getBaseAspects() != null && unit.getBaseAspects().get(current) != null ) {
				for ( TypeDefinition base : unit.getBaseAspects().get(current) )  {
					if ( base instanceof ClassDefinition )
						getContext( units, (ClassDefinition) base, map, deep );
				}
			}
		}	
	}
	
	/**
	 * Search for a base's super class with the given qualified name. Look for a method with the given operation name in the possible found super class.
	 * @param base
	 * @param superClassQualifiedName
	 * @param operationName
	 * @return
	 */
	static public Operation getSuperOperation(ClassDefinition base, String superClassQualifiedName, String operationName) {
		List<TypeDefinition> l = getContext(base);
		l.remove(base);
		for ( TypeDefinition td : l ) {
			if ( td instanceof ClassDefinition ) {
				ClassDefinition cd = (ClassDefinition) td;
				if ( KermetaModelHelper.NamedElement.qualifiedName(cd).equals(superClassQualifiedName) )
					for ( Operation operation : cd.getOwnedOperation() )
						if ( operation.getName().equals(operationName) )
							return operation;
			}
		}
		return null;
	}

	/**
	 * Get a property by its name
	 */
	public static Property getPropertyByName(ClassDefinition c, String name) {
		for ( Property prop :  getAllProperties(c) )
			if (prop.getName().equals(name)) 
				return prop;
		return null;
	}
	/**
	 * @param classDefinition
	 * @return the list of all properties defined for the given class definition. This includes the inherited properties
	 * and the implicitly inherited from Object
	 */
	public static List<Property> getAllProperties(ClassDefinition cls) {
		List<Property> properties = new ArrayList<Property>();
		for ( TypeDefinition typeDefinition : getContext(cls) )
			if ( typeDefinition instanceof ClassDefinition )
				properties.addAll( ((ClassDefinition) typeDefinition).getOwnedAttribute() );
		return properties;
	}
	
	static public List<Property> getAllPropertiesWithOpposite(ClassDefinition classDefinition) {
		List<Property> result = new ArrayList<Property> ();
		for ( Property p : getAllProperties(classDefinition) ) {
			if ( p.getOpposite() != null )
				result.add(p);
		}
		return result;
	}
	
	/**
	 * Get an operation by its name. This looks into this ClassDefintion only 
	 */
	public static Operation getOperationByName(ClassDefinition c, String name) {
		for (Operation op : getAllOperations(c) )
			if ( op.getName().equals(name) ) 
				return op;
		return null;
	}
	/** Returns a list of all operations for this classdefinition including inherited operations and
	 * implicit operations inherited from kermeta::standard::Object
	 */
	public static List<Operation> getAllOperations(ClassDefinition cls) {
		List<Operation> operations = new ArrayList<Operation>();
		for ( TypeDefinition typeDefinition : getContext(cls) )
			if ( typeDefinition instanceof ClassDefinition )
				operations.addAll( ((ClassDefinition) typeDefinition).getOwnedOperation() );
		return operations;
	}
	
	public static List<Constraint> getAllInvariants(ClassDefinition cls) {
		List<Constraint> result = new ArrayList<Constraint>();	
		for ( TypeDefinition typeDefinition : getContext(cls) )
			if ( typeDefinition instanceof ClassDefinition )
				result.addAll( ((ClassDefinition) typeDefinition).getInv() );
		return result;
	}
	
	public static TypeVariable getTypeParameter(ClassDefinition cls, String name) {
		for ( TypeVariable tv : cls.getTypeParameter() )
			if ( tv.getName().equals(name) )
				return tv;
		return null;
	}
	
	/**
	 * 
	 * @param c
	 * @return true if the the class definition has kermeta::standard::Collection as super type.
	 */
	public static boolean isCollection(ClassDefinition c) {
		for ( TypeDefinition cd : getContext(c) )
			if ( KermetaModelHelper.NamedElement.qualifiedName(cd).equals("kermeta::standard::Collection") )
				return true;
		return false;
	}

	/**
	 * Is superclass a super class of clazz ?
	 * @param superclass
	 * @param clazz
	 * @return true if super class is a super class of clazz, false otherwise.
	 */
	public static boolean isSuperTypeOf(ClassDefinition superclass, ClassDefinition clazz) {		
		for(Type t : clazz.getSuperType()){
			// in the supertypes of clazz, search a class whose context contains superclass
			if(t instanceof Class){
				Class aSuperclass = (Class) t;
				if(aSuperclass.getTypeDefinition() instanceof ClassDefinition){
					
					List<TypeDefinition> asuperclassContext = getContext((ClassDefinition) aSuperclass.getTypeDefinition());
					// context contains aSuperclass and all its parents
					if(asuperclassContext.contains(superclass)) 
						return true;
				}
			}
		}
		
		return false;
	}
}


