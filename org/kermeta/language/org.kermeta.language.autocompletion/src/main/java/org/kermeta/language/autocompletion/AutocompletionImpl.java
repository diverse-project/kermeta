package org.kermeta.language.autocompletion;

import java.util.List;

import org.kermeta.language.autocompletion.api.Autocompletion;
import org.kermeta.language.autocompletion.internal.MetaModelAccessor;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class AutocompletionImpl implements Autocompletion {
	
	MetaModelAccessor accessor = null;
	MessagingSystem logger = null;
	
	public AutocompletionImpl(MessagingSystem logger,ModelingUnit aModelingUnit) {
		accessor = new MetaModelAccessor(aModelingUnit);
		this.logger = logger;
		
	}

	public List<String> getAllVariableDecl() {
		return accessor.getAllVariableDecl();
	}

	@Override
	public List<String> getAllOperations() {
		return accessor.getAllOperations();
	}

	@Override
	public List<String> getAllClassDefinition() {
		return accessor.getAllClassDefinition();
	}
	
	@Override
	public List<String> getAllPackages() {
		return accessor.getAllPackages();
	}

}
