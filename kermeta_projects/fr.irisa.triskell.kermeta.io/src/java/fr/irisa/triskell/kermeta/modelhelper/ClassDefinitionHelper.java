/* $Id: ClassDefinitionHelper.java,v 1.16 2008-10-20 09:11:39 cfaucher Exp $
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.TypeDefinitionCacheEntry;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;

/**
 * this class proposes various helper functions that applies to ClassDefinition in the Kermeta model
 *
 */
public class ClassDefinitionHelper {
	
	// ---------------------------------
	// functions about inheritance
	// ---------------------------------

	/**
	 * Return true if supercls is a super class of cls
	 * @param supercls the Super class to which we compare cls
	 * @param cls the class to compare to the super class
	 * @return
	 */
/*	public static boolean isSuperClassOf(ClassDefinition supercls, ClassDefinition cls) {
		try {
			for(Type stype : cls.getSuperType()) {
				ClassDefinition scls = TypeHelper.getClassDefinition(stype);
				if (supercls == scls) return true;
				else if(isSuperClassOf(supercls, scls)) return true;
			}
			for ( TypeDefinition typeDefinition : TypeDefinitionHelper.getBaseAspects(cls) ) {
				if ( typeDefinition instanceof ClassDefinition ) {
					ClassDefinition c = (ClassDefinition) typeDefinition;
					if ( isSuperClassOf(supercls, c) )
						return true;
				}
			}
			for ( TypeDefinition typeDefinition : TypeDefinitionHelper.getBaseAspects(supercls) ) {
				if ( typeDefinition instanceof ClassDefinition ) {
					ClassDefinition c = (ClassDefinition) typeDefinition;
					if ( isSuperClassOf(c, cls) )
						return true;
				}
			}
			return false;
		} catch (StackOverflowError e) {
			System.out.println();
		}
		return false;
	}*/
	
	/**
	 * Return true if supercls is a super class of cls, retrieval by name
	 * be careful this look only in cls context (which means that if other aspect comes in from another require
	 * they will be ignore. You should rather use isSuperClassOfByName(ModelingUnit rootUnit, ClassDefinition supercls, ClassDefinition cls)
	 * for complete control of the search context
	 * @param supercls the Super class to which we compare cls
	 * @param cls the class to compare to the super class
	 * @return
	 * FIXME CF: this method is very ugly, it is a temp patch related to the restore connection in the graphical editor
	 */
	public static boolean isSuperClassOfByName(ClassDefinition supercls, ClassDefinition cls) {
		EObject root = EcoreUtil.getRootContainer(cls);
		// should be contained by a Modeling unit other wise raise an exception ...
		return isSuperClassOfByName((ModelingUnit) root, supercls,  cls);
			
	}
	
	public static boolean isSuperClassOfByName(ModelingUnit rootUnit, ClassDefinition supercls, ClassDefinition cls) {
		for(Object stype : cls.getSuperType()) {
			ClassDefinition scls = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stype).getTypeDefinition();
			if( supercls!=null && scls!=null ) {
				if (supercls.getName().equals(scls.getName())) return true;
				else if( isSuperTypeOf(rootUnit, supercls, scls)) return true;
			}
		}
		return false;
	}
	
	/**
	 * Variant that use the cache in the Kermeta unit rather than traversing the units
	 * @param rootUnit
	 * @param supercls
	 * @param cls
	 * @return
	 */
	public static boolean isSuperClassOfByName(KermetaUnit rootUnit, ClassDefinition supercls, ClassDefinition cls) {
		for(Object stype : cls.getSuperType()) {
			ClassDefinition scls = (ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class)stype).getTypeDefinition();
			if( supercls!=null && scls!=null ) {
				if (supercls.getName().equals(scls.getName())) return true;
				else if( isSuperTypeOf(rootUnit, supercls, scls)) return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Is superclass a super class of clazz ?
	 * @param superclass
	 * @param clazz
	 * @return true if super class is a super class of clazz, false otherwise.
	 */
	public static boolean isSuperTypeOf(ModelingUnit rootUnit, ClassDefinition superclass, ClassDefinition clazz) {		
		for(Type t : clazz.getSuperType()){
			// in the supertypes of clazz, search a class whose context contains superclass
			if(t instanceof Class){
				Class aSuperclass = (Class) t;
				if(aSuperclass.getTypeDefinition() instanceof ClassDefinition){
					
					List<TypeDefinition> asuperclassContext = getAspects(rootUnit, (ClassDefinition) aSuperclass.getTypeDefinition());
					// context contains aSuperclass and all its parents
					if(asuperclassContext.contains(superclass)) 
						return true;
				}
			}
		}
		
		return false;
	}
	
	public static boolean isSuperTypeOf(KermetaUnit rootUnit, ClassDefinition superclass, ClassDefinition clazz) {		
		for(Type t : clazz.getSuperType()){
			// in the supertypes of clazz, search a class whose context contains superclass
			if(t instanceof Class){
				Class aSuperclass = (Class) t;
				if(aSuperclass.getTypeDefinition() instanceof ClassDefinition){
					
					List<TypeDefinition> asuperclassContext = TypeDefinitionHelper.getAllAspects(rootUnit, KermetaModelHelper.ClassDefinition.qualifiedName( (ClassDefinition) aSuperclass.getTypeDefinition()));
					// context contains aSuperclass and all its parents
					if(asuperclassContext.contains(superclass)) 
						return true;
				}
			}
		}
		
		return false;
	}
	
	
	// ---------------------------------
	// functions about constraints
	// ---------------------------------	
		

	
	static public TypeVariable getTypeVariable(ClassDefinition cd, String name) {
		for ( TypeVariable tv : cd.getTypeParameter() )
			if ( tv.getName().equals(name) )
				return tv;
		return null;
	}
	
	/**
	 * Search in the KermetaUnit and its imported unit all matching TypeDefinition with the given QualifiedName
	 * @param rootUnit
	 * @param typeDefinitionQualifiedName
	 * @return
	 */
	static public List<TypeDefinition> getAspects(ModelingUnit rootUnit, ClassDefinition cd){
		return getAspects(rootUnit, KermetaModelHelper.ClassDefinition.qualifiedName(cd));
	}
	
	/**
	 * Search in the KermetaUnit and its imported unit all matching TypeDefinition with the given QualifiedName
	 * @param rootUnit
	 * @param typeDefinitionQualifiedName
	 * @return
	 */
	static public List<TypeDefinition> getAspects(ModelingUnit rootUnit, String typeDefinitionQualifiedName){
		List<TypeDefinition> result = new UniqueEList<TypeDefinition>();
		List<ModelingUnit> searchedUnits = ModelingUnitHelper.getAllImportedKermetaUnits(rootUnit);
		searchedUnits.add(rootUnit);
		for ( ModelingUnit importedUnit : searchedUnits ) {
			
			TypeDefinition td = ModelingUnitHelper.findContainedTypeDefinitionByQualifiedName(importedUnit, typeDefinitionQualifiedName);
			if(td != null)
				result.add(td);
		}
		return result;
	}
}
