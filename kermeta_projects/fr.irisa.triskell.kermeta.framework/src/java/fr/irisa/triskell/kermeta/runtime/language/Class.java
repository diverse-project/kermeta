/* Implementation of Kermeta base type Class */

package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.runtime.KermetaObject;

public class Class {

	// Implementation of method newObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Class.newObject()
	public static KermetaObject newObject(KermetaObject self) {
		return self.getFactory().createKermetaObject(self);
	}


}
/* END OF FILE */
