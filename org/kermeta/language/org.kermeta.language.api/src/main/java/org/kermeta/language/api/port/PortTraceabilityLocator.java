/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api.port;

import java.util.Collection;
import org.kermeta.traceability.Reference;
import org.kermeta.traceability.TraceModel;

/**
 *
 * @author ffouquet
 */
public interface PortTraceabilityLocator {

    //TODO SEMANTIQUE SI VIDE - ASYNC - RAPPELER PLUS TARD
    //TODO FAIRE MECANISME TTL
    public Collection<Reference> getSourceReferences(Reference target);
    public Collection<Reference> getTargetReferences(Reference source);
    public TraceModel getRelatedTraces(Reference source);

}
