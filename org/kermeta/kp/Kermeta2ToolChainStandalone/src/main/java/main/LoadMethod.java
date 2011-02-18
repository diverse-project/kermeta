package main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
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
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;
import fr.irisa.triskell.kermeta.language.structure.impl.StructureFactoryImpl;

public class LoadMethod {
	
	private URI uri;
	
	public LoadMethod() {
		// Initialize
		uri = URI.createURI("");
	}
	
	
	public URI getURI() {
		return this.uri;
	}
	
	public void setURI( URI uri) {
		this.uri = uri;
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
	URI	uri = URI
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
		// Store uri
		setURI(uri);

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
		Resource resource = resourceSet.createResource(getURI());
		resource.load(new ByteArrayInputStream(mu.toByteArray()), options);
		// let's suppose the ModelingUnit is the first element in the root
		return (ModelingUnit) resource.getContents().get(0);

	}

}
