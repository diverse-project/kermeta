/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Bjorn Freeman-Benson - initial API and implementation
 *******************************************************************************/
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
