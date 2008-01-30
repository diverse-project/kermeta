/* $Id: EMFCompareModelHelper.java,v 1.1 2008-01-30 15:33:38 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.tests.comparison
 * File      : EMFCompareModelHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jan 30, 2008
 * Authors       : Cyril Faucher <cfaucher@irisa.fr>
 */
package fr.irisa.triskell.kermeta.tests.comparison;


import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.generic.DiffMaker;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.statistic.DifferencesServices;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.URIConverterImpl;

import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit;

public class EMFCompareModelHelper {
	
	/**
	 * 
	 * @param leftModelPath
	 * @param rightModelPath
	 * @return
	 */
	private static DiffModel getDiffModel(java.lang.String leftModelPath, java.lang.String rightModelPath) {
		final DiffModel diff = new DiffMaker().doDiff(getMatchModel(leftModelPath, rightModelPath));
		return diff;
	}
	
	/**
	 * 
	 * @param leftModelPath
	 * @param rightModelPath
	 * @return
	 */
	private static MatchModel getMatchModel(java.lang.String leftModelPath, java.lang.String rightModelPath) {

		try {
			// Register the extensions, we are not the two files are the same extension, also we try to register the two extensions
			EMFRuntimeUnit.registerEMFextensionToFactoryMap(leftModelPath);
			EMFRuntimeUnit.registerEMFextensionToFactoryMap(rightModelPath);
			
			// Loads the two models passed as arguments
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
	        URI left_u = URI.createURI(leftModelPath);
	        left_u = new URIConverterImpl().normalize(left_u);
	        org.eclipse.emf.ecore.resource.Resource left_resource = resourceSet.getResource(left_u, true);
	        final EObject model1 = left_resource.getContents().get(0);
	        
	        URI right_u = URI.createURI(rightModelPath);
	        right_u = new URIConverterImpl().normalize(right_u);
	        org.eclipse.emf.ecore.resource.Resource right_resource = resourceSet.getResource(right_u, true);
	        final EObject model2 = right_resource.getContents().get(0);
			
			// Creates the match then the diff model for those two models
			final MatchModel match = new DifferencesServices().modelMatch(model1, model2, new NullProgressMonitor(), null);
			
			return match;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 
	 * @param leftModelPath
	 * @param rightModelPath
	 * @return
	 */
	public static boolean compare(String leftModelPath, String rightModelPath) {
		if(((DiffGroup) getDiffModel(leftModelPath, rightModelPath).getOwnedElements().get(0)).getSubchanges()> 0) {
			return false;
		}
		return true;
	}
	
}
