/* $Id: KermetaLoaderError.java,v 1.1 2005-04-20 12:48:00 dvojtise Exp $
 * Project    : fr.irisa.triskell.kermeta.io
 * File       : KermetaLoaderError.java
 * License    : GPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 20 avr. 2005
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 *        <desription.text> 
 */
package fr.irisa.triskell.kermeta.error;

/**
 * * Internal error/exception that occurs on kermeta loader
 * @author dvojtise
 *
 */
public class KermetaLoaderError extends KermetaError {    

        /**
         * Constructs a new Kermeta error with the specified cause.
         * @param cause
         */
        public KermetaLoaderError(Throwable cause) {
            
            super(cause);
        }
        
        /**
         * Constructs a new Kermeta error with the specified detail message and cause.
         * @param message
         * @param cause
         */
        public KermetaLoaderError(String message,
                Throwable cause) {
            
            super(message, cause);
        }
        
        /**
         * Constructs a new Kermeta error with the specified detail message.
         * @param message
         * @param cause
         */
        public KermetaLoaderError(String message) {
            
            super(message);
        }

}
