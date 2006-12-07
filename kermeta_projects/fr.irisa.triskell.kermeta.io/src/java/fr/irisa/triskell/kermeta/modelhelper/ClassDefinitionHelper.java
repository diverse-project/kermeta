/* $Id: ClassDefinitionHelper.java,v 1.2 2006-12-07 08:05:35 dvojtise Exp $
 * Project   : Kermeta 
 * File      : ClassDefinitionHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 18 oct. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.modelhelper;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;

import fr.irisa.triskell.kermeta.loader.StdLibKermetaUnitHelper;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.typechecker.KermetaTypeChecker;

/**
 * this class proposes various helper functions that applies to ClassDefinition in the Kermeta model
 *
 */
public class ClassDefinitionHelper {

	// ---------------------------------
	// functions about properties
	// ---------------------------------

	/**
	 * Get an property by its name. search in the inheritance tree
	 */
	public static Property findPropertyByName(ClassDefinition c, String name) {
		Property result = getPropertyByName(c, name);
		if (result != null) return result;
		EList superclasses = c.getSuperType();
		for(int i=0; i<superclasses.size();i++) {
			ClassDefinition sc = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)superclasses.get(i)).getTypeDefinition();
			result = findPropertyByName(sc, name);
			if (result != null) return result;
		}
		return null;
	}
	
	/**
	 * Get a property by its name
	 */
	public static Property getPropertyByName(ClassDefinition c, String name) {
		EList props = c.getOwnedAttribute();
		for (int i=0; i<props.size(); i++) {
			Property prop = (Property)props.get(i);
			if (prop.getName().equals(name)) return prop;
		}
		return null;
	}
	/**
	 * @param classDefinition
	 * @return the list of all properties defined for the given class definition. This includes the inherited properties
	 * and the implicitly inherited from Object
	 */
	public static ArrayList<Property> getAllProperties(ClassDefinition cls) {
		ArrayList<Property> result = new ArrayList<Property>();
		//		 Get the properties on object type :
		ClassDefinition ObjectTypeDef = StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();
		if (ObjectTypeDef != null) {
		    result.addAll(getAllExplicitProperties(ObjectTypeDef));
		}
		
		// ensures that each property is added only once.
		for (Object prop : cls.getOwnedAttribute()) {
			if(!result.contains(prop)) result.add( (Property) prop);
		}
		for (Object stnext : cls.getSuperType()) {
			//ensures that each property is added only once.
			for (Object prop : getAllExplicitProperties((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stnext).getTypeDefinition()))
			{
				if(!result.contains(prop)) result.add( (Property) prop);
			}
		}
		return result;
	}
	
	/**
	 * @param classDefinition
	 * @return the list of all properties defined for the given class definition. This includes the inherited properties
	 */
	public static ArrayList<Property> getAllExplicitProperties(ClassDefinition cls) {
		ArrayList<Property> result = new ArrayList<Property>();
		// ensures that each property is added only once.
		for (Object prop : cls.getOwnedAttribute()) {
			if(!result.contains(prop)) result.add( (Property) prop);
		}
		for (Object stnext : cls.getSuperType()) {
			//ensures that each property is added only once.
			for (Object prop : getAllExplicitProperties((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stnext).getTypeDefinition()))
			{
				if(!result.contains(prop)) result.add( (Property) prop);
			}
		}
		return result;
	}
	// ---------------------------------
	// functions about operations
	// ---------------------------------

	/**
	 * Get an operation by its name. search in the inheritance tree (including implicit inheritance of Object)
	 */
	public static Operation findOperationByName(ClassDefinition c, String name) {
		for (Object next : getAllOperations(c)) {
	        Operation op = (Operation)next;
	        if (op.getName().equals(name)) return op;
	    }
	    return null;
	}
	
	/**
	 * Get an operation by its name. This looks into this ClassDefintion only 
	 */
	public static Operation getOperationByName(ClassDefinition c, String name) {
		EList ops = c.getOwnedOperation();
		for (int i=0; i<ops.size(); i++) {
			Operation op = (Operation)ops.get(i);
			if (op.getName().equals(name)) return op;
		}
		return null;
	}
	/** Returns a list of all operations for this classdefinition including inherited operations and
	 * implicit operations inherited from kermeta::standard::Object
	 */
	public static ArrayList<Operation> getAllOperations(ClassDefinition cls) {
		ArrayList<Operation> result = new ArrayList<Operation>();
		
		// Get the operations on object type :
		ClassDefinition ObjectTypeDef = StdLibKermetaUnitHelper.get_ROOT_TYPE_ClassDefinition();
		if (ObjectTypeDef != null) {
		    result.addAll(getAllExplicitOperations(ObjectTypeDef));
		}
		
		for (Object next : cls.getOwnedOperation()) {
			Operation op = (Operation)next;
			// only take operation. no methods
			if (op.getSuperOperation() == null && !result.contains(op)) result.add(op);
		}
		// search recursively in super classes
		for (Object next : cls.getSuperType()) {
			result.addAll(getAllOperations((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)next).getTypeDefinition()));
		}
		return result;
	}
	
	/** returns a list of all the operation for this ClassDefintion including inherited operations 
	 * but not the implicit one from Object
	 * @param cls
	 * @return
	 */
	public static ArrayList<Operation> getAllExplicitOperations(ClassDefinition cls) {
		ArrayList<Operation> result = new ArrayList<Operation>();
		
		
		for (Object next : cls.getOwnedOperation()) {
			Operation op = (Operation)next;
			// only take operation. no methods
			if (op.getSuperOperation() == null && !result.contains(op)) result.add(op);
		}
		// search recursively in super classes
		for (Object next : cls.getSuperType()) {
			result.addAll(getAllExplicitOperations((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)next).getTypeDefinition()));
		}
		return result;
	}
	
	// ---------------------------------
	// functions about inheritance
	// ---------------------------------

	/**
	 * Return true if supercls is a super class of cls
	 * @param supercls the Super class to which we compare cls
	 * @param cls the class to compare to the super class
	 * @return
	 */
	public static boolean isSuperClassOf(ClassDefinition supercls, ClassDefinition cls) {
		for(Object stype : cls.getSuperType()) {
			ClassDefinition scls = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stype).getTypeDefinition();
			if (supercls == scls) return true;
			else if(isSuperClassOf(supercls, scls)) return true;
		}
		return false;
	}
	
	/**
	 * Get the list of direct parents of a class
	 * @param cls Class for which we get the first-level parents
	 * @return a Array of the <b>cls</b>'s first-level parents
	 */
	public static ArrayList<ClassDefinition> getDirectSuperClasses(ClassDefinition cls) {
		ArrayList<ClassDefinition> result = new ArrayList<ClassDefinition>();
		for(Object next : cls.getSuperType()) {
			GenericTypeDefinition gtd =((fr.irisa.triskell.kermeta.language.structure.Class)next).getTypeDefinition();
			if( gtd instanceof ClassDefinition){
				result.add( (ClassDefinition)gtd );
			}
		}
		// THIS LOOKS USELESS
		/*
		// Add the type Object which is implicilty a direct supertype of everything
		ClassDefinition ObjectTypeDef = (ClassDefinition)typeDefinitionLookup(ROOT_CLASS_QNAME);
		if (ObjectTypeDef != null && cls != ObjectTypeDef && !result.contains(ObjectTypeDef)) {
			result.add(ObjectTypeDef);
		}
		*/
			
		return result;
	}
	
	// ---------------------------------
	// functions about constraints
	// ---------------------------------	
	/**
	 * Get a Constraint by its name in ClassDef c and its inheritance tree
	 * @param c
	 * @param name
	 * @return
	 */
	public static Constraint findInvariantByName(ClassDefinition c, String name) {
		Constraint result = getInvariantByName(c, name);
		if (result != null) return result;
		EList superclasses = c.getSuperType();
		for(int i=0; i<superclasses.size();i++) {
			ClassDefinition sc = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)superclasses.get(i)).getTypeDefinition();
			result = findInvariantByName(sc, name);
			if (result != null) return result;
		}
		return null;
	}
	
	/**
	 * Get a Constraint by its name in ClassDef c
	 * @param c
	 * @param name
	 * @return
	 */
	public static Constraint getInvariantByName(ClassDefinition c, String name) {
		EList invs = c.getInv();
		for (int i=0; i<invs.size(); i++) {
			Constraint inv = (Constraint) invs.get(i);
			if(inv.getName().equals(name))
				return inv;
		}
		return null;
	}
	

	// ---------------------------------
	// functions about semanticallyAbstract Tag
	// ---------------------------------
	/** The necessary and sufficient condition to know if a class definition is semantically
	 * abstract or not is the presence of a tag which name is "isSemanticallyAbstract"; 
	 * this methods looks for this tag and returns true if it found it. */
	public static boolean isSemanticallyAbstract(ClassDefinition cdef) {
		boolean isSemanticallyAbstract = false;
		if (cdef.isIsAbstract()) return true;
		Iterator it = cdef.getTag().iterator();
		while(it.hasNext() && !isSemanticallyAbstract)
		{
			isSemanticallyAbstract = ((Tag)it.next()).getName().equals(KermetaTypeChecker.IS_SEMANTICALLY_ABSTRACT);
		}
		return isSemanticallyAbstract;
	}
	/**
	 * Build a short message explaining why the ClassDefinition is semantically abstract
	 * @param cdef
	 * @return
	 */
	public static String getSemanticallyAbstractCause(ClassDefinition cdef) {
		String semanticallyAbstractCause = "(at least) one operation ";
		if (cdef.isIsAbstract()) return "The ClassDefinition is declared abstract";
		Iterator it = cdef.getTag().iterator();
		while(it.hasNext() )
		{
			Tag t =(Tag)it.next();
			if(t.getName().equals(KermetaTypeChecker.IS_SEMANTICALLY_ABSTRACT)){
				semanticallyAbstractCause += t.getValue() + " ";
			}
		}
		semanticallyAbstractCause += " is abstract";
		return semanticallyAbstractCause;
	}
}
