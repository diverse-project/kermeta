/*$Id$
 * Project : org.kermeta.utils.logger.eclipse
 * License : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 13 août 2010
 * Authors : 
 *			Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.utils.logger.eclipse;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import org.kermeta.language.api.messaging.InfoMessage;
import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.messaging.UnifiedMessage;
import org.kermeta.language.api.messaging.ProblemMessage.Severity;
import org.kermeta.utils.logger.eclipse.console.message.ConsoleMessage;

public class ConsoleMessageFactory {

	public static String INFO = "INFO";
	public static String DEBUG = "DEBUG";
	public static String WARNING = "WARNING";
	public static String ERROR = "ERROR";

	public ConsoleMessage getConsoleMessage(UnifiedMessage uMessage) {
		StringBuffer buff = new StringBuffer();
		String level = "INFO";
		Severity severity = null;
		String adaptedMessage = uMessage.getMessage();
		if (uMessage instanceof InfoMessage) {
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
		} else if (uMessage instanceof ProblemMessage) {
			ProblemMessage pbMsg = (ProblemMessage) uMessage;
			severity = pbMsg.getSeverity();
			switch (uMessage.getUserLevel()) {
			case DEVELOPPER:
				level = DEBUG;
				if (severity == ProblemMessage.Severity.ERROR) {
					adaptedMessage = "ERROR: " + uMessage.getMessage();
				} else {
					adaptedMessage = "WARNING: " + uMessage.getMessage();
				}
				break;
			case ENDUSER:
			default:
				if (severity == ProblemMessage.Severity.ERROR) {
					level = ERROR;
					adaptedMessage = uMessage.getMessage();
				} else {
					level = WARNING;
					adaptedMessage = uMessage.getMessage();
				}
				break;
			}
		}
		buff.append("[" + level + "]");
		buff.append("[" + uMessage.getMessageGroup() + "]");
		buff.append(adaptedMessage);

		if (uMessage.getSenderTrace() != null) {
			uMessage.getSenderTrace().printStackTrace();
			ByteArrayOutputStream oStream = new java.io.ByteArrayOutputStream();
			PrintWriter pw = new PrintWriter(oStream);
			uMessage.getSenderTrace().printStackTrace(pw);
			pw.flush();
			buff.append(oStream.toString());
		}
		ConsoleMessage result;
		if (level.equals(INFO)) {
			result = new org.kermeta.utils.logger.eclipse.console.message.InfoMessage(
					buff.toString());
		} else if (level.equals(DEBUG)) {
			if (severity == ProblemMessage.Severity.ERROR) {
				result = new org.kermeta.utils.logger.eclipse.console.message.DebugErrorMessage(
						buff.toString());
			} else if (severity == ProblemMessage.Severity.WARNING) {
				result = new org.kermeta.utils.logger.eclipse.console.message.DebugWarningMessage(
						buff.toString());
			} else {
				result = new org.kermeta.utils.logger.eclipse.console.message.DebugMessage(
						buff.toString());
			}

		} else if (level.equals(WARNING)) {
			result = new org.kermeta.utils.logger.eclipse.console.message.WarningMessage(
					buff.toString());
		} else if (level.equals(ERROR)) {
			result = new org.kermeta.utils.logger.eclipse.console.message.ErrorMessage(
					buff.toString());
		} else {
			result = new org.kermeta.utils.logger.eclipse.console.message.InfoMessage(
					buff.toString());
		}
		return result;
	}

}
