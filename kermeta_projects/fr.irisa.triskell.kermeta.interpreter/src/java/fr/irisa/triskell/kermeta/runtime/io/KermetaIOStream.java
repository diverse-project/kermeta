/* $Id: KermetaIOStream.java,v 1.2 2005-05-20 12:04:58 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaIOStream.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runtime.io;

/**
 * 
 */
public abstract class KermetaIOStream {

    /**
     * 
     */
    public KermetaIOStream() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public abstract void print(Object outputString);
    
    public Object read(String prompt)
    {
        System.err.println("Not implemented");
        return null;
        
    }

}
