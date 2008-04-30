/*$Id: KSourceLookupDirector.java,v 1.3 2008-04-30 13:58:47 ftanguy Exp $
* Project : org.kermeta.runner
* File : 	KSourceLookupDirector.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner.launching;

import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant;

/**
 * Kermeta source lookup director. For Kermeta source lookup there is one source
 * lookup participant. 
 */
public class KSourceLookupDirector extends AbstractSourceLookupDirector {
	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.core.sourcelookup.ISourceLookupDirector#initializeParticipants()
	 */
	public void initializeParticipants() {
		addParticipants(new ISourceLookupParticipant[]{new KSourceLookupParticipant()});
	}
}
