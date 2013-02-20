/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.api;

import org.kermeta.traceability.Reference;

/**
 * Represent an error inside the Kermeta api 
 * @author ffouquet
 */
public class KermetaError {

	/**
	 * All possible kind of error
	 * @author hrambelo
	 *
	 */
    public enum Level {ERROR,WARNING};
    
    /**
     * the error message transmitted
     */
    private String message;

    /**
     * Getter
     * @return the error message transmitted 
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter
     * @param message a new value for the error message
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The object that cause the error 
     */
    private Reference reference;
    
    /**
     * Getter
     * @return The object that cause the error 
     */
    public Reference getReference() {
        return reference;
    }

    /**
     * Setter
     * @param reference the object that cause the error 
     */
    public void setReference(Reference reference) {
        this.reference = reference;
    }
    
    /**
     * the kind of the error
     */
    private Level level;

    /**
     * Getter
     * @return the kind of the error
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Setter
     * @param level the new kind of the error
     */
    public void setLevel(Level level) {
        this.level = level;
    }

}
