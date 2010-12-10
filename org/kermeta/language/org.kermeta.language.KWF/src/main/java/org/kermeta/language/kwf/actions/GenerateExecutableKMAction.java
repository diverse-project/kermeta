/* $Id:$ 
 * Creation : 7 déc. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.kwf.actions;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.api.kevent.KExecutableKmUserRequestEvent;
import org.kermeta.language.api.messaging.UnifiedMessageFactory;
import org.kermeta.language.api.port.PortResourceLoader;
import org.kermeta.language.api.result.ModelingUnitResult;
import org.kermeta.language.kwf.art2.impl.Art2ComponentKWF;
import org.kermeta.language.structure.ModelingUnit;

public class GenerateExecutableKMAction {

	protected Art2ComponentKWF art2ComponentKWF;
	protected UnifiedMessageFactory mFactory = UnifiedMessageFactory.getInstance();
	
	public GenerateExecutableKMAction(Art2ComponentKWF art2ComponentKWF) {
		this.art2ComponentKWF = art2ComponentKWF;
	}

	/**
	 * do the real work
	 * TODO deal with any context of the workflow
	 * @param request
	 * @throws Exception 
	 */
	public void process(KExecutableKmUserRequestEvent request) throws Exception{
		try {
			
			ModelingUnit result = null;
			
			String inputDescriptionURI = request.getInputDescriptionURI();
			URI uri = URI.createURI(inputDescriptionURI);
			File f = new File(uri.toFileString());
			if(f.exists()){	
				if(f.isDirectory()){
					ArrayList<ModelingUnit> units = new ArrayList<ModelingUnit>();
					// process KMT files
					FilenameFilter filterKMT = new FilenameFilter(){ 
						public boolean accept(File dir, String name) { 
							return name.endsWith(".kmt"); 
						} 
					}; 
					for (File kmtFile : f.listFiles(filterKMT)){
						art2ComponentKWF.getLogger().debug("loading : " + kmtFile.getCanonicalPath());
						ModelingUnit kmt2KmResult = art2ComponentKWF.getKmtLoaderPort().load(kmtFile.getCanonicalPath(), PortResourceLoader.URIType.FILE, "");
						units.add(kmt2KmResult);
						if(!request.getIntermediateDebugOutputURI().isEmpty()){
							String intermediateOutputUri = request.getIntermediateDebugOutputURI()+"/kmt2km/"+kmtFile.getName().replace(".kmt", "")+".km";
							art2ComponentKWF.getLogger().debug("saving intermediate result :" +intermediateOutputUri);
							saveModelingUnit(intermediateOutputUri, kmt2KmResult);
						}
					}
					// TODO process KM files
					// TODO process ecore files
					// Merge everything
					ModelingUnitResult mergeResult = art2ComponentKWF.getKmMergerPort().merge(units);
					if(!request.getIntermediateDebugOutputURI().isEmpty()){
						String intermediateOutputUri = request.getIntermediateDebugOutputURI()+"/merge/result.km";
						art2ComponentKWF.getLogger().debug("saving intermediate result :" +intermediateOutputUri);
						saveModelingUnit(intermediateOutputUri, mergeResult.getModelingUnit());
					}
					// TODO Resolve result

					art2ComponentKWF.getLogger().error("Not fuly implemented : cannot finish request GenerateExecutableKMAction " + inputDescriptionURI, null);
					
				}
				else{
					// TODO deal with kp file description
				}
				saveModelingUnit(request.getOutputURI(),result);
			}
			else{
				art2ComponentKWF.getLogger().error("file or folder doesn't exist : " + inputDescriptionURI, null);
			}
		} catch (IOException e) {
			art2ComponentKWF.getLogger().error(e.getMessage(), e);
		}
	}
	
	protected void saveModelingUnit(String modelFilePath, ModelingUnit modelingUnit) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String,Object> m = f.getExtensionToFactoryMap();
		m.put("km",new XMIResourceFactoryImpl());
		
    	URI uri = URI.createURI( modelFilePath );
		/*
		 * If the loading is not done in a workbench, then uri matching platform:/resource or platform:/plugin
		 * will be useless. Need to convert them into absolute path.
		 * It works only if a mapping exist between platform:/resource and its concrete path. 
		 */
		URIConverter converter = new ExtensibleURIConverterImpl();
		uri = converter.normalize(uri);
	/*	XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot(); 
		XMLNamespacePackage.eINSTANCE.getEFactoryInstance(); */
		Resource resource = resourceSet.createResource(uri);
     /*   ((XMIResource)resource).getDefaultLoadOptions().put(XMLResource.OPTION_ENCODING, "UTF-8");
        ((XMIResource)resource).getDefaultSaveOptions().put(XMLResource.OPTION_ENCODING, "UTF-8");  */
		resource.getContents().add(modelingUnit);
		resource.save(null);		
    }
}
