/* Implementation of Kermeta base type Map */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

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
		Integer.setValue(result, getKeyHashtable(self).size());
		return result;
	}

	// Implementation of method keyIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.keysIterator()
	public static RuntimeObject keysIterator(RuntimeObject self) {
	    RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
		Iterator.setValue(result, getKeyHashtable(self).values().iterator());
		return result;
	}

	// Implementation of method valueIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.valueIterator()
	public static RuntimeObject valueIterator(RuntimeObject self) {
	    RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
	    Iterator.setValue(result, getKeyContentHashtable(self).values().iterator());
	    return result;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.get(key)
	public static RuntimeObject get(RuntimeObject self, RuntimeObject param0) {
	    RuntimeObject result = (RuntimeObject)getKeyContentHashtable(self).get(param0.getData().get("Value"));
		return result;
	}

	// Implementation of method put called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.put(key, value)
	public static RuntimeObject put(RuntimeObject self, RuntimeObject key, RuntimeObject value) {
		getKeyHashtable(self).put(key.getData().get("Value"),key);
		getKeyContentHashtable(self).put(key.getData().get("Value"),value);
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.remove(key)
	public static RuntimeObject remove(RuntimeObject self, RuntimeObject param0) {
	    getKeyHashtable(self).remove(param0.getData().get("Value"));
	    getKeyContentHashtable(self).remove(param0.getData().get("Value"));
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method clear called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.clear(self)
	public static RuntimeObject clear(RuntimeObject self) {
	    getKeyHashtable(self).clear();
	    getKeyContentHashtable(self).clear();
		return self.getFactory().getMemory().voidINSTANCE;
	}


	public static Hashtable getKeyHashtable(RuntimeObject map) {
		if (!map.getData().containsKey("Hashtable")) map.getData().put("Hashtable", new Hashtable());
		return (Hashtable)map.getData().get("Hashtable");
	}


	public static Hashtable getKeyContentHashtable(RuntimeObject map) {
		if (!map.getData().containsKey("KeyContentHashtable")) map.getData().put("KeyContentHashtable", new Hashtable());
		return (Hashtable)map.getData().get("KeyContentHashtable");
	}

}
/* END OF FILE */
