/* Implementation of Kermeta base type OrderedCollection */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class OrderedCollection {

	// Implementation of method addAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::OrderedCollection::addAt(index, element)
	public static RuntimeObject addAt(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		Collection.getArrayList(self).add(Integer.getValue(param0), param1);
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method removeAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::OrderedCollection::removeAt(index)
	public static RuntimeObject removeAt(RuntimeObject self, RuntimeObject param0) {
		Collection.getArrayList(self).remove(Integer.getValue(param0));
		return self.getFactory().getMemory().voidINSTANCE;
	}

	// Implementation of method elementAt called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::OrderedCollection::elementAt(index)
	public static RuntimeObject elementAt(RuntimeObject self, RuntimeObject param0) {
		RuntimeObject result = (RuntimeObject)Collection.getArrayList(self).get(Integer.getValue(param0));
		return result;
	}


}
/* END OF FILE */
