/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 30 janv. 2013
* Authors : 
*      Didier Vojtisek <didier.vojtisek@inria.fr>
*/
package org.kermeta.kp.compiler.commandline;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.kermeta.kp.KermetaProject;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl4Eclipse;
import org.kermeta.language.merger.binarymerger.api.KmBinaryMerger;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.result.ErrorProneResult;
import org.kermeta.utils.systemservices.api.result.ResultProblemMessage;


/**
 * 
 * builder responsible for building the modelingUnit that merges all importProject of a given kp
 *
 */
public class MergeImportProjectBuilder {

	
	public MessagingSystem logger;
	public KermetaCompiler compiler;
	
	public MergeImportProjectBuilder(KermetaCompiler compiler, MessagingSystem logger) {
		this.logger = logger;
		this.compiler = compiler;
	}
	
	
	// TODO implement cache mechanism (on disk for sure, is in memory possible ?)
	public ErrorProneResult<ModelingUnit> getMergedImportProjects(KermetaProject kp) throws IOException{
		CollectSourcesHelper collectHelper = new CollectSourcesHelper(compiler, logger);
		
		// collect sources
		ArrayList<TracedURL> projectUrlToMerge = collectHelper.getProjects4GenericMerge(kp);
		List<ModelingUnit> modelingUnits = collectHelper.getSourceModelingUnits(kp, projectUrlToMerge, new HashMap<URL, ModelingUnit>());
		
		if (modelingUnits.size() == 0 ) return null;
		
		
		KmBinaryMerger theMerger = null;
		

		if (compiler.runInEclipse) {
			theMerger = new KmBinaryMergerImpl4Eclipse();
		} else {
			theMerger = new KmBinaryMergerImpl();
		}
		
		// merge
		ErrorProneResult<ModelingUnit> mergedMU = new ErrorProneResult<ModelingUnit>(modelingUnits.get(0));

		if (modelingUnits.size() > 1) {
			// Use KmBinaryMerger to be able to use ErrorProneResults to track
			// problems

			List<ResultProblemMessage> problems = new ArrayList<ResultProblemMessage>();

			for (int i = 1; i < modelingUnits.size(); i++) {
				
				logger.debug("importProject merging "+mergedMU.getResult().getDescriptionString()+" + "+modelingUnits.get(i).getDescriptionString(), compiler.getContributedProgressGroup());
				mergedMU = theMerger.genericMerge(mergedMU.getResult(), modelingUnits.get(i));
				//mergedMU.getResult().setName(kp.getMetamodelName());
				// Save previous problems
				for (ResultProblemMessage prob : mergedMU.getProblems()) {
					problems.add(prob);
				}
			}

			// Add all previous problems to the last mergedMU ErrorProneResult.
			mergedMU.getProblems().addAll(problems);
		}
		
		return mergedMU;
	}
	
}
