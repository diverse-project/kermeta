/* Implementation of Kermeta base type OrderedCollection */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class OrderedCollection {

	// Implementation of method addAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::OrderedCollection::addAt(index, element)
	public static KermetaObject addAt(KermetaObject self, KermetaObject param0, KermetaObject param1) {
		Collection.getArrayList(self).add(Integer.getValue(param0), param1);
		return Void.VOID;
	}

	// Implementation of method removeAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::OrderedCollection::removeAt(index)
	public static KermetaObject removeAt(KermetaObject self, KermetaObject param0) {
		Collection.getArrayList(self).remove(Integer.getValue(param0));
		return Void.VOID;
	}

	// Implementation of method elementAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::OrderedCollection::elementAt(index)
	public static KermetaObject elementAt(KermetaObject self, KermetaObject param0) {
		KermetaObject result = (KermetaObject)Collection.getArrayList(self).get(Integer.getValue(param0));
		return result;
	}


}
/* END OF FILE */
