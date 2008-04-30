/*$Id: KSourceLookupParticipant.java,v 1.3 2008-04-30 13:58:47 ftanguy Exp $
* Project : org.kermeta.runner
* File : 	KSourceLookupParticipant.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 avr. 08
* Authors : ftanguy
*/
package org.kermeta.runner.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
import org.kermeta.runner.model.KStackFrame;

/**
 * The Kermeta source lookup participant knows how to translate a 
 * Kermeta stack frame into a source file name 
 */
public class KSourceLookupParticipant extends AbstractSourceLookupParticipant {
	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.core.sourcelookup.ISourceLookupParticipant#getSourceName(java.lang.Object)
	 */
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof KStackFrame) {
			return ((KStackFrame)object).getSourceName();
			//return ((KStackFrame)object).getDisplayString();
		}
		return null;
	}
}
