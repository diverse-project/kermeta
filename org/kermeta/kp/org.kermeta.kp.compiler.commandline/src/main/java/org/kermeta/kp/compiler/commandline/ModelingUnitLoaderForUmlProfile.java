package org.kermeta.kp.compiler.commandline;

import java.io.IOException;
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
import org.eclipse.uml2.uml.Profile;
import org.kermeta.language.ecore2km.Ecore2KMImpl;
import org.kermeta.language.ecore2km.Ecore2KMImpl4Eclipse;
import org.kermeta.language.ecore2km.api.Ecore2KM;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.umlprofile2ecore.UmlProfile2EcoreImpl;
import org.kermeta.language.umlprofile2ecore.api.UmlProfile2Ecore;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem.Kind;

public class ModelingUnitLoaderForUmlProfile implements ModelingUnitLoader {
	MessagingSystem logger;
	Boolean runInEclipse;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	
	
	/** Error message of the last load or empty string if last load was successful */
	public String lastLoadErrorMessage = "";
	
	public ModelingUnitLoaderForUmlProfile(MessagingSystem logger, Boolean runInEclipse) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
	}
	public ModelingUnitLoaderForUmlProfile(MessagingSystem logger, Boolean runInEclipse, Boolean saveIntermediateFiles, String targetIntermediateFolder) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
	}
	
	
	public Collection<ModelingUnit> loadModelingUnitFromURL(String urlString) throws IOException{
		lastLoadErrorMessage = "";
		Collection<ModelingUnit> mus = new ArrayList<ModelingUnit>(); 
		
		if (urlString.endsWith(".profile.uml")) {
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
	
	private EObject getRootContainer(EObject obj){
		if(obj.eContainer() != null ) return getRootContainer(obj.eContainer());
		return obj;
	}

	@Override
	public String getLastLoadErrorMessage() {
		return lastLoadErrorMessage;
	}
}
