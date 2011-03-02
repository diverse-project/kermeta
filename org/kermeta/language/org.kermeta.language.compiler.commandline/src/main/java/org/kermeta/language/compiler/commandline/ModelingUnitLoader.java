/* $Id:$ 
 * Creation : 2 mars 2011
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.compiler.commandline;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.kermeta.language.language.merger.binarymergerrunner.MainRunner;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.language.structure.StructurePackage;
import org.kermeta.scala.parser.KParser;

import scala.Option;
import scala.collection.Iterator;
import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

/**
 * Provides convenient operations for loading ModelingUnits from various input format
 *
 */
public class ModelingUnitLoader {

	public ModelingUnit loadModelingUnitFromURL(String url){
		ModelingUnit mu = null;
		if (url.endsWith(".kmt")) {
			mu = this.loadKMT(url);
			
		}else if (url.endsWith(".ecore")) {
			
			//org.kermeta.language.language.ecore2kmrunner.MainRunner.init4eclipse();
			StructurePackage.eINSTANCE.getEFactoryInstance();
			mu = this.loadEcore(url);
			
		}else if (url.endsWith(".km")) {

			MainRunner.init4eclipse();
			try {
				this.loadKM(url);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return mu;
	}
	protected ModelingUnit loadKM(String uri) throws IOException {
		/*org.OrgPackage p1 = org.OrgPackage.eINSTANCE;
    	org.kermeta.KmPackage p2 = org.kermeta.KmPackage.eINSTANCE;
    	org.kermeta.language.LanguagePackage p3 = org.kermeta.language.LanguagePackage.eINSTANCE;
    	org.kermeta.language.behavior.BehaviorPackage p4 = org.kermeta.language.behavior.BehaviorPackage.eINSTANCE;
    	org.kermeta.language.structure.StructurePackage p5 = org.kermeta.language.structure.StructurePackage.eINSTANCE;
    	*/
		//StructurePackage.eINSTANCE.setEFactoryInstance(StructureFactoryImpl.init());
		//BehaviorPackage.eINSTANCE.setEFactoryInstance(BehaviorFactoryImpl.init());

		Map<String, String> options = null;
		// Call init;

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(StructurePackage.eNS_URI, StructurePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(BehaviorPackage.eNS_URI, BehaviorPackage.eINSTANCE);

		Resource.Factory.Registry f = resourceSet.getResourceFactoryRegistry();
		Map<String, Object> m = f.getExtensionToFactoryMap();
		m.put("*", new XMIResourceFactoryImpl());
		m.put("km", new XMIResourceFactoryImpl());
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
		//Source.
		Iterator<String> src = scala.io.Source.fromFile(new java.io.File(fileuri),
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
}
