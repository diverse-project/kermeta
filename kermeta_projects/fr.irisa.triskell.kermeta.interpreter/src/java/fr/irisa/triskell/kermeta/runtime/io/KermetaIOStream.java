/* $Id: KermetaIOStream.java,v 1.7 2007-03-05 15:55:33 cfaucher Exp $
 * Project: Kermeta (First iteration)
 * File: KermetaIOStream.java
 * License: GPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date: May 18, 2005
 * Authors: zdrey
 */
package fr.irisa.triskell.kermeta.runtime.io;

import fr.irisa.triskell.kermeta.launcher.KermetaInterpreter;

/**
 * 
 */
public interface KermetaIOStream {
 
	
    public abstract void print(Object outputString);
    
    public abstract String read(String prompt);
    
    /** Disconnect the console */
    public abstract void dispose();
    
    /** Initialize the console. This method should only be called once the
     * interpretation process has been started */
    public abstract void initialize();
   
    public abstract void setKermetaInterpreter(KermetaInterpreter ki);

}
