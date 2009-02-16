

/*$Id: MergePass.java,v 1.3 2009-02-16 16:45:51 cfaucher Exp $
* Project : org.kermeta.merger
* File : 	MergePass.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 25 sept. 07
* Authors : paco
*/

package org.kermeta.merger.internal;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.Object;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.Tag;

abstract public class MergePass {

	protected KermetaUnit kermetaUnit;
	
	protected MergeContext context;
	
	public MergePass(KermetaUnit kermetaUnit, MergeContext context) {
		this.kermetaUnit = kermetaUnit;
		this.context = context;
	}
	
	abstract public void process();
	
	protected void createTags(Object newObject, Object o) {
		for ( Tag t : o.getOwnedTags() ) {
			Tag newTag = StructureFactory.eINSTANCE.createTag();
			newTag.setName( t.getName() );
			newTag.setValue( t.getValue() );
			newObject.getOwnedTags().add( newTag );
			newObject.getTag().add( newTag );
		}
	}
	
	protected void createTracedTags(Object newObject, Object o) {
		for ( Tag tag : o.getOwnedTags() ) {
			Tag newTag = StructureFactory.eINSTANCE.createTag();
			newTag.setName( tag.getName() );
			newTag.setValue( tag.getValue() );
			newObject.getTag().add( newTag );
			newObject.getOwnedTags().add( newTag );
			context.putBaseTag(newTag, tag);
			// Try to trace
			context.tryToTrace(newTag, tag);
		}
	}
	
}


