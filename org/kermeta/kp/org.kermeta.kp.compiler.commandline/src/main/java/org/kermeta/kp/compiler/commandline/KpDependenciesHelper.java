/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : Nov 14, 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.kermeta.kp.ImportFile;
import org.kermeta.kp.ImportProject;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.editor.analysis.helper.KermetaProjectHelper;
import org.kermeta.kp.editor.analysis.helper.KpResourceHelper;
import org.kermeta.kp.editor.analysis.helper.KpVariableExpander;

/**
 * Useful methods related to KP dependencies (including calculation of classpath)
 * @author dvojtise
 *
 */
public class KpDependenciesHelper {

	/**
	 * return a list of available jar on the file system corresponding to the kp dependencies that must be part of the classpath
	 * @param kp
	 * @param varExpander
	 * @return
	 * @throws IOException
	 */
	static public LinkedHashSet<String> getDependentProjetsClasspath(KermetaProject kp, KpVariableExpander varExpander) throws IOException {
		LinkedHashSet<String> result = new LinkedHashSet<String>();
		// deal with importProjects
		for(ImportProject dep : kp.getImportedProjects()){
			String containerUrl = varExpander.getSelectedUrl4ReusableResource(dep.getProjectResource());
			// add it in classpath	
			if( containerUrl.endsWith(".jar")){
				result.add(convertUrlToclassPath(containerUrl));
			}
			else{
				// add it as an eclipse project
				result.add(convertUrlToclassPath(containerUrl)+KermetaProjectHelper.DEFAULT_BINARY_LOCATION_IN_FOLDER);
				result.add(convertUrlToclassPath(containerUrl)+KermetaProjectHelper.DEFAULT_EMFBINARY_LOCATION_IN_FOLDER);
			}
			
			// if it is a kermeta project, add its DependentProjectsClassPath
			String kpFileURL = containerUrl.endsWith(".jar")?	"jar:"+containerUrl+"!"+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_JAR : containerUrl+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_FOLDER; 
			KermetaProject foundProject = KpResourceHelper.findKermetaProject( kpFileURL, kp.eResource());
			if(foundProject != null){
				KpVariableExpander innerVarExpander = new KpVariableExpander(kpFileURL, foundProject, varExpander.getFileSystemConverter(), varExpander.getLogger());				
				result.addAll(getDependentProjetsClasspath(foundProject, innerVarExpander));
			}
			
		}
		// deal with extends
		for(ImportProjectSources dep : kp.getImportedProjectSources()){
			// this is kermeta project, add its DependentProjectsClassPath but not the project itself
			String containerUrl = varExpander.getSelectedUrl4ReusableResource(dep.getProjectResource());
						
			// if it is a kermeta project, add its DependentProjectsClassPath
			String kpFileURL = containerUrl.endsWith(".jar")?	"jar:"+containerUrl+"!"+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_JAR : containerUrl+KermetaProjectHelper.DEFAULT_KP_LOCATION_IN_FOLDER; 
			KermetaProject foundProject = KpResourceHelper.findKermetaProject( kpFileURL, kp.eResource());
			if(foundProject != null){
				KpVariableExpander innerVarExpander = new KpVariableExpander(kpFileURL, foundProject, varExpander.getFileSystemConverter(), varExpander.getLogger());				
				result.addAll(getDependentProjetsClasspath(foundProject, innerVarExpander));
			}
			
		}
		
		// deal with EMFBytecode
		for(ImportFile importedFile : kp.getImportedFiles()){
			if (importedFile.getBytecodeFrom() != null){
				String containerUrl = varExpander.getSelectedUrl4ReusableResource(importedFile.getBytecodeFrom());
				// add it in classpath			
				result.add(convertUrlToclassPath(containerUrl));
			}
		}
		return result;
	}
	
	
	static public String convertUrlToclassPath(String urlString){
		try {
			URL jarURL = new URL(urlString);
			/*if (jarURL.getProtocol().equals("jar") && jarURL.getFile().endsWith("!/")){
				// this is something like jar:file:/C:/eclipse3.7_base/eclipse/plugins/org.eclipse.emf.ecore_2.7.0.v20110912-0920.jar!/
				jarURL = new URL(jarURL.getFile().replaceAll("!/", ""));
			}*/
			if( jarURL.getProtocol().equals("file")){ 
				File theFile = new File(jarURL.toURI());
				if (theFile!=null) {
					if(theFile.exists()){
						if(theFile.getName().equals("bundlefile")){
							//some version of scala compiler doesn't accept classpath to jar that doesn't end with .jar
							// so bundlefile that are used by OSGI doesn't works correctly
							// create a copy with the correct name
							
							File outFile = new File(java.net.URI.create(jarURL+".jar"));
							if(!outFile.exists()){
								// copy the file to have the correct extension
								InputStream inputStream = new FileInputStream(theFile);					
								OutputStream out = new FileOutputStream(outFile);
								 
								int read = 0;
								byte[] bytes = new byte[1024];
							 
								while ((read = inputStream.read(bytes)) != -1) {
									out.write(bytes, 0, read);
								}
							 
								inputStream.close();
								out.flush();
								out.close();
							}
							theFile = outFile;
						}
						return theFile.getAbsolutePath();
					}
				}
			
			}
		} catch (URISyntaxException e) {}
		catch (java.net.MalformedURLException e) {}
		catch(IOException e){}
		// ignore URI that cannot be translated into a local file ...
		return urlString;
	}
}
