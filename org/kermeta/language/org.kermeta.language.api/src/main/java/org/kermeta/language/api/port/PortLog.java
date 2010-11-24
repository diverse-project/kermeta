/* $Id$
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 6 aout 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.language.api.port;

import org.kermeta.language.api.messaging.UnifiedMessage;

/**
 * Definition of the API for sending message to a Logger
 * Any UnifiedMessage can be logged
 */
public interface PortLog {
	
	/** process a Message that must be kept in a log
	 */
	public void log (UnifiedMessage message); 

}

