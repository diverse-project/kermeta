/* Implementation of Kermeta base type Iterator */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Iterator {

	// Implementation of method hasNext called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Iterator::hasNext()
	public static KermetaObject hasNext(KermetaObject self) {
		if (getValue(self).hasNext()) return Boolean.TRUE;
		else return Boolean.FALSE;
	}

	// Implementation of method next called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Iterator::next()
	public static KermetaObject next(KermetaObject self) {
		return (KermetaObject)getValue(self).next();
	}

	public static java.util.Iterator getValue(KermetaObject iterator) {
		if (!iterator.getData().containsKey("Iterator")) setValue(iterator, new ArrayList().iterator());
		return (java.util.Iterator)iterator.getData().get("Iterator");
	}
	
	public static void setValue(KermetaObject iterator, java.util.Iterator it) {
		iterator.getData().put("Iterator", it);
	}

}
/* END OF FILE */
