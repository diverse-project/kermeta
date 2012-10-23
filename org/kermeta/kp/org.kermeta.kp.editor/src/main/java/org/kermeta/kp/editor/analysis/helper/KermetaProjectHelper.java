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
import java.util.List;

import org.kermeta.kp.ImportProjectJar;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.PackageEquivalence;
import org.kermeta.utils.helpers.eclipse.LocalFileConverterForEclipse;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;

public class KermetaProjectHelper {
	public static String DEFAULT_KP_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_REFLEXIVITY_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String DEFAULT_KP_LOCATION_IN_FOLDER = "/project.kp";
	
	public static  List<KermetaProject> collectKermetaProjectFromImports(KermetaProject kp) {

		List<KermetaProject> result = new ArrayList<KermetaProject>();
		result.addAll(collectKermetaProjectFromImportProjectSources(kp));
		result.addAll(collectKermetaProjectFromImportProjectJar(kp));
		return result;
	}
	public static  List<KermetaProject> collectKermetaProjectFromImportProjectJar(KermetaProject kp) {
		KpVariableExpander varExpander = new KpVariableExpander(kp.eResource().getURI().toString(),
				kp, 
				new LocalFileConverterForEclipse(), 
				new StdioSimpleMessagingSystem());
		
		
		List<KermetaProject> result = new ArrayList<KermetaProject>();
		for (ImportProjectJar importedProjectJar : kp.getImportedProjectJars()) {
			String containerUrl = varExpander.expandVariables(importedProjectJar.getUrl());
			KermetaProject foundProject = KpResourceHelper.findKermetaProject(containerUrl.endsWith(".jar")? "jar:"+containerUrl+"!"+DEFAULT_KP_LOCATION_IN_JAR : containerUrl+DEFAULT_KP_LOCATION_IN_FOLDER,
					kp.eResource());
			if(foundProject != null){
				result.add(foundProject);
			}
		}
		
		return result;
	}
	
	public static  List<KermetaProject> collectKermetaProjectFromImportProjectSources(KermetaProject kp) {
		KpVariableExpander varExpander = new KpVariableExpander(kp.eResource().getURI().toString(),
				kp, 
				new LocalFileConverterForEclipse(), 
				new StdioSimpleMessagingSystem());
		
		
		List<KermetaProject> result = new ArrayList<KermetaProject>();
		for(ImportProjectSources importedProjectSources : kp.getImportedProjectSources() ){
			String containerUrl = varExpander.expandVariables(importedProjectSources.getUrl());
			KermetaProject foundProject = KpResourceHelper.findKermetaProject(containerUrl.endsWith(".jar") ? "jar:"+containerUrl+"!"+DEFAULT_KP_LOCATION_IN_JAR : containerUrl+DEFAULT_KP_LOCATION_IN_FOLDER,
					kp.eResource());
			if(foundProject != null){
				result.add(foundProject);
			}
		}
		
		return result;
	}
	


}
