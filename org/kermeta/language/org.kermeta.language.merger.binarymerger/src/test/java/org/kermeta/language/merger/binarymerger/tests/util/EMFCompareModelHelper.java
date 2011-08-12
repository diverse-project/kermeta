/* $Id: EMFCompareModelHelper.java,v 1.8 2008-03-05 17:04:02 cfaucher Exp $
 * Project   : fr.irisa.triskell.kermeta.tests.comparison
 * File      : EMFCompareModelHelper.java
 * License   : EPL
 * Copyright : IRISA / INRIA / Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : Jan 30, 2008
 * Authors       : Cyril Faucher <cfaucher@irisa.fr>
 */
package org.kermeta.language.merger.binarymerger.tests.util;


import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.AttributeChange;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffGroup;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.UpdateAttribute;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.compare.util.EMFCompareMap;
import org.eclipse.emf.compare.util.ModelUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.kermeta.language.structure.Tag;


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
			registerEMFextensionToFactoryMap(leftModelPath);
			registerEMFextensionToFactoryMap(rightModelPath);
			
			// Loads the two models passed as arguments
			
			ResourceSet resourceSet = new ResourceSetImpl();
			
	        URI left_u = URI.createURI(leftModelPath);
	        left_u = new ExtensibleURIConverterImpl().normalize(left_u);
	        org.eclipse.emf.ecore.resource.Resource left_resource = resourceSet.getResource(left_u, true);
	        final EObject model1 = left_resource.getContents().get(0);
	        
	        URI right_u = URI.createURI(rightModelPath);
	        right_u = new ExtensibleURIConverterImpl().normalize(right_u);
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
	public static boolean isSimilar(EObject model1, EObject model2) {
		if(((DiffGroup) getDiffModel(model1, model2).getOwnedElements().get(0)).getSubchanges()> 0) {
			return false;
		}
		return true;
	}
	
	public static boolean isSimilar(String leftModelPath, String rightModelPath) {
		if(((DiffGroup) getDiffModel(leftModelPath, rightModelPath).getOwnedElements().get(0)).getSubchanges()> 0) {
			return false;
		}
		return true;
	}
	
	public static boolean isSimilarAndSaveDiff(EObject model1, EObject model2, String diffModelPath) {
		DiffModel diffModel = getDiffModel(model1, model2);
			
		//Cédric Bouhours modification.
		//Last :
		//if(((DiffGroup) diffModel.getOwnedElements().get(0)).getSubchanges()> 0) {
		//New :
		boolean isReallyDifferent = false;
		if(diffModel.getDifferences().size() > 0) {
			for (DiffElement elem : diffModel.getDifferences()) {
				boolean isDifferent = true;
				if (elem instanceof UpdateAttribute){
					UpdateAttribute ac = (UpdateAttribute) elem;
					if( ac.getAttribute().getName().equals("value") && ac.getLeftElement() instanceof Tag){
						Tag t = (Tag)ac.getLeftElement();
						if (t.getName().equals("traceability_text_reference")){
							System.out.println("Ignoring change Tag.value UpdateAttribute : "+elem.toString());
							isDifferent = false;
						}
					}
				}
				if(isDifferent){
					System.out.println("Difference detected : "+elem.toString());
					isReallyDifferent = true;
				}
			}
		}
		if(isReallyDifferent){
			try {
				URI uri = URI.createURI(diffModelPath);
		        uri = new ExtensibleURIConverterImpl().normalize(uri);
		        String uriAsString = uri.toString();//.replace("file:", "");
		        System.out.println("Saving diff model in "+uriAsString);
		        registerEMFextensionToFactoryMap(uriAsString);
		        registerEMFextensionToFactoryMap(uriAsString+".model1.xmi");
		        
		        ResourceSet rs = new ResourceSetImpl();
		        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("km",new XMIResourceFactoryImpl());
		        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("diff",new XMIResourceFactoryImpl());
		        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",new XMIResourceFactoryImpl());
		        final Map<String, String> options = new EMFCompareMap<String, String>();
				options.put(XMLResource.OPTION_ENCODING, System.getProperty("file.encoding"));
				Resource r = rs.createResource(URI.createURI(uriAsString+".model1.xmi"));
				r.getContents().add(model1);
		        r.save(options);
		        r = rs.createResource(URI.createURI(uriAsString+".model2.xmi"));
		        r.getContents().add(model2);
		        r.save(options);
		        r = rs.createResource(uri);
				r.getContents().add(diffModel);
			 // Bug : Save fails DVK I don't know exactly why, so I disabled it
		     //   r.save(options);
		      
		        /* model1.eResource().setURI(URI.createURI(uriAsString+".model1.xmi"));
		        model2.eResource().setURI(URI.createURI(uriAsString+".model2.xmi"));
				ModelUtils.save(diffModel, uriAsString);*/
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
		        uri = new ExtensibleURIConverterImpl().normalize(uri);
		        String uriAsString = uri.toString().replace("file:", "");
		        System.out.println("Saving diff model in "+uriAsString);
		        registerEMFextensionToFactoryMap(uriAsString);
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
	
	
	public static void registerEMFextensionToFactoryMap(String kunit_uri) {
		String ext = kunit_uri.substring(kunit_uri.lastIndexOf(".")+1);
		
		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().contains(ext)){
			if(ext != null){
				//internalLog.debug("registering extension: " + ext);					
				Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext,new XMIResourceFactoryImpl());
			}
		}
		//else internalLog.debug(" extension " + ext + " is already registered ");
/*		if (! Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().keySet().contains("ecore")){
			internalLog.debug("registering extension: ecore");
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore",new XMIResourceFactoryImpl()); 
		}*/
		//logEMFRegistryExtensionContent();
	}
}
