/* $Id:$ 
 * Creation : 3 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.compiler.commandline;

import java.io.File;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Supported special Variables (in additio to system variables
 * ${project.baseUri}
 */
public class KpVariableExpander {

	protected String projectUri;

	public KpVariableExpander(String kpFileURL) {
		File f = new File(kpFileURL);
		projectUri = f.getParentFile().toURI().toString();
	}

	public String expandVariables(String input) {

		
		if(input == null || input.isEmpty()) return input;
		// TODO write a real parser ....
		Pattern p = Pattern.compile("\\$\\{(\\w|\\.)*\\}");
		Matcher m = p.matcher(input);
		StringBuffer sb = new StringBuffer();
		boolean result = m.find();
		// Loop through and create a new String
		// with the replacements
		while (result) {
			String replacement = m.group();
			// deal with special variable
			if (m.group().equals("${project.baseUri}")) {
				replacement = projectUri;
			}
			else{
				// deal with system properties
				String propertyKey =  m.group().substring(m.group().lastIndexOf("{")+1, m.group().lastIndexOf("}"));
				String possibleReplacement = System.getProperty(propertyKey);
				if(possibleReplacement != null){
					replacement = possibleReplacement;
				}
			}
			if(replacement.equals(m.group())){
				System.out.println("Failed to expand variable "+ m.group());
				System.out.print("    known system properties : ");
				for (Iterator iterator = System.getProperties().keySet().iterator(); iterator.hasNext();) {
					String key = (String) iterator.next();
					System.out.print(key);
					if(iterator.hasNext()) System.out.print(", ");
					else System.out.println("");
				}				
				System.out.println("    known special properties : project.baseUri");
			}
			m.appendReplacement(sb, Matcher.quoteReplacement(replacement));
			result = m.find();
		}
		// Add the last segment of input to the new String
		m.appendTail(sb);
		
		return sb.toString();
	}
}
