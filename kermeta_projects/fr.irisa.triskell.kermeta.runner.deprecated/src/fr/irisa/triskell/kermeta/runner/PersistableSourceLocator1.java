/* $Id: PersistableSourceLocator1.java,v 1.1 2005-05-24 17:07:37 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: PersistableSourceLocator1.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 24, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IPersistableSourceLocator;
import org.eclipse.debug.core.model.IStackFrame;

/**
 * 
 */
public class PersistableSourceLocator1 implements IPersistableSourceLocator {

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IPersistableSourceLocator#getMemento()
     */
    public String getMemento() throws CoreException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IPersistableSourceLocator#initializeFromMemento(java.lang.String)
     */
    public void initializeFromMemento(String memento) throws CoreException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IPersistableSourceLocator#initializeDefaults(org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeDefaults(ILaunchConfiguration configuration)
            throws CoreException {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISourceLocator#getSourceElement(org.eclipse.debug.core.model.IStackFrame)
     */
    public Object getSourceElement(IStackFrame stackFrame) {
        // TODO Auto-generated method stub
        return null;
    }

}
