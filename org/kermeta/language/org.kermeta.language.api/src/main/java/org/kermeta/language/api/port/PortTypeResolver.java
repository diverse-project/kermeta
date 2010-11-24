/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import java.util.Collection;
import org.kermeta.language.structure.TypeDefinition;

/**
 *
 * @author ffouquet
 */
public interface PortTypeResolver {

    public TypeDefinition getTypeDefinitionFromFullName(String qualifiedName);
    public Collection<TypeDefinition> getTypeDefinitionFromQuery(String beginName);

    

}
