package org.kermeta.language.autocompletion.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface Autocompletion {
	
	public List<String> getAllVariableDecl();
	public List<String> getAllClassDefinition(String thePackages);
	public List<String> getAllPackages();
	public List<String> getSubPackages(String thePackages);
	public HashMap<String,ArrayList<String>> getCallExpression(ArrayList<String> theIdentifiers,String thePackage);

}
