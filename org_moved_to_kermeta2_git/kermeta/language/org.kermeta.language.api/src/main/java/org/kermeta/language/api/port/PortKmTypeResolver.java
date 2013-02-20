/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import java.util.Collection;
import org.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
 */
public interface PortKmTypeResolver {

    //VA CHERCHER LES TYPE LA OU C EST POSSIBLE
    public ModelingUnit processTypeSet(ModelingUnit unresolvedMU);
    public Collection<ModelingUnit> processTypeSet(Collection<ModelingUnit> unresolvedMUs);

}
