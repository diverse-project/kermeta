/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import java.util.Collection;

import org.kermeta.kp.KermetaProject;
import org.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
 */
public interface PortKmWeaver {

    public ModelingUnit weave(Collection<ModelingUnit> mus, KermetaProject kp);

}
