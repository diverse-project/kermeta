package main;

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
import org.kermeta.language.behavior.impl.BehaviorFactoryImpl;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.scala.parser.KParser;

import scala.Option;
import scala.collection.Iterator;
import scala.io.Source;
import binaryMergerrunner.MainRunner;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.structure.impl.StructureFactoryImpl;

public class Main {

	public static void main(String[] args) throws IOException {

		Main m = new Main();
		// Parse framework and test File
		List<String> uris = new ArrayList<String>();
		uris
				.add("/home/barais/workspaces/movida2/org.kermeta.language.loader.kmt.scala/test.kmt");
		uris
				.add("/home/barais/workspaces/movida2/org.kermeta.language.library.core/src/main/kmt/kermeta/emfpersistence/emfpersitence.kmt");
		uris
				.add("/home/barais/workspaces/movida2/org.kermeta.language.library.core/src/main/kmt/kermeta/io/io.kmt");
		uris
				.add("/home/barais/workspaces/movida2/org.kermeta.language.library.core/src/main/kmt/kermeta/standard/baseType.kmt");
		uris
				.add("/home/barais/workspaces/movida2/org.kermeta.language.library.core/src/main/kmt/kermeta/standard/collections.kmt");
		uris
				.add("/home/barais/workspaces/movida2/org.kermeta.language.library.core/src/main/kmt/kermeta/utils/hashtable.kmt");

		uris
		.add("/home/barais/workspaces/movida2/Kermeta2ToolChainStandalone/model/My.ecore");
		m.k2Compile(uris, null, null);
		
		
	}

	
	private URI uri;
	List<ModelingUnit> modelingunit;
	List<ByteArrayOutputStream> modelingunit_ser;
	ModelingUnit mergedMU;
	ByteArrayOutputStream mergedMU_ser;

	
	
	public Main() {
		modelingunit = new ArrayList<ModelingUnit>();
		modelingunit_ser = new ArrayList<ByteArrayOutputStream>();
		((org.eclipse.emf.ecore.EcoreFactoryWrapper) org.eclipse.emf.ecore.EcoreFactory.eINSTANCE)
				.setWrap(binaryMerger.org.eclipse.emf.ecore.RichFactory$.MODULE$);
		ecore2kmrunner.MainRunner.init();
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
				System.out.println("load ecore");
				ecore2kmrunner.MainRunner.init4eclipse();
				System.out.println(StructurePackage.eINSTANCE.getEFactoryInstance());
				ModelingUnit mu = this.loadEcore(uri);
				if (mu != null) {
					
					this.modelingunit.add(mu);
				}
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
		mergedMU_ser = this.saveMu(mergedMU);
		typeSetterrunner.MainRunner.init4eclipse();
		mergedMU = this.LoadMu(mergedMU_ser);
		// End of Convert Resulting Modellingunit For TypeSetter
		
		//Resolving
		org.kermeta.language.resolver.Resolver resolver = org.kermeta.language.resolver.RichFactory
		.createResolver();
		resolver.resolveFromModelingUnit(mergedMU);
		//End of Resolving
		

		// Convert Resulting Modellingunit For TypeChecker
		mergedMU_ser = this.saveMu(mergedMU);
		/*typeCheckerrunner.MainRunner.init4eclipse();
		mergedMU = this.LoadMu(mergedMU_ser);*/
		// End of Convert Resulting Modellingunit For TypeSetter
		

		
		// Convert Resulting Modellingunit For Compiler
		/*mergedMU_ser = this.saveMu(mergedMU);
		compilerrunner.MainRunner.init4eclipse();
		mergedMU = this.LoadMu(mergedMU_ser);*/
		// End of Convert Resulting Modellingunit For TypeSetter


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
