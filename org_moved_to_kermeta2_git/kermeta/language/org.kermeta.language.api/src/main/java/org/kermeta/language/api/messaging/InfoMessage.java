/*$Id: $
* Project : org.kermeta.language.api
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 12 aout 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.api.messaging;


/**
 * Simple message for informational  event
 *
 */
public class InfoMessage extends UnifiedMessage {

	/**
	 * Constructor
	 * @param message content of the message
	 * @param userLevel the userlevel adressed by the message
	 * @param messageGroup the sender group of the message
	 * @param senderTrace the sender trace 
	 */
	public InfoMessage(String message, UserLevel userLevel,	String messageGroup, Throwable senderTrace) {
		super(message, userLevel, messageGroup, senderTrace);
	}

}
