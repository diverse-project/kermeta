

/*$Id: TagHelper.java,v 1.3 2008-04-28 11:50:14 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.model
* File : 	TagHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 18 déc. 07
* Authors : paco
*/

package org.kermeta.model.internal;

import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;

public class TagHelper {

	public final static String KERMETA_DOCUMENTATION = "documentation";
	
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
	
	static public Tag getTag(Object o, String tagName) {
		for ( Tag t : o.getOwnedTags() )
			if ( t.getName() != null && t.getName().equals(tagName) )
				return t;
		return null;
	}
	
}


