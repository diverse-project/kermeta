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
import java.util.Collection;
import java.util.concurrent.Callable;

import org.eclipse.emf.ecore.EObject;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.compiler.commandline.KermetaCompiler;
import org.kermeta.kp.compiler.commandline.KpResourceHelper;
import org.kermeta.kp.compiler.commandline.ModelingUnitLoader;
import org.kermeta.kp.compiler.commandline.TracedURL;
import org.kermeta.language.structure.ModelingUnit;
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
	public /*ModelingUnit*/ Collection<ModelingUnit> call() throws Exception {
		try {
			ModelingUnitLoader muLoader = new ModelingUnitLoader(compiler.logger, compiler.runInEclipse, compiler.saveIntermediateFiles, compiler.targetIntermediateFolder);
			
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
					compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " + urlToLoad.getUrl() + " "+muLoader.lastLoadErrorMessage, KermetaCompiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
				}
			}
			else {
				compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " + urlToLoad.getUrl() + " "+muLoader.lastLoadErrorMessage, KermetaCompiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
			}
			
			/*
			ModelingUnit mu = muLoader.loadModelingUnitFromURL(urlToLoad.getUrl().toString());
			if (mu != null) {
				if (mu.getName() == null) {
					// force ModelingUnit name to the one provided in the kp
					mu.setName(urlToLoad.getUrl().toString());
				}
				return mu;
			} else {
				compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Empty ModelingUnit, failed to load " + urlToLoad.getUrl() + " "+muLoader.lastLoadErrorMessage, KermetaCompiler.LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kp.eResource().getURI().devicePath())));
			}*/
		} catch( java.io.FileNotFoundException fnfe) {
			compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Source "+urlToLoad.getUrl()+" not found", KermetaCompiler.LOG_MESSAGE_GROUP, KpResourceHelper.createFileReference(urlToLoad.getSource()));
			
		}
		catch (Exception e) {				
			compiler.logger.logProblem(MessagingSystem.Kind.UserERROR, "Problem loading "+urlToLoad.getUrl()+" "+e.getMessage(), KermetaCompiler.LOG_MESSAGE_GROUP, e, KpResourceHelper.createFileReference(urlToLoad.getSource()));			
			
		}
		return null;
	}

}
