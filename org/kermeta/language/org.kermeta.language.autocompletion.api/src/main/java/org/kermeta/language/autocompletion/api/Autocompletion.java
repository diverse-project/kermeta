package org.kermeta.language.autocompletion.api;

import java.util.List;

public interface Autocompletion {
	
	public List<String> getAllVariableDecl();
	public List<String> getAllOperations();
	public List<String> getAllClassDefinition(String thePackages);
	public List<String> getAllPackages();
	public List<String> getSubPackages(String thePackages);

}
