/* $Id:$ 
 * Creation : November, 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek
 */
package org.kermeta.language.api.port;

import java.util.Collection;

import org.kermeta.kp.KermetaProject;
import org.kermeta.language.structure.ModelingUnit;

/**
 ** This service offers to merge a collection of ModelingUnits into a single one
 */
public interface PortKmMerger {

    public ModelingUnit merge(Collection<ModelingUnit> mus);

}
