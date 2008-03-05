/* $Id: EMFCompareModelHelper.java,v 1.8 2008-03-05 17:04:02 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.tests.comparison
 * File      : EMFCompareModelHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jan 30, 2008
 * Authors       : Cyril Faucher <cfaucher@irisa.fr>
 */
package fr.irisa.triskell.kermeta.tests.comparison;


import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.ModelUtils;
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
		MatchModel matchModel = getMatchModel(leftModelPath, rightModelPath);
		final DiffModel diff = DiffService.doDiff(matchModel);
		return diff;
	}
	
	/**
	 * 
	 * @param model1
	 * @param model2
	 * @return
	 */
	private static DiffModel getDiffModel(EObject model1, EObject model2) {
		return DiffService.doDiff(getMatchModel(model1, model2));		
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
			
			return getMatchModel(model1, model2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @param model1
	 * @param model2
	 * @return
	 */
	private static MatchModel getMatchModel(EObject model1, EObject model2) {
		try {
			// Creates the match then the diff model for those two models
			return MatchService.doMatch(model1, model2, null);
		} catch (InterruptedException e) {
			return null;
		}
	}
	
	
	/**
	 * 
	 * @param leftModelPath
	 * @param rightModelPath
	 * @return
	 */
	public static boolean isSimilar(String leftModelPath, String rightModelPath) {
		if(((DiffGroup) getDiffModel(leftModelPath, rightModelPath).getOwnedElements().get(0)).getSubchanges()> 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @param leftModelPath
	 * @param rightModelPath
	 * @param diffModelPath
	 * @return
	 */
	public static boolean isDifferentAndSaveDiff(String leftModelPath, String rightModelPath, String diffModelPath) {
		DiffModel diffModel = getDiffModel(leftModelPath, rightModelPath);
		if( ((DiffGroup) diffModel.getOwnedElements().get(0)).getSubchanges() > 0 ) {
			try {
		        URI uri = URI.createURI(diffModelPath);
		        uri = new URIConverterImpl().normalize(uri);
		        String uriAsString = uri.toString().replace("file:", "");
				ModelUtils.save(diffModel, uriAsString);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param model1
	 * @param model2
	 * @return
	 */
	public static boolean isDifferent(EObject model1, EObject model2) {
		DiffModel diffModel = getDiffModel(model1, model2);
		return (((DiffGroup) diffModel.getOwnedElements().get(0)).getSubchanges() > 0) ? true : false;
	}
}
