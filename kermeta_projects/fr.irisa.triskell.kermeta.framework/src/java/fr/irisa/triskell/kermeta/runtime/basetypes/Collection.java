/* Implementation of Kermeta base type Collection */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Collection {

	// Implementation of method add called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::add(element)
	public static KermetaObject add(KermetaObject self, KermetaObject param0) {
		getArrayList(self).add(param0);
		return Void.VOID;
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::remove(element)
	public static KermetaObject remove(KermetaObject self, KermetaObject param0) {
		getArrayList(self).remove(param0);
		return Void.VOID;
	}

	// Implementation of method clear called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::clear()
	public static KermetaObject clear(KermetaObject self) {
		getArrayList(self).clear();
		return Void.VOID;
	}

	// Implementation of method size called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::size()
	public static KermetaObject size(KermetaObject self) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getArrayList(self).size());
		return result;
	}

	// Implementation of method iterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::iterator()
	public static KermetaObject iterator(KermetaObject self) {
		KermetaObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
		Iterator.setValue(result, getArrayList(self).iterator());
		return result;
	}

	public static ArrayList getArrayList(KermetaObject collection) {
		if (!collection.getData().containsKey("CollectionArrayList")) collection.getData().put("CollectionArrayList", new ArrayList());
		return (ArrayList)collection.getData().get("CollectionArrayList");
	}

}
/* END OF FILE */
