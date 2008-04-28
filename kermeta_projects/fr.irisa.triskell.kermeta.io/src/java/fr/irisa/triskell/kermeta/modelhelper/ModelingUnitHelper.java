

/*$Id: ModelingUnitHelper.java,v 1.5 2008-04-28 11:50:17 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.io
* File : 	ModelingHelper.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 11 juil. 07
* Authors : Francois Tanguy ftanguy@irisa.fr
*/

package fr.irisa.triskell.kermeta.modelhelper;

import java.util.List;

import org.kermeta.io.KermetaUnit;

import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.Tag;

/**
 * 
 * 
 * TODO move these operations to the ModelingUnitHelper class in the kermeta.model package
 * 
 * @author paco
 *
 */
public class ModelingUnitHelper {

	//////////////////////////////
	//////////////////////////////
	//		Main Operation		//
	//////////////////////////////
	//////////////////////////////
	
	static public String getMainOperationValue(KermetaUnit kermetaUnit) {
		return getMainOperationValue( kermetaUnit.getModelingUnit() );
	}
	
	static public String getMainOperationValue(ModelingUnit modelingUnit) {
		Tag t = getMainOperation(modelingUnit);
		if ( t != null )
			return t.getValue();
		return null;
	}
	
	static public Tag getMainOperation(KermetaUnit kermetaUnit) {
		return getMainOperation( kermetaUnit.getModelingUnit() );
	}
	
	/**
	 * 
	 * @param modelingUnit
	 * @return
	 */
	static public Tag getMainOperation(ModelingUnit modelingUnit) {
		for ( Tag tag : (List<Tag>) modelingUnit.getOwnedTags() ) {
			if ( (tag.getName() != null) && tag.getName().equals("mainOperation") )
				return tag;
		}
		return null;
	}
	
	/**
	 * 
	 * @param kermetaUnit
	 * @return
	 */
	static public String getMainOperationAsString(KermetaUnit kermetaUnit) {
		if( getMainOperation(kermetaUnit) != null ) {
			return getMainOperation(kermetaUnit).getValue();
		}
		return null;
	}
	
	/**
	 * 
	 * @param modelingUnit
	 * @return
	 */
	static public String getMainOperationAsString(ModelingUnit modelingUnit) {
		if( getMainOperation(modelingUnit) != null ) {
			return getMainOperation(modelingUnit).getValue();
		}
		return null;
	}
	
	//////////////////////////
	//////////////////////////
	//		Main Class		//
	//////////////////////////
	//////////////////////////
	
	static public String getMainClassValue(KermetaUnit kermetaUnit) {
		return getMainClassValue( kermetaUnit.getModelingUnit() );
	}
	
	static public String getMainClassValue(ModelingUnit modelingUnit) {
		Tag t = getMainClass(modelingUnit);
		if ( t != null )
			return t.getValue();
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
	
	/**
	 * 
	 * @param kermetaUnit
	 * @return
	 */
	static public String getMainClassAsString(KermetaUnit kermetaUnit) {
		if( getMainClass(kermetaUnit) != null ) {
			return getMainClass(kermetaUnit).getValue();
		}
		return null;
	}
	
	/**
	 * 
	 * @param modelingUnit
	 * @return
	 */
	static public String getMainClassAsString(ModelingUnit modelingUnit) {
		if( getMainClass(modelingUnit) != null ) {
			return getMainClass(modelingUnit).getValue();
		}
		return null;
	}
	
}


