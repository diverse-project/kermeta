
package org.kermeta.compil.runtime.helper.language;


/**
 * Implementation of the extern of the class Type in Kermeta framework
 * it does the mapping with fr.irisa.triskell.kermeta.language.structure.Type and its kermeta version
 */
public class TypeUtil {


	// Implementation of method cloneObject called as :
	// extern fr::irisa::triskell::kermeta::runtime::language::Type.hasSubType(object)
	/**
	 * note: it is able to say if a type is a subtype of another
	 * current implementation relies on KCoreObject, this means that it works only if the type object comes from
	 * a kermeta definition (ie. in a require) It won't work with types created by the user 
	 */
	public static java.lang.Boolean hasSubType(kermeta.language.structure.Type self, kermeta.language.structure.Object object) {
		return null;
	}
}
