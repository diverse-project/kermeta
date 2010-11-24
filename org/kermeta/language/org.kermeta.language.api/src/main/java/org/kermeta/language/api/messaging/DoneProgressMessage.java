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
 * Message that informs a ProgressMonitor that a given progressGroup has ended.
 */
public class DoneProgressMessage extends ProgressMessage {

	/**
	 * Constructor
	 * @param message the content of the message
	 * @param userLevel the userlevel adressed by the message
	 * @param messageGroup the sender group of the message
	 * @param senderTrace the sender trance
	 * @param progressGroupId the id of the processGroup
	 */
	public DoneProgressMessage(String message, UserLevel userLevel,	String messageGroup, Throwable senderTrace, String progressGroupId) {
		super(message, userLevel, messageGroup, senderTrace, progressGroupId);
	}

}
