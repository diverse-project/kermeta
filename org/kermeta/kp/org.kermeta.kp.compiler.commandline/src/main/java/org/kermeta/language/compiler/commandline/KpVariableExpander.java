/* $Id:$ 
 * Creation : 3 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.compiler.commandline;

public class KpVariableExpander {

	protected String projectUri;
	
	public KpVariableExpander(String kpFileURL){
		projectUri = kpFileURL;
	}
	
	public String expandVariables(String input){
		
		// TODO write a real parser ....
		
		input = input.replaceAll("${project.baseUri}", projectUri);
		
		return input;
	}
}
