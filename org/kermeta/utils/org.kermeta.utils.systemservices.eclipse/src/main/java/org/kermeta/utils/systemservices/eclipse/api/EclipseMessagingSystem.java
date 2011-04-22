/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 22 avr. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.utils.systemservices.eclipse.api;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.Reference;
import org.kermeta.utils.systemservices.eclipse.internal.EclipseReporter;



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
		// TODO Auto-generated method stub
		// currently redirect to stdio
		StdioSimpleMessagingSystem stdioRedirect = new StdioSimpleMessagingSystem();
		stdioRedirect.log(msgKind, message, messageGroup);
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup, Throwable exception) {
		// TODO Auto-generated method stub
		// currently redirect to stdio
		StdioSimpleMessagingSystem stdioRedirect = new StdioSimpleMessagingSystem();
		stdioRedirect.log(msgKind, message, messageGroup, exception);
		
	}

	@Override
	public void logProblem(Kind kind, String msg, String msgGroup, Reference ref) {
		switch (kind) {
		case UserWARNING:
			eclipseReporter.addMarker( IMarker.SEVERITY_WARNING, ref, msg);
			break;
		case UserERROR:
			eclipseReporter.addMarker( IMarker.SEVERITY_ERROR, ref, msg);
			break;
		default:
			break;
		}
		// forward all message to usual log too
		log(kind, msg + " "+ref, msgGroup);
	}

	@Override
	public void logProblem(Kind kind, String msg, String msgGroup, Throwable exception,
			Reference ref) {
		logProblem(kind, msg + "\n"+exception.getStackTrace()[0], msgGroup, ref);
	}

	@Override
	public void progress(String progressGroup, String msg, String msgGroup, int workedUnit) {
		// TODO Auto-generated method stub
		// for the moment forward all messages to usual log
		info("["+progressGroup+"]"+ msg, msgGroup);
	}

	@Override
	public void flushProblem(String problemGroup) {
		eclipseReporter.flushProblem(problemGroup);
	}

	@Override
	public void flushProblem(String arg0, Reference arg1) {
		// TODO Auto-generated method stub
		
	}



}
