/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.language.helper.tests.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.reference.Reference;

/**
 * Very basic implementation of MessagingSystem that uses System.out and System.err
 *
 */
public class ErrorAwareMessagingSystem extends StdioSimpleMessagingSystem {

	public List<String> errorTrace = new ArrayList<String>();
	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message +" "+getCallerString());
		switch (msgKind) {
		case UserERROR:
			errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " "  + " "+getCallerString());
			break;
		case DevERROR:
			errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " "  + " "+getCallerString());
			break;
		default:
			break;
		}
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup,
			Throwable throwable) {
		StringWriter sw = new StringWriter();
		throwable.printStackTrace(new PrintWriter(sw));
		String stackTrace = sw.toString();
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message + " "+getCallerString()+"\n"+ stackTrace);
		switch (msgKind) {
		case UserERROR:
			errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " "  + " "+getCallerString());
			break;
		case DevERROR:
			errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " "  + " "+getCallerString());
			break;
		default:
			break;
		}
	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Reference causeObject) {
		
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject + " "+getCallerString());
		errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject + " "+getCallerString());
	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Throwable throwable, Reference causeObject) {

		StringWriter sw = new StringWriter();
		throwable.printStackTrace(new PrintWriter(sw));
		String stackTrace = sw.toString();
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message+ " " + causeObject + " "+getCallerString()+"\n"+ stackTrace);
		errorTrace.add(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject + " "+getCallerString());
	}


	
}
