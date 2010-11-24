/* $Id: $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 1 sept. 2010
 * Authors : 
 *          Marie Gouyette <marie.gouyette@inria.fr> 
 *          Haja Rambelontsalama <hajanirina-johary.rambelontsalama@inria.fr>
 */
package org.kermeta.language.api.port;

import org.kermeta.language.api.kevent.KEvent;

/**
 * Definition of the API to send any event to a component that manages it and to the adequate associated action.
 * @author mgouyett
 * We can send any KEvent.
 */
public interface PortKEvent {
	
	/**
	 * Treat and associate an action to the given KEvent in parameters.
	 * @param event : the event to treat
	 */
	public void processKEvent(KEvent event);
}

