/* Implementation of Kermeta base type Class */

package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public class Class {

	// Implementation of method newObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Class.newObject()
	public static RuntimeObject newObject(RuntimeObject self) {
		return self.getFactory().createRuntimeObject(self);
	}


}
/* END OF FILE */
