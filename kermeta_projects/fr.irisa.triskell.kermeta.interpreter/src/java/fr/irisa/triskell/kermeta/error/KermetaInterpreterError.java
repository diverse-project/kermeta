/* $Id: KermetaInterpreterError.java,v 1.2 2007-03-08 14:16:37 cfaucher Exp $
 * Project    : fr.irisa.triskell.kermeta.interpreter
 * File       : KermetaInterpreterError.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 14 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        Internal error/exception that occurs on while interpreting a Kermeta model 
 */
package fr.irisa.triskell.kermeta.error;

/**
 * Internal error/exception that occurs while interpreting a Kermeta model
 * @author dvojtise
 */
public class KermetaInterpreterError extends KermetaError {

    /**
     * Constructs a new Kermeta error with the specified cause.
     * @param cause
     */
    public KermetaInterpreterError(Throwable cause) {
        
        super(cause);
    }
    
    /**
     * Constructs a new Kermeta error with the specified detail message and cause.
     * @param message
     * @param cause
     */
    public KermetaInterpreterError(String message,
            Throwable cause) {
        
        super(message, cause);
    }
    
    /**
     * Constructs a new Kermeta error with the specified detail message.
     * @param message
     * @param cause
     */
    public KermetaInterpreterError(String message) {
        
        super(message);
    }
}
