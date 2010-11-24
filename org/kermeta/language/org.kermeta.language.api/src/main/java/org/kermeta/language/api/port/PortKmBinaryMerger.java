/* $Id:$ 
 * Creation : November, 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek
 */

package org.kermeta.language.api.port;

import org.kermeta.language.structure.ModelingUnit;

/**
 * This service offers to merge 2 ModelingUnits into a single one
 */
public interface PortKmBinaryMerger {

    public ModelingUnit merge(ModelingUnit first_mu, ModelingUnit second_mu);
}
