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

	
	private static System s;
	private org.eclipse.emf.ecore.resource.Resource resource;
	private KnowledgeBase kbase;


	public static void main(String[] args) {
		
		Test t = new Test();
		s = t.loadArtModel("/home/barais/workspaces/divaDrools/DroolsGenerator/base/thales.base.art");
		long start = java.lang.System.currentTimeMillis();
		t.init();
		t.process("1.drl");
		t.process("2.drl");
		t.process("3.drl");
		t.process("4.drl");
		t.process("5.drl");
		t.process("6.drl");
		long end = java.lang.System.currentTimeMillis();
		java.lang.System.err.println("Execution time was "+(end-start)+" ms.");
		
		t.saveArtModel("/home/barais/workspaces/divaDrools/DroolsGenerator/base/thales.base1.art",t.resource);
		
	}
	
	void init(){
		
		kbase = KnowledgeBaseFactory.newKnowledgeBase();
	}
	
	void process(String drl){
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
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
		
		
		
		
		

		/*List<EObject> allcontents = new ArrayList<EObject>();
		Iterator<EObject> objs = s.eResource().getAllContents();
		java.lang.System.err.println(s.eResource().getAllContents().getClass());
		while(objs.hasNext()){
			allcontents.add(objs.next());
			
		}*/
		
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
