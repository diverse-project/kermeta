/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.port.api;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import java.util.Collection;

/**
 *
 * @author ffouquet
 */
public interface PortTypeResolver {

    public TypeDefinition getTypeDefinitionFromFullName(String qualifiedName);
    public Collection<TypeDefinition> getTypeDefinitionFromQuery(String beginName);

    

}
