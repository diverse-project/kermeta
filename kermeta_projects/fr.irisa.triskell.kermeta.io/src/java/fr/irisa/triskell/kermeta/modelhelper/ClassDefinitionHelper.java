/* $Id: ClassDefinitionHelper.java,v 1.13 2008-02-14 07:13:18 uid21732 Exp $
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

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.Class;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
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
	public static boolean isSuperClassOf(ClassDefinition supercls, ClassDefinition cls) {
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
	
	// ---------------------------------
	// functions about constraints
	// ---------------------------------	
		

	
	static public TypeVariable getTypeVariable(ClassDefinition cd, String name) {
		for ( TypeVariable tv : cd.getTypeParameter() )
			if ( tv.getName().equals(name) )
				return tv;
		return null;
	}
}
