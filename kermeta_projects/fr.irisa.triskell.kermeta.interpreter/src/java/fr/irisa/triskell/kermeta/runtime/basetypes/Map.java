/* $Id: Map.java,v 1.11 2007-10-15 07:13:58 barais Exp $
 * Project : Kermeta interpreter
 * File : Map.java
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Mars 14, 2005
 * Authors : 
 * 		Franck Fleurey <ffleurey@irisa.fr>
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
//import fr.irisa.triskell.kermeta.language.structure.FClass;
import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;

/** Implementation of Kermeta base type Map  
 * to be used via an extern call in Kermeta */
public class Map {
	
	/**
	 * IMPORTANT README
	 * 
	 * two hashtables are used in java to implement the hashtable<K,V> of kermeta
	 * 
	 * when using a hahstable<String><Integer> and doing the sequence
	 * 	put("key", 333)
	 *  get("key")
	 *  
	 *  "key" is generally not the same RuntimeObject because it is used in
	 *  different methods, it comes from a variable, and so on
	 *  
	 *  But when accessing the getData().get("Value") you should find the same
	 *  "key" java String.
	 *  
	 *  So, the content of the runtimeObject (ro.getData().get("Value") is used
	 *  as entry both to get the ro available keys in KeyHashtable and ro values
	 *  in KeyContentHahstable. 
	 *
	 */

	// Implementation of method size called as :
	public static RuntimeObject size(RuntimeObject self) {
	    RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getHashtable(self).size());
		return result;
	}

	// Implementation of method keyIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.keysIterator()
	public static RuntimeObject keysIterator(RuntimeObject self) {
	
		fr.irisa.triskell.kermeta.language.structure.Class it_class = StructureFactory.eINSTANCE.createClass();
	    
	    it_class.setTypeDefinition((ClassDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Iterator"));
	    
	    TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
	    
	    binding.setVariable((ObjectTypeVariable)it_class.getTypeDefinition().getTypeParameter().get(0));
	    
	    fr.irisa.triskell.kermeta.language.structure.Class self_class = (fr.irisa.triskell.kermeta.language.structure.Class)self.getMetaclass().getKCoreObject();
	    
	    binding.setType(((TypeVariableBinding)self_class.getTypeParamBinding().get(0)).getType());
	    
	    it_class.getTypeParamBinding().add(binding);
	    
	    RuntimeObject result = self.getFactory().createRuntimeObjectFromClass(self.getFactory().createMetaClass(it_class));
		
		Iterator.setValue(result, getHashtable(self).keySet().iterator());
		return result;
		
	}

	// Implementation of method valueIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.valueIterator()
	public static RuntimeObject valueIterator(RuntimeObject self) {
	    

		fr.irisa.triskell.kermeta.language.structure.Class it_class = StructureFactory.eINSTANCE.createClass();
	    
	    it_class.setTypeDefinition((ClassDefinition)self.getFactory().getMemory().getUnit().getTypeDefinitionByQualifiedName("kermeta::standard::Iterator"));
	    
	    TypeVariableBinding binding = StructureFactory.eINSTANCE.createTypeVariableBinding();
	    
	    binding.setVariable((ObjectTypeVariable)it_class.getTypeDefinition().getTypeParameter().get(0));
	    
	    fr.irisa.triskell.kermeta.language.structure.Class self_class = (fr.irisa.triskell.kermeta.language.structure.Class)self.getMetaclass().getKCoreObject();
	    
	    binding.setType(((TypeVariableBinding)self_class.getTypeParamBinding().get(1)).getType());
	    
	    it_class.getTypeParamBinding().add(binding);
	    
	    RuntimeObject result = self.getFactory().createRuntimeObjectFromClass(self.getFactory().createMetaClass(it_class));
		
		Iterator.setValue(result, getHashtable(self).values().iterator());
		return result;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.get(key)
	public static RuntimeObject get(RuntimeObject self, RuntimeObject param0) {
	    RuntimeObject result = (RuntimeObject)getHashtable(self).get(param0);
		if (result == null) result = self.getFactory().getMemory().voidINSTANCE;
	    return result;
	}

	// Implementation of method put called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.put(key, value)
	public static RuntimeObject put(RuntimeObject self, RuntimeObject key, RuntimeObject value) {
		getHashtable(self).put(key,value);
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.remove(key)
	public static RuntimeObject remove(RuntimeObject self, RuntimeObject param0) {
	    getHashtable(self).remove(param0);
	    
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method clear called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.clear(self)
	public static RuntimeObject clear(RuntimeObject self) {
	    getHashtable(self).clear();
		return self.getFactory().getMemory().voidINSTANCE;
	}


	public static Hashtable<RuntimeObject,RuntimeObject> getHashtable(RuntimeObject map) {
		
		if (!RuntimeObject.HASHTABLE_VALUE.equals(map.getPrimitiveType()))
		{
			map.setPrimitiveType(RuntimeObject.HASHTABLE_VALUE);
			map.setJavaNativeObject(new Hashtable<RuntimeObject,RuntimeObject>());
		}
		return (Hashtable<RuntimeObject,RuntimeObject>)map.getJavaNativeObject();
	}

}
/* END OF FILE */
