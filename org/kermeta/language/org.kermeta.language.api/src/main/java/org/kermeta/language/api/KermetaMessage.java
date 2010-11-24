/* $Id:  $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 2 aout 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.language.api;

/**
 * Represent a message used inside the Kermeta api 
 * @author hrambelo
 *
 */
public class KermetaMessage {
	
	/**
	 *  All Possible Kind of Kermeta message
	 * @author hrambelo
	 *
	 */
	public enum Level {ERROR, WARNING, INFO, DEBUG,DEFAULT};
	
	/**
	 *  Message to be transmitted
	 */
	private String message;
	
	/**
	 * the kind of the message
	 */
	private Level level;
	
	/**
	 *  Name of the element related to the message
	 */
	private String qualifier;
	
	/**
	 * the exception thrown 
	 */
	private Throwable exception = null;
	
	/**
	 * Default constructor
	 * @param message the content of the message
	 * @param qualifier name of the element related to the message
	 * @param level the kind of the message
	 */
	public KermetaMessage(String message, String qualifier, Level level) {
		this.message =message;
		this.qualifier = qualifier;
		this.level = level;
	}
	
	/**
	 * Constructor
	 * @param message the content of the message
	 * @param qualifier name of the element related to the message
	 * @param level the kind of the message
	 * @param exception the exception thrown 
	 */
	public KermetaMessage(String message, String qualifier, Level level , Throwable exception){
		this.message = message;
		this.qualifier = qualifier;
		this.level = level;
		this.exception = exception;
	}
	
	/**
	 * Getter
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Setter
	 * @param message a new value of the content of the message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * Getter
	 * @return the kind of the message
	 */
	public Level getLevel() {
		return level;
	}
	
	/**
	 * Setter
	 * @param level a new kind of message
	 */
	public void setLevel(Level level) {
		this.level = level;
	}
	
	/**
	 * Getter
	 * @return name of the element related to the message
	 */
	public String getQualifier() {
		return this.qualifier;
	}
	
	/**
	 * Setter
	 * @param qualifier new value for name of the element related to the message
	 */
	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}
	
	/**
	 * Getter
	 * @return the excetion thrown
	 */
	public Throwable getException() {
		return this.exception;
	}
	
	/**
	 * Setter
	 * @param exception new value
	 */
	public void setException(Throwable exception) {
		this.exception = exception;
	}
	
	/**
	 * Determines whether an exception is defined on
	 * @return
	 */
	public boolean existException() {
		return this.exception == null;
	}

}

