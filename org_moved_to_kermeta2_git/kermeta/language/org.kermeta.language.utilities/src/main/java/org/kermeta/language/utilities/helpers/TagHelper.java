

/*$Id: TagHelper.java,v 1.4 2008-07-08 13:18:39 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	TagHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.language.utilities.helpers;

import org.kermeta.language.structure.KermetaModelElement;
import org.kermeta.language.structure.StructureFactory;
import org.kermeta.language.structure.Tag;

public class TagHelper {

	public final static String KERMETA_DOCUMENTATION = "documentation";
	
	public final static String KERMETA_EXECUTABLE= "executable";
	
	/** 
	 * This is a helper class containing static operations, cannot create instance of it
	 */
	private TagHelper(){		
	}
	
	static public Tag create(String value) {
		return create(KERMETA_DOCUMENTATION, value);
	}
	
	static public Tag create(String qualifiedName, String value) {
		assert(qualifiedName != null);
		assert(value != null);
		Tag tag = StructureFactory.eINSTANCE.createTag();
		tag.setName( qualifiedName );
		tag.setValue(value);
		return tag;
	}
	
	static public Tag getTag(KermetaModelElement o, String tagName) {
		for ( Tag t : o.getKOwnedTags() ){
			if ( t.getName() != null && t.getName().equals(tagName) ){
				return t;
			}
		}
		return null;
	}
	
}


