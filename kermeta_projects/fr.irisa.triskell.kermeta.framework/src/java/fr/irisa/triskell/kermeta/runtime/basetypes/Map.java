/* Implementation of Kermeta base type Map */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Map {

	// Implementation of method keyIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.keysIterator()
	public static KermetaObject keysIterator(KermetaObject self) {
	    KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
		Iterator.setValue(result, getHashtable(self).keySet().iterator());
		return result;
	}

	// Implementation of method valueIterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.valueIterator()
	public static KermetaObject valueIterator(KermetaObject self) {
	    KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
	    Iterator.setValue(result, getHashtable(self).values().iterator());
	    return result;
	}

	// Implementation of method get called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.get(key)
	public static KermetaObject get(KermetaObject self, KermetaObject param0) {
	    KermetaObject result = (KermetaObject)getHashtable(self).get(param0);
		return result;
	}

	// Implementation of method put called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.put(key, value)
	public static KermetaObject put(KermetaObject self, KermetaObject key, KermetaObject value) {
		getHashtable(self).put(key, value);
		return Void.VOID;
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Map.remove(key)
	public static KermetaObject remove(KermetaObject self, KermetaObject param0) {
	    getHashtable(self).remove(param0);
		return Void.VOID;
	}

	public static Hashtable getHashtable(KermetaObject map) {
		if (!map.getData().containsKey("Hashtable")) map.getData().put("Hashtable", new Hashtable());
		return (Hashtable)map.getData().get("Hashtable");
	}


}
/* END OF FILE */
