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

import org.kermeta.traceability.Reference;


/**
 * Message for problem events
 */
public class ProblemMessage extends UnifiedMessage{
	/**
	 * Severity levels for ProblemMessage
	 */
	public enum Severity {WARNING, ERROR, FATAL, OK};
	
	/**
	 * Optional object that caused the problem
	 * A message processing component may use this information to enhance the display 
	 * (marking in the user interface, enhanced message, use of traceability, ...)
	 */
	protected org.kermeta.traceability.Reference causeObject=null;
	
	/**
	 * severity of the problem
	 */
	protected Severity severity;

	
	
	/**
	 * Constructor
	 * @param message the message content
	 * @param userLevel the userlevel adressed by the message
	 * @param messageGroup the sender group of the message
	 * @param senderTrace the sender trace
	 * @param causeObject the object (resource) that cause the problem message
	 * @param severity the severity of the problem represented by the problemMessage
	 */
	public ProblemMessage(Severity severity, 
			String messageGroup,
			String message, 
			UserLevel userLevel, 
			Throwable senderTrace, 
			Reference causeObject
			) {
		super(message, userLevel, messageGroup, senderTrace);
		this.causeObject = causeObject;
		this.severity = severity;
	}

	/**
	 * @return the causeObject
	 */
	public Object getCauseObject() {
		return causeObject;
	}

	/**
	 * @param causeObject the causeObject to set
	 */
	public void setCauseObject(Reference causeObject) {
		this.causeObject = causeObject;
	}

	/**
	 * @return the severity
	 */
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * @param severity the severity to set
	 */
	public void setSeverity(Severity severity) {
		this.severity = severity;
	} 

	
}
