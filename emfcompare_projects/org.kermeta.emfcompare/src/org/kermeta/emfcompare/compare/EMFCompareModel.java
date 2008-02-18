/* $Id: EMFCompareModel.java,v 1.2 2008-02-18 09:25:51 cfaucher Exp $
 * Project   : org.kermeta.emfcompare
 * File      : EMFCompareModel.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Dec 17, 2007
 * Authors       : Cyril Faucher <cfaucher@irisa.fr>
 */
package org.kermeta.emfcompare.compare;


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

import fr.irisa.triskell.eclipse.resources.ResourceHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.String;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnit;
import fr.irisa.triskell.kermeta.runtime.loader.RuntimeUnitLoader;
import fr.irisa.triskell.kermeta.runtime.loader.emf.EMFRuntimeUnit;

/**
 * This class is intended to "wrap" EMF Compare into kermeta.
 */
public class EMFCompareModel {
    
    public static RuntimeObject getDiff(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		
		// Convert the 2 uris passed as arguments into String
		java.lang.String leftModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(self);
		java.lang.String rightModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param0);
		java.lang.String diffModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param1);
		
		try {
			ModelUtils.save(getDiffModel(leftModelPath, rightModelPath), ResourceHelper.getIFile(diffModelPath).getLocation().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	public static RuntimeObject getMatch(RuntimeObject self, RuntimeObject param0, RuntimeObject param1) {
		
		// Convert the 2 uris passed as arguments into String
		java.lang.String leftModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(self);
		java.lang.String rightModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param0);
		java.lang.String matchModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param1);
		
		try {
			ModelUtils.save(getMatchModel(leftModelPath, rightModelPath), ResourceHelper.getIFile(matchModelPath).getLocation().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return self.getFactory().getMemory().voidINSTANCE;
	}
	
	private static DiffModel getDiffModel(java.lang.String leftModelPath, java.lang.String rightModelPath) {
		final DiffModel diff = DiffService.doDiff(getMatchModel(leftModelPath, rightModelPath));
		return diff;
	}
	
	
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
			final MatchModel match = MatchService.doMatch(model1, model2, null);
			
			return match;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 
	 * @param result_dir
	 * @param result_fileName
	 */
	public static RuntimeObject compare(RuntimeObject self, RuntimeObject param0) {

		// Convert the 2 uris passed as arguments into String
		java.lang.String leftModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(self);
		java.lang.String rightModelPath = (java.lang.String) fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(param0);
		
		boolean res = false;
		
		if(((DiffGroup) getDiffModel(leftModelPath, rightModelPath).getOwnedElements().get(0)).getSubchanges()> 0) {
			res = false;
		} else {
			res = true;
		}
		
		// Convert the result of the method into RuntimeObject
		if(res) return self.getFactory().getMemory().trueINSTANCE;
		else return self.getFactory().getMemory().falseINSTANCE;

	}
	
	
	/**
	 * FIXME CF unused for the moment
	 */
    private static RuntimeObject saveInMemory(
    		RuntimeObject self,
    		RuntimeObject newUri, 
    		RuntimeObject mmUri, 
    		RuntimeObject resourceType, 
    		RuntimeObject instances,
    		RuntimeObject mustValidate)
    {
        // runtime unit handles the transformation Kermeta2EMFInstance
        java.lang.String str_uri = String.getValue(newUri);
        RuntimeUnit runtime_unit = RuntimeUnitLoader.getDefaultLoader().
        	getConcreteFactory(String.getValue(resourceType)).
        	createRuntimeUnit(str_uri, String.getValue(mmUri), instances);
        runtime_unit.associatedResource = self;
        runtime_unit.setMustValidate(Boolean.getValue(mustValidate));
	    runtime_unit.save(str_uri);
        return instances.getFactory().getMemory().voidINSTANCE;
    }
	
}
