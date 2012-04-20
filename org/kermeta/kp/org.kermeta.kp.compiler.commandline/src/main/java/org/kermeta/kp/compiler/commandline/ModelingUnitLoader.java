/* $Id:$ 
 * Creation : 2 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.runtime3_3_0.tree.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Profile;
import org.kermeta.language.ecore2km.api.Ecore2KM;
import org.kermeta.language.ecore2km.Ecore2KMImpl;
import org.kermeta.language.ecore2km.Ecore2KMImpl4Eclipse;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.umlprofile2ecore.UmlProfile2EcoreImpl;
import org.kermeta.language.umlprofile2ecore.api.UmlProfile2Ecore;
import org.kermeta.language.loader.kmt.scala.KMTparser;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl;
import org.kermeta.language.merger.binarymerger.KmBinaryMergerImpl4Eclipse;
import org.kermeta.language.merger.binarymerger.api.KmBinaryMerger;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;

//import scala.Option;
import scala.collection.Iterator;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

/**
 * Provides convenient operations for loading ModelingUnits from various input format
 *
 */
public class ModelingUnitLoader {

	MessagingSystem logger;
	Boolean runInEclipse;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	
	
	/** Error message of the last load or empty string if last load was successful */
	public String lastLoadErrorMessage = "";
	
