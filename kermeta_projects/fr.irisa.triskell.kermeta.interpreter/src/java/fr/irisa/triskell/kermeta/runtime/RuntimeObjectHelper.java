/* $Id: RuntimeObjectHelper.java,v 1.1 2006-09-20 12:07:13 dvojtise Exp $
 * Project   : Kermeta 
 * File      : RuntimeObjectHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 20 sept. 06
 * Authors       : dvojtise <dvojtise.irisa.fr>
 */
package fr.irisa.triskell.kermeta.runtime;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.loader.KermetaUnit;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit;

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
			if (robject.getData().containsKey(s_primitive_types[i]))
				return robject.getData().get(s_primitive_types[i]);
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
				.getMetaclass().getData().get("kcoreObject");
		if (kunit.isSuperClass(coll_cd,
				(ClassDefinition) c.getTypeDefinition()))
			b = true;
		return b;
	}
	
	
	public static boolean isanEnumerationLiteral(RuntimeObject robject) {
		boolean b = false;
		KermetaUnit kunit = robject.getFactory().getMemory().getUnit();
		ClassDefinition coll_cd = (ClassDefinition) kunit.getTypeDefinitionByName("kermeta::language::structure::EnumerationLiteral");
		fr.irisa.triskell.kermeta.language.structure.Class c = (fr.irisa.triskell.kermeta.language.structure.Class) robject
				.getMetaclass().getData().get("kcoreObject");
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
				.getMetaclass().getData().get("kcoreObject");
		if (coll_cd.equals(c.getTypeDefinition()))
			b = true;
		return b;
	}

}
