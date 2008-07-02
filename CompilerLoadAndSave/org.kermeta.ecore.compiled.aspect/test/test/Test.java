package test;

import java.io.IOException;

import kermeta.language.structure.Object;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		//Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		//EPackage.Registry.INSTANCE.put( EcorePackage.eNS_URI, EcorePackage.eINSTANCE );
		
		System.out.println("Loading model conformant to plugin implementation from kermeta_java.ecore.");
		ResourceSet rs1 = createResourceSet();
		Resource resource1 = rs1.getResource( URI.createURI("/home/paco/kpm-workbench/org.kermeta.test/model/kermeta_java.ecore"), true );

		System.out.println("Checking aspect weaving on kermeta_java.ecore");
		EObject o = (EObject) resource1.getContents().get(0);
		TreeIterator<EObject> iterator = o.eAllContents();
		int cptObject = 0;
		int cptInstance = 0;
		while ( iterator.hasNext() ) {
			cptInstance++;
			EObject current = iterator.next();
			if ( current instanceof kermeta.language.structure.Object ) {
				((Object) current).getOwnedTags();
				cptObject++;
			} 
		}
		System.out.println("Nb instances : " + cptInstance + ", Nb instances inheriting from kermeta.Object : " + cptObject);
		
		System.out.println("---------------------");
		
		System.out.println("Saving model conformant to plugin implementation in kermeta_java2.ecore.");
		ResourceSet rs2 = createResourceSet();
		EObject emfObject = (EObject) resource1.getContents().get(0);
		Resource resource2 = rs2.createResource( URI.createURI("/home/paco/kpm-workbench/org.kermeta.test/model/kermeta_java2.ecore") );
		resource2.getContents().add( emfObject );
		resource2.save(null);
		
		System.out.println("Loading model conformant to plugin implementation from kermeta_java2.ecore.");
		ResourceSet rs3 = createResourceSet();
		Resource resource3 = rs3.getResource( URI.createURI("/home/paco/kpm-workbench/org.kermeta.test/model/kermeta_java2.ecore"), true );

		System.out.println("---------------------");
		
		System.out.println("Checking aspect weaving on kermeta_java2.ecore");
		o = (EObject) resource3.getContents().get(0);
		iterator = o.eAllContents();
		cptObject = 0;
		cptInstance = 0;
		while ( iterator.hasNext() ) {
			cptInstance++;
			EObject current = iterator.next();
			if ( current instanceof kermeta.language.structure.Object ) {
				((Object) current).getOwnedTags();
				cptObject++;
			} 
		}
		System.out.println("Nb instances : " + cptInstance + ", Nb instances inheriting from kermeta.Object : " + cptObject);


		
	}

	static private ResourceSet createResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put( EcorePackage.eNS_URI, EcorePackage.eINSTANCE );
		// Register the appropriate resource factory to handle all file extensions.
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		return rs;
	}
	
}
