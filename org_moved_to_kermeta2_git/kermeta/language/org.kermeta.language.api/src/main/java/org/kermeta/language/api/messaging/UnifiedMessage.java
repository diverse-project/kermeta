/* $Id:  $
 * Project    : org.kermeta.language.api
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 12 aout 2010
 * Authors : 
 *           Didier Vojtisek <didier.vojtisek@inria.fr> 
 */
package org.kermeta.language.api.messaging;

/**
 * UnifiedMessage is the common abstract super class for all messages that need to informs a human user of a given even
 * Depending on the running platform and the concrete type of the message, the message will be displayed 
 * with the proper mechanism in the user interface.
 */
public abstract class UnifiedMessage {
	
	/**
	 * User levels for UnifiedMessage
	 */
	public enum UserLevel {ENDUSER, DEVELOPPER};
	
	/**
	 *  Message to transmit. 
	 */
	protected String message;
	
	/**
	 * The userLevel of the receiver of this message
	 * This field is used by message processing component to filter the messages according to the intended audience
	 * default level is ENDUSER 
	 */
	protected UserLevel userLevel = UserLevel.ENDUSER;
	
	/**
	 * Name of the group for this message
	 * This field is used by message processing component to group or filter the messages
	 * Hierarchical/qualified names can be used by some processing component for advanced grouping
	 */
	protected String messageGroup;
	
	/**
	 * An exception that allows to trace the sender of the message
	 */
	protected Throwable senderTrace = null;
	
	
	/**
	 * Constructor
	 * @param message the message content
	 * @param userLevel the userlevel adressed by the message
	 * @param messageGroup the sender group of the message
	 * @param senderTrace the sender trace
	 **/
	public UnifiedMessage(String message, UserLevel userLevel,
			String messageGroup, Throwable senderTrace) {
		super();
		this.message = message;
		this.userLevel = userLevel;
		this.messageGroup = messageGroup;
		this.senderTrace = senderTrace;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the userLevel
	 */
	public UserLevel getUserLevel() {
		return userLevel;
	}

	/**
	 * @param userLevel the userLevel to set
	 */
	public void setUserLevel(UserLevel userLevel) {
		this.userLevel = userLevel;
	}

	/**
	 * @return the messageGroup
	 */
	public String getMessageGroup() {
		return messageGroup;
	}

	/**
	 * @param messageGroup the messageGroup to set
	 */
	public void setMessageGroup(String messageGroup) {
		this.messageGroup = messageGroup;
	}

	/**
	 * @return the senderTrace
	 */
	public Throwable getSenderTrace() {
		return senderTrace;
	}

	/**
	 * @param senderTrace the senderTrace to set
	 */
	public void setSenderTrace(Throwable senderTrace) {
		this.senderTrace = senderTrace;
	}
	
	

}

