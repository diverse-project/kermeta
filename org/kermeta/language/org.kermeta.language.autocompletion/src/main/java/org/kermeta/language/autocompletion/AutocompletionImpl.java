package org.kermeta.language.autocompletion;

import java.util.ArrayList;
import java.util.HashMap;
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
	public List<String> getAllClassDefinition(String thePackages) {
		return accessor.getAllClassDefinition(thePackages);
	}
	
	@Override
	public List<String> getAllPackages() {
		return accessor.getAllPackages();
	}
	
	@Override
	public List<String> getSubPackages(String thePackages) {
		return accessor.getSubPackages(thePackages);
	}

	@Override
	public HashMap<String,ArrayList<String>> getCallExpression(ArrayList<String> theIdentifiers,String thePackage) {
		return accessor.getCallExpression(theIdentifiers, thePackage);
	}

}
