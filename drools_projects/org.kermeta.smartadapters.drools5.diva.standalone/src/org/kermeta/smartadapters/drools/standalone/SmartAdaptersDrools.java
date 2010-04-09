package org.kermeta.smartadapters.drools.standalone;

import java.io.IOException;
import java.util.HashMap;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatelessKnowledgeSession;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.smartadapters.drools.utils.TreeIterable;

public class SmartAdaptersDrools {

	/**
	 * 
	 * @param args
	 * arg[0] = URI to the base model
	 * arg[1] = URI to the woven model
	 * arg[i>1] = URI to an aspect (drl file)
	 */
	public static void main(String[] args){
		if(args.length > 2){
			String artURI = args[0];
			String wovenArtURI = args[1];

			SmartAdaptersDrools sad = new SmartAdaptersDrools();

			System.out.println("Loading base model...");
			sad.loadArtModel(artURI);
			System.out.println("Done!");
			System.out.println();

			for(int i = 2; i<args.length ;i++){
				System.out.println("Processing aspect "+(i-1));
				sad.process(args[i]);
				System.out.println("Done!");
			}		

			System.out.println();
			System.out.println("Saving woven model...");
			sad.saveArtModel(wovenArtURI, sad.resource);
			System.out.println("Done!");
		}
	}

	private org.eclipse.emf.ecore.resource.Resource resource;
	private KnowledgeBase kbase;

	public SmartAdaptersDrools(){
		kbase = KnowledgeBaseFactory.newKnowledgeBase();
	}

	void process(String drl){	
		//KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();

		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

		kbuilder.add(ResourceFactory.newFileResource(drl), ResourceType.DRL);

		if ( kbuilder.hasErrors() ) {
			java.lang.System.err.println( kbuilder.getErrors().toString() );
		}
		kbase.getKnowledgePackages().clear();
		kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );

		StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();

		java.util.List<HashMap<String,EObject>> globalList = new java.util.ArrayList<HashMap<String,EObject>>( );
		ksession.setGlobal("list", globalList);
		java.util.Map<String,EObject> uniqueobjects = new java.util.HashMap<String,EObject>();
		ksession.setGlobal("uniqueobjects", uniqueobjects);

		ksession.execute(new TreeIterable<EObject>(resource.getAllContents()));

		java.lang.System.err.println("Number of Join Points: "  + globalList.size());	
	}

	art.System loadArtModel(String uri){
		ResourceSetImpl rs = new ResourceSetImpl(); 
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry f = rs.getResourceFactoryRegistry();

		java.util.Map<String,Object> m = f.getExtensionToFactoryMap();
		m.put("ecore",new EcoreResourceFactoryImpl());
		m.put("*",new XMIResourceFactoryImpl());


		rs.getPackageRegistry().put(art.ArtPackage.eNS_URI, art.ArtPackage.eINSTANCE);

		URI uri1  = URI.createURI(uri);//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));
		resource = rs.getResource(uri1,true);

		art.System s = (art.System) resource.getContents().get(0);
		return s;
	}

	void saveArtModel(String uri, Resource r){
		ResourceSetImpl rs = new ResourceSetImpl(); 
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry f = rs.getResourceFactoryRegistry();

		java.util.Map<String,Object> m = f.getExtensionToFactoryMap();
		m.put("ecore",new EcoreResourceFactoryImpl());
		m.put("*",new XMIResourceFactoryImpl());


		rs.getPackageRegistry().put(art.ArtPackage.eNS_URI, art.ArtPackage.eINSTANCE);

		URI uri1  = URI.createURI(uri);
		r.setURI(uri1);

		try {
			r.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
