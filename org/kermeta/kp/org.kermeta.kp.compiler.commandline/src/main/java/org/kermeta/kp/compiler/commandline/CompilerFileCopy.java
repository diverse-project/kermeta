/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : Nov 27, 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

import java.io.File;
import java.util.regex.Pattern;

import org.kermeta.kp.ImportFile;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.editor.analysis.helper.KpVariableExpander;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;


/**
 * Class for the compiler that gathers the FileCopy tasks
 *
 */
public class CompilerFileCopy {
	public static void copyInternalSourcesToResource(KermetaProject kp, String targetGeneratedResourcesFolder, MessagingSystem logger, KpVariableExpander varExpander){
		logger.log(MessagingSystem.Kind.DevDEBUG, "Copying internal sources to "+targetGeneratedResourcesFolder +KermetaCompiler.DEFAULT_KP_METAINF_LOCATION_IN_JAR, KermetaCompiler.LOG_MESSAGE_GROUP);
		// copy all internal sources in exported resource for possible reuse by a project using extends
		for( ImportFile importFile : kp.getImportedFiles()){
			if(importFile.getUrl().startsWith( "${project.baseUri}")){
				try{
					File inputFile = new File(new java.net.URI(varExpander.expandVariables(importFile.getUrl())));
					File outputFile = new File(targetGeneratedResourcesFolder + KermetaCompiler.DEFAULT_KP_METAINF_LOCATION_IN_JAR + importFile.getUrl().replaceFirst( Pattern.quote("${project.baseUri}"), ""));
					FileHelpers.copyFile(inputFile, outputFile);
				}
				catch(Exception e){
					logger.log(MessagingSystem.Kind.UserERROR, "Failed to copy "+importFile.getUrl()+ " to "+KermetaCompiler.DEFAULT_KP_METAINF_LOCATION_IN_JAR, KermetaCompiler.LOG_MESSAGE_GROUP, e);
				}
			}
		}
	}

}
