/* $Id: SystemIOStream.java,v 1.1 2005-05-18 16:36:27 zdrey Exp $
 * Project: Kermeta (First iteration)
 * File: SystemIOStream.java
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
public class SystemIOStream extends KermetaIOStream {

    /**
     * 
     */
    public SystemIOStream() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void print(Object outputObject)
    {
        System.out.print(outputObject);
    }
    
    public Object read()
    {
        System.err.println("Not implemented yet");
        return null;
    }

}
