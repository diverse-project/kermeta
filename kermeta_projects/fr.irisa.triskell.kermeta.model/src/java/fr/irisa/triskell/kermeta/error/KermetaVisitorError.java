/* $Id: KermetaVisitorError.java,v 1.2 2005-04-18 09:05:03 dvojtise Exp $
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
 * Internal error/exception that occurs while visiting a Kermeta model
 * @author dvojtise
 */
public class KermetaVisitorError extends KermetaError {

    /**
     * Constructs a new Kermeta error with the specified cause.
     * @param cause
     */
    public KermetaVisitorError(Throwable cause) {
        
        super(cause);
    }
    
    /**
     * Constructs a new Kermeta error with the specified detail message and cause.
     * @param message
     * @param cause
     */
    public KermetaVisitorError(String message,
            Throwable cause) {
        
        super(message, cause);
    }
    
    /**
     * Constructs a new Kermeta error with the specified detail message.
     * @param message
     * @param cause
     */
    public KermetaVisitorError(String message) {
        
        super(message);
    }
}
