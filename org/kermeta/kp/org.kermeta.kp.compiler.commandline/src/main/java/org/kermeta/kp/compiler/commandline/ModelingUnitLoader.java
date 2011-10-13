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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.ecore2km.api.Ecore2KM;
import org.kermeta.language.ecore2km.Ecore2KMImpl;
import org.kermeta.language.ecore2km.Ecore2KMImpl4Eclipse;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.loader.kmt.scala.KMTparser;
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
	
	
	public ModelingUnit loadModelingUnitFromURL(String urlString) throws IOException{
		lastLoadErrorMessage = "";
		URI uri =  URI.createURI(urlString);
		ModelingUnit mu = null;
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
			
			//org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
			StructurePackage.eINSTANCE.getEFactoryInstance();
			mu = this.loadEcore(urlString);
			if(saveIntermediateFiles && mu != null){
				URI targetIntermediateFolderuri =  URI.createURI(targetIntermediateFolder);
				URI saveKMURI = URI.createFileURI(targetIntermediateFolder+"/ecore2km"+uri.path()+".km");
				logger.debug(saveKMURI.toString(), this.getClass().getName());
				new ModelingUnitConverter(true,saveKMURI.toFileString(), logger).saveMu(mu, saveKMURI);
			}
		}else if (urlString.endsWith(".km")) {

			try {
				mu = this.loadKM(urlString);
			} catch (IOException e) {
				lastLoadErrorMessage = e.toString();
				this.logger.debug(e.toString(),this.getClass().getName());
				//e.printStackTrace();
			}
			
		}
		return mu;
	}
	protected ModelingUnit loadKM(String uri) throws IOException {
		/*org.OrgPackage p1 = org.OrgPackage.eINSTANCE;
    	org.kermeta.KmPackage p2 = org.kermeta.KmPackage.eINSTANCE;
    	org.kermeta.language.LanguagePackage p3 = org.kermeta.language.LanguagePackage.eINSTANCE;
    	org.kermeta.language.behavior.BehaviorPackage p4 = org.kermeta.language.behavior.BehaviorPackage.eINSTANCE;
    	org.kermeta.language.structure.StructurePackage p5 = org.kermeta.language.structure.StructurePackage.eINSTANCE;
    	*/
		//StructurePackage.eINSTANCE.setEFactoryInstance(StructureFactoryImpl.init());
		//BehaviorPackage.eINSTANCE.setEFactoryInstance(BehaviorFactoryImpl.init());

		Map<String, String> options = null;
		// Call init;

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
		if(runInEclipse){
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
			
		}
		else{
			rootPackage = (EPackage) resource.getContents().get(0);
		}
		
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
