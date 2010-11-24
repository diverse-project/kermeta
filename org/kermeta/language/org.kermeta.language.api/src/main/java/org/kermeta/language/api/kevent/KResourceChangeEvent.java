/* $Id: $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 sept. 2010
 * Authors : 
 *          Marie Gouyette <marie.gouyette@inria.fr> 
 *          
 */
package org.kermeta.language.api.kevent;

/**
 * This class manages events that represents a change on a resource.
 * @author mgouyett
 *
 */
public class KResourceChangeEvent extends KEvent {

    /**
     * This enumeration presents the resource modification type.
     */
    protected enum ChangeType {

        ADDED, REMOVED, CHANGED
    };
    /**
     * Type of the change (ADDED, REMOVED or CHANGED)
     */
    protected ChangeType type;

    /**
     * Constructor
     * @param qualifiedName : qualifiedName of element on which event appear
     * @param id : id of the changed resource
     */
    public KResourceChangeEvent(String id, ChangeType changeType) {
        //super(URI);
        setURI(id);

        this.type = changeType;
        // TODO Auto-generated constructor stub
    }
}
