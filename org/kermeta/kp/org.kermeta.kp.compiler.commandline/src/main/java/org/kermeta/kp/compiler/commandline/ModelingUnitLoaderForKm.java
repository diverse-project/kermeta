package org.kermeta.kp.compiler.commandline;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

public class ModelingUnitLoaderForKm implements ModelingUnitLoader{

	MessagingSystem logger;
	Boolean runInEclipse;
	public Boolean saveIntermediateFiles = false;
	public String targetIntermediateFolder;
	
	
	/** Error message of the last load or empty string if last load was successful */
	public String lastLoadErrorMessage = "";
	
	public ModelingUnitLoaderForKm(MessagingSystem logger, Boolean runInEclipse) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
	}
	public ModelingUnitLoaderForKm(MessagingSystem logger, Boolean runInEclipse, Boolean saveIntermediateFiles, String targetIntermediateFolder) {
		super();
		this.logger = logger;
		this.runInEclipse = runInEclipse;
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetIntermediateFolder = targetIntermediateFolder;
	}
	
	
	public ModelingUnit loadModelingUnitFromURL(String urlString) throws IOException{
		lastLoadErrorMessage = "";
		ModelingUnit mu = null; 
		
		if (urlString.endsWith(".km")) {
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
		ModelingUnit result = new ModelingUnit(uri, resource.getContents());
		result.setName(ruri.lastSegment());
		return result;
	}

	@Override
	public String getLastLoadErrorMessage() {
		return lastLoadErrorMessage;
	}
}
