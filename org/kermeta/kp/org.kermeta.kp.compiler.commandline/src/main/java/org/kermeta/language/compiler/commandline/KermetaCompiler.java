/* $Id:$ 
 * Creation : 1 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.compiler.commandline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.kermeta.kp.KermetaProject;
import org.kermeta.kp.Source;
import org.kermeta.kp.SourceFolder;
import org.kermeta.kp.loader.kp.KpLoader;
import org.kermeta.language.structure.ModelingUnit;

/**
 * Basic compilation process for Kermeta2
 * This class is a facade for producing bytecode from a kermeta2 project
 */
public class KermetaCompiler {
	
	public Boolean saveIntermediateFiles = false;
	public String targetFolder;
	public String projectName = "project";
	
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
		if(!kp.getName().isEmpty()){
			projectName = kp.getName();
		}
		List<ModelingUnit> modelingUnits = getSourceModelingUnits(kp);
		ModelingUnit mergedUnit = mergeModelingUnits(modelingUnits);
		ModelingUnit resolvedUnit = resolveModelingUnit(mergedUnit);
		//save resolvedUnit to the META-INF/kermeta/merged.km
		URI uri = URI.createURI((resolvedUnit.getNamespacePrefix() + "." + resolvedUnit.getName() + ".km_in_memory").replaceAll("::", "."));
		File mergedFile = new File("./"+targetFolder+"/META-INF/kermeta/"+projectName+".km");		
		if(!mergedFile.getParentFile().exists()){
			mergedFile.getParentFile().mkdirs();
		}
		FileWriter writer = new FileWriter(mergedFile);
		writer.write(new ModelingUnitConverter().saveMu(resolvedUnit, uri).toString());
		writer.close();
		
		
		// TODO deal with km to scala
		// TODO deal with scala to bytecode
	}	

	public List<ModelingUnit> getSourceModelingUnits(KermetaProject kp) throws IOException {
		
		List<ModelingUnit> modelingUnits = new ArrayList<ModelingUnit>();
		
		List<Source> srcs = kp.getSources();
		for (Source src : srcs ){
			String sourceURLWithVariable = ((Source) src).getUrl();
			String sourceURL = sourceURLWithVariable;
			System.out.println("source is : " + sourceURLWithVariable);
			if (sourceURLWithVariable.contains("${")){
				// TODO deal with variable expansion
				System.out.println("source : " + sourceURLWithVariable + " is expanded to " +sourceURL);
			}
			ModelingUnit mu = new ModelingUnitLoader().loadModelingUnitFromURL(sourceURLWithVariable);
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
		List<ModelingUnit> convertedModellingUnits = new ArrayList<ModelingUnit>();
		// Convert Modellingunit For Merger
		org.kermeta.language.language.merger.binarymergerrunner.MainRunner.init4eclipse();
		for (ModelingUnit mu : modelingUnits){			
			convertedModellingUnits.add( new ModelingUnitConverter().convert(mu));
		}
		org.kermeta.language.language.merger.binarymergerrunner.MainRunner.init4eclipse();
		
		// merge
		ModelingUnit mergedMU = convertedModellingUnits.get(0);		
		if (convertedModellingUnits.size()>1){
			org.kermeta.language.merger.BinaryMerger b = org.kermeta.language.merger.RichFactory
			.createBinaryMerger();
			for (int i = 1;i<convertedModellingUnits.size();i++){
				mergedMU = b.merge(mergedMU, convertedModellingUnits.get(i));
			}			
		}

		return mergedMU;
	}
	
	
	public ModelingUnit resolveModelingUnit(ModelingUnit mu) throws IOException{
		org.kermeta.language.language.resolverrunner.MainRunner.init4eclipse();
		ModelingUnit convertedModelingUnit = new ModelingUnitConverter(saveIntermediateFiles, targetFolder+"/intermediate/beforeResolving.km").convert(mu);
		
		//Resolving
		org.kermeta.language.resolver.FullStaticResolver resolver = org.kermeta.language.resolver.RichFactory
		.createFullStaticResolver();
		
		ModelingUnit resolvedMU = resolver.doResolving(convertedModelingUnit);
		resolver.checkUnresolved(resolvedMU);
				
		
		//StaticSetting
		ModelingUnit staticsettedMU = resolver.doStaticSetting(resolvedMU);
		//End of Resolving
		return staticsettedMU;
	}
	
	
	
}
