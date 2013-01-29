/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 15 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.merger.binarymerger.api;


import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;


public interface KmBinaryMerger {
	
	
	/**
     * will merge two ModelingUnit into a single ModelingUnit with the classic kermeta merge strategy
     * @param first_mu
     * @param second_mu
     * @return
     */
    public abstract ErrorProneResult<ModelingUnit> merge(ModelingUnit first_mu, ModelingUnit second_mu);
    
    /**
     * will merge two ModelingUnit into a single ModelingUnit using the generic strategy
     * This strategy works only on highly identical models like duplicated metamodel imports
     * @param first_mu
     * @param second_mu
     * @return
     */
    public abstract ErrorProneResult<ModelingUnit> genericMerge(ModelingUnit first_mu, ModelingUnit second_mu);
}
