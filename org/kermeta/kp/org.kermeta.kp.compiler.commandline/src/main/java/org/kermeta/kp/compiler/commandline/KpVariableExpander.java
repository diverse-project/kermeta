/* $Id:$ 
 * Creation : 3 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.emf.common.util.URI;
import org.kermeta.kp.Dependency;
import org.kermeta.kp.KermetaProject;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.helpers.LocalFileConverter;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.FileReference;

/**
 * Expand string with variables (${...} ) into string without variable
 *   
 * Supported variables 
 * ${project.baseUri}	 		: replaced by the location of the folder containing the current project
 * ${<dependencyName>.baseUri}	: replaced by an uri in the dependency  ( can point into a folder or into a jar file)
 * 								  as a dependency might have several urls, it will select the first url that can be resolved to an existing jar file or folder
 * ${<systemPropertyName>}		: replaced by the system property value
 */
public class KpVariableExpander {

	public static String BASEURI_VARIABLE = ".baseUri";
	public static String PROJECT_BASEURI_VARIABLE = "project"+BASEURI_VARIABLE;
	
	protected String projectUri;
	protected String kpFileURL;
	protected KermetaProject kp;
	protected LocalFileConverter fileSystemConverter;
	protected MessagingSystem logger;
	
	protected HashMap<String,String> possibleDependencyVariableReplacements = new HashMap<String,String>();

	public KpVariableExpander(String kpFileURL, KermetaProject kp, LocalFileConverter fileSystemConverter, MessagingSystem logger) {
		this.kpFileURL = kpFileURL;
		File f = new File(kpFileURL); 
		projectUri = f.getParent().replaceAll("\\\\", "/"); // get the parent using a uniform unix /
		if(projectUri.endsWith("/")  ){
			projectUri = projectUri.substring(0, projectUri.length()-1); // remove the trailing slash because we want the user to add it manually (more readable)
		}
		this.kp = kp;
		this.fileSystemConverter = fileSystemConverter;
		this.logger = logger;
		computePossibleDependencyVariableReplacements();
	}

	
	private void computePossibleDependencyVariableReplacements() {
		if(kp == null) return;
			
		for(Dependency dep : kp.getDependencies()){
			// TODO select a physically accessible url
			possibleDependencyVariableReplacements.put("${"+dep.getName()+BASEURI_VARIABLE+"}", dep.getUrl().get(0));
			
			boolean foundFile = false;
			
			// for each dependency use the first URL that works
			for(String dependencyURLWithVariable : dep.getUrl()){
				String dependencyURL = this.expandSimpleVariables(dependencyURLWithVariable);
				// try to convert it into a file URI
				if(fileSystemConverter == null){
					logger.error("fileSystemConverter not correctly initialized", KermetaCompiler.LOG_MESSAGE_GROUP, new Exception());
				}
				java.net.URI fileURI = fileSystemConverter.convertSpecialURItoFileURI(java.net.URI.create(dependencyURL));
				logger.debug( dependencyURL.toString() + " is converted to " + fileURI, 	KermetaCompiler.LOG_MESSAGE_GROUP);
				if(fileURI != null){					
					dependencyURL = fileURI.toString();
				}
				else {
					
				}
				if (dependencyURLWithVariable.contains("${")) {
					// deal with variable expansion
					logger.debug("dependency url : " + dependencyURLWithVariable + " is expanded to : " + dependencyURL , KermetaCompiler.LOG_MESSAGE_GROUP);
				}

				try {
					URL fileURL = new URL(dependencyURL);
					if( fileURL.getProtocol().equals("file")){
						File theFile;
						theFile = new File(fileURL.toURI());
						if (theFile!=null) {
							if(theFile.exists()){
								if(theFile.isDirectory()){
									foundFile = true;
									possibleDependencyVariableReplacements.put("${"+dep.getName()+BASEURI_VARIABLE+"}", theFile.getAbsolutePath());
									break; // skip other urls of this dependency
								}
							}
						}						
					}
					ZipInputStream zip;
					try {
						zip = new ZipInputStream(fileURL.openStream());
						ZipEntry ze = zip.getNextEntry();
						if(ze != null){
							// was able to read at least one entry, we consider it as a valid zip
							foundFile = true;
							possibleDependencyVariableReplacements.put("${"+dep.getName()+BASEURI_VARIABLE+"}", "jar:"+dependencyURL+"!");
							break; // skip other urls of this dependency
						}
					} catch (IOException e) {
						// not a valid zip					
					}
				} catch (URISyntaxException e) {} 
				  catch (MalformedURLException e) {	}
				
			}
			if(!foundFile){
				String msg = "Cannot find physical local file or open url stream for dependency " + dep.getName() + ". The variable ${"+dep.getName()+BASEURI_VARIABLE+"} cannot be used.";
				logger.logProblem(MessagingSystem.Kind.UserERROR, msg, 
							KermetaCompiler.LOG_MESSAGE_GROUP, KpResourceHelper.createFileReference(dep));
			}
		}
		
	}


	/**
	 * support all kind of variables, including variables to a dependency.
	 * If the variables point to a dependency it will try to expand to a file URI 
	 * @param input
	 * @return
	 */
	public String expandSourceVariables(String input) {
		if(input == null || input.isEmpty()) return input;
		
		// deal with dependency variables
		Pattern p = Pattern.compile("\\$\\{(\\w|\\.)*\\}");
		Matcher m = p.matcher(input);
		StringBuffer sb = new StringBuffer();
		boolean result = m.find();
		// Loop through and create a new String
		// with the replacements
		while (result) {
			String replacement = m.group();
			if(possibleDependencyVariableReplacements.containsKey(m.group())){
				
				
				
				replacement = possibleDependencyVariableReplacements.get(m.group());
			}
			m.appendReplacement(sb, Matcher.quoteReplacement(replacement));
			result = m.find();
		}
		// Add the last segment of input to the new String
		m.appendTail(sb);
		
		// also use simple expansion
		String allExpanded = expandSimpleVariables(sb.toString());
		
		/*if(p.matcher(allExpanded).matches()){
			System.out.println("Failed to expand some variable ");
			System.out.print("    known system properties : ");
			for (Iterator iterator = System.getProperties().keySet().iterator(); iterator.hasNext();) {
				String key = (String) iterator.next();
				System.out.print(key);
				if(iterator.hasNext()) System.out.print(", ");
				else System.out.println("");
			}				
			System.out.println("    known special properties : project.baseUri");
		}*/
		
		return allExpanded;	
		
	}
	
	
	/**
	 * expand simple variables
	 * Ie. variables that doesn't use dependency variable
	 * Ie. only ${project.baseUri} and system properties
	 * Can be used by both source and dependency
	 * @param input
	 * @return
	 */
	public String expandSimpleVariables(String input) {

		
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
			if (m.group().equals("${"+PROJECT_BASEURI_VARIABLE+"}")) {
				replacement = projectUri;
			}
			else{
				// deal with system properties
				String propertyKey =  m.group().substring(m.group().lastIndexOf("{")+1, m.group().lastIndexOf("}"));
				if(!propertyKey.isEmpty()){
					String possibleReplacement = System.getProperty(propertyKey);
					if(possibleReplacement != null){
						replacement = possibleReplacement;
					}
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
