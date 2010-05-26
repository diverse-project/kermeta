/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
 */
public interface PortKmMerger {

    public ModelingUnit merge(ModelingUnit muf,ModelingUnit mus);

}
