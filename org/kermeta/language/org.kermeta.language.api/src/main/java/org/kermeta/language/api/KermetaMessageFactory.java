/* $Id:  $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 6 aout 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 */
package org.kermeta.language.api;

import org.kermeta.language.api.KermetaMessage.Level;


/**
 * This class is a factory for KermetaMessage. It is used as a singleton.
 * @author mgouyett
 *
 */
public class KermetaMessageFactory {
	
	/**
	 * Instance of the singleton factory
	 */
	protected static KermetaMessageFactory instance = new KermetaMessageFactory();
	
	/**
	 * Retrieve the factory instance
	 * @return
	 */
	public static KermetaMessageFactory getInstance() {
		return instance;
	}
	
	/**
	 * Create a new info message.
	 * @param message : the message
	 * @param qualifier : the name of the element related to the message
	 * @return the new KermetaMessage created
	 */
	public KermetaMessage createInfoMessage(String message, String qualifier) {
		return new KermetaMessage(message, qualifier, Level.INFO);
	}
	
	/**
	 * Create a new debug message 
	 * @param message : the message 
	 * @param qualifier : the name of the element related to the message
	 * @return the new KermetaMessage messageDebug created
	 */
	public KermetaMessage createDebugMessage (String message, String qualifier){
		return new KermetaMessage(message, qualifier,Level.DEBUG);
	}
	
	/**
	 * Create a new warning message 
	 * @param message : the message 
	 * @param qualifier : the name of the element related to the message
	 * @return the new KermetaMessage messageWarning created
	 */
	public KermetaMessage createWarningMessage (String message, String qualifier) {
		return new KermetaMessage(message, qualifier, Level.WARNING);
	}
	
	/**
	 * Create a new error message (without exception)
	 * @param message : the message 
	 * @param qualifier : the name of the element related to the message
	 * @return the new KermetaMessage messageError created
	 */
	public KermetaMessage createErrorMessage (String message, String qualifier) {
		return new KermetaMessage (message, qualifier, Level.ERROR);
	}
	
	/**
	 * Create a new error message (with exception) 
	 * @param message : the message 
	 * @param qualifier : the name of the element related to the message
	 * @param exception : the exception caused by the qualifier
	 * @return the new KermetaMessage errorException created
	 */
	public KermetaMessage createErrorMessageWithException(String message, String qualifier, Throwable exception ){
		return new KermetaMessage(message, qualifier, Level.ERROR, exception);
	}
	
	/**
	 * Create a message to display an object
	 * @param object : the object to display
	 * @return the new KermetaMessage displayObject created
	 */
	public KermetaMessage createMessageToDisplayObject(Object object) {
		return new KermetaMessage(object.toString(), "", Level.DEFAULT);
	}
	
	

}

