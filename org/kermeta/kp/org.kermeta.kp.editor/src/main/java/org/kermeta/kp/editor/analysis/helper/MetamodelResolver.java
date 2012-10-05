/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 3 oct. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.editor.analysis.helper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.kp.ImportProjectJar;
import org.kermeta.kp.ImportProjectSources;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Metamodel;
import org.kermeta.kp.editor.IKpReferenceResolveResult;
import org.kermeta.utils.helpers.eclipse.LocalFileConverterForEclipse;
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem;


public class MetamodelResolver {
	public static String DEFAULT_KP_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_REFLEXIVITY_METAINF_LOCATION_IN_JAR = "/META-INF/kermeta";
	public static String DEFAULT_KP_LOCATION_IN_JAR = DEFAULT_KP_METAINF_LOCATION_IN_JAR + "/project.kp";
	public static String DEFAULT_KP_LOCATION_IN_FOLDER = "/project.kp";
	
	
	// TODO having state in resolver classes may be a problem, because
	// there is no guarantee about how resolver classes are reused.
	protected Resource resource = null;
	
	
	public void doResolve(String identifier, EObject container,
			EReference reference, int position,
			boolean resolveFuzzy, IKpReferenceResolveResult<Metamodel> result) {
		
		// we collect all metamodels that are reachable in this map. once all
		// metamodels have been collected, whether they match the identifier
		// we are looking for. this way, we can resolve both fuzzy and non-fuzzy
		// the same way.
		Map<String, Metamodel> candidates = new LinkedHashMap<String, Metamodel>();
		resource = container.eResource();
		// first: add all metamodel from current project
		EObject rootContainer = EcoreUtil.getRootContainer(container);
		if (rootContainer instanceof KermetaProject) {
			KermetaProject kp = (KermetaProject) rootContainer;
			addCandidates(candidates, kp);
			// second: add all metamodels from imported KermetaProjects
			List<KermetaProject> importedProjects = collectImports(kp);
			for (KermetaProject importedKp : importedProjects) {
					addCandidates(candidates, importedKp);
			}
		}
		
		String currentMMName = "";
		if(container instanceof Metamodel){
			currentMMName = ((Metamodel)container).getMetamodelName();
		}
		for (String nextIdentifier : candidates.keySet()) {
			Metamodel next = candidates.get(nextIdentifier);
			// ignore self
			if(!currentMMName.equals(nextIdentifier)){
				if (resolveFuzzy) {
					result.addMapping(nextIdentifier, next);
				} else {
					if (nextIdentifier != null && nextIdentifier.equals(identifier)) {
						result.addMapping(identifier, next);
						return;
					}
					
				}
			}
		}
		
	}
	private void addCandidates(Map<String, Metamodel> candidates, KermetaProject kp) {
		for (Metamodel next : kp.getMetamodels()) {
			candidates.put(next.getMetamodelName(), next);			
		}
	}
	private List<KermetaProject> collectImports(KermetaProject kp) {
		KpVariableExpander varExpander = new KpVariableExpander(kp.eResource().getURI().toString(),
				kp, 
				new LocalFileConverterForEclipse(), 
				new StdioSimpleMessagingSystem());
		
		
		List<KermetaProject> result = new ArrayList<KermetaProject>();
		for (ImportProjectJar importedProjectJar : kp.getImportedProjectJars()) {
			String containerUrl = varExpander.expandVariables(importedProjectJar.getUrl());
			KermetaProject foundProject = findKermetaProject(containerUrl.endsWith(".jar")? containerUrl+DEFAULT_KP_LOCATION_IN_JAR : containerUrl+DEFAULT_KP_LOCATION_IN_FOLDER);
			if(foundProject != null){
				result.add(foundProject);
			}
		}
		for(ImportProjectSources importedProjectSources : kp.getImportedProjectSources() ){
			String containerUrl = varExpander.expandVariables(importedProjectSources.getUrl());
			KermetaProject foundProject = findKermetaProject(containerUrl.endsWith(".jar") ? containerUrl+DEFAULT_KP_LOCATION_IN_JAR : containerUrl+DEFAULT_KP_LOCATION_IN_FOLDER);
			if(foundProject != null){
				result.add(foundProject);
			}
		}
		
		return result;
	}
	
	private KermetaProject findKermetaProject(String uriString) {
		if (resource == null) {
			return null;
		}
		ResourceSet rs = resource.getResourceSet();
		if (rs == null) {
			return null;
		}
		Resource kermetaProjectResource = null;
		URI uri = URI.createURI(uriString);
		
		URI resourceURI = resource.getURI();
		if (resourceURI.isRelative() || resourceURI.isHierarchical()) {
			uri = uri.resolve(resourceURI); // relative
		}
		try {
			kermetaProjectResource = rs.getResource(uri, true);
		} catch (Exception e) {
		}

		if (kermetaProjectResource == null ||
				kermetaProjectResource.getContents().isEmpty() || 
			!(kermetaProjectResource.getContents().get(0) instanceof KermetaProject)) {
			return null;
		}
		return (KermetaProject) kermetaProjectResource.getContents().get(0);
	}
	
	
	public String doDeResolve(Metamodel element, Metamodel container,
			EReference reference) {
		return element.getMetamodelName();
	}
}



