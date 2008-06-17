/* $Id: RuntimeObjectHelper.java,v 1.10 2008-06-17 13:04:54 dvojtise Exp $
 * Project   : Kermeta 
 * File      : RuntimeObjectHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 20 sept. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.runtime;

import org.kermeta.io.KermetaUnit;
import org.kermeta.model.KermetaModelHelper;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.modelhelper.ClassDefinitionHelper;

/**
 * this class contains many static operation that helps to deal with runtime object
 *
 */
public class RuntimeObjectHelper {
	
	
	/**
	 * Get the value linked to the given RuntimeObject, provided this object
	 * wraps a primitive type. Returns a String, Boolean, or Int value according
	 * to the primitive type wrapped by this runtime object.
	 * typical use :
	 * String objectName = (String) Runtime2EMF.getPrimitiveTypeValueFromRuntimeObject((RuntimeObject) roObject.getProperties().get("name"));
							
	 * @param robject
	 *            The runtime object of which we want the value
	 * @return the value of the primitive type wrapped by robject
	 */
	public static Object getPrimitiveTypeValueFromRuntimeObject(RuntimeObject robject) {
		String[] s_primitive_types = new String[] { "StringValue",
				"BooleanValue", "NumericValue", "CharacterValue" };
		for (int i = 0; i < s_primitive_types.length; i++)
			if (s_primitive_types[i].equals(robject.getPrimitiveType()))
				return robject.getJavaNativeObject();
		return null;
	}
	
	/**
	 * Returns true if the given RuntimeObject is a collection (Collection,
	 * ReflectiveCollection, ReflectiveSequence), false otherwise. We use this
	 * method since Collections that are void do not have a
	 * "CollectionArrayList" entry in their associated data hashtable (see
	 * RuntimeObject doc), so we can't test with this
	 * 
	 * @param robject
	 *            the object to test
	 * @return true if robject type is Collection, false otherwise
	 */
	public static boolean isaCollection(RuntimeObject robject) {
		boolean b = false;
		KermetaUnit kunit = robject.getFactory().getMemory().getUnit();
		ClassDefinition coll_cd = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::standard::Collection");
		fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class) robject
				.getMetaclass().getKCoreObject();
		if (KermetaModelHelper.ClassDefinition.isSuperTypeOf(coll_cd,
				(ClassDefinition) c.getTypeDefinition()))
			b = true;
		return b;
	}
	
	/**
	 * Returns true if the given RuntimeObject is an OrderedCollection (Collection,
	 * ReflectiveCollection, ReflectiveSequence), false otherwise. We use this
	 * method since Collections that are void do not have a
	 * "CollectionArrayList" entry in their associated data hashtable (see
	 * RuntimeObject doc), so we can't test with this
	 * 
	 * @param robject
	 *            the object to test
	 * @return true if robject type is Collection, false otherwise
	 */
	public static boolean isanOrderedCollection(RuntimeObject robject) {
		boolean b = false;
		KermetaUnit kunit = robject.getFactory().getMemory().getUnit();
		ClassDefinition coll_cd = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::standard::OrderedCollection");
		fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class) robject
				.getMetaclass().getKCoreObject();
		if (KermetaModelHelper.ClassDefinition.isSuperTypeOf(coll_cd,
				(ClassDefinition) c.getTypeDefinition()))
			b = true;
		return b;
	}
	
	
	public static boolean isanEnumerationLiteral(RuntimeObject robject) {
		boolean b = false;
		KermetaUnit kunit = robject.getFactory().getMemory().getUnit();
		ClassDefinition coll_cd = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::language::structure::EnumerationLiteral");
		fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class) robject
				.getMetaclass().getKCoreObject();
		if (coll_cd.equals(c.getTypeDefinition()))
			b = true;
		return b;
	}

	public static boolean isanEnumeration(RuntimeObject robject) {
		boolean b = false;
		KermetaUnit kunit = robject.getFactory().getMemory().getUnit();
		ClassDefinition coll_cd = (ClassDefinition) kunit.getTypeDefinitionByName(
						"kermeta::language::structure::Enumeration");
		fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class) robject
				.getMetaclass().getKCoreObject();
		if (coll_cd.equals(c.getTypeDefinition()))
			b = true;
		return b;
	}
	
	/**
	 * retrieves the ROproperty for this object
	 * very useful before using fr.irisa.triskell.kermeta.runtime.language.Object.set or fr.irisa.triskell.kermeta.runtime.language.Object.get
	 * on a runtimeObject
	 * @param robject
	 * @param propertyName
	 * @return
	 */
	public static RuntimeObject getPropertyByName(RuntimeObject robject, String propertyName){
		Property property = KermetaModelHelper.ClassDefinition.getPropertyByName((ClassDefinition) ((fr.irisa.triskell.kermeta.language.structure.Class) robject.getMetaclass().getKCoreObject()).getTypeDefinition(), propertyName);
		RuntimeObject roProperty = robject.getFactory().getMemory().getRuntimeObjectForFObject(property);
		return roProperty;
	}


	/**
	 * @param rObj
	 * @return
	 */
	public static boolean isKermetaBasicType(RuntimeObject rObj) {
		RuntimeObject mcRO = rObj.getMetaclass();
		KermetaUnit kunit = rObj.getFactory().getMemory().getUnit();

		ArrayList<ClassDefinition> l = new ArrayList<ClassDefinition>();
		
		ClassDefinition eLitCDef = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::language::structure::EnumerationLiteral");
		ClassDefinition boolCDef = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::standard::Boolean");
		ClassDefinition strCDef = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::standard::String");
		ClassDefinition charCDef = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::standard::Character");
		ClassDefinition intCDef = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::standard::Integer");
		ClassDefinition realCDef = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::standard::Real");
		ClassDefinition voidCDef = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::standard::Void");
		
		l.add(eLitCDef);
		l.add(boolCDef);
		l.add(strCDef);
		l.add(charCDef);
		l.add(intCDef);
		l.add(realCDef);
		l.add(voidCDef);
		
		fr.irisa.triskell.kermeta.language.structure.Class cl = (fr.irisa.triskell.kermeta.language.structure.Class) mcRO.getKCoreObject();
	    ClassDefinition cDef = (ClassDefinition) cl.getTypeDefinition();
	    
		return l.contains(cDef);
	}
}
