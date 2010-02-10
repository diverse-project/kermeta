package art;

import java.io.IOException;
import java.util.HashMap;

import main.TreeIterable;

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

import art.instance.ComponentInstance;

public class Test {

	
	private org.eclipse.emf.ecore.resource.Resource resource;
	private KnowledgeBase kbase;
	private long start;
	private long end;


	public static void main(String[] args) {
		
		Test t = new Test();
		t.run();
	}
	
	public void run(){
		this.loadArtModel("/home/barais/workspaces/divaDrools/DroolsGenerator/base/thales.base.art");
		this.init();
		start = java.lang.System.currentTimeMillis();
		this.process("1.drl");
		this.process("2.drl");
		this.process("3.drl");
		this.process("4.drl");
		this.process("5.drl");
		this.process("6.drl");
		end = java.lang.System.currentTimeMillis();
		java.lang.System.err.println("Execution time was "+(end-start)+" ms.");
		
		this.saveArtModel("/home/barais/workspaces/divaDrools/DroolsGenerator/base/thales.base1.art",this.resource);

	}
	
	void init(){
		
		kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		
		kbuilder.add( ResourceFactory.newClassPathResource( "init.drl", getClass() ),
		              ResourceType.DRL );
		
		if ( kbuilder.hasErrors() ) {
			java.lang.System.err.println( kbuilder.getErrors().toString() );
		}
		kbase.getKnowledgePackages().clear();
		kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
		StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
		ksession.execute("");
		
		
	}
	
	void process(String drl){
		//KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		
		kbuilder.add( ResourceFactory.newClassPathResource( drl, getClass() ),
		              ResourceType.DRL );
		
		if ( kbuilder.hasErrors() ) {
			java.lang.System.err.println( kbuilder.getErrors().toString() );
		}
		kbase.getKnowledgePackages().clear();
		kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
		
		
		
		StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
		
		java.util.List<HashMap<String,EObject>> globalList = new java.util.ArrayList<HashMap<String,EObject>>( );
		ksession.setGlobal("list", globalList);
		java.util.Map uniqueobjects = new java.util.HashMap( );
		ksession.setGlobal("uniqueobjects", uniqueobjects);
		
		ksession.execute(new TreeIterable<EObject>(resource.getAllContents()));
		java.lang.System.err.println("Nombre de résultat trouvé "  + globalList.size());
		
		
		
		
		
	}

	
	System loadArtModel(String uri){
		ResourceSetImpl rs = new ResourceSetImpl(); 
		
		//EcorePackageImpl.init();
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry f = rs.getResourceFactoryRegistry();
		
		java.util.Map<String,Object> m = f.getExtensionToFactoryMap();
		//f.get
		
		m.put("ecore",new EcoreResourceFactoryImpl());
		m.put("*",new XMIResourceFactoryImpl());
		
		
		rs.getPackageRegistry().put(art.ArtPackage.eNS_URI, art.ArtPackage.eINSTANCE);
		
		URI uri1  = URI.createURI(uri);//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));
		resource = rs.getResource(uri1,true);
		
		System s = (System) resource.getContents().get(0);
		return s;


	}
	
	void saveArtModel(String uri, Resource r){
		ResourceSetImpl rs = new ResourceSetImpl(); 
		
		//EcorePackageImpl.init();
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry f = rs.getResourceFactoryRegistry();
		
		java.util.Map<String,Object> m = f.getExtensionToFactoryMap();
		//f.get
		
		m.put("ecore",new EcoreResourceFactoryImpl());
		m.put("*",new XMIResourceFactoryImpl());
		
		
		rs.getPackageRegistry().put(art.ArtPackage.eNS_URI, art.ArtPackage.eINSTANCE);
		
		URI uri1  = URI.createURI(uri);//.replace("platform:/resource/",EcorePackages.workspaceURI).replace("platform:/plugin/",EcorePackages.pluginURI ));
		
		r.setURI(uri1);
		
		try {
			r.save(new HashMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
