/* $Id:$ 
 * Creation : 2 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.kp.compiler.commandline;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.structure.Metamodel;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.language.util.ModelingUnit;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

/**
 * This class provide load and save method for ModelingUnit using Stream which can be used to convert a ModelingUnit into another ModelingUnit conformant to a specific factory
 * Be careful the factories must not change during this process (ie. not thread safe)
 * @author dvojtise
 *
 */
public class ModelingUnitConverter {

	
	public String saveToFile = "";
	public Boolean  mustSaveToFile = false;
	public MessagingSystem logger;
	
	

	public ModelingUnitConverter(MessagingSystem logger) {
		this.logger = logger;
		this.saveToFile = "";
	}
	public ModelingUnitConverter(Boolean  mustSaveToFile, String saveToFile, MessagingSystem logger) {
		this.logger = logger;
		this.saveToFile = saveToFile;
		this.mustSaveToFile = mustSaveToFile;
	}



	/**
	 * If the correct factories are set up, this will convert an existing ModelingUnit into the ModelingUnit using these factories
	 * @param mu
	 * @return
	 * @throws IOException
	 */
	public ModelingUnit convert(ModelingUnit mu) throws IOException{
		ModelingUnit resultMU;
		logger.initProgress(KermetaCompiler.LOG_MESSAGE_GROUP+".ModelingUnitConverter", "Converting ModelingUnit", KermetaCompiler.LOG_MESSAGE_GROUP, 1);
		String mms = "";
		for(Metamodel mm : mu.getMetamodels()){
			mms = mms+"_"+mm.getName();
		}
		URI uri = URI.createURI(mms+ ".km_in_memory");
		if (mu.getMetamodels().size() > 0 &&  mu.getMainEResource() != null && mu.getMainEResource().getURI().isFile()) {
			uri = mu.getMainEResource().getURI();
			
		} 	
		mu.gatherInMainEResource();
		logger.debug("\t converting using uri "+uri, KermetaCompiler.LOG_MESSAGE_GROUP);
		ByteArrayOutputStream stream= this.saveMu(mu, uri);
		resultMU= this.LoadMu(stream, uri);

		logger.doneProgress(KermetaCompiler.LOG_MESSAGE_GROUP+".ModelingUnitConverter", "ModelingUnit converted "+resultMU, KermetaCompiler.LOG_MESSAGE_GROUP);
		return resultMU;
	}
	
	
	
	// used to convert Modeling unit from an aspect to another
	public ByteArrayOutputStream saveMu(ModelingUnit mu, URI uri) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				
		// let's suppose that the ModelingUnit contains everything
		// (otherwise we would have to look for references and save them too
		// ...)
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);
		Resource.Factory.Registry f = resourceSet
				.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("km_in_memory", new XMIResourceFactoryImpl());
		m.put("km", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(uri);
		if(resource != null)
			resource.getContents().addAll(mu.getMetamodels());
		else {
			logger.error("Cannot create resource for  "+uri, KermetaCompiler.LOG_MESSAGE_GROUP, new Exception("Created resource is null"));			
		}
		Map<String, String> options = null;
		try {
			mu.gatherInMainEResource();
			mu.getMainEResource().save(outputStream, options);
		}
		catch(Exception e){
			logger.error("Received Exception while saving "+e, KermetaCompiler.LOG_MESSAGE_GROUP, e);
			java.util.Map<EObject,java.util.Collection<EStructuralFeature.Setting>> unresolvedMap ;
			unresolvedMap = EcoreUtil.ExternalCrossReferencer.find(mu.getMainEResource());
			for (EObject myEobject : unresolvedMap.keySet() ){
				logger.error("Patching dangling element "+myEobject+ 
						" referenced by "+unresolvedMap.get(myEobject) +
						"\nthe dangling element is added to the root of the resource for debug purpose", 
						KermetaCompiler.LOG_MESSAGE_GROUP, e);
				mu.getMainEResource().getContents().add(myEobject);				
			}			
			logger.info("Retrying to save .... ", KermetaCompiler.LOG_MESSAGE_GROUP);
			outputStream = new ByteArrayOutputStream();
			mu.getMainEResource().save(outputStream, options);
		}

		if (mustSaveToFile){
			logger.debug("Saving stream to file "+saveToFile, KermetaCompiler.LOG_MESSAGE_GROUP);
			File fileToSave = new File(saveToFile);
			if(!fileToSave.getParentFile().exists()){
				fileToSave.getParentFile().mkdirs();
			}
			FileWriter writer = new FileWriter(fileToSave);
			writer.write(outputStream.toString());
			writer.close();
		}
		return outputStream;
	}
	/*
	 * only save it 
	 */
	public void saveMu(ModelingUnit mu) throws IOException{
		logger.initProgress(KermetaCompiler.LOG_MESSAGE_GROUP+".ModelingUnitConverter", "Saving ModelingUnit", KermetaCompiler.LOG_MESSAGE_GROUP, 1);

		mu.gatherInMainEResource();
		String mms = "";
		for(Metamodel mm : mu.getMetamodels()){
			mms = mms+"_"+mm.getName();
		}
		URI uri = URI.createURI(mms+ ".km_in_memory");
		if (mu.getMetamodels().size() > 0 &&  mu.getMainEResource() != null && mu.getMainEResource().getURI().isFile()) {
			uri = mu.getMainEResource().getURI();
			
		}
		logger.debug("\t saving using uri "+uri, KermetaCompiler.LOG_MESSAGE_GROUP);
		this.saveMu(mu, uri);
		

		logger.doneProgress(KermetaCompiler.LOG_MESSAGE_GROUP+".ModelingUnitConverter", "ModelingUnit saved", KermetaCompiler.LOG_MESSAGE_GROUP);
		
	}
	
	public ModelingUnit LoadMu(ByteArrayOutputStream mu, URI uri) throws IOException {

		Map<String, String> options = null;
		// Call init;

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);

		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(uri);
		resource.load(new ByteArrayInputStream(mu.toByteArray()), options);
		return new ModelingUnit(uri.toString(), resource.getContents());

	}
}
