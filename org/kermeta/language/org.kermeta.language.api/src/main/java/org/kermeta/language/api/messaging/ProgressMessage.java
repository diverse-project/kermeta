/*$Id: $
* Project : org.kermeta.language.api
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 août 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.api.messaging;

/**
 * ProgressMessage is the abstract class for all progress messages. ProgressMessage intends to capture
 * long running task messages, (or any computation for which you want to get the "begin" and the "end" messages.)
 * Nominal messages sequence should be InitProgressMessage, optionally WorkProgressMessages, DoneProgressMessage
 * It is up to the message processing component to do its best to adapt its display in case of 
 * events received in a different order, however on some implementation you might get strange visual result if not respected. 
 */
public abstract class ProgressMessage extends InfoMessage {

	 
	/** 
	 * task group to which the Message belong 
	 * Progress messages will be grouped according to this field
	 * A special care should be taken when choosing the group id. For example, 2 threads doing a similar job should probably not
	 * share the same progress group. Or recursive method that reuse the same progressGoupId
	 * Hierarchical name for the group id can be used by some message processing component to enhance
	 * the display by creating sub tasks. 
	 * The progressGroup is an internal information that is usually not displayed to the user 
	 */
	protected String progressGroupId="";

	/**
	 * Constructor
	 * @param message the message content
	 * @param userLevel the userlevel adressed by the message
	 * @param messageGroup the sender group of the message
	 * @param senderTrace the sender trace
	 * @param causeObject the object (resource) that cause the problem message
	 * @param severity the severity of the problem represented by the problemMessage
	 * @param progressGroupId unique Id to be used as progressGroupId (useful when using ProgressMessage in recursive methods for example)
	 */
	public ProgressMessage(String message, UserLevel userLevel,
			String messageGroup, Throwable senderTrace, String progressGroupId) {
		super(message, userLevel, messageGroup, senderTrace);
		this.progressGroupId = progressGroupId;
	}
	
	
}
