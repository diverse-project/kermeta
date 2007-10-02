/* $Id: ClassDefinitionHelper.java,v 1.10 2007-10-02 15:19:05 ftanguy Exp $
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
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
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
		List props = getAllProperties(c);
		for (int i=0; i<props.size(); i++) {
			Property prop = (Property)props.get(i);
			if (prop.getName().equals(name)) 
				return prop;
		}
		return null;
	}
	/**
	 * @param classDefinition
	 * @return the list of all properties defined for the given class definition. This includes the inherited properties
	 * and the implicitly inherited from Object
	 */
	public static ArrayList<Property> getAllProperties(ClassDefinition cls) {
		ArrayList<Property> properties = new ArrayList<Property>();
		ArrayList<ClassDefinition> classDefinitionProcessed = new ArrayList<ClassDefinition> ();
		internGetAllProperties(cls, properties, classDefinitionProcessed);
		return properties;
		
		// ensures that each property is added only once.
	/*	for (Object prop : cls.getOwnedAttribute()) {
			if(!result.contains(prop)) result.add( (Property) prop);
		}
		for (Object stnext : cls.getSuperType()) {
			//ensures that each property is added only once.
//			for (Object prop : getAllExplicitProperties((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stnext).getTypeDefinition()))
			for (Object prop : getAllProperties((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stnext).getTypeDefinition()))
			{
				if(!result.contains(prop)) result.add( (Property) prop);
			}
		}
		
		for (Object stnext : cls.getSuperType()) {		//ensures that each property is added only once.
			ClassDefinition superClass =  (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) stnext).getTypeDefinition();
			result.addAll( getAllProperties(superClass) );
		}
		
		for ( TypeDefinition baseTypeDefinition : (List<TypeDefinition>) cls.getBaseAspects() ) {
			
			if ( baseTypeDefinition instanceof ClassDefinition ) {
				ClassDefinition baseClass = (ClassDefinition) baseTypeDefinition;
				result.addAll( getAllProperties(baseClass) );
			}
			
		}
		
		for ( TypeDefinition aspectTypeDefinition : (List<TypeDefinition>) cls.getAspects() ) {
			
			if ( aspectTypeDefinition instanceof ClassDefinition ) {
				ClassDefinition aspectClass = (ClassDefinition) aspectTypeDefinition;
				result.addAll( getAllProperties(aspectClass) );
			}
			
		}
		
		return result;*/
	}
	
	static private void internGetAllProperties(ClassDefinition currentClassDefinition, List<Property> properties, List<ClassDefinition> classDefinitionProcessed) {
		
		if ( classDefinitionProcessed.contains( currentClassDefinition ) )
			return;
		
		classDefinitionProcessed.add( currentClassDefinition );
		
		for (Property prop : currentClassDefinition.getOwnedAttribute()) {
			if ( ! properties.contains(prop) ) 
				properties.add( prop );
		}
		
		for ( Type stnext : currentClassDefinition.getSuperType() ) {
			ClassDefinition superClassDefinition = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stnext).getTypeDefinition();
			internGetAllProperties(superClassDefinition, properties, classDefinitionProcessed);
		}
		
		for ( TypeDefinition baseTypeDefinition : (List<TypeDefinition>) currentClassDefinition.getBaseAspects() ) {
			if ( baseTypeDefinition instanceof ClassDefinition ) {
				ClassDefinition baseClass = (ClassDefinition) baseTypeDefinition;
				internGetAllProperties(baseClass, properties, classDefinitionProcessed);
				//KermetaUnitHelper.getKermetaUnitFromObject( TypeDefinitionHelper.getAspects(baseTypeDefinition).get(0) )
			}
		}
		
		for ( TypeDefinition aspectTypeDefinition : TypeDefinitionHelper.getAspects(currentClassDefinition) ) {
//		for ( TypeDefinition aspectTypeDefinition : (List<TypeDefinition>) currentClassDefinition.getAspects() ) {
			if ( aspectTypeDefinition instanceof ClassDefinition ) {
				ClassDefinition aspectClass = (ClassDefinition) aspectTypeDefinition;
				internGetAllProperties(aspectClass, properties, classDefinitionProcessed);
			}
		}
		
	}
	
	/**
	 * @param classDefinition
	 * @return the list of all properties defined for the given class definition. This includes the inherited properties
	 */
	public static Set<Property> getAllExplicitProperties(ClassDefinition cls) {
		Set<Property> result = new HashSet<Property>();
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
	 * Get an operation by its name. search in the inheritance tree (including implicit inheritance of Object)
	 */
	public static List<Operation> findOperationsByName(ClassDefinition c, String name) {
		List<Operation> operations = new ArrayList<Operation>();
		for (Object next : getAllOperations(c)) {
	        Operation op = (Operation)next;
	        if (op.getName().equals(name)) 
	        	operations.add( op );
	    }
	    return operations;
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
	public static List<Operation> getAllOperations(ClassDefinition cls) {
		ArrayList<Operation> operations = new ArrayList<Operation>();
		ArrayList<ClassDefinition> classDefinitionProcessed = new ArrayList<ClassDefinition> ();
		internGetAllOperations(cls, operations, classDefinitionProcessed);
		return operations;
		/*Set<Operation> result = new HashSet<Operation>();
				
		for (Object next : cls.getOwnedOperation()) {
			Operation op = (Operation)next;
			// only take operation. no methods
			if (op.getSuperOperation() == null && !result.contains(op)) result.add(op);
		}
		// search recursively in super classes
		/*for (Object next : cls.getSuperType()) {
			result.addAll(getAllOperations((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)next).getTypeDefinition()));
		}
		
		for (Object stnext : cls.getSuperType()) {
			//ensures that each property is added only once.
			ClassDefinition superClass =  (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) stnext).getTypeDefinition();
			result.addAll( getAllOperations(superClass) );
		}
				
		for ( TypeDefinition baseTypeDefinition : (List<TypeDefinition>) cls.getBaseAspects() ) {
			
			if ( baseTypeDefinition instanceof ClassDefinition ) {
				ClassDefinition baseClass = (ClassDefinition) baseTypeDefinition;
				result.addAll( getAllOperations(baseClass) );
			}
			
		}
		
		return result;*/
	}
	
	static private void internGetAllOperations(ClassDefinition currentClassDefinition, List<Operation> operations, List<ClassDefinition> classDefinitionProcessed) {
		
		if ( classDefinitionProcessed.contains( currentClassDefinition ) )
			return;
		
		classDefinitionProcessed.add( currentClassDefinition );
		
		for (Operation operation : currentClassDefinition.getOwnedOperation()) {
			if ( ! operations.contains(operation) ) 
				operations.add( operation);
		}
		
		for ( Type stnext : currentClassDefinition.getSuperType() ) {
			ClassDefinition superClassDefinition = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stnext).getTypeDefinition();
			internGetAllOperations(superClassDefinition, operations, classDefinitionProcessed);
		}
		
		for ( TypeDefinition baseTypeDefinition : (List<TypeDefinition>) currentClassDefinition.getBaseAspects() ) {
			if ( baseTypeDefinition instanceof ClassDefinition ) {
				ClassDefinition baseClass = (ClassDefinition) baseTypeDefinition;
				internGetAllOperations(baseClass, operations, classDefinitionProcessed);
			}
		}
		
		for ( TypeDefinition aspectTypeDefinition : TypeDefinitionHelper.getAspects(currentClassDefinition) ) {
//		for ( TypeDefinition aspectTypeDefinition : (List<TypeDefinition>) currentClassDefinition.getAspects() ) {
			if ( aspectTypeDefinition instanceof ClassDefinition ) {
				ClassDefinition aspectClass = (ClassDefinition) aspectTypeDefinition;
				internGetAllOperations(aspectClass, operations, classDefinitionProcessed);
			}
		}
		
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
		for ( TypeDefinition typeDefinition : cls.getBaseAspects() ) {
			if ( typeDefinition instanceof ClassDefinition ) {
				ClassDefinition c = (ClassDefinition) typeDefinition;
				if ( isSuperClassOf(supercls, c) )
					return true;
			}
		}
		for ( TypeDefinition typeDefinition : supercls.getBaseAspects() ) {
			if ( typeDefinition instanceof ClassDefinition ) {
				ClassDefinition c = (ClassDefinition) typeDefinition;
				if ( isSuperClassOf(c, cls) )
					return true;
			}
		}
		return false;
	}
	
	/**
	 * Return true if supercls is a super class of cls, retrieval by name
	 * @param supercls the Super class to which we compare cls
	 * @param cls the class to compare to the super class
	 * @return
	 * FIXME CF: this method is very ugly, it is a temp patch related to the restore connection in the graphical editor
	 */
	public static boolean isSuperClassOfByName(ClassDefinition supercls, ClassDefinition cls) {
		for(Object stype : cls.getSuperType()) {
			ClassDefinition scls = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stype).getTypeDefinition();
			if (supercls.getName().equals(scls.getName())) return true;
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
	/*public static boolean isSemanticallyAbstract(ClassDefinition cdef) {
		boolean isSemanticallyAbstract = false;
		if ( cdef.isIsAbstract() ) 
			return true;
		Iterator <Tag> it = cdef.getTag().iterator();
		while(it.hasNext() && ! isSemanticallyAbstract) {
			Tag tag = it.next();
			if ( tag.getName() != null )
				isSemanticallyAbstract = tag.getName().equals(KermetaTypeChecker.IS_SEMANTICALLY_ABSTRACT);
		}
		return isSemanticallyAbstract;
	}*/
	/**
	 * Build a short message explaining why the ClassDefinition is semantically abstract
	 * @param cdef
	 * @return
	 */
	/*public static String getSemanticallyAbstractCause(ClassDefinition cdef) {
		String semanticallyAbstractCause = "(at least) one operation ";
		if (cdef.isIsAbstract()) return "The ClassDefinition is declared abstract";
		Iterator<Tag> it = cdef.getTag().iterator();
		while(it.hasNext() )
		{
			Tag t =it.next();
			if(t.getName().equals(KermetaTypeChecker.IS_SEMANTICALLY_ABSTRACT)){
				semanticallyAbstractCause += t.getValue() + " ";
			}
		}
		semanticallyAbstractCause += " is abstract";
		return semanticallyAbstractCause;
	}*/
	
	
	static public Set <TypeDefinition> getAllBaseClasses(ClassDefinition cl) {
		Set<TypeDefinition> baseClasses = new HashSet<TypeDefinition> ();
		getAllBaseClasses(cl, baseClasses);
		return baseClasses;
	}
	
	static private void getAllBaseClasses(ClassDefinition cl, Set<TypeDefinition> baseClasses) {
		
		for ( TypeDefinition typeDefinition : (List<TypeDefinition>) cl.getBaseAspects() ) {
			
			if ( typeDefinition instanceof ClassDefinition ) {
				
				ClassDefinition baseClass = (ClassDefinition) typeDefinition;
				if ( ! baseClasses.contains(baseClass) ) {
					baseClasses.add( baseClass );
					getAllBaseClasses(baseClass, baseClasses);
				}
				
			}
			
		}
		
	}
	
/*	static private void getAllAspectClasses(ClassDefinition cl, Set<TypeDefinition> aspectClasses) {
		
		for ( TypeDefinition typeDefinition : TypeDefinitionHelper.getAspects(cl) ) {
			
			if ( typeDefinition instanceof ClassDefinition ) {
				
				ClassDefinition aspectClass = (ClassDefinition) typeDefinition;
				if ( ! aspectClasses.contains(aspectClass) ) {
					aspectClasses.add( aspectClass );
					getAllBaseClasses(aspectClass, aspectClasses);
				}
				
			}
			
		}
		
	}*/
	
/*	static public Set <TypeDefinition> getAllAspectClasses(ClassDefinition cl) {
		Set<TypeDefinition> baseClasses = new HashSet<TypeDefinition> ();
		getAllAspectClasses(cl, baseClasses);
		return baseClasses;
	}*/

	
	static public Operation getLocalMatchingOperation(ClassDefinition cl, Operation operation) {
		for ( Operation currentOperation : (List<Operation>) cl.getOwnedOperation() ) {
			if ( OperationHelper.operationsSignatureEqualityChecker(operation, currentOperation) )
				return currentOperation;
		}
		return null;
	}
	
	public static Set<Constraint> getAllInvariants(ClassDefinition cls) {
		Set<Constraint> result = new HashSet<Constraint>();
		getAllInvariants(cls, result);
		return result;
	}
	
	private static void getAllInvariants(ClassDefinition cls, Set<Constraint> result) {
				
		for ( Constraint c : cls.getInv() )
			// only take operation. no methods
				result.add(c);
		
		for (Object stnext : cls.getSuperType()) {
			//ensures that each property is added only once.
			ClassDefinition superClass =  (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) stnext).getTypeDefinition();
			//result.addAll( superClass.getInv() );
			getAllInvariants(superClass, result);
		}
				
		for ( TypeDefinition baseTypeDefinition : (List<TypeDefinition>) cls.getBaseAspects() ) {
			
			if ( baseTypeDefinition instanceof ClassDefinition ) {
				ClassDefinition baseClass = (ClassDefinition) baseTypeDefinition;
				//result.addAll( baseClass.getInv() );
				getAllInvariants(baseClass, result);
			}
			
		}
		
	}
	
/*	static public List<TypeDefinition> getAspects(ClassDefinition cd) {
//		Calendar c1 = Calendar.getInstance( Locale.FRENCH );
		KermetaUnit kermetaUnit = KermetaUnitHelper.getKermetaUnitFromObject(cd);
		return KermetaUnitHelper.getAspects(kermetaUnit, cd);
	}*/
	
	static public TypeVariable getTypeVariable(ClassDefinition cd, String name) {
		for ( TypeVariable tv : cd.getTypeParameter() )
			if ( tv.getName().equals(name) )
				return tv;
		return null;
	}
}
