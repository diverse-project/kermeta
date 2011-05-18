package org.kermeta.language.checker.api;

import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;


public interface Checker {

	public DiagnosticModel check(ModelingUnit mu, CheckerScope scope, 
							String optionalContent, MessagingSystem logger);
	
}
