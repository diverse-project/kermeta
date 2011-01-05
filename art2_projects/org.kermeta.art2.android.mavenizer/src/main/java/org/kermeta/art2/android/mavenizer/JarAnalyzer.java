/* $Id: $
 * Project    : org.kermeta.tools.simple.maven.osgi.file.deploy
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 29 juil. 2010
 * Authors : 
 *           Didier Vojtisek <didier.vojtisek@inria.fr> 
 */
package org.kermeta.art2.android.mavenizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JarAnalyzer {
	
	String artifactId = "";
	String version = "";
	
	public JarAnalyzer(String jarFileName) {
		analyzeJarName(jarFileName);
	}
	
	protected void analyzeJarName(String jarFileName){
		StringBuffer artifactIdBuffer = new StringBuffer();
		StringBuffer versionBuffer = new StringBuffer();
		java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(jarFileName.replace(".jar", ""), "_");
		boolean versionFound = false;
		boolean isFirstTokenOfId = true;
		boolean isFirstTokenOfVersion = true;
		while ( tokenizer.hasMoreTokens() ) {
			String currentToken = tokenizer.nextToken();
			Pattern p = Pattern.compile("\\d.*");
			Matcher m = p.matcher(currentToken);
			if( !versionFound && m.matches() && 
					!((currentToken.startsWith("64") ) &&  // be careful about false positive "x86_64"
							artifactIdBuffer.toString().endsWith("x86"))	){
				versionFound= true;
			}
			if(versionFound){
				if(!isFirstTokenOfVersion){
					versionBuffer.append("_");
				}
				versionBuffer.append(currentToken);
				isFirstTokenOfVersion=false;
			}
			else{
				if(!isFirstTokenOfId){
					artifactIdBuffer.append("_");
				}
				artifactIdBuffer.append(currentToken); 
			}
			isFirstTokenOfId=false;
			
		}
		if(!versionFound){
			versionBuffer.append("1.0.0");
		}
		artifactId = artifactIdBuffer.toString();
		version = versionBuffer.toString();
	}
	
	public String getArtifactId(){		
		return artifactId;
	}
	protected String getVersion(){
		return version;
	}
}
