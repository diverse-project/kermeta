/* $Id: KermetaIOStream.java,v 1.5 2006-07-21 10:40:02 zdrey Exp $
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
public interface KermetaIOStream {
 
    public abstract void print(Object outputString);
    
    public abstract Object read(String prompt);
    
    /** Disconnect the console */
    public abstract void dispose();
    
    /** Initialize the console. This method should only be called once the
     * interpretation process has been started */
    public abstract void initialize();

}
