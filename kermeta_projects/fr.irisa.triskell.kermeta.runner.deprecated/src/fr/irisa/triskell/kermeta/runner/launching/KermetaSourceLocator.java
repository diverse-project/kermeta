/* $Id: KermetaSourceLocator.java,v 1.7 2005-06-24 17:17:51 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaSourceLocator.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 24, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IPersistableSourceLocator;
import org.eclipse.debug.core.model.ISourceLocator;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.sourcelookup.IPersistableSourceLocator2;

/**
 * 
 */
public class KermetaSourceLocator implements IPersistableSourceLocator {

    public KermetaSourceLocator()
    {
        super();
    }
    
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
        System.out.println("TODO : implement initializeFromMemento("+memento+")");

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.IPersistableSourceLocator#initializeDefaults(org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeDefaults(ILaunchConfiguration configuration)
            throws CoreException {
        System.out.println("initializeDefaults in KermetaSourceLocator");
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISourceLocator#getSourceElement(org.eclipse.debug.core.model.IStackFrame)
     */
    public Object getSourceElement(IStackFrame stackFrame) {
        return stackFrame;
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.sourcelookup.IPersistableSourceLocator2#initializeFromMemento(java.lang.String, org.eclipse.debug.core.ILaunchConfiguration)
     */
    public void initializeFromMemento(String memento, ILaunchConfiguration configuration) throws CoreException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.sourcelookup.IPersistableSourceLocator2#dispose()
     */
    public void dispose() {
        System.err.println("Dispose kermeta source locator!");
        // TODO Auto-generated method stub
        
    }

}
