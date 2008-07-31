
package org.kermeta.compil.runtime.helper.language;

import kermeta.language.ReflectiveCollection;


/**
 * Reflective collection is the java side (wrapper for add/remove/clear base methods
 * related to collection handling) of Kermeta reflective collections. A reflective
 * Collection is only used for properties (attributes/references) which type is
 * a (or a subtype of) set.
 */
public class ReflectiveCollectionUtil {

	/** Implementation of method add called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.add(element)
	*/
	public static <G> void add(ReflectiveCollection<G> self, G element) {
	}

	/** Implementation of method remove called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.remove(element)
	 */
	public static <G> void remove(ReflectiveCollection<G> self, G element) {
	}

	/** Implementation of method clear called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveCollection.clear() */
	public static void clear(ReflectiveCollection self) {
	}

}
/* END OF FILE */
