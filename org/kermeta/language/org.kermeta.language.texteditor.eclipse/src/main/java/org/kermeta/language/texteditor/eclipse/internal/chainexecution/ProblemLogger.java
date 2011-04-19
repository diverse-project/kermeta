package org.kermeta.language.texteditor.eclipse.internal.chainexecution;

import org.kermeta.utils.error.report.eclipse.Reporter;
import org.kermeta.utils.messagingsystem.api.MessagingSystem;
import org.kermeta.utils.messagingsystem.api.Reference;
import org.kermeta.utils.messagingsystem.api.TextReference;

public class ProblemLogger extends MessagingSystem {

	@Override
	public void doneProgress(String progressGroup, String message, String messageGroup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initProgress(String progressGroup, String message, String messageGroup, int nbWorkUnit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup) {
		System.out.println("coucou1"+message);
		
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup, Throwable senderTrace) {
		System.out.println("coucou2"+message);
		
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup, Reference causeObject) {
		if (causeObject instanceof TextReference) {
			TextReference object = ((TextReference) causeObject);
			new Reporter().reportProblem(object.getFileURL(), message, object.getBeginLine(), object.getBeginOffset(), object.getEndOffset());
		}
	}

	@Override
	public void log(Kind msgKind, String message, String messageGroup, Throwable senderTrace, Reference causeObject) {
		System.out.println("coucou4"+message);
		
	}

	@Override
	public void progress(String progressGroup, String message, String messageGroup, int workedUnit) {
		// TODO Auto-generated method stub
		
	}


}