	public ModelingUnitLoader(MessagingSystem logger, Boolean runInEclipse) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
	}
	public ModelingUnitLoader(MessagingSystem logger, Boolean runInEclipse, Boolean saveIntermediateFiles, String targetIntermediateFolder) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
	}
	
	
	public Collection<ModelingUnit> loadModelingUnitFromURL(String urlString) throws IOException{
		ModelingUnitCacheHelper muCacheHelper = new ModelingUnitCacheHelper(logger);
		lastLoadErrorMessage = "";
		URI uri =  URI.createURI(urlString);
		ModelingUnit mu = null;
		Collection<ModelingUnit> mus = new ArrayList<ModelingUnit>(); 
		
		if (urlString.endsWith(".kmt")) {
			try {
				// Flush all problems marked on the file
				// done in a more clever way  // logger.flushAllProblems(new URL(urlString));

				mu = this.loadKMT(urlString);
				if(saveIntermediateFiles && mu != null){
					URI targetIntermediateFolderuri =  URI.createURI(targetIntermediateFolder);
					URI saveKMURI = URI.createFileURI(targetIntermediateFolder+"/kmt2km"+uri.path()+".km");
					new ModelingUnitConverter(true,saveKMURI.toFileString(), logger).saveMu(mu, saveKMURI);
				}
				if (mu != null) {
					mus.add(mu);
				}
			} catch (MalformedURLException e) {
				lastLoadErrorMessage = e.toString();
				this.logger.debug(e.toString(),this.getClass().getName());
				//e.printStackTrace();
			} catch (URISyntaxException e) {
				lastLoadErrorMessage = e.toString();
				this.logger.debug(e.toString(),this.getClass().getName());
				//e.printStackTrace();
			}
			
		}else if (urlString.endsWith(".ecore")) {
			String outputCacheUrl = URI.createFileURI(targetIntermediateFolder+"/ecore2km"+uri.path()+".km").toString();
			StructurePackage.eINSTANCE.getEFactoryInstance();
			if(muCacheHelper.isCacheUpTodate(urlString, outputCacheUrl)){
				this.logger.debug("Using cached version of "+urlString,this.getClass().getName());
				if (runInEclipse) { // load this file to be ready for the merger
					new KmBinaryMergerImpl4Eclipse();
				} else {
					new KmBinaryMergerImpl();
				}
				mu = muCacheHelper.getCachedModelingUnit(outputCacheUrl);
				if(mu == null)
					this.logger.debug("pb loading cache for "+urlString,this.getClass().getName());
			}
			else{
				//org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
				
				mu = this.loadEcore(urlString);
				if( mu != null){
					URI saveKMURI = URI.createURI(outputCacheUrl);
					logger.debug(saveKMURI.toString(), this.getClass().getName());
					new ModelingUnitConverter(true,saveKMURI.toFileString(), logger).saveMu(mu, saveKMURI);
				}
			}
			if (mu != null) {
				mus.add(mu);
			}
		}else if (urlString.endsWith(".km")) {
			try {
				mu = this.loadKM(urlString);
				if (mu!=null) {
					mus.add(mu);
				}
			} catch (IOException e) {
				lastLoadErrorMessage = e.toString();
				this.logger.debug(e.toString(),this.getClass().getName());
				//e.printStackTrace();
			}
			
		} else if (urlString.endsWith(".profile.uml")) {
			//Collection<ModelingUnit> mu = new ArrayList<ModelingUnit>();
			
			try {
				mus.addAll(loadUMLProfile(urlString));
				
				
			} catch (IOException e) {
				lastLoadErrorMessage = e.toString();
				this.logger.debug(e.toString(),this.getClass().getName());
				
			}
			
		}
		return mus;
	}
	
	/**
	 * Loader for UML profiles
	 * returns a set of modeling unit since an UML model can contains several packages that are transformed in several ecore files
	 * @param urlString
	 * @return
	 * @throws IOException
	 */
	protected Collection<ModelingUnit> loadUMLProfile(String urlString) throws IOException {		
		
		Collection<ModelingUnit> result = new ArrayList<ModelingUnit>();
		
		Map<String, String> options = null;
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		m.put("uml", new XMIResourceFactoryImpl());
		URI ruri =  URI.createURI(urlString);
		Resource resource = resourceSet.createResource(ruri);
		
		logger.debug("trying to load uml profile : " + urlString, this.getClass().getName());
		resource.load(options);
		logger.debug("resource.getContents.size = " + resource.getContents().size(), this.getClass().getName());
		logger.debug("found something : " + resource.getContents().get(0), this.getClass().getName());

		Object root = resource.getContents().get(0);
		if (root instanceof Profile) {
			Profile profile = (Profile) root;
			logger.debug("Profile loaded, name : " + profile.getName(), this.getClass().getName());
						
			// Now, convert the profile to Ecore packages
			UmlProfile2Ecore converter = new UmlProfile2EcoreImpl();
			Collection<EPackage> myEPackages = converter.convertUmlProfile(profile);
			
			// An Ecore to KM converter is also needed
			Ecore2KM ecoreConverter;
			if(runInEclipse){
				ecoreConverter = new Ecore2KMImpl4Eclipse(); 
			}
			else{
				ecoreConverter = new Ecore2KMImpl();
			}			
			
			for (EPackage pack : myEPackages) {
				logger.debug("Found a package : " + pack.getName(), this.getClass().getName());
				org.eclipse.emf.common.util.TreeIterator<EObject> it =  pack.eAllContents();
				/*
				while (it.hasNext()) {
					logger.error(" -"+it.next().toString(), this.getClass().getName());
				}
				*/
				EPackage rootPackage;
				//if(runInEclipse){
					// WORKAROUND problem of incomplete conversion if run in eclipse, the ecore.ecore from nsURI is loaded without using the new factory
					// this fixes bug 1951
					logger.log(Kind.DevINFO, "Applying ecore load workaround so it can load ecore model in registry", this.getClass().getName());
					ArrayList<EObject> objectsToCopy = new ArrayList<EObject>();
					objectsToCopy.add(pack);
					objectsToCopy.addAll(pack.eContents());
					
					Map<EObject, Collection<Setting>> externalRefs = EcoreUtil.CrossReferencer.find(objectsToCopy);
					for(Entry<EObject, Collection<Setting>> entry : externalRefs.entrySet()){
						EObject rootExternalObject = getRootContainer(entry.getKey());
						if(!objectsToCopy.contains(rootExternalObject)){
							logger.debug( "workaround applied on additional EObject "+rootExternalObject, this.getClass().getName());
							objectsToCopy.add(rootExternalObject);
						}
					}
					
					Collection<EObject> copiedObjects = EcoreUtil.copyAll(objectsToCopy);
					rootPackage = (EPackage) copiedObjects.toArray()[0];
					// END OF WORKAROUND
					
				/*}
				else{
					rootPackage = pack;
				}*/
				result.add(ecoreConverter.convertPackage(rootPackage, ""));
			}
			
			
		} else {
			throw new IOException("Cannot find a UML Profile in the file");
		}
		
		return result;

	}
	
	/**
	 * Loader for km files
	 * @param uri
	 * @return
	 * @throws IOException
	 */
	protected ModelingUnit loadKM(String uri) throws IOException {
		
		Map<String, String> options = null;
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);

		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		m.put("km", new XMIResourceFactoryImpl());
		URI ruri =  URI.createURI(uri);
		Resource resource = resourceSet.createResource(ruri);
		resource.load(options);
		// let's suppose the ModelingUnit is the first element in the root
		return (ModelingUnit) resource.getContents().get(0);
	}

	/**
	 * Loader for ecore files
	 * This loader is cached. If a target km file exist and is newer than the ecore file, it simply load the km files.
	 * @param uri
	 * @return
	 * @throws IOException
	 */
	protected ModelingUnit loadEcore(String uri) throws IOException {
				
		// utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.ecore2km");
		// org.kermeta.language.ecore2km.Ecore2km converter = org.kermeta.language.ecore2km.KerRichFactory.createEcore2km();
		Ecore2KM converter;
		if(runInEclipse){
			converter = new Ecore2KMImpl4Eclipse(); 
		}
		else{
			converter = new Ecore2KMImpl();
		}
       // kermeta.persistence.EMFRepository rep = kermeta.persistence.KerRichFactory.createEMFRepository();
       // kermeta.persistence.Resource r = rep.getResource( uri);
		Map<String, String> options = null;
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		m.put("ecore", new XMIResourceFactoryImpl());
		URI ruri =  URI.createURI(uri);
		Resource resource = resourceSet.createResource(ruri);
		resource.load(options);
        //r.load();   
		
		EPackage rootPackage;
		//if(runInEclipse){
			// WORKAROUND problem of incomplete conversion if run in eclipse, the ecore.ecore from nsURI is loaded without using the new factory
			// this fixes bug 1951
			logger.log(Kind.DevINFO, "Applying ecore load workaround so it can load ecore model in registry", this.getClass().getName());
			ArrayList<EObject> objectsToCopy = new ArrayList<EObject>();
			
			objectsToCopy.addAll(resource.getContents());
			for(Resource res : resourceSet.getResources()){
				if(res != resource){
					logger.debug( "workaround applied on additional resource "+res.getURI(), this.getClass().getName());
					objectsToCopy.addAll(res.getContents());
				}
			}
			Map<EObject, Collection<Setting>> externalRefs = EcoreUtil.CrossReferencer.find(objectsToCopy);
			for(Entry<EObject, Collection<Setting>> entry : externalRefs.entrySet()){
				EObject rootExternalObject = getRootContainer(entry.getKey());
				if(!objectsToCopy.contains(rootExternalObject)){
					logger.debug( "workaround applied on additional EObject "+rootExternalObject, this.getClass().getName());
					objectsToCopy.add(rootExternalObject);
				}
			}
			
			Collection<EObject> copiedObjects = EcoreUtil.copyAll(objectsToCopy);
			rootPackage = (EPackage) copiedObjects.toArray()[0];
			// END OF WORKAROUND
			
		/*}
		else{
			rootPackage = (EPackage) resource.getContents().get(0);
		}*/
		
        return   converter.convertPackage(rootPackage, "");
	}
	
	private EObject getRootContainer(EObject obj){
		if(obj.eContainer() != null ) return getRootContainer(obj.eContainer());
		return obj;
	}

	protected ModelingUnit loadKMT(String fileuri) throws URISyntaxException, MalformedURLException  {
		//StructurePackage.eINSTANCE.setEFactoryInstance(StructureFactoryImpl.init());
		//BehaviorPackage.eINSTANCE.setEFactoryInstance(BehaviorFactoryImpl.init());

				
		KMTparser parser = new KMTparser();		
		Iterator<String> src = scala.io.Source.fromFile( new java.io.File(FileHelpers.StringToURI(fileuri)),
				"UTF8").getLines();

		StringBuffer buf = new StringBuffer();
		while (src.hasNext()) {
			buf.append(src.next() + "\n");
		}


		ModelingUnit mu = parser.load(FileHelpers.StringToURL(fileuri), buf.toString(), logger);

		return mu;

	}
}
