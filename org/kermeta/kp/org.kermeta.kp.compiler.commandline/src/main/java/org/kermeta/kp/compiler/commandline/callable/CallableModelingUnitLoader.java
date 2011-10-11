/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 oct. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline.callable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;

import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoader;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.FileReference;


public class CallableModelingUnitLoader implements Callable<ModelingUnit> {

	public URL urlToLoad;
	public KermetaCompiler compiler;
	KermetaProject kp;
	String projectName;
	
	public CallableModelingUnitLoader(URL urlToLoad, KermetaCompiler compiler, KermetaProject kp, String projectName){
		this.urlToLoad = urlToLoad;
		this.compiler = compiler;
		this.kp = kp;
		this.projectName = projectName;
	}
	
	@Override
	public ModelingUnit call() throws Exception {
		try {
			ModelingUnitLoader muLoader = new ModelingUnitLoader(compiler.logger, compiler.runInEclipse, compiler.saveIntermediateFiles, compiler.targetIntermediateFolder);
			ModelingUnit mu = muLoader.loadModelingUnitFromURL(urlToLoad.toString());
			if (mu != null) {
				if (mu.getName() == null) {
					// force ModelingUnit name to the one provided in the kp
					mu.setName(projectName);
				}
				return mu;
			} else {
				compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " + urlToLoad + " "+muLoader.lastLoadErrorMessage, KermetaCompiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
			}
		} catch( java.io.FileNotFoundException fnfe) {
			try {	
				compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Source "+urlToLoad+" not found", KermetaCompiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
			} catch (MalformedURLException f) {
				compiler.logger.log(MessagingSystem.Kind.DevWARNING, "cannot mark problem, using error message instead", KermetaCompiler.LOG_MESSAGE_GROUP, f);
				compiler.logger.log(MessagingSystem.Kind.UserERROR, "Source "+urlToLoad+" not found", KermetaCompiler.LOG_MESSAGE_GROUP);
			}
		}
		catch (Exception e) {				
			try {
				compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Problem loading "+urlToLoad+" "+e.getMessage(), KermetaCompiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
			} catch (MalformedURLException f) {
				compiler.logger.log(MessagingSystem.Kind.DevWARNING, "cannot mark problem, using error message instead", KermetaCompiler.LOG_MESSAGE_GROUP, f);
				compiler.logger.log(MessagingSystem.Kind.UserERROR, "Problem loading "+urlToLoad+" "+e.getMessage(), KermetaCompiler.LOG_MESSAGE_GROUP);
			}
			
		}
		return null;
	}

}
