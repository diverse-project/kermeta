/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 3 oct. 2012
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.editor.analysis.helper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Metamodel;
import org.kermeta.kp.editor.IKpReferenceResolveResult;


public class MetamodelResolver {

	
	
	
	public void doResolve(String identifier, EObject container,
			EReference reference, int position,
			boolean resolveFuzzy, IKpReferenceResolveResult<Metamodel> result) {
		
		// we collect all metamodels that are reachable in this map. once all
		// metamodels have been collected, whether they match the identifier
		// we are looking for. this way, we can resolve both fuzzy and non-fuzzy
		// the same way.
		Map<String, Metamodel> candidates = new LinkedHashMap<String, Metamodel>();
		// first: add all metamodel from current project
		EObject rootContainer = EcoreUtil.getRootContainer(container);
		if (rootContainer instanceof KermetaProject) {
			KermetaProject kp = (KermetaProject) rootContainer;
			addCandidates(candidates, kp);
			// second: add all metamodels from imported KermetaProjects
			List<KermetaProject> importedProjects = KermetaProjectHelper.collectKermetaProjectFromImports(kp);
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
		// if we could not resolve the identifier, try to give a more
		// detailed error message
		if (!result.wasResolved()) {
			StringBuffer sb = new StringBuffer();
			for (String nextIdentifier : candidates.keySet()) {
				if(!nextIdentifier.equals(candidates.keySet().iterator().next())){
					sb.append(", ");
				}
				sb.append(nextIdentifier);
				
			}
			result.setErrorMessage("'" + identifier + "' not found. \nCurrently known metamodels are : "+sb);			
		}
		
	}
	private void addCandidates(Map<String, Metamodel> candidates, KermetaProject kp) {
		for (Metamodel next : kp.getMetamodels()) {
			candidates.put(next.getMetamodelName(), next);			
		}
	}

	

	
	
	public String doDeResolve(Metamodel element, Metamodel container,
			EReference reference) {
		return element.getMetamodelName();
	}
	

}



