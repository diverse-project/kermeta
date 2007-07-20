

/*$Id: ModelingUnitHelper.java,v 1.2 2007-07-20 15:08:10 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ModelingHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 juil. 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.modelhelper;

import java.util.List;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Tag;

public class ModelingUnitHelper {

	static public Tag getMainOperation(KermetaUnit kermetaUnit) {
		return getMainOperation( kermetaUnit.getModelingUnit() );
	}
	
	static public Tag getMainOperation(ModelingUnit modelingUnit) {
		for ( Tag tag : (List<Tag>) modelingUnit.getOwnedTags() ) {
			if ( (tag.getName() != null) && tag.getName().equals("mainOperation") )
				return tag;
		}
		return null;
	}
	
	static public Tag getMainClass(KermetaUnit kermetaUnit) {
		return getMainClass( kermetaUnit.getModelingUnit() );
	}
	
	static public Tag getMainClass(ModelingUnit modelingUnit) {
		for ( Tag tag : (List<Tag>) modelingUnit.getOwnedTags() ) {
			if ( (tag.getName() != null) && tag.getName().equals("mainClass") )
				return tag;
		}
		return null;
	}
	
}


