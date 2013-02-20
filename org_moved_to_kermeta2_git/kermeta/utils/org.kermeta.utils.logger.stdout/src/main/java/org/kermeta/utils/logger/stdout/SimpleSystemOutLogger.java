/*$Id: $
* Project : org.kermeta.utils.logger.standalone
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 13 août 2010
* Authors : 
*			Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.logger.stdout;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.kermeta.language.api.messaging.InfoMessage;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.messaging.UnifiedMessage;

public class SimpleSystemOutLogger {
	
	public static String INFO = "INFO";
	public static String DEBUG = "DEBUG";
	public static String WARNING = "WARNING";
	public static String ERROR = "ERROR";
	
	public void log(UnifiedMessage uMessage){
		StringBuffer buff = new StringBuffer();
		String level = "INFO";
		String adaptedMessage=uMessage.getMessage();
		if(uMessage instanceof InfoMessage){
			switch (uMessage.getUserLevel()) {
			case DEVELOPPER:
				level = DEBUG;
				break;
			case ENDUSER:
			default:
				level = INFO;
				break;
			}
			adaptedMessage = uMessage.getMessage();
		}
		else if(uMessage instanceof ProblemMessage){
			ProblemMessage pbMsg = (ProblemMessage)uMessage;
			switch (uMessage.getUserLevel()) {
			case DEVELOPPER:
				level = DEBUG;
				if(pbMsg.getSeverity() == ProblemMessage.Severity.ERROR){
					adaptedMessage = "ERROR: " + uMessage.getMessage();
				}
				else{
					adaptedMessage = "WARNING: " + uMessage.getMessage();
				}
				break;
			case ENDUSER:
			default:
				if(pbMsg.getSeverity() == ProblemMessage.Severity.ERROR){
					level = ERROR;
					adaptedMessage = uMessage.getMessage();
				}
				else{
					level = WARNING;
					adaptedMessage = uMessage.getMessage();
				}
				break;
			}
		}
		buff.append("["+level+"]");
		buff.append("["+uMessage.getMessageGroup()+"]");
		buff.append(adaptedMessage);
		
		System.out.println(buff.toString());
		if(uMessage.getSenderTrace() != null){
			uMessage.getSenderTrace().printStackTrace();
		}
		
	}
	

}
