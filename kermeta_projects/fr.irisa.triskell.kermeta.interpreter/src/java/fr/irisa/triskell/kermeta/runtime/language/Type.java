/* $Id: Type.java,v 1.2 2008-04-28 11:50:57 ftanguy Exp $
* Project : Kermeta interpreter
* File : Type.java
* License : EPL
* Copyright : IRISA / INRIA
* ----------------------------------------------------------------------------
* Creation date : 11 nov. 2007
* Authors : Didier Vojtisek 
*/
package fr.irisa.triskell.kermeta.runtime.language;

import fr.irisa.triskell.kermeta.interpreter.KermetaRaisedException;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.typechecker.SimpleType;

/**
 * Implementation of the extern of the class Type in Kermeta framework
 * it does the mapping with fr.irisa.triskell.kermeta.language.structure.Type and its kermeta version
 */
public class Type {


	// Implementation of method cloneObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Type.hasSubType(object)
	/**
	 * note: it is able to say if a type is a subtype of another
	 * current implementation relies on KCoreObject, this means that it works only if the type object comes from
	 * a kermeta definition (ie. in a require) It won't work with types created by the user 
	 */
	public static RuntimeObject hasSubType(RuntimeObject self, RuntimeObject object) {
		fr.irisa.triskell.kermeta.language.structure.Type req = (fr.irisa.triskell.kermeta.language.structure.Type)self.getKCoreObject();
		fr.irisa.triskell.kermeta.language.structure.Type pro = (fr.irisa.triskell.kermeta.language.structure.Type)object.getKCoreObject();
		
		if(req == null|| pro == null){
			// not implemented the current version works only with declared Types, user created types are not handled yet
			throw KermetaRaisedException.createKermetaException("kermeta::exceptions::NotImplementedException",
	        		"the current version of hasSubType works only with declared Types, user created types are not handled yet",
					self.getFactory().getMemory().getInterpreter().getBasicInterpreter(),
					self.getFactory().getMemory(),
					null,
					null);
		}
		SimpleType required = new SimpleType(req, self.getFactory().getMemory().getTypeCheckerContext());
		SimpleType provided = new SimpleType(pro, self.getFactory().getMemory().getTypeCheckerContext());
		
		if (provided.isSubTypeOf(required)) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;
	}
}
