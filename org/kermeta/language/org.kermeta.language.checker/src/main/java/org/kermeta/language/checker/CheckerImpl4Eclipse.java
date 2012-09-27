package org.kermeta.language.checker;

import org.kermeta.diagnostic.DiagnosticModel;
import org.kermeta.language.checker.api.Checker;
import org.kermeta.language.checker.api.CheckerScope;
import org.kermeta.language.checker.internal.Activator;
import org.kermeta.language.structure.AbstractMetamodel;
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
		
		DiagnosticModel result = null;
		DiagnosticModel tmpDiagnostic;
		
		for (AbstractMetamodel mm : mu.getMetamodels()) {
			((org.kermeta.language.language.checker.org.kermeta.language.structure.AbstractMetamodelAspect)mm).KersetCanUseCachedStructuralTypeDefinitions(true);
			if (result == null) {
				result = checker.checkObject(mm, scope.toString());
			}
			else {
				tmpDiagnostic = checker.checkObject(mm, scope.toString());
				result.getDiagnostics().addAll(tmpDiagnostic.getDiagnostics());
				result.getConstraints().addAll(tmpDiagnostic.getConstraints());
				result.getReferences().addAll(tmpDiagnostic.getReferences());
			}			
		}
		
		
		return result;
	}

}
