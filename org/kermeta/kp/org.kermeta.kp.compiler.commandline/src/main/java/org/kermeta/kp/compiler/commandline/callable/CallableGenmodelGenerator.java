/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 25 nov. 2011
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline.callable;

import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

//import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelUtil;
import org.kermeta.emf.genmodel.GenModelHelper;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

public class CallableGenmodelGenerator implements Callable<Boolean> {
	public MessagingSystem logger;
	public List<File> inputEcoreFiles;
	public File genmodelFile;
	public File generatedSourcePath;
	public String eclipseProject;
	
	public CallableGenmodelGenerator(MessagingSystem logger, List<File> inputEcoreFiles, File genmodelFile, File generatedSourcePath, String eclipseProject) {
		super();
		this.logger = logger;
		this.generatedSourcePath = generatedSourcePath;
		this.inputEcoreFiles = inputEcoreFiles;
		this.genmodelFile = genmodelFile;
		this.eclipseProject = eclipseProject;
	}


	@Override
	public Boolean call() throws Exception {
		

		GenModelHelper helper = new GenModelHelper(logger, eclipseProject);
		helper.createGenModel(inputEcoreFiles, genmodelFile, generatedSourcePath, false);
		
		return true;
	}
}
