/* $Id: KermetaIOStream.java,v 1.4 2006-06-15 13:04:53 zdrey Exp $
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
    }
    
    public abstract void print(Object outputString);
    
    public Object read(String prompt)
    {
        System.err.println("ERROR : read method is Not implemented");
        return null;
    }
    
    /** Disconnect the console */
    public void dispose() {}
    
    /** Initialize the console. This method should only be called once the
     * interpretation process has been started */
    public void initialize() {}

}
