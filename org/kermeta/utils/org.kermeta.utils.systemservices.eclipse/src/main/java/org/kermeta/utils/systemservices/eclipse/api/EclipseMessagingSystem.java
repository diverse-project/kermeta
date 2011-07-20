/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 22 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.systemservices.eclipse.api;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.Reference;
import org.kermeta.utils.systemservices.eclipse.Activator;
import org.kermeta.utils.systemservices.eclipse.internal.EclipseReporter;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.ConsoleMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.DebugErrorMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.DebugMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.DebugWarningMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.ErrorMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.InfoMessage;
import org.kermeta.utils.systemservices.eclipse.internal.console.message.WarningMessage;



public class EclipseMessagingSystem extends MessagingSystem {

	protected String baseMessageGroup = "";
	
	
	protected String consoleTitle = "";
	
	EclipseReporter eclipseReporter;
	
	
	
	public EclipseMessagingSystem(String baseMessageGroup, String consoleTitle) {
		super();
		this.baseMessageGroup = baseMessageGroup;
		this.consoleTitle = consoleTitle;
		this.eclipseReporter = new EclipseReporter(this);
	}

	@Override
	public void doneProgress(String progressGroup, String msg, String msgGroup) {
		// TODO Auto-generated method stub
		// for the moment forward all messages to usual log
		info("["+progressGroup+"]"+ msg, msgGroup);
		
	}

	@Override
	public void initProgress(String progressGroup, String msg, String msgGroup, int unitToWork) {
		// TODO Auto-generated method stub
		// for the moment forward all messages to usual log
		info("["+progressGroup+"]"+ msg, msgGroup);
		
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
		
		// some error message should go to the eclipse error view
		switch (msgKind) {
		case UserWARNING:
		case DevWARNING:
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, messageGroup, IStatus.WARNING, message != null ? message : "<null>",null));
			break;
		case UserERROR:
		case DevERROR:
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, messageGroup, IStatus.ERROR, message != null ? message : "<null>",null));
			break;
		default:
			break;
		}
		
		Activator.getDefault().getConsoleIO().print(getConsoleMessageFor(msgKind,message));
		// currently redirect to stdio
		//StdioSimpleMessagingSystem stdioRedirect = new StdioSimpleMessagingSystem();
		//stdioRedirect.log(msgKind, message, messageGroup);
	}

	

	@Override
	public void log(Kind msgKind, String message, String messageGroup, Throwable throwable) {
		
		// some error message should go to the eclipse error view
		switch (msgKind) {
		case UserWARNING:
		case DevWARNING:
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, messageGroup, IStatus.WARNING, message != null ? message : "<null>",null));
			break;
		case UserERROR:
		case DevERROR:
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, messageGroup, IStatus.ERROR, message != null ? message : "<null>",null));
			break;
		default:
			break;
		}
		StringWriter sw = new StringWriter();
		throwable.printStackTrace(new PrintWriter(sw));
		String stackTrace = sw.toString();
		Activator.getDefault().getConsoleIO().print(getConsoleMessageFor(msgKind,message+"\n"+stackTrace));
		// currently redirect to stdio
		//StdioSimpleMessagingSystem stdioRedirect = new StdioSimpleMessagingSystem();
		//stdioRedirect.log(msgKind, message, messageGroup, exception);
		
	}

	@Override
	public void logProblem(Kind kind, String msg, String msgGroup, Reference ref) {
		Kind log_kind = kind;
		switch (kind) {
		case UserWARNING:
			eclipseReporter.addMarker( IMarker.SEVERITY_WARNING, ref, msg,msgGroup);
			// since the message is in the problem view, downgrade log_kind to dev so it can be filtered
			log_kind = Kind.DevDEBUG;
			break;
		case UserERROR:
			eclipseReporter.addMarker( IMarker.SEVERITY_ERROR, ref, msg,msgGroup);
			// downgrade log_kind to dev
			log_kind = Kind.DevDEBUG;
			break;
		default:
			break;
		}
		// forward all message to usual log too
		log(log_kind, msg + " "+ref, msgGroup);
	}

	@Override
	public void logProblem(Kind kind, String msg, String msgGroup, Throwable exception,
			Reference ref) {
		Kind log_kind = kind;
		switch (kind) {
		case UserWARNING:
			eclipseReporter.addMarker( IMarker.SEVERITY_WARNING, ref, msg,msgGroup);
			//  since the message is in the problem view, downgrade log_kind to dev so it can be filtered
			log_kind = Kind.DevDEBUG;
			break;
		case UserERROR:
			eclipseReporter.addMarker( IMarker.SEVERITY_ERROR, ref, msg,msgGroup);
			// downgrade log_kind to dev
			log_kind = Kind.DevDEBUG;
			break;
		default:
			break;
		}
		// forward all message to usual log too, here we can use the stacktrace 
		log(log_kind, msg + " "+ref, msgGroup, exception);
		
	}

	@Override
	public void progress(String progressGroup, String msg, String msgGroup, int workedUnit) {
		// TODO Auto-generated method stub
		// for the moment forward all messages to usual log
		info("["+progressGroup+"]"+ msg, msgGroup);
	}

	@Override
	public void flushAllProblems(URL uri) {
		eclipseReporter.flushAllProblems(uri);		
	}

	@Override
	public void flushProblem(String messageGroup, URL uri) {
		eclipseReporter.flushProblem(messageGroup,uri);	
		
	}

	protected ConsoleMessage getConsoleMessageFor(Kind msgKind, String message) {
		switch (msgKind) {
		case DevDEBUG:
			return new DebugMessage(message+"\n");
		case UserINFO:
			return new InfoMessage(message+"\n");
		case DevINFO:
			return new DebugMessage(message+"\n");
		case UserWARNING:
			return new WarningMessage(message+"\n");
		case DevWARNING:
			return new DebugWarningMessage(message+"\n");
		case UserERROR:
			return new ErrorMessage(message+"\n");
		case DevERROR:
			return new DebugErrorMessage(message+"\n");
			
		default:
			return new DebugMessage(message+"\n");
		}
	}

}
