/* Implementation of Kermeta base type Map */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.structure.FClass;
import fr.irisa.triskell.kermeta.structure.FClassDefinition;
import fr.irisa.triskell.kermeta.structure.FTypeVariable;
import fr.irisa.triskell.kermeta.structure.FTypeVariableBinding;

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
	
		FClass it_class = self.getFactory().getMemory().getUnit().struct_factory.createFClass();
	    
	    it_class.setFClassDefinition((FClassDefinition)self.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::standard::Iterator"));
	    
	    FTypeVariableBinding binding = self.getFactory().getMemory().getUnit().struct_factory.createFTypeVariableBinding();
	    
	    binding.setFVariable((FTypeVariable)it_class.getFClassDefinition().getFTypeParameter().get(0));
	    
	    FClass self_class = (FClass)self.getMetaclass().getData().get("kcoreObject");
	    
	    binding.setFType(((FTypeVariableBinding)self_class.getFTypeParamBinding().get(0)).getFType());
	    
	    it_class.getFTypeParamBinding().add(binding);
	    
	    RuntimeObject result = self.getFactory().createRuntimeObjectFromClass(self.getFactory().createMetaClass(it_class));
		
		Iterator.setValue(result, getHashtable(self).keySet().iterator());
		return result;
		
	}

	// Implementation of method valueIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.valueIterator()
	public static RuntimeObject valueIterator(RuntimeObject self) {
	    

		FClass it_class = self.getFactory().getMemory().getUnit().struct_factory.createFClass();
	    
	    it_class.setFClassDefinition((FClassDefinition)self.getFactory().getMemory().getUnit().typeDefinitionLookup("kermeta::standard::Iterator"));
	    
	    FTypeVariableBinding binding = self.getFactory().getMemory().getUnit().struct_factory.createFTypeVariableBinding();
	    
	    binding.setFVariable((FTypeVariable)it_class.getFClassDefinition().getFTypeParameter().get(0));
	    
	    FClass self_class = (FClass)self.getMetaclass().getData().get("kcoreObject");
	    
	    binding.setFType(((FTypeVariableBinding)self_class.getFTypeParamBinding().get(1)).getFType());
	    
	    it_class.getFTypeParamBinding().add(binding);
	    
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


	public static Hashtable getHashtable(RuntimeObject map) {
		if (!map.getData().containsKey("Hashtable")) map.getData().put("Hashtable", new Hashtable());
		return (Hashtable)map.getData().get("Hashtable");
	}

}
/* END OF FILE */
