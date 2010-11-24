/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import org.kermeta.language.structure.ModelingUnit;

/**
 *
 * @author ffouquet
 */
public interface PortResourceLoader {
    
    public enum URIType {NSURI, FILE, INMEMORY};
    //MODELING UNIT NON TYPE RESOLVED
    public ModelingUnit load(String uri, URIType type, String optionalContent);

}
