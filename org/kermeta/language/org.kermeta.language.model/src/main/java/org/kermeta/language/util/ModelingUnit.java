/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 24 sept. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.util;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.language.structure.Metamodel;

/**
 * Group of Metamodel
 * This class allows to manipulates a set of AbastractMetamodels (ie. kermeta root elements) as a single object
 *
 */
public class ModelingUnit {
	
	protected List<Metamodel> metamodels = null; 
	
	public ModelingUnit(){
		metamodels = new ArrayList<Metamodel>();
	}

	public ModelingUnit(List<Metamodel> metamodels){
		metamodels = new ArrayList<Metamodel>();
		this.metamodels.addAll(metamodels);
	}
	
	public List<Metamodel> getMetamodels() {
		if(metamodels == null) metamodels = new ArrayList<Metamodel>();
		return metamodels;
	}

}
