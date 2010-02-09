package art;

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
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import art.instance.ComponentInstance;

public class Test {

	
	private static System s;


	public static void main(String[] args) {
		
		Test t = new Test();
		s = t.loadArtModel("model1.art");
		t.process();
		
	}
	
	void process(){
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add( ResourceFactory.newClassPathResource( "JoinPoint6.drl", getClass() ),
		              ResourceType.DRL );
		if ( kbuilder.hasErrors() ) {
			java.lang.System.err.println( kbuilder.getErrors().toString() );
		}
		kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
		StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
		
		java.util.List<HashMap<String,EObject>> globalList = new java.util.ArrayList<HashMap<String,EObject>>( );
		ksession.setGlobal("list", globalList);
		
		
		
		
		
		long start = java.lang.System.currentTimeMillis();

		/*List<EObject> allcontents = new ArrayList<EObject>();
		Iterator<EObject> objs = s.eResource().getAllContents();
		java.lang.System.err.println(s.eResource().getAllContents().getClass());
		while(objs.hasNext()){
			allcontents.add(objs.next());
			
		}*/
		
		ksession.execute(new TreeIterable<EObject>(s.eResource().getAllContents()));
		long end = java.lang.System.currentTimeMillis();
		java.lang.System.err.println("Execution time was "+(end-start)+" ms.");
		java.lang.System.err.println("Nombre de résultat trouvé "  + globalList.size());
		for (HashMap<String,EObject> map : globalList){
			java.lang.System.out.println("i1 = " +((ComponentInstance)map.get("i1")).getName());
			java.lang.System.out.println("i2 = " + ((ComponentInstance)map.get("i2")).getName());
		}
		
		
		
		
		
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
		org.eclipse.emf.ecore.resource.Resource resource = rs.getResource(uri1,true);
		
		System s = (System) resource.getContents().get(0);
		return s;


	}
}
