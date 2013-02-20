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
 * Message for initializing a progression
 * if nbWorkUnit is not set (nbWorkUnit == 0 ) the task size is supposed unknown
 * With some message processing component, if a second InitProgressMessage is received before a DoneProgressMessage, 
 * the Progress monitor will be reset to the second value (including the cancellableProcess object) 
 */
public class InitProgressMessage extends ProgressMessage {
	
	/**
	 * Number of work unit for the progress monitor associated to the progressGroupId
	 */
	protected int nbWorkUnit=0;
	
	/**
	 * Object that must be notified if the user asks for a cancellation of a task supervised by a ProgressMonitor
	 */
	protected CancellableProcess cancellableProcess=null;

	/**
	 * Constructor
	 * @param message the message content
	 * @param userLevel the userlevel adressed by the message
	 * @param messageGroup the sender group of the message
	 * @param senderTrace the sender trace
	 * @param causeObject the object (resource) that cause the problem message
	 * @param severity the severity of the problem represented by the problemMessage
	 * @param progressGroupId unique Id to be used as progressGroupId (useful when using ProgressMessage in recursive methods for example)
	 * @param nbWorkUnit number of work unit for the progress monitor associated to the progressGroupId
	 * @param cancellableProcess the object that must be notified if the user asks for a cancellation of a task supervised by a ProgressMonitor
	 */
	public InitProgressMessage(String message, UserLevel userLevel,
			String messageGroup, Throwable senderTrace, String progressGroupId,
			int nbWorkUnit, CancellableProcess cancellableProcess) {
		super(message, userLevel, messageGroup, senderTrace, progressGroupId);
		this.nbWorkUnit = nbWorkUnit;
		this.cancellableProcess = cancellableProcess;
	}
	
	
}
