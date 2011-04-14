/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.messagingsystem.api.impl;

import org.kermeta.utils.messagingsystem.api.MessagingSystem;
import org.kermeta.utils.messagingsystem.api.Reference;

/**
 * Very basic implementation of MessagingSystem that uses System.out and System.err
 *
 */
public class StdioSimpleMessagingSystem extends MessagingSystem {

	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message);
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup,
			Throwable senderTrace) {
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message + " "+ senderTrace.getStackTrace().toString());		
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup,
			Reference causeObject) {
		
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject);

	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup,
			Throwable senderTrace, Reference causeObject) {
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message+ " " + causeObject + " "+ senderTrace.getStackTrace().toString());

	}

	@Override
	public void initProgress(String progressGroup, String message,
			String messageGroup, int nbWorkUnit) {
		info("[BEGIN_" + progressGroup + "] " + message, messageGroup);

	}

	@Override
	public void progress(String progressGroup, String message,
			String messageGroup, int workedUnit) {
		info("["+progressGroup + "] " + message, messageGroup);

	}

	@Override
	public void doneProgress(String progressGroup, String message,
			String messageGroup) {
		info("[END_" + progressGroup + "] " + message, messageGroup);
	}

	protected String getKindString(Kind kind){
		switch (kind) {
		
		case UserINFO :
			return "INFO";
		case UserWARNING :
			return "WARNING";
		case UserERROR :
			return "ERROR";
		case DevINFO :
			return "INFO";
		case DevWARNING :
			return "WARNING";
		case DevERROR :
			return "ERROR";
		default:
			break;
		}
		return "";
	}
	
	
}
