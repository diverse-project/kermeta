/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.merger.binarymerger.api;


import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.messagingsystem.api.ErrorProneResult;


public interface KmBinaryMerger {
	
	
	/**
     * will merge two ModelingUnit into a single ModelingUnit
     * @param first_mu
     * @param second_mu
     * @return
     */
    public abstract ErrorProneResult<ModelingUnit> merge(ModelingUnit first_mu, ModelingUnit second_mu);
}
