/* $Id: KermetaSourceLocator.java,v 1.1 2005-05-20 17:06:49 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaSourceLocator.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 * Notes :
 * This project is designed thanks to ATL open source plugin.
 */
package fr.irisa.triskell.kermeta.runner.launching;

import org.eclipse.debug.core.model.ISourceLocator;
import org.eclipse.debug.core.model.IStackFrame;

/**
 * This class is aimed at having the location of the source file to debug
 * <note>Eclipse documentation : "Source locators are typically implemented to work with a corresponding launch
 * configuration and launch configuration delegate"</note>
 */
public class KermetaSourceLocator implements ISourceLocator {

    /**
     * 
     */
    public KermetaSourceLocator() {
        super();
        System.out.println("Blouarb");
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see org.eclipse.debug.core.model.ISourceLocator#getSourceElement(org.eclipse.debug.core.model.IStackFrame)
     */
    public Object getSourceElement(IStackFrame stackFrame) {
        
        // TODO Auto-generated method stub
        return "toto";
    }

}
