

/*$Id: LoadSaveLoadFSM.java,v 1.1 2008-07-02 09:13:35 ftanguy Exp $
* Project : org.kermeta.framework.compiled.runtime
* File : 	Test.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 24 juin 08
* Authors : paco
*/

package org.kermeta.framework.compiled.test;

import java.io.IOException;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.compil.runtime.helper.basetypes.Loader;
import org.kermeta.compil.runtime.helper.basetypes.Saver;

import fr.irisa.triskell.kermeta.samples.fsm.FsmPackage;

public class LoadSaveLoadFSM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// First load
		System.out.println("Load model conformant to plugin implementation.");
		ResourceSet resourceset1 = createResourceSet();
		org.eclipse.emf.ecore.resource.Resource resource = resourceset1.getResource( URI.createURI("/home/paco/kpm-workbench/org.kermeta.fsm.compiled/models/sample1.fsm"), true );
		EObject kermetaObject = Loader.load( resource.getContents().get(0), FsmPackage.eNS_URI );
		
		// First Save
		ResourceSet resourceset2 = createResourceSet();
		org.eclipse.emf.ecore.resource.Resource resourceToSave1 = resourceset2.createResource( URI.createURI("/home/paco/kpm-workbench/org.kermeta.fsm.compiled/models/sample1ConformantToKermeta.fsm") );
		resourceToSave1.getContents().add( kermetaObject );

		// Second save
		ResourceSet resourceset3 = createResourceSet();
		EObject emfObject = Saver.save(kermetaObject, FsmPackage.eNS_URI);
		org.eclipse.emf.ecore.resource.Resource resourceToSave2 = resourceset3.createResource( URI.createURI("/home/paco/kpm-workbench/org.kermeta.fsm.compiled/models/sample1ConformantToPlugin.fsm") );
		resourceToSave2.getContents().add( emfObject );
		
		try {
			System.out.println("Saving model conformant to kermeta implementation.");
			resourceToSave1.save(null);
			System.out.println("Saving model conformant to plugin implementation.");
			resourceToSave2.save(null);
			
			System.out.println("---------------------------------");
			
			// Load temp model
			System.out.println("Load model conformant to kermeta implementation.");
			ResourceSet resourceset4 = createResourceSet();
			org.eclipse.emf.ecore.resource.Resource finalResource = resourceset4.getResource( URI.createURI("/home/paco/kpm-workbench/org.kermeta.fsm.compiled/models/sample1ConformantToKermeta.fsm"), true );
			TreeIterator<EObject> iterator = ((EObject) finalResource.getContents().get(0)).eAllContents();
			while ( iterator.hasNext() ) {
				if ( iterator.next() instanceof kermeta.language.structure.Object )
					System.out.println("yes");
				else
					System.out.println("no");
			}
			
			System.out.println("---------------------------------");
			
			// Load back model
			System.out.println("Load model conformant to plugin implementation.");
			ResourceSet resourceset5 = createResourceSet();
			finalResource = resourceset5.getResource( URI.createURI("/home/paco/kpm-workbench/org.kermeta.fsm.compiled/models/sample1ConformantToPlugin.fsm"), true );
			iterator = ((EObject) finalResource.getContents().get(0)).eAllContents();
			while ( iterator.hasNext() ) {
				if ( iterator.next() instanceof kermeta.language.structure.Object )
					System.out.println("yes");
				else
					System.out.println("no");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();

	}

	static private ResourceSet createResourceSet() {
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put( FsmPackage.eNS_URI, FsmPackage.eINSTANCE );
		// Register the appropriate resource factory to handle all file extensions.
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("fsm", new XMIResourceFactoryImpl());
		return rs;
	}
	
}


