package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
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
import org.kermeta.language.behavior.impl.BehaviorFactoryImpl;
import org.kermeta.language.language.merger.binarymergerrunner.MainRunner;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.scala.parser.KParser;

import scala.Option;
import scala.collection.Iterator;
import scala.io.Source;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.structure.impl.StructureFactoryImpl;

public class Main {


	
	private URI uri;
	List<ModelingUnit> modelingunit;
	List<ByteArrayOutputStream> modelingunit_ser;
	ModelingUnit mergedMU;
	ModelingUnit resolvedMU;
	ModelingUnit staticsettedMU;
	ByteArrayOutputStream ModelingUnit_serialized;
	FileWriter writer;

	
	
	public Main() {
		modelingunit = new ArrayList<ModelingUnit>();
		modelingunit_ser = new ArrayList<ByteArrayOutputStream>();
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(org.kermeta.language.language.ecore2km.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		org.kermeta.language.language.ecore2kmrunner.MainRunner.init();
	}

	public void k2Compile(List<String> urls, List<String> jars_uri,
			String properyfile) throws IOException {
		
		//Load Unit
		for (String uri : urls) {
			if (uri.endsWith(".kmt")) {
				ModelingUnit mu = this.loadKMT(uri);
				if (mu != null) {
					this.modelingunit.add(mu);
				}
			}else if (uri.endsWith(".ecore")) {
				System.out.println("loading ecore");
				utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.ecore2km");
				org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
				System.out.println(StructurePackage.eINSTANCE.getEFactoryInstance());
				ModelingUnit mu = this.loadEcore(uri);
				if (mu != null) {
					
					this.modelingunit.add(mu);
				}
				System.out.println("ecore loaded");
			}else if (uri.endsWith(".km")) {
				ModelingUnit mu = this.loadKM(uri);
				if (mu != null) {
					this.modelingunit.add(mu);
				}
			}			
		}
		//End Load Unit

		
		// Convert Modellingunit For Merger

		for (ModelingUnit mu : this.modelingunit){
			this.modelingunit_ser.add( this.saveMu(mu));
		}
		utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.merger.binarymerger");
		MainRunner.init4eclipse();

		List<ModelingUnit> newmodellingUnit = new ArrayList<ModelingUnit>();
		for (ByteArrayOutputStream muser : this.modelingunit_ser){
			newmodellingUnit.add( this.LoadMu(muser));
		}
		modelingunit.clear();
		modelingunit.addAll(newmodellingUnit);		
		// End of Convert Modellingunit For Merger
		
		
		//Merged ModellingUnit
		mergedMU = modelingunit.get(0);		
		if (modelingunit.size()>1){
			org.kermeta.language.merger.BinaryMerger b = org.kermeta.language.merger.RichFactory
			.createBinaryMerger();
			for (int i = 1;i<modelingunit.size();i++){
				mergedMU = b.merge(mergedMU, modelingunit.get(i));
				
			}			
		}
		//End Merged ModellingUnit		
				
		// Convert Resulting Modellingunit For TypeSetter
		ModelingUnit_serialized = this.saveMu(mergedMU);
		// Save intermediate file
		writer = new FileWriter(new File("AfterMerging_HelloWorldMiniframework.km"));
		writer.write(ModelingUnit_serialized.toString());
		writer.close();
		
		utils.UTilScala.scalaAspectPrefix_$eq("org.kermeta.language.language.resolver");
		org.kermeta.language.language.resolverrunner.MainRunner.init4eclipse();
		mergedMU = this.LoadMu(ModelingUnit_serialized);
		// End of Convert Resulting Modellingunit For TypeSetter
		
		//Resolving
		org.kermeta.language.resolver.FullStaticResolver resolver = org.kermeta.language.resolver.RichFactory
		.createFullStaticResolver();
			
		resolvedMU = resolver.doResolving(mergedMU);
		resolver.checkUnresolved(resolvedMU);
		CheckDangling.doCheck(resolvedMU);
		//End of Resolving
		ModelingUnit_serialized = this.saveMu(resolvedMU);
		// Save intermediate file
		writer = new FileWriter(new File("AfterResolving_HelloWorldMiniframework.km"));
		writer.write(ModelingUnit_serialized.toString());
		writer.close();
		
		//StaticSetting
		staticsettedMU = resolver.doStaticSetting(resolvedMU);
		//End of Resolving
		ModelingUnit_serialized = this.saveMu(staticsettedMU);
		// Save intermediate file
		writer = new FileWriter(new File("AfterStaticSetting_HelloWorldMiniframework.km"));
		writer.write(ModelingUnit_serialized.toString());
		writer.close();
		

		// Convert Resulting Modellingunit For TypeChecker
		ModelingUnit_serialized = this.saveMu(mergedMU);
	}

	
	protected ModelingUnit loadKM(String uri) throws IOException {
		StructurePackage.eINSTANCE.setEFactoryInstance(StructureFactoryImpl.init());
		BehaviorPackage.eINSTANCE.setEFactoryInstance(BehaviorFactoryImpl.init());

		Map<String, String> options = null;
		// Call init;

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);

		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		URI ruri =  URI.createURI(uri);
		Resource resource = resourceSet.createResource(ruri);
		resource.load(options);
		// let's suppose the ModelingUnit is the first element in the root
		return (ModelingUnit) resource.getContents().get(0);
	}

	protected ModelingUnit loadEcore(String uri) {
        
		org.kermeta.language.ecore2km.Ecore2km converter = org.kermeta.language.ecore2km.RichFactory.createEcore2km();
        kermeta.persistence.EMFRepository rep = kermeta.persistence.RichFactory.createEMFRepository();
        kermeta.persistence.Resource r = rep.getResource("file:"+ uri);
        r.load();        
        return   converter.convert((EPackage) r.get(0), "");
	}

	protected ModelingUnit loadKMT(String fileuri) {
		//StructurePackage.eINSTANCE.setEFactoryInstance(StructureFactoryImpl.init());
		//BehaviorPackage.eINSTANCE.setEFactoryInstance(BehaviorFactoryImpl.init());

		KParser parser = new KParser();
		// Source.
		Iterator<String> src = Source.fromFile(new java.io.File(fileuri),
				"UTF8").getLines();

		StringBuffer buf = new StringBuffer();
		while (src.hasNext()) {
			buf.append(src.next() + "\n");
		}

		Option<ModelingUnit> mutest = parser.parse(buf.toString());

		if (!mutest.isEmpty()) {
			ModelingUnit mu = mutest.get();
			return mu;
		}
		return null;

	}



	// When converted compiled KMT programs
	protected ByteArrayOutputStream saveMu(ModelingUnit mu) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		uri = URI
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

	// When converted compiled KMT programs
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
