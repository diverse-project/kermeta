/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.compiler.commandline;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Source;
import org.kermeta.kp.SourceFolder;
import org.kermeta.kp.loader.kp.KpLoader;
import org.kermeta.language.language.merger.binarymergerrunner.MainRunner;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.scala.parser.KParser;

import scala.Option;
import scala.collection.Iterator;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

/**
 * Basic compilation process for Kermeta2
 * This class is a facade for producing bytecode from a kermeta2 project
 */
public class KermetaCompiler {
	
	public Boolean saveIntermediateFiles = false;
	public String targetFolder;
	
	/**
	 * Constructor
	 * @param targetFolder
	 * @param saveIntermediateFiles
	 */
	public KermetaCompiler(String targetFolder, Boolean saveIntermediateFiles) {
		super();
		this.saveIntermediateFiles = saveIntermediateFiles;
		this.targetFolder = targetFolder;
	}

	/**
	 * This initialization must be called before everything related to eclipse 
	 */
	public static void initializeFactory(){
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		org.kermeta.language.language.ecore2kmrunner.MainRunner.init();		
	}
	
	public KermetaCompiler(String targetFolder){
		// make sure initialize has been call : note that if some other EMF related things have 
		// been done before, the initialize should be done earlier too
		initializeFactory();
		this.targetFolder = targetFolder;
	}
	
	/**
	 * Main process
	 * @param kpFileURL
	 * @throws IOException
	 */
	public void kp2bytecode(String kpFileURL) throws IOException {
		KpLoader ldr = new KpLoader();
		KermetaProject kp = ldr.loadKp(kpFileURL);
		
		List<ModelingUnit> modelingUnits = getSourceModelingUnits(kp);
		ModelingUnit mergedUnit = mergeModelingUnits(modelingUnits);
	}	

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp) throws IOException {
		
		List<ModelingUnit> modelingUnits = new ArrayList<ModelingUnit>();
		
		List<Source> srcs = kp.getSources();
		for (Source src : srcs ){
			String sourceLocation = ((SourceFolder) src).getFolderName();
			String sourceURL = sourceLocation;
			System.out.println("source is : " + sourceLocation);
			if (sourceLocation.contains("${")){
				// TODO deal with variable expansion
				System.out.println("source : " + sourceLocation + " is expanded to " +sourceURL);
			}
			ModelingUnit mu = new ModelingUnitLoader().loadModelingUnitFromURL(sourceLocation);
			if (mu != null) {
				modelingUnits.add(mu);
			}
			else {
				System.err.println("Empty ModelingUnit, failed to load " +sourceURL);
			}
		}
				
		return modelingUnits;
	}
	
	public ModelingUnit mergeModelingUnits(List<ModelingUnit> modelingUnits) throws IOException {

		List<ByteArrayOutputStream> modelingunit_ser = new ArrayList<ByteArrayOutputStream>();
		// Convert Modellingunit For Merger
		MainRunner.init4eclipse();
		for (ModelingUnit mu : modelingUnits){
			modelingunit_ser.add( this.saveMu(mu));
		}
		MainRunner.init4eclipse();
		
		
		return null;
	}
	
	
	// used to convert Modeling unit from an aspect to another
	protected ByteArrayOutputStream saveMu(ModelingUnit mu) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		URI uri = URI
				.createURI((mu.getNamespacePrefix() + "." + mu.getName() + ".km_in_memory")
						.replaceAll("::", "."));
		Map<String, String> options = null;
		if (mu.eResource() != null) {
			uri = mu.eResource().getURI();
		} else {
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
		}
		mu.eResource().save(outputStream, options);

		return outputStream;
	}

	protected ModelingUnit LoadMu(ByteArrayOutputStream mu) throws IOException {

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
