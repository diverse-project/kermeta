/* Implementation of Kermeta base type Map */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Map {

	// Implementation of method keyIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.keysIterator()
	public static RuntimeObject keysIterator(RuntimeObject self) {
	    RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
		Iterator.setValue(result, getHashtable(self).keySet().iterator());
		return result;
	}

	// Implementation of method valueIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.valueIterator()
	public static RuntimeObject valueIterator(RuntimeObject self) {
	    RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
	    Iterator.setValue(result, getHashtable(self).values().iterator());
	    return result;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.get(key)
	public static RuntimeObject get(RuntimeObject self, RuntimeObject param0) {
	    RuntimeObject result = (RuntimeObject)getHashtable(self).get(param0);
		return result;
	}

	// Implementation of method put called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.put(key, value)
	public static RuntimeObject put(RuntimeObject self, RuntimeObject key, RuntimeObject value) {
		getHashtable(self).put(key, value);
		return Void.VOID;
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.remove(key)
	public static RuntimeObject remove(RuntimeObject self, RuntimeObject param0) {
	    getHashtable(self).remove(param0);
		return Void.VOID;
	}

	public static Hashtable getHashtable(RuntimeObject map) {
		if (!map.getData().containsKey("Hashtable")) map.getData().put("Hashtable", new Hashtable());
		return (Hashtable)map.getData().get("Hashtable");
	}


}
/* END OF FILE */
