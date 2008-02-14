

/*$Id: MergePass.java,v 1.2 2008-02-14 07:12:56 uid21732 Exp $
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
	
}


