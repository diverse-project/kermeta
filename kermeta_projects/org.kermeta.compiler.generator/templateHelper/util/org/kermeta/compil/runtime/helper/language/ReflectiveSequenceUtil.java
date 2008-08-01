
package org.kermeta.compil.runtime.helper.language;

import org.eclipse.emf.common.util.EList;

import kermeta.language.ReflectiveCollection;
import kermeta.language.ReflectiveSequence;


public class ReflectiveSequenceUtil {

	/** Implementation of method addAt called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.addAt(index, element)
	 */
	public static <G> void addAt(java.lang.Object self, java.lang.Integer param0, G element) {
		if( self instanceof ReflectiveSequence ) {
			//TODO
		} else if ( self instanceof EList ) {
			//TODO
		}
	}

	/** Implementation of method removeAt called as :
	 * extern fr::irisa::triskell::kermeta::runtime::language::ReflectiveSequence.removeAt(index)
	 */
	public static <G> void removeAt(ReflectiveSequence<G> self, java.lang.Integer param0) {
		if( self instanceof ReflectiveSequence ) {
			//TODO
		} else if ( self instanceof EList ) {
			//TODO
		}
	}
	
}
/* END OF FILE */
