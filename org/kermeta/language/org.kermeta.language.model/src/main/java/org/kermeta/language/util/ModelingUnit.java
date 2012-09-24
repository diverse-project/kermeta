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

import org.kermeta.language.structure.AbstractMetamodel;

/**
 * Group of AbstractMetamodel
 * This class allows to manipulates a set of AbastractMetamodels (ie. kermeta root elements) as a single object
 *
 */
public class ModelingUnit {
	
	public List<AbstractMetamodel> metamodels; 
	
	ModelingUnit(List<AbstractMetamodel> metamodels){
		metamodels = new ArrayList<AbstractMetamodel>();
		this.metamodels.addAll(metamodels);
	}
	
}
