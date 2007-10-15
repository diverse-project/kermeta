/* $Id: Iterator.java,v 1.2 2007-10-15 07:13:58 barais Exp $
 * Implementation of Kermeta base type Iterator 
 */

package fr.irisa.triskell.kermeta.runtime.basetypes;

import java.util.ArrayList;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Iterator {

	// Implementation of method hasNext called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Iterator::hasNext()
	public static RuntimeObject hasNext(RuntimeObject self) {
		if (getValue(self).hasNext()) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}

	// Implementation of method next called as :
	// extern fr::irisa::triskell::kermeta::runtime::basetypes::Iterator::next()
	public static RuntimeObject next(RuntimeObject self) {
		return (RuntimeObject)getValue(self).next();
	}

	public static java.util.Iterator getValue(RuntimeObject iterator) {
		if (!RuntimeObject.ITERATOR_VALUE.equals(iterator.getPrimitiveType()))
			setValue(iterator, new ArrayList().iterator());
		return (java.util.Iterator)iterator.getJavaNativeObject();
	}
	
	public static void setValue(RuntimeObject iterator, java.util.Iterator it) {
		iterator.setPrimitiveType(RuntimeObject.ITERATOR_VALUE);
		iterator.setJavaNativeObject( it);
	}

}
/* END OF FILE */
