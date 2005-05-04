/* Implementation of Kermeta base type Collection */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.ArrayList;
import java.util.Hashtable;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Collection {

	// Implementation of method add called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::add(element)
	public static RuntimeObject add(RuntimeObject self, RuntimeObject param0) {
	    getArrayList(self).add(param0);
		return Void.VOID;
	}

	// Implementation of method remove called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::remove(element)
	public static RuntimeObject remove(RuntimeObject self, RuntimeObject param0) {
		getArrayList(self).remove(param0);
		return Void.VOID;
	}

	// Implementation of method clear called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::clear()
	public static RuntimeObject clear(RuntimeObject self) {
		getArrayList(self).clear();
		return Void.VOID;
	}

	// Implementation of method size called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::size()
	public static RuntimeObject size(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Integer");
		Integer.setValue(result, getArrayList(self).size());
		return result;
	}

	// Implementation of method iterator called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Collection::iterator()
	public static RuntimeObject iterator(RuntimeObject self) {
		RuntimeObject result = self.getFactory().createObjectFromClassName("kermeta::standard::Iterator");
		Iterator.setValue(result, getArrayList(self).iterator());
		return result;
	}

	public static ArrayList getArrayList(RuntimeObject collection) {
		if (!collection.getData().containsKey("CollectionArrayList"))
		{
		    collection.getData().put("CollectionArrayList", new ArrayList());
		}
		return (ArrayList)collection.getData().get("CollectionArrayList");
	}

	public static RuntimeObject createCollection(RuntimeObject collectionType) {
		RuntimeObject result;
		RuntimeObject collectionMetaclass=(RuntimeObject)collectionType.getFactory().getClassDefTable().get("kermeta::standard::Collection");
		result=new RuntimeObject(collectionMetaclass.getFactory(),collectionMetaclass);
		result.setData(new Hashtable());
		result.getData().put("CollectionArrayList",new ArrayList());
		result.getProperties().put("typeParamBinding",collectionType);
		return result;
	}
}
/* END OF FILE */
