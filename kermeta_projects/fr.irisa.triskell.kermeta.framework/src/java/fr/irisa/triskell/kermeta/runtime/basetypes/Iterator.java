/* $Id: Iterator.java,v 1.6 2005-03-22 10:58:15 zdrey Exp $
 * Implementation of Kermeta base type Iterator 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Iterator {

	// Implementation of method hasNext called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Iterator::hasNext()
	public static RuntimeObject hasNext(RuntimeObject self) {
		if (getValue(self).hasNext()) return Boolean.TRUE;
		else return Boolean.FALSE;
	}

	// Implementation of method next called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Iterator::next()
	public static RuntimeObject next(RuntimeObject self) {
		return (RuntimeObject)getValue(self).next();
	}

	public static java.util.Iterator getValue(RuntimeObject iterator) {
		if (!iterator.getData().containsKey("Iterator")) setValue(iterator, new ArrayList().iterator());
		return (java.util.Iterator)iterator.getData().get("Iterator");
	}
	
	public static void setValue(RuntimeObject iterator, java.util.Iterator it) {
		iterator.getData().put("Iterator", it);
	}

}
/* END OF FILE */
