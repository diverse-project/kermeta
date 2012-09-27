package org.kermeta.language.checker;

import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.language.checker.api.Checker;
import org.kermeta.language.checker.api.CheckerScope;
import org.kermeta.language.checker.internal.Activator;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class CheckerImpl implements Checker {
	
	public CheckerImpl() {
		org.kermeta.language.language.checkerrunner.MainRunner.init();
	}

	public DiagnosticModel check(ModelingUnit mu, CheckerScope scope,
			String optionalContent, MessagingSystem logger) {
		
		org.kermeta.language.checker.Checker checker = org.kermeta.language.checker.KerRichFactory.createChecker();
				
		DiagnosticModel result = checker.checkObject(mu, scope.toString());
		return result;
	}

}
