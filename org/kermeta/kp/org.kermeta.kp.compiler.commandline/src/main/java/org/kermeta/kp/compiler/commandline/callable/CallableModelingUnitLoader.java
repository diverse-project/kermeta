/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 11 oct. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline.callable;

import java.util.Collection;
import java.util.concurrent.Callable;

import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.kp.compiler.commandline.KpResourceHelper;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoader;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoaderFactory;
import org.kermeta.kp.compiler.commandline.TracedURL;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.FileReference;


public class CallableModelingUnitLoader implements Callable<Collection<ModelingUnit>> {

	public TracedURL urlToLoad;
	public KermetaCompiler compiler;
	KermetaProject kp;
	String projectName;
	
	public CallableModelingUnitLoader(TracedURL urlToLoad, KermetaCompiler compiler, KermetaProject kp, String projectName){
		this.urlToLoad = urlToLoad;
		this.compiler = compiler;
		this.kp = kp;
		this.projectName = projectName;
	}
	
	@Override
	public Collection<ModelingUnit> call() throws Exception {
		try {
			ModelingUnitLoader muLoader = null; // = new ModelingUnitLoader(compiler.logger, compiler.runInEclipse, compiler.saveIntermediateFiles, compiler.targetIntermediateFolder);

			// Search among the known file extensions one that matches the url to load
			// Starts from the longest one to avoid conflict, 
			// e.g. the .profile.uml loader will have higher priority than the .uml loader
			String urlString = urlToLoad.getUrl().toString();
			
			for(String key : compiler.muLoaders.descendingKeySet()){
				if(urlString.endsWith(key)){
					ModelingUnitLoaderFactory factory = compiler.muLoaders.get(key);
					muLoader = factory.createModelingUnitLoader(compiler.logger, compiler.runInEclipse, compiler.saveIntermediateFiles, compiler.targetIntermediateFolder);
					break;
				}
			}
			
			if(muLoader==null){
				compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Problem loading "+urlToLoad.getUrl()+" Unknown file extension", KermetaCompiler.LOG_MESSAGE_GROUP, KpResourceHelper.createFileReference(urlToLoad.getSource()));			
				compiler.failWithMessage("Problem loading "+urlToLoad.getUrl()+" Unknown file extension");
				return null;
			}
			
			Collection<ModelingUnit> mus = muLoader.loadModelingUnitFromURL(urlToLoad.getUrl().toString());
			
			if (mus != null) {
				if (mus.size()>0) {
					for (ModelingUnit mu : mus) {
						if (mu.getName() == null) {
							// force ModelingUnit name to the one provided in the kp
							mu.setName(urlToLoad.getUrl().toString());
						}
						return mus;
					}
				}
				else {
					compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " + urlToLoad.getUrl() + " "+muLoader.getLastLoadErrorMessage(), KermetaCompiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
				}
			}
			else {
				compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " + urlToLoad.getUrl() + " "+muLoader.getLastLoadErrorMessage(), KermetaCompiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
			}
			
		} catch( java.io.FileNotFoundException fnfe) {
			compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Source "+urlToLoad.getUrl()+" not found", KermetaCompiler.LOG_MESSAGE_GROUP, KpResourceHelper.createFileReference(urlToLoad.getSource()));
			compiler.failWithMessage("Source "+urlToLoad.getUrl()+" not found");
		}
		catch (Exception e) {				
			compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Problem loading "+urlToLoad.getUrl()+" "+e.getMessage(), KermetaCompiler.LOG_MESSAGE_GROUP, e, KpResourceHelper.createFileReference(urlToLoad.getSource()));			
			compiler.failWithMessage("Problem loading "+urlToLoad.getUrl()+" "+e.getMessage());
		}
		return null;
	}

}
