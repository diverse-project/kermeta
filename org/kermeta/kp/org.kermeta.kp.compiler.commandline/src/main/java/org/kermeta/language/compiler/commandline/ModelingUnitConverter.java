/* $Id:$ 
 * Creation : 2 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.compiler.commandline;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;

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
	
	
	public ModelingUnitConverter(Boolean  mustSaveToFile, String saveToFile) {
		super();
		this.saveToFile = saveToFile;
		this.mustSaveToFile = mustSaveToFile;
	}
	public ModelingUnitConverter() {
		super();
		this.saveToFile = "";
	}



	/**
	 * If the correct factories are set up, this will convert an existing ModelingUnit into the ModelingUnit using these factories
	 * @param mu
	 * @return
	 * @throws IOException
	 */
	public ModelingUnit convert(ModelingUnit mu) throws IOException{
		URI uri = URI.createURI((mu.getNamespacePrefix() + "." + mu.getName() + ".km_in_memory")
				.replaceAll("::", "."));
		if (mu.eResource() != null && mu.eResource().getURI().isFile()) {
			uri = mu.eResource().getURI();
		} 
		ByteArrayOutputStream stream= this.saveMu(mu, uri);
		return this.LoadMu(stream, uri);
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
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(mu);
		Map<String, String> options = null;
		mu.eResource().save(outputStream, options);


		if (mustSaveToFile){
			System.out.println("Saving stream to file "+saveToFile);
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
		// let's suppose the ModelingUnit is the first element in the root
		return (ModelingUnit) resource.getContents().get(0);

	}
}
