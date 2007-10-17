/* $Id: Iterator.java,v 1.1 2007-10-17 08:56:19 cfaucher Exp $
 * Implementation of Kermeta base type Iterator 
 */

package org.kermeta.compiler.basetypes;

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
