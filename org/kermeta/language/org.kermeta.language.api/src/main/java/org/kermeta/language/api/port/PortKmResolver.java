/* $Id:$ 
 * Creation : November, 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek
 */
package org.kermeta.language.api.port;

import org.kermeta.language.api.result.ModelingUnitResult;
import org.kermeta.language.structure.ModelingUnit;

/**
 ** This service offers to resolve and to set static types of a ModelingUnit
 */
public interface PortKmResolver {

    public ModelingUnitResult resolve(ModelingUnit mu);

}
