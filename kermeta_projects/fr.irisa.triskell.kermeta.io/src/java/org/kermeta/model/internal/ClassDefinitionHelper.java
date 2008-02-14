

/*$Id: ClassDefinitionHelper.java,v 1.3 2008-02-14 10:27:14 fmunoz Exp $
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
		Map<TypeDefinition, Integer> l = getContext(base);
		/*
		 * 
		 * Getting the class definition to remove. We do not want the base class and its aspects.
		 * 
		 */
		String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(base);
		List<ClassDefinition> classDefinitionToRemove = new ArrayList<ClassDefinition>();
		for ( TypeDefinition td : l.keySet() ) {
			if ( td instanceof ClassDefinition) {
				ClassDefinition cd = (ClassDefinition) td;
				if ( KermetaModelHelper.NamedElement.qualifiedName(cd).equals(qualifiedName) )
					classDefinitionToRemove.add(cd);
			}
		}
		/*
		 * 
		 * Removing the extra class definitions.
		 * 
		 */
		for ( ClassDefinition cd : classDefinitionToRemove )
			l.remove(cd);
		
		TreeMap<Integer, List<Operation>> result = new TreeMap<Integer, List<Operation>>();
		for ( Entry<TypeDefinition, Integer> entry : l.entrySet() ) {
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
		}
		
		if ( result.get(result.firstKey()) == null )
			return new ArrayList<Operation>();
		return result.get(result.firstKey());
	}
	
	static public Map<TypeDefinition, Integer> getContext(ClassDefinition c) {
		Map<TypeDefinition, Integer> result = new HashMap<TypeDefinition, Integer>();
		List<KermetaUnit> units = new ArrayList<KermetaUnit>();
		KermetaUnit initialUnit = KermetaUnitHelper.getKermetaUnitFromObject(c);
		units.add(initialUnit);
		units.addAll( KermetaUnitHelper.getAllImportedKermetaUnits(initialUnit) );
		getContext(units, c, result, 0);
		return result;
	}
	
	static private void getContext(List<KermetaUnit> units, ClassDefinition current, Map<TypeDefinition, Integer> l, int deep) {
		if ( l.containsKey(current) )
			return;
		
		KermetaUnit unit = KermetaUnitHelper.getKermetaUnitFromObject(current);
		if ( units.contains(unit) ) {
			l.put(current, deep);
		
			/*
			 * 
			 * Supertypes
			 * 
			 */
			for ( Type supertype : current.getSuperType() ) {
				if ( supertype instanceof Class ) {
					Class superclass = (Class) supertype;
					getContext(units, (ClassDefinition) superclass.getTypeDefinition(), l, deep+1);
				}
			}
			
			/*
			 * 
			 * Aspects
			 * 
			 */
			if ( unit.getAspects().get(current) != null ) {
				for ( TypeDefinition aspect : unit.getAspects().get(current) )  {
					if ( aspect instanceof ClassDefinition )
						getContext( units, (ClassDefinition) aspect, l, deep+1 );
				}
			}
			
			/*
			 * 
			 * Base Classes
			 *  
			 */
			if ( unit.getBaseAspects().get(current) != null ) {
				for ( TypeDefinition base : unit.getBaseAspects().get(current) )  {
					if ( base instanceof ClassDefinition )
						getContext( units, (ClassDefinition) base, l, deep+1 );
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
		Map<TypeDefinition, Integer> l = getContext(base);
		l.remove(base);
		for ( TypeDefinition td : l.keySet() ) {
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
		for ( TypeDefinition typeDefinition : getContext(cls).keySet() )
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
		for ( TypeDefinition typeDefinition : getContext(cls).keySet() )
			if ( typeDefinition instanceof ClassDefinition )
				operations.addAll( ((ClassDefinition) typeDefinition).getOwnedOperation() );
		return operations;
	}
	
	public static List<Constraint> getAllInvariants(ClassDefinition cls) {
		List<Constraint> result = new ArrayList<Constraint>();	
		for ( TypeDefinition typeDefinition : getContext(cls).keySet() )
			if ( typeDefinition instanceof ClassDefinition )
				result.addAll( ((ClassDefinition) typeDefinition).getInv() );
		return result;
	}
}


