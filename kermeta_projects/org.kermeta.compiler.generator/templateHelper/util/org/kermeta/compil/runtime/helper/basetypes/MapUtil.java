
package org.kermeta.compil.runtime.helper.basetypes;

import java.util.Hashtable;

/** Implementation of Kermeta base type Map  
 * to be used via an extern call in Kermeta */
public class MapUtil {
	
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
	public static <K, V> java.lang.Integer size(kermeta.utils.Hashtable<K, V> self) {
		return null;
	}

	// Implementation of method keyIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.keysIterator()
	public static <K, V> kermeta.standard.Iterator<K> keysIterator(kermeta.utils.Hashtable<K, V> self) {
		return null;
		
	}

	// Implementation of method valueIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.valueIterator()
	public static <K, V> kermeta.standard.Iterator<V> valueIterator(kermeta.utils.Hashtable<K, V> self) {
		return null;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.get(key)
	public static <K, V> V get(kermeta.utils.Hashtable<K, V> self, K param0) {
	    return null;
	}

	// Implementation of method put called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.put(key, value)
	public static <K, V> void put(kermeta.utils.Hashtable<K, V> self, K key, V value) {
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.remove(key)
	public static <K, V> void remove(kermeta.utils.Hashtable<K, V> self, K param0) {
	}

	// Implementation of method clear called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.clear(self)
	public static <K, V> void clear(kermeta.utils.Hashtable<K, V> self) {
	}

}
/* END OF FILE */
