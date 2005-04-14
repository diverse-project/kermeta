/* $Id: KermetaVisitorError.java,v 1.1 2005-04-14 13:36:00 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.model
 * File       : KermetaVisitorError.java
 * License    : GPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 14 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        Internal error/exception that occurs on while visiting a Kermeta model 
 */
package fr.irisa.triskell.kermeta.error;

/**
 * @author dvojtise
 * Internal error/exception that occurs while visiting a Kermeta model
 */
public class KermetaVisitorError extends Error {

    /**
     * @param cause
     * Constructs a new Kermeta error with the specified cause.
     */
    public KermetaVisitorError(Throwable cause) {
        
        super(cause);
    }
    
    /**
     * @param message
     * @param cause
     * Constructs a new Kermeta error with the specified detail message and cause.
     */
    public KermetaVisitorError(String message,
            Throwable cause) {
        
        super(message, cause);
    }
    
    /**
     * @param message
     * @param cause
     * Constructs a new Kermeta error with the specified detail message.
     */
    public KermetaVisitorError(String message) {
        
        super(message);
    }
}
