

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.io.TypeDefinitionContext;
import org.kermeta.io.impl.IoFactoryImpl;
import org.kermeta.io.plugin.IOPlugin;
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
import fr.irisa.triskell.kermeta.modelhelper.TypeDefinitionHelper;

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
	 * Look into the direct super types of the base class definition if an operation matches with the given name.
	 * @param base
	 * @param operationName
	 * @return
	 */
	static public List<Operation> getDirectSuperOperations(KermetaUnit rootUnit, ClassDefinition base, String operationName) {
		//create a copy
		Map<Integer, EList<TypeDefinition>> l = new HashMap<Integer, EList<TypeDefinition>>();
		l.putAll(_getContext(rootUnit, base));
		
		
		/*
		 * 
		 * Removing the extra class definitions.
		 * 
		 */
		
		l.remove(0);
				
		TreeMap<Integer, List<Operation>> result = new TreeMap<Integer, List<Operation>>();
		for (Entry<Integer, EList<TypeDefinition>> entry : l.entrySet()) {
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
		
		
		if ( result.size() == 0 || result.get(result.firstKey()) == null )
			return new ArrayList<Operation>();
		return result.get(result.firstKey());
	}
	/**
	 * Look into the super types of the base class definition for all operation matching the given name.
	 * @param base
	 * @param operationName
	 * @return
	 */
	static public List<Operation> getSuperOperations(KermetaUnit rootUnit, ClassDefinition base, String operationName) {
		//create a copy
		Map<Integer, EList<TypeDefinition>> l = new HashMap<Integer, EList<TypeDefinition>>();
		l.putAll(_getContext(rootUnit, base));
		
		/*
		 * 
		 * Removing the extra class definitions.
		 * 
		 */
		
		l.remove(0);
				
		List<Operation> result = new ArrayList<Operation>();
		for (Entry<Integer, EList<TypeDefinition>> entry : l.entrySet()) {
			for (TypeDefinition td : entry.getValue() ) {
				if ( td instanceof ClassDefinition ) {
					ClassDefinition cd = (ClassDefinition) td;
					for ( Operation operation : cd.getOwnedOperation() )
						if ( operation.getName().equals(operationName) ) {
							result.add( operation );
						}
				}
			}
		}
		
		return result;
	}
	
	static private Map<Integer, EList<TypeDefinition>> _getContext(KermetaUnit rootUnit, ClassDefinition c) {
		String qname = KermetaModelHelper.NamedElement.qualifiedName(c);
		TypeDefinitionContext tdc = rootUnit.getTypeDefinitionContextsCache().get(qname);
		if(tdc == null){
			tdc = IoFactoryImpl.eINSTANCE.createTypeDefinitionContext();
			tdc.setQualifiedName(qname);
			Map<Integer, EList<TypeDefinition>> result = new TreeMap<Integer, EList<TypeDefinition>>();
			List<KermetaUnit> units = new ArrayList<KermetaUnit>();
			units.add(rootUnit);
			units.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(rootUnit) );
			getContext(units, c, result, 0);
			tdc.setContext(result);
			rootUnit.getTypeDefinitionContextsCache().put(qname, tdc);
		}
		return tdc.getContext();
	}
	
	/**
	 * Return all the classes related to this one :
	 * This includes the aspects and the inherited class definition
	 * @param c
	 * @return
	 */
	static public EList<TypeDefinition> getContext(KermetaUnit rootUnit,ClassDefinition c) {
		EList<TypeDefinition> result = new BasicEList<TypeDefinition>();
		Map<Integer, EList<TypeDefinition>> context = _getContext(rootUnit,c);
		for (Entry<Integer, EList<TypeDefinition>> e : context.entrySet())
			result.addAll(e.getValue());
		return result;
	}
	
	static public EList<TypeDefinition> getFullContext(KermetaUnit rootUnit,ClassDefinition c) {
		EList<TypeDefinition> result = new BasicEList<TypeDefinition>();
		Map<Integer, EList<TypeDefinition>> context = _getFullContext(rootUnit, c);
		for (Entry<Integer, EList<TypeDefinition>> e : context.entrySet())
			result.addAll(e.getValue());
		return result;
	}
	
	static private Map<Integer, EList<TypeDefinition>> _getFullContext(KermetaUnit rootUnit, ClassDefinition c) {
		Map<Integer, EList<TypeDefinition>> result = new TreeMap<Integer, EList<TypeDefinition>>();
		getFullContext(rootUnit, c, result, 0);
		return result;
	}
	
	static private void getFullContext(KermetaUnit rootUnit, ClassDefinition current, Map<Integer, EList<TypeDefinition>> map, Integer deep) {
		for ( List<TypeDefinition> l : map.values() )
			if ( l.contains(current) )
				return;
		
		EList<TypeDefinition> l = map.get(deep);
		if ( l == null ) {
			l = new BasicEList<TypeDefinition>();
			map.put(deep, l);
		}
		l.add(current);
		
		//KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(current);
		/*
		 * 
		 * Supertypes
		 * 
		 */
		for ( Type supertype : current.getSuperType() ) {
			if ( supertype instanceof Class ) {
				Class superclass = (Class) supertype;
				getFullContext(rootUnit,  (ClassDefinition) superclass.getTypeDefinition(), map, deep+1);
			}
		}
			
		/*
		 * 
		 * Aspects
		 * 
		 */
	/*	if(unit == null){
			IOPlugin.internalLog.error("uh oh .. unit should not be null ? problem with the loader or the cache  ?");
			KermetaUnitHelper.getKermetaUnitFromObject(current);
		}*/
		//if ( unit.getAspects() != null && unit.getAspects().get(current) != null ) {
			for ( TypeDefinition aspect : getAspects(rootUnit, current) )  {
				if ( aspect instanceof ClassDefinition )
					getFullContext(rootUnit, (ClassDefinition) aspect, map, deep );
			}
		//}
		
		/*
		 * 
		 * Base Classes
		 *  
		 */
	/*	if ( unit.getBaseAspects() != null && unit.getBaseAspects().get(current) != null ) {
			for ( TypeDefinition base : unit.getBaseAspects().get(current) )  {
				if ( base instanceof ClassDefinition )
					getFullContext( (ClassDefinition) base, map, deep );
			}
		}*/
	}	
	
	/**
	 * Search in the KermetaUnit and its imported unit all matching TypeDefinition with the given QualifiedName
	 * @param rootUnit
	 * @param typeDefinitionQualifiedName
	 * @return
	 */
	static public List<TypeDefinition> getAspects(KermetaUnit rootUnit, ClassDefinition cd){
		return getAspects(rootUnit, KermetaModelHelper.ClassDefinition.qualifiedName(cd));
	}
	
	/**
	 * Search in the KermetaUnit and its imported unit all matching TypeDefinition with the given QualifiedName
	 * @param rootUnit
	 * @param typeDefinitionQualifiedName
	 * @return
	 */
	static public List<TypeDefinition> getAspects(KermetaUnit rootUnit, String typeDefinitionQualifiedName){
		List<TypeDefinition> result = new UniqueEList<TypeDefinition>();
		List<KermetaUnit> searchedUnits = KermetaUnitHelper.getAllImportedKermetaUnits(rootUnit);
		searchedUnits.add(rootUnit);
		for ( KermetaUnit importedUnit : searchedUnits ) {
			TypeDefinitionCacheEntry entry = importedUnit.getTypeDefinitionCache().getEntries().get(typeDefinitionQualifiedName);
			if(entry != null)
				result.add(entry.getTypeDefinition());
		}
		return result;
	}
	
	static private void getContext(List<KermetaUnit> units, ClassDefinition current, Map<Integer, EList<TypeDefinition>> map, int deep) {
		for ( List<TypeDefinition> l : map.values() )
			if ( l.contains(current))
				return; // several definition of the same class will have to stop the recursion
		EList<TypeDefinition> aspectList = new BasicEList<TypeDefinition>();
		for(KermetaUnit ku : units){
			List<TypeDefinition> aspectListFromUnit = TypeDefinitionHelper.getAllAspects(ku, KermetaModelHelper.ClassDefinition.qualifiedName(current));
			for(TypeDefinition newDef : aspectListFromUnit){
				if(!aspectList.contains(newDef))
					aspectList.add(newDef ) ;		
			}
			
		}
		if(map.get(deep) != null){
			map.get(deep).addAll(aspectList);
		}
		else
			map.put(deep, aspectList);
		// for all aspects, looks for inheritance
		for(TypeDefinition td : aspectList){
			for ( Type supertype : ((ClassDefinition)td).getSuperType() ) {
				if ( supertype instanceof Class ) {
					Class superclass = (Class) supertype;
					getContext(units, (ClassDefinition) superclass.getTypeDefinition(), map, deep+1);
				}
			}
		}
	}
	static private void getContext2(List<KermetaUnit> units, ClassDefinition current, Map<Integer, EList<TypeDefinition>> map, int deep) {
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
		/*	List<TypeDefinition> l = map.get(deep);
			if ( l == null ) {
				l = new ArrayList<TypeDefinition>();
				map.put(deep, l);
			}
			l.add(current);
		*/
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
			for ( TypeDefinition aspect : getAspects(unit, current) )  {
				if ( aspect instanceof ClassDefinition )
					getFullContext(unit, (ClassDefinition) aspect, map, deep );
			}
			/*if ( unit.getAspects() != null && unit.getAspects().get(current) != null ) {
				for ( TypeDefinition aspect : unit.getAspects().get(current) )  {
					if ( aspect instanceof ClassDefinition )
						getContext( units, (ClassDefinition) aspect, map, deep );
				}
			}*/
			
			/*
			 * 
			 * Base Classes
			 *  
			 */
		/*	if ( unit.getBaseAspects() != null && unit.getBaseAspects().get(current) != null ) {
				for ( TypeDefinition base : unit.getBaseAspects().get(current) )  {
					if ( base instanceof ClassDefinition )
						getContext( units, (ClassDefinition) base, map, deep );
				}
			}*/
		}	
	}
	
	/**
	 * Search for a base's super class with the given qualified name. Look for a method with the given operation name in the possible found super class.
	 * @param base
	 * @param superClassQualifiedName
	 * @param operationName
	 * @return
	 */
	static public Operation getSuperOperation(KermetaUnit rootUnit, ClassDefinition base, String superClassQualifiedName, String operationName) {
		List<Operation> opList = getSuperOperations(rootUnit, base, operationName);
		for(Operation op : opList){
			if(superClassQualifiedName.equals(KermetaModelHelper.NamedElement.qualifiedName(op.getOwningClass()))){
				return op;
			}
		}
	/*	List<TypeDefinition> l = getContext(rootUnit, base);
		l.remove(base);
		for ( TypeDefinition td : l ) {
			if ( td instanceof ClassDefinition ) {
				ClassDefinition cd = (ClassDefinition) td;
				if ( KermetaModelHelper.NamedElement.qualifiedName(cd).equals(superClassQualifiedName) )
					for ( Operation operation : cd.getOwnedOperation() )
						if ( operation.getName().equals(operationName) )
							return operation;
			}
		}*/
		return null;
	}

	/**
	 * Get a property by its name
	 */
	public static Property getPropertyByName(KermetaUnit rootUnit, ClassDefinition c, String name) {
		for ( Property prop :  getAllProperties(rootUnit, c) )
			if (prop.getName().equals(name)) 
				return prop;
		return null;
	}
	/**
	 * @param classDefinition
	 * @return the list of all properties defined for the given class definition. This includes the inherited properties
	 * and the implicitly inherited from Object
	 */
	public static List<Property> getAllProperties(KermetaUnit rootUnit, ClassDefinition cls) {
		List<Property> properties = new ArrayList<Property>();
		for ( TypeDefinition typeDefinition : getContext(rootUnit, cls) )
			if ( typeDefinition instanceof ClassDefinition )
				properties.addAll( ((ClassDefinition) typeDefinition).getOwnedAttribute() );
		return properties;
	}
	
	static public List<Property> getAllPropertiesWithOpposite(KermetaUnit rootUnit, ClassDefinition classDefinition) {
		List<Property> result = new ArrayList<Property> ();
		for ( Property p : getAllProperties(rootUnit, classDefinition) ) {
			if ( p.getOpposite() != null )
				result.add(p);
		}
		return result;
	}
	
	/**
	 * Get an operation by its name. This looks into this ClassDefintion only 
	 */
	public static Operation getOperationByName(KermetaUnit rootUnit, ClassDefinition c, String name) {
		for (Operation op : getAllOperations(rootUnit, c) )
			if ( op.getName().equals(name) ) 
				return op;
		return null;
	}
	/** Returns a list of all operations for this classdefinition including inherited operations and
	 * implicit operations inherited from kermeta::standard::Object
	 */
	public static List<Operation> getAllOperations(KermetaUnit rootUnit, ClassDefinition cls) {
		List<Operation> operations = new ArrayList<Operation>();
		for ( TypeDefinition typeDefinition : getContext(rootUnit, cls) )
			if ( typeDefinition instanceof ClassDefinition )
				operations.addAll( ((ClassDefinition) typeDefinition).getOwnedOperation() );
		return operations;
	}
	
	public static List<Constraint> getAllInvariants(KermetaUnit rootUnit, ClassDefinition cls) {
		List<Constraint> result = new ArrayList<Constraint>();	
		for ( TypeDefinition typeDefinition : getContext(rootUnit, cls) )
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
	public static boolean isCollection(KermetaUnit rootUnit, ClassDefinition c) {
		for ( TypeDefinition cd : getContext(rootUnit, c) )
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
	public static boolean isSuperTypeOf(KermetaUnit rootUnit, ClassDefinition superclass, ClassDefinition clazz) {		
		for(Type t : clazz.getSuperType()){
			// in the supertypes of clazz, search a class whose context contains superclass
			if(t instanceof Class){
				Class aSuperclass = (Class) t;
				if(aSuperclass.getTypeDefinition() instanceof ClassDefinition){
					
					List<TypeDefinition> asuperclassContext = getContext(rootUnit, (ClassDefinition) aSuperclass.getTypeDefinition());
					// context contains aSuperclass and all its parents
					if(asuperclassContext.contains(superclass)) 
						return true;
				}
			}
		}
		
		return false;
	}
}


