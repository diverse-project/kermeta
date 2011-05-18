package org.kermeta.language.checker;

import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.language.checker.api.Checker;
import org.kermeta.language.checker.api.CheckerScope;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class CheckerImpl implements Checker {

	public DiagnosticModel check(ModelingUnit mu, CheckerScope scope,
			String optionalContent, MessagingSystem logger) {
		// TODO Auto-generated method stub
		
		logger.error("Checking modeling unit for scope " + scope.toString(), "checkermessagegroup", null);
		
		org.kermeta.language.language.checkerrunner.MainRunner.init();
		
		org.kermeta.language.checker.Checker checker = org.kermeta.language.checker.KerRichFactory.createChecker();
		
		
		DiagnosticModel result = checker.checkObject(mu, scope.toString());
		return result;
	}

}
