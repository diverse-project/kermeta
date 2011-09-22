/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 14 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.systemservices.api.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;

import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.Reference;

/**
 * Very basic implementation of MessagingSystem that uses System.out and System.err
 *
 */
public class StdioSimpleMessagingSystem extends MessagingSystem {

	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message +" "+getCallerString());
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup,
			Throwable throwable) {
		StringWriter sw = new StringWriter();
		throwable.printStackTrace(new PrintWriter(sw));
		String stackTrace = sw.toString();
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message + " "+getCallerString()+"\n"+ stackTrace);
		
	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Reference causeObject) {
		
		System.out.println(getKindString(msgKind) + " [" +messageGroup + "] " + message + " " + causeObject + " "+getCallerString());

	}

	@Override
	public void logProblem(Kind msgKind, String message, String messageGroup,
			Throwable throwable, Reference causeObject) {

		StringWriter sw = new StringWriter();
		throwable.printStackTrace(new PrintWriter(sw));
		String stackTrace = sw.toString();
		System.out.println(getKindString(msgKind)+" [" +messageGroup + "] " + message+ " " + causeObject + " "+getCallerString()+"\n"+ stackTrace);

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
	/**
	 * identify the caller of this message
	 * @return
	 */
	protected String getCallerString(){
		Exception e = new Exception();
		
		StackTraceElement[] stackTraceElements = e.getStackTrace();
		if (stackTraceElements.length > 2){
			return stackTraceElements[2].toString();
		}
		else {
			// not able to get the caller 
			return "";		
		}
	}

	@Override
	public void flushAllProblems(URL uri) {
		
	}

	@Override
	public void flushProblem(String messageGroup, URL uri) {
		
	}

	@Override
	public String readLine() {
		String result = "";
		try {
			java.io.InputStreamReader isr =new java.io.InputStreamReader(System.in);
			java.io.BufferedReader bufferedReader  =new java.io.BufferedReader(isr);
		
			return bufferedReader.readLine();
		} catch (IOException e) {
			error("Failed to read line", "", e);
		}
		return result;
	}

	@Override
	public String readLine(String prompt) {
		info(prompt, "");
		return readLine();
		
	}

	protected BufferedReader reader;
	@Override
	public BufferedReader getReader() {
		if(reader == null){
			// reader is System.in
			reader = new BufferedReader( new InputStreamReader(System.in));
		}
		return reader;
	}
	
}
