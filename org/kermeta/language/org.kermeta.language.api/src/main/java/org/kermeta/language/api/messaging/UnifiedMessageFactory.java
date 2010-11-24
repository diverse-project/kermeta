/* $Id:  $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 6 aout 2010
 * Authors : 
 *           mgouyett <Marie.Gouyette@irisa.fr> 
 *           Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.messaging;

import java.util.Random;

import org.kermeta.language.api.messaging.ProblemMessage.Severity;
import org.kermeta.language.api.messaging.UnifiedMessage.UserLevel;
import org.kermeta.traceability.Reference;


/**
 * This class is a factory for KermetaMessage. It is used as a singleton.
 * It contains convenient operations to build most simplified variants of usual messages
 *
 */
public class UnifiedMessageFactory {
	
	/**
	 * Instance of the singleton factory
	 */
	protected static UnifiedMessageFactory instance = new UnifiedMessageFactory();
	
	/**
	 * Retrieve the factory instance
	 * @return
	 */
	public static UnifiedMessageFactory getInstance() {
		return instance;
	}
	
	/**
	 * Create a simple new info message for EndUser and Developer
	 * current implementation : without trace to the sender code
	 * @param message : the message
	 * @param groupId : the name of the element related to the message
	 * @return the new messageInfo created
	 */
	public UnifiedMessage createInfoMessage(String message, String groupId) {
		return new InfoMessage(message, UserLevel.ENDUSER, groupId, null);
	}
	
	/**
	 * Create a simple new info message for Developers only
	 * current implementation : without trace to the sender code
	 * @param message : the message
	 * @param groupId : the name of the element related to the message
	 * @return the new messageDebug created
	 */
	public UnifiedMessage createDebugMessage (String message, String groupId){
		return new InfoMessage(message, UserLevel.DEVELOPPER, groupId, null);
	}
	
	/**
	 * Create a simple new warning message for all users (EndUser and Developer)
	 * current implementation : without trace to the sender code
	 * @param message : the message 
	 * @param groupId : the name of the element related to the message
	 * @return the new KermetaMessage messageWarning created
	 */
	public UnifiedMessage createWarningMessage (String message, String groupId) {
		return new ProblemMessage(Severity.WARNING, groupId, message, UserLevel.ENDUSER, null, null);
	}
	
	/**
	 * Create a simple new error message for all users (EndUser and Developer)
	 * current implementation : without trace to the sender code
	 * @param message : the message 
	 * @param groupId : the name of the element related to the message
	 * @return the new KermetaMessage messageWarning created
	 */
	public UnifiedMessage createErrorMessage (String message, String groupId) {
		return new ProblemMessage(Severity.ERROR, groupId, message, UserLevel.ENDUSER, null, null);
	}
	/**
	 * Create a simple new error message for all users (EndUser and Developer)
	 * @param message : the message 
	 * @param groupId : the name of the element related to the message
	 * @param senderTrace : exception that is either the cause of the message or the sender code 
	 * @return the new KermetaMessage messageWarning created
	 */
	public UnifiedMessage createErrorMessage (String message, String groupId, Exception senderTrace) {
		return new ProblemMessage(Severity.ERROR, groupId, message, UserLevel.ENDUSER, senderTrace, null);
	}
	
	/**
	 * Create a simple new error message for all users (EndUser and Developer)
	 * @param message : the message 
	 * @param groupId : the name of the element related to the message
	 * @param senderTrace : exception that is either the cause of the message or the sender code 
	 * @param causeObject : the object containing the informations on the error problem (file source, line number ...)
	 * @return the new KermetaMessage messageWarning created
	 */
	public UnifiedMessage createErrorMessage (String message, String groupId, Exception senderTrace, Reference causeObject ) {
		return new ProblemMessage(Severity.ERROR, groupId, message, UserLevel.ENDUSER, senderTrace, causeObject);
	}
	
	/**
	 * Create a simple ok message for all users (EndUser and Developer) to inform that errors on file are all corrected
	 * @param message : the message 
	 * @param groupId : the name of the element related to the message
	 * @param senderTrace : exception that is either the cause of the message or the sender code 
	 * @param causeObject : the object containing the informations on the error problem (file source, line number ...)
	 * @return the new KermetaMessage messageWarning created
	 */
	public UnifiedMessage createOkMessage (String message, String groupId, Exception senderTrace, Reference causeObject ) {
		return new ProblemMessage(Severity.OK, groupId, message, UserLevel.ENDUSER, senderTrace, causeObject);
	}
	
	/**
	 * Generate a random number to be used with generateUniqueProgressGroupId()
	 */
	protected Random randomGenerator = new Random();
	
	/**
	 * to be used with generateUniqueProgressGroupId()
	 */
	protected int baseUId = 0;
	
	/**
	 * Generate an almost unique Id to be used as progressGroupId
	 * This is useful when using ProgressMessage in recursive methods for example.
	 * @return the generatedUId string
	 */
	public String generateUniqueProgressGroupId(){
		return baseUId +"-"+ randomGenerator.nextInt();
	}
}

