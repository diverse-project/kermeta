package org.kermeta.language.checker;

import java.util.ArrayList;

import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.language.checker.api.Checker;
import org.kermeta.language.checker.api.CheckerScope;
import org.kermeta.language.checker.internal.Activator;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class CheckerImpl4Eclipse implements Checker {
	
	public CheckerImpl4Eclipse() {
		org.kermeta.language.language.checkerrunner.MainRunner.init4eclipse();
		Activator.getDefault().reflexivityLoaderContext();
	}

	public DiagnosticModel check(ModelingUnit mu, CheckerScope scope,
			String optionalContent, MessagingSystem logger) {
			
		org.kermeta.language.checker.Checker checker = org.kermeta.language.checker.KerRichFactory.createChecker();
		ArrayList<Object> mms = new ArrayList<Object>();
		mms.addAll(mu.getMetamodels());
		DiagnosticModel result = checker.checkCollection(mms, scope.toString());
		
		
		return result;
	}

}
