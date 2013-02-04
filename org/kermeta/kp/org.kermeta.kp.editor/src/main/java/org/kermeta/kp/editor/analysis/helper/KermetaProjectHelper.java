/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 5 oct. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.editor.analysis.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.kermeta.kp.ImportProject;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.PackageEquivalence;
import org.kermeta.utils.aether.LocalFileConverterForAether;
import org.kermeta.utils.helpers.CompositeLocalFileConverter;
import org.kermeta.utils.helpers.LocalFileConverter;
import org.kermeta.utils.helpers.eclipse.LocalFileConverterForEclipse;
import org.kermeta.utils.aether.LocalFileConverterForAether;
import org.kermeta.utils.helpers.CompositeLocalFileConverter;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;

public class KermetaProjectHelper {
	public static String DEFAULT_KP_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_REFLEXIVITY_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String DEFAULT_KP_LOCATION_IN_FOLDER = "/project.kp";
	public static String DEFAULT_BINARY_LOCATION_IN_FOLDER = "/target/scalaclasses";
	public static String DEFAULT_EMFBINARY_LOCATION_IN_FOLDER = "/target/emfclasses";
	
	public static  List<KermetaProject> collectKermetaProjectFromImports(KermetaProject kp) {

		List<KermetaProject> result = new ArrayList<KermetaProject>();
		result.addAll(collectKermetaProjectFromImportProjectSources(kp));
		result.addAll(collectKermetaProjectFromImportProjects(kp));
		return result;
	}
	public static  List<KermetaProject> collectKermetaProjectFromImportProjects(KermetaProject kp) {
		StdioSimpleMessagingSystem logger = new StdioSimpleMessagingSystem();
		LocalFileConverter fileSystemConverter = getNewLocalFileConverter(logger);
		KpVariableExpander varExpander = new KpVariableExpander(kp.eResource().getURI().toString(),
				kp, 
				fileSystemConverter, 
				logger);
		
		
		List<KermetaProject> result = new ArrayList<KermetaProject>();
		for (ImportProject importedProjectJar : kp.getImportedProjects()) {
			String containerUrl = varExpander.getSelectedUrl4ReusableResource(importedProjectJar.getProjectResource());
			KermetaProject foundProject = KpResourceHelper.findKermetaProject(containerUrl.endsWith(".jar")? "jar:"+containerUrl+"!"+DEFAULT_KP_LOCATION_IN_JAR : containerUrl+DEFAULT_KP_LOCATION_IN_FOLDER,
					kp.eResource());
			if(foundProject != null){
				result.add(foundProject);
			}
		}
		
		return result;
	}
	
	public static  List<KermetaProject> collectKermetaProjectFromImportProjectSources(KermetaProject kp) {
		StdioSimpleMessagingSystem logger = new StdioSimpleMessagingSystem();
		LocalFileConverter fileSystemConverter = getNewLocalFileConverter(logger);
		KpVariableExpander varExpander = new KpVariableExpander(kp.eResource().getURI().toString(),
				kp, 
				fileSystemConverter, 
				logger);
		
		
		List<KermetaProject> result = new ArrayList<KermetaProject>();
		for(ImportProjectSources importedProjectSources : kp.getImportedProjectSources() ){
			String containerUrl = varExpander.getSelectedUrl4ReusableResource(importedProjectSources.getProjectResource());
			java.net.URI fileURI = fileSystemConverter.convertSpecialURItoFileURI(java.net.URI.create(containerUrl));
			String containerLocalUrl = fileURI != null ? fileURI.toString(): containerUrl;
			KermetaProject foundProject = KpResourceHelper.findKermetaProject(containerLocalUrl.endsWith(".jar") ? "jar:"+containerLocalUrl+"!"+DEFAULT_KP_LOCATION_IN_JAR : containerLocalUrl+DEFAULT_KP_LOCATION_IN_FOLDER,
					kp.eResource());
			if(foundProject != null){
				result.add(foundProject);
			}
			else{
				logger.debug("kp file not found in " +containerLocalUrl, "KermetaProjectHelper");
			}
		}
		
		return result;
	}
	

	public static LocalFileConverter getNewLocalFileConverter(StdioSimpleMessagingSystem logger){
		return new CompositeLocalFileConverter(new ArrayList<LocalFileConverter>(
				Arrays.asList(new LocalFileConverterForEclipse(), 
						new LocalFileConverterForAether(logger,"KermetaProjectHelper","http://maven.inria.fr/artifactory/public"))));
	}

}